package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class rt0 extends org.telegram.ui.Components.g10 {
    public final zs0 e;
    public final PhotoViewer f39584f;

    public rt0(PhotoViewer photoViewer, zs0 zs0Var) {
        super(false);
        this.f39584f = photoViewer;
        this.e = zs0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        PhotoViewer photoViewer = this.f39584f;
        int[] iArr = photoViewer.f31999m3;
        sb2.append(LocaleController.formatPluralString("Minutes", iArr[0], new Object[0]));
        sb2.append(' ');
        sb2.append(LocaleController.formatPluralString("Seconds", iArr[1], new Object[0]));
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        int[] iArr2 = photoViewer.f32009n3;
        sb4.append(LocaleController.formatPluralString("Minutes", iArr2[0], new Object[0]));
        sb4.append(' ');
        sb4.append(LocaleController.formatPluralString("Seconds", iArr2[1], new Object[0]));
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb3, sb4.toString());
    }

    @Override
    public final float k() {
        return this.f39584f.f32035q3.c();
    }

    @Override
    public final void l(float f7) {
        this.e.b(f7);
        PhotoViewer photoViewer = this.f39584f;
        photoViewer.f32035q3.h(f7, false);
        photoViewer.f32044r3.invalidate();
    }
}
