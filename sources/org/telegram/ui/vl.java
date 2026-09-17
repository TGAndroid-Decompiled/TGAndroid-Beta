package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.VideoEditedInfo;
public final class vl extends vu0 {
    public final ArrayList f38468a;
    public final boolean[] f38469b;
    public final bo f38470c;

    public vl(bo boVar, ArrayList arrayList, boolean[] zArr) {
        this.f38470c = boVar;
        this.f38468a = arrayList;
        this.f38469b = zArr;
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
        ArrayList arrayList = this.f38468a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.f38469b[size]) {
                arrayList.remove(size);
            }
        }
        this.f38470c.eb(arrayList, i11, z10, z11);
    }

    @Override
    public final boolean x(int i10) {
        return this.f38469b[i10];
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
