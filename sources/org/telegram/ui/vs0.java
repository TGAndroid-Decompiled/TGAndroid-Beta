package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.messenger.MediaController;
public final class vs0 extends bg.s1 {
    public final PhotoViewer G;

    public vs0(PhotoViewer photoViewer, Context context, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, MediaController.CropState cropState) {
        super(context, i10, bitmap, bitmap2, i11, cropState);
        this.G = photoViewer;
    }
}
