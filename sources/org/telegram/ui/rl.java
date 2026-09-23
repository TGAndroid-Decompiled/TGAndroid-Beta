package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
public final class rl extends mu0 {
    public final Bitmap f36889a;
    public final ArrayList f36890b;
    public final xn f36891c;

    public rl(xn xnVar, Bitmap bitmap, ArrayList arrayList) {
        this.f36891c = xnVar;
        this.f36889a = bitmap;
        this.f36890b = arrayList;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return new ImageReceiver.BitmapHolder(this.f36889a, (String) null, 0);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.f36891c.q((MediaController.PhotoEntry) this.f36890b.get(0), videoEditedInfo, z10, i11, 0, z11, 0L);
    }
}
