package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ss0 extends org.telegram.ui.Components.v00 {
    public final zr0 f41361e;
    public final PhotoViewer f41362f;

    public ss0(PhotoViewer photoViewer, zr0 zr0Var) {
        super(false);
        this.f41362f = photoViewer;
        this.f41361e = zr0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb = new StringBuilder();
        PhotoViewer photoViewer = this.f41362f;
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
        return this.f41362f.f34341n3.c();
    }

    @Override
    public final void l(float f10) {
        this.f41361e.b(f10);
        PhotoViewer photoViewer = this.f41362f;
        photoViewer.f34341n3.h(f10, false);
        photoViewer.f34350o3.invalidate();
    }
}
