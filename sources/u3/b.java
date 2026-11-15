package u3;

import a8.ja;
import e2.n0;
import e2.p0;
import e2.u;
import java.util.ArrayList;
public final class b implements p0 {
    public final ArrayList f57823a;

    public b(ArrayList arrayList) {
        this.f57823a = arrayList;
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            long j3 = ((a) arrayList.get(0)).f57821b;
            int i7 = 1;
            while (true) {
                if (i7 >= arrayList.size()) {
                    break;
                } else if (((a) arrayList.get(i7)).f57820a < j3) {
                    z10 = true;
                    break;
                } else {
                    j3 = ((a) arrayList.get(i7)).f57821b;
                    i7++;
                }
            }
        }
        ja.f(!z10);
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
            return this.f57823a.equals(((b) obj).f57823a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f57823a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f57823a;
    }

    @Override
    public final void b(n0 n0Var) {
    }
}
