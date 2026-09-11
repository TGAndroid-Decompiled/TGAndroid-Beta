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
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.ok0;
public final class e {
    public static final int F = 0;
    public n A;
    public int B;
    public m2.t C;
    public android.support.v4.media.session.c0 D;
    public final l.d E;
    public final s0 f43807c;
    public v d;
    public q f43808e;
    public com.google.android.gms.internal.cast.q f43809f;
    public ok0 f43810g;
    public final Context h;
    public final e2.q f43816n;
    public final k2.g0 f43817o;
    public final boolean f43818p;
    public final boolean f43819q;
    public k f43820r;
    public final j0 f43821s;
    public final q1 f43822t;
    public z f43823u;
    public v v;
    public v f43824w;
    public v f43825x;
    public p f43826y;
    public n f43827z;
    public final b f43805a = new b(this);
    public final HashMap f43806b = new HashMap();
    public final ArrayList f43811i = new ArrayList();
    public final ArrayList f43812j = new ArrayList();
    public final HashMap f43813k = new HashMap();
    public final ArrayList f43814l = new ArrayList();
    public final ArrayList f43815m = new ArrayList();

    static {
        Log.isLoggable("GlobalMediaRouter", 3);
    }

    public e(android.content.Context r8) {
        throw new UnsupportedOperationException("Method not decompiled: p4.e.<init>(android.content.Context):void");
    }

    public final void a(h3 h3Var, boolean z10) {
        if (d(h3Var) == null) {
            u uVar = new u(h3Var, z10);
            this.f43814l.add(uVar);
            this.f43805a.b(513, uVar);
            m(uVar, (b2.p) h3Var.f5970n);
            x.b();
            h3Var.f5969f = this.f43817o;
            h3Var.h(this.f43827z);
        }
    }

    public final String b(u uVar, String str) {
        String C;
        String flattenToShortString = ((ComponentName) uVar.d.f14221b).flattenToShortString();
        boolean z10 = uVar.f43922c;
        if (z10) {
            C = str;
        } else {
            C = a4.a.C(flattenToShortString, ":", str);
        }
        HashMap hashMap = this.f43813k;
        if (!z10) {
            ArrayList arrayList = this.f43812j;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    if (((v) arrayList.get(i10)).f43926c.equals(C)) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                Log.w("GlobalMediaRouter", p6.j("Either ", str, " isn't unique in ", flattenToShortString, " or we're trying to assign a unique ID for an already added route"));
                int i11 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String str2 = C + "_" + i11;
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            if (((v) arrayList.get(i12)).f43926c.equals(str2)) {
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
        ArrayList arrayList = this.f43812j;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v vVar = (v) obj;
            if (vVar != this.v && vVar.c() == this.f43821s && vVar.m("android.media.intent.category.LIVE_AUDIO") && !vVar.m("android.media.intent.category.LIVE_VIDEO") && vVar.f()) {
                return vVar;
            }
        }
        return this.v;
    }

    public final u d(h3 h3Var) {
        ArrayList arrayList = this.f43814l;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            u uVar = (u) obj;
            if (uVar.f43920a == h3Var) {
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
        if (this.f43819q) {
            z zVar = this.f43823u;
            if (zVar == null || zVar.f43952b) {
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
                hashSet.add(vVar.f43926c);
            }
            HashMap hashMap = this.f43806b;
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
                if (!hashMap.containsKey(vVar2.f43926c)) {
                    q e7 = vVar2.c().e(vVar2.f43925b, this.d.f43925b);
                    e7.e();
                    hashMap.put(vVar2.f43926c, e7);
                }
            }
        }
    }

    public final void h(e eVar, v vVar, q qVar, int i10, v vVar2, Collection collection) {
        com.google.android.gms.internal.cast.q qVar2;
        ok0 ok0Var = this.f43810g;
        if (ok0Var != null) {
            ok0Var.a();
            this.f43810g = null;
        }
        ok0 ok0Var2 = new ok0(eVar, vVar, qVar, i10, vVar2, collection);
        this.f43810g = ok0Var2;
        if (ok0Var2.f29098b == 3 && (qVar2 = this.f43809f) != null) {
            v vVar3 = this.d;
            v vVar4 = (v) ok0Var2.f29102g;
            com.google.android.gms.internal.cast.q.f5430c.b("Prepare transfer from Route(%s) to Route(%s)", vVar3, vVar4);
            ?? obj = new Object();
            obj.f4122c = new Object();
            c0.k kVar = new c0.k(obj);
            c0.j jVar = kVar.f4125b;
            obj.f4121b = kVar;
            obj.f4120a = com.google.android.gms.internal.cast.o.class;
            try {
                obj.f4120a = Boolean.valueOf(qVar2.f5432b.post(new com.google.android.gms.internal.cast.p(qVar2, vVar3, vVar4, obj, 0)));
            } catch (Exception e7) {
                jVar.l(e7);
            }
            ok0 ok0Var3 = this.f43810g;
            e eVar2 = (e) ((WeakReference) ok0Var3.f29104j).get();
            if (eVar2 != null && eVar2.f43810g == ok0Var3) {
                if (((c0.k) ok0Var3.f29105k) == null) {
                    ok0Var3.f29105k = kVar;
                    org.telegram.ui.web.b bVar = new org.telegram.ui.web.b(ok0Var3, 11);
                    b bVar2 = eVar2.f43805a;
                    Objects.requireNonNull(bVar2);
                    jVar.a(bVar, new k2.a0(bVar2, 2));
                    return;
                }
                throw new IllegalStateException("future is already set");
            }
            Log.w("AxMediaRouter", "Router is released. Cancel transfer");
            ok0Var3.a();
            return;
        }
        ok0Var2.b();
    }

    public final void i(v vVar, int i10) {
        if (!this.f43812j.contains(vVar)) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select removed route: " + vVar);
        } else if (!vVar.f43929g) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select disabled route: " + vVar);
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                h3 c10 = vVar.c();
                k kVar = this.f43820r;
                if (c10 == kVar && this.d != vVar) {
                    kVar.s(vVar.f43925b);
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
        if (this.f43825x != null) {
            this.f43825x = null;
            p pVar2 = this.f43826y;
            if (pVar2 != null) {
                pVar2.h(3);
                this.f43826y.d();
                this.f43826y = null;
            }
        }
        if (f() && (pVar = vVar.f43924a.f43923e) != null && pVar.f2232b) {
            p c10 = vVar.c().c(vVar.f43925b);
            if (c10 != null) {
                Executor e7 = f0.e.e(this.h);
                l.d dVar = this.E;
                synchronized (c10.f43882a) {
                    try {
                        if (e7 != null) {
                            if (dVar != null) {
                                c10.f43883b = e7;
                                c10.f43884c = dVar;
                                ArrayList arrayList = c10.f43885e;
                                if (arrayList != null && !arrayList.isEmpty()) {
                                    m mVar = c10.d;
                                    ArrayList arrayList2 = c10.f43885e;
                                    c10.d = null;
                                    c10.f43885e = null;
                                    c10.f43883b.execute(new com.google.android.gms.internal.cast.p(c10, dVar, mVar, arrayList2, false, 2));
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
                this.f43825x = vVar;
                this.f43826y = c10;
                c10.e();
                return;
            }
            Log.w("GlobalMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + vVar);
        }
        q d = vVar.c().d(vVar.f43925b);
        if (d != null) {
            d.e();
        }
        if (this.d == null) {
            this.d = vVar;
            this.f43808e = d;
            Message obtainMessage = this.f43805a.obtainMessage(262, new q0.b(null, vVar));
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
            int i11 = vVar.f43937p;
            e2.q qVar = this.f43816n;
            qVar.f8774a = i11;
            qVar.f8775b = vVar.f43938q;
            int i12 = 0;
            if (vVar.e() && !x.g()) {
                i10 = 0;
            } else {
                i10 = vVar.f43936o;
            }
            qVar.f8776c = i10;
            qVar.d = this.d.f43934m;
            if (f() && this.d.c() == this.f43820r) {
                qVar.f8777e = k.p(this.f43808e);
            } else {
                qVar.f8777e = null;
            }
            ArrayList arrayList = this.f43815m;
            if (arrayList.size() <= 0) {
                m2.t tVar = this.C;
                if (tVar != null) {
                    v vVar2 = this.d;
                    v vVar3 = this.v;
                    if (vVar3 != null) {
                        if (vVar2 != vVar3 && vVar2 != this.f43824w) {
                            if (qVar.f8776c == 1) {
                                i12 = 2;
                            }
                            int i13 = qVar.f8775b;
                            int i14 = qVar.f8774a;
                            String str = (String) qVar.f8777e;
                            android.support.v4.media.session.c0 c0Var = (android.support.v4.media.session.c0) tVar.f15817b;
                            if (c0Var != null) {
                                androidx.emoji2.text.p pVar = (androidx.emoji2.text.p) tVar.f15818c;
                                if (pVar != null && i12 == 0 && i13 == 0) {
                                    pVar.f1364c = i14;
                                    y1.g.a(pVar.c(), i14);
                                    return;
                                }
                                ?? obj = new Object();
                                obj.f1366f = tVar;
                                obj.f1362a = i12;
                                obj.f1363b = i13;
                                obj.f1364c = i14;
                                obj.d = str;
                                tVar.f15818c = obj;
                                c0Var.f807a.f830a.setPlaybackToRemote(obj.c());
                                return;
                            }
                            return;
                        }
                        tVar.q();
                        return;
                    }
                    throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
                }
                return;
            }
            ((d) arrayList.get(0)).getClass();
            throw null;
        }
        m2.t tVar2 = this.C;
        if (tVar2 != null) {
            tVar2.q();
        }
    }

    public final void m(p4.u r20, b2.p r21) {
        throw new UnsupportedOperationException("Method not decompiled: p4.e.m(p4.u, b2.p):void");
    }

    public final int n(v vVar, m mVar) {
        int i10 = vVar.i(mVar);
        if (i10 != 0) {
            int i11 = i10 & 1;
            b bVar = this.f43805a;
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
        j0 j0Var = this.f43821s;
        ArrayList arrayList = this.f43812j;
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
                if (vVar3.c() == j0Var && vVar3.f43925b.equals("DEFAULT_ROUTE") && vVar3.f()) {
                    this.v = vVar3;
                    Log.i("GlobalMediaRouter", "Found default route: " + this.v);
                    break;
                }
            }
        }
        v vVar4 = this.f43824w;
        if (vVar4 != null && !vVar4.f()) {
            Log.i("GlobalMediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.f43824w);
            this.f43824w = null;
        }
        if (this.f43824w == null) {
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
                    this.f43824w = vVar5;
                    Log.i("GlobalMediaRouter", "Found bluetooth route: " + this.f43824w);
                    break;
                }
            }
        }
        v vVar6 = this.d;
        if (vVar6 != null && vVar6.f43929g) {
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
