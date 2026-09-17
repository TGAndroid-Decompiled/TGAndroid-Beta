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
import org.telegram.ui.Components.pk0;
import org.telegram.ui.web.u0;
public final class e {
    public static final int F = 0;
    public n A;
    public int B;
    public lf.i C;
    public android.support.v4.media.session.b0 D;
    public final k2.c0 E;
    public final s0 f40576c;
    public v d;
    public q e;
    public com.google.android.gms.internal.cast.q f40577f;
    public pk0 f40578g;
    public final Context h;
    public final e2.q f40584n;
    public final ka.c f40585o;
    public final boolean f40586p;
    public final boolean f40587q;
    public k f40588r;
    public final j0 f40589s;
    public final q1 f40590t;
    public z f40591u;
    public v v;
    public v f40592w;
    public v f40593x;
    public p f40594y;
    public n f40595z;
    public final b f40574a = new b(this);
    public final HashMap f40575b = new HashMap();
    public final ArrayList f40579i = new ArrayList();
    public final ArrayList f40580j = new ArrayList();
    public final HashMap f40581k = new HashMap();
    public final ArrayList f40582l = new ArrayList();
    public final ArrayList f40583m = new ArrayList();

    static {
        Log.isLoggable("GlobalMediaRouter", 3);
    }

    public e(android.content.Context r8) {
        throw new UnsupportedOperationException("Method not decompiled: p4.e.<init>(android.content.Context):void");
    }

    public final void a(h3 h3Var, boolean z10) {
        if (d(h3Var) == null) {
            u uVar = new u(h3Var, z10);
            this.f40582l.add(uVar);
            this.f40574a.b(513, uVar);
            m(uVar, (b2.p) h3Var.f6961n);
            x.b();
            h3Var.f6960f = this.f40585o;
            h3Var.h(this.f40595z);
        }
    }

    public final String b(u uVar, String str) {
        String C;
        String flattenToShortString = ((ComponentName) uVar.d.f13385b).flattenToShortString();
        boolean z10 = uVar.f40684c;
        if (z10) {
            C = str;
        } else {
            C = a4.a.C(flattenToShortString, ":", str);
        }
        HashMap hashMap = this.f40581k;
        if (!z10) {
            ArrayList arrayList = this.f40580j;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    if (((v) arrayList.get(i10)).f40687c.equals(C)) {
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
                            if (((v) arrayList.get(i12)).f40687c.equals(str2)) {
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
        ArrayList arrayList = this.f40580j;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v vVar = (v) obj;
            if (vVar != this.v && vVar.c() == this.f40589s && vVar.m("android.media.intent.category.LIVE_AUDIO") && !vVar.m("android.media.intent.category.LIVE_VIDEO") && vVar.f()) {
                return vVar;
            }
        }
        return this.v;
    }

    public final u d(h3 h3Var) {
        ArrayList arrayList = this.f40582l;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            u uVar = (u) obj;
            if (uVar.f40682a == h3Var) {
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
        if (this.f40587q) {
            z zVar = this.f40591u;
            if (zVar == null || zVar.f40711b) {
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
                hashSet.add(vVar.f40687c);
            }
            HashMap hashMap = this.f40575b;
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
                if (!hashMap.containsKey(vVar2.f40687c)) {
                    q e = vVar2.c().e(vVar2.f40686b, this.d.f40686b);
                    e.e();
                    hashMap.put(vVar2.f40687c, e);
                }
            }
        }
    }

    public final void h(e eVar, v vVar, q qVar, int i10, v vVar2, Collection collection) {
        com.google.android.gms.internal.cast.q qVar2;
        pk0 pk0Var = this.f40578g;
        if (pk0Var != null) {
            pk0Var.a();
            this.f40578g = null;
        }
        pk0 pk0Var2 = new pk0(eVar, vVar, qVar, i10, vVar2, collection);
        this.f40578g = pk0Var2;
        if (pk0Var2.f27061b == 3 && (qVar2 = this.f40577f) != null) {
            v vVar3 = this.d;
            v vVar4 = (v) pk0Var2.f27064g;
            com.google.android.gms.internal.cast.q.f6468c.b("Prepare transfer from Route(%s) to Route(%s)", vVar3, vVar4);
            ?? obj = new Object();
            obj.f3641c = new Object();
            c0.k kVar = new c0.k(obj);
            c0.j jVar = kVar.f3644b;
            obj.f3640b = kVar;
            obj.f3639a = com.google.android.gms.internal.cast.o.class;
            try {
                obj.f3639a = Boolean.valueOf(qVar2.f6470b.post(new com.google.android.gms.internal.cast.p(qVar2, vVar3, vVar4, obj, 0)));
            } catch (Exception e) {
                jVar.l(e);
            }
            pk0 pk0Var3 = this.f40578g;
            e eVar2 = (e) ((WeakReference) pk0Var3.f27066j).get();
            if (eVar2 != null && eVar2.f40578g == pk0Var3) {
                if (((c0.k) pk0Var3.f27067k) == null) {
                    pk0Var3.f27067k = kVar;
                    u0 u0Var = new u0(pk0Var3, 8);
                    b bVar = eVar2.f40574a;
                    Objects.requireNonNull(bVar);
                    jVar.a(u0Var, new k2.d0(bVar, 2));
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
        if (!this.f40580j.contains(vVar)) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select removed route: " + vVar);
        } else if (!vVar.f40689g) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select disabled route: " + vVar);
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                h3 c10 = vVar.c();
                k kVar = this.f40588r;
                if (c10 == kVar && this.d != vVar) {
                    kVar.s(vVar.f40686b);
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
        if (this.f40593x != null) {
            this.f40593x = null;
            p pVar2 = this.f40594y;
            if (pVar2 != null) {
                pVar2.h(3);
                this.f40594y.d();
                this.f40594y = null;
            }
        }
        if (f() && (pVar = vVar.f40685a.e) != null && pVar.f3176b) {
            p c10 = vVar.c().c(vVar.f40686b);
            if (c10 != null) {
                Executor e = f0.e.e(this.h);
                k2.c0 c0Var = this.E;
                synchronized (c10.f40648a) {
                    try {
                        if (e != null) {
                            if (c0Var != null) {
                                c10.f40649b = e;
                                c10.f40650c = c0Var;
                                ArrayList arrayList = c10.e;
                                if (arrayList != null && !arrayList.isEmpty()) {
                                    m mVar = c10.d;
                                    ArrayList arrayList2 = c10.e;
                                    c10.d = null;
                                    c10.e = null;
                                    c10.f40649b.execute(new com.google.android.gms.internal.cast.p(c10, c0Var, mVar, arrayList2, false, 2));
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
                this.f40593x = vVar;
                this.f40594y = c10;
                c10.e();
                return;
            }
            Log.w("GlobalMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + vVar);
        }
        q d = vVar.c().d(vVar.f40686b);
        if (d != null) {
            d.e();
        }
        if (this.d == null) {
            this.d = vVar;
            this.e = d;
            Message obtainMessage = this.f40574a.obtainMessage(262, new q0.b(null, vVar));
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
            int i11 = vVar.f40697p;
            e2.q qVar = this.f40584n;
            qVar.f7922a = i11;
            qVar.f7923b = vVar.f40698q;
            int i12 = 0;
            if (vVar.e() && !x.g()) {
                i10 = 0;
            } else {
                i10 = vVar.f40696o;
            }
            qVar.f7924c = i10;
            qVar.d = this.d.f40694m;
            if (f() && this.d.c() == this.f40588r) {
                qVar.e = k.p(this.e);
            } else {
                qVar.e = null;
            }
            ArrayList arrayList = this.f40583m;
            if (arrayList.size() <= 0) {
                lf.i iVar = this.C;
                if (iVar != null) {
                    v vVar2 = this.d;
                    v vVar3 = this.v;
                    if (vVar3 != null) {
                        if (vVar2 != vVar3 && vVar2 != this.f40592w) {
                            if (qVar.f7924c == 1) {
                                i12 = 2;
                            }
                            int i13 = qVar.f7923b;
                            int i14 = qVar.f7922a;
                            String str = (String) qVar.e;
                            android.support.v4.media.session.b0 b0Var = (android.support.v4.media.session.b0) iVar.f14033b;
                            if (b0Var != null) {
                                androidx.emoji2.text.o oVar = (androidx.emoji2.text.o) iVar.f14034c;
                                if (oVar != null && i12 == 0 && i13 == 0) {
                                    oVar.f2350c = i14;
                                    y1.g.a(oVar.c(), i14);
                                    return;
                                }
                                ?? obj = new Object();
                                obj.f2351f = iVar;
                                obj.f2348a = i12;
                                obj.f2349b = i13;
                                obj.f2350c = i14;
                                obj.d = str;
                                iVar.f14034c = obj;
                                b0Var.f1838a.f1860a.setPlaybackToRemote(obj.c());
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
            b bVar = this.f40574a;
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
        j0 j0Var = this.f40589s;
        ArrayList arrayList = this.f40580j;
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
                if (vVar3.c() == j0Var && vVar3.f40686b.equals("DEFAULT_ROUTE") && vVar3.f()) {
                    this.v = vVar3;
                    Log.i("GlobalMediaRouter", "Found default route: " + this.v);
                    break;
                }
            }
        }
        v vVar4 = this.f40592w;
        if (vVar4 != null && !vVar4.f()) {
            Log.i("GlobalMediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.f40592w);
            this.f40592w = null;
        }
        if (this.f40592w == null) {
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
                    this.f40592w = vVar5;
                    Log.i("GlobalMediaRouter", "Found bluetooth route: " + this.f40592w);
                    break;
                }
            }
        }
        v vVar6 = this.d;
        if (vVar6 != null && vVar6.f40689g) {
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
