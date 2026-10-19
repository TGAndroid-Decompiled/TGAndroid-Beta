package s4;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.web.z1;
public final class q implements Runnable {
    public static final ThreadLocal e = new ThreadLocal();
    public static final gb.i f46020f = new gb.i(5);
    public ArrayList f46021a;
    public long f46022b;
    public long f46023c;
    public ArrayList d;

    public static b1 c(RecyclerView recyclerView, int i10, long j10) {
        int L = recyclerView.e.L();
        for (int i11 = 0; i11 < L; i11++) {
            b1 U = RecyclerView.U(recyclerView.e.K(i11));
            if (U.f45912c == i10 && !U.h()) {
                return null;
            }
        }
        qf.e eVar = recyclerView.f3605b;
        try {
            try {
                recyclerView.g0();
                b1 j11 = eVar.j(i10, j10);
                if (j11 != null) {
                    if (j11.g() && !j11.h()) {
                        eVar.g(j11.f45910a);
                    } else {
                        eVar.a(j11, false);
                    }
                }
                recyclerView.h0(false);
                return j11;
            } catch (Exception e7) {
                FileLog.e(e7);
                AndroidUtilities.runOnUIThread(new z1(recyclerView, 20));
                recyclerView.h0(false);
                return null;
            }
        } catch (Throwable th2) {
            recyclerView.h0(false);
            throw th2;
        }
    }

    public final void a(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.G && this.f46022b == 0) {
            this.f46022b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        e2.f fVar = recyclerView.f3628t0;
        fVar.f8223a = i10;
        fVar.f8224b = i11;
    }

    public final void b(long j10) {
        p pVar;
        RecyclerView recyclerView;
        long j11;
        RecyclerView recyclerView2;
        p pVar2;
        boolean z10;
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = this.f46021a;
        int size = arrayList2.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i11);
            int windowVisibility = recyclerView3.getWindowVisibility();
            e2.f fVar = recyclerView3.f3628t0;
            if (windowVisibility == 0) {
                fVar.c(recyclerView3, false);
                i10 += fVar.d;
            }
        }
        arrayList.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i13);
            if (recyclerView4.getWindowVisibility() == 0) {
                e2.f fVar2 = recyclerView4.f3628t0;
                int abs = Math.abs(fVar2.f8224b) + Math.abs(fVar2.f8223a);
                for (int i14 = 0; i14 < fVar2.d * 2; i14 += 2) {
                    if (i12 >= arrayList.size()) {
                        Object obj = new Object();
                        arrayList.add(obj);
                        pVar2 = obj;
                    } else {
                        pVar2 = (p) arrayList.get(i12);
                    }
                    int[] iArr = (int[]) fVar2.f8225c;
                    int i15 = iArr[i14 + 1];
                    if (i15 <= abs) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    pVar2.f46017a = z10;
                    pVar2.f46018b = abs;
                    pVar2.f46019c = i15;
                    pVar2.d = recyclerView4;
                    pVar2.e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(arrayList, f46020f);
        for (int i16 = 0; i16 < arrayList.size() && (recyclerView = (pVar = (p) arrayList.get(i16)).d) != null; i16++) {
            if (pVar.f46017a) {
                j11 = Long.MAX_VALUE;
            } else {
                j11 = j10;
            }
            b1 c10 = c(recyclerView, pVar.e, j11);
            if (c10 != null && c10.f45911b != null && c10.g() && !c10.h() && (recyclerView2 = (RecyclerView) c10.f45911b.get()) != null) {
                if (recyclerView2.Q && recyclerView2.e.L() != 0) {
                    recyclerView2.o0();
                }
                e2.f fVar3 = recyclerView2.f3628t0;
                fVar3.c(recyclerView2, true);
                if (fVar3.d != 0) {
                    try {
                        int i17 = n0.g.f17002a;
                        Trace.beginSection("RV Nested Prefetch");
                        y0 y0Var = recyclerView2.f3629u0;
                        g0 g0Var = recyclerView2.f3631w;
                        y0Var.d = 1;
                        y0Var.e = g0Var.h();
                        y0Var.f46070g = false;
                        y0Var.h = false;
                        y0Var.f46071i = false;
                        for (int i18 = 0; i18 < fVar3.d * 2; i18 += 2) {
                            c(recyclerView2, ((int[]) fVar3.f8225c)[i18], j10);
                        }
                        Trace.endSection();
                        pVar.f46017a = false;
                        pVar.f46018b = 0;
                        pVar.f46019c = 0;
                        pVar.d = null;
                        pVar.e = 0;
                    } catch (Throwable th2) {
                        int i19 = n0.g.f17002a;
                        Trace.endSection();
                        throw th2;
                    }
                }
            }
            pVar.f46017a = false;
            pVar.f46018b = 0;
            pVar.f46019c = 0;
            pVar.d = null;
            pVar.e = 0;
        }
    }

    @Override
    public final void run() {
        ArrayList arrayList = this.f46021a;
        try {
            int i10 = n0.g.f17002a;
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
                    b(TimeUnit.MILLISECONDS.toNanos(j10) + this.f46023c);
                }
            }
            this.f46022b = 0L;
            Trace.endSection();
        } catch (Throwable th2) {
            this.f46022b = 0L;
            int i12 = n0.g.f17002a;
            Trace.endSection();
            throw th2;
        }
    }
}
