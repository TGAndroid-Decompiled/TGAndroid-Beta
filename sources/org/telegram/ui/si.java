package org.telegram.ui;

import android.util.SparseArray;
import org.telegram.messenger.MessageObject;
public final class si {
    public boolean f36687a;
    public final boolean f36688b;
    public final SparseArray f36689c;
    public final eo d;

    public si(eo eoVar, boolean z10, SparseArray sparseArray) {
        this.d = eoVar;
        this.f36688b = z10;
        this.f36689c = sparseArray;
    }

    public final boolean a(int i10) {
        eo eoVar = this.d;
        int i11 = i10 - eoVar.A0.J;
        if (i11 >= 0 && i11 < eoVar.f32509u6.size()) {
            MessageObject messageObject = (MessageObject) eoVar.f32509u6.get(i11);
            if (messageObject.contentType == 0) {
                SparseArray sparseArray = this.f36689c;
                boolean z10 = this.f36688b;
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
