package v4;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.a8;
public final class q implements Runnable {
    public static final ThreadLocal f59215e = new ThreadLocal();
    public static final c5.b f59216f = new c5.b(9);
    public ArrayList f59217a;
    public long f59218b;
    public long f59219c;
    public ArrayList d;

    public static e1 c(RecyclerView recyclerView, int i7, long j3) {
        int z10 = recyclerView.f2766e.z();
        for (int i10 = 0; i10 < z10; i10++) {
            e1 U = RecyclerView.U(recyclerView.f2766e.y(i10));
            if (U.f59113c == i7 && !U.h()) {
                return null;
            }
        }
        w0 w0Var = recyclerView.f2761b;
        try {
            try {
                recyclerView.h0();
                e1 j10 = w0Var.j(i7, j3);
                if (j10 != null) {
                    if (j10.g() && !j10.h()) {
                        w0Var.g(j10.f59111a);
                    } else {
                        w0Var.a(j10, false);
                    }
                }
                recyclerView.i0(false);
                return j10;
            } catch (Exception e10) {
                a8.g(e10, true);
                org.telegram.messenger.g0.g3(new org.telegram.ui.web.i1(recyclerView, 29));
                recyclerView.i0(false);
                return null;
            }
        } catch (Throwable th2) {
            recyclerView.i0(false);
            throw th2;
        }
    }

    public final void a(RecyclerView recyclerView, int i7, int i10) {
        if (recyclerView.H && this.f59218b == 0) {
            this.f59218b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        h2.f fVar = recyclerView.f2786u0;
        fVar.f13747a = i7;
        fVar.f13748b = i10;
    }

    public final void b(long j3) {
        p pVar;
        RecyclerView recyclerView;
        long j10;
        RecyclerView recyclerView2;
        p pVar2;
        boolean z10;
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = this.f59217a;
        int size = arrayList2.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i10);
            int windowVisibility = recyclerView3.getWindowVisibility();
            h2.f fVar = recyclerView3.f2786u0;
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
                h2.f fVar2 = recyclerView4.f2786u0;
                int abs = Math.abs(fVar2.f13748b) + Math.abs(fVar2.f13747a);
                for (int i13 = 0; i13 < fVar2.f13749c * 2; i13 += 2) {
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
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    pVar2.f59208a = z10;
                    pVar2.f59209b = abs;
                    pVar2.f59210c = i14;
                    pVar2.d = recyclerView4;
                    pVar2.f59211e = iArr[i13];
                    i11++;
                }
            }
        }
        Collections.sort(arrayList, f59216f);
        for (int i15 = 0; i15 < arrayList.size() && (recyclerView = (pVar = (p) arrayList.get(i15)).d) != null; i15++) {
            if (pVar.f59208a) {
                j10 = Long.MAX_VALUE;
            } else {
                j10 = j3;
            }
            e1 c10 = c(recyclerView, pVar.f59211e, j10);
            if (c10 != null && c10.f59112b != null && c10.g() && !c10.h() && (recyclerView2 = (RecyclerView) c10.f59112b.get()) != null) {
                if (recyclerView2.R && recyclerView2.f2766e.z() != 0) {
                    recyclerView2.p0();
                }
                h2.f fVar3 = recyclerView2.f2786u0;
                fVar3.c(recyclerView2, true);
                if (fVar3.f13749c != 0) {
                    try {
                        int i16 = n0.g.f21050a;
                        Trace.beginSection("RV Nested Prefetch");
                        b1 b1Var = recyclerView2.f2787v0;
                        h0 h0Var = recyclerView2.f2790x;
                        b1Var.d = 1;
                        b1Var.f59078e = h0Var.b();
                        b1Var.f59080g = false;
                        b1Var.h = false;
                        b1Var.f59081i = false;
                        for (int i17 = 0; i17 < fVar3.f13749c * 2; i17 += 2) {
                            c(recyclerView2, fVar3.d[i17], j3);
                        }
                        Trace.endSection();
                        pVar.f59208a = false;
                        pVar.f59209b = 0;
                        pVar.f59210c = 0;
                        pVar.d = null;
                        pVar.f59211e = 0;
                    } catch (Throwable th2) {
                        int i18 = n0.g.f21050a;
                        Trace.endSection();
                        throw th2;
                    }
                }
            }
            pVar.f59208a = false;
            pVar.f59209b = 0;
            pVar.f59210c = 0;
            pVar.d = null;
            pVar.f59211e = 0;
        }
    }

    @Override
    public final void run() {
        ArrayList arrayList = this.f59217a;
        try {
            int i7 = n0.g.f21050a;
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
                    b(TimeUnit.MILLISECONDS.toNanos(j3) + this.f59219c);
                }
            }
            this.f59218b = 0L;
            Trace.endSection();
        } catch (Throwable th2) {
            this.f59218b = 0L;
            int i11 = n0.g.f21050a;
            Trace.endSection();
            throw th2;
        }
    }
}
