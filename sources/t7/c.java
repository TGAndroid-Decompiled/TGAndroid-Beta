package t7;
public final class c extends h {
    public final int f47715c;
    public final float d;

    public c(float f10, int i9) {
        super(0, Float.valueOf(Math.max(f10, 0.0f)));
        this.f47715c = i9;
        switch (i9) {
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
        switch (this.f47715c) {
            case 0:
                return "[Dash: length=" + this.d + "]";
            default:
                return "[Gap: length=" + this.d + "]";
        }
    }
}
