package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.VideoEditedInfo;
public final class zl extends zu0 {
    public final ArrayList f42350a;
    public final boolean[] f42351b;
    public final fo f42352c;

    public zl(fo foVar, ArrayList arrayList, boolean[] zArr) {
        this.f42352c = foVar;
        this.f42350a = arrayList;
        this.f42351b = zArr;
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final ImageReceiver.BitmapHolder j(int i10) {
        return null;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        ArrayList arrayList = this.f42350a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.f42351b[size]) {
                arrayList.remove(size);
            }
        }
        this.f42352c.ib(arrayList, i11, z10, z11);
    }

    @Override
    public final boolean x(int i10) {
        return this.f42351b[i10];
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
