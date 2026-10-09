package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
public final class ul extends uu0 {
    public final Bitmap f42448a;
    public final ArrayList f42449b;
    public final zn f42450c;

    public ul(zn znVar, Bitmap bitmap, ArrayList arrayList) {
        this.f42450c = znVar;
        this.f42448a = bitmap;
        this.f42449b = arrayList;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return new ImageReceiver.BitmapHolder(this.f42448a, (String) null, 0);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.f42450c.r((MediaController.PhotoEntry) this.f42449b.get(0), videoEditedInfo, z10, i11, 0, z11, 0L);
    }
}
