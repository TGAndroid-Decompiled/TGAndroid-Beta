package qi;
public final class b {
    public static final b f54166c = new b(Float.POSITIVE_INFINITY);
    public final float f54167a;
    public final float f54168b;

    public b(float f10) {
        if (!Float.isNaN(Float.POSITIVE_INFINITY)) {
            if (!Float.isNaN(f10) && f10 >= 0.0f) {
                this.f54167a = Float.POSITIVE_INFINITY;
                this.f54168b = f10;
                return;
            }
            throw new IllegalArgumentException("epsY must be >= 0");
        }
        throw new IllegalArgumentException("epsX must be >= 0");
    }
}
