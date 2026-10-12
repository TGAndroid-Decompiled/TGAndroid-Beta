package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
public final class yl extends wu0 {
    public final Bitmap f44505a;
    public final ArrayList f44506b;
    public final eo f44507c;

    public yl(eo eoVar, Bitmap bitmap, ArrayList arrayList) {
        this.f44507c = eoVar;
        this.f44505a = bitmap;
        this.f44506b = arrayList;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return new ImageReceiver.BitmapHolder(this.f44505a, (String) null, 0);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.f44507c.r((MediaController.PhotoEntry) this.f44506b.get(0), videoEditedInfo, z10, i11, 0, z11, 0L);
    }
}
