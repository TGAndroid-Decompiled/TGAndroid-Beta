package za;
public enum o implements ka.g {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);
    
    public final int f48845a;

    o(int i10) {
        this.f48845a = i10;
    }

    @Override
    public final int a() {
        return this.f48845a;
    }
}
