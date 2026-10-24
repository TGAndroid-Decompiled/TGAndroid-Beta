package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ts0 extends org.telegram.ui.Components.a10 {
    public final bs0 e;
    public final PhotoViewer f42111f;

    public ts0(PhotoViewer photoViewer, bs0 bs0Var) {
        super(false);
        this.f42111f = photoViewer;
        this.e = bs0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        PhotoViewer photoViewer = this.f42111f;
        int[] iArr = photoViewer.f33653m3;
        sb2.append(LocaleController.formatPluralString("Minutes", iArr[0], new Object[0]));
        sb2.append(' ');
        sb2.append(LocaleController.formatPluralString("Seconds", iArr[1], new Object[0]));
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        int[] iArr2 = photoViewer.f33663n3;
        sb4.append(LocaleController.formatPluralString("Minutes", iArr2[0], new Object[0]));
        sb4.append(' ');
        sb4.append(LocaleController.formatPluralString("Seconds", iArr2[1], new Object[0]));
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb3, sb4.toString());
    }

    @Override
    public final float k() {
        return this.f42111f.f33689q3.c();
    }

    @Override
    public final void l(float f7) {
        this.e.a(f7);
        PhotoViewer photoViewer = this.f42111f;
        photoViewer.f33689q3.h(f7, false);
        photoViewer.f33698r3.invalidate();
    }
}
