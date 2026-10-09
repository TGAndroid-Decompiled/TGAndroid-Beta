package r3;

import b2.m0;
import b2.o0;
import b2.s;
import java.util.ArrayList;
public final class c implements o0 {
    public final ArrayList f46949a;

    public c(ArrayList arrayList) {
        this.f46949a = arrayList;
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            long j3 = ((b) arrayList.get(0)).f46947b;
            int i10 = 1;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                } else if (((b) arrayList.get(i10)).f46946a < j3) {
                    z10 = true;
                    break;
                } else {
                    j3 = ((b) arrayList.get(i10)).f46947b;
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
            return this.f46949a.equals(((c) obj).f46949a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f46949a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f46949a;
    }

    @Override
    public final void b(m0 m0Var) {
    }
}
