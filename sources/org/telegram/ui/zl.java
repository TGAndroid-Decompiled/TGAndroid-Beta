package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.VideoEditedInfo;
public final class zl extends av0 {
    public final ArrayList f42643a;
    public final boolean[] f42644b;
    public final fo f42645c;

    public zl(fo foVar, ArrayList arrayList, boolean[] zArr) {
        this.f42645c = foVar;
        this.f42643a = arrayList;
        this.f42644b = zArr;
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
        ArrayList arrayList = this.f42643a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.f42644b[size]) {
                arrayList.remove(size);
            }
        }
        this.f42645c.ib(arrayList, i11, z10, z11);
    }

    @Override
    public final boolean x(int i10) {
        return this.f42644b[i10];
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
