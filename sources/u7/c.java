package u7;

public final class c extends h {

    public final int f48437c;
    public final float d;

    public c(float f10, int i10) {
        super(0, Float.valueOf(Math.max(f10, 0.0f)));
        this.f48437c = i10;
        switch (i10) {
            case 1:
                super(2, Float.valueOf(Math.max(f10, 0.0f)));
                this.d = Math.max(f10, 0.0f);
                break;
            default:
                this.d = Math.max(f10, 0.0f);
                break;
        }
    }

    @Override
    public final String toString() {
        switch (this.f48437c) {
            case 0:
                return "[Dash: length=" + this.d + "]";
            default:
                return "[Gap: length=" + this.d + "]";
        }
    }
}
