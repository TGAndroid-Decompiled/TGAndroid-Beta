package org.telegram.ui;

import android.util.SparseArray;
import org.telegram.messenger.MessageObject;
public final class wi {
    public boolean f45011a;
    public final boolean f45012b;
    public final SparseArray f45013c;
    public final wn d;

    public wi(wn wnVar, boolean z10, SparseArray sparseArray) {
        this.d = wnVar;
        this.f45012b = z10;
        this.f45013c = sparseArray;
    }

    public final boolean a(int i10) {
        wn wnVar = this.d;
        int i11 = i10 - wnVar.A0.J;
        if (i11 >= 0 && i11 < wnVar.K6.size()) {
            MessageObject messageObject = (MessageObject) wnVar.K6.get(i11);
            if (messageObject.contentType == 0) {
                SparseArray sparseArray = this.f45013c;
                boolean z10 = this.f45012b;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wi.b(int, boolean, float, float):void");
    }
}
