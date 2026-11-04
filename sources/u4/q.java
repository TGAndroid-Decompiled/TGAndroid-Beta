package u4;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.a8;
public final class q implements Runnable {
    public static final ThreadLocal f55648e = new ThreadLocal();
    public static final b5.b f55649f = new b5.b(9);
    public ArrayList f55650a;
    public long f55651b;
    public long f55652c;
    public ArrayList d;

    public static d1 c(RecyclerView recyclerView, int i3, long j10) {
        int u10 = recyclerView.f2279e.u();
        for (int i10 = 0; i10 < u10; i10++) {
            d1 U = RecyclerView.U(recyclerView.f2279e.t(i10));
            if (U.f55542c == i3 && !U.h()) {
                return null;
            }
        }
        tf.e eVar = recyclerView.f2274b;
        try {
            try {
                recyclerView.h0();
                d1 j11 = eVar.j(i3, j10);
                if (j11 != null) {
                    if (j11.g() && !j11.h()) {
                        eVar.g(j11.f55540a);
                    } else {
                        eVar.a(j11, false);
                    }
                }
                recyclerView.i0(false);
                return j11;
            } catch (Exception e10) {
                a8.g(e10, true);
                org.telegram.messenger.g0.h3(new r4.u(recyclerView, 13));
                recyclerView.i0(false);
                return null;
            }
        } catch (Throwable th2) {
            recyclerView.i0(false);
            throw th2;
        }
    }

    public final void a(RecyclerView recyclerView, int i3, int i10) {
        if (recyclerView.H && this.f55651b == 0) {
            this.f55651b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        g2.g gVar = recyclerView.f2299u0;
        gVar.f11841a = i3;
        gVar.f11842b = i10;
    }

    public final void b(long j10) {
        p pVar;
        RecyclerView recyclerView;
        long j11;
        RecyclerView recyclerView2;
        p pVar2;
        boolean z10;
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = this.f55650a;
        int size = arrayList2.size();
        int i3 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i10);
            int windowVisibility = recyclerView3.getWindowVisibility();
            g2.g gVar = recyclerView3.f2299u0;
            if (windowVisibility == 0) {
                gVar.c(recyclerView3, false);
                i3 += gVar.f11843c;
            }
        }
        arrayList.ensureCapacity(i3);
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i12);
            if (recyclerView4.getWindowVisibility() == 0) {
                g2.g gVar2 = recyclerView4.f2299u0;
                int abs = Math.abs(gVar2.f11842b) + Math.abs(gVar2.f11841a);
                for (int i13 = 0; i13 < gVar2.f11843c * 2; i13 += 2) {
                    if (i11 >= arrayList.size()) {
                        Object obj = new Object();
                        arrayList.add(obj);
                        pVar2 = obj;
                    } else {
                        pVar2 = (p) arrayList.get(i11);
                    }
                    int[] iArr = gVar2.d;
                    int i14 = iArr[i13 + 1];
                    if (i14 <= abs) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    pVar2.f55641a = z10;
                    pVar2.f55642b = abs;
                    pVar2.f55643c = i14;
                    pVar2.d = recyclerView4;
                    pVar2.f55644e = iArr[i13];
                    i11++;
                }
            }
        }
        Collections.sort(arrayList, f55649f);
        for (int i15 = 0; i15 < arrayList.size() && (recyclerView = (pVar = (p) arrayList.get(i15)).d) != null; i15++) {
            if (pVar.f55641a) {
                j11 = Long.MAX_VALUE;
            } else {
                j11 = j10;
            }
            d1 c2 = c(recyclerView, pVar.f55644e, j11);
            if (c2 != null && c2.f55541b != null && c2.g() && !c2.h() && (recyclerView2 = (RecyclerView) c2.f55541b.get()) != null) {
                if (recyclerView2.R && recyclerView2.f2279e.u() != 0) {
                    recyclerView2.p0();
                }
                g2.g gVar3 = recyclerView2.f2299u0;
                gVar3.c(recyclerView2, true);
                if (gVar3.f11843c != 0) {
                    try {
                        int i16 = n0.g.f20114a;
                        Trace.beginSection("RV Nested Prefetch");
                        a1 a1Var = recyclerView2.f2300v0;
                        h0 h0Var = recyclerView2.f2303x;
                        a1Var.d = 1;
                        a1Var.f55493e = h0Var.b();
                        a1Var.f55495g = false;
                        a1Var.h = false;
                        a1Var.f55496i = false;
                        for (int i17 = 0; i17 < gVar3.f11843c * 2; i17 += 2) {
                            c(recyclerView2, gVar3.d[i17], j10);
                        }
                        Trace.endSection();
                        pVar.f55641a = false;
                        pVar.f55642b = 0;
                        pVar.f55643c = 0;
                        pVar.d = null;
                        pVar.f55644e = 0;
                    } catch (Throwable th2) {
                        int i18 = n0.g.f20114a;
                        Trace.endSection();
                        throw th2;
                    }
                }
            }
            pVar.f55641a = false;
            pVar.f55642b = 0;
            pVar.f55643c = 0;
            pVar.d = null;
            pVar.f55644e = 0;
        }
    }

    @Override
    public final void run() {
        ArrayList arrayList = this.f55650a;
        try {
            int i3 = n0.g.f20114a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j10 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j10 = Math.max(recyclerView.getDrawingTime(), j10);
                    }
                }
                if (j10 != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(j10) + this.f55652c);
                }
            }
            this.f55651b = 0L;
            Trace.endSection();
        } catch (Throwable th2) {
            this.f55651b = 0L;
            int i11 = n0.g.f20114a;
            Trace.endSection();
            throw th2;
        }
    }
}
