package ti;
public final class b {
    public static final b f57663c = new b(Float.POSITIVE_INFINITY);
    public final float f57664a;
    public final float f57665b;

    public b(float f10) {
        if (!Float.isNaN(Float.POSITIVE_INFINITY)) {
            if (!Float.isNaN(f10) && f10 >= 0.0f) {
                this.f57664a = Float.POSITIVE_INFINITY;
                this.f57665b = f10;
                return;
            }
            throw new IllegalArgumentException("epsY must be >= 0");
        }
        throw new IllegalArgumentException("epsX must be >= 0");
    }
}
