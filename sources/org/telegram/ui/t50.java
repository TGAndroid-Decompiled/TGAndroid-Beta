package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
public final class t50 extends f2.s {
    public final ArrayList f42858b;
    public final u50 f42859c;

    public t50(u50 u50Var, ArrayList arrayList) {
        this.f42859c = u50Var;
        this.f42858b = arrayList;
    }

    @Override
    public final boolean a(int i9, int i10) {
        return true;
    }

    @Override
    public final boolean b(int i9, int i10) {
        ArrayList arrayList = this.f42858b;
        if (i9 < arrayList.size()) {
            u50 u50Var = this.f42859c;
            if (i10 < u50Var.f43138e.size()) {
                return ((ChatObject.VideoParticipant) arrayList.get(i9)).equals(u50Var.f43138e.get(i10));
            }
            return false;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f42859c.f43138e.size();
    }

    @Override
    public final int e() {
        return this.f42858b.size();
    }
}
