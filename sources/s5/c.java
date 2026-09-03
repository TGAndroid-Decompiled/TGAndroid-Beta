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
import org.telegram.ui.Components.h50;
import r5.d0;
public final class c {
    public long f44114b;
    public final h f44115c;
    public ArrayList d;
    public final SparseIntArray e;
    public final r f44116f;
    public final ArrayList f44117g;
    public final ArrayDeque h;
    public final a7.e f44118i;
    public final h50 f44119j;
    public BasePendingResult f44120k;
    public BasePendingResult f44121l;
    public final Set f44122m = DesugarCollections.synchronizedSet(new HashSet());
    public final u5.b f44113a = new u5.b("MediaQueue", null);

    public c(h hVar) {
        this.f44115c = hVar;
        Math.max(20, 1);
        this.d = new ArrayList();
        this.e = new SparseIntArray();
        this.f44117g = new ArrayList();
        this.h = new ArrayDeque(20);
        this.f44118i = new a7.e(Looper.getMainLooper(), 2);
        this.f44119j = new h50(this, 4);
        hVar.p(new d0(this, 1));
        this.f44116f = new r(this);
        this.f44114b = e();
        d();
    }

    public static void a(c cVar) {
        synchronized (cVar.f44122m) {
            try {
                Iterator it = cVar.f44122m.iterator();
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
        SparseIntArray sparseIntArray = cVar.e;
        sparseIntArray.clear();
        for (int i10 = 0; i10 < cVar.d.size(); i10++) {
            sparseIntArray.put(((Integer) cVar.d.get(i10)).intValue(), i10);
        }
    }

    public final void c() {
        h();
        this.d.clear();
        this.e.clear();
        this.f44116f.evictAll();
        this.f44117g.clear();
        this.f44118i.removeCallbacks(this.f44119j);
        this.h.clear();
        BasePendingResult basePendingResult = this.f44121l;
        if (basePendingResult != null) {
            basePendingResult.c();
            this.f44121l = null;
        }
        BasePendingResult basePendingResult2 = this.f44120k;
        if (basePendingResult2 != null) {
            basePendingResult2.c();
            this.f44120k = null;
        }
        g();
        f();
    }

    public final void d() {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        b6.m.e("Must be called from the main thread.");
        if (this.f44114b != 0 && (basePendingResult = this.f44121l) == null) {
            if (basePendingResult != null) {
                basePendingResult.c();
                this.f44121l = null;
            }
            BasePendingResult basePendingResult3 = this.f44120k;
            if (basePendingResult3 != null) {
                basePendingResult3.c();
                this.f44120k = null;
            }
            h hVar = this.f44115c;
            hVar.getClass();
            b6.m.e("Must be called from the main thread.");
            if (!hVar.w()) {
                basePendingResult2 = h.t();
            } else {
                i iVar = new i(hVar);
                h.x(iVar);
                basePendingResult2 = iVar;
            }
            this.f44121l = basePendingResult2;
            basePendingResult2.i(new q(this, 0));
        }
    }

    public final long e() {
        int i10;
        q5.q e = this.f44115c.e();
        if (e != null) {
            MediaInfo mediaInfo = e.f42876a;
            if (mediaInfo == null) {
                i10 = -1;
            } else {
                i10 = mediaInfo.f2670b;
            }
            int i11 = e.e;
            int i12 = e.f42879f;
            int i13 = e.f42883w;
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
            return e.f42877b;
        }
        return 0L;
    }

    public final void f() {
        synchronized (this.f44122m) {
            try {
                Iterator it = this.f44122m.iterator();
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
        synchronized (this.f44122m) {
            try {
                Iterator it = this.f44122m.iterator();
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
        synchronized (this.f44122m) {
            try {
                Iterator it = this.f44122m.iterator();
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
