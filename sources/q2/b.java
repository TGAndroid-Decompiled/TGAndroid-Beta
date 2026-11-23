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
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.pf;
import org.telegram.ui.web.i1;
public final class b implements g {
    public final List f55726a;
    public final q f55727b;
    public final k8.a f55728c;
    public final jn d;
    public final boolean f55729e;
    public final boolean f55730f;
    public final HashMap f55731g;
    public final h2.k h;
    public final qb.a f55732i;
    public final m2.i f55733j;
    public final ab.q f55734k;
    public final UUID f55735l;
    public final Looper f55736m;
    public final android.support.v4.media.session.q f55737n;
    public final Object f55738o;
    public int f55739p;
    public int f55740q;
    public HandlerThread f55741r;
    public android.support.v4.media.session.f f55742s;
    public k2.b f55743t;
    public f f55744u;
    public byte[] v;
    public byte[] f55745w;
    public o f55746x;
    public pf f55747y;
    public p f55748z;

    public b(UUID uuid, q qVar, k8.a aVar, jn jnVar, List list, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, ab.q qVar2, Looper looper, qb.a aVar2, m2.i iVar) {
        this.f55735l = uuid;
        this.f55728c = aVar;
        this.d = jnVar;
        this.f55727b = qVar;
        this.f55729e = z10;
        this.f55730f = z11;
        if (bArr != null) {
            this.f55745w = bArr;
            this.f55726a = null;
        } else {
            list.getClass();
            this.f55726a = DesugarCollections.unmodifiableList(list);
        }
        this.f55731g = hashMap;
        this.f55734k = qVar2;
        this.h = new h2.k();
        this.f55732i = aVar2;
        this.f55733j = iVar;
        this.f55739p = 2;
        this.f55736m = looper;
        this.f55737n = new android.support.v4.media.session.q(this, looper, 8);
        this.f55738o = new Object();
    }

    @Override
    public final UUID a() {
        p();
        return this.f55735l;
    }

    @Override
    public final void b(j jVar) {
        int i7;
        p();
        boolean z10 = false;
        if (this.f55740q < 0) {
            h2.a.c("DefaultDrmSession", "Session reference count less than zero: " + this.f55740q);
            this.f55740q = 0;
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
        int i10 = this.f55740q + 1;
        this.f55740q = i10;
        if (i10 == 1) {
            if (this.f55739p == 2) {
                z10 = true;
            }
            ma.p(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f55741r = handlerThread;
            handlerThread.start();
            this.f55742s = new android.support.v4.media.session.f(this, this.f55741r.getLooper());
            if (n()) {
                j(true);
            }
        } else if (jVar != null && k() && this.h.f(jVar) == 1) {
            jVar.c(this.f55739p);
        }
        e eVar = (e) this.d.f36522b;
        if (eVar.f55760w != -9223372036854775807L) {
            eVar.E.remove(this);
            Handler handler = eVar.K;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override
    public final void c(j jVar) {
        p();
        int i7 = this.f55740q;
        if (i7 <= 0) {
            h2.a.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i10 = i7 - 1;
        this.f55740q = i10;
        if (i10 == 0) {
            this.f55739p = 0;
            android.support.v4.media.session.q qVar = this.f55737n;
            String str = l0.f13778a;
            qVar.removeCallbacksAndMessages(null);
            this.f55742s.b();
            this.f55742s = null;
            this.f55741r.quit();
            this.f55741r = null;
            this.f55743t = null;
            this.f55744u = null;
            this.f55746x = null;
            synchronized (this.f55738o) {
                this.f55747y = null;
            }
            this.f55748z = null;
            byte[] bArr = this.v;
            if (bArr != null) {
                this.f55727b.x(bArr);
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
        int i11 = this.f55740q;
        e eVar = (e) jnVar.f36522b;
        if (i11 == 1 && eVar.F > 0 && eVar.f55760w != -9223372036854775807L) {
            eVar.E.add(this);
            Handler handler = eVar.K;
            handler.getClass();
            handler.postAtTime(new i1(this, 3), this, SystemClock.uptimeMillis() + eVar.f55760w);
        } else if (i11 == 0) {
            eVar.f55761x.remove(this);
            if (eVar.H == this) {
                eVar.H = null;
            }
            if (eVar.I == this) {
                eVar.I = null;
            }
            k8.a aVar = eVar.f55757n;
            HashSet hashSet = (HashSet) aVar.f18177b;
            hashSet.remove(this);
            if (((b) aVar.f18178c) == this) {
                aVar.f18178c = null;
                if (!hashSet.isEmpty()) {
                    b bVar = (b) hashSet.iterator().next();
                    aVar.f18178c = bVar;
                    p n10 = bVar.f55727b.n();
                    bVar.f55748z = n10;
                    android.support.v4.media.session.f fVar = bVar.f55742s;
                    String str2 = l0.f13778a;
                    n10.getClass();
                    fVar.getClass();
                    fVar.obtainMessage(1, new a(x2.u.f60247g.getAndIncrement(), true, SystemClock.elapsedRealtime(), n10)).sendToTarget();
                }
            }
            if (eVar.f55760w != -9223372036854775807L) {
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
        return this.f55729e;
    }

    @Override
    public final int e() {
        p();
        return this.f55739p;
    }

    @Override
    public final boolean f(String str) {
        p();
        byte[] bArr = this.v;
        bArr.getClass();
        return this.f55727b.O(str, bArr);
    }

    @Override
    public final f g() {
        p();
        if (this.f55739p == 1) {
            return this.f55744u;
        }
        return null;
    }

    @Override
    public final k2.b h() {
        p();
        return this.f55743t;
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
        int i7 = this.f55739p;
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
        this.f55744u = new f(i10, th2);
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
        if (this.f55739p != 4) {
            this.f55739p = 1;
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
        this.f55728c.S0(this);
    }

    public final boolean n() {
        throw new UnsupportedOperationException("Method not decompiled: q2.b.n():boolean");
    }

    public final void o(int i7, boolean z10, byte[] bArr) {
        try {
            synchronized (this.f55738o) {
                try {
                    this.f55747y = new pf(11);
                    List list = this.f55726a;
                    if (list != null) {
                        i0.q(list);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            o G = this.f55727b.G(bArr, this.f55726a, i7, this.f55731g);
            this.f55746x = G;
            android.support.v4.media.session.f fVar = this.f55742s;
            String str = l0.f13778a;
            G.getClass();
            fVar.getClass();
            fVar.obtainMessage(2, new a(x2.u.f60247g.getAndIncrement(), z10, SystemClock.elapsedRealtime(), G)).sendToTarget();
        } catch (Exception | NoSuchMethodError e10) {
            m(e10, true);
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f55736m;
        if (currentThread != looper.getThread()) {
            h2.a.m("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
