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
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.of;
import org.telegram.ui.web.z0;
public final class b implements g {
    public final List f55716a;
    public final q f55717b;
    public final k8.a f55718c;
    public final hn d;
    public final boolean f55719e;
    public final boolean f55720f;
    public final HashMap f55721g;
    public final h2.k h;
    public final qb.a f55722i;
    public final m2.i f55723j;
    public final ab.q f55724k;
    public final UUID f55725l;
    public final Looper f55726m;
    public final android.support.v4.media.session.q f55727n;
    public final Object f55728o;
    public int f55729p;
    public int f55730q;
    public HandlerThread f55731r;
    public android.support.v4.media.session.f f55732s;
    public k2.b f55733t;
    public f f55734u;
    public byte[] v;
    public byte[] f55735w;
    public o f55736x;
    public of f55737y;
    public p f55738z;

    public b(UUID uuid, q qVar, k8.a aVar, hn hnVar, List list, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, ab.q qVar2, Looper looper, qb.a aVar2, m2.i iVar) {
        this.f55725l = uuid;
        this.f55718c = aVar;
        this.d = hnVar;
        this.f55717b = qVar;
        this.f55719e = z10;
        this.f55720f = z11;
        if (bArr != null) {
            this.f55735w = bArr;
            this.f55716a = null;
        } else {
            list.getClass();
            this.f55716a = DesugarCollections.unmodifiableList(list);
        }
        this.f55721g = hashMap;
        this.f55724k = qVar2;
        this.h = new h2.k();
        this.f55722i = aVar2;
        this.f55723j = iVar;
        this.f55729p = 2;
        this.f55726m = looper;
        this.f55727n = new android.support.v4.media.session.q(this, looper, 8);
        this.f55728o = new Object();
    }

    @Override
    public final UUID a() {
        p();
        return this.f55725l;
    }

    @Override
    public final void b(j jVar) {
        int i7;
        p();
        boolean z10 = false;
        if (this.f55730q < 0) {
            h2.a.c("DefaultDrmSession", "Session reference count less than zero: " + this.f55730q);
            this.f55730q = 0;
        }
        if (jVar != null) {
            h2.k kVar = this.h;
            synchronized (kVar.f13772a) {
                try {
                    ArrayList arrayList = new ArrayList(kVar.d);
                    arrayList.add(jVar);
                    kVar.d = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) kVar.f13773b.get(jVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(kVar.f13774c);
                        hashSet.add(jVar);
                        kVar.f13774c = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    HashMap hashMap = kVar.f13773b;
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
        int i10 = this.f55730q + 1;
        this.f55730q = i10;
        if (i10 == 1) {
            if (this.f55729p == 2) {
                z10 = true;
            }
            la.p(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f55731r = handlerThread;
            handlerThread.start();
            this.f55732s = new android.support.v4.media.session.f(this, this.f55731r.getLooper());
            if (n()) {
                j(true);
            }
        } else if (jVar != null && k() && this.h.f(jVar) == 1) {
            jVar.c(this.f55729p);
        }
        e eVar = (e) this.d.f35933b;
        if (eVar.f55750w != -9223372036854775807L) {
            eVar.E.remove(this);
            Handler handler = eVar.K;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override
    public final void c(j jVar) {
        p();
        int i7 = this.f55730q;
        if (i7 <= 0) {
            h2.a.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i10 = i7 - 1;
        this.f55730q = i10;
        if (i10 == 0) {
            this.f55729p = 0;
            android.support.v4.media.session.q qVar = this.f55727n;
            String str = l0.f13783a;
            qVar.removeCallbacksAndMessages(null);
            this.f55732s.b();
            this.f55732s = null;
            this.f55731r.quit();
            this.f55731r = null;
            this.f55733t = null;
            this.f55734u = null;
            this.f55736x = null;
            synchronized (this.f55728o) {
                this.f55737y = null;
            }
            this.f55738z = null;
            byte[] bArr = this.v;
            if (bArr != null) {
                this.f55717b.A(bArr);
                this.v = null;
            }
        }
        if (jVar != null) {
            this.h.i(jVar);
            if (this.h.f(jVar) == 0) {
                jVar.e();
            }
        }
        hn hnVar = this.d;
        int i11 = this.f55730q;
        e eVar = (e) hnVar.f35933b;
        if (i11 == 1 && eVar.F > 0 && eVar.f55750w != -9223372036854775807L) {
            eVar.E.add(this);
            Handler handler = eVar.K;
            handler.getClass();
            handler.postAtTime(new z0(this, 4), this, SystemClock.uptimeMillis() + eVar.f55750w);
        } else if (i11 == 0) {
            eVar.f55751x.remove(this);
            if (eVar.H == this) {
                eVar.H = null;
            }
            if (eVar.I == this) {
                eVar.I = null;
            }
            k8.a aVar = eVar.f55747n;
            HashSet hashSet = (HashSet) aVar.f18180b;
            hashSet.remove(this);
            if (((b) aVar.f18181c) == this) {
                aVar.f18181c = null;
                if (!hashSet.isEmpty()) {
                    b bVar = (b) hashSet.iterator().next();
                    aVar.f18181c = bVar;
                    p n10 = bVar.f55717b.n();
                    bVar.f55738z = n10;
                    android.support.v4.media.session.f fVar = bVar.f55732s;
                    String str2 = l0.f13783a;
                    n10.getClass();
                    fVar.getClass();
                    fVar.obtainMessage(1, new a(x2.u.f60237g.getAndIncrement(), true, SystemClock.elapsedRealtime(), n10)).sendToTarget();
                }
            }
            if (eVar.f55750w != -9223372036854775807L) {
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
        return this.f55719e;
    }

    @Override
    public final int e() {
        p();
        return this.f55729p;
    }

    @Override
    public final boolean f(String str) {
        p();
        byte[] bArr = this.v;
        bArr.getClass();
        return this.f55717b.O(str, bArr);
    }

    @Override
    public final f g() {
        p();
        if (this.f55729p == 1) {
            return this.f55734u;
        }
        return null;
    }

    @Override
    public final k2.b h() {
        p();
        return this.f55733t;
    }

    public final void i(h2.j jVar) {
        Set<j> set;
        h2.k kVar = this.h;
        synchronized (kVar.f13772a) {
            set = kVar.f13774c;
        }
        for (j jVar2 : set) {
            jVar.accept(jVar2);
        }
    }

    public final void j(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: q2.b.j(boolean):void");
    }

    public final boolean k() {
        int i7 = this.f55729p;
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
        this.f55734u = new f(i10, th2);
        h2.a.d("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            h2.k kVar = this.h;
            synchronized (kVar.f13772a) {
                set = kVar.f13774c;
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
        if (this.f55729p != 4) {
            this.f55729p = 1;
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
        this.f55718c.S0(this);
    }

    public final boolean n() {
        throw new UnsupportedOperationException("Method not decompiled: q2.b.n():boolean");
    }

    public final void o(int i7, boolean z10, byte[] bArr) {
        try {
            synchronized (this.f55728o) {
                try {
                    this.f55737y = new of(11);
                    List list = this.f55716a;
                    if (list != null) {
                        i0.q(list);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            o H = this.f55717b.H(bArr, this.f55716a, i7, this.f55721g);
            this.f55736x = H;
            android.support.v4.media.session.f fVar = this.f55732s;
            String str = l0.f13783a;
            H.getClass();
            fVar.getClass();
            fVar.obtainMessage(2, new a(x2.u.f60237g.getAndIncrement(), z10, SystemClock.elapsedRealtime(), H)).sendToTarget();
        } catch (Exception | NoSuchMethodError e10) {
            m(e10, true);
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f55726m;
        if (currentThread != looper.getThread()) {
            h2.a.m("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
