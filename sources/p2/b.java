package p2;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import b8.og;
import b8.zb;
import g2.n0;
import g9.i0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import mi.h0;
import org.telegram.ui.ActionBar.d4;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.y00;
public final class b implements g {
    public final List f53072a;
    public final q f53073b;
    public final h0 f53074c;
    public final y00 d;
    public final boolean f53075e;
    public final boolean f53076f;
    public final HashMap f53077g;
    public final g2.l h;
    public final kb.a f53078i;
    public final l2.k f53079j;
    public final b4.n f53080k;
    public final UUID f53081l;
    public final Looper f53082m;
    public final android.support.v4.media.session.q f53083n;
    public final Object f53084o;
    public int f53085p;
    public int f53086q;
    public HandlerThread f53087r;
    public android.support.v4.media.session.f f53088s;
    public j2.b f53089t;
    public f f53090u;
    public byte[] v;
    public byte[] f53091w;
    public o f53092x;
    public nh f53093y;
    public p f53094z;

    public b(UUID uuid, q qVar, h0 h0Var, y00 y00Var, List list, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, b4.n nVar, Looper looper, kb.a aVar, l2.k kVar) {
        this.f53081l = uuid;
        this.f53074c = h0Var;
        this.d = y00Var;
        this.f53073b = qVar;
        this.f53075e = z10;
        this.f53076f = z11;
        if (bArr != null) {
            this.f53091w = bArr;
            this.f53072a = null;
        } else {
            list.getClass();
            this.f53072a = DesugarCollections.unmodifiableList(list);
        }
        this.f53077g = hashMap;
        this.f53080k = nVar;
        this.h = new g2.l();
        this.f53078i = aVar;
        this.f53079j = kVar;
        this.f53085p = 2;
        this.f53082m = looper;
        this.f53083n = new android.support.v4.media.session.q(this, looper, 8);
        this.f53084o = new Object();
    }

    @Override
    public final UUID a() {
        p();
        return this.f53081l;
    }

    @Override
    public final void b(j jVar) {
        p();
        int i3 = this.f53086q;
        if (i3 <= 0) {
            g2.a.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i10 = i3 - 1;
        this.f53086q = i10;
        if (i10 == 0) {
            this.f53085p = 0;
            android.support.v4.media.session.q qVar = this.f53083n;
            String str = n0.f11873a;
            qVar.removeCallbacksAndMessages(null);
            this.f53088s.b();
            this.f53088s = null;
            this.f53087r.quit();
            this.f53087r = null;
            this.f53089t = null;
            this.f53090u = null;
            this.f53092x = null;
            synchronized (this.f53084o) {
                this.f53093y = null;
            }
            this.f53094z = null;
            byte[] bArr = this.v;
            if (bArr != null) {
                this.f53073b.W0(bArr);
                this.v = null;
            }
        }
        if (jVar != null) {
            this.h.i(jVar);
            if (this.h.h(jVar) == 0) {
                jVar.e();
            }
        }
        y00 y00Var = this.d;
        int i11 = this.f53086q;
        e eVar = (e) y00Var.f40562a;
        if (i11 == 1 && eVar.F > 0 && eVar.f53106w != -9223372036854775807L) {
            eVar.E.add(this);
            Handler handler = eVar.K;
            handler.getClass();
            handler.postAtTime(new d4(this, 26), this, SystemClock.uptimeMillis() + eVar.f53106w);
        } else if (i11 == 0) {
            eVar.f53107x.remove(this);
            if (eVar.H == this) {
                eVar.H = null;
            }
            if (eVar.I == this) {
                eVar.I = null;
            }
            h0 h0Var = eVar.f53103n;
            HashSet hashSet = (HashSet) h0Var.f19644b;
            hashSet.remove(this);
            if (((b) h0Var.f19645c) == this) {
                h0Var.f19645c = null;
                if (!hashSet.isEmpty()) {
                    b bVar = (b) hashSet.iterator().next();
                    h0Var.f19645c = bVar;
                    p W = bVar.f53073b.W();
                    bVar.f53094z = W;
                    android.support.v4.media.session.f fVar = bVar.f53088s;
                    String str2 = n0.f11873a;
                    W.getClass();
                    fVar.getClass();
                    fVar.obtainMessage(1, new a(w2.u.f57230g.getAndIncrement(), true, SystemClock.elapsedRealtime(), W)).sendToTarget();
                }
            }
            if (eVar.f53106w != -9223372036854775807L) {
                Handler handler2 = eVar.K;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                eVar.E.remove(this);
            }
        }
        eVar.h();
    }

    @Override
    public final boolean c() {
        p();
        return this.f53075e;
    }

    @Override
    public final int d() {
        p();
        return this.f53085p;
    }

    @Override
    public final void e(j jVar) {
        int i3;
        p();
        boolean z10 = false;
        if (this.f53086q < 0) {
            g2.a.c("DefaultDrmSession", "Session reference count less than zero: " + this.f53086q);
            this.f53086q = 0;
        }
        if (jVar != null) {
            g2.l lVar = this.h;
            synchronized (lVar.f11861a) {
                try {
                    ArrayList arrayList = new ArrayList(lVar.d);
                    arrayList.add(jVar);
                    lVar.d = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) lVar.f11862b.get(jVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(lVar.f11863c);
                        hashSet.add(jVar);
                        lVar.f11863c = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    HashMap hashMap = lVar.f11862b;
                    if (num != null) {
                        i3 = num.intValue() + 1;
                    } else {
                        i3 = 1;
                    }
                    hashMap.put(jVar, Integer.valueOf(i3));
                } finally {
                }
            }
        }
        int i10 = this.f53086q + 1;
        this.f53086q = i10;
        if (i10 == 1) {
            if (this.f53085p == 2) {
                z10 = true;
            }
            zb.p(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f53087r = handlerThread;
            handlerThread.start();
            this.f53088s = new android.support.v4.media.session.f(this, this.f53087r.getLooper());
            if (n()) {
                j(true);
            }
        } else if (jVar != null && k() && this.h.h(jVar) == 1) {
            jVar.c(this.f53085p);
        }
        e eVar = (e) this.d.f40562a;
        if (eVar.f53106w != -9223372036854775807L) {
            eVar.E.remove(this);
            Handler handler = eVar.K;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override
    public final boolean f(String str) {
        p();
        byte[] bArr = this.v;
        bArr.getClass();
        return this.f53073b.l2(str, bArr);
    }

    @Override
    public final f g() {
        p();
        if (this.f53085p == 1) {
            return this.f53090u;
        }
        return null;
    }

    @Override
    public final j2.b h() {
        p();
        return this.f53089t;
    }

    public final void i(g2.k kVar) {
        Set<j> set;
        g2.l lVar = this.h;
        synchronized (lVar.f11861a) {
            set = lVar.f11863c;
        }
        for (j jVar : set) {
            kVar.accept(jVar);
        }
    }

    public final void j(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: p2.b.j(boolean):void");
    }

    public final boolean k() {
        int i3 = this.f53085p;
        if (i3 != 3 && i3 != 4) {
            return false;
        }
        return true;
    }

    public final void l(int i3, Throwable th2) {
        int i10;
        Set<j> set;
        if (th2 instanceof MediaDrm.MediaDrmStateException) {
            i10 = n0.z(n0.A(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
        } else {
            if (!(th2 instanceof MediaDrmResetException)) {
                if (!(th2 instanceof NotProvisionedException) && !og.b(th2)) {
                    if (th2 instanceof DeniedByServerException) {
                        i10 = 6007;
                    } else if (th2 instanceof x) {
                        i10 = 6001;
                    } else if (th2 instanceof c) {
                        i10 = 6003;
                    } else if (th2 instanceof u) {
                        i10 = 6008;
                    } else if (i3 != 1) {
                        if (i3 == 2) {
                            i10 = 6004;
                        } else if (i3 != 3) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                i10 = 6002;
            }
            i10 = 6006;
        }
        this.f53090u = new f(i10, th2);
        g2.a.d("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            g2.l lVar = this.h;
            synchronized (lVar.f11861a) {
                set = lVar.f11863c;
            }
            for (j jVar : set) {
                jVar.d((Exception) th2);
            }
        } else if (th2 instanceof Error) {
            if (!og.c(th2) && !og.b(th2)) {
                throw ((Error) th2);
            }
        } else {
            throw new IllegalStateException("Unexpected Throwable subclass", th2);
        }
        if (this.f53085p != 4) {
            this.f53085p = 1;
        }
    }

    public final void m(Throwable th2, boolean z10) {
        int i3;
        if (!(th2 instanceof NotProvisionedException) && !og.b(th2)) {
            if (z10) {
                i3 = 1;
            } else {
                i3 = 2;
            }
            l(i3, th2);
            return;
        }
        this.f53074c.Z(this);
    }

    public final boolean n() {
        throw new UnsupportedOperationException("Method not decompiled: p2.b.n():boolean");
    }

    public final void o(int i3, boolean z10, byte[] bArr) {
        try {
            synchronized (this.f53084o) {
                try {
                    this.f53093y = new nh(9);
                    List list = this.f53072a;
                    if (list != null) {
                        i0.q(list);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            o J1 = this.f53073b.J1(bArr, this.f53072a, i3, this.f53077g);
            this.f53092x = J1;
            android.support.v4.media.session.f fVar = this.f53088s;
            String str = n0.f11873a;
            J1.getClass();
            fVar.getClass();
            fVar.obtainMessage(2, new a(w2.u.f57230g.getAndIncrement(), z10, SystemClock.elapsedRealtime(), J1)).sendToTarget();
        } catch (Exception | NoSuchMethodError e10) {
            m(e10, true);
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f53082m;
        if (currentThread != looper.getThread()) {
            g2.a.m("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
