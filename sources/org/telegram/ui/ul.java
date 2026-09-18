package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
public final class ul extends vu0 {
    public final Bitmap f38095a;
    public final ArrayList f38096b;
    public final bo f38097c;

    public ul(bo boVar, Bitmap bitmap, ArrayList arrayList) {
        this.f38097c = boVar;
        this.f38095a = bitmap;
        this.f38096b = arrayList;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return new ImageReceiver.BitmapHolder(this.f38095a, (String) null, 0);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.f38097c.q((MediaController.PhotoEntry) this.f38096b.get(0), videoEditedInfo, z10, i11, 0, z11, 0L);
    }
}
