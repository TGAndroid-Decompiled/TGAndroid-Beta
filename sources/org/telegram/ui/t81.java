package org.telegram.ui;
public final class t81 extends org.telegram.ui.Components.du0 {
    public boolean f52261g0;

    @Override
    public final void onMeasure(int i7, int i10) {
        Q();
        if (getKeyboardHeight() == 0 && !this.f52261g0) {
            int i11 = org.telegram.messenger.mp.f1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
            this.f34588f = i11;
            setPadding(0, 0, 0, i11);
        } else {
            this.f52261g0 = true;
            setPadding(0, 0, 0, 0);
        }
        super.onMeasure(i7, i10);
    }
}
