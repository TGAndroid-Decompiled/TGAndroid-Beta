package org.telegram.ui;

import android.util.SparseArray;
import org.telegram.messenger.MessageObject;
public final class si {
    public boolean f41482a;
    public final boolean f41483b;
    public final SparseArray f41484c;
    public final qn d;

    public si(qn qnVar, boolean z10, SparseArray sparseArray) {
        this.d = qnVar;
        this.f41483b = z10;
        this.f41484c = sparseArray;
    }

    public final boolean a(int i10) {
        qn qnVar = this.d;
        int i11 = i10 - qnVar.A0.J;
        if (i11 >= 0 && i11 < qnVar.f40868u6.size()) {
            MessageObject messageObject = (MessageObject) qnVar.f40868u6.get(i11);
            if (messageObject.contentType == 0) {
                SparseArray sparseArray = this.f41484c;
                boolean z10 = this.f41483b;
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
