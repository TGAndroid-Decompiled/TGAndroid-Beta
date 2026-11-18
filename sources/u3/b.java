package u3;

import a8.la;
import e2.n0;
import e2.p0;
import e2.u;
import java.util.ArrayList;
public final class b implements p0 {
    public final ArrayList f58391a;

    public b(ArrayList arrayList) {
        this.f58391a = arrayList;
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            long j3 = ((a) arrayList.get(0)).f58389b;
            int i7 = 1;
            while (true) {
                if (i7 >= arrayList.size()) {
                    break;
                } else if (((a) arrayList.get(i7)).f58388a < j3) {
                    z10 = true;
                    break;
                } else {
                    j3 = ((a) arrayList.get(i7)).f58389b;
                    i7++;
                }
            }
        }
        la.f(!z10);
    }

    @Override
    public final u a() {
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
            return this.f58391a.equals(((b) obj).f58391a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f58391a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f58391a;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
