package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
public final class r60 extends s4.o {
    public final ArrayList f39307b;
    public final s60 f39308c;

    public r60(s60 s60Var, ArrayList arrayList) {
        this.f39308c = s60Var;
        this.f39307b = arrayList;
    }

    @Override
    public final boolean a(int i10, int i11) {
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        ArrayList arrayList = this.f39307b;
        if (i10 < arrayList.size()) {
            s60 s60Var = this.f39308c;
            if (i11 < s60Var.e.size()) {
                return ((ChatObject.VideoParticipant) arrayList.get(i10)).equals(s60Var.e.get(i11));
            }
            return false;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f39308c.e.size();
    }

    @Override
    public final int e() {
        return this.f39307b.size();
    }
}
