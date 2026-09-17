package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
public final class ul extends su0 {
    public final Bitmap f41208a;
    public final ArrayList f41209b;
    public final co f41210c;

    public ul(co coVar, Bitmap bitmap, ArrayList arrayList) {
        this.f41210c = coVar;
        this.f41208a = bitmap;
        this.f41209b = arrayList;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return new ImageReceiver.BitmapHolder(this.f41208a, (String) null, 0);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        this.f41210c.q((MediaController.PhotoEntry) this.f41209b.get(0), videoEditedInfo, z10, i11, 0, z11, 0L);
    }
}
