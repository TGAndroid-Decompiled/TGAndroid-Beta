package p4;

import android.os.Bundle;
import e9.x1;
import java.util.ArrayList;
public final class r implements w2.a {
    public ArrayList f43093a;

    @Override
    public long a(long j10) {
        ArrayList arrayList = this.f43093a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j10 < ((z3.b) arrayList.get(0)).f49253b) {
            return ((z3.b) arrayList.get(0)).f49253b;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            z3.b bVar = (z3.b) arrayList.get(i10);
            long j11 = bVar.f49253b;
            long j12 = bVar.f49253b;
            if (j10 < j11) {
                long j13 = ((z3.b) arrayList.get(i10 - 1)).d;
                if (j13 != -9223372036854775807L && j13 > j10 && j13 < j12) {
                    return j13;
                }
                return j12;
            }
        }
        long j14 = ((z3.b) e9.s.m(arrayList)).d;
        if (j14 == -9223372036854775807L || j10 >= j14) {
            return Long.MIN_VALUE;
        }
        return j14;
    }

    @Override
    public e9.n0 b(long j10) {
        int g10 = g(j10);
        if (g10 == 0) {
            e9.l0 l0Var = e9.n0.f8592b;
            return x1.e;
        }
        z3.b bVar = (z3.b) this.f43093a.get(g10 - 1);
        long j11 = bVar.d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            e9.l0 l0Var2 = e9.n0.f8592b;
            return x1.e;
        }
        return bVar.f49252a;
    }

    @Override
    public boolean c(z3.b r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: p4.r.c(z3.b, long):boolean");
    }

    @Override
    public void clear() {
        this.f43093a.clear();
    }

    @Override
    public long d(long j10) {
        ArrayList arrayList = this.f43093a;
        if (arrayList.isEmpty() || j10 < ((z3.b) arrayList.get(0)).f49253b) {
            return -9223372036854775807L;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            long j11 = ((z3.b) arrayList.get(i10)).f49253b;
            int i11 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
            if (i11 == 0) {
                return j11;
            }
            if (i11 < 0) {
                z3.b bVar = (z3.b) arrayList.get(i10 - 1);
                long j12 = bVar.d;
                if (j12 != -9223372036854775807L && j12 <= j10) {
                    return j12;
                }
                return bVar.f49253b;
            }
        }
        z3.b bVar2 = (z3.b) e9.s.m(arrayList);
        long j13 = bVar2.d;
        if (j13 != -9223372036854775807L && j10 >= j13) {
            return j13;
        }
        return bVar2.f49253b;
    }

    @Override
    public void e(long j10) {
        ArrayList arrayList = this.f43093a;
        int g10 = g(j10);
        if (g10 == 0) {
            return;
        }
        long j11 = ((z3.b) arrayList.get(g10 - 1)).d;
        if (j11 == -9223372036854775807L || j11 >= j10) {
            g10--;
        }
        arrayList.subList(0, g10).clear();
    }

    public s f() {
        if (this.f43093a == null) {
            return s.f43099c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.f43093a);
        return new s(bundle, this.f43093a);
    }

    public int g(long j10) {
        ArrayList arrayList = this.f43093a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (j10 < ((z3.b) arrayList.get(i10)).f49253b) {
                return i10;
            }
        }
        return arrayList.size();
    }
}
