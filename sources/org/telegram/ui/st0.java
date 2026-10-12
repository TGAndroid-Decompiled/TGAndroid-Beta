package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class st0 extends org.telegram.ui.Components.g10 {
    public final at0 e;
    public final PhotoViewer f40211f;

    public st0(PhotoViewer photoViewer, at0 at0Var) {
        super(false);
        this.f40211f = photoViewer;
        this.e = at0Var;
    }

    @Override
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        PhotoViewer photoViewer = this.f40211f;
        int[] iArr = photoViewer.f32297m3;
        sb2.append(LocaleController.formatPluralString("Minutes", iArr[0], new Object[0]));
        sb2.append(' ');
        sb2.append(LocaleController.formatPluralString("Seconds", iArr[1], new Object[0]));
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        int[] iArr2 = photoViewer.f32307n3;
        sb4.append(LocaleController.formatPluralString("Minutes", iArr2[0], new Object[0]));
        sb4.append(' ');
        sb4.append(LocaleController.formatPluralString("Seconds", iArr2[1], new Object[0]));
        return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, sb3, sb4.toString());
    }

    @Override
    public final float k() {
        return this.f40211f.f32333q3.c();
    }

    @Override
    public final void l(float f7) {
        this.e.b(f7);
        PhotoViewer photoViewer = this.f40211f;
        photoViewer.f32333q3.h(f7, false);
        photoViewer.f32342r3.invalidate();
    }
}
