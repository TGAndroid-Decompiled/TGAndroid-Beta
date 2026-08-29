package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
public final class w50 extends f2.q {
    public final ArrayList f43839b;
    public final x50 f43840c;

    public w50(x50 x50Var, ArrayList arrayList) {
        this.f43840c = x50Var;
        this.f43839b = arrayList;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        ArrayList arrayList = this.f43839b;
        if (i10 < arrayList.size()) {
            x50 x50Var = this.f43840c;
            if (i11 < x50Var.f44470e.size()) {
                return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(x50Var.f44470e.get(i11));
            }
            return false;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f43840c.f44470e.size();
    }

    @Override
    public final int e() {
        return this.f43839b.size();
    }
}
