package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class ur0 implements Runnable {
    public final int f42543a;
    public final PhotoViewer f42544b;
    public final Bitmap f42545c;

    public ur0(PhotoViewer photoViewer, Bitmap bitmap, int i10) {
        this.f42543a = i10;
        this.f42544b = photoViewer;
        this.f42545c = bitmap;
    }

    @Override
    public final void run() {
        int i10 = this.f42543a;
        Bitmap bitmap = this.f42545c;
        PhotoViewer photoViewer = this.f42544b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.n0(bitmap);
                AndroidUtilities.runOnUIThread(new ur0(photoViewer, bitmap, 6));
                return;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer.n0(bitmap);
                AndroidUtilities.runOnUIThread(new ur0(photoViewer, bitmap, 5));
                return;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer.n0(bitmap);
                AndroidUtilities.runOnUIThread(new ur0(photoViewer, bitmap, 4));
                return;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.U8;
                photoViewer.n0(bitmap);
                return;
            case 4:
                photoViewer.C4.setImageBitmap(bitmap);
                photoViewer.f34040t5.setUndoCutState(true);
                photoViewer.a3(true, true);
                return;
            case 5:
                photoViewer.C4.setImageBitmap(bitmap);
                photoViewer.f34040t5.setUndoCutState(true);
                photoViewer.a3(true, true);
                return;
            default:
                photoViewer.C4.setImageBitmap(bitmap);
                photoViewer.f34040t5.setUndoCutState(true);
                photoViewer.a3(true, true);
                return;
        }
    }
}
