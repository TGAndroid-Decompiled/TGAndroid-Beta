package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
public final class rl extends ou0 {
    public final Bitmap f37150a;
    public final ArrayList f37151b;
    public final xn f37152c;

    public rl(xn xnVar, Bitmap bitmap, ArrayList arrayList) {
        this.f37152c = xnVar;
        this.f37150a = bitmap;
        this.f37151b = arrayList;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return new ImageReceiver.BitmapHolder(this.f37150a, (String) null, 0);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.f37152c.q((MediaController.PhotoEntry) this.f37151b.get(0), videoEditedInfo, z10, i11, 0, z11, 0L);
    }
}
