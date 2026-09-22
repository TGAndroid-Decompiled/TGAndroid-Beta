package s4;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import rg.q1;
public final class q implements Runnable {
    public static final ThreadLocal e = new ThreadLocal();
    public static final fb.j f43104f = new fb.j(5);
    public ArrayList f43105a;
    public long f43106b;
    public long f43107c;
    public ArrayList d;

    public static c1 c(RecyclerView recyclerView, int i10, long j3) {
        int L = recyclerView.e.L();
        for (int i11 = 0; i11 < L; i11++) {
            c1 V = RecyclerView.V(recyclerView.e.K(i11));
            if (V.f42997c == i10 && !V.h()) {
                return null;
            }
        }
        of.e eVar = recyclerView.f2839b;
        try {
            try {
                recyclerView.h0();
                c1 j10 = eVar.j(i10, j3);
                if (j10 != null) {
                    if (j10.g() && !j10.h()) {
                        eVar.g(j10.f42995a);
                    } else {
                        eVar.a(j10, false);
                    }
                }
                recyclerView.i0(false);
                return j10;
            } catch (Exception e7) {
                FileLog.e(e7);
                AndroidUtilities.runOnUIThread(new q1(recyclerView, 2));
                recyclerView.i0(false);
                return null;
            }
        } catch (Throwable th2) {
            recyclerView.i0(false);
            throw th2;
        }
    }

    public final void a(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.G && this.f43106b == 0) {
            this.f43106b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        a0.h hVar = recyclerView.f2861s0;
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
        ArrayList arrayList2 = this.f43105a;
        int size = arrayList2.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i11);
            int windowVisibility = recyclerView3.getWindowVisibility();
            a0.h hVar = recyclerView3.f2861s0;
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
                a0.h hVar2 = recyclerView4.f2861s0;
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
                    pVar2.f43098a = z10;
                    pVar2.f43099b = abs;
                    pVar2.f43100c = i15;
                    pVar2.d = recyclerView4;
                    pVar2.e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(arrayList, f43104f);
        for (int i16 = 0; i16 < arrayList.size() && (recyclerView = (pVar = (p) arrayList.get(i16)).d) != null; i16++) {
            if (pVar.f43098a) {
                j10 = Long.MAX_VALUE;
            } else {
                j10 = j3;
            }
            c1 c10 = c(recyclerView, pVar.e, j10);
            if (c10 != null && c10.f42996b != null && c10.g() && !c10.h() && (recyclerView2 = (RecyclerView) c10.f42996b.get()) != null) {
                if (recyclerView2.Q && recyclerView2.e.L() != 0) {
                    recyclerView2.p0();
                }
                a0.h hVar3 = recyclerView2.f2861s0;
                hVar3.c(recyclerView2, true);
                if (hVar3.d != 0) {
                    try {
                        int i17 = n0.g.f15090a;
                        Trace.beginSection("RV Nested Prefetch");
                        z0 z0Var = recyclerView2.f2862t0;
                        h0 h0Var = recyclerView2.f2865w;
                        z0Var.d = 1;
                        z0Var.e = h0Var.h();
                        z0Var.f43157g = false;
                        z0Var.h = false;
                        z0Var.f43158i = false;
                        for (int i18 = 0; i18 < hVar3.d * 2; i18 += 2) {
                            c(recyclerView2, ((int[]) hVar3.f16c)[i18], j3);
                        }
                        Trace.endSection();
                        pVar.f43098a = false;
                        pVar.f43099b = 0;
                        pVar.f43100c = 0;
                        pVar.d = null;
                        pVar.e = 0;
                    } catch (Throwable th2) {
                        int i19 = n0.g.f15090a;
                        Trace.endSection();
                        throw th2;
                    }
                }
            }
            pVar.f43098a = false;
            pVar.f43099b = 0;
            pVar.f43100c = 0;
            pVar.d = null;
            pVar.e = 0;
        }
    }

    @Override
    public final void run() {
        ArrayList arrayList = this.f43105a;
        try {
            int i10 = n0.g.f15090a;
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
                    b(TimeUnit.MILLISECONDS.toNanos(j3) + this.f43107c);
                }
            }
            this.f43106b = 0L;
            Trace.endSection();
        } catch (Throwable th2) {
            this.f43106b = 0L;
            int i12 = n0.g.f15090a;
            Trace.endSection();
            throw th2;
        }
    }
}
