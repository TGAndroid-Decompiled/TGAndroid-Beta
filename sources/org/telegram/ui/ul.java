package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
public final class ul extends tu0 {
    public final Bitmap f42677a;
    public final ArrayList f42678b;
    public final zn f42679c;

    public ul(zn znVar, Bitmap bitmap, ArrayList arrayList) {
        this.f42679c = znVar;
        this.f42677a = bitmap;
        this.f42678b = arrayList;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return new ImageReceiver.BitmapHolder(this.f42677a, (String) null, 0);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.f42679c.r((MediaController.PhotoEntry) this.f42678b.get(0), videoEditedInfo, z10, i11, 0, z11, 0L);
    }
}
