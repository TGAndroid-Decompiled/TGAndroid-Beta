package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;

public final class x50 extends f2.q {

    public final ArrayList f44286b;

    public final y50 f44287c;

    public x50(y50 y50Var, ArrayList arrayList) {
        this.f44287c = y50Var;
        this.f44286b = arrayList;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        ArrayList arrayList = this.f44286b;
        if (i10 >= arrayList.size()) {
            return false;
        }
        y50 y50Var = this.f44287c;
        if (i11 < y50Var.f44703e.size()) {
            return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(y50Var.f44703e.get(i11));
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f44287c.f44703e.size();
    }

    @Override
    public final int e() {
        return this.f44286b.size();
    }
}
