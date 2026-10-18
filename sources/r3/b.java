package r3;

import b2.q0;
import b2.s0;
import b2.w;
import java.util.ArrayList;
import v7.u6;
public final class b implements s0 {
    public final ArrayList f44984a;

    public b(ArrayList arrayList) {
        this.f44984a = arrayList;
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            long j10 = ((a) arrayList.get(0)).f44982b;
            int i10 = 1;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                } else if (((a) arrayList.get(i10)).f44981a < j10) {
                    z10 = true;
                    break;
                } else {
                    j10 = ((a) arrayList.get(i10)).f44982b;
                    i10++;
                }
            }
        }
        u6.g(!z10);
    }

    @Override
    public final w a() {
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
            return this.f44984a.equals(((b) obj).f44984a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f44984a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f44984a;
    }

    @Override
    public final void b(q0 q0Var) {
    }
}
