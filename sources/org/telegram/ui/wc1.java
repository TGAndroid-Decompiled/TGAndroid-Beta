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
public final class wc1 extends fu0 {
    public final MediaController.PhotoEntry f42405a;
    public final xc1 f42406b;

    public wc1(xc1 xc1Var, MediaController.PhotoEntry photoEntry) {
        this.f42406b = xc1Var;
        this.f42405a = photoEntry;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        jd1 jd1Var = this.f42406b.f43014a;
        MediaController.PhotoEntry photoEntry = this.f42405a;
        if (photoEntry.imagePath != null) {
            File directory = FileLoader.getDirectory(4);
            File file = new File(directory, Utilities.random.nextInt() + ".jpg");
            Point realScreenSize = AndroidUtilities.getRealScreenSize();
            Bitmap loadBitmap = ImageLoader.loadBitmap(photoEntry.imagePath, null, (float) realScreenSize.x, (float) realScreenSize.y, true);
            try {
                loadBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
            } catch (FileNotFoundException e6) {
                e6.printStackTrace();
            }
            File file2 = new File(photoEntry.imagePath);
            jd1Var.f38025y1 = new wi1(file2, file2, "");
            jd1Var.f38027z1 = loadBitmap;
            jd1Var.Y1 = 0;
            jd1Var.f38013u0.requestLayout();
            jd1Var.b1(false);
            jd1Var.f38012t1 = null;
            jd1Var.i1();
        }
    }

    @Override
    public final boolean z() {
        return false;
    }
}
