package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class rq0 implements Runnable {
    public final int f42187a;
    public final PhotoViewer f42188b;
    public final Bitmap f42189c;

    public rq0(PhotoViewer photoViewer, Bitmap bitmap, int i10) {
        this.f42187a = i10;
        this.f42188b = photoViewer;
        this.f42189c = bitmap;
    }

    @Override
    public final void run() {
        int i10 = this.f42187a;
        Bitmap bitmap = this.f42189c;
        PhotoViewer photoViewer = this.f42188b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.P8;
                photoViewer.n0(bitmap);
                AndroidUtilities.runOnUIThread(new rq0(photoViewer, bitmap, 6));
                return;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.P8;
                photoViewer.n0(bitmap);
                AndroidUtilities.runOnUIThread(new rq0(photoViewer, bitmap, 5));
                return;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.P8;
                photoViewer.n0(bitmap);
                AndroidUtilities.runOnUIThread(new rq0(photoViewer, bitmap, 4));
                return;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.P8;
                photoViewer.n0(bitmap);
                return;
            case 4:
                photoViewer.f35869y4.setImageBitmap(bitmap);
                photoViewer.f35787p5.setUndoCutState(true);
                photoViewer.a3(true, true);
                return;
            case 5:
                photoViewer.f35869y4.setImageBitmap(bitmap);
                photoViewer.f35787p5.setUndoCutState(true);
                photoViewer.a3(true, true);
                return;
            default:
                photoViewer.f35869y4.setImageBitmap(bitmap);
                photoViewer.f35787p5.setUndoCutState(true);
                photoViewer.a3(true, true);
                return;
        }
    }
}
