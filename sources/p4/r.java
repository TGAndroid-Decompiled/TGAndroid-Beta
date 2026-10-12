package p4;

import android.os.Bundle;
import e9.a1;
import java.util.ArrayList;
public final class r implements w2.a {
    public ArrayList f45303a;

    @Override
    public long a(long j3) {
        ArrayList arrayList = this.f45303a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j3 < ((z3.a) arrayList.get(0)).f53713b) {
            return ((z3.a) arrayList.get(0)).f53713b;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            z3.a aVar = (z3.a) arrayList.get(i10);
            long j10 = aVar.f53713b;
            long j11 = aVar.f53713b;
            if (j3 < j10) {
                long j12 = ((z3.a) arrayList.get(i10 - 1)).d;
                if (j12 != -9223372036854775807L && j12 > j3 && j12 < j11) {
                    return j12;
                }
                return j11;
            }
        }
        long j13 = ((z3.a) e9.q.l(arrayList)).d;
        if (j13 == -9223372036854775807L || j3 >= j13) {
            return Long.MIN_VALUE;
        }
        return j13;
    }

    @Override
    public e9.i0 b(long j3) {
        int g10 = g(j3);
        if (g10 == 0) {
            e9.g0 g0Var = e9.i0.f8749b;
            return a1.f8712e;
        }
        z3.a aVar = (z3.a) this.f45303a.get(g10 - 1);
        long j10 = aVar.d;
        if (j10 != -9223372036854775807L && j3 >= j10) {
            e9.g0 g0Var2 = e9.i0.f8749b;
            return a1.f8712e;
        }
        return aVar.f53712a;
    }

    @Override
    public boolean c(z3.a r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: p4.r.c(z3.a, long):boolean");
    }

    @Override
    public void clear() {
        this.f45303a.clear();
    }

    @Override
    public long d(long j3) {
        ArrayList arrayList = this.f45303a;
        if (arrayList.isEmpty() || j3 < ((z3.a) arrayList.get(0)).f53713b) {
            return -9223372036854775807L;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            long j10 = ((z3.a) arrayList.get(i10)).f53713b;
            int i11 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
            if (i11 == 0) {
                return j10;
            }
            if (i11 < 0) {
                z3.a aVar = (z3.a) arrayList.get(i10 - 1);
                long j11 = aVar.d;
                if (j11 != -9223372036854775807L && j11 <= j3) {
                    return j11;
                }
                return aVar.f53713b;
            }
        }
        z3.a aVar2 = (z3.a) e9.q.l(arrayList);
        long j12 = aVar2.d;
        if (j12 != -9223372036854775807L && j3 >= j12) {
            return j12;
        }
        return aVar2.f53713b;
    }

    @Override
    public void e(long j3) {
        ArrayList arrayList = this.f45303a;
        int g10 = g(j3);
        if (g10 == 0) {
            return;
        }
        long j10 = ((z3.a) arrayList.get(g10 - 1)).d;
        if (j10 == -9223372036854775807L || j10 >= j3) {
            g10--;
        }
        arrayList.subList(0, g10).clear();
    }

    public s f() {
        if (this.f45303a == null) {
            return s.f45310c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.f45303a);
        return new s(bundle, this.f45303a);
    }

    public int g(long j3) {
        ArrayList arrayList = this.f45303a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (j3 < ((z3.a) arrayList.get(i10)).f53713b) {
                return i10;
            }
        }
        return arrayList.size();
    }
}
