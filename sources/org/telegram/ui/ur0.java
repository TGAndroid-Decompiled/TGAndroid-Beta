package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.text.style.ClickableSpan;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
public final class ur0 implements Utilities.Callback2 {
    public final int f40472a;
    public final PhotoViewer f40473b;

    public ur0(PhotoViewer photoViewer, int i10) {
        this.f40472a = i10;
        this.f40473b = photoViewer;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10 = this.f40472a;
        PhotoViewer photoViewer = this.f40473b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.X1((ClickableSpan) obj, (TextView) obj2);
                return;
            default:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.D0(((Boolean) obj2).booleanValue(), false, (((Float) obj).floatValue() * 2.8f) + 0.2f);
                return;
        }
    }
}
