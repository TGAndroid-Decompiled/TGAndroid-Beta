package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.VideoEditedInfo;
public final class xl extends tu0 {
    public final ArrayList f38769a;
    public final boolean[] f38770b;
    public final eo f38771c;

    public xl(eo eoVar, ArrayList arrayList, boolean[] zArr) {
        this.f38771c = eoVar;
        this.f38769a = arrayList;
        this.f38770b = zArr;
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
        ArrayList arrayList = this.f38769a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.f38770b[size]) {
                arrayList.remove(size);
            }
        }
        this.f38771c.eb(arrayList, i11, z10, z11);
    }

    @Override
    public final boolean x(int i10) {
        return this.f38770b[i10];
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
