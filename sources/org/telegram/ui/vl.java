package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.VideoEditedInfo;
public final class vl extends uu0 {
    public final ArrayList f42942a;
    public final boolean[] f42943b;
    public final zn f42944c;

    public vl(zn znVar, ArrayList arrayList, boolean[] zArr) {
        this.f42944c = znVar;
        this.f42942a = arrayList;
        this.f42943b = zArr;
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
        ArrayList arrayList = this.f42942a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.f42943b[size]) {
                arrayList.remove(size);
            }
        }
        this.f42944c.ib(arrayList, i11, z10, z11);
    }

    @Override
    public final boolean x(int i10) {
        return this.f42943b[i10];
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
