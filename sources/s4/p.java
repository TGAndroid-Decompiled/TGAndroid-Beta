package s4;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.f8;
import ph.x1;
public final class p implements Runnable {
    public static final ThreadLocal e = new ThreadLocal();
    public static final lc.s f47995f = new lc.s(4);
    public ArrayList f47996a;
    public long f47997b;
    public long f47998c;
    public ArrayList d;

    public static c1 c(RecyclerView recyclerView, int i10, long j10) {
        int r10 = recyclerView.e.r();
        for (int i11 = 0; i11 < r10; i11++) {
            c1 U = RecyclerView.U(recyclerView.e.q(i11));
            if (U.f47900c == i10 && !U.h()) {
                return null;
            }
        }
        hf.e eVar = recyclerView.f1894b;
        try {
            try {
                recyclerView.h0();
                c1 j11 = eVar.j(i10, j10);
                if (j11 != null) {
                    if (j11.g() && !j11.h()) {
                        eVar.g(j11.f47898a);
                    } else {
                        eVar.a(j11, false);
                    }
                }
                recyclerView.i0(false);
                return j11;
            } catch (Exception e7) {
                f8.g(e7, true);
                org.telegram.messenger.i0.g3(new x1(recyclerView, 28));
                recyclerView.i0(false);
                return null;
            }
        } catch (Throwable th2) {
            recyclerView.i0(false);
            throw th2;
        }
    }

    public final void a(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.G && this.f47997b == 0) {
            this.f47997b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        e2.f fVar = recyclerView.f1917t0;
        fVar.f6135a = i10;
        fVar.f6136b = i11;
    }

    public final void b(long j10) {
        o oVar;
        RecyclerView recyclerView;
        long j11;
        RecyclerView recyclerView2;
        o oVar2;
        boolean z10;
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = this.f47996a;
        int size = arrayList2.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i11);
            int windowVisibility = recyclerView3.getWindowVisibility();
            e2.f fVar = recyclerView3.f1917t0;
            if (windowVisibility == 0) {
                fVar.c(recyclerView3, false);
                i10 += fVar.f6137c;
            }
        }
        arrayList.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i13);
            if (recyclerView4.getWindowVisibility() == 0) {
                e2.f fVar2 = recyclerView4.f1917t0;
                int abs = Math.abs(fVar2.f6136b) + Math.abs(fVar2.f6135a);
                for (int i14 = 0; i14 < fVar2.f6137c * 2; i14 += 2) {
                    if (i12 >= arrayList.size()) {
                        Object obj = new Object();
                        arrayList.add(obj);
                        oVar2 = obj;
                    } else {
                        oVar2 = (o) arrayList.get(i12);
                    }
                    int[] iArr = fVar2.d;
                    int i15 = iArr[i14 + 1];
                    if (i15 <= abs) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    oVar2.f47989a = z10;
                    oVar2.f47990b = abs;
                    oVar2.f47991c = i15;
                    oVar2.d = recyclerView4;
                    oVar2.e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(arrayList, f47995f);
        for (int i16 = 0; i16 < arrayList.size() && (recyclerView = (oVar = (o) arrayList.get(i16)).d) != null; i16++) {
            if (oVar.f47989a) {
                j11 = Long.MAX_VALUE;
            } else {
                j11 = j10;
            }
            c1 c10 = c(recyclerView, oVar.e, j11);
            if (c10 != null && c10.f47899b != null && c10.g() && !c10.h() && (recyclerView2 = (RecyclerView) c10.f47899b.get()) != null) {
                if (recyclerView2.Q && recyclerView2.e.r() != 0) {
                    recyclerView2.p0();
                }
                e2.f fVar3 = recyclerView2.f1917t0;
                fVar3.c(recyclerView2, true);
                if (fVar3.f6137c != 0) {
                    try {
                        int i17 = n0.g.f13407a;
                        Trace.beginSection("RV Nested Prefetch");
                        z0 z0Var = recyclerView2.f1918u0;
                        g0 g0Var = recyclerView2.f1922x;
                        z0Var.d = 1;
                        z0Var.e = g0Var.b();
                        z0Var.f48057g = false;
                        z0Var.h = false;
                        z0Var.f48058i = false;
                        for (int i18 = 0; i18 < fVar3.f6137c * 2; i18 += 2) {
                            c(recyclerView2, fVar3.d[i18], j10);
                        }
                        Trace.endSection();
                        oVar.f47989a = false;
                        oVar.f47990b = 0;
                        oVar.f47991c = 0;
                        oVar.d = null;
                        oVar.e = 0;
                    } catch (Throwable th2) {
                        int i19 = n0.g.f13407a;
                        Trace.endSection();
                        throw th2;
                    }
                }
            }
            oVar.f47989a = false;
            oVar.f47990b = 0;
            oVar.f47991c = 0;
            oVar.d = null;
            oVar.e = 0;
        }
    }

    @Override
    public final void run() {
        ArrayList arrayList = this.f47996a;
        try {
            int i10 = n0.g.f13407a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i11);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j10 = Math.max(recyclerView.getDrawingTime(), j10);
                    }
                }
                if (j10 != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(j10) + this.f47998c);
                }
            }
            this.f47997b = 0L;
            Trace.endSection();
        } catch (Throwable th2) {
            this.f47997b = 0L;
            int i12 = n0.g.f13407a;
            Trace.endSection();
            throw th2;
        }
    }
}
