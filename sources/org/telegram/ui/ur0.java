package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class ur0 implements Runnable {
    public final int f38203a;
    public final PhotoViewer f38204b;
    public final Bitmap f38205c;

    public ur0(PhotoViewer photoViewer, Bitmap bitmap, int i10) {
        this.f38203a = i10;
        this.f38204b = photoViewer;
        this.f38205c = bitmap;
    }

    @Override
    public final void run() {
        int i10 = this.f38203a;
        Bitmap bitmap = this.f38205c;
        PhotoViewer photoViewer = this.f38204b;
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
                photoViewer.f31357t5.setUndoCutState(true);
                photoViewer.Z2(true, true);
                return;
            case 5:
                photoViewer.C4.setImageBitmap(bitmap);
                photoViewer.f31357t5.setUndoCutState(true);
                photoViewer.Z2(true, true);
                return;
            default:
                photoViewer.C4.setImageBitmap(bitmap);
                photoViewer.f31357t5.setUndoCutState(true);
                photoViewer.Z2(true, true);
                return;
        }
    }
}
