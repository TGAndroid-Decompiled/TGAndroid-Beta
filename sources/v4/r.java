package v4;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.a8;
import ug.u1;
public final class r implements Runnable {
    public static final ThreadLocal f59350e = new ThreadLocal();
    public static final c5.b f59351f = new c5.b(9);
    public ArrayList f59352a;
    public long f59353b;
    public long f59354c;
    public ArrayList d;

    public static f1 c(RecyclerView recyclerView, int i7, long j3) {
        int F = recyclerView.f2767e.F();
        for (int i10 = 0; i10 < F; i10++) {
            f1 U = RecyclerView.U(recyclerView.f2767e.E(i10));
            if (U.f59247c == i7 && !U.h()) {
                return null;
            }
        }
        x0 x0Var = recyclerView.f2762b;
        try {
            try {
                recyclerView.h0();
                f1 j10 = x0Var.j(i7, j3);
                if (j10 != null) {
                    if (j10.g() && !j10.h()) {
                        x0Var.g(j10.f59245a);
                    } else {
                        x0Var.a(j10, false);
                    }
                }
                recyclerView.i0(false);
                return j10;
            } catch (Exception e10) {
                a8.g(e10, true);
                org.telegram.messenger.g0.g3(new u1(recyclerView, 1));
                recyclerView.i0(false);
                return null;
            }
        } catch (Throwable th2) {
            recyclerView.i0(false);
            throw th2;
        }
    }

    public final void a(RecyclerView recyclerView, int i7, int i10) {
        if (recyclerView.H && this.f59353b == 0) {
            this.f59353b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        h2.f fVar = recyclerView.f2787u0;
        fVar.f13747a = i7;
        fVar.f13748b = i10;
    }

    public final void b(long j3) {
        q qVar;
        RecyclerView recyclerView;
        long j10;
        RecyclerView recyclerView2;
        q qVar2;
        boolean z10;
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = this.f59352a;
        int size = arrayList2.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i10);
            int windowVisibility = recyclerView3.getWindowVisibility();
            h2.f fVar = recyclerView3.f2787u0;
            if (windowVisibility == 0) {
                fVar.c(recyclerView3, false);
                i7 += fVar.f13749c;
            }
        }
        arrayList.ensureCapacity(i7);
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i12);
            if (recyclerView4.getWindowVisibility() == 0) {
                h2.f fVar2 = recyclerView4.f2787u0;
                int abs = Math.abs(fVar2.f13748b) + Math.abs(fVar2.f13747a);
                for (int i13 = 0; i13 < fVar2.f13749c * 2; i13 += 2) {
                    if (i11 >= arrayList.size()) {
                        Object obj = new Object();
                        arrayList.add(obj);
                        qVar2 = obj;
                    } else {
                        qVar2 = (q) arrayList.get(i11);
                    }
                    int[] iArr = fVar2.d;
                    int i14 = iArr[i13 + 1];
                    if (i14 <= abs) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    qVar2.f59343a = z10;
                    qVar2.f59344b = abs;
                    qVar2.f59345c = i14;
                    qVar2.d = recyclerView4;
                    qVar2.f59346e = iArr[i13];
                    i11++;
                }
            }
        }
        Collections.sort(arrayList, f59351f);
        for (int i15 = 0; i15 < arrayList.size() && (recyclerView = (qVar = (q) arrayList.get(i15)).d) != null; i15++) {
            if (qVar.f59343a) {
                j10 = Long.MAX_VALUE;
            } else {
                j10 = j3;
            }
            f1 c10 = c(recyclerView, qVar.f59346e, j10);
            if (c10 != null && c10.f59246b != null && c10.g() && !c10.h() && (recyclerView2 = (RecyclerView) c10.f59246b.get()) != null) {
                if (recyclerView2.R && recyclerView2.f2767e.F() != 0) {
                    recyclerView2.p0();
                }
                h2.f fVar3 = recyclerView2.f2787u0;
                fVar3.c(recyclerView2, true);
                if (fVar3.f13749c != 0) {
                    try {
                        int i16 = n0.g.f21146a;
                        Trace.beginSection("RV Nested Prefetch");
                        c1 c1Var = recyclerView2.f2788v0;
                        i0 i0Var = recyclerView2.f2791x;
                        c1Var.d = 1;
                        c1Var.f59213e = i0Var.b();
                        c1Var.f59215g = false;
                        c1Var.h = false;
                        c1Var.f59216i = false;
                        for (int i17 = 0; i17 < fVar3.f13749c * 2; i17 += 2) {
                            c(recyclerView2, fVar3.d[i17], j3);
                        }
                        Trace.endSection();
                        qVar.f59343a = false;
                        qVar.f59344b = 0;
                        qVar.f59345c = 0;
                        qVar.d = null;
                        qVar.f59346e = 0;
                    } catch (Throwable th2) {
                        int i18 = n0.g.f21146a;
                        Trace.endSection();
                        throw th2;
                    }
                }
            }
            qVar.f59343a = false;
            qVar.f59344b = 0;
            qVar.f59345c = 0;
            qVar.d = null;
            qVar.f59346e = 0;
        }
    }

    @Override
    public final void run() {
        ArrayList arrayList = this.f59352a;
        try {
            int i7 = n0.g.f21146a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j3 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j3 = Math.max(recyclerView.getDrawingTime(), j3);
                    }
                }
                if (j3 != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(j3) + this.f59354c);
                }
            }
            this.f59353b = 0L;
            Trace.endSection();
        } catch (Throwable th2) {
            this.f59353b = 0L;
            int i11 = n0.g.f21146a;
            Trace.endSection();
            throw th2;
        }
    }
}
