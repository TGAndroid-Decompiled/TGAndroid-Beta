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
import org.telegram.ui.Components.cl0;
public final class e {
    public static final int F = 0;
    public n A;
    public int B;
    public la.h C;
    public android.support.v4.media.session.b0 D;
    public final ka.c E;
    public final s0 f40920c;
    public v d;
    public q e;
    public com.google.android.gms.internal.cast.q f40921f;
    public cl0 f40922g;
    public final Context h;
    public final e2.q f40928n;
    public final l.d f40929o;
    public final boolean f40930p;
    public final boolean f40931q;
    public k f40932r;
    public final j0 f40933s;
    public final r1 f40934t;
    public z f40935u;
    public v v;
    public v f40936w;
    public v f40937x;
    public p f40938y;
    public n f40939z;
    public final b f40918a = new b(this);
    public final HashMap f40919b = new HashMap();
    public final ArrayList f40923i = new ArrayList();
    public final ArrayList f40924j = new ArrayList();
    public final HashMap f40925k = new HashMap();
    public final ArrayList f40926l = new ArrayList();
    public final ArrayList f40927m = new ArrayList();

    static {
        Log.isLoggable("GlobalMediaRouter", 3);
    }

    public e(android.content.Context r8) {
        throw new UnsupportedOperationException("Method not decompiled: p4.e.<init>(android.content.Context):void");
    }

    public final void a(h3 h3Var, boolean z10) {
        if (d(h3Var) == null) {
            u uVar = new u(h3Var, z10);
            this.f40926l.add(uVar);
            this.f40918a.b(513, uVar);
            m(uVar, (b2.p) h3Var.f6956n);
            x.b();
            h3Var.f6955f = this.f40929o;
            h3Var.h(this.f40939z);
        }
    }

    public final String b(u uVar, String str) {
        String D;
        String flattenToShortString = ((ComponentName) uVar.d.f15132b).flattenToShortString();
        boolean z10 = uVar.f41028c;
        if (z10) {
            D = str;
        } else {
            D = a4.a.D(flattenToShortString, ":", str);
        }
        HashMap hashMap = this.f40925k;
        if (!z10) {
            ArrayList arrayList = this.f40924j;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    if (((v) arrayList.get(i10)).f41031c.equals(D)) {
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
                            if (((v) arrayList.get(i12)).f41031c.equals(str2)) {
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
        ArrayList arrayList = this.f40924j;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v vVar = (v) obj;
            if (vVar != this.v && vVar.c() == this.f40933s && vVar.m("android.media.intent.category.LIVE_AUDIO") && !vVar.m("android.media.intent.category.LIVE_VIDEO") && vVar.f()) {
                return vVar;
            }
        }
        return this.v;
    }

    public final u d(h3 h3Var) {
        ArrayList arrayList = this.f40926l;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            u uVar = (u) obj;
            if (uVar.f41026a == h3Var) {
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
        if (this.f40931q) {
            z zVar = this.f40935u;
            if (zVar == null || zVar.f41055b) {
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
                hashSet.add(vVar.f41031c);
            }
            HashMap hashMap = this.f40919b;
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
                if (!hashMap.containsKey(vVar2.f41031c)) {
                    q e = vVar2.c().e(vVar2.f41030b, this.d.f41030b);
                    e.e();
                    hashMap.put(vVar2.f41031c, e);
                }
            }
        }
    }

    public final void h(e eVar, v vVar, q qVar, int i10, v vVar2, Collection collection) {
        com.google.android.gms.internal.cast.q qVar2;
        cl0 cl0Var = this.f40922g;
        if (cl0Var != null) {
            cl0Var.a();
            this.f40922g = null;
        }
        cl0 cl0Var2 = new cl0(eVar, vVar, qVar, i10, vVar2, collection);
        this.f40922g = cl0Var2;
        if (cl0Var2.f23356b == 3 && (qVar2 = this.f40921f) != null) {
            v vVar3 = this.d;
            v vVar4 = (v) cl0Var2.f23359g;
            com.google.android.gms.internal.cast.q.f6463c.b("Prepare transfer from Route(%s) to Route(%s)", vVar3, vVar4);
            ?? obj = new Object();
            obj.f3640c = new Object();
            c0.k kVar = new c0.k(obj);
            c0.j jVar = kVar.f3643b;
            obj.f3639b = kVar;
            obj.f3638a = com.google.android.gms.internal.cast.o.class;
            try {
                obj.f3638a = Boolean.valueOf(qVar2.f6465b.post(new com.google.android.gms.internal.cast.p(qVar2, vVar3, vVar4, obj, 0)));
            } catch (Exception e) {
                jVar.l(e);
            }
            cl0 cl0Var3 = this.f40922g;
            e eVar2 = (e) ((WeakReference) cl0Var3.f23361j).get();
            if (eVar2 != null && eVar2.f40922g == cl0Var3) {
                if (((c0.k) cl0Var3.f23362k) == null) {
                    cl0Var3.f23362k = kVar;
                    org.telegram.ui.web.q0 q0Var = new org.telegram.ui.web.q0(cl0Var3, 9);
                    b bVar = eVar2.f40918a;
                    Objects.requireNonNull(bVar);
                    jVar.a(q0Var, new k2.b0(bVar, 2));
                    return;
                }
                throw new IllegalStateException("future is already set");
            }
            Log.w("AxMediaRouter", "Router is released. Cancel transfer");
            cl0Var3.a();
            return;
        }
        cl0Var2.b();
    }

    public final void i(v vVar, int i10) {
        if (!this.f40924j.contains(vVar)) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select removed route: " + vVar);
        } else if (!vVar.f41033g) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select disabled route: " + vVar);
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                h3 c10 = vVar.c();
                k kVar = this.f40932r;
                if (c10 == kVar && this.d != vVar) {
                    kVar.s(vVar.f41030b);
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
        if (this.f40937x != null) {
            this.f40937x = null;
            p pVar2 = this.f40938y;
            if (pVar2 != null) {
                pVar2.h(3);
                this.f40938y.d();
                this.f40938y = null;
            }
        }
        if (f() && (pVar = vVar.f41029a.e) != null && pVar.f3175b) {
            p c10 = vVar.c().c(vVar.f41030b);
            if (c10 != null) {
                Executor e = f0.e.e(this.h);
                ka.c cVar = this.E;
                synchronized (c10.f40992a) {
                    try {
                        if (e != null) {
                            if (cVar != null) {
                                c10.f40993b = e;
                                c10.f40994c = cVar;
                                ArrayList arrayList = c10.e;
                                if (arrayList != null && !arrayList.isEmpty()) {
                                    m mVar = c10.d;
                                    ArrayList arrayList2 = c10.e;
                                    c10.d = null;
                                    c10.e = null;
                                    c10.f40993b.execute(new com.google.android.gms.internal.cast.p(c10, cVar, mVar, arrayList2, false, 2));
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
                this.f40937x = vVar;
                this.f40938y = c10;
                c10.e();
                return;
            }
            Log.w("GlobalMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + vVar);
        }
        q d = vVar.c().d(vVar.f41030b);
        if (d != null) {
            d.e();
        }
        if (this.d == null) {
            this.d = vVar;
            this.e = d;
            Message obtainMessage = this.f40918a.obtainMessage(262, new q0.b(null, vVar));
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
            int i11 = vVar.f41041p;
            e2.q qVar = this.f40928n;
            qVar.f7916a = i11;
            qVar.f7917b = vVar.f41042q;
            int i12 = 0;
            if (vVar.e() && !x.g()) {
                i10 = 0;
            } else {
                i10 = vVar.f41040o;
            }
            qVar.f7918c = i10;
            qVar.d = this.d.f41038m;
            if (f() && this.d.c() == this.f40932r) {
                qVar.e = k.p(this.e);
            } else {
                qVar.e = null;
            }
            ArrayList arrayList = this.f40927m;
            if (arrayList.size() <= 0) {
                la.h hVar = this.C;
                if (hVar != null) {
                    v vVar2 = this.d;
                    v vVar3 = this.v;
                    if (vVar3 != null) {
                        if (vVar2 != vVar3 && vVar2 != this.f40936w) {
                            if (qVar.f7918c == 1) {
                                i12 = 2;
                            }
                            int i13 = qVar.f7917b;
                            int i14 = qVar.f7916a;
                            String str = (String) qVar.e;
                            android.support.v4.media.session.b0 b0Var = (android.support.v4.media.session.b0) hVar.f14182b;
                            if (b0Var != null) {
                                androidx.emoji2.text.o oVar = (androidx.emoji2.text.o) hVar.f14183c;
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
                                hVar.f14183c = obj;
                                b0Var.f1837a.f1859a.setPlaybackToRemote(obj.c());
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
            b bVar = this.f40918a;
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
        j0 j0Var = this.f40933s;
        ArrayList arrayList = this.f40924j;
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
                if (vVar3.c() == j0Var && vVar3.f41030b.equals("DEFAULT_ROUTE") && vVar3.f()) {
                    this.v = vVar3;
                    Log.i("GlobalMediaRouter", "Found default route: " + this.v);
                    break;
                }
            }
        }
        v vVar4 = this.f40936w;
        if (vVar4 != null && !vVar4.f()) {
            Log.i("GlobalMediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.f40936w);
            this.f40936w = null;
        }
        if (this.f40936w == null) {
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
                    this.f40936w = vVar5;
                    Log.i("GlobalMediaRouter", "Found bluetooth route: " + this.f40936w);
                    break;
                }
            }
        }
        v vVar6 = this.d;
        if (vVar6 != null && vVar6.f41033g) {
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
