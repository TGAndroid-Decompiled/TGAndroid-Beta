package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.VideoEditedInfo;
public final class vl extends tu0 {
    public final ArrayList f38641a;
    public final boolean[] f38642b;
    public final bo f38643c;

    public vl(bo boVar, ArrayList arrayList, boolean[] zArr) {
        this.f38643c = boVar;
        this.f38641a = arrayList;
        this.f38642b = zArr;
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
        ArrayList arrayList = this.f38641a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.f38642b[size]) {
                arrayList.remove(size);
            }
        }
        this.f38643c.eb(arrayList, i11, z10, z11);
    }

    @Override
    public final boolean x(int i10) {
        return this.f38642b[i10];
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
