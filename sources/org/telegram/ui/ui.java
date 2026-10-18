package org.telegram.ui;

import android.util.SparseArray;
import org.telegram.messenger.MessageObject;
public final class ui {
    public boolean f42017a;
    public final boolean f42018b;
    public final SparseArray f42019c;
    public final sn d;

    public ui(sn snVar, boolean z10, SparseArray sparseArray) {
        this.d = snVar;
        this.f42018b = z10;
        this.f42019c = sparseArray;
    }

    public final boolean a(int i10) {
        sn snVar = this.d;
        int i11 = i10 - snVar.A0.J;
        if (i11 >= 0 && i11 < snVar.f41421u6.size()) {
            MessageObject messageObject = (MessageObject) snVar.f41421u6.get(i11);
            if (messageObject.contentType == 0) {
                SparseArray sparseArray = this.f42019c;
                boolean z10 = this.f42018b;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ui.b(int, boolean, float, float):void");
    }
}
