package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.VideoEditedInfo;
public final class sl extends tu0 {
    public final ArrayList f37367a;
    public final boolean[] f37368b;
    public final zn f37369c;

    public sl(zn znVar, ArrayList arrayList, boolean[] zArr) {
        this.f37369c = znVar;
        this.f37367a = arrayList;
        this.f37368b = zArr;
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
        ArrayList arrayList = this.f37367a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.f37368b[size]) {
                arrayList.remove(size);
            }
        }
        this.f37369c.eb(arrayList, i11, z10, z11);
    }

    @Override
    public final boolean x(int i10) {
        return this.f37368b[i10];
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
