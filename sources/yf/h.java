package yf;

import android.os.Looper;
import android.util.SparseArray;
import android.view.Choreographer;
import java.util.LinkedHashSet;
public final class h implements Choreographer.FrameCallback {
    public static h f47101s;
    public final Choreographer f47102a;
    public final LinkedHashSet f47103b;
    public final SparseArray f47104c;
    public final pe.b d;
    public final pe.b e;
    public final pe.b f47105f;
    public long h;
    public long f47106n;
    public int f47107r;

    public h() {
        Choreographer choreographer = Choreographer.getInstance();
        this.f47102a = choreographer;
        this.f47103b = new LinkedHashSet();
        this.f47104c = new SparseArray();
        this.d = new pe.b();
        this.e = new pe.b();
        this.f47105f = new pe.b();
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
        if (f47101s == null) {
            f47101s = new h();
        }
        return f47101s;
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
        throw new UnsupportedOperationException("Method not decompiled: yf.h.doFrame(long):void");
    }

    public final f e(int i10) {
        int i11;
        SparseArray sparseArray = this.f47104c;
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
                SparseArray sparseArray = this.f47104c;
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
                SparseArray sparseArray = this.f47104c;
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
                SparseArray sparseArray = this.f47104c;
                if (i10 < sparseArray.size()) {
                    pe.b bVar = ((f) sparseArray.valueAt(i10)).f47096f;
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
