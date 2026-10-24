package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
public final class z50 extends s4.o {
    public final ArrayList f44022b;
    public final a60 f44023c;

    public z50(a60 a60Var, ArrayList arrayList) {
        this.f44023c = a60Var;
        this.f44022b = arrayList;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        ArrayList arrayList = this.f44022b;
        if (i10 < arrayList.size()) {
            a60 a60Var = this.f44023c;
            if (i11 < a60Var.e.size()) {
                return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(a60Var.e.get(i11));
            }
            return false;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f44023c.e.size();
    }

    @Override
    public final int e() {
        return this.f44022b.size();
    }
}
