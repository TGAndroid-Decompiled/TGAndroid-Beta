package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
public final class v50 extends s4.o {
    public final ArrayList f42107b;
    public final w50 f42108c;

    public v50(w50 w50Var, ArrayList arrayList) {
        this.f42108c = w50Var;
        this.f42107b = arrayList;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        ArrayList arrayList = this.f42107b;
        if (i10 < arrayList.size()) {
            w50 w50Var = this.f42108c;
            if (i11 < w50Var.e.size()) {
                return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(w50Var.e.get(i11));
            }
            return false;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f42108c.e.size();
    }

    @Override
    public final int e() {
        return this.f42107b.size();
    }
}
