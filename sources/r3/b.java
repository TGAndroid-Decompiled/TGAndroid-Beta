package r3;

import b2.r0;
import b2.t0;
import b2.x;
import java.util.ArrayList;
import v7.u6;
public final class b implements t0 {
    public final ArrayList f43654a;

    public b(ArrayList arrayList) {
        this.f43654a = arrayList;
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            long j10 = ((a) arrayList.get(0)).f43652b;
            int i10 = 1;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                } else if (((a) arrayList.get(i10)).f43651a < j10) {
                    z10 = true;
                    break;
                } else {
                    j10 = ((a) arrayList.get(i10)).f43652b;
                    i10++;
                }
            }
        }
        u6.g(!z10);
    }

    @Override
    public final x a() {
        return null;
    }

    @Override
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            return this.f43654a.equals(((b) obj).f43654a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f43654a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f43654a;
    }

    @Override
    public final void b(r0 r0Var) {
    }
}
