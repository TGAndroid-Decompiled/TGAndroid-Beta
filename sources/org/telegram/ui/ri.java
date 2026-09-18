package org.telegram.ui;

import android.util.SparseArray;
import org.telegram.messenger.MessageObject;
public final class ri {
    public boolean f37250a;
    public final boolean f37251b;
    public final SparseArray f37252c;
    public final bo d;

    public ri(bo boVar, boolean z10, SparseArray sparseArray) {
        this.d = boVar;
        this.f37251b = z10;
        this.f37252c = sparseArray;
    }

    public final boolean a(int i10) {
        bo boVar = this.d;
        int i11 = i10 - boVar.A0.J;
        if (i11 >= 0 && i11 < boVar.f32473u6.size()) {
            MessageObject messageObject = (MessageObject) boVar.f32473u6.get(i11);
            if (messageObject.contentType == 0) {
                SparseArray sparseArray = this.f37252c;
                boolean z10 = this.f37251b;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ri.b(int, boolean, float, float):void");
    }
}
