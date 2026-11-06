package v4;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.a8;
public final class q implements Runnable {
    public static final ThreadLocal f57059e = new ThreadLocal();
    public static final c5.b f57060f = new c5.b(9);
    public ArrayList f57061a;
    public long f57062b;
    public long f57063c;
    public ArrayList d;

    public static d1 c(RecyclerView recyclerView, int i7, long j3) {
        int B = recyclerView.f2847e.B();
        for (int i10 = 0; i10 < B; i10++) {
            d1 U = RecyclerView.U(recyclerView.f2847e.A(i10));
            if (U.f56954c == i7 && !U.h()) {
                return null;
            }
        }
        v0 v0Var = recyclerView.f2842b;
        try {
            try {
                recyclerView.h0();
                d1 j10 = v0Var.j(i7, j3);
                if (j10 != null) {
                    if (j10.g() && !j10.h()) {
                        v0Var.g(j10.f56952a);
                    } else {
                        v0Var.a(j10, false);
                    }
                }
                recyclerView.i0(false);
                return j10;
            } catch (Exception e10) {
                a8.g(e10, true);
                org.telegram.messenger.g0.h3(new sg.t0(recyclerView, 23));
                recyclerView.i0(false);
                return null;
            }
        } catch (Throwable th2) {
            recyclerView.i0(false);
            throw th2;
        }
    }

    public final void a(RecyclerView recyclerView, int i7, int i10) {
        if (recyclerView.G && this.f57062b == 0) {
            this.f57062b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        h2.f fVar = recyclerView.f2866t0;
        fVar.f14080a = i7;
        fVar.f14081b = i10;
    }

    public final void b(long j3) {
        p pVar;
        RecyclerView recyclerView;
        long j10;
        RecyclerView recyclerView2;
        p pVar2;
        boolean z9;
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = this.f57061a;
        int size = arrayList2.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i10);
            int windowVisibility = recyclerView3.getWindowVisibility();
            h2.f fVar = recyclerView3.f2866t0;
            if (windowVisibility == 0) {
                fVar.c(recyclerView3, false);
                i7 += fVar.f14082c;
            }
        }
        arrayList.ensureCapacity(i7);
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i12);
            if (recyclerView4.getWindowVisibility() == 0) {
                h2.f fVar2 = recyclerView4.f2866t0;
                int abs = Math.abs(fVar2.f14081b) + Math.abs(fVar2.f14080a);
                for (int i13 = 0; i13 < fVar2.f14082c * 2; i13 += 2) {
                    if (i11 >= arrayList.size()) {
                        Object obj = new Object();
                        arrayList.add(obj);
                        pVar2 = obj;
                    } else {
                        pVar2 = (p) arrayList.get(i11);
                    }
                    int[] iArr = fVar2.d;
                    int i14 = iArr[i13 + 1];
                    if (i14 <= abs) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    pVar2.f57055a = z9;
                    pVar2.f57056b = abs;
                    pVar2.f57057c = i14;
                    pVar2.d = recyclerView4;
                    pVar2.f57058e = iArr[i13];
                    i11++;
                }
            }
        }
        Collections.sort(arrayList, f57060f);
        for (int i15 = 0; i15 < arrayList.size() && (recyclerView = (pVar = (p) arrayList.get(i15)).d) != null; i15++) {
            if (pVar.f57055a) {
                j10 = Long.MAX_VALUE;
            } else {
                j10 = j3;
            }
            d1 c10 = c(recyclerView, pVar.f57058e, j10);
            if (c10 != null && c10.f56953b != null && c10.g() && !c10.h() && (recyclerView2 = (RecyclerView) c10.f56953b.get()) != null) {
                if (recyclerView2.Q && recyclerView2.f2847e.B() != 0) {
                    recyclerView2.p0();
                }
                h2.f fVar3 = recyclerView2.f2866t0;
                fVar3.c(recyclerView2, true);
                if (fVar3.f14082c != 0) {
                    try {
                        int i16 = n0.g.f20122a;
                        Trace.beginSection("RV Nested Prefetch");
                        a1 a1Var = recyclerView2.f2867u0;
                        g0 g0Var = recyclerView2.f2871x;
                        a1Var.d = 1;
                        a1Var.f56909e = g0Var.b();
                        a1Var.f56911g = false;
                        a1Var.h = false;
                        a1Var.f56912i = false;
                        for (int i17 = 0; i17 < fVar3.f14082c * 2; i17 += 2) {
                            c(recyclerView2, fVar3.d[i17], j3);
                        }
                        Trace.endSection();
                        pVar.f57055a = false;
                        pVar.f57056b = 0;
                        pVar.f57057c = 0;
                        pVar.d = null;
                        pVar.f57058e = 0;
                    } catch (Throwable th2) {
                        int i18 = n0.g.f20122a;
                        Trace.endSection();
                        throw th2;
                    }
                }
            }
            pVar.f57055a = false;
            pVar.f57056b = 0;
            pVar.f57057c = 0;
            pVar.d = null;
            pVar.f57058e = 0;
        }
    }

    @Override
    public final void run() {
        ArrayList arrayList = this.f57061a;
        try {
            int i7 = n0.g.f20122a;
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
                    b(TimeUnit.MILLISECONDS.toNanos(j3) + this.f57063c);
                }
            }
            this.f57062b = 0L;
            Trace.endSection();
        } catch (Throwable th2) {
            this.f57062b = 0L;
            int i11 = n0.g.f20122a;
            Trace.endSection();
            throw th2;
        }
    }
}
