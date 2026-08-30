package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
public final class rl extends yt0 {
    public final Bitmap f38077a;
    public final ArrayList f38078b;
    public final xn f38079c;

    public rl(xn xnVar, Bitmap bitmap, ArrayList arrayList) {
        this.f38079c = xnVar;
        this.f38077a = bitmap;
        this.f38078b = arrayList;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return new ImageReceiver.BitmapHolder(this.f38077a, (String) null, 0);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        this.f38079c.r((MediaController.PhotoEntry) this.f38078b.get(0), videoEditedInfo, z4, i11, 0, z10, 0L);
    }
}
