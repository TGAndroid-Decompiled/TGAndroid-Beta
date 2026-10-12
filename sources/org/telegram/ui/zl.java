package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.VideoEditedInfo;
public final class zl extends wu0 {
    public final ArrayList f44876a;
    public final boolean[] f44877b;
    public final eo f44878c;

    public zl(eo eoVar, ArrayList arrayList, boolean[] zArr) {
        this.f44878c = eoVar;
        this.f44876a = arrayList;
        this.f44877b = zArr;
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
        ArrayList arrayList = this.f44876a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.f44877b[size]) {
                arrayList.remove(size);
            }
        }
        this.f44878c.ib(arrayList, i11, z10, z11);
    }

    @Override
    public final boolean x(int i10) {
        return this.f44877b[i10];
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
