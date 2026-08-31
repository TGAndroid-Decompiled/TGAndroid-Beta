package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.VideoEditedInfo;
public final class sl extends au0 {
    public final ArrayList f41320a;
    public final boolean[] f41321b;
    public final xn f41322c;

    public sl(xn xnVar, ArrayList arrayList, boolean[] zArr) {
        this.f41322c = xnVar;
        this.f41320a = arrayList;
        this.f41321b = zArr;
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
        ArrayList arrayList = this.f41320a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.f41321b[size]) {
                arrayList.remove(size);
            }
        }
        this.f41322c.eb(arrayList, i11, z4, z10);
    }

    @Override
    public final boolean x(int i10) {
        return this.f41321b[i10];
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
