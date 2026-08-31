package s5;

import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.BasePendingResult;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.telegram.ui.Components.i50;
import r5.d0;
public final class c {
    public long f47020b;
    public final h f47021c;
    public ArrayList d;
    public final SparseIntArray f47022e;
    public final r f47023f;
    public final ArrayList f47024g;
    public final ArrayDeque h;
    public final a7.e f47025i;
    public final i50 f47026j;
    public BasePendingResult f47027k;
    public BasePendingResult f47028l;
    public final Set f47029m = DesugarCollections.synchronizedSet(new HashSet());
    public final u5.b f47019a = new u5.b("MediaQueue", null);

    public c(h hVar) {
        this.f47021c = hVar;
        Math.max(20, 1);
        this.d = new ArrayList();
        this.f47022e = new SparseIntArray();
        this.f47024g = new ArrayList();
        this.h = new ArrayDeque(20);
        this.f47025i = new a7.e(Looper.getMainLooper(), 2);
        this.f47026j = new i50(this, 4);
        hVar.p(new d0(this, 1));
        this.f47023f = new r(this);
        this.f47020b = e();
        d();
    }

    public static void a(c cVar) {
        synchronized (cVar.f47029m) {
            try {
                Iterator it = cVar.f47029m.iterator();
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
        SparseIntArray sparseIntArray = cVar.f47022e;
        sparseIntArray.clear();
        for (int i10 = 0; i10 < cVar.d.size(); i10++) {
            sparseIntArray.put(((Integer) cVar.d.get(i10)).intValue(), i10);
        }
    }

    public final void c() {
        h();
        this.d.clear();
        this.f47022e.clear();
        this.f47023f.evictAll();
        this.f47024g.clear();
        this.f47025i.removeCallbacks(this.f47026j);
        this.h.clear();
        BasePendingResult basePendingResult = this.f47028l;
        if (basePendingResult != null) {
            basePendingResult.c();
            this.f47028l = null;
        }
        BasePendingResult basePendingResult2 = this.f47027k;
        if (basePendingResult2 != null) {
            basePendingResult2.c();
            this.f47027k = null;
        }
        g();
        f();
    }

    public final void d() {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        b6.m.e("Must be called from the main thread.");
        if (this.f47020b != 0 && (basePendingResult = this.f47028l) == null) {
            if (basePendingResult != null) {
                basePendingResult.c();
                this.f47028l = null;
            }
            BasePendingResult basePendingResult3 = this.f47027k;
            if (basePendingResult3 != null) {
                basePendingResult3.c();
                this.f47027k = null;
            }
            h hVar = this.f47021c;
            hVar.getClass();
            b6.m.e("Must be called from the main thread.");
            if (!hVar.w()) {
                basePendingResult2 = h.t();
            } else {
                i iVar = new i(hVar);
                h.x(iVar);
                basePendingResult2 = iVar;
            }
            this.f47028l = basePendingResult2;
            basePendingResult2.i(new q(this, 0));
        }
    }

    public final long e() {
        int i10;
        q5.q e6 = this.f47021c.e();
        if (e6 != null) {
            MediaInfo mediaInfo = e6.f44603a;
            if (mediaInfo == null) {
                i10 = -1;
            } else {
                i10 = mediaInfo.f2612b;
            }
            int i11 = e6.f44606e;
            int i12 = e6.f44607f;
            int i13 = e6.f44611w;
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
            return e6.f44604b;
        }
        return 0L;
    }

    public final void f() {
        synchronized (this.f47029m) {
            try {
                Iterator it = this.f47029m.iterator();
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
        synchronized (this.f47029m) {
            try {
                Iterator it = this.f47029m.iterator();
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
        synchronized (this.f47029m) {
            try {
                Iterator it = this.f47029m.iterator();
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
