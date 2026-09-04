package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class tr0 implements Runnable {
    public final int f40819a;
    public final PhotoViewer f40820b;
    public final Bitmap f40821c;

    public tr0(PhotoViewer photoViewer, Bitmap bitmap, int i10) {
        this.f40819a = i10;
        this.f40820b = photoViewer;
        this.f40821c = bitmap;
    }

    @Override
    public final void run() {
        int i10 = this.f40819a;
        Bitmap bitmap = this.f40821c;
        PhotoViewer photoViewer = this.f40820b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.T8;
                photoViewer.n0(bitmap);
                AndroidUtilities.runOnUIThread(new tr0(photoViewer, bitmap, 6));
                return;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.T8;
                photoViewer.n0(bitmap);
                AndroidUtilities.runOnUIThread(new tr0(photoViewer, bitmap, 5));
                return;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.T8;
                photoViewer.n0(bitmap);
                AndroidUtilities.runOnUIThread(new tr0(photoViewer, bitmap, 4));
                return;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.T8;
                photoViewer.n0(bitmap);
                return;
            case 4:
                photoViewer.C4.setImageBitmap(bitmap);
                photoViewer.f33685t5.setUndoCutState(true);
                photoViewer.a3(true, true);
                return;
            case 5:
                photoViewer.C4.setImageBitmap(bitmap);
                photoViewer.f33685t5.setUndoCutState(true);
                photoViewer.a3(true, true);
                return;
            default:
                photoViewer.C4.setImageBitmap(bitmap);
                photoViewer.f33685t5.setUndoCutState(true);
                photoViewer.a3(true, true);
                return;
        }
    }
}
