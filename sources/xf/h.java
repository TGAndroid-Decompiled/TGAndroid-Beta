package xf;

import android.os.Looper;
import android.util.SparseArray;
import android.view.Choreographer;
import java.util.LinkedHashSet;
public final class h implements Choreographer.FrameCallback {
    public static h f45137s;
    public final Choreographer f45138a;
    public final LinkedHashSet f45139b;
    public final SparseArray f45140c;
    public final pe.b d;
    public final pe.b e;
    public final pe.b f45141f;
    public long h;
    public long f45142n;
    public int f45143r;

    public h() {
        Choreographer choreographer = Choreographer.getInstance();
        this.f45138a = choreographer;
        this.f45139b = new LinkedHashSet();
        this.f45140c = new SparseArray();
        this.d = new pe.b(true);
        this.e = new pe.b(true);
        this.f45141f = new pe.b(true);
        choreographer.postFrameCallback(this);
    }

    public static void c() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("Choreographer60FpsContent must be used on the main thread");
    }

    public static h d() {
        c();
        if (f45137s == null) {
            f45137s = new h();
        }
        return f45137s;
    }

    public final void a(int i10, Runnable runnable) {
        c();
        if (runnable == null) {
            return;
        }
        int max = Math.max(1, Math.min(i10, 60));
        f(runnable);
        e(max).e.add(runnable);
    }

    public final void b(g gVar, int i10) {
        c();
        int max = Math.max(1, Math.min(i10, 60));
        g(gVar);
        e(max).d.add(gVar);
    }

    @Override
    public final void doFrame(long r10) {
        throw new UnsupportedOperationException("Method not decompiled: xf.h.doFrame(long):void");
    }

    public final f e(int i10) {
        int i11;
        SparseArray sparseArray = this.f45140c;
        f fVar = (f) sparseArray.get(i10);
        if (fVar == null) {
            long j3 = 1000000000 / i10;
            if (60 % i10 == 0) {
                i11 = 60 / i10;
            } else {
                i11 = 0;
            }
            f fVar2 = new f(j3, i11);
            sparseArray.put(i10, fVar2);
            return fVar2;
        }
        return fVar;
    }

    public final void f(Runnable runnable) {
        c();
        if (runnable != null) {
            int i10 = 0;
            while (true) {
                SparseArray sparseArray = this.f45140c;
                if (i10 < sparseArray.size() && !((f) sparseArray.valueAt(i10)).e.remove(runnable)) {
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void g(g gVar) {
        c();
        if (gVar != null) {
            int i10 = 0;
            while (true) {
                SparseArray sparseArray = this.f45140c;
                if (i10 < sparseArray.size() && !((f) sparseArray.valueAt(i10)).d.remove(gVar)) {
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void h(Runnable runnable) {
        c();
        if (runnable != null) {
            int i10 = 0;
            while (true) {
                SparseArray sparseArray = this.f45140c;
                if (i10 < sparseArray.size()) {
                    pe.b bVar = ((f) sparseArray.valueAt(i10)).f45134f;
                    if (bVar == null || !bVar.remove(runnable)) {
                        i10++;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }
}
