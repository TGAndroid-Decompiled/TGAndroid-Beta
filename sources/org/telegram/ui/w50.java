package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
public final class w50 extends s4.o {
    public final ArrayList f42359b;
    public final x50 f42360c;

    public w50(x50 x50Var, ArrayList arrayList) {
        this.f42360c = x50Var;
        this.f42359b = arrayList;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        ArrayList arrayList = this.f42359b;
        if (i10 < arrayList.size()) {
            x50 x50Var = this.f42360c;
            if (i11 < x50Var.e.size()) {
                return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(x50Var.e.get(i11));
            }
            return false;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f42360c.e.size();
    }

    @Override
    public final int e() {
        return this.f42359b.size();
    }
}
