package u3;

import a8.ia;
import e2.n0;
import e2.p0;
import e2.u;
import java.util.ArrayList;
public final class b implements p0 {
    public final ArrayList f56325a;

    public b(ArrayList arrayList) {
        this.f56325a = arrayList;
        boolean z9 = false;
        if (!arrayList.isEmpty()) {
            long j3 = ((a) arrayList.get(0)).f56323b;
            int i7 = 1;
            while (true) {
                if (i7 >= arrayList.size()) {
                    break;
                } else if (((a) arrayList.get(i7)).f56322a < j3) {
                    z9 = true;
                    break;
                } else {
                    j3 = ((a) arrayList.get(i7)).f56323b;
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
            return this.f56325a.equals(((b) obj).f56325a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f56325a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f56325a;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
