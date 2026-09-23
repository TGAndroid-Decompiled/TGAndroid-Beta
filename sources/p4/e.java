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
import org.telegram.ui.Cells.q3;
import org.telegram.ui.Components.pk0;
public final class e {
    public static final int F = 0;
    public n A;
    public int B;
    public lf.i C;
    public android.support.v4.media.session.b0 D;
    public final k2.b0 E;
    public final s0 f40505c;
    public v d;
    public q e;
    public com.google.android.gms.internal.cast.q f40506f;
    public pk0 f40507g;
    public final Context h;
    public final e2.q f40513n;
    public final ka.c f40514o;
    public final boolean f40515p;
    public final boolean f40516q;
    public k f40517r;
    public final j0 f40518s;
    public final r1 f40519t;
    public z f40520u;
    public v v;
    public v f40521w;
    public v f40522x;
    public p f40523y;
    public n f40524z;
    public final b f40503a = new b(this);
    public final HashMap f40504b = new HashMap();
    public final ArrayList f40508i = new ArrayList();
    public final ArrayList f40509j = new ArrayList();
    public final HashMap f40510k = new HashMap();
    public final ArrayList f40511l = new ArrayList();
    public final ArrayList f40512m = new ArrayList();

    static {
        Log.isLoggable("GlobalMediaRouter", 3);
    }

    public e(android.content.Context r8) {
        throw new UnsupportedOperationException("Method not decompiled: p4.e.<init>(android.content.Context):void");
    }

    public final void a(h3 h3Var, boolean z10) {
        if (d(h3Var) == null) {
            u uVar = new u(h3Var, z10);
            this.f40511l.add(uVar);
            this.f40503a.b(513, uVar);
            m(uVar, (b2.p) h3Var.f6944n);
            x.b();
            h3Var.f6943f = this.f40514o;
            h3Var.h(this.f40524z);
        }
    }

    public final String b(u uVar, String str) {
        String D;
        String flattenToShortString = ((ComponentName) uVar.d.f13371b).flattenToShortString();
        boolean z10 = uVar.f40613c;
        if (z10) {
            D = str;
        } else {
            D = a4.a.D(flattenToShortString, ":", str);
        }
        HashMap hashMap = this.f40510k;
        if (!z10) {
            ArrayList arrayList = this.f40509j;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    if (((v) arrayList.get(i10)).f40616c.equals(D)) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                Log.w("GlobalMediaRouter", q3.j("Either ", str, " isn't unique in ", flattenToShortString, " or we're trying to assign a unique ID for an already added route"));
                int i11 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String str2 = D + "_" + i11;
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            if (((v) arrayList.get(i12)).f40616c.equals(str2)) {
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

    public final v c() {
        ArrayList arrayList = this.f40509j;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v vVar = (v) obj;
            if (vVar != this.v && vVar.c() == this.f40518s && vVar.m("android.media.intent.category.LIVE_AUDIO") && !vVar.m("android.media.intent.category.LIVE_VIDEO") && vVar.f()) {
                return vVar;
            }
        }
        return this.v;
    }

    public final u d(h3 h3Var) {
        ArrayList arrayList = this.f40511l;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            u uVar = (u) obj;
            if (uVar.f40611a == h3Var) {
                return uVar;
            }
        }
        return null;
    }

    public final v e() {
        v vVar = this.d;
        if (vVar != null) {
            return vVar;
        }
        throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
    }

    public final boolean f() {
        if (this.f40516q) {
            z zVar = this.f40520u;
            if (zVar == null || zVar.f40640b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void g() {
        if (this.d.e()) {
            List<v> unmodifiableList = DesugarCollections.unmodifiableList(this.d.v);
            HashSet hashSet = new HashSet();
            for (v vVar : unmodifiableList) {
                hashSet.add(vVar.f40616c);
            }
            HashMap hashMap = this.f40504b;
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
            for (v vVar2 : unmodifiableList) {
                if (!hashMap.containsKey(vVar2.f40616c)) {
                    q e = vVar2.c().e(vVar2.f40615b, this.d.f40615b);
                    e.e();
                    hashMap.put(vVar2.f40616c, e);
                }
            }
        }
    }

    public final void h(e eVar, v vVar, q qVar, int i10, v vVar2, Collection collection) {
        com.google.android.gms.internal.cast.q qVar2;
        pk0 pk0Var = this.f40507g;
        if (pk0Var != null) {
            pk0Var.a();
            this.f40507g = null;
        }
        pk0 pk0Var2 = new pk0(eVar, vVar, qVar, i10, vVar2, collection);
        this.f40507g = pk0Var2;
        if (pk0Var2.f27074b == 3 && (qVar2 = this.f40506f) != null) {
            v vVar3 = this.d;
            v vVar4 = (v) pk0Var2.f27077g;
            com.google.android.gms.internal.cast.q.f6451c.b("Prepare transfer from Route(%s) to Route(%s)", vVar3, vVar4);
            ?? obj = new Object();
            obj.f3633c = new Object();
            c0.k kVar = new c0.k(obj);
            c0.j jVar = kVar.f3636b;
            obj.f3632b = kVar;
            obj.f3631a = com.google.android.gms.internal.cast.o.class;
            try {
                obj.f3631a = Boolean.valueOf(qVar2.f6453b.post(new com.google.android.gms.internal.cast.p(qVar2, vVar3, vVar4, obj, 0)));
            } catch (Exception e) {
                jVar.l(e);
            }
            pk0 pk0Var3 = this.f40507g;
            e eVar2 = (e) ((WeakReference) pk0Var3.f27079j).get();
            if (eVar2 != null && eVar2.f40507g == pk0Var3) {
                if (((c0.k) pk0Var3.f27080k) == null) {
                    pk0Var3.f27080k = kVar;
                    org.telegram.ui.web.t0 t0Var = new org.telegram.ui.web.t0(pk0Var3, 8);
                    b bVar = eVar2.f40503a;
                    Objects.requireNonNull(bVar);
                    jVar.a(t0Var, new k2.c0(bVar, 2));
                    return;
                }
                throw new IllegalStateException("future is already set");
            }
            Log.w("AxMediaRouter", "Router is released. Cancel transfer");
            pk0Var3.a();
            return;
        }
        pk0Var2.b();
    }

    public final void i(v vVar, int i10) {
        if (!this.f40509j.contains(vVar)) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select removed route: " + vVar);
        } else if (!vVar.f40618g) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select disabled route: " + vVar);
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                h3 c10 = vVar.c();
                k kVar = this.f40517r;
                if (c10 == kVar && this.d != vVar) {
                    kVar.s(vVar.f40615b);
                    return;
                }
            }
            j(vVar, i10);
        }
    }

    public final void j(v vVar, int i10) {
        b2.p pVar;
        if (this.d == vVar) {
            return;
        }
        if (this.f40522x != null) {
            this.f40522x = null;
            p pVar2 = this.f40523y;
            if (pVar2 != null) {
                pVar2.h(3);
                this.f40523y.d();
                this.f40523y = null;
            }
        }
        if (f() && (pVar = vVar.f40614a.e) != null && pVar.f3168b) {
            p c10 = vVar.c().c(vVar.f40615b);
            if (c10 != null) {
                Executor e = f0.e.e(this.h);
                k2.b0 b0Var = this.E;
                synchronized (c10.f40577a) {
                    try {
                        if (e != null) {
                            if (b0Var != null) {
                                c10.f40578b = e;
                                c10.f40579c = b0Var;
                                ArrayList arrayList = c10.e;
                                if (arrayList != null && !arrayList.isEmpty()) {
                                    m mVar = c10.d;
                                    ArrayList arrayList2 = c10.e;
                                    c10.d = null;
                                    c10.e = null;
                                    c10.f40578b.execute(new com.google.android.gms.internal.cast.p(c10, b0Var, mVar, arrayList2, false, 2));
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
                this.f40522x = vVar;
                this.f40523y = c10;
                c10.e();
                return;
            }
            Log.w("GlobalMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + vVar);
        }
        q d = vVar.c().d(vVar.f40615b);
        if (d != null) {
            d.e();
        }
        if (this.d == null) {
            this.d = vVar;
            this.e = d;
            Message obtainMessage = this.f40503a.obtainMessage(262, new q0.b(null, vVar));
            obtainMessage.arg1 = i10;
            obtainMessage.sendToTarget();
            return;
        }
        h(this, vVar, d, i10, null, null);
    }

    public final void k() {
        throw new UnsupportedOperationException("Method not decompiled: p4.e.k():void");
    }

    public final void l() {
        int i10;
        v vVar = this.d;
        if (vVar != null) {
            int i11 = vVar.f40626p;
            e2.q qVar = this.f40513n;
            qVar.f7905a = i11;
            qVar.f7906b = vVar.f40627q;
            int i12 = 0;
            if (vVar.e() && !x.g()) {
                i10 = 0;
            } else {
                i10 = vVar.f40625o;
            }
            qVar.f7907c = i10;
            qVar.d = this.d.f40623m;
            if (f() && this.d.c() == this.f40517r) {
                qVar.e = k.p(this.e);
            } else {
                qVar.e = null;
            }
            ArrayList arrayList = this.f40512m;
            if (arrayList.size() <= 0) {
                lf.i iVar = this.C;
                if (iVar != null) {
                    v vVar2 = this.d;
                    v vVar3 = this.v;
                    if (vVar3 != null) {
                        if (vVar2 != vVar3 && vVar2 != this.f40521w) {
                            if (qVar.f7907c == 1) {
                                i12 = 2;
                            }
                            int i13 = qVar.f7906b;
                            int i14 = qVar.f7905a;
                            String str = (String) qVar.e;
                            android.support.v4.media.session.b0 b0Var = (android.support.v4.media.session.b0) iVar.f14011b;
                            if (b0Var != null) {
                                androidx.emoji2.text.o oVar = (androidx.emoji2.text.o) iVar.f14012c;
                                if (oVar != null && i12 == 0 && i13 == 0) {
                                    oVar.f2342c = i14;
                                    y1.g.a(oVar.c(), i14);
                                    return;
                                }
                                ?? obj = new Object();
                                obj.f2343f = iVar;
                                obj.f2340a = i12;
                                obj.f2341b = i13;
                                obj.f2342c = i14;
                                obj.d = str;
                                iVar.f14012c = obj;
                                b0Var.f1830a.f1852a.setPlaybackToRemote(obj.c());
                                return;
                            }
                            return;
                        }
                        iVar.v();
                        return;
                    }
                    throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
                }
                return;
            }
            ((d) arrayList.get(0)).getClass();
            throw null;
        }
        lf.i iVar2 = this.C;
        if (iVar2 != null) {
            iVar2.v();
        }
    }

    public final void m(p4.u r20, b2.p r21) {
        throw new UnsupportedOperationException("Method not decompiled: p4.e.m(p4.u, b2.p):void");
    }

    public final int n(v vVar, m mVar) {
        int i10 = vVar.i(mVar);
        if (i10 != 0) {
            int i11 = i10 & 1;
            b bVar = this.f40503a;
            if (i11 != 0) {
                bVar.b(259, vVar);
            }
            if ((i10 & 2) != 0) {
                bVar.b(260, vVar);
            }
            if ((i10 & 4) != 0) {
                bVar.b(261, vVar);
            }
        }
        return i10;
    }

    public final void o(boolean z10) {
        v vVar = this.v;
        if (vVar != null && !vVar.f()) {
            Log.i("GlobalMediaRouter", "Clearing the default route because it is no longer selectable: " + this.v);
            this.v = null;
        }
        v vVar2 = this.v;
        j0 j0Var = this.f40518s;
        ArrayList arrayList = this.f40509j;
        if (vVar2 == null) {
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                Object obj = arrayList.get(i10);
                i10++;
                v vVar3 = (v) obj;
                if (vVar3.c() == j0Var && vVar3.f40615b.equals("DEFAULT_ROUTE") && vVar3.f()) {
                    this.v = vVar3;
                    Log.i("GlobalMediaRouter", "Found default route: " + this.v);
                    break;
                }
            }
        }
        v vVar4 = this.f40521w;
        if (vVar4 != null && !vVar4.f()) {
            Log.i("GlobalMediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.f40521w);
            this.f40521w = null;
        }
        if (this.f40521w == null) {
            int size2 = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    break;
                }
                Object obj2 = arrayList.get(i11);
                i11++;
                v vVar5 = (v) obj2;
                if (vVar5.c() == j0Var && vVar5.m("android.media.intent.category.LIVE_AUDIO") && !vVar5.m("android.media.intent.category.LIVE_VIDEO") && vVar5.f()) {
                    this.f40521w = vVar5;
                    Log.i("GlobalMediaRouter", "Found bluetooth route: " + this.f40521w);
                    break;
                }
            }
        }
        v vVar6 = this.d;
        if (vVar6 != null && vVar6.f40618g) {
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
