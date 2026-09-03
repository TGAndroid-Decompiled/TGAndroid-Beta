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
import q5.a0;
import q5.f0;
import q5.g0;
public final class h implements q5.f {
    public static final u5.b f44136k = new u5.b("RemoteMediaClient", null);
    public final Object f44137a;
    public final a7.e f44138b;
    public final u5.n f44139c;
    public final m d;
    public final c e;
    public g0 f44140f;
    public TaskCompletionSource f44141g;
    public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList f44142i = new CopyOnWriteArrayList();
    public final ConcurrentHashMap f44143j;

    static {
        String str = u5.n.v;
    }

    public h(u5.n nVar) {
        new ConcurrentHashMap();
        this.f44143j = new ConcurrentHashMap();
        this.f44137a = new Object();
        this.f44138b = new a7.e(Looper.getMainLooper(), 2);
        m mVar = new m(this);
        this.d = mVar;
        this.f44139c = nVar;
        nVar.h = new o3.c(this, 18);
        nVar.f45195c = mVar;
        this.e = new c(this);
    }

    public static u t() {
        u uVar = new u(null, 1);
        uVar.a(new n(new Status(17, null, null, null), 0));
        return uVar;
    }

    public static final void x(o oVar) {
        try {
            oVar.p();
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Throwable unused) {
            oVar.a(new n(new Status(2100, null, null, null), 1));
        }
    }

    public final long a() {
        long o10;
        synchronized (this.f44137a) {
            b6.m.e("Must be called from the main thread.");
            o10 = this.f44139c.o();
        }
        return o10;
    }

    public final int b() {
        int i10;
        synchronized (this.f44137a) {
            try {
                b6.m.e("Must be called from the main thread.");
                q5.q e = e();
                if (e != null) {
                    i10 = e.f42879f;
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
        q5.q e = e();
        if (e == null) {
            return null;
        }
        Integer num = (Integer) e.K.get(e.f42883w);
        if (num == null) {
            return null;
        }
        return (q5.o) e.D.get(num.intValue());
    }

    public final MediaInfo d() {
        MediaInfo mediaInfo;
        synchronized (this.f44137a) {
            b6.m.e("Must be called from the main thread.");
            q5.q qVar = this.f44139c.f45172f;
            if (qVar == null) {
                mediaInfo = null;
            } else {
                mediaInfo = qVar.f42876a;
            }
        }
        return mediaInfo;
    }

    public final q5.q e() {
        q5.q qVar;
        synchronized (this.f44137a) {
            b6.m.e("Must be called from the main thread.");
            qVar = this.f44139c.f45172f;
        }
        return qVar;
    }

    public final int f() {
        int i10;
        synchronized (this.f44137a) {
            try {
                b6.m.e("Must be called from the main thread.");
                q5.q e = e();
                if (e != null) {
                    i10 = e.e;
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
        synchronized (this.f44137a) {
            b6.m.e("Must be called from the main thread.");
            q5.q qVar = this.f44139c.f45172f;
            if (qVar == null) {
                mediaInfo = null;
            } else {
                mediaInfo = qVar.f42876a;
            }
            if (mediaInfo != null) {
                j10 = mediaInfo.e;
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
            q5.q e = e();
            if ((e == null || e.e != 5) && !m() && !l() && !k()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean i() {
        b6.m.e("Must be called from the main thread.");
        q5.q e = e();
        if (e != null && e.e == 4) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        b6.m.e("Must be called from the main thread.");
        MediaInfo d = d();
        if (d != null && d.f2670b == 2) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        b6.m.e("Must be called from the main thread.");
        q5.q e = e();
        if (e != null && e.f42883w != 0) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        b6.m.e("Must be called from the main thread.");
        q5.q e = e();
        if (e == null) {
            return false;
        }
        if (e.e == 3) {
            return true;
        }
        if (!j() || b() != 2) {
            return false;
        }
        return true;
    }

    public final boolean m() {
        b6.m.e("Must be called from the main thread.");
        q5.q e = e();
        if (e != null && e.e == 2) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        b6.m.e("Must be called from the main thread.");
        q5.q e = e();
        if (e != null && e.E) {
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
            this.f44142i.add(gVar);
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
            if (k() && (c3 = c()) != null && c3.f42869a != null) {
                return 6;
            }
        }
        return 0;
    }

    public final void u() {
        g0 g0Var = this.f44140f;
        if (g0Var == null) {
            return;
        }
        b6.m.e("Must be called from the main thread.");
        String str = this.f44139c.f45194b;
        f0 f0Var = (f0) g0Var;
        u5.a.b(str);
        synchronized (f0Var.C) {
            f0Var.C.put(str, this);
        }
        v e = w.e();
        e.f2868c = new a0(f0Var, str, this);
        e.f2866a = 8413;
        f0Var.e(1, e.e());
        b6.m.e("Must be called from the main thread.");
        if (!w()) {
            t();
        } else {
            x(new i(this, 0));
        }
    }

    public final void v(f0 f0Var) {
        q5.f fVar;
        g0 g0Var = this.f44140f;
        if (g0Var != f0Var) {
            if (g0Var != null) {
                this.f44139c.n();
                this.e.c();
                b6.m.e("Must be called from the main thread.");
                String str = this.f44139c.f45194b;
                f0 f0Var2 = (f0) g0Var;
                if (!TextUtils.isEmpty(str)) {
                    synchronized (f0Var2.C) {
                        fVar = (q5.f) f0Var2.C.remove(str);
                    }
                    v e = w.e();
                    e.f2868c = new a0(f0Var2, fVar, str);
                    e.f2866a = 8414;
                    f0Var2.e(1, e.e());
                    this.d.f44153b = null;
                    this.f44138b.removeCallbacksAndMessages(null);
                } else {
                    throw new IllegalArgumentException("Channel namespace cannot be null or empty");
                }
            }
            this.f44140f = f0Var;
            if (f0Var != null) {
                this.d.f44153b = f0Var;
            }
        }
    }

    public final boolean w() {
        if (this.f44140f != null) {
            return true;
        }
        return false;
    }
}
