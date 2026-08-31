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
public final class rc1 extends au0 {
    public final MediaController.PhotoEntry f40929a;
    public final sc1 f40930b;

    public rc1(sc1 sc1Var, MediaController.PhotoEntry photoEntry) {
        this.f40930b = sc1Var;
        this.f40929a = photoEntry;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        ed1 ed1Var = this.f40930b.f41229a;
        MediaController.PhotoEntry photoEntry = this.f40929a;
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
            ed1Var.f36550y1 = new qi1(file2, file2, "");
            ed1Var.f36552z1 = loadBitmap;
            ed1Var.Y1 = 0;
            ed1Var.f36538u0.requestLayout();
            ed1Var.b1(false);
            ed1Var.f36537t1 = null;
            ed1Var.i1();
        }
    }

    @Override
    public final boolean z() {
        return false;
    }
}
