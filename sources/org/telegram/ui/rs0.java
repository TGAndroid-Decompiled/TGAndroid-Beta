package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class rs0 extends org.telegram.ui.Components.c10 {
    public final zr0 e;
    public final PhotoViewer f41271f;

    public rs0(PhotoViewer photoViewer, zr0 zr0Var) {
        super(false);
        this.f41271f = photoViewer;
        this.e = zr0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        PhotoViewer photoViewer = this.f41271f;
        int[] iArr = photoViewer.f33343m3;
        sb2.append(LocaleController.formatPluralString("Minutes", iArr[0], new Object[0]));
        sb2.append(' ');
        sb2.append(LocaleController.formatPluralString("Seconds", iArr[1], new Object[0]));
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        int[] iArr2 = photoViewer.f33353n3;
        sb4.append(LocaleController.formatPluralString("Minutes", iArr2[0], new Object[0]));
        sb4.append(' ');
        sb4.append(LocaleController.formatPluralString("Seconds", iArr2[1], new Object[0]));
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb3, sb4.toString());
    }

    @Override
    public final float k() {
        return this.f41271f.f33379q3.c();
    }

    @Override
    public final void l(float f7) {
        this.e.b(f7);
        PhotoViewer photoViewer = this.f41271f;
        photoViewer.f33379q3.h(f7, false);
        photoViewer.f33388r3.invalidate();
    }
}
