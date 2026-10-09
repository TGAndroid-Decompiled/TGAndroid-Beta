package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.VideoEditedInfo;
public final class vl extends uu0 {
    public final ArrayList f42898a;
    public final boolean[] f42899b;
    public final zn f42900c;

    public vl(zn znVar, ArrayList arrayList, boolean[] zArr) {
        this.f42900c = znVar;
        this.f42898a = arrayList;
        this.f42899b = zArr;
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
        ArrayList arrayList = this.f42898a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.f42899b[size]) {
                arrayList.remove(size);
            }
        }
        this.f42900c.ib(arrayList, i11, z10, z11);
    }

    @Override
    public final boolean x(int i10) {
        return this.f42899b[i10];
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
