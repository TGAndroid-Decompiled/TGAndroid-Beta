package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
public final class tl extends fu0 {
    public final Bitmap f38545a;
    public final ArrayList f38546b;
    public final zn f38547c;

    public tl(zn znVar, Bitmap bitmap, ArrayList arrayList) {
        this.f38547c = znVar;
        this.f38545a = bitmap;
        this.f38546b = arrayList;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return new ImageReceiver.BitmapHolder(this.f38545a, (String) null, 0);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        this.f38547c.r((MediaController.PhotoEntry) this.f38546b.get(0), videoEditedInfo, z4, i11, 0, z10, 0L);
    }
}
