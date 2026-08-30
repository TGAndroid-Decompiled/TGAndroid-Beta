package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class yq0 implements Runnable {
    public final int f40559a;
    public final PhotoViewer f40560b;
    public final Bitmap f40561c;

    public yq0(PhotoViewer photoViewer, Bitmap bitmap, int i10) {
        this.f40559a = i10;
        this.f40560b = photoViewer;
        this.f40561c = bitmap;
    }

    @Override
    public final void run() {
        int i10 = this.f40559a;
        Bitmap bitmap = this.f40561c;
        PhotoViewer photoViewer = this.f40560b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.Q8;
                photoViewer.n0(bitmap);
                AndroidUtilities.runOnUIThread(new yq0(photoViewer, bitmap, 6));
                return;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.Q8;
                photoViewer.n0(bitmap);
                AndroidUtilities.runOnUIThread(new yq0(photoViewer, bitmap, 5));
                return;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.Q8;
                photoViewer.n0(bitmap);
                AndroidUtilities.runOnUIThread(new yq0(photoViewer, bitmap, 4));
                return;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.Q8;
                photoViewer.n0(bitmap);
                return;
            case 4:
                photoViewer.z4.setImageBitmap(bitmap);
                photoViewer.f31844q5.setUndoCutState(true);
                photoViewer.a3(true, true);
                return;
            case 5:
                photoViewer.z4.setImageBitmap(bitmap);
                photoViewer.f31844q5.setUndoCutState(true);
                photoViewer.a3(true, true);
                return;
            default:
                photoViewer.z4.setImageBitmap(bitmap);
                photoViewer.f31844q5.setUndoCutState(true);
                photoViewer.a3(true, true);
                return;
        }
    }
}
