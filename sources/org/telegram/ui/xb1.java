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
public final class xb1 extends zt0 {
    public final MediaController.PhotoEntry f43180a;
    public final yb1 f43181b;

    public xb1(yb1 yb1Var, MediaController.PhotoEntry photoEntry) {
        this.f43181b = yb1Var;
        this.f43180a = photoEntry;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        kc1 kc1Var = this.f43181b.f43433a;
        MediaController.PhotoEntry photoEntry = this.f43180a;
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
            kc1Var.B1 = new th1(file2, file2, "");
            kc1Var.C1 = loadBitmap;
            kc1Var.f38515b2 = 0;
            kc1Var.f38571x0.requestLayout();
            kc1Var.b1(false);
            kc1Var.f38569w1 = null;
            kc1Var.i1();
        }
    }

    @Override
    public final boolean z() {
        return false;
    }
}
