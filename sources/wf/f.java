package wf;

import h9.g0;
import h9.i0;
import h9.o;
import h9.s1;
import java.util.ArrayList;
public final class f implements z2.a {
    public final ArrayList f59818a;

    public f(ArrayList arrayList) {
        this.f59818a = arrayList;
    }

    @Override
    public long a(long j3) {
        ArrayList arrayList = this.f59818a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j3 < ((c4.a) arrayList.get(0)).f4368b) {
            return ((c4.a) arrayList.get(0)).f4368b;
        }
        for (int i7 = 1; i7 < arrayList.size(); i7++) {
            c4.a aVar = (c4.a) arrayList.get(i7);
            long j10 = aVar.f4368b;
            long j11 = aVar.f4368b;
            if (j3 < j10) {
                long j12 = ((c4.a) arrayList.get(i7 - 1)).d;
                if (j12 != -9223372036854775807L && j12 > j3 && j12 < j11) {
                    return j12;
                }
                return j11;
            }
        }
        long j13 = ((c4.a) o.n(arrayList)).d;
        if (j13 == -9223372036854775807L || j3 >= j13) {
            return Long.MIN_VALUE;
        }
        return j13;
    }

    @Override
    public i0 b(long j3) {
        int f10 = f(j3);
        if (f10 == 0) {
            g0 g0Var = i0.f13995b;
            return s1.f14058e;
        }
        c4.a aVar = (c4.a) this.f59818a.get(f10 - 1);
        long j10 = aVar.d;
        if (j10 != -9223372036854775807L && j3 >= j10) {
            g0 g0Var2 = i0.f13995b;
            return s1.f14058e;
        }
        return aVar.f4367a;
    }

    @Override
    public boolean c(c4.a r10, long r11) {
        throw new UnsupportedOperationException("Method not decompiled: wf.f.c(c4.a, long):boolean");
    }

    @Override
    public void clear() {
        this.f59818a.clear();
    }

    @Override
    public long d(long j3) {
        ArrayList arrayList = this.f59818a;
        if (arrayList.isEmpty() || j3 < ((c4.a) arrayList.get(0)).f4368b) {
            return -9223372036854775807L;
        }
        for (int i7 = 1; i7 < arrayList.size(); i7++) {
            long j10 = ((c4.a) arrayList.get(i7)).f4368b;
            int i10 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
            if (i10 == 0) {
                return j10;
            }
            if (i10 < 0) {
                c4.a aVar = (c4.a) arrayList.get(i7 - 1);
                long j11 = aVar.d;
                if (j11 != -9223372036854775807L && j11 <= j3) {
                    return j11;
                }
                return aVar.f4368b;
            }
        }
        c4.a aVar2 = (c4.a) o.n(arrayList);
        long j12 = aVar2.d;
        if (j12 != -9223372036854775807L && j3 >= j12) {
            return j12;
        }
        return aVar2.f4368b;
    }

    @Override
    public void e(long j3) {
        int f10 = f(j3);
        if (f10 == 0) {
            return;
        }
        ArrayList arrayList = this.f59818a;
        long j10 = ((c4.a) arrayList.get(f10 - 1)).d;
        if (j10 == -9223372036854775807L || j10 >= j3) {
            f10--;
        }
        arrayList.subList(0, f10).clear();
    }

    public int f(long j3) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f59818a;
            if (i7 < arrayList.size()) {
                if (j3 < ((c4.a) arrayList.get(i7)).f4368b) {
                    return i7;
                }
                i7++;
            } else {
                return arrayList.size();
            }
        }
    }

    public e g(int i7) {
        return (e) this.f59818a.get(i7);
    }

    public f(e eVar) {
        ArrayList arrayList = new ArrayList(1);
        this.f59818a = arrayList;
        arrayList.add(eVar);
    }

    public f() {
        this.f59818a = new ArrayList();
    }
}
