package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.VideoEditedInfo;
public final class sl extends ou0 {
    public final ArrayList f37489a;
    public final boolean[] f37490b;
    public final xn f37491c;

    public sl(xn xnVar, ArrayList arrayList, boolean[] zArr) {
        this.f37491c = xnVar;
        this.f37489a = arrayList;
        this.f37490b = zArr;
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
        ArrayList arrayList = this.f37489a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.f37490b[size]) {
                arrayList.remove(size);
            }
        }
        this.f37491c.eb(arrayList, i11, z10, z11);
    }

    @Override
    public final boolean x(int i10) {
        return this.f37490b[i10];
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
