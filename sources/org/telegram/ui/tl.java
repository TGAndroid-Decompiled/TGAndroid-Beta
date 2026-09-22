package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.VideoEditedInfo;
public final class tl extends tu0 {
    public final ArrayList f37844a;
    public final boolean[] f37845b;
    public final zn f37846c;

    public tl(zn znVar, ArrayList arrayList, boolean[] zArr) {
        this.f37846c = znVar;
        this.f37844a = arrayList;
        this.f37845b = zArr;
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
        ArrayList arrayList = this.f37844a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.f37845b[size]) {
                arrayList.remove(size);
            }
        }
        this.f37846c.eb(arrayList, i11, z10, z11);
    }

    @Override
    public final boolean x(int i10) {
        return this.f37845b[i10];
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
