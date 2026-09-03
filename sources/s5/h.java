package s5;

import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.web.e0;
import q5.a0;
import q5.f0;
import q5.g0;
public final class h implements q5.f {
    public static final u5.b f47075k = new u5.b("RemoteMediaClient", null);
    public final Object f47076a;
    public final a7.e f47077b;
    public final u5.n f47078c;
    public final m d;
    public final c f47079e;
    public g0 f47080f;
    public TaskCompletionSource f47081g;
    public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList f47082i = new CopyOnWriteArrayList();
    public final ConcurrentHashMap f47083j;

    static {
        String str = u5.n.v;
    }

    public h(u5.n nVar) {
        new ConcurrentHashMap();
        this.f47083j = new ConcurrentHashMap();
        this.f47076a = new Object();
        this.f47077b = new a7.e(Looper.getMainLooper(), 2);
        m mVar = new m(this);
        this.d = mVar;
        this.f47078c = nVar;
        nVar.h = new e0(this, 10);
        nVar.f48423c = mVar;
        this.f47079e = new c(this);
    }

    public static u t() {
        u uVar = new u(null, 1);
        uVar.a(new n(new Status(17, null, null, null), 0));
        return uVar;
    }

    public static final void x(o oVar) {
        try {
            oVar.p();
        } catch (IllegalArgumentException e6) {
            throw e6;
        } catch (Throwable unused) {
            oVar.a(new n(new Status(2100, null, null, null), 1));
        }
    }

    public final long a() {
        long o10;
        synchronized (this.f47076a) {
            b6.m.e("Must be called from the main thread.");
            o10 = this.f47078c.o();
        }
        return o10;
    }

    public final int b() {
        int i10;
        synchronized (this.f47076a) {
            try {
                b6.m.e("Must be called from the main thread.");
                q5.q e6 = e();
                if (e6 != null) {
                    i10 = e6.f44638f;
                } else {
                    i10 = 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    public final q5.o c() {
        b6.m.e("Must be called from the main thread.");
        q5.q e6 = e();
        if (e6 == null) {
            return null;
        }
        Integer num = (Integer) e6.K.get(e6.f44642w);
        if (num == null) {
            return null;
        }
        return (q5.o) e6.D.get(num.intValue());
    }

    public final MediaInfo d() {
        MediaInfo mediaInfo;
        synchronized (this.f47076a) {
            b6.m.e("Must be called from the main thread.");
            q5.q qVar = this.f47078c.f48399f;
            if (qVar == null) {
                mediaInfo = null;
            } else {
                mediaInfo = qVar.f44634a;
            }
        }
        return mediaInfo;
    }

    public final q5.q e() {
        q5.q qVar;
        synchronized (this.f47076a) {
            b6.m.e("Must be called from the main thread.");
            qVar = this.f47078c.f48399f;
        }
        return qVar;
    }

    public final int f() {
        int i10;
        synchronized (this.f47076a) {
            try {
                b6.m.e("Must be called from the main thread.");
                q5.q e6 = e();
                if (e6 != null) {
                    i10 = e6.f44637e;
                } else {
                    i10 = 1;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    public final long g() {
        MediaInfo mediaInfo;
        long j10;
        synchronized (this.f47076a) {
            b6.m.e("Must be called from the main thread.");
            q5.q qVar = this.f47078c.f48399f;
            if (qVar == null) {
                mediaInfo = null;
            } else {
                mediaInfo = qVar.f44634a;
            }
            if (mediaInfo != null) {
                j10 = mediaInfo.f2614e;
            } else {
                j10 = 0;
            }
        }
        return j10;
    }

    public final boolean h() {
        b6.m.e("Must be called from the main thread.");
        if (!i()) {
            b6.m.e("Must be called from the main thread.");
            q5.q e6 = e();
            if ((e6 == null || e6.f44637e != 5) && !m() && !l() && !k()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean i() {
        b6.m.e("Must be called from the main thread.");
        q5.q e6 = e();
        if (e6 != null && e6.f44637e == 4) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        b6.m.e("Must be called from the main thread.");
        MediaInfo d = d();
        if (d != null && d.f2612b == 2) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        b6.m.e("Must be called from the main thread.");
        q5.q e6 = e();
        if (e6 != null && e6.f44642w != 0) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        b6.m.e("Must be called from the main thread.");
        q5.q e6 = e();
        if (e6 == null) {
            return false;
        }
        if (e6.f44637e == 3) {
            return true;
        }
        if (!j() || b() != 2) {
            return false;
        }
        return true;
    }

    public final boolean m() {
        b6.m.e("Must be called from the main thread.");
        q5.q e6 = e();
        if (e6 != null && e6.f44637e == 2) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        b6.m.e("Must be called from the main thread.");
        q5.q e6 = e();
        if (e6 != null && e6.E) {
            return true;
        }
        return false;
    }

    public final void o(java.lang.String r47) {
        throw new UnsupportedOperationException("Method not decompiled: s5.h.o(java.lang.String):void");
    }

    public final void p(g gVar) {
        b6.m.e("Must be called from the main thread.");
        if (gVar != null) {
            this.f47082i.add(gVar);
        }
    }

    public final BasePendingResult q(q5.p pVar) {
        b6.m.e("Must be called from the main thread.");
        if (!w()) {
            return t();
        }
        j jVar = new j(this, pVar, 2);
        x(jVar);
        return jVar;
    }

    public final void r() {
        b6.m.e("Must be called from the main thread.");
        int f10 = f();
        if (f10 != 4 && f10 != 2) {
            b6.m.e("Must be called from the main thread.");
            if (!w()) {
                t();
                return;
            } else {
                x(new i(this, 6));
                return;
            }
        }
        b6.m.e("Must be called from the main thread.");
        if (!w()) {
            t();
        } else {
            x(new i(this, 5));
        }
    }

    public final int s() {
        q5.o c3;
        if (d() != null && h()) {
            if (i()) {
                return 6;
            }
            if (m()) {
                return 3;
            }
            if (l()) {
                return 2;
            }
            if (k() && (c3 = c()) != null && c3.f44626a != null) {
                return 6;
            }
        }
        return 0;
    }

    public final void u() {
        g0 g0Var = this.f47080f;
        if (g0Var == null) {
            return;
        }
        b6.m.e("Must be called from the main thread.");
        String str = this.f47078c.f48422b;
        f0 f0Var = (f0) g0Var;
        u5.a.b(str);
        synchronized (f0Var.C) {
            f0Var.C.put(str, this);
        }
        v e6 = w.e();
        e6.f2824c = new a0(f0Var, str, this);
        e6.f2822a = 8413;
        f0Var.e(1, e6.e());
        b6.m.e("Must be called from the main thread.");
        if (!w()) {
            t();
        } else {
            x(new i(this, 0));
        }
    }

    public final void v(f0 f0Var) {
        q5.f fVar;
        g0 g0Var = this.f47080f;
        if (g0Var != f0Var) {
            if (g0Var != null) {
                this.f47078c.n();
                this.f47079e.c();
                b6.m.e("Must be called from the main thread.");
                String str = this.f47078c.f48422b;
                f0 f0Var2 = (f0) g0Var;
                if (!TextUtils.isEmpty(str)) {
                    synchronized (f0Var2.C) {
                        fVar = (q5.f) f0Var2.C.remove(str);
                    }
                    v e6 = w.e();
                    e6.f2824c = new a0(f0Var2, fVar, str);
                    e6.f2822a = 8414;
                    f0Var2.e(1, e6.e());
                    this.d.f47093b = null;
                    this.f47077b.removeCallbacksAndMessages(null);
                } else {
                    throw new IllegalArgumentException("Channel namespace cannot be null or empty");
                }
            }
            this.f47080f = f0Var;
            if (f0Var != null) {
                this.d.f47093b = f0Var;
            }
        }
    }

    public final boolean w() {
        if (this.f47080f != null) {
            return true;
        }
        return false;
    }
}
