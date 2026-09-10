package r3;

import b2.m0;
import b2.o0;
import b2.s;
import java.util.ArrayList;
public final class c implements o0 {
    public final ArrayList f41234a;

    public c(ArrayList arrayList) {
        this.f41234a = arrayList;
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            long j3 = ((b) arrayList.get(0)).f41232b;
            int i10 = 1;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                } else if (((b) arrayList.get(i10)).f41231a < j3) {
                    z10 = true;
                    break;
                } else {
                    j3 = ((b) arrayList.get(i10)).f41232b;
                    i10++;
                }
            }
        }
        e2.d.b(!z10);
    }

    @Override
    public final s a() {
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
        if (obj != null && c.class == obj.getClass()) {
            return this.f41234a.equals(((c) obj).f41234a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41234a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f41234a;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
