package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.VideoEditedInfo;
public final class vl extends vu0 {
    public final ArrayList f38473a;
    public final boolean[] f38474b;
    public final bo f38475c;

    public vl(bo boVar, ArrayList arrayList, boolean[] zArr) {
        this.f38475c = boVar;
        this.f38473a = arrayList;
        this.f38474b = zArr;
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
        ArrayList arrayList = this.f38473a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.f38474b[size]) {
                arrayList.remove(size);
            }
        }
        this.f38475c.eb(arrayList, i11, z10, z11);
    }

    @Override
    public final boolean x(int i10) {
        return this.f38474b[i10];
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
