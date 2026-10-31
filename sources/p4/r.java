package p4;

import android.os.Bundle;
import e9.x1;
import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
public final class r implements w2.a {
    public final int f44795a;
    public ArrayList f44796b;

    public r(int i10) {
        this.f44795a = i10;
        switch (i10) {
            case 1:
                File file = new File(System.getProperty("java.io.tmpdir"));
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.f44796b = new ArrayList();
                return;
            case 2:
                this.f44796b = new ArrayList();
                return;
            default:
                return;
        }
    }

    @Override
    public long a(long j10) {
        ArrayList arrayList = this.f44796b;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j10 < ((z3.a) arrayList.get(0)).f54553b) {
            return ((z3.a) arrayList.get(0)).f54553b;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            z3.a aVar = (z3.a) arrayList.get(i10);
            long j11 = aVar.f54553b;
            long j12 = aVar.f54553b;
            if (j10 < j11) {
                long j13 = ((z3.a) arrayList.get(i10 - 1)).d;
                if (j13 != -9223372036854775807L && j13 > j10 && j13 < j12) {
                    return j13;
                }
                return j12;
            }
        }
        long j14 = ((z3.a) e9.s.m(arrayList)).d;
        if (j14 == -9223372036854775807L || j10 >= j14) {
            return Long.MIN_VALUE;
        }
        return j14;
    }

    @Override
    public e9.n0 b(long j10) {
        int g10 = g(j10);
        if (g10 == 0) {
            e9.l0 l0Var = e9.n0.f6390b;
            return x1.e;
        }
        z3.a aVar = (z3.a) this.f44796b.get(g10 - 1);
        long j11 = aVar.d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            e9.l0 l0Var2 = e9.n0.f6390b;
            return x1.e;
        }
        return aVar.f54552a;
    }

    @Override
    public boolean c(z3.a r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: p4.r.c(z3.a, long):boolean");
    }

    @Override
    public void clear() {
        switch (this.f44795a) {
            case 1:
                ArrayList arrayList = this.f44796b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (obj == null) {
                        try {
                            throw null;
                            break;
                        } catch (Exception e) {
                            sc.j.d.log(Level.WARNING, "could not delete file ", (Throwable) e);
                        }
                    } else {
                        throw new ClassCastException();
                    }
                }
                arrayList.clear();
                return;
            default:
                this.f44796b.clear();
                return;
        }
    }

    @Override
    public long d(long j10) {
        ArrayList arrayList = this.f44796b;
        if (arrayList.isEmpty() || j10 < ((z3.a) arrayList.get(0)).f54553b) {
            return -9223372036854775807L;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            long j11 = ((z3.a) arrayList.get(i10)).f54553b;
            int i11 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
            if (i11 == 0) {
                return j11;
            }
            if (i11 < 0) {
                z3.a aVar = (z3.a) arrayList.get(i10 - 1);
                long j12 = aVar.d;
                if (j12 != -9223372036854775807L && j12 <= j10) {
                    return j12;
                }
                return aVar.f54553b;
            }
        }
        z3.a aVar2 = (z3.a) e9.s.m(arrayList);
        long j13 = aVar2.d;
        if (j13 != -9223372036854775807L && j10 >= j13) {
            return j13;
        }
        return aVar2.f54553b;
    }

    @Override
    public void e(long j10) {
        ArrayList arrayList = this.f44796b;
        int g10 = g(j10);
        if (g10 == 0) {
            return;
        }
        long j11 = ((z3.a) arrayList.get(g10 - 1)).d;
        if (j11 == -9223372036854775807L || j11 >= j10) {
            g10--;
        }
        arrayList.subList(0, g10).clear();
    }

    public s f() {
        if (this.f44796b == null) {
            return s.f44802c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.f44796b);
        return new s(bundle, this.f44796b);
    }

    public int g(long j10) {
        ArrayList arrayList = this.f44796b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (j10 < ((z3.a) arrayList.get(i10)).f54553b) {
                return i10;
            }
        }
        return arrayList.size();
    }
}
