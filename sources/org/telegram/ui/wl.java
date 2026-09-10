package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
public final class wl extends tu0 {
    public final Bitmap f38238a;
    public final ArrayList f38239b;
    public final eo f38240c;

    public wl(eo eoVar, Bitmap bitmap, ArrayList arrayList) {
        this.f38240c = eoVar;
        this.f38238a = bitmap;
        this.f38239b = arrayList;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return new ImageReceiver.BitmapHolder(this.f38238a, (String) null, 0);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.f38240c.q((MediaController.PhotoEntry) this.f38239b.get(0), videoEditedInfo, z10, i11, 0, z11, 0L);
    }
}
