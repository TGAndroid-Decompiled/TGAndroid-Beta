package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
public final class ul extends uu0 {
    public final Bitmap f42450a;
    public final ArrayList f42451b;
    public final zn f42452c;

    public ul(zn znVar, Bitmap bitmap, ArrayList arrayList) {
        this.f42452c = znVar;
        this.f42450a = bitmap;
        this.f42451b = arrayList;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return new ImageReceiver.BitmapHolder(this.f42450a, (String) null, 0);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.f42452c.r((MediaController.PhotoEntry) this.f42451b.get(0), videoEditedInfo, z10, i11, 0, z11, 0L);
    }
}
