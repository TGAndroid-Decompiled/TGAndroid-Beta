package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.text.style.ClickableSpan;
import android.widget.TextView;
public final class vo0 implements org.telegram.messenger.k20 {
    public final int f42573a;
    public final PhotoViewer f42574b;

    public vo0(PhotoViewer photoViewer, int i10) {
        this.f42573a = i10;
        this.f42574b = photoViewer;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i10 = this.f42573a;
        PhotoViewer photoViewer = this.f42574b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.a2((ClickableSpan) obj, (TextView) obj2);
                return;
            default:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.E0(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.8f) + 0.2f);
                return;
        }
    }
}
