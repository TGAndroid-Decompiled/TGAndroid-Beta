package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.VideoEditedInfo;
public final class rl extends ou0 {
    public final ArrayList f40163a;
    public final boolean[] f40164b;
    public final yn f40165c;

    public rl(yn ynVar, ArrayList arrayList, boolean[] zArr) {
        this.f40165c = ynVar;
        this.f40163a = arrayList;
        this.f40164b = zArr;
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
        ArrayList arrayList = this.f40163a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!this.f40164b[size]) {
                arrayList.remove(size);
            }
        }
        this.f40165c.db(arrayList, i11, z10, z11);
    }

    @Override
    public final boolean x(int i10) {
        return this.f40164b[i10];
    }

    @Override
    public final int k(int i10, VideoEditedInfo videoEditedInfo) {
        return i10;
    }
}
