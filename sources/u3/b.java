package u3;

import a8.ia;
import e2.n0;
import e2.p0;
import e2.u;
import java.util.ArrayList;
public final class b implements p0 {
    public final ArrayList f56199a;

    public b(ArrayList arrayList) {
        this.f56199a = arrayList;
        boolean z9 = false;
        if (!arrayList.isEmpty()) {
            long j3 = ((a) arrayList.get(0)).f56197b;
            int i7 = 1;
            while (true) {
                if (i7 >= arrayList.size()) {
                    break;
                } else if (((a) arrayList.get(i7)).f56196a < j3) {
                    z9 = true;
                    break;
                } else {
                    j3 = ((a) arrayList.get(i7)).f56197b;
                    i7++;
                }
            }
        }
        ia.f(!z9);
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
            return this.f56199a.equals(((b) obj).f56199a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f56199a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f56199a;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
