package s4;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class r implements Runnable {
    public static final ThreadLocal e = new ThreadLocal();
    public static final a5.b f47832f = new a5.b(7);
    public ArrayList f47833a;
    public long f47834b;
    public long f47835c;
    public ArrayList d;

    public static e1 c(RecyclerView recyclerView, int i10, long j10) {
        int o10 = recyclerView.e.o();
        for (int i11 = 0; i11 < o10; i11++) {
            e1 U = RecyclerView.U(recyclerView.e.n(i11));
            if (U.f47737c == i10 && !U.h()) {
                return null;
            }
        }
        rf.e eVar = recyclerView.f3056b;
        try {
            try {
                recyclerView.h0();
                e1 j11 = eVar.j(i10, j10);
                if (j11 != null) {
                    if (j11.g() && !j11.h()) {
                        eVar.g(j11.f47735a);
                    } else {
                        eVar.a(j11, false);
                    }
                }
                recyclerView.i0(false);
                return j11;
            } catch (Exception e10) {
                FileLog.e(e10);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.h1(recyclerView, 14));
                recyclerView.i0(false);
                return null;
            }
        } catch (Throwable th2) {
            recyclerView.i0(false);
            throw th2;
        }
    }

    public final void a(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.G && this.f47834b == 0) {
            this.f47834b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        e2.f fVar = recyclerView.f3079t0;
        fVar.f9656a = i10;
        fVar.f9657b = i11;
    }

    public final void b(long j10) {
        q qVar;
        RecyclerView recyclerView;
        long j11;
        RecyclerView recyclerView2;
        q qVar2;
        boolean z10;
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = this.f47833a;
        int size = arrayList2.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i11);
            int windowVisibility = recyclerView3.getWindowVisibility();
            e2.f fVar = recyclerView3.f3079t0;
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
                e2.f fVar2 = recyclerView4.f3079t0;
                int abs = Math.abs(fVar2.f9657b) + Math.abs(fVar2.f9656a);
                for (int i14 = 0; i14 < fVar2.d * 2; i14 += 2) {
                    if (i12 >= arrayList.size()) {
                        Object obj = new Object();
                        arrayList.add(obj);
                        qVar2 = obj;
                    } else {
                        qVar2 = (q) arrayList.get(i12);
                    }
                    int[] iArr = (int[]) fVar2.f9658c;
                    int i15 = iArr[i14 + 1];
                    if (i15 <= abs) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    qVar2.f47826a = z10;
                    qVar2.f47827b = abs;
                    qVar2.f47828c = i15;
                    qVar2.d = recyclerView4;
                    qVar2.e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(arrayList, f47832f);
        for (int i16 = 0; i16 < arrayList.size() && (recyclerView = (qVar = (q) arrayList.get(i16)).d) != null; i16++) {
            if (qVar.f47826a) {
                j11 = Long.MAX_VALUE;
            } else {
                j11 = j10;
            }
            e1 c10 = c(recyclerView, qVar.e, j11);
            if (c10 != null && c10.f47736b != null && c10.g() && !c10.h() && (recyclerView2 = (RecyclerView) c10.f47736b.get()) != null) {
                if (recyclerView2.Q && recyclerView2.e.o() != 0) {
                    recyclerView2.p0();
                }
                e2.f fVar3 = recyclerView2.f3079t0;
                fVar3.c(recyclerView2, true);
                if (fVar3.d != 0) {
                    try {
                        int i17 = n0.g.f18571a;
                        Trace.beginSection("RV Nested Prefetch");
                        b1 b1Var = recyclerView2.f3080u0;
                        h0 h0Var = recyclerView2.f3082w;
                        b1Var.d = 1;
                        b1Var.e = h0Var.h();
                        b1Var.f47695g = false;
                        b1Var.h = false;
                        b1Var.f47696i = false;
                        for (int i18 = 0; i18 < fVar3.d * 2; i18 += 2) {
                            c(recyclerView2, ((int[]) fVar3.f9658c)[i18], j10);
                        }
                        Trace.endSection();
                        qVar.f47826a = false;
                        qVar.f47827b = 0;
                        qVar.f47828c = 0;
                        qVar.d = null;
                        qVar.e = 0;
                    } catch (Throwable th2) {
                        int i19 = n0.g.f18571a;
                        Trace.endSection();
                        throw th2;
                    }
                }
            }
            qVar.f47826a = false;
            qVar.f47827b = 0;
            qVar.f47828c = 0;
            qVar.d = null;
            qVar.e = 0;
        }
    }

    @Override
    public final void run() {
        ArrayList arrayList = this.f47833a;
        try {
            int i10 = n0.g.f18571a;
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
                    b(TimeUnit.MILLISECONDS.toNanos(j10) + this.f47835c);
                }
            }
            this.f47834b = 0L;
            Trace.endSection();
        } catch (Throwable th2) {
            this.f47834b = 0L;
            int i12 = n0.g.f18571a;
            Trace.endSection();
            throw th2;
        }
    }
}
