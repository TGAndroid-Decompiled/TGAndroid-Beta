package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class xs0 extends org.telegram.ui.Components.v00 {
    public final es0 f43444e;
    public final PhotoViewer f43445f;

    public xs0(PhotoViewer photoViewer, es0 es0Var) {
        super(false);
        this.f43445f = photoViewer;
        this.f43444e = es0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb = new StringBuilder();
        PhotoViewer photoViewer = this.f43445f;
        int[] iArr = photoViewer.f34306j3;
        sb.append(LocaleController.formatPluralString("Minutes", iArr[0], new Object[0]));
        sb.append(' ');
        sb.append(LocaleController.formatPluralString("Seconds", iArr[1], new Object[0]));
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        int[] iArr2 = photoViewer.f34315k3;
        sb3.append(LocaleController.formatPluralString("Minutes", iArr2[0], new Object[0]));
        sb3.append(' ');
        sb3.append(LocaleController.formatPluralString("Seconds", iArr2[1], new Object[0]));
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb2, sb3.toString());
    }

    @Override
    public final float k() {
        return this.f43445f.f34341n3.c();
    }

    @Override
    public final void l(float f10) {
        this.f43444e.b(f10);
        PhotoViewer photoViewer = this.f43445f;
        photoViewer.f34341n3.h(f10, false);
        photoViewer.f34350o3.invalidate();
    }
}
