package app.auth;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author ansel
 *
 * LeetCode 1797
 * 这一题，怎么讲，索然无味，所以弃了
 */
public class AuthenticationManager {

    private int timeToLive;
    private Map<String, Token> tokenMap = new LinkedHashMap<>();

    public int getTimeToLive() {
        return this.timeToLive;
    }

    public AuthenticationManager(int timeToLive) {
        this.timeToLive = timeToLive;
    }

    public void generate(String tokenId, int currentTime) {

    }

    public void renew(String tokenId, int currentTime) {

    }

    public int countUnexpiredTokens(int currentTime) {

    }
}

class Token {

    private String tokenId;
    private int generateTime;
    private int expiredTime;

    public int getGenerateTime() {
        return generateTime;
    }

    public void setGenerateTime(int generateTime) {
        this.generateTime = generateTime;
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    public int getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(int expiredTime) {
        this.expiredTime = expiredTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Token)) {
            return false;
        }

        Token token = (Token) o;

        return getTokenId().equals(token.getTokenId());
    }

    @Override
    public int hashCode() {
        int result = getTokenId().hashCode();
        result = 31 * result + getGenerateTime();
        result = 31 * result + getExpiredTime();
        return result;
    }
}
