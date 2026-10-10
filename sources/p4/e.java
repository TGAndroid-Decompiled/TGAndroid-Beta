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
import org.telegram.ui.Components.ul0;
public final class e {
    public static final int F = 0;
    public n A;
    public int B;
    public la.h C;
    public android.support.v4.media.session.a0 D;
    public final m2.t E;
    public final s0 f45373c;
    public v d;
    public q f45374e;
    public com.google.android.gms.internal.cast.q f45375f;
    public ul0 f45376g;
    public final Context h;
    public final e2.q f45382n;
    public final k2.g0 f45383o;
    public final boolean f45384p;
    public final boolean f45385q;
    public k f45386r;
    public final j0 f45387s;
    public final r1 f45388t;
    public z f45389u;
    public v v;
    public v f45390w;
    public v f45391x;
    public p f45392y;
    public n f45393z;
    public final b f45371a = new b(this);
    public final HashMap f45372b = new HashMap();
    public final ArrayList f45377i = new ArrayList();
    public final ArrayList f45378j = new ArrayList();
    public final HashMap f45379k = new HashMap();
    public final ArrayList f45380l = new ArrayList();
    public final ArrayList f45381m = new ArrayList();

    static {
        Log.isLoggable("GlobalMediaRouter", 3);
    }

    public e(android.content.Context r8) {
        throw new UnsupportedOperationException("Method not decompiled: p4.e.<init>(android.content.Context):void");
    }

    public final void a(h3 h3Var, boolean z10) {
        if (d(h3Var) == null) {
            u uVar = new u(h3Var, z10);
            this.f45380l.add(uVar);
            this.f45371a.b(513, uVar);
            m(uVar, (b2.p) h3Var.f7548n);
            x.b();
            h3Var.f7547f = this.f45383o;
            h3Var.h(this.f45393z);
        }
    }

    public final String b(u uVar, String str) {
        String D;
        String flattenToShortString = ((ComponentName) uVar.d.f15672b).flattenToShortString();
        boolean z10 = uVar.f45488c;
        if (z10) {
            D = str;
        } else {
            D = a1.g.D(flattenToShortString, ":", str);
        }
        HashMap hashMap = this.f45379k;
        if (!z10) {
            ArrayList arrayList = this.f45378j;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    if (((v) arrayList.get(i10)).f45492c.equals(D)) {
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
                            if (((v) arrayList.get(i12)).f45492c.equals(str2)) {
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
        ArrayList arrayList = this.f45378j;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v vVar = (v) obj;
            if (vVar != this.v && vVar.c() == this.f45387s && vVar.m("android.media.intent.category.LIVE_AUDIO") && !vVar.m("android.media.intent.category.LIVE_VIDEO") && vVar.f()) {
                return vVar;
            }
        }
        return this.v;
    }

    public final u d(h3 h3Var) {
        ArrayList arrayList = this.f45380l;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            u uVar = (u) obj;
            if (uVar.f45486a == h3Var) {
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
        if (this.f45385q) {
            z zVar = this.f45389u;
            if (zVar == null || zVar.f45518b) {
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
                hashSet.add(vVar.f45492c);
            }
            HashMap hashMap = this.f45372b;
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
                if (!hashMap.containsKey(vVar2.f45492c)) {
                    q e7 = vVar2.c().e(vVar2.f45491b, this.d.f45491b);
                    e7.e();
                    hashMap.put(vVar2.f45492c, e7);
                }
            }
        }
    }

    public final void h(e eVar, v vVar, q qVar, int i10, v vVar2, Collection collection) {
        com.google.android.gms.internal.cast.q qVar2;
        ul0 ul0Var = this.f45376g;
        if (ul0Var != null) {
            ul0Var.a();
            this.f45376g = null;
        }
        ul0 ul0Var2 = new ul0(eVar, vVar, qVar, i10, vVar2, collection);
        this.f45376g = ul0Var2;
        if (ul0Var2.f31548b == 3 && (qVar2 = this.f45375f) != null) {
            v vVar3 = this.d;
            v vVar4 = (v) ul0Var2.f31552g;
            com.google.android.gms.internal.cast.q.f6968c.b("Prepare transfer from Route(%s) to Route(%s)", vVar3, vVar4);
            ?? obj = new Object();
            obj.f3977c = new Object();
            c0.k kVar = new c0.k(obj);
            c0.j jVar = kVar.f3980b;
            obj.f3976b = kVar;
            obj.f3975a = com.google.android.gms.internal.cast.o.class;
            try {
                obj.f3975a = Boolean.valueOf(qVar2.f6970b.post(new com.google.android.gms.internal.cast.p(qVar2, vVar3, vVar4, obj, 0)));
            } catch (Exception e7) {
                jVar.l(e7);
            }
            ul0 ul0Var3 = this.f45376g;
            e eVar2 = (e) ((WeakReference) ul0Var3.f31554j).get();
            if (eVar2 != null && eVar2.f45376g == ul0Var3) {
                if (((c0.k) ul0Var3.f31555k) == null) {
                    ul0Var3.f31555k = kVar;
                    org.telegram.ui.web.q0 q0Var = new org.telegram.ui.web.q0(ul0Var3, 9);
                    b bVar = eVar2.f45371a;
                    Objects.requireNonNull(bVar);
                    jVar.a(q0Var, new k2.a0(bVar, 2));
                    return;
                }
                throw new IllegalStateException("future is already set");
            }
            Log.w("AxMediaRouter", "Router is released. Cancel transfer");
            ul0Var3.a();
            return;
        }
        ul0Var2.b();
    }

    public final void i(v vVar, int i10) {
        if (!this.f45378j.contains(vVar)) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select removed route: " + vVar);
        } else if (!vVar.f45495g) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select disabled route: " + vVar);
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                h3 c10 = vVar.c();
                k kVar = this.f45386r;
                if (c10 == kVar && this.d != vVar) {
                    kVar.s(vVar.f45491b);
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
        if (this.f45391x != null) {
            this.f45391x = null;
            p pVar2 = this.f45392y;
            if (pVar2 != null) {
                pVar2.h(3);
                this.f45392y.d();
                this.f45392y = null;
            }
        }
        if (f() && (pVar = vVar.f45490a.f45489e) != null && pVar.f3505b) {
            p c10 = vVar.c().c(vVar.f45491b);
            if (c10 != null) {
                Executor d = f0.c.d(this.h);
                m2.t tVar = this.E;
                synchronized (c10.f45448a) {
                    try {
                        if (d != null) {
                            if (tVar != null) {
                                c10.f45449b = d;
                                c10.f45450c = tVar;
                                ArrayList arrayList = c10.f45451e;
                                if (arrayList != null && !arrayList.isEmpty()) {
                                    m mVar = c10.d;
                                    ArrayList arrayList2 = c10.f45451e;
                                    c10.d = null;
                                    c10.f45451e = null;
                                    c10.f45449b.execute(new com.google.android.gms.internal.cast.p(c10, tVar, mVar, arrayList2, false, 2));
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
                this.f45391x = vVar;
                this.f45392y = c10;
                c10.e();
                return;
            }
            Log.w("GlobalMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + vVar);
        }
        q d10 = vVar.c().d(vVar.f45491b);
        if (d10 != null) {
            d10.e();
        }
        if (this.d == null) {
            this.d = vVar;
            this.f45374e = d10;
            Message obtainMessage = this.f45371a.obtainMessage(262, new q0.b(null, vVar));
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
            int i11 = vVar.f45503p;
            e2.q qVar = this.f45382n;
            qVar.f8569a = i11;
            qVar.f8570b = vVar.f45504q;
            int i12 = 0;
            if (vVar.e() && !x.g()) {
                i10 = 0;
            } else {
                i10 = vVar.f45502o;
            }
            qVar.f8571c = i10;
            qVar.d = this.d.f45500m;
            if (f() && this.d.c() == this.f45386r) {
                qVar.f8572e = k.p(this.f45374e);
            } else {
                qVar.f8572e = null;
            }
            ArrayList arrayList = this.f45381m;
            if (arrayList.size() <= 0) {
                la.h hVar = this.C;
                if (hVar != null) {
                    v vVar2 = this.d;
                    v vVar3 = this.v;
                    if (vVar3 != null) {
                        if (vVar2 != vVar3 && vVar2 != this.f45390w) {
                            if (qVar.f8571c == 1) {
                                i12 = 2;
                            }
                            int i13 = qVar.f8570b;
                            int i14 = qVar.f8569a;
                            String str = (String) qVar.f8572e;
                            android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) hVar.f15466b;
                            if (a0Var != null) {
                                androidx.emoji2.text.o oVar = (androidx.emoji2.text.o) hVar.f15467c;
                                if (oVar != null && i12 == 0 && i13 == 0) {
                                    oVar.f2618c = i14;
                                    y1.g.a(oVar.c(), i14);
                                    return;
                                }
                                ?? obj = new Object();
                                obj.f2620f = hVar;
                                obj.f2616a = i12;
                                obj.f2617b = i13;
                                obj.f2618c = i14;
                                obj.d = str;
                                hVar.f15467c = obj;
                                a0Var.f2071a.f2095a.setPlaybackToRemote(obj.c());
                                return;
                            }
                            return;
                        }
                        hVar.u();
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
            hVar2.u();
        }
    }

    public final void m(p4.u r20, b2.p r21) {
        throw new UnsupportedOperationException("Method not decompiled: p4.e.m(p4.u, b2.p):void");
    }

    public final int n(v vVar, m mVar) {
        int i10 = vVar.i(mVar);
        if (i10 != 0) {
            int i11 = i10 & 1;
            b bVar = this.f45371a;
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
        j0 j0Var = this.f45387s;
        ArrayList arrayList = this.f45378j;
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
                if (vVar3.c() == j0Var && vVar3.f45491b.equals("DEFAULT_ROUTE") && vVar3.f()) {
                    this.v = vVar3;
                    Log.i("GlobalMediaRouter", "Found default route: " + this.v);
                    break;
                }
            }
        }
        v vVar4 = this.f45390w;
        if (vVar4 != null && !vVar4.f()) {
            Log.i("GlobalMediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.f45390w);
            this.f45390w = null;
        }
        if (this.f45390w == null) {
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
                    this.f45390w = vVar5;
                    Log.i("GlobalMediaRouter", "Found bluetooth route: " + this.f45390w);
                    break;
                }
            }
        }
        v vVar6 = this.d;
        if (vVar6 != null && vVar6.f45495g) {
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
