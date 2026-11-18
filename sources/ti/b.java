package ti;
public final class b {
    public static final b f58230c = new b(Float.POSITIVE_INFINITY);
    public final float f58231a;
    public final float f58232b;

    public b(float f10) {
        if (!Float.isNaN(Float.POSITIVE_INFINITY)) {
            if (!Float.isNaN(f10) && f10 >= 0.0f) {
                this.f58231a = Float.POSITIVE_INFINITY;
                this.f58232b = f10;
                return;
            }
            throw new IllegalArgumentException("epsY must be >= 0");
        }
        throw new IllegalArgumentException("epsX must be >= 0");
    }
}
