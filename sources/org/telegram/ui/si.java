package org.telegram.ui;

import android.util.SparseArray;
import org.telegram.messenger.MessageObject;
public final class si {
    public boolean f41422a;
    public final boolean f41423b;
    public final SparseArray f41424c;
    public final sn d;

    public si(sn snVar, boolean z10, SparseArray sparseArray) {
        this.d = snVar;
        this.f41423b = z10;
        this.f41424c = sparseArray;
    }

    public final boolean a(int i10) {
        sn snVar = this.d;
        int i11 = i10 - snVar.A0.J;
        if (i11 >= 0 && i11 < snVar.G6.size()) {
            MessageObject messageObject = (MessageObject) snVar.G6.get(i11);
            if (messageObject.contentType == 0) {
                SparseArray sparseArray = this.f41424c;
                boolean z10 = this.f41423b;
                if (!z10 && sparseArray.get(messageObject.getId(), null) == null) {
                    return true;
                }
                if (z10 && sparseArray.get(messageObject.getId(), null) != null) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void b(int r8, boolean r9, float r10, float r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.si.b(int, boolean, float, float):void");
    }
}
