package s4;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class q implements Runnable {
    public static final ThreadLocal e = new ThreadLocal();
    public static final fb.i f41719f = new fb.i(5);
    public ArrayList f41720a;
    public long f41721b;
    public long f41722c;
    public ArrayList d;

    public static c1 c(RecyclerView recyclerView, int i10, long j3) {
        int K = recyclerView.e.K();
        for (int i11 = 0; i11 < K; i11++) {
            c1 U = RecyclerView.U(recyclerView.e.J(i11));
            if (U.f41612c == i10 && !U.h()) {
                return null;
            }
        }
        of.e eVar = recyclerView.f1532b;
        try {
            try {
                recyclerView.g0();
                c1 j10 = eVar.j(i10, j3);
                if (j10 != null) {
                    if (j10.g() && !j10.h()) {
                        eVar.g(j10.f41610a);
                    } else {
                        eVar.a(j10, false);
                    }
                }
                recyclerView.h0(false);
                return j10;
            } catch (Exception e7) {
                FileLog.e(e7);
                AndroidUtilities.runOnUIThread(new qg.q0(recyclerView, 8));
                recyclerView.h0(false);
                return null;
            }
        } catch (Throwable th2) {
            recyclerView.h0(false);
            throw th2;
        }
    }

    public final void a(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.G && this.f41721b == 0) {
            this.f41721b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        a0.h hVar = recyclerView.f1554s0;
        hVar.f14a = i10;
        hVar.f15b = i11;
    }

    public final void b(long j3) {
        p pVar;
        RecyclerView recyclerView;
        long j10;
        RecyclerView recyclerView2;
        p pVar2;
        boolean z10;
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = this.f41720a;
        int size = arrayList2.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i11);
            int windowVisibility = recyclerView3.getWindowVisibility();
            a0.h hVar = recyclerView3.f1554s0;
            if (windowVisibility == 0) {
                hVar.c(recyclerView3, false);
                i10 += hVar.d;
            }
        }
        arrayList.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i13);
            if (recyclerView4.getWindowVisibility() == 0) {
                a0.h hVar2 = recyclerView4.f1554s0;
                int abs = Math.abs(hVar2.f15b) + Math.abs(hVar2.f14a);
                for (int i14 = 0; i14 < hVar2.d * 2; i14 += 2) {
                    if (i12 >= arrayList.size()) {
                        Object obj = new Object();
                        arrayList.add(obj);
                        pVar2 = obj;
                    } else {
                        pVar2 = (p) arrayList.get(i12);
                    }
                    int[] iArr = (int[]) hVar2.f16c;
                    int i15 = iArr[i14 + 1];
                    if (i15 <= abs) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    pVar2.f41713a = z10;
                    pVar2.f41714b = abs;
                    pVar2.f41715c = i15;
                    pVar2.d = recyclerView4;
                    pVar2.e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(arrayList, f41719f);
        for (int i16 = 0; i16 < arrayList.size() && (recyclerView = (pVar = (p) arrayList.get(i16)).d) != null; i16++) {
            if (pVar.f41713a) {
                j10 = Long.MAX_VALUE;
            } else {
                j10 = j3;
            }
            c1 c10 = c(recyclerView, pVar.e, j10);
            if (c10 != null && c10.f41611b != null && c10.g() && !c10.h() && (recyclerView2 = (RecyclerView) c10.f41611b.get()) != null) {
                if (recyclerView2.Q && recyclerView2.e.K() != 0) {
                    recyclerView2.o0();
                }
                a0.h hVar3 = recyclerView2.f1554s0;
                hVar3.c(recyclerView2, true);
                if (hVar3.d != 0) {
                    try {
                        int i17 = n0.g.f13682a;
                        Trace.beginSection("RV Nested Prefetch");
                        z0 z0Var = recyclerView2.f1555t0;
                        h0 h0Var = recyclerView2.f1558w;
                        z0Var.d = 1;
                        z0Var.e = h0Var.h();
                        z0Var.f41772g = false;
                        z0Var.h = false;
                        z0Var.f41773i = false;
                        for (int i18 = 0; i18 < hVar3.d * 2; i18 += 2) {
                            c(recyclerView2, ((int[]) hVar3.f16c)[i18], j3);
                        }
                        Trace.endSection();
                        pVar.f41713a = false;
                        pVar.f41714b = 0;
                        pVar.f41715c = 0;
                        pVar.d = null;
                        pVar.e = 0;
                    } catch (Throwable th2) {
                        int i19 = n0.g.f13682a;
                        Trace.endSection();
                        throw th2;
                    }
                }
            }
            pVar.f41713a = false;
            pVar.f41714b = 0;
            pVar.f41715c = 0;
            pVar.d = null;
            pVar.e = 0;
        }
    }

    @Override
    public final void run() {
        ArrayList arrayList = this.f41720a;
        try {
            int i10 = n0.g.f13682a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j3 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i11);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j3 = Math.max(recyclerView.getDrawingTime(), j3);
                    }
                }
                if (j3 != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(j3) + this.f41722c);
                }
            }
            this.f41721b = 0L;
            Trace.endSection();
        } catch (Throwable th2) {
            this.f41721b = 0L;
            int i12 = n0.g.f13682a;
            Trace.endSection();
            throw th2;
        }
    }
}
