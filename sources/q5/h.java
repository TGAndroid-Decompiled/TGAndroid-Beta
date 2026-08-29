package q5;

import android.os.Looper;
import android.text.TextUtils;
import c2.v0;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import l3.g0;
import o5.a0;
import o5.e0;
import o5.f0;
public final class h implements o5.f {
    public static final s5.b f46390k = new s5.b("RemoteMediaClient", null);
    public final Object f46391a;
    public final v0 f46392b;
    public final s5.n f46393c;
    public final g0 d;
    public final c f46394e;
    public f0 f46395f;
    public TaskCompletionSource f46396g;
    public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList f46397i = new CopyOnWriteArrayList();
    public final ConcurrentHashMap f46398j;

    static {
        String str = s5.n.v;
    }

    public h(s5.n nVar) {
        new ConcurrentHashMap();
        this.f46398j = new ConcurrentHashMap();
        this.f46391a = new Object();
        this.f46392b = new v0(Looper.getMainLooper(), 1);
        g0 g0Var = new g0(this);
        this.d = g0Var;
        this.f46393c = nVar;
        nVar.h = new o4.g(this, 13);
        nVar.f47618c = g0Var;
        this.f46394e = new c(this);
    }

    public static u t() {
        u uVar = new u(null, 1);
        uVar.a(new m(new Status(17, null, null, null), 0));
        return uVar;
    }

    public static final void x(n nVar) {
        try {
            nVar.p();
        } catch (IllegalArgumentException e10) {
            throw e10;
        } catch (Throwable unused) {
            nVar.a(new m(new Status(2100, null, null, null), 1));
        }
    }

    public final long a() {
        long o10;
        synchronized (this.f46391a) {
            z5.l.e("Must be called from the main thread.");
            o10 = this.f46393c.o();
        }
        return o10;
    }

    public final int b() {
        int i10;
        synchronized (this.f46391a) {
            try {
                z5.l.e("Must be called from the main thread.");
                o5.q e10 = e();
                if (e10 != null) {
                    i10 = e10.f19316f;
                } else {
                    i10 = 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    public final o5.o c() {
        z5.l.e("Must be called from the main thread.");
        o5.q e10 = e();
        if (e10 == null) {
            return null;
        }
        Integer num = (Integer) e10.J.get(e10.f19320w);
        if (num == null) {
            return null;
        }
        return (o5.o) e10.C.get(num.intValue());
    }

    public final MediaInfo d() {
        MediaInfo mediaInfo;
        synchronized (this.f46391a) {
            z5.l.e("Must be called from the main thread.");
            o5.q qVar = this.f46393c.f47594f;
            if (qVar == null) {
                mediaInfo = null;
            } else {
                mediaInfo = qVar.f19312a;
            }
        }
        return mediaInfo;
    }

    public final o5.q e() {
        o5.q qVar;
        synchronized (this.f46391a) {
            z5.l.e("Must be called from the main thread.");
            qVar = this.f46393c.f47594f;
        }
        return qVar;
    }

    public final int f() {
        int i10;
        synchronized (this.f46391a) {
            try {
                z5.l.e("Must be called from the main thread.");
                o5.q e10 = e();
                if (e10 != null) {
                    i10 = e10.f19315e;
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
        synchronized (this.f46391a) {
            z5.l.e("Must be called from the main thread.");
            o5.q qVar = this.f46393c.f47594f;
            if (qVar == null) {
                mediaInfo = null;
            } else {
                mediaInfo = qVar.f19312a;
            }
            if (mediaInfo != null) {
                j10 = mediaInfo.f3723e;
            } else {
                j10 = 0;
            }
        }
        return j10;
    }

    public final boolean h() {
        z5.l.e("Must be called from the main thread.");
        if (!i()) {
            z5.l.e("Must be called from the main thread.");
            o5.q e10 = e();
            if ((e10 == null || e10.f19315e != 5) && !m() && !l() && !k()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean i() {
        z5.l.e("Must be called from the main thread.");
        o5.q e10 = e();
        if (e10 != null && e10.f19315e == 4) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        z5.l.e("Must be called from the main thread.");
        MediaInfo d = d();
        if (d != null && d.f3721b == 2) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        z5.l.e("Must be called from the main thread.");
        o5.q e10 = e();
        if (e10 != null && e10.f19320w != 0) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        z5.l.e("Must be called from the main thread.");
        o5.q e10 = e();
        if (e10 == null) {
            return false;
        }
        if (e10.f19315e == 3) {
            return true;
        }
        if (!j() || b() != 2) {
            return false;
        }
        return true;
    }

    public final boolean m() {
        z5.l.e("Must be called from the main thread.");
        o5.q e10 = e();
        if (e10 != null && e10.f19315e == 2) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        z5.l.e("Must be called from the main thread.");
        o5.q e10 = e();
        if (e10 != null && e10.D) {
            return true;
        }
        return false;
    }

    public final void o(java.lang.String r47) {
        throw new UnsupportedOperationException("Method not decompiled: q5.h.o(java.lang.String):void");
    }

    public final void p(g gVar) {
        z5.l.e("Must be called from the main thread.");
        if (gVar != null) {
            this.f46397i.add(gVar);
        }
    }

    public final BasePendingResult q(o5.p pVar) {
        z5.l.e("Must be called from the main thread.");
        if (!w()) {
            return t();
        }
        j jVar = new j(this, pVar, 2);
        x(jVar);
        return jVar;
    }

    public final void r() {
        z5.l.e("Must be called from the main thread.");
        int f9 = f();
        if (f9 != 4 && f9 != 2) {
            z5.l.e("Must be called from the main thread.");
            if (!w()) {
                t();
                return;
            } else {
                x(new i(this, 6));
                return;
            }
        }
        z5.l.e("Must be called from the main thread.");
        if (!w()) {
            t();
        } else {
            x(new i(this, 5));
        }
    }

    public final int s() {
        o5.o c3;
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
            if (k() && (c3 = c()) != null && c3.f19304a != null) {
                return 6;
            }
        }
        return 0;
    }

    public final void u() {
        f0 f0Var = this.f46395f;
        if (f0Var == null) {
            return;
        }
        z5.l.e("Must be called from the main thread.");
        String str = this.f46393c.f47617b;
        e0 e0Var = (e0) f0Var;
        s5.a.b(str);
        synchronized (e0Var.C) {
            e0Var.C.put(str, this);
        }
        v b10 = w.b();
        b10.f3928c = new a0(e0Var, str, this);
        b10.f3926a = 8413;
        e0Var.e(1, b10.b());
        z5.l.e("Must be called from the main thread.");
        if (!w()) {
            t();
        } else {
            x(new i(this, 0));
        }
    }

    public final void v(e0 e0Var) {
        o5.f fVar;
        f0 f0Var = this.f46395f;
        if (f0Var != e0Var) {
            if (f0Var != null) {
                this.f46393c.n();
                this.f46394e.c();
                z5.l.e("Must be called from the main thread.");
                String str = this.f46393c.f47617b;
                e0 e0Var2 = (e0) f0Var;
                if (!TextUtils.isEmpty(str)) {
                    synchronized (e0Var2.C) {
                        fVar = (o5.f) e0Var2.C.remove(str);
                    }
                    v b10 = w.b();
                    b10.f3928c = new a0(e0Var2, fVar, str);
                    b10.f3926a = 8414;
                    e0Var2.e(1, b10.b());
                    this.d.f14096b = null;
                    this.f46392b.removeCallbacksAndMessages(null);
                } else {
                    throw new IllegalArgumentException("Channel namespace cannot be null or empty");
                }
            }
            this.f46395f = e0Var;
            if (e0Var != null) {
                this.d.f14096b = e0Var;
            }
        }
    }

    public final boolean w() {
        if (this.f46395f != null) {
            return true;
        }
        return false;
    }
}
