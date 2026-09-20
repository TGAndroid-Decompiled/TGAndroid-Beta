package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.VideoEditedInfo;
public final class sl extends tu0 {
    public final ArrayList f37422a;
    public final boolean[] f37423b;
    public final zn f37424c;

    public sl(zn znVar, ArrayList arrayList, boolean[] zArr) {
        this.f37424c = znVar;
        this.f37422a = arrayList;
        this.f37423b = zArr;
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
        ArrayList arrayList = this.f37422a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.f37423b[size]) {
                arrayList.remove(size);
            }
        }
        this.f37424c.eb(arrayList, i11, z10, z11);
    }

    @Override
    public final boolean x(int i10) {
        return this.f37423b[i10];
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
