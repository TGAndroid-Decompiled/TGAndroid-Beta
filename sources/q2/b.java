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
    public final List f55761a;
    public final q f55762b;
    public final k8.a f55763c;
    public final jn d;
    public final boolean f55764e;
    public final boolean f55765f;
    public final HashMap f55766g;
    public final h2.k h;
    public final qb.a f55767i;
    public final m2.i f55768j;
    public final ab.q f55769k;
    public final UUID f55770l;
    public final Looper f55771m;
    public final android.support.v4.media.session.q f55772n;
    public final Object f55773o;
    public int f55774p;
    public int f55775q;
    public HandlerThread f55776r;
    public android.support.v4.media.session.f f55777s;
    public k2.b f55778t;
    public f f55779u;
    public byte[] v;
    public byte[] f55780w;
    public o f55781x;
    public qf f55782y;
    public p f55783z;

    public b(UUID uuid, q qVar, k8.a aVar, jn jnVar, List list, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, ab.q qVar2, Looper looper, qb.a aVar2, m2.i iVar) {
        this.f55770l = uuid;
        this.f55763c = aVar;
        this.d = jnVar;
        this.f55762b = qVar;
        this.f55764e = z10;
        this.f55765f = z11;
        if (bArr != null) {
            this.f55780w = bArr;
            this.f55761a = null;
        } else {
            list.getClass();
            this.f55761a = DesugarCollections.unmodifiableList(list);
        }
        this.f55766g = hashMap;
        this.f55769k = qVar2;
        this.h = new h2.k();
        this.f55767i = aVar2;
        this.f55768j = iVar;
        this.f55774p = 2;
        this.f55771m = looper;
        this.f55772n = new android.support.v4.media.session.q(this, looper, 8);
        this.f55773o = new Object();
    }

    @Override
    public final UUID a() {
        p();
        return this.f55770l;
    }

    @Override
    public final void b(j jVar) {
        int i7;
        p();
        boolean z10 = false;
        if (this.f55775q < 0) {
            h2.a.c("DefaultDrmSession", "Session reference count less than zero: " + this.f55775q);
            this.f55775q = 0;
        }
        if (jVar != null) {
            h2.k kVar = this.h;
            synchronized (kVar.f13804a) {
                try {
                    ArrayList arrayList = new ArrayList(kVar.d);
                    arrayList.add(jVar);
                    kVar.d = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) kVar.f13805b.get(jVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(kVar.f13806c);
                        hashSet.add(jVar);
                        kVar.f13806c = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    HashMap hashMap = kVar.f13805b;
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
        int i10 = this.f55775q + 1;
        this.f55775q = i10;
        if (i10 == 1) {
            if (this.f55774p == 2) {
                z10 = true;
            }
            la.p(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f55776r = handlerThread;
            handlerThread.start();
            this.f55777s = new android.support.v4.media.session.f(this, this.f55776r.getLooper());
            if (n()) {
                j(true);
            }
        } else if (jVar != null && k() && this.h.f(jVar) == 1) {
            jVar.c(this.f55774p);
        }
        e eVar = (e) this.d.f36566b;
        if (eVar.f55795w != -9223372036854775807L) {
            eVar.E.remove(this);
            Handler handler = eVar.K;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override
    public final void c(j jVar) {
        p();
        int i7 = this.f55775q;
        if (i7 <= 0) {
            h2.a.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i10 = i7 - 1;
        this.f55775q = i10;
        if (i10 == 0) {
            this.f55774p = 0;
            android.support.v4.media.session.q qVar = this.f55772n;
            String str = l0.f13815a;
            qVar.removeCallbacksAndMessages(null);
            this.f55777s.b();
            this.f55777s = null;
            this.f55776r.quit();
            this.f55776r = null;
            this.f55778t = null;
            this.f55779u = null;
            this.f55781x = null;
            synchronized (this.f55773o) {
                this.f55782y = null;
            }
            this.f55783z = null;
            byte[] bArr = this.v;
            if (bArr != null) {
                this.f55762b.x(bArr);
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
        int i11 = this.f55775q;
        e eVar = (e) jnVar.f36566b;
        if (i11 == 1 && eVar.F > 0 && eVar.f55795w != -9223372036854775807L) {
            eVar.E.add(this);
            Handler handler = eVar.K;
            handler.getClass();
            handler.postAtTime(new z0(this, 4), this, SystemClock.uptimeMillis() + eVar.f55795w);
        } else if (i11 == 0) {
            eVar.f55796x.remove(this);
            if (eVar.H == this) {
                eVar.H = null;
            }
            if (eVar.I == this) {
                eVar.I = null;
            }
            k8.a aVar = eVar.f55792n;
            HashSet hashSet = (HashSet) aVar.f18214b;
            hashSet.remove(this);
            if (((b) aVar.f18215c) == this) {
                aVar.f18215c = null;
                if (!hashSet.isEmpty()) {
                    b bVar = (b) hashSet.iterator().next();
                    aVar.f18215c = bVar;
                    p n10 = bVar.f55762b.n();
                    bVar.f55783z = n10;
                    android.support.v4.media.session.f fVar = bVar.f55777s;
                    String str2 = l0.f13815a;
                    n10.getClass();
                    fVar.getClass();
                    fVar.obtainMessage(1, new a(x2.u.f60282g.getAndIncrement(), true, SystemClock.elapsedRealtime(), n10)).sendToTarget();
                }
            }
            if (eVar.f55795w != -9223372036854775807L) {
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
        return this.f55764e;
    }

    @Override
    public final int e() {
        p();
        return this.f55774p;
    }

    @Override
    public final boolean f(String str) {
        p();
        byte[] bArr = this.v;
        bArr.getClass();
        return this.f55762b.O(str, bArr);
    }

    @Override
    public final f g() {
        p();
        if (this.f55774p == 1) {
            return this.f55779u;
        }
        return null;
    }

    @Override
    public final k2.b h() {
        p();
        return this.f55778t;
    }

    public final void i(h2.j jVar) {
        Set<j> set;
        h2.k kVar = this.h;
        synchronized (kVar.f13804a) {
            set = kVar.f13806c;
        }
        for (j jVar2 : set) {
            jVar.accept(jVar2);
        }
    }

    public final void j(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: q2.b.j(boolean):void");
    }

    public final boolean k() {
        int i7 = this.f55774p;
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
        this.f55779u = new f(i10, th2);
        h2.a.d("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            h2.k kVar = this.h;
            synchronized (kVar.f13804a) {
                set = kVar.f13806c;
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
        if (this.f55774p != 4) {
            this.f55774p = 1;
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
        this.f55763c.S0(this);
    }

    public final boolean n() {
        throw new UnsupportedOperationException("Method not decompiled: q2.b.n():boolean");
    }

    public final void o(int i7, boolean z10, byte[] bArr) {
        try {
            synchronized (this.f55773o) {
                try {
                    this.f55782y = new qf(11);
                    List list = this.f55761a;
                    if (list != null) {
                        i0.q(list);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            o G = this.f55762b.G(bArr, this.f55761a, i7, this.f55766g);
            this.f55781x = G;
            android.support.v4.media.session.f fVar = this.f55777s;
            String str = l0.f13815a;
            G.getClass();
            fVar.getClass();
            fVar.obtainMessage(2, new a(x2.u.f60282g.getAndIncrement(), z10, SystemClock.elapsedRealtime(), G)).sendToTarget();
        } catch (Exception | NoSuchMethodError e10) {
            m(e10, true);
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f55771m;
        if (currentThread != looper.getThread()) {
            h2.a.m("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
