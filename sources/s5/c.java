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
    public long f47051b;
    public final h f47052c;
    public ArrayList d;
    public final SparseIntArray f47053e;
    public final r f47054f;
    public final ArrayList f47055g;
    public final ArrayDeque h;
    public final a7.e f47056i;
    public final i50 f47057j;
    public BasePendingResult f47058k;
    public BasePendingResult f47059l;
    public final Set f47060m = DesugarCollections.synchronizedSet(new HashSet());
    public final u5.b f47050a = new u5.b("MediaQueue", null);

    public c(h hVar) {
        this.f47052c = hVar;
        Math.max(20, 1);
        this.d = new ArrayList();
        this.f47053e = new SparseIntArray();
        this.f47055g = new ArrayList();
        this.h = new ArrayDeque(20);
        this.f47056i = new a7.e(Looper.getMainLooper(), 2);
        this.f47057j = new i50(this, 4);
        hVar.p(new d0(this, 1));
        this.f47054f = new r(this);
        this.f47051b = e();
        d();
    }

    public static void a(c cVar) {
        synchronized (cVar.f47060m) {
            try {
                Iterator it = cVar.f47060m.iterator();
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
        SparseIntArray sparseIntArray = cVar.f47053e;
        sparseIntArray.clear();
        for (int i10 = 0; i10 < cVar.d.size(); i10++) {
            sparseIntArray.put(((Integer) cVar.d.get(i10)).intValue(), i10);
        }
    }

    public final void c() {
        h();
        this.d.clear();
        this.f47053e.clear();
        this.f47054f.evictAll();
        this.f47055g.clear();
        this.f47056i.removeCallbacks(this.f47057j);
        this.h.clear();
        BasePendingResult basePendingResult = this.f47059l;
        if (basePendingResult != null) {
            basePendingResult.c();
            this.f47059l = null;
        }
        BasePendingResult basePendingResult2 = this.f47058k;
        if (basePendingResult2 != null) {
            basePendingResult2.c();
            this.f47058k = null;
        }
        g();
        f();
    }

    public final void d() {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        b6.m.e("Must be called from the main thread.");
        if (this.f47051b != 0 && (basePendingResult = this.f47059l) == null) {
            if (basePendingResult != null) {
                basePendingResult.c();
                this.f47059l = null;
            }
            BasePendingResult basePendingResult3 = this.f47058k;
            if (basePendingResult3 != null) {
                basePendingResult3.c();
                this.f47058k = null;
            }
            h hVar = this.f47052c;
            hVar.getClass();
            b6.m.e("Must be called from the main thread.");
            if (!hVar.w()) {
                basePendingResult2 = h.t();
            } else {
                i iVar = new i(hVar);
                h.x(iVar);
                basePendingResult2 = iVar;
            }
            this.f47059l = basePendingResult2;
            basePendingResult2.i(new q(this, 0));
        }
    }

    public final long e() {
        int i10;
        q5.q e6 = this.f47052c.e();
        if (e6 != null) {
            MediaInfo mediaInfo = e6.f44634a;
            if (mediaInfo == null) {
                i10 = -1;
            } else {
                i10 = mediaInfo.f2612b;
            }
            int i11 = e6.f44637e;
            int i12 = e6.f44638f;
            int i13 = e6.f44642w;
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
            return e6.f44635b;
        }
        return 0L;
    }

    public final void f() {
        synchronized (this.f47060m) {
            try {
                Iterator it = this.f47060m.iterator();
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
        synchronized (this.f47060m) {
            try {
                Iterator it = this.f47060m.iterator();
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
        synchronized (this.f47060m) {
            try {
                Iterator it = this.f47060m.iterator();
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
