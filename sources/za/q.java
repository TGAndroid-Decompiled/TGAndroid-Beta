package za;
public enum q implements ka.g {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);
    
    public final int f49086a;

    q(int i10) {
        this.f49086a = i10;
    }

    @Override
    public final int a() {
        return this.f49086a;
    }
}
