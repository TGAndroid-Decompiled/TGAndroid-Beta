package qi;
public final class b {
    public static final b f47066c = new b(Float.POSITIVE_INFINITY);
    public final float f47067a;
    public final float f47068b;

    public b(float f7) {
        if (!Float.isNaN(Float.POSITIVE_INFINITY)) {
            if (!Float.isNaN(f7) && f7 >= 0.0f) {
                this.f47067a = Float.POSITIVE_INFINITY;
                this.f47068b = f7;
                return;
            }
            throw new IllegalArgumentException("epsY must be >= 0");
        }
        throw new IllegalArgumentException("epsX must be >= 0");
    }
}
