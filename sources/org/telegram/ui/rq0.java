package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class rq0 implements Runnable {
    public final int f42476a;
    public final PhotoViewer f42477b;
    public final Bitmap f42478c;

    public rq0(PhotoViewer photoViewer, Bitmap bitmap, int i9) {
        this.f42476a = i9;
        this.f42477b = photoViewer;
        this.f42478c = bitmap;
    }

    @Override
    public final void run() {
        int i9 = this.f42476a;
        Bitmap bitmap = this.f42478c;
        PhotoViewer photoViewer = this.f42477b;
        switch (i9) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.P8;
                photoViewer.m0(bitmap);
                AndroidUtilities.runOnUIThread(new rq0(photoViewer, bitmap, 6));
                return;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.P8;
                photoViewer.m0(bitmap);
                AndroidUtilities.runOnUIThread(new rq0(photoViewer, bitmap, 5));
                return;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.P8;
                photoViewer.m0(bitmap);
                AndroidUtilities.runOnUIThread(new rq0(photoViewer, bitmap, 4));
                return;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.P8;
                photoViewer.m0(bitmap);
                return;
            case 4:
                photoViewer.f35802y4.setImageBitmap(bitmap);
                photoViewer.f35720p5.setUndoCutState(true);
                photoViewer.a3(true, true);
                return;
            case 5:
                photoViewer.f35802y4.setImageBitmap(bitmap);
                photoViewer.f35720p5.setUndoCutState(true);
                photoViewer.a3(true, true);
                return;
            default:
                photoViewer.f35802y4.setImageBitmap(bitmap);
                photoViewer.f35720p5.setUndoCutState(true);
                photoViewer.a3(true, true);
                return;
        }
    }
}
