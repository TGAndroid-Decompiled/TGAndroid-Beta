package q2;

import a8.la;
import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import c8.vb;
import h2.l0;
import h9.i0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.qf;
import org.telegram.ui.web.z0;
public final class b implements g {
    public final List f55757a;
    public final q f55758b;
    public final k8.a f55759c;
    public final jn d;
    public final boolean f55760e;
    public final boolean f55761f;
    public final HashMap f55762g;
    public final h2.k h;
    public final qb.a f55763i;
    public final m2.i f55764j;
    public final ab.q f55765k;
    public final UUID f55766l;
    public final Looper f55767m;
    public final android.support.v4.media.session.q f55768n;
    public final Object f55769o;
    public int f55770p;
    public int f55771q;
    public HandlerThread f55772r;
    public android.support.v4.media.session.f f55773s;
    public k2.b f55774t;
    public f f55775u;
    public byte[] v;
    public byte[] f55776w;
    public o f55777x;
    public qf f55778y;
    public p f55779z;

    public b(UUID uuid, q qVar, k8.a aVar, jn jnVar, List list, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, ab.q qVar2, Looper looper, qb.a aVar2, m2.i iVar) {
        this.f55766l = uuid;
        this.f55759c = aVar;
        this.d = jnVar;
        this.f55758b = qVar;
        this.f55760e = z10;
        this.f55761f = z11;
        if (bArr != null) {
            this.f55776w = bArr;
            this.f55757a = null;
        } else {
            list.getClass();
            this.f55757a = DesugarCollections.unmodifiableList(list);
        }
        this.f55762g = hashMap;
        this.f55765k = qVar2;
        this.h = new h2.k();
        this.f55763i = aVar2;
        this.f55764j = iVar;
        this.f55770p = 2;
        this.f55767m = looper;
        this.f55768n = new android.support.v4.media.session.q(this, looper, 8);
        this.f55769o = new Object();
    }

    @Override
    public final UUID a() {
        p();
        return this.f55766l;
    }

    @Override
    public final void b(j jVar) {
        int i7;
        p();
        boolean z10 = false;
        if (this.f55771q < 0) {
            h2.a.c("DefaultDrmSession", "Session reference count less than zero: " + this.f55771q);
            this.f55771q = 0;
        }
        if (jVar != null) {
            h2.k kVar = this.h;
            synchronized (kVar.f13801a) {
                try {
                    ArrayList arrayList = new ArrayList(kVar.d);
                    arrayList.add(jVar);
                    kVar.d = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) kVar.f13802b.get(jVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(kVar.f13803c);
                        hashSet.add(jVar);
                        kVar.f13803c = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    HashMap hashMap = kVar.f13802b;
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
        int i10 = this.f55771q + 1;
        this.f55771q = i10;
        if (i10 == 1) {
            if (this.f55770p == 2) {
                z10 = true;
            }
            la.p(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f55772r = handlerThread;
            handlerThread.start();
            this.f55773s = new android.support.v4.media.session.f(this, this.f55772r.getLooper());
            if (n()) {
                j(true);
            }
        } else if (jVar != null && k() && this.h.f(jVar) == 1) {
            jVar.c(this.f55770p);
        }
        e eVar = (e) this.d.f36572b;
        if (eVar.f55791w != -9223372036854775807L) {
            eVar.E.remove(this);
            Handler handler = eVar.K;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override
    public final void c(j jVar) {
        p();
        int i7 = this.f55771q;
        if (i7 <= 0) {
            h2.a.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i10 = i7 - 1;
        this.f55771q = i10;
        if (i10 == 0) {
            this.f55770p = 0;
            android.support.v4.media.session.q qVar = this.f55768n;
            String str = l0.f13812a;
            qVar.removeCallbacksAndMessages(null);
            this.f55773s.b();
            this.f55773s = null;
            this.f55772r.quit();
            this.f55772r = null;
            this.f55774t = null;
            this.f55775u = null;
            this.f55777x = null;
            synchronized (this.f55769o) {
                this.f55778y = null;
            }
            this.f55779z = null;
            byte[] bArr = this.v;
            if (bArr != null) {
                this.f55758b.x(bArr);
                this.v = null;
            }
        }
        if (jVar != null) {
            this.h.i(jVar);
            if (this.h.f(jVar) == 0) {
                jVar.e();
            }
        }
        jn jnVar = this.d;
        int i11 = this.f55771q;
        e eVar = (e) jnVar.f36572b;
        if (i11 == 1 && eVar.F > 0 && eVar.f55791w != -9223372036854775807L) {
            eVar.E.add(this);
            Handler handler = eVar.K;
            handler.getClass();
            handler.postAtTime(new z0(this, 4), this, SystemClock.uptimeMillis() + eVar.f55791w);
        } else if (i11 == 0) {
            eVar.f55792x.remove(this);
            if (eVar.H == this) {
                eVar.H = null;
            }
            if (eVar.I == this) {
                eVar.I = null;
            }
            k8.a aVar = eVar.f55788n;
            HashSet hashSet = (HashSet) aVar.f18211b;
            hashSet.remove(this);
            if (((b) aVar.f18212c) == this) {
                aVar.f18212c = null;
                if (!hashSet.isEmpty()) {
                    b bVar = (b) hashSet.iterator().next();
                    aVar.f18212c = bVar;
                    p n10 = bVar.f55758b.n();
                    bVar.f55779z = n10;
                    android.support.v4.media.session.f fVar = bVar.f55773s;
                    String str2 = l0.f13812a;
                    n10.getClass();
                    fVar.getClass();
                    fVar.obtainMessage(1, new a(x2.u.f60278g.getAndIncrement(), true, SystemClock.elapsedRealtime(), n10)).sendToTarget();
                }
            }
            if (eVar.f55791w != -9223372036854775807L) {
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
        return this.f55760e;
    }

    @Override
    public final int e() {
        p();
        return this.f55770p;
    }

    @Override
    public final boolean f(String str) {
        p();
        byte[] bArr = this.v;
        bArr.getClass();
        return this.f55758b.O(str, bArr);
    }

    @Override
    public final f g() {
        p();
        if (this.f55770p == 1) {
            return this.f55775u;
        }
        return null;
    }

    @Override
    public final k2.b h() {
        p();
        return this.f55774t;
    }

    public final void i(h2.j jVar) {
        Set<j> set;
        h2.k kVar = this.h;
        synchronized (kVar.f13801a) {
            set = kVar.f13803c;
        }
        for (j jVar2 : set) {
            jVar.accept(jVar2);
        }
    }

    public final void j(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: q2.b.j(boolean):void");
    }

    public final boolean k() {
        int i7 = this.f55770p;
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
                if (!(th2 instanceof NotProvisionedException) && !vb.b(th2)) {
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
        this.f55775u = new f(i10, th2);
        h2.a.d("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            h2.k kVar = this.h;
            synchronized (kVar.f13801a) {
                set = kVar.f13803c;
            }
            for (j jVar : set) {
                jVar.d((Exception) th2);
            }
        } else if (th2 instanceof Error) {
            if (!vb.c(th2) && !vb.b(th2)) {
                throw ((Error) th2);
            }
        } else {
            throw new IllegalStateException("Unexpected Throwable subclass", th2);
        }
        if (this.f55770p != 4) {
            this.f55770p = 1;
        }
    }

    public final void m(Throwable th2, boolean z10) {
        int i7;
        if (!(th2 instanceof NotProvisionedException) && !vb.b(th2)) {
            if (z10) {
                i7 = 1;
            } else {
                i7 = 2;
            }
            l(i7, th2);
            return;
        }
        this.f55759c.S0(this);
    }

    public final boolean n() {
        throw new UnsupportedOperationException("Method not decompiled: q2.b.n():boolean");
    }

    public final void o(int i7, boolean z10, byte[] bArr) {
        try {
            synchronized (this.f55769o) {
                try {
                    this.f55778y = new qf(11);
                    List list = this.f55757a;
                    if (list != null) {
                        i0.q(list);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            o G = this.f55758b.G(bArr, this.f55757a, i7, this.f55762g);
            this.f55777x = G;
            android.support.v4.media.session.f fVar = this.f55773s;
            String str = l0.f13812a;
            G.getClass();
            fVar.getClass();
            fVar.obtainMessage(2, new a(x2.u.f60278g.getAndIncrement(), z10, SystemClock.elapsedRealtime(), G)).sendToTarget();
        } catch (Exception | NoSuchMethodError e10) {
            m(e10, true);
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f55767m;
        if (currentThread != looper.getThread()) {
            h2.a.m("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
