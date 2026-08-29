package q5;

import android.os.Looper;
import android.util.SparseIntArray;
import c2.v0;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.BasePendingResult;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import nh.g2;
import p5.c0;
public final class c {
    public long f46366b;
    public final h f46367c;
    public ArrayList d;
    public final SparseIntArray f46368e;
    public final q f46369f;
    public final ArrayList f46370g;
    public final ArrayDeque h;
    public final v0 f46371i;
    public final g2 f46372j;
    public BasePendingResult f46373k;
    public BasePendingResult f46374l;
    public final Set f46375m = DesugarCollections.synchronizedSet(new HashSet());
    public final s5.b f46365a = new s5.b("MediaQueue", null);

    public c(h hVar) {
        this.f46367c = hVar;
        Math.max(20, 1);
        this.d = new ArrayList();
        this.f46368e = new SparseIntArray();
        this.f46370g = new ArrayList();
        this.h = new ArrayDeque(20);
        this.f46371i = new v0(Looper.getMainLooper(), 1);
        this.f46372j = new g2(this, 4);
        hVar.p(new c0(this, 1));
        this.f46369f = new q(this);
        this.f46366b = e();
        d();
    }

    public static void a(c cVar) {
        synchronized (cVar.f46375m) {
            try {
                Iterator it = cVar.f46375m.iterator();
                if (it.hasNext()) {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void b(c cVar) {
        SparseIntArray sparseIntArray = cVar.f46368e;
        sparseIntArray.clear();
        for (int i10 = 0; i10 < cVar.d.size(); i10++) {
            sparseIntArray.put(((Integer) cVar.d.get(i10)).intValue(), i10);
        }
    }

    public final void c() {
        h();
        this.d.clear();
        this.f46368e.clear();
        this.f46369f.evictAll();
        this.f46370g.clear();
        this.f46371i.removeCallbacks(this.f46372j);
        this.h.clear();
        BasePendingResult basePendingResult = this.f46374l;
        if (basePendingResult != null) {
            basePendingResult.c();
            this.f46374l = null;
        }
        BasePendingResult basePendingResult2 = this.f46373k;
        if (basePendingResult2 != null) {
            basePendingResult2.c();
            this.f46373k = null;
        }
        g();
        f();
    }

    public final void d() {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        z5.l.e("Must be called from the main thread.");
        if (this.f46366b != 0 && (basePendingResult = this.f46374l) == null) {
            if (basePendingResult != null) {
                basePendingResult.c();
                this.f46374l = null;
            }
            BasePendingResult basePendingResult3 = this.f46373k;
            if (basePendingResult3 != null) {
                basePendingResult3.c();
                this.f46373k = null;
            }
            h hVar = this.f46367c;
            hVar.getClass();
            z5.l.e("Must be called from the main thread.");
            if (!hVar.w()) {
                basePendingResult2 = h.t();
            } else {
                i iVar = new i(hVar);
                h.x(iVar);
                basePendingResult2 = iVar;
            }
            this.f46374l = basePendingResult2;
            basePendingResult2.i(new p(this, 0));
        }
    }

    public final long e() {
        int i10;
        o5.q e10 = this.f46367c.e();
        if (e10 != null) {
            MediaInfo mediaInfo = e10.f19312a;
            if (mediaInfo == null) {
                i10 = -1;
            } else {
                i10 = mediaInfo.f3721b;
            }
            int i11 = e10.f19315e;
            int i12 = e10.f19316f;
            int i13 = e10.f19320w;
            if (i11 == 1) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            return 0L;
                        }
                    } else if (i10 != 2) {
                        return 0L;
                    }
                }
                if (i13 == 0) {
                    return 0L;
                }
            }
            return e10.f19313b;
        }
        return 0L;
    }

    public final void f() {
        synchronized (this.f46375m) {
            try {
                Iterator it = this.f46375m.iterator();
                if (it.hasNext()) {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        synchronized (this.f46375m) {
            try {
                Iterator it = this.f46375m.iterator();
                if (it.hasNext()) {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h() {
        synchronized (this.f46375m) {
            try {
                Iterator it = this.f46375m.iterator();
                if (it.hasNext()) {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
