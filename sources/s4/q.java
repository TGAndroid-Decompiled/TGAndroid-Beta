package s4;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import rg.x1;
public final class q implements Runnable {
    public static final ThreadLocal f47819e = new ThreadLocal();
    public static final fb.i f47820f = new fb.i(5);
    public ArrayList f47821a;
    public long f47822b;
    public long f47823c;
    public ArrayList d;

    public static d1 c(RecyclerView recyclerView, int i10, long j3) {
        int M = recyclerView.f3145e.M();
        for (int i11 = 0; i11 < M; i11++) {
            d1 U = RecyclerView.U(recyclerView.f3145e.L(i11));
            if (U.f47704c == i10 && !U.h()) {
                return null;
            }
        }
        pf.e eVar = recyclerView.f3140b;
        try {
            try {
                recyclerView.g0();
                d1 j10 = eVar.j(i10, j3);
                if (j10 != null) {
                    if (j10.g() && !j10.h()) {
                        eVar.g(j10.f47702a);
                    } else {
                        eVar.a(j10, false);
                    }
                }
                recyclerView.h0(false);
                return j10;
            } catch (Exception e7) {
                FileLog.e(e7);
                AndroidUtilities.runOnUIThread(new x1(recyclerView, 1));
                recyclerView.h0(false);
                return null;
            }
        } catch (Throwable th2) {
            recyclerView.h0(false);
            throw th2;
        }
    }

    public final void a(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.G && this.f47822b == 0) {
            this.f47822b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        a0.h hVar = recyclerView.f3164t0;
        hVar.f16a = i10;
        hVar.f17b = i11;
    }

    public final void b(long j3) {
        p pVar;
        RecyclerView recyclerView;
        long j10;
        RecyclerView recyclerView2;
        p pVar2;
        boolean z10;
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = this.f47821a;
        int size = arrayList2.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i11);
            int windowVisibility = recyclerView3.getWindowVisibility();
            a0.h hVar = recyclerView3.f3164t0;
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
                a0.h hVar2 = recyclerView4.f3164t0;
                int abs = Math.abs(hVar2.f17b) + Math.abs(hVar2.f16a);
                for (int i14 = 0; i14 < hVar2.d * 2; i14 += 2) {
                    if (i12 >= arrayList.size()) {
                        Object obj = new Object();
                        arrayList.add(obj);
                        pVar2 = obj;
                    } else {
                        pVar2 = (p) arrayList.get(i12);
                    }
                    int[] iArr = (int[]) hVar2.f18c;
                    int i15 = iArr[i14 + 1];
                    if (i15 <= abs) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    pVar2.f47803a = z10;
                    pVar2.f47804b = abs;
                    pVar2.f47805c = i15;
                    pVar2.d = recyclerView4;
                    pVar2.f47806e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(arrayList, f47820f);
        for (int i16 = 0; i16 < arrayList.size() && (recyclerView = (pVar = (p) arrayList.get(i16)).d) != null; i16++) {
            if (pVar.f47803a) {
                j10 = Long.MAX_VALUE;
            } else {
                j10 = j3;
            }
            d1 c10 = c(recyclerView, pVar.f47806e, j10);
            if (c10 != null && c10.f47703b != null && c10.g() && !c10.h() && (recyclerView2 = (RecyclerView) c10.f47703b.get()) != null) {
                if (recyclerView2.Q && recyclerView2.f3145e.M() != 0) {
                    recyclerView2.o0();
                }
                a0.h hVar3 = recyclerView2.f3164t0;
                hVar3.c(recyclerView2, true);
                if (hVar3.d != 0) {
                    try {
                        int i17 = n0.g.f16468a;
                        Trace.beginSection("RV Nested Prefetch");
                        a1 a1Var = recyclerView2.f3165u0;
                        i0 i0Var = recyclerView2.f3167w;
                        a1Var.d = 1;
                        a1Var.f47655e = i0Var.h();
                        a1Var.f47657g = false;
                        a1Var.h = false;
                        a1Var.f47658i = false;
                        for (int i18 = 0; i18 < hVar3.d * 2; i18 += 2) {
                            c(recyclerView2, ((int[]) hVar3.f18c)[i18], j3);
                        }
                        Trace.endSection();
                        pVar.f47803a = false;
                        pVar.f47804b = 0;
                        pVar.f47805c = 0;
                        pVar.d = null;
                        pVar.f47806e = 0;
                    } catch (Throwable th2) {
                        int i19 = n0.g.f16468a;
                        Trace.endSection();
                        throw th2;
                    }
                }
            }
            pVar.f47803a = false;
            pVar.f47804b = 0;
            pVar.f47805c = 0;
            pVar.d = null;
            pVar.f47806e = 0;
        }
    }

    @Override
    public final void run() {
        ArrayList arrayList = this.f47821a;
        try {
            int i10 = n0.g.f16468a;
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
                    b(TimeUnit.MILLISECONDS.toNanos(j3) + this.f47823c);
                }
            }
            this.f47822b = 0L;
            Trace.endSection();
        } catch (Throwable th2) {
            this.f47822b = 0L;
            int i12 = n0.g.f16468a;
            Trace.endSection();
            throw th2;
        }
    }
}
