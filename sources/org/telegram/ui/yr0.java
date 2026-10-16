package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class yr0 implements Runnable {
    public final int f41949a;
    public final PhotoViewer f41950b;
    public final Bitmap f41951c;

    public yr0(PhotoViewer photoViewer, Bitmap bitmap, int i10) {
        this.f41949a = i10;
        this.f41950b = photoViewer;
        this.f41951c = bitmap;
    }

    @Override
    public final void run() {
        int i10 = this.f41949a;
        Bitmap bitmap = this.f41951c;
        PhotoViewer photoViewer = this.f41950b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.n0(bitmap);
                AndroidUtilities.runOnUIThread(new yr0(photoViewer, bitmap, 6));
                return;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer.n0(bitmap);
                AndroidUtilities.runOnUIThread(new yr0(photoViewer, bitmap, 5));
                return;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer.n0(bitmap);
                AndroidUtilities.runOnUIThread(new yr0(photoViewer, bitmap, 4));
                return;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.U8;
                photoViewer.n0(bitmap);
                return;
            case 4:
                photoViewer.C4.setImageBitmap(bitmap);
                photoViewer.f32065t5.setUndoCutState(true);
                photoViewer.a3(true, true);
                return;
            case 5:
                photoViewer.C4.setImageBitmap(bitmap);
                photoViewer.f32065t5.setUndoCutState(true);
                photoViewer.a3(true, true);
                return;
            default:
                photoViewer.C4.setImageBitmap(bitmap);
                photoViewer.f32065t5.setUndoCutState(true);
                photoViewer.a3(true, true);
                return;
        }
    }
}
