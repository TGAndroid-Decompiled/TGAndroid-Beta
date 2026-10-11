package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.VideoEditedInfo;
public final class vl extends tu0 {
    public final ArrayList f43110a;
    public final boolean[] f43111b;
    public final zn f43112c;

    public vl(zn znVar, ArrayList arrayList, boolean[] zArr) {
        this.f43112c = znVar;
        this.f43110a = arrayList;
        this.f43111b = zArr;
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
        ArrayList arrayList = this.f43110a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.f43111b[size]) {
                arrayList.remove(size);
            }
        }
        this.f43112c.ib(arrayList, i11, z10, z11);
    }

    @Override
    public final boolean x(int i10) {
        return this.f43111b[i10];
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
