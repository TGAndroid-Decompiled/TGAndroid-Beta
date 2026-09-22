package p4;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.vision.h3;
import i2.q1;
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
public final class e {
    public static final int F = 0;
    public n A;
    public int B;
    public lf.h C;
    public android.support.v4.media.session.b0 D;
    public final o0.b E;
    public final s0 f40869c;
    public v d;
    public q e;
    public com.google.android.gms.internal.cast.q f40870f;
    public bl0 f40871g;
    public final Context h;
    public final e2.q f40877n;
    public final ki.e0 f40878o;
    public final boolean f40879p;
    public final boolean f40880q;
    public k f40881r;
    public final j0 f40882s;
    public final q1 f40883t;
    public z f40884u;
    public v v;
    public v f40885w;
    public v f40886x;
    public p f40887y;
    public n f40888z;
    public final b f40867a = new b(this);
    public final HashMap f40868b = new HashMap();
    public final ArrayList f40872i = new ArrayList();
    public final ArrayList f40873j = new ArrayList();
    public final HashMap f40874k = new HashMap();
    public final ArrayList f40875l = new ArrayList();
    public final ArrayList f40876m = new ArrayList();

    static {
        Log.isLoggable("GlobalMediaRouter", 3);
    }

    public e(android.content.Context r9) {
        throw new UnsupportedOperationException("Method not decompiled: p4.e.<init>(android.content.Context):void");
    }

    public final void a(h3 h3Var, boolean z10) {
        if (d(h3Var) == null) {
            u uVar = new u(h3Var, z10);
            this.f40875l.add(uVar);
            this.f40867a.b(513, uVar);
            m(uVar, (b2.p) h3Var.f6960n);
            x.b();
            h3Var.f6959f = this.f40878o;
            h3Var.h(this.f40888z);
        }
    }

    public final String b(u uVar, String str) {
        String C;
        String flattenToShortString = ((ComponentName) uVar.d.f13912b).flattenToShortString();
        boolean z10 = uVar.f40977c;
        if (z10) {
            C = str;
        } else {
            C = a4.a.C(flattenToShortString, ":", str);
        }
        HashMap hashMap = this.f40874k;
        if (!z10) {
            ArrayList arrayList = this.f40873j;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    if (((v) arrayList.get(i10)).f40980c.equals(C)) {
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
                            if (((v) arrayList.get(i12)).f40980c.equals(str2)) {
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
        ArrayList arrayList = this.f40873j;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v vVar = (v) obj;
            if (vVar != this.v && vVar.c() == this.f40882s && vVar.m("android.media.intent.category.LIVE_AUDIO") && !vVar.m("android.media.intent.category.LIVE_VIDEO") && vVar.f()) {
                return vVar;
            }
        }
        return this.v;
    }

    public final u d(h3 h3Var) {
        ArrayList arrayList = this.f40875l;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            u uVar = (u) obj;
            if (uVar.f40975a == h3Var) {
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
        if (this.f40880q) {
            z zVar = this.f40884u;
            if (zVar == null || zVar.f41004b) {
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
                hashSet.add(vVar.f40980c);
            }
            HashMap hashMap = this.f40868b;
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
                if (!hashMap.containsKey(vVar2.f40980c)) {
                    q e = vVar2.c().e(vVar2.f40979b, this.d.f40979b);
                    e.e();
                    hashMap.put(vVar2.f40980c, e);
                }
            }
        }
    }

    public final void h(e eVar, v vVar, q qVar, int i10, v vVar2, Collection collection) {
        com.google.android.gms.internal.cast.q qVar2;
        bl0 bl0Var = this.f40871g;
        if (bl0Var != null) {
            bl0Var.a();
            this.f40871g = null;
        }
        bl0 bl0Var2 = new bl0(eVar, vVar, qVar, i10, vVar2, collection);
        this.f40871g = bl0Var2;
        if (bl0Var2.f23029b == 3 && (qVar2 = this.f40870f) != null) {
            v vVar3 = this.d;
            v vVar4 = (v) bl0Var2.f23032g;
            com.google.android.gms.internal.cast.q.f6467c.b("Prepare transfer from Route(%s) to Route(%s)", vVar3, vVar4);
            ?? obj = new Object();
            obj.f3640c = new Object();
            c0.k kVar = new c0.k(obj);
            c0.j jVar = kVar.f3643b;
            obj.f3639b = kVar;
            obj.f3638a = com.google.android.gms.internal.cast.o.class;
            try {
                obj.f3638a = Boolean.valueOf(qVar2.f6469b.post(new com.google.android.gms.internal.cast.p(qVar2, vVar3, vVar4, obj, 0)));
            } catch (Exception e) {
                jVar.l(e);
            }
            bl0 bl0Var3 = this.f40871g;
            e eVar2 = (e) ((WeakReference) bl0Var3.f23034j).get();
            if (eVar2 != null && eVar2.f40871g == bl0Var3) {
                if (((c0.k) bl0Var3.f23035k) == null) {
                    bl0Var3.f23035k = kVar;
                    org.telegram.ui.web.r0 r0Var = new org.telegram.ui.web.r0(bl0Var3, 9);
                    b bVar = eVar2.f40867a;
                    Objects.requireNonNull(bVar);
                    jVar.a(r0Var, new k2.c0(bVar, 2));
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
        if (!this.f40873j.contains(vVar)) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select removed route: " + vVar);
        } else if (!vVar.f40982g) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select disabled route: " + vVar);
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                h3 c10 = vVar.c();
                k kVar = this.f40881r;
                if (c10 == kVar && this.d != vVar) {
                    kVar.s(vVar.f40979b);
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
        if (this.f40886x != null) {
            this.f40886x = null;
            p pVar2 = this.f40887y;
            if (pVar2 != null) {
                pVar2.h(3);
                this.f40887y.d();
                this.f40887y = null;
            }
        }
        if (f() && (pVar = vVar.f40978a.e) != null && pVar.f3175b) {
            p c10 = vVar.c().c(vVar.f40979b);
            if (c10 != null) {
                Executor e = f0.e.e(this.h);
                o0.b bVar = this.E;
                synchronized (c10.f40941a) {
                    try {
                        if (e != null) {
                            if (bVar != null) {
                                c10.f40942b = e;
                                c10.f40943c = bVar;
                                ArrayList arrayList = c10.e;
                                if (arrayList != null && !arrayList.isEmpty()) {
                                    m mVar = c10.d;
                                    ArrayList arrayList2 = c10.e;
                                    c10.d = null;
                                    c10.e = null;
                                    c10.f40942b.execute(new com.google.android.gms.internal.cast.p(c10, bVar, mVar, arrayList2, false, 2));
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
                this.f40886x = vVar;
                this.f40887y = c10;
                c10.e();
                return;
            }
            Log.w("GlobalMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + vVar);
        }
        q d = vVar.c().d(vVar.f40979b);
        if (d != null) {
            d.e();
        }
        if (this.d == null) {
            this.d = vVar;
            this.e = d;
            Message obtainMessage = this.f40867a.obtainMessage(262, new q0.b(null, vVar));
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
            int i11 = vVar.f40990p;
            e2.q qVar = this.f40877n;
            qVar.f7921a = i11;
            qVar.f7922b = vVar.f40991q;
            int i12 = 0;
            if (vVar.e() && !x.g()) {
                i10 = 0;
            } else {
                i10 = vVar.f40989o;
            }
            qVar.f7923c = i10;
            qVar.d = this.d.f40987m;
            if (f() && this.d.c() == this.f40881r) {
                qVar.e = k.p(this.e);
            } else {
                qVar.e = null;
            }
            ArrayList arrayList = this.f40876m;
            if (arrayList.size() <= 0) {
                lf.h hVar = this.C;
                if (hVar != null) {
                    v vVar2 = this.d;
                    v vVar3 = this.v;
                    if (vVar3 != null) {
                        if (vVar2 != vVar3 && vVar2 != this.f40885w) {
                            if (qVar.f7923c == 1) {
                                i12 = 2;
                            }
                            int i13 = qVar.f7922b;
                            int i14 = qVar.f7921a;
                            String str = (String) qVar.e;
                            android.support.v4.media.session.b0 b0Var = (android.support.v4.media.session.b0) hVar.f14230b;
                            if (b0Var != null) {
                                androidx.emoji2.text.o oVar = (androidx.emoji2.text.o) hVar.f14231c;
                                if (oVar != null && i12 == 0 && i13 == 0) {
                                    oVar.f2349c = i14;
                                    y1.g.a(oVar.c(), i14);
                                    return;
                                }
                                ?? obj = new Object();
                                obj.f2350f = hVar;
                                obj.f2347a = i12;
                                obj.f2348b = i13;
                                obj.f2349c = i14;
                                obj.d = str;
                                hVar.f14231c = obj;
                                b0Var.f1837a.f1859a.setPlaybackToRemote(obj.c());
                                return;
                            }
                            return;
                        }
                        hVar.v();
                        return;
                    }
                    throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
                }
                return;
            }
            ((d) arrayList.get(0)).getClass();
            throw null;
        }
        lf.h hVar2 = this.C;
        if (hVar2 != null) {
            hVar2.v();
        }
    }

    public final void m(p4.u r20, b2.p r21) {
        throw new UnsupportedOperationException("Method not decompiled: p4.e.m(p4.u, b2.p):void");
    }

    public final int n(v vVar, m mVar) {
        int i10 = vVar.i(mVar);
        if (i10 != 0) {
            int i11 = i10 & 1;
            b bVar = this.f40867a;
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
        j0 j0Var = this.f40882s;
        ArrayList arrayList = this.f40873j;
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
                if (vVar3.c() == j0Var && vVar3.f40979b.equals("DEFAULT_ROUTE") && vVar3.f()) {
                    this.v = vVar3;
                    Log.i("GlobalMediaRouter", "Found default route: " + this.v);
                    break;
                }
            }
        }
        v vVar4 = this.f40885w;
        if (vVar4 != null && !vVar4.f()) {
            Log.i("GlobalMediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.f40885w);
            this.f40885w = null;
        }
        if (this.f40885w == null) {
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
                    this.f40885w = vVar5;
                    Log.i("GlobalMediaRouter", "Found bluetooth route: " + this.f40885w);
                    break;
                }
            }
        }
        v vVar6 = this.d;
        if (vVar6 != null && vVar6.f40982g) {
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
