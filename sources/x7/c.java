package x7;
public final class c extends h {
    public final int f46838c;
    public final float d;

    public c(float f10, int i10) {
        super(0, Float.valueOf(Math.max(f10, 0.0f)));
        this.f46838c = i10;
        switch (i10) {
            case 1:
                super(2, Float.valueOf(Math.max(f10, 0.0f)));
                this.d = Math.max(f10, 0.0f);
                return;
            default:
                this.d = Math.max(f10, 0.0f);
                return;
        }
    }

    @Override
    public final String toString() {
        switch (this.f46838c) {
            case 0:
                return "[Dash: length=" + this.d + "]";
            default:
                return "[Gap: length=" + this.d + "]";
        }
    }
}
