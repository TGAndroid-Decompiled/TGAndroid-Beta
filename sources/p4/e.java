package p4;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.vision.h3;
import i2.r1;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import m.f3;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Components.zl0;
public final class e {
    public static final int F = 0;
    public n A;
    public int B;
    public f3 C;
    public android.support.v4.media.session.a0 D;
    public final n4.l E;
    public final u0 f45216c;
    public w d;
    public q f45217e;
    public com.google.android.gms.internal.cast.q f45218f;
    public zl0 f45219g;
    public final Context h;
    public final e2.q f45225n;
    public final l2.g f45226o;
    public final boolean f45227p;
    public final boolean f45228q;
    public k f45229r;
    public final k0 f45230s;
    public final r1 f45231t;
    public a0 f45232u;
    public w v;
    public w f45233w;
    public w f45234x;
    public p f45235y;
    public n f45236z;
    public final b f45214a = new b(this);
    public final HashMap f45215b = new HashMap();
    public final ArrayList f45220i = new ArrayList();
    public final ArrayList f45221j = new ArrayList();
    public final HashMap f45222k = new HashMap();
    public final ArrayList f45223l = new ArrayList();
    public final ArrayList f45224m = new ArrayList();

    static {
        Log.isLoggable("GlobalMediaRouter", 3);
    }

    public e(android.content.Context r8) {
        throw new UnsupportedOperationException("Method not decompiled: p4.e.<init>(android.content.Context):void");
    }

    public final void a(h3 h3Var, boolean z10) {
        if (d(h3Var) == null) {
            v vVar = new v(h3Var, z10);
            this.f45223l.add(vVar);
            this.f45214a.b(513, vVar);
            m(vVar, (b2.p) h3Var.f7546n);
            y.b();
            h3Var.f7545f = this.f45226o;
            h3Var.h(this.f45236z);
        }
    }

    public final String b(v vVar, String str) {
        String D;
        String flattenToShortString = ((ComponentName) vVar.d.f14466b).flattenToShortString();
        boolean z10 = vVar.f45332c;
        if (z10) {
            D = str;
        } else {
            D = a1.g.D(flattenToShortString, ":", str);
        }
        HashMap hashMap = this.f45222k;
        if (!z10) {
            ArrayList arrayList = this.f45221j;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    if (((w) arrayList.get(i10)).f45338c.equals(D)) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                Log.w("GlobalMediaRouter", c1.i("Either ", str, " isn't unique in ", flattenToShortString, " or we're trying to assign a unique ID for an already added route"));
                int i11 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String str2 = D + "_" + i11;
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            if (((w) arrayList.get(i12)).f45338c.equals(str2)) {
                                break;
                            }
                            i12++;
                        } else {
                            i12 = -1;
                            break;
                        }
                    }
                    if (i12 < 0) {
                        hashMap.put(new q0.b(flattenToShortString, str), str2);
                        return str2;
                    }
                    i11++;
                }
            }
        }
        hashMap.put(new q0.b(flattenToShortString, str), D);
        return D;
    }

    public final w c() {
        ArrayList arrayList = this.f45221j;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            w wVar = (w) obj;
            if (wVar != this.v && wVar.c() == this.f45230s && wVar.m("android.media.intent.category.LIVE_AUDIO") && !wVar.m("android.media.intent.category.LIVE_VIDEO") && wVar.f()) {
                return wVar;
            }
        }
        return this.v;
    }

    public final v d(h3 h3Var) {
        ArrayList arrayList = this.f45223l;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v vVar = (v) obj;
            if (vVar.f45330a == h3Var) {
                return vVar;
            }
        }
        return null;
    }

    public final w e() {
        w wVar = this.d;
        if (wVar != null) {
            return wVar;
        }
        throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
    }

    public final boolean f() {
        if (this.f45228q) {
            a0 a0Var = this.f45232u;
            if (a0Var == null || a0Var.f45203b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void g() {
        if (this.d.e()) {
            List<w> unmodifiableList = DesugarCollections.unmodifiableList(this.d.v);
            HashSet hashSet = new HashSet();
            for (w wVar : unmodifiableList) {
                hashSet.add(wVar.f45338c);
            }
            HashMap hashMap = this.f45215b;
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!hashSet.contains(entry.getKey())) {
                    q qVar = (q) entry.getValue();
                    qVar.h(0);
                    qVar.d();
                    it.remove();
                }
            }
            for (w wVar2 : unmodifiableList) {
                if (!hashMap.containsKey(wVar2.f45338c)) {
                    q e7 = wVar2.c().e(wVar2.f45337b, this.d.f45337b);
                    e7.e();
                    hashMap.put(wVar2.f45338c, e7);
                }
            }
        }
    }

    public final void h(e eVar, w wVar, q qVar, int i10, w wVar2, Collection collection) {
        com.google.android.gms.internal.cast.q qVar2;
        zl0 zl0Var = this.f45219g;
        if (zl0Var != null) {
            zl0Var.a();
            this.f45219g = null;
        }
        zl0 zl0Var2 = new zl0(eVar, wVar, qVar, i10, wVar2, collection);
        this.f45219g = zl0Var2;
        if (zl0Var2.f33430b == 3 && (qVar2 = this.f45218f) != null) {
            w wVar3 = this.d;
            w wVar4 = (w) zl0Var2.f33434g;
            com.google.android.gms.internal.cast.q.f6966c.b("Prepare transfer from Route(%s) to Route(%s)", wVar3, wVar4);
            ?? obj = new Object();
            obj.f3976c = new Object();
            c0.k kVar = new c0.k(obj);
            c0.j jVar = kVar.f3979b;
            obj.f3975b = kVar;
            obj.f3974a = com.google.android.gms.internal.cast.o.class;
            try {
                obj.f3974a = Boolean.valueOf(qVar2.f6968b.post(new com.google.android.gms.internal.cast.p(qVar2, wVar3, wVar4, obj, 0)));
            } catch (Exception e7) {
                jVar.l(e7);
            }
            zl0 zl0Var3 = this.f45219g;
            e eVar2 = (e) ((WeakReference) zl0Var3.f33436j).get();
            if (eVar2 != null && eVar2.f45219g == zl0Var3) {
                if (((c0.k) zl0Var3.f33437k) == null) {
                    zl0Var3.f33437k = kVar;
                    org.telegram.ui.web.t0 t0Var = new org.telegram.ui.web.t0(zl0Var3, 8);
                    b bVar = eVar2.f45214a;
                    Objects.requireNonNull(bVar);
                    jVar.a(t0Var, new k2.a0(bVar, 2));
                    return;
                }
                throw new IllegalStateException("future is already set");
            }
            Log.w("AxMediaRouter", "Router is released. Cancel transfer");
            zl0Var3.a();
            return;
        }
        zl0Var2.b();
    }

    public final void i(w wVar, int i10) {
        if (!this.f45221j.contains(wVar)) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select removed route: " + wVar);
        } else if (!wVar.f45341g) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select disabled route: " + wVar);
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                h3 c10 = wVar.c();
                k kVar = this.f45229r;
                if (c10 == kVar && this.d != wVar) {
                    kVar.s(wVar.f45337b);
                    return;
                }
            }
            j(wVar, i10);
        }
    }

    public final void j(w wVar, int i10) {
        b2.p pVar;
        if (this.d == wVar) {
            return;
        }
        if (this.f45234x != null) {
            this.f45234x = null;
            p pVar2 = this.f45235y;
            if (pVar2 != null) {
                pVar2.h(3);
                this.f45235y.d();
                this.f45235y = null;
            }
        }
        if (f() && (pVar = wVar.f45336a.f45333e) != null && pVar.f3503b) {
            p c10 = wVar.c().c(wVar.f45337b);
            if (c10 != null) {
                Executor d = f0.c.d(this.h);
                n4.l lVar = this.E;
                synchronized (c10.f45290a) {
                    try {
                        if (d != null) {
                            if (lVar != null) {
                                c10.f45291b = d;
                                c10.f45292c = lVar;
                                ArrayList arrayList = c10.f45293e;
                                if (arrayList != null && !arrayList.isEmpty()) {
                                    m mVar = c10.d;
                                    ArrayList arrayList2 = c10.f45293e;
                                    c10.d = null;
                                    c10.f45293e = null;
                                    c10.f45291b.execute(new com.google.android.gms.internal.cast.p(c10, lVar, mVar, arrayList2, false, 2));
                                }
                            } else {
                                throw new NullPointerException("Listener shouldn't be null");
                            }
                        } else {
                            throw new NullPointerException("Executor shouldn't be null");
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.f45234x = wVar;
                this.f45235y = c10;
                c10.e();
                return;
            }
            Log.w("GlobalMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + wVar);
        }
        q d10 = wVar.c().d(wVar.f45337b);
        if (d10 != null) {
            d10.e();
        }
        if (this.d == null) {
            this.d = wVar;
            this.f45217e = d10;
            Message obtainMessage = this.f45214a.obtainMessage(262, new q0.b(null, wVar));
            obtainMessage.arg1 = i10;
            obtainMessage.sendToTarget();
            return;
        }
        h(this, wVar, d10, i10, null, null);
    }

    public final void k() {
        throw new UnsupportedOperationException("Method not decompiled: p4.e.k():void");
    }

    public final void l() {
        int i10;
        w wVar = this.d;
        if (wVar != null) {
            int i11 = wVar.f45349p;
            e2.q qVar = this.f45225n;
            qVar.f8566a = i11;
            qVar.f8567b = wVar.f45350q;
            int i12 = 0;
            if (wVar.e() && !y.g()) {
                i10 = 0;
            } else {
                i10 = wVar.f45348o;
            }
            qVar.f8568c = i10;
            qVar.d = this.d.f45346m;
            if (f() && this.d.c() == this.f45229r) {
                qVar.f8569e = k.p(this.f45217e);
            } else {
                qVar.f8569e = null;
            }
            ArrayList arrayList = this.f45224m;
            if (arrayList.size() <= 0) {
                f3 f3Var = this.C;
                if (f3Var != null) {
                    w wVar2 = this.d;
                    w wVar3 = this.v;
                    if (wVar3 != null) {
                        if (wVar2 != wVar3 && wVar2 != this.f45233w) {
                            if (qVar.f8568c == 1) {
                                i12 = 2;
                            }
                            int i13 = qVar.f8567b;
                            int i14 = qVar.f8566a;
                            String str = (String) qVar.f8569e;
                            android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) f3Var.f15423b;
                            if (a0Var != null) {
                                androidx.emoji2.text.o oVar = (androidx.emoji2.text.o) f3Var.f15424c;
                                if (oVar != null && i12 == 0 && i13 == 0) {
                                    oVar.f2616c = i14;
                                    y1.g.a(oVar.c(), i14);
                                    return;
                                }
                                ?? obj = new Object();
                                obj.f2618f = f3Var;
                                obj.f2614a = i12;
                                obj.f2615b = i13;
                                obj.f2616c = i14;
                                obj.d = str;
                                f3Var.f15424c = obj;
                                a0Var.f2069a.f2093a.setPlaybackToRemote(obj.c());
                                return;
                            }
                            return;
                        }
                        f3Var.v();
                        return;
                    }
                    throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
                }
                return;
            }
            ((d) arrayList.get(0)).getClass();
            throw null;
        }
        f3 f3Var2 = this.C;
        if (f3Var2 != null) {
            f3Var2.v();
        }
    }

    public final void m(p4.v r20, b2.p r21) {
        throw new UnsupportedOperationException("Method not decompiled: p4.e.m(p4.v, b2.p):void");
    }

    public final int n(w wVar, m mVar) {
        int i10 = wVar.i(mVar);
        if (i10 != 0) {
            int i11 = i10 & 1;
            b bVar = this.f45214a;
            if (i11 != 0) {
                bVar.b(259, wVar);
            }
            if ((i10 & 2) != 0) {
                bVar.b(260, wVar);
            }
            if ((i10 & 4) != 0) {
                bVar.b(261, wVar);
            }
        }
        return i10;
    }

    public final void o(boolean z10) {
        w wVar = this.v;
        if (wVar != null && !wVar.f()) {
            Log.i("GlobalMediaRouter", "Clearing the default route because it is no longer selectable: " + this.v);
            this.v = null;
        }
        w wVar2 = this.v;
        k0 k0Var = this.f45230s;
        ArrayList arrayList = this.f45221j;
        if (wVar2 == null) {
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                Object obj = arrayList.get(i10);
                i10++;
                w wVar3 = (w) obj;
                if (wVar3.c() == k0Var && wVar3.f45337b.equals("DEFAULT_ROUTE") && wVar3.f()) {
                    this.v = wVar3;
                    Log.i("GlobalMediaRouter", "Found default route: " + this.v);
                    break;
                }
            }
        }
        w wVar4 = this.f45233w;
        if (wVar4 != null && !wVar4.f()) {
            Log.i("GlobalMediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.f45233w);
            this.f45233w = null;
        }
        if (this.f45233w == null) {
            int size2 = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    break;
                }
                Object obj2 = arrayList.get(i11);
                i11++;
                w wVar5 = (w) obj2;
                if (wVar5.c() == k0Var && wVar5.m("android.media.intent.category.LIVE_AUDIO") && !wVar5.m("android.media.intent.category.LIVE_VIDEO") && wVar5.f()) {
                    this.f45233w = wVar5;
                    Log.i("GlobalMediaRouter", "Found bluetooth route: " + this.f45233w);
                    break;
                }
            }
        }
        w wVar6 = this.d;
        if (wVar6 != null && wVar6.f45341g) {
            if (z10) {
                g();
                l();
                return;
            }
            return;
        }
        Log.i("GlobalMediaRouter", "Unselecting the current route because it is no longer selectable: " + this.d);
        j(c(), 0);
    }
}
