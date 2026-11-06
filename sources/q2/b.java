package q2;

import a8.ia;
import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import c8.rb;
import h2.m0;
import h9.i0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import m4.d0;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.uy;
public final class b implements g {
    public final List f53600a;
    public final q f53601b;
    public final d0 f53602c;
    public final uy d;
    public final boolean f53603e;
    public final boolean f53604f;
    public final HashMap f53605g;
    public final h2.k h;
    public final pb.b f53606i;
    public final m2.j f53607j;
    public final ab.q f53608k;
    public final UUID f53609l;
    public final Looper f53610m;
    public final android.support.v4.media.session.q f53611n;
    public final Object f53612o;
    public int f53613p;
    public int f53614q;
    public HandlerThread f53615r;
    public android.support.v4.media.session.f f53616s;
    public k2.b f53617t;
    public f f53618u;
    public byte[] v;
    public byte[] f53619w;
    public o f53620x;
    public qt f53621y;
    public p f53622z;

    public b(UUID uuid, q qVar, d0 d0Var, uy uyVar, List list, boolean z9, boolean z10, byte[] bArr, HashMap hashMap, ab.q qVar2, Looper looper, pb.b bVar, m2.j jVar) {
        this.f53609l = uuid;
        this.f53602c = d0Var;
        this.d = uyVar;
        this.f53601b = qVar;
        this.f53603e = z9;
        this.f53604f = z10;
        if (bArr != null) {
            this.f53619w = bArr;
            this.f53600a = null;
        } else {
            list.getClass();
            this.f53600a = DesugarCollections.unmodifiableList(list);
        }
        this.f53605g = hashMap;
        this.f53608k = qVar2;
        this.h = new h2.k();
        this.f53606i = bVar;
        this.f53607j = jVar;
        this.f53613p = 2;
        this.f53610m = looper;
        this.f53611n = new android.support.v4.media.session.q(this, looper, 8);
        this.f53612o = new Object();
    }

    @Override
    public final UUID a() {
        p();
        return this.f53609l;
    }

    @Override
    public final void b(j jVar) {
        int i7;
        p();
        boolean z9 = false;
        if (this.f53614q < 0) {
            h2.a.c("DefaultDrmSession", "Session reference count less than zero: " + this.f53614q);
            this.f53614q = 0;
        }
        if (jVar != null) {
            h2.k kVar = this.h;
            synchronized (kVar.f14100a) {
                try {
                    ArrayList arrayList = new ArrayList(kVar.d);
                    arrayList.add(jVar);
                    kVar.d = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) kVar.f14101b.get(jVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(kVar.f14102c);
                        hashSet.add(jVar);
                        kVar.f14102c = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    HashMap hashMap = kVar.f14101b;
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
        int i10 = this.f53614q + 1;
        this.f53614q = i10;
        if (i10 == 1) {
            if (this.f53613p == 2) {
                z9 = true;
            }
            ia.p(z9);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f53615r = handlerThread;
            handlerThread.start();
            this.f53616s = new android.support.v4.media.session.f(this, this.f53615r.getLooper());
            if (n()) {
                j(true);
            }
        } else if (jVar != null && k() && this.h.f(jVar) == 1) {
            jVar.c(this.f53613p);
        }
        e eVar = (e) this.d.f38750b;
        if (eVar.f53634w != -9223372036854775807L) {
            eVar.D.remove(this);
            Handler handler = eVar.J;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override
    public final void c(j jVar) {
        p();
        int i7 = this.f53614q;
        if (i7 <= 0) {
            h2.a.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i10 = i7 - 1;
        this.f53614q = i10;
        if (i10 == 0) {
            this.f53613p = 0;
            android.support.v4.media.session.q qVar = this.f53611n;
            String str = m0.f14112a;
            qVar.removeCallbacksAndMessages(null);
            this.f53616s.b();
            this.f53616s = null;
            this.f53615r.quit();
            this.f53615r = null;
            this.f53617t = null;
            this.f53618u = null;
            this.f53620x = null;
            synchronized (this.f53612o) {
                this.f53621y = null;
            }
            this.f53622z = null;
            byte[] bArr = this.v;
            if (bArr != null) {
                this.f53601b.L(bArr);
                this.v = null;
            }
        }
        if (jVar != null) {
            this.h.i(jVar);
            if (this.h.f(jVar) == 0) {
                jVar.e();
            }
        }
        uy uyVar = this.d;
        int i11 = this.f53614q;
        e eVar = (e) uyVar.f38750b;
        if (i11 == 1 && eVar.E > 0 && eVar.f53634w != -9223372036854775807L) {
            eVar.D.add(this);
            Handler handler = eVar.J;
            handler.getClass();
            handler.postAtTime(new m5(this, 21), this, SystemClock.uptimeMillis() + eVar.f53634w);
        } else if (i11 == 0) {
            eVar.f53635x.remove(this);
            if (eVar.G == this) {
                eVar.G = null;
            }
            if (eVar.H == this) {
                eVar.H = null;
            }
            d0 d0Var = eVar.f53631n;
            HashSet hashSet = (HashSet) d0Var.f19608a;
            hashSet.remove(this);
            if (((b) d0Var.f19609b) == this) {
                d0Var.f19609b = null;
                if (!hashSet.isEmpty()) {
                    b bVar = (b) hashSet.iterator().next();
                    d0Var.f19609b = bVar;
                    p q10 = bVar.f53601b.q();
                    bVar.f53622z = q10;
                    android.support.v4.media.session.f fVar = bVar.f53616s;
                    String str2 = m0.f14112a;
                    q10.getClass();
                    fVar.getClass();
                    fVar.obtainMessage(1, new a(x2.u.f58380g.getAndIncrement(), true, SystemClock.elapsedRealtime(), q10)).sendToTarget();
                }
            }
            if (eVar.f53634w != -9223372036854775807L) {
                Handler handler2 = eVar.J;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                eVar.D.remove(this);
            }
        }
        eVar.g();
    }

    @Override
    public final boolean d() {
        p();
        return this.f53603e;
    }

    @Override
    public final int e() {
        p();
        return this.f53613p;
    }

    @Override
    public final boolean f(String str) {
        p();
        byte[] bArr = this.v;
        bArr.getClass();
        return this.f53601b.w0(str, bArr);
    }

    @Override
    public final f g() {
        p();
        if (this.f53613p == 1) {
            return this.f53618u;
        }
        return null;
    }

    @Override
    public final k2.b h() {
        p();
        return this.f53617t;
    }

    public final void i(h2.j jVar) {
        Set<j> set;
        h2.k kVar = this.h;
        synchronized (kVar.f14100a) {
            set = kVar.f14102c;
        }
        for (j jVar2 : set) {
            jVar.accept(jVar2);
        }
    }

    public final void j(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: q2.b.j(boolean):void");
    }

    public final boolean k() {
        int i7 = this.f53613p;
        if (i7 != 3 && i7 != 4) {
            return false;
        }
        return true;
    }

    public final void l(int i7, Throwable th2) {
        int i10;
        Set<j> set;
        if (th2 instanceof MediaDrm.MediaDrmStateException) {
            i10 = m0.z(m0.A(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
        } else {
            if (!(th2 instanceof MediaDrmResetException)) {
                if (!(th2 instanceof NotProvisionedException) && !rb.b(th2)) {
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
        this.f53618u = new f(i10, th2);
        h2.a.d("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            h2.k kVar = this.h;
            synchronized (kVar.f14100a) {
                set = kVar.f14102c;
            }
            for (j jVar : set) {
                jVar.d((Exception) th2);
            }
        } else if (th2 instanceof Error) {
            if (!rb.c(th2) && !rb.b(th2)) {
                throw ((Error) th2);
            }
        } else {
            throw new IllegalStateException("Unexpected Throwable subclass", th2);
        }
        if (this.f53613p != 4) {
            this.f53613p = 1;
        }
    }

    public final void m(Throwable th2, boolean z9) {
        int i7;
        if (!(th2 instanceof NotProvisionedException) && !rb.b(th2)) {
            if (z9) {
                i7 = 1;
            } else {
                i7 = 2;
            }
            l(i7, th2);
            return;
        }
        this.f53602c.v0(this);
    }

    public final boolean n() {
        throw new UnsupportedOperationException("Method not decompiled: q2.b.n():boolean");
    }

    public final void o(int i7, boolean z9, byte[] bArr) {
        try {
            synchronized (this.f53612o) {
                try {
                    this.f53621y = new qt(9);
                    List list = this.f53600a;
                    if (list != null) {
                        i0.q(list);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            o l02 = this.f53601b.l0(bArr, this.f53600a, i7, this.f53605g);
            this.f53620x = l02;
            android.support.v4.media.session.f fVar = this.f53616s;
            String str = m0.f14112a;
            l02.getClass();
            fVar.getClass();
            fVar.obtainMessage(2, new a(x2.u.f58380g.getAndIncrement(), z9, SystemClock.elapsedRealtime(), l02)).sendToTarget();
        } catch (Exception | NoSuchMethodError e10) {
            m(e10, true);
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f53610m;
        if (currentThread != looper.getThread()) {
            h2.a.m("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
