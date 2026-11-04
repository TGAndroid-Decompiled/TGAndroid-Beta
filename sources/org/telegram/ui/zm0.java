package org.telegram.ui;

import android.graphics.drawable.Drawable;
public final class zm0 implements org.telegram.ui.Components.a51 {
    public final int f52714a;
    public final org.telegram.messenger.ze f52715b;

    public zm0(org.telegram.messenger.ze zeVar, int i3) {
        this.f52714a = i3;
        this.f52715b = zeVar;
    }

    @Override
    public final void a(org.telegram.ui.Components.py pyVar) {
        int i3 = this.f52714a;
        org.telegram.messenger.ze zeVar = this.f52715b;
        switch (i3) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.V8;
                pyVar.e(new org.telegram.ui.Components.nh(zeVar, 1));
                return;
            default:
                Drawable[] drawableArr2 = PhotoViewer.V8;
                pyVar.e(new org.telegram.ui.Components.nh(zeVar, 1));
                return;
        }
    }
}
