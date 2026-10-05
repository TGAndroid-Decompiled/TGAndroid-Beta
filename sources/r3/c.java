package r3;

import b2.m0;
import b2.o0;
import b2.s;
import java.util.ArrayList;
public final class c implements o0 {
    public final ArrayList f45801a;

    public c(ArrayList arrayList) {
        this.f45801a = arrayList;
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            long j3 = ((b) arrayList.get(0)).f45799b;
            int i10 = 1;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                } else if (((b) arrayList.get(i10)).f45798a < j3) {
                    z10 = true;
                    break;
                } else {
                    j3 = ((b) arrayList.get(i10)).f45799b;
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
            return this.f45801a.equals(((c) obj).f45801a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f45801a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f45801a;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
