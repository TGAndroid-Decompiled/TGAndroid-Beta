package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.VideoEditedInfo;
public final class sl extends yt0 {
    public final ArrayList f38400a;
    public final boolean[] f38401b;
    public final xn f38402c;

    public sl(xn xnVar, ArrayList arrayList, boolean[] zArr) {
        this.f38402c = xnVar;
        this.f38400a = arrayList;
        this.f38401b = zArr;
    }

    @Override
    public final boolean S() {
        return false;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return null;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        ArrayList arrayList = this.f38400a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.f38401b[size]) {
                arrayList.remove(size);
            }
        }
        this.f38402c.eb(arrayList, i11, z4, z10);
    }

    @Override
    public final boolean x(int i10) {
        return this.f38401b[i10];
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
