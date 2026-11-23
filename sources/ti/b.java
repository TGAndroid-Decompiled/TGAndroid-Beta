package ti;
public final class b {
    public static final b f58276c = new b(Float.POSITIVE_INFINITY);
    public final float f58277a;
    public final float f58278b;

    public b(float f10) {
        if (!Float.isNaN(Float.POSITIVE_INFINITY)) {
            if (!Float.isNaN(f10) && f10 >= 0.0f) {
                this.f58277a = Float.POSITIVE_INFINITY;
                this.f58278b = f10;
                return;
            }
            throw new IllegalArgumentException("epsY must be >= 0");
        }
        throw new IllegalArgumentException("epsX must be >= 0");
    }
}
