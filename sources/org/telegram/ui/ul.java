package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
public final class ul extends vu0 {
    public final Bitmap f38090a;
    public final ArrayList f38091b;
    public final bo f38092c;

    public ul(bo boVar, Bitmap bitmap, ArrayList arrayList) {
        this.f38092c = boVar;
        this.f38090a = bitmap;
        this.f38091b = arrayList;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return new ImageReceiver.BitmapHolder(this.f38090a, (String) null, 0);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.f38092c.q((MediaController.PhotoEntry) this.f38091b.get(0), videoEditedInfo, z10, i11, 0, z11, 0L);
    }
}
