package p4;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.util.Log;
import i2.s1;
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
import m.g3;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.web.a2;
public final class e {
    public static final int F = 0;
    public n A;
    public int B;
    public g3 C;
    public android.support.v4.media.session.b0 D;
    public final l2.f E;
    public final s0 f44094c;
    public v d;
    public q e;
    public com.google.android.gms.internal.cast.q f44095f;
    public ll0 f44096g;
    public final Context h;
    public final e2.s f44102n;
    public final le.b f44103o;
    public final boolean f44104p;
    public final boolean f44105q;
    public k f44106r;
    public final j0 f44107s;
    public final s1 f44108t;
    public z f44109u;
    public v v;
    public v f44110w;
    public v f44111x;
    public p f44112y;
    public n f44113z;
    public final b f44092a = new b(this);
    public final HashMap f44093b = new HashMap();
    public final ArrayList f44097i = new ArrayList();
    public final ArrayList f44098j = new ArrayList();
    public final HashMap f44099k = new HashMap();
    public final ArrayList f44100l = new ArrayList();
    public final ArrayList f44101m = new ArrayList();

    static {
        Log.isLoggable("GlobalMediaRouter", 3);
    }

    public e(android.content.Context r8) {
        throw new UnsupportedOperationException("Method not decompiled: p4.e.<init>(android.content.Context):void");
    }

    public final void a(com.google.android.gms.internal.vision.g3 g3Var, boolean z10) {
        if (d(g3Var) == null) {
            u uVar = new u(g3Var, z10);
            this.f44100l.add(uVar);
            this.f44092a.b(513, uVar);
            m(uVar, (b2.t) g3Var.f7283n);
            x.b();
            g3Var.f7282f = this.f44103o;
            g3Var.h(this.f44113z);
        }
    }

    public final String b(u uVar, String str) {
        String C;
        String flattenToShortString = ((ComponentName) uVar.d.f14564b).flattenToShortString();
        boolean z10 = uVar.f44202c;
        if (z10) {
            C = str;
        } else {
            C = a1.g.C(flattenToShortString, ":", str);
        }
        HashMap hashMap = this.f44099k;
        if (!z10) {
            ArrayList arrayList = this.f44098j;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    if (((v) arrayList.get(i10)).f44205c.equals(C)) {
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
                    String str2 = C + "_" + i11;
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            if (((v) arrayList.get(i12)).f44205c.equals(str2)) {
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
        hashMap.put(new q0.b(flattenToShortString, str), C);
        return C;
    }

    public final v c() {
        ArrayList arrayList = this.f44098j;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v vVar = (v) obj;
            if (vVar != this.v && vVar.c() == this.f44107s && vVar.m("android.media.intent.category.LIVE_AUDIO") && !vVar.m("android.media.intent.category.LIVE_VIDEO") && vVar.f()) {
                return vVar;
            }
        }
        return this.v;
    }

    public final u d(com.google.android.gms.internal.vision.g3 g3Var) {
        ArrayList arrayList = this.f44100l;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            u uVar = (u) obj;
            if (uVar.f44200a == g3Var) {
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
        if (this.f44105q) {
            z zVar = this.f44109u;
            if (zVar == null || zVar.f44229b) {
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
                hashSet.add(vVar.f44205c);
            }
            HashMap hashMap = this.f44093b;
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
                if (!hashMap.containsKey(vVar2.f44205c)) {
                    q e = vVar2.c().e(vVar2.f44204b, this.d.f44204b);
                    e.e();
                    hashMap.put(vVar2.f44205c, e);
                }
            }
        }
    }

    public final void h(e eVar, v vVar, q qVar, int i10, v vVar2, Collection collection) {
        final com.google.android.gms.internal.cast.q qVar2;
        ll0 ll0Var = this.f44096g;
        if (ll0Var != null) {
            ll0Var.a();
            this.f44096g = null;
        }
        ll0 ll0Var2 = new ll0(eVar, vVar, qVar, i10, vVar2, collection);
        this.f44096g = ll0Var2;
        if (ll0Var2.f28257b == 3 && (qVar2 = this.f44095f) != null) {
            final v vVar3 = this.d;
            final v vVar4 = (v) ll0Var2.f28260g;
            com.google.android.gms.internal.cast.q.f6757c.b("Prepare transfer from Route(%s) to Route(%s)", vVar3, vVar4);
            c0.l a2 = v7.h0.a(new c0.j() {
                @Override
                public final Object a(c0.i iVar) {
                    q qVar3 = q.this;
                    qVar3.getClass();
                    return Boolean.valueOf(qVar3.f6759b.post(new p(qVar3, vVar3, vVar4, iVar, 0)));
                }
            });
            ll0 ll0Var3 = this.f44096g;
            e eVar2 = (e) ((WeakReference) ll0Var3.f28262j).get();
            if (eVar2 != null && eVar2.f44096g == ll0Var3) {
                if (((c0.l) ll0Var3.f28263k) == null) {
                    ll0Var3.f28263k = a2;
                    a2 a2Var = new a2(ll0Var3, 3);
                    b bVar = eVar2.f44092a;
                    Objects.requireNonNull(bVar);
                    a2.f4478b.a(a2Var, new i2.f0(bVar, 3));
                    return;
                }
                throw new IllegalStateException("future is already set");
            }
            Log.w("AxMediaRouter", "Router is released. Cancel transfer");
            ll0Var3.a();
            return;
        }
        ll0Var2.b();
    }

    public final void i(v vVar, int i10) {
        if (!this.f44098j.contains(vVar)) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select removed route: " + vVar);
        } else if (!vVar.f44207g) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select disabled route: " + vVar);
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                com.google.android.gms.internal.vision.g3 c10 = vVar.c();
                k kVar = this.f44106r;
                if (c10 == kVar && this.d != vVar) {
                    kVar.s(vVar.f44204b);
                    return;
                }
            }
            j(vVar, i10);
        }
    }

    public final void j(v vVar, int i10) {
        b2.t tVar;
        if (this.d == vVar) {
            return;
        }
        if (this.f44111x != null) {
            this.f44111x = null;
            p pVar = this.f44112y;
            if (pVar != null) {
                pVar.h(3);
                this.f44112y.d();
                this.f44112y = null;
            }
        }
        if (f() && (tVar = vVar.f44203a.e) != null && tVar.f4009b) {
            p c10 = vVar.c().c(vVar.f44204b);
            if (c10 != null) {
                Executor d = f0.c.d(this.h);
                l2.f fVar = this.E;
                synchronized (c10.f44166a) {
                    try {
                        if (d != null) {
                            if (fVar != null) {
                                c10.f44167b = d;
                                c10.f44168c = fVar;
                                ArrayList arrayList = c10.e;
                                if (arrayList != null && !arrayList.isEmpty()) {
                                    m mVar = c10.d;
                                    ArrayList arrayList2 = c10.e;
                                    c10.d = null;
                                    c10.e = null;
                                    c10.f44167b.execute(new com.google.android.gms.internal.cast.p(c10, fVar, mVar, arrayList2, false, 2));
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
                this.f44111x = vVar;
                this.f44112y = c10;
                c10.e();
                return;
            }
            Log.w("GlobalMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + vVar);
        }
        q d10 = vVar.c().d(vVar.f44204b);
        if (d10 != null) {
            d10.e();
        }
        if (this.d == null) {
            this.d = vVar;
            this.e = d10;
            Message obtainMessage = this.f44092a.obtainMessage(262, new q0.b(null, vVar));
            obtainMessage.arg1 = i10;
            obtainMessage.sendToTarget();
            return;
        }
        h(this, vVar, d10, i10, null, null);
    }

    public final void k() {
        throw new UnsupportedOperationException("Method not decompiled: p4.e.k():void");
    }

    public final void l() {
        int i10;
        v vVar = this.d;
        if (vVar != null) {
            int i11 = vVar.f44215p;
            e2.s sVar = this.f44102n;
            sVar.f8279a = i11;
            sVar.f8280b = vVar.f44216q;
            int i12 = 0;
            if (vVar.e() && !x.g()) {
                i10 = 0;
            } else {
                i10 = vVar.f44214o;
            }
            sVar.f8281c = i10;
            sVar.d = this.d.f44212m;
            if (f() && this.d.c() == this.f44106r) {
                sVar.e = k.p(this.e);
            } else {
                sVar.e = null;
            }
            ArrayList arrayList = this.f44101m;
            if (arrayList.size() <= 0) {
                g3 g3Var = this.C;
                if (g3Var != null) {
                    v vVar2 = this.d;
                    v vVar3 = this.v;
                    if (vVar3 != null) {
                        if (vVar2 != vVar3 && vVar2 != this.f44110w) {
                            if (sVar.f8281c == 1) {
                                i12 = 2;
                            }
                            int i13 = sVar.f8280b;
                            int i14 = sVar.f8279a;
                            String str = (String) sVar.e;
                            android.support.v4.media.session.b0 b0Var = (android.support.v4.media.session.b0) g3Var.f16201b;
                            if (b0Var != null) {
                                androidx.emoji2.text.p pVar = (androidx.emoji2.text.p) g3Var.f16202c;
                                if (pVar != null && i12 == 0 && i13 == 0) {
                                    pVar.f3120c = i14;
                                    y1.g.a(pVar.c(), i14);
                                    return;
                                }
                                ?? obj = new Object();
                                obj.f3121f = g3Var;
                                obj.f3118a = i12;
                                obj.f3119b = i13;
                                obj.f3120c = i14;
                                obj.d = str;
                                g3Var.f16202c = obj;
                                b0Var.f2600a.f2622a.setPlaybackToRemote(obj.c());
                                return;
                            }
                            return;
                        }
                        g3Var.v();
                        return;
                    }
                    throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
                }
                return;
            }
            ((d) arrayList.get(0)).getClass();
            throw null;
        }
        g3 g3Var2 = this.C;
        if (g3Var2 != null) {
            g3Var2.v();
        }
    }

    public final void m(p4.u r20, b2.t r21) {
        throw new UnsupportedOperationException("Method not decompiled: p4.e.m(p4.u, b2.t):void");
    }

    public final int n(v vVar, m mVar) {
        int i10 = vVar.i(mVar);
        if (i10 != 0) {
            int i11 = i10 & 1;
            b bVar = this.f44092a;
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
        j0 j0Var = this.f44107s;
        ArrayList arrayList = this.f44098j;
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
                if (vVar3.c() == j0Var && vVar3.f44204b.equals("DEFAULT_ROUTE") && vVar3.f()) {
                    this.v = vVar3;
                    Log.i("GlobalMediaRouter", "Found default route: " + this.v);
                    break;
                }
            }
        }
        v vVar4 = this.f44110w;
        if (vVar4 != null && !vVar4.f()) {
            Log.i("GlobalMediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.f44110w);
            this.f44110w = null;
        }
        if (this.f44110w == null) {
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
                    this.f44110w = vVar5;
                    Log.i("GlobalMediaRouter", "Found bluetooth route: " + this.f44110w);
                    break;
                }
            }
        }
        v vVar6 = this.d;
        if (vVar6 != null && vVar6.f44207g) {
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
