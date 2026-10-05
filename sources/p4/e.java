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
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.web.u0;
public final class e {
    public static final int F = 0;
    public n A;
    public int B;
    public la.h C;
    public android.support.v4.media.session.b0 D;
    public final k2.e E;
    public final s0 f44163c;
    public v d;
    public q f44164e;
    public com.google.android.gms.internal.cast.q f44165f;
    public bl0 f44166g;
    public final Context h;
    public final e2.q f44172n;
    public final n2.c f44173o;
    public final boolean f44174p;
    public final boolean f44175q;
    public k f44176r;
    public final j0 f44177s;
    public final r1 f44178t;
    public z f44179u;
    public v v;
    public v f44180w;
    public v f44181x;
    public p f44182y;
    public n f44183z;
    public final b f44161a = new b(this);
    public final HashMap f44162b = new HashMap();
    public final ArrayList f44167i = new ArrayList();
    public final ArrayList f44168j = new ArrayList();
    public final HashMap f44169k = new HashMap();
    public final ArrayList f44170l = new ArrayList();
    public final ArrayList f44171m = new ArrayList();

    static {
        Log.isLoggable("GlobalMediaRouter", 3);
    }

    public e(android.content.Context r8) {
        throw new UnsupportedOperationException("Method not decompiled: p4.e.<init>(android.content.Context):void");
    }

    public final void a(h3 h3Var, boolean z10) {
        if (d(h3Var) == null) {
            u uVar = new u(h3Var, z10);
            this.f44170l.add(uVar);
            this.f44161a.b(513, uVar);
            m(uVar, (b2.p) h3Var.f7499n);
            x.b();
            h3Var.f7498f = this.f44173o;
            h3Var.h(this.f44183z);
        }
    }

    public final String b(u uVar, String str) {
        String D;
        String flattenToShortString = ((ComponentName) uVar.d.f15268b).flattenToShortString();
        boolean z10 = uVar.f44278c;
        if (z10) {
            D = str;
        } else {
            D = a4.a.D(flattenToShortString, ":", str);
        }
        HashMap hashMap = this.f44169k;
        if (!z10) {
            ArrayList arrayList = this.f44168j;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    if (((v) arrayList.get(i10)).f44282c.equals(D)) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                Log.w("GlobalMediaRouter", c1.k("Either ", str, " isn't unique in ", flattenToShortString, " or we're trying to assign a unique ID for an already added route"));
                int i11 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String str2 = D + "_" + i11;
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            if (((v) arrayList.get(i12)).f44282c.equals(str2)) {
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
        ArrayList arrayList = this.f44168j;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v vVar = (v) obj;
            if (vVar != this.v && vVar.c() == this.f44177s && vVar.m("android.media.intent.category.LIVE_AUDIO") && !vVar.m("android.media.intent.category.LIVE_VIDEO") && vVar.f()) {
                return vVar;
            }
        }
        return this.v;
    }

    public final u d(h3 h3Var) {
        ArrayList arrayList = this.f44170l;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            u uVar = (u) obj;
            if (uVar.f44276a == h3Var) {
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
        if (this.f44175q) {
            z zVar = this.f44179u;
            if (zVar == null || zVar.f44308b) {
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
                hashSet.add(vVar.f44282c);
            }
            HashMap hashMap = this.f44162b;
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
                if (!hashMap.containsKey(vVar2.f44282c)) {
                    q e7 = vVar2.c().e(vVar2.f44281b, this.d.f44281b);
                    e7.e();
                    hashMap.put(vVar2.f44282c, e7);
                }
            }
        }
    }

    public final void h(e eVar, v vVar, q qVar, int i10, v vVar2, Collection collection) {
        com.google.android.gms.internal.cast.q qVar2;
        bl0 bl0Var = this.f44166g;
        if (bl0Var != null) {
            bl0Var.a();
            this.f44166g = null;
        }
        bl0 bl0Var2 = new bl0(eVar, vVar, qVar, i10, vVar2, collection);
        this.f44166g = bl0Var2;
        if (bl0Var2.f25015b == 3 && (qVar2 = this.f44165f) != null) {
            v vVar3 = this.d;
            v vVar4 = (v) bl0Var2.f25019g;
            com.google.android.gms.internal.cast.q.f6957c.b("Prepare transfer from Route(%s) to Route(%s)", vVar3, vVar4);
            ?? obj = new Object();
            obj.f3928c = new Object();
            c0.k kVar = new c0.k(obj);
            c0.j jVar = kVar.f3931b;
            obj.f3927b = kVar;
            obj.f3926a = com.google.android.gms.internal.cast.o.class;
            try {
                obj.f3926a = Boolean.valueOf(qVar2.f6959b.post(new com.google.android.gms.internal.cast.p(qVar2, vVar3, vVar4, obj, 0)));
            } catch (Exception e7) {
                jVar.l(e7);
            }
            bl0 bl0Var3 = this.f44166g;
            e eVar2 = (e) ((WeakReference) bl0Var3.f25021j).get();
            if (eVar2 != null && eVar2.f44166g == bl0Var3) {
                if (((c0.k) bl0Var3.f25022k) == null) {
                    bl0Var3.f25022k = kVar;
                    u0 u0Var = new u0(bl0Var3, 8);
                    b bVar = eVar2.f44161a;
                    Objects.requireNonNull(bVar);
                    jVar.a(u0Var, new k2.c0(bVar, 2));
                    return;
                }
                throw new IllegalStateException("future is already set");
            }
            Log.w("AxMediaRouter", "Router is released. Cancel transfer");
            bl0Var3.a();
            return;
        }
        bl0Var2.b();
    }

    public final void i(v vVar, int i10) {
        if (!this.f44168j.contains(vVar)) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select removed route: " + vVar);
        } else if (!vVar.f44285g) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select disabled route: " + vVar);
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                h3 c10 = vVar.c();
                k kVar = this.f44176r;
                if (c10 == kVar && this.d != vVar) {
                    kVar.s(vVar.f44281b);
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
        if (this.f44181x != null) {
            this.f44181x = null;
            p pVar2 = this.f44182y;
            if (pVar2 != null) {
                pVar2.h(3);
                this.f44182y.d();
                this.f44182y = null;
            }
        }
        if (f() && (pVar = vVar.f44280a.f44279e) != null && pVar.f3426b) {
            p c10 = vVar.c().c(vVar.f44281b);
            if (c10 != null) {
                Executor e7 = f0.e.e(this.h);
                k2.e eVar = this.E;
                synchronized (c10.f44238a) {
                    try {
                        if (e7 != null) {
                            if (eVar != null) {
                                c10.f44239b = e7;
                                c10.f44240c = eVar;
                                ArrayList arrayList = c10.f44241e;
                                if (arrayList != null && !arrayList.isEmpty()) {
                                    m mVar = c10.d;
                                    ArrayList arrayList2 = c10.f44241e;
                                    c10.d = null;
                                    c10.f44241e = null;
                                    c10.f44239b.execute(new com.google.android.gms.internal.cast.p(c10, eVar, mVar, arrayList2, false, 2));
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
                this.f44181x = vVar;
                this.f44182y = c10;
                c10.e();
                return;
            }
            Log.w("GlobalMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + vVar);
        }
        q d = vVar.c().d(vVar.f44281b);
        if (d != null) {
            d.e();
        }
        if (this.d == null) {
            this.d = vVar;
            this.f44164e = d;
            Message obtainMessage = this.f44161a.obtainMessage(262, new q0.b(null, vVar));
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
            int i11 = vVar.f44293p;
            e2.q qVar = this.f44172n;
            qVar.f8575a = i11;
            qVar.f8576b = vVar.f44294q;
            int i12 = 0;
            if (vVar.e() && !x.g()) {
                i10 = 0;
            } else {
                i10 = vVar.f44292o;
            }
            qVar.f8577c = i10;
            qVar.d = this.d.f44290m;
            if (f() && this.d.c() == this.f44176r) {
                qVar.f8578e = k.p(this.f44164e);
            } else {
                qVar.f8578e = null;
            }
            ArrayList arrayList = this.f44171m;
            if (arrayList.size() <= 0) {
                la.h hVar = this.C;
                if (hVar != null) {
                    v vVar2 = this.d;
                    v vVar3 = this.v;
                    if (vVar3 != null) {
                        if (vVar2 != vVar3 && vVar2 != this.f44180w) {
                            if (qVar.f8577c == 1) {
                                i12 = 2;
                            }
                            int i13 = qVar.f8576b;
                            int i14 = qVar.f8575a;
                            String str = (String) qVar.f8578e;
                            android.support.v4.media.session.b0 b0Var = (android.support.v4.media.session.b0) hVar.f15399b;
                            if (b0Var != null) {
                                androidx.emoji2.text.o oVar = (androidx.emoji2.text.o) hVar.f15400c;
                                if (oVar != null && i12 == 0 && i13 == 0) {
                                    oVar.f2539c = i14;
                                    y1.g.a(oVar.c(), i14);
                                    return;
                                }
                                ?? obj = new Object();
                                obj.f2541f = hVar;
                                obj.f2537a = i12;
                                obj.f2538b = i13;
                                obj.f2539c = i14;
                                obj.d = str;
                                hVar.f15400c = obj;
                                b0Var.f1994a.f2018a.setPlaybackToRemote(obj.c());
                                return;
                            }
                            return;
                        }
                        hVar.p();
                        return;
                    }
                    throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
                }
                return;
            }
            ((d) arrayList.get(0)).getClass();
            throw null;
        }
        la.h hVar2 = this.C;
        if (hVar2 != null) {
            hVar2.p();
        }
    }

    public final void m(p4.u r20, b2.p r21) {
        throw new UnsupportedOperationException("Method not decompiled: p4.e.m(p4.u, b2.p):void");
    }

    public final int n(v vVar, m mVar) {
        int i10 = vVar.i(mVar);
        if (i10 != 0) {
            int i11 = i10 & 1;
            b bVar = this.f44161a;
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
        j0 j0Var = this.f44177s;
        ArrayList arrayList = this.f44168j;
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
                if (vVar3.c() == j0Var && vVar3.f44281b.equals("DEFAULT_ROUTE") && vVar3.f()) {
                    this.v = vVar3;
                    Log.i("GlobalMediaRouter", "Found default route: " + this.v);
                    break;
                }
            }
        }
        v vVar4 = this.f44180w;
        if (vVar4 != null && !vVar4.f()) {
            Log.i("GlobalMediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.f44180w);
            this.f44180w = null;
        }
        if (this.f44180w == null) {
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
                    this.f44180w = vVar5;
                    Log.i("GlobalMediaRouter", "Found bluetooth route: " + this.f44180w);
                    break;
                }
            }
        }
        v vVar6 = this.d;
        if (vVar6 != null && vVar6.f44285g) {
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
