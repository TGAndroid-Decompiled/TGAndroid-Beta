package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.VideoEditedInfo;
public final class vl extends su0 {
    public final ArrayList f41586a;
    public final boolean[] f41587b;
    public final co f41588c;

    public vl(co coVar, ArrayList arrayList, boolean[] zArr) {
        this.f41588c = coVar;
        this.f41586a = arrayList;
        this.f41587b = zArr;
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
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        ArrayList arrayList = this.f41586a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.f41587b[size]) {
                arrayList.remove(size);
            }
        }
        this.f41588c.eb(arrayList, i11, z10, z11);
    }

    @Override
    public final boolean x(int i10) {
        return this.f41587b[i10];
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
