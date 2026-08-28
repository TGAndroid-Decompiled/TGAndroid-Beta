package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.messenger.MediaController;
public final class ws0 extends yf.v0 {
    public final PhotoViewer G;

    public ws0(PhotoViewer photoViewer, Context context, int i9, Bitmap bitmap, Bitmap bitmap2, int i10, MediaController.CropState cropState) {
        super(context, i9, bitmap, bitmap2, i10, cropState);
        this.G = photoViewer;
    }
}
