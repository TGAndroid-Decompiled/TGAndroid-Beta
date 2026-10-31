package rh;

import org.telegram.ui.Components.qz0;
public final class f4 {
    public final float f46897a;
    public final qz0 f46898b;
    public final qz0 f46899c;

    public f4(float f7, String str, CharSequence charSequence) {
        this.f46898b = new qz0(str, 12.0f, null);
        this.f46899c = new qz0(charSequence, 12.0f, org.telegram.messenger.i0.o());
        this.f46897a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.f46898b.i(), this.f46899c.i());
    }
}
