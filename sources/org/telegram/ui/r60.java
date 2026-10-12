package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
public final class r60 extends s4.o {
    public final ArrayList f39614b;
    public final s60 f39615c;

    public r60(s60 s60Var, ArrayList arrayList) {
        this.f39615c = s60Var;
        this.f39614b = arrayList;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        ArrayList arrayList = this.f39614b;
        if (i10 < arrayList.size()) {
            s60 s60Var = this.f39615c;
            if (i11 < s60Var.e.size()) {
                return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(s60Var.e.get(i11));
            }
            return false;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f39615c.e.size();
    }

    @Override
    public final int e() {
        return this.f39614b.size();
    }
}
