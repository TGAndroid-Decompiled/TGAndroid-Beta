package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
public final class rl extends au0 {
    public final Bitmap f40985a;
    public final ArrayList f40986b;
    public final xn f40987c;

    public rl(xn xnVar, Bitmap bitmap, ArrayList arrayList) {
        this.f40987c = xnVar;
        this.f40985a = bitmap;
        this.f40986b = arrayList;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return new ImageReceiver.BitmapHolder(this.f40985a, (String) null, 0);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        this.f40987c.r((MediaController.PhotoEntry) this.f40986b.get(0), videoEditedInfo, z4, i11, 0, z10, 0L);
    }
}
