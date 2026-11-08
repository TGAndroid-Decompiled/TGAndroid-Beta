package qi;
public final class b {
    public static final b f54155c = new b(Float.POSITIVE_INFINITY);
    public final float f54156a;
    public final float f54157b;

    public b(float f10) {
        if (!Float.isNaN(Float.POSITIVE_INFINITY)) {
            if (!Float.isNaN(f10) && f10 >= 0.0f) {
                this.f54156a = Float.POSITIVE_INFINITY;
                this.f54157b = f10;
                return;
            }
            throw new IllegalArgumentException("epsY must be >= 0");
        }
        throw new IllegalArgumentException("epsX must be >= 0");
    }
}
