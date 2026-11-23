package q2;

import a8.ma;
import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import c8.wb;
import h2.l0;
import h9.i0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.web.z0;
public final class b implements g {
    public final List f55839a;
    public final q f55840b;
    public final jb.m f55841c;
    public final nd0 d;
    public final boolean f55842e;
    public final boolean f55843f;
    public final HashMap f55844g;
    public final h2.k h;
    public final qb.a f55845i;
    public final m2.i f55846j;
    public final ab.q f55847k;
    public final UUID f55848l;
    public final Looper f55849m;
    public final android.support.v4.media.session.q f55850n;
    public final Object f55851o;
    public int f55852p;
    public int f55853q;
    public HandlerThread f55854r;
    public android.support.v4.media.session.f f55855s;
    public k2.b f55856t;
    public f f55857u;
    public byte[] v;
    public byte[] f55858w;
    public o f55859x;
    public aa f55860y;
    public p f55861z;

    public b(UUID uuid, q qVar, jb.m mVar, nd0 nd0Var, List list, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, ab.q qVar2, Looper looper, qb.a aVar, m2.i iVar) {
        this.f55848l = uuid;
        this.f55841c = mVar;
        this.d = nd0Var;
        this.f55840b = qVar;
        this.f55842e = z10;
        this.f55843f = z11;
        if (bArr != null) {
            this.f55858w = bArr;
            this.f55839a = null;
        } else {
            list.getClass();
            this.f55839a = DesugarCollections.unmodifiableList(list);
        }
        this.f55844g = hashMap;
        this.f55847k = qVar2;
        this.h = new h2.k();
        this.f55845i = aVar;
        this.f55846j = iVar;
        this.f55852p = 2;
        this.f55849m = looper;
        this.f55850n = new android.support.v4.media.session.q(this, looper, 8);
        this.f55851o = new Object();
    }

    @Override
    public final UUID a() {
        p();
        return this.f55848l;
    }

    @Override
    public final void b(j jVar) {
        int i7;
        p();
        boolean z10 = false;
        if (this.f55853q < 0) {
            h2.a.c("DefaultDrmSession", "Session reference count less than zero: " + this.f55853q);
            this.f55853q = 0;
        }
        if (jVar != null) {
            h2.k kVar = this.h;
            synchronized (kVar.f13767a) {
                try {
                    ArrayList arrayList = new ArrayList(kVar.d);
                    arrayList.add(jVar);
                    kVar.d = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) kVar.f13768b.get(jVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(kVar.f13769c);
                        hashSet.add(jVar);
                        kVar.f13769c = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    HashMap hashMap = kVar.f13768b;
                    if (num != null) {
                        i7 = num.intValue() + 1;
                    } else {
                        i7 = 1;
                    }
                    hashMap.put(jVar, Integer.valueOf(i7));
                } finally {
                }
            }
        }
        int i10 = this.f55853q + 1;
        this.f55853q = i10;
        if (i10 == 1) {
            if (this.f55852p == 2) {
                z10 = true;
            }
            ma.p(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f55854r = handlerThread;
            handlerThread.start();
            this.f55855s = new android.support.v4.media.session.f(this, this.f55854r.getLooper());
            if (n()) {
                j(true);
            }
        } else if (jVar != null && k() && this.h.f(jVar) == 1) {
            jVar.c(this.f55852p);
        }
        e eVar = (e) this.d.f37766b;
        if (eVar.f55873w != -9223372036854775807L) {
            eVar.E.remove(this);
            Handler handler = eVar.K;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override
    public final void c(j jVar) {
        p();
        int i7 = this.f55853q;
        if (i7 <= 0) {
            h2.a.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i10 = i7 - 1;
        this.f55853q = i10;
        if (i10 == 0) {
            this.f55852p = 0;
            android.support.v4.media.session.q qVar = this.f55850n;
            String str = l0.f13778a;
            qVar.removeCallbacksAndMessages(null);
            this.f55855s.b();
            this.f55855s = null;
            this.f55854r.quit();
            this.f55854r = null;
            this.f55856t = null;
            this.f55857u = null;
            this.f55859x = null;
            synchronized (this.f55851o) {
                this.f55860y = null;
            }
            this.f55861z = null;
            byte[] bArr = this.v;
            if (bArr != null) {
                this.f55840b.r(bArr);
                this.v = null;
            }
        }
        if (jVar != null) {
            this.h.i(jVar);
            if (this.h.f(jVar) == 0) {
                jVar.e();
            }
        }
        nd0 nd0Var = this.d;
        int i11 = this.f55853q;
        e eVar = (e) nd0Var.f37766b;
        if (i11 == 1 && eVar.F > 0 && eVar.f55873w != -9223372036854775807L) {
            eVar.E.add(this);
            Handler handler = eVar.K;
            handler.getClass();
            handler.postAtTime(new z0(this, 4), this, SystemClock.uptimeMillis() + eVar.f55873w);
        } else if (i11 == 0) {
            eVar.f55874x.remove(this);
            if (eVar.H == this) {
                eVar.H = null;
            }
            if (eVar.I == this) {
                eVar.I = null;
            }
            jb.m mVar = eVar.f55870n;
            HashSet hashSet = (HashSet) mVar.f17464b;
            hashSet.remove(this);
            if (((b) mVar.f17465c) == this) {
                mVar.f17465c = null;
                if (!hashSet.isEmpty()) {
                    b bVar = (b) hashSet.iterator().next();
                    mVar.f17465c = bVar;
                    p g10 = bVar.f55840b.g();
                    bVar.f55861z = g10;
                    android.support.v4.media.session.f fVar = bVar.f55855s;
                    String str2 = l0.f13778a;
                    g10.getClass();
                    fVar.getClass();
                    fVar.obtainMessage(1, new a(x2.u.f60365g.getAndIncrement(), true, SystemClock.elapsedRealtime(), g10)).sendToTarget();
                }
            }
            if (eVar.f55873w != -9223372036854775807L) {
                Handler handler2 = eVar.K;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                eVar.E.remove(this);
            }
        }
        eVar.g();
    }

    @Override
    public final boolean d() {
        p();
        return this.f55842e;
    }

    @Override
    public final int e() {
        p();
        return this.f55852p;
    }

    @Override
    public final boolean f(String str) {
        p();
        byte[] bArr = this.v;
        bArr.getClass();
        return this.f55840b.N(str, bArr);
    }

    @Override
    public final f g() {
        p();
        if (this.f55852p == 1) {
            return this.f55857u;
        }
        return null;
    }

    @Override
    public final k2.b h() {
        p();
        return this.f55856t;
    }

    public final void i(h2.j jVar) {
        Set<j> set;
        h2.k kVar = this.h;
        synchronized (kVar.f13767a) {
            set = kVar.f13769c;
        }
        for (j jVar2 : set) {
            jVar.accept(jVar2);
        }
    }

    public final void j(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: q2.b.j(boolean):void");
    }

    public final boolean k() {
        int i7 = this.f55852p;
        if (i7 != 3 && i7 != 4) {
            return false;
        }
        return true;
    }

    public final void l(int i7, Throwable th2) {
        int i10;
        Set<j> set;
        if (th2 instanceof MediaDrm.MediaDrmStateException) {
            i10 = l0.z(l0.A(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
        } else {
            if (!(th2 instanceof MediaDrmResetException)) {
                if (!(th2 instanceof NotProvisionedException) && !wb.b(th2)) {
                    if (th2 instanceof DeniedByServerException) {
                        i10 = 6007;
                    } else if (th2 instanceof x) {
                        i10 = 6001;
                    } else if (th2 instanceof c) {
                        i10 = 6003;
                    } else if (th2 instanceof u) {
                        i10 = 6008;
                    } else if (i7 != 1) {
                        if (i7 == 2) {
                            i10 = 6004;
                        } else if (i7 != 3) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                i10 = 6002;
            }
            i10 = 6006;
        }
        this.f55857u = new f(i10, th2);
        h2.a.d("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            h2.k kVar = this.h;
            synchronized (kVar.f13767a) {
                set = kVar.f13769c;
            }
            for (j jVar : set) {
                jVar.d((Exception) th2);
            }
        } else if (th2 instanceof Error) {
            if (!wb.c(th2) && !wb.b(th2)) {
                throw ((Error) th2);
            }
        } else {
            throw new IllegalStateException("Unexpected Throwable subclass", th2);
        }
        if (this.f55852p != 4) {
            this.f55852p = 1;
        }
    }

    public final void m(Throwable th2, boolean z10) {
        int i7;
        if (!(th2 instanceof NotProvisionedException) && !wb.b(th2)) {
            if (z10) {
                i7 = 1;
            } else {
                i7 = 2;
            }
            l(i7, th2);
            return;
        }
        this.f55841c.O0(this);
    }

    public final boolean n() {
        throw new UnsupportedOperationException("Method not decompiled: q2.b.n():boolean");
    }

    public final void o(int i7, boolean z10, byte[] bArr) {
        try {
            synchronized (this.f55851o) {
                try {
                    this.f55860y = new aa(13);
                    List list = this.f55839a;
                    if (list != null) {
                        i0.q(list);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            o E = this.f55840b.E(bArr, this.f55839a, i7, this.f55844g);
            this.f55859x = E;
            android.support.v4.media.session.f fVar = this.f55855s;
            String str = l0.f13778a;
            E.getClass();
            fVar.getClass();
            fVar.obtainMessage(2, new a(x2.u.f60365g.getAndIncrement(), z10, SystemClock.elapsedRealtime(), E)).sendToTarget();
        } catch (Exception | NoSuchMethodError e10) {
            m(e10, true);
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f55849m;
        if (currentThread != looper.getThread()) {
            h2.a.m("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
