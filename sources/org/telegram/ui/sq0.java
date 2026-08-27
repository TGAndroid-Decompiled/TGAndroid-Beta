package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

public final class sq0 implements Runnable {

    public final int f42683a;

    public final PhotoViewer f42684b;

    public final Bitmap f42685c;

    public sq0(PhotoViewer photoViewer, Bitmap bitmap, int i10) {
        this.f42683a = i10;
        this.f42684b = photoViewer;
        this.f42685c = bitmap;
    }

    @Override
    public final void run() {
        int i10 = this.f42683a;
        Bitmap bitmap = this.f42685c;
        PhotoViewer photoViewer = this.f42684b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.P8;
                photoViewer.n0(bitmap);
                AndroidUtilities.runOnUIThread(new sq0(photoViewer, bitmap, 6));
                break;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.P8;
                photoViewer.n0(bitmap);
                AndroidUtilities.runOnUIThread(new sq0(photoViewer, bitmap, 5));
                break;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.P8;
                photoViewer.n0(bitmap);
                AndroidUtilities.runOnUIThread(new sq0(photoViewer, bitmap, 4));
                break;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.P8;
                photoViewer.n0(bitmap);
                break;
            case 4:
                photoViewer.f35805y4.setImageBitmap(bitmap);
                photoViewer.f35724p5.setUndoCutState(true);
                photoViewer.a3(true, true);
                break;
            case 5:
                photoViewer.f35805y4.setImageBitmap(bitmap);
                photoViewer.f35724p5.setUndoCutState(true);
                photoViewer.a3(true, true);
                break;
            default:
                photoViewer.f35805y4.setImageBitmap(bitmap);
                photoViewer.f35724p5.setUndoCutState(true);
                photoViewer.a3(true, true);
                break;
        }
    }
}
