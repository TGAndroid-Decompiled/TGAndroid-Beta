package rh;

import org.telegram.ui.Components.rz0;
public final class f4 {
    public final float f46911a;
    public final rz0 f46912b;
    public final rz0 f46913c;

    public f4(float f7, String str, CharSequence charSequence) {
        this.f46912b = new rz0(str, 12.0f, null);
        this.f46913c = new rz0(charSequence, 12.0f, org.telegram.messenger.i0.o());
        this.f46911a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.f46912b.i(), this.f46913c.i());
    }
}
