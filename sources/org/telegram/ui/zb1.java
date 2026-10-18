package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
public final class zb1 extends bu0 {
    public final MediaController.PhotoEntry f43705a;
    public final ac1 f43706b;

    public zb1(ac1 ac1Var, MediaController.PhotoEntry photoEntry) {
        this.f43706b = ac1Var;
        this.f43705a = photoEntry;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        mc1 mc1Var = this.f43706b.f35363a;
        MediaController.PhotoEntry photoEntry = this.f43705a;
        if (photoEntry.imagePath != null) {
            File directory = FileLoader.getDirectory(4);
            File file = new File(directory, Utilities.random.nextInt() + ".jpg");
            Point realScreenSize = AndroidUtilities.getRealScreenSize();
            Bitmap loadBitmap = ImageLoader.loadBitmap(photoEntry.imagePath, null, (float) realScreenSize.x, (float) realScreenSize.y, true);
            try {
                loadBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            File file2 = new File(photoEntry.imagePath);
            mc1Var.B1 = new vh1(file2, file2, "");
            mc1Var.C1 = loadBitmap;
            mc1Var.f39084b2 = 0;
            mc1Var.f39140x0.requestLayout();
            mc1Var.b1(false);
            mc1Var.f39138w1 = null;
            mc1Var.i1();
        }
    }

    @Override
    public final boolean z() {
        return false;
    }
}
