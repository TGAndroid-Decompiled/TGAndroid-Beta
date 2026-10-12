package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
public final class yl extends av0 {
    public final Bitmap f42188a;
    public final ArrayList f42189b;
    public final fo f42190c;

    public yl(fo foVar, Bitmap bitmap, ArrayList arrayList) {
        this.f42190c = foVar;
        this.f42188a = bitmap;
        this.f42189b = arrayList;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return new ImageReceiver.BitmapHolder(this.f42188a, (String) null, 0);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.f42190c.s((MediaController.PhotoEntry) this.f42189b.get(0), videoEditedInfo, z10, i11, 0, z11, 0L);
    }
}
