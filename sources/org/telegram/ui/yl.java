package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
public final class yl extends wu0 {
    public final Bitmap f44500a;
    public final ArrayList f44501b;
    public final eo f44502c;

    public yl(eo eoVar, Bitmap bitmap, ArrayList arrayList) {
        this.f44502c = eoVar;
        this.f44500a = bitmap;
        this.f44501b = arrayList;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return new ImageReceiver.BitmapHolder(this.f44500a, (String) null, 0);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.f44502c.r((MediaController.PhotoEntry) this.f44501b.get(0), videoEditedInfo, z10, i11, 0, z11, 0L);
    }
}
