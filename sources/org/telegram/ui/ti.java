package org.telegram.ui;

import android.util.SparseArray;
import org.telegram.messenger.MessageObject;
public final class ti {
    public boolean f43845a;
    public final boolean f43846b;
    public final SparseArray f43847c;
    public final un d;

    public ti(un unVar, boolean z10, SparseArray sparseArray) {
        this.d = unVar;
        this.f43846b = z10;
        this.f43847c = sparseArray;
    }

    public final boolean a(int i10) {
        un unVar = this.d;
        int i11 = i10 - unVar.A0.J;
        if (i11 >= 0 && i11 < unVar.G6.size()) {
            MessageObject messageObject = (MessageObject) unVar.G6.get(i11);
            if (messageObject.contentType == 0) {
                SparseArray sparseArray = this.f43847c;
                boolean z10 = this.f43846b;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ti.b(int, boolean, float, float):void");
    }
}
