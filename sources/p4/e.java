package p4;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.vision.g3;
import i2.u1;
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
import ji.w4;
import m.h3;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.voip.r2;
public final class e {
    public static final int F = 0;
    public n A;
    public int B;
    public h3 C;
    public android.support.v4.media.session.b0 D;
    public final m.h E;
    public final t0 f42707c;
    public v d;
    public q e;
    public com.google.android.gms.internal.cast.q f42708f;
    public pl0 f42709g;
    public final Context h;
    public final e2.s f42715n;
    public final w4 f42716o;
    public final boolean f42717p;
    public final boolean f42718q;
    public k f42719r;
    public final j0 f42720s;
    public final u1 f42721t;
    public z f42722u;
    public v v;
    public v f42723w;
    public v f42724x;
    public p f42725y;
    public n f42726z;
    public final b f42705a = new b(this);
    public final HashMap f42706b = new HashMap();
    public final ArrayList f42710i = new ArrayList();
    public final ArrayList f42711j = new ArrayList();
    public final HashMap f42712k = new HashMap();
    public final ArrayList f42713l = new ArrayList();
    public final ArrayList f42714m = new ArrayList();

    static {
        Log.isLoggable("GlobalMediaRouter", 3);
    }

    public e(android.content.Context r8) {
        throw new UnsupportedOperationException("Method not decompiled: p4.e.<init>(android.content.Context):void");
    }

    public final void a(g3 g3Var, boolean z10) {
        if (d(g3Var) == null) {
            u uVar = new u(g3Var, z10);
            this.f42713l.add(uVar);
            this.f42705a.b(513, uVar);
            m(uVar, (b2.u) g3Var.f5828n);
            x.b();
            g3Var.f5827f = this.f42716o;
            g3Var.h(this.f42726z);
        }
    }

    public final String b(u uVar, String str) {
        String D;
        String flattenToShortString = ((ComponentName) uVar.d.f13315b).flattenToShortString();
        boolean z10 = uVar.f42815c;
        if (z10) {
            D = str;
        } else {
            D = a1.g.D(flattenToShortString, ":", str);
        }
        HashMap hashMap = this.f42712k;
        if (!z10) {
            ArrayList arrayList = this.f42711j;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    if (((v) arrayList.get(i10)).f42820c.equals(D)) {
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
                            if (((v) arrayList.get(i12)).f42820c.equals(str2)) {
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
        ArrayList arrayList = this.f42711j;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v vVar = (v) obj;
            if (vVar != this.v && vVar.c() == this.f42720s && vVar.m("android.media.intent.category.LIVE_AUDIO") && !vVar.m("android.media.intent.category.LIVE_VIDEO") && vVar.f()) {
                return vVar;
            }
        }
        return this.v;
    }

    public final u d(g3 g3Var) {
        ArrayList arrayList = this.f42713l;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            u uVar = (u) obj;
            if (uVar.f42813a == g3Var) {
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
        if (this.f42718q) {
            z zVar = this.f42722u;
            if (zVar == null || zVar.f42844b) {
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
                hashSet.add(vVar.f42820c);
            }
            HashMap hashMap = this.f42706b;
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
                if (!hashMap.containsKey(vVar2.f42820c)) {
                    q e = vVar2.c().e(vVar2.f42819b, this.d.f42819b);
                    e.e();
                    hashMap.put(vVar2.f42820c, e);
                }
            }
        }
    }

    public final void h(e eVar, v vVar, q qVar, int i10, v vVar2, Collection collection) {
        final com.google.android.gms.internal.cast.q qVar2;
        pl0 pl0Var = this.f42709g;
        if (pl0Var != null) {
            pl0Var.a();
            this.f42709g = null;
        }
        pl0 pl0Var2 = new pl0(eVar, vVar, qVar, i10, vVar2, collection);
        this.f42709g = pl0Var2;
        if (pl0Var2.f28051b == 3 && (qVar2 = this.f42708f) != null) {
            final v vVar3 = this.d;
            final v vVar4 = (v) pl0Var2.f28054g;
            com.google.android.gms.internal.cast.q.f5304c.b("Prepare transfer from Route(%s) to Route(%s)", vVar3, vVar4);
            c0.l a2 = v7.h0.a(new c0.j() {
                @Override
                public final Object b(c0.i iVar) {
                    q qVar3 = q.this;
                    qVar3.getClass();
                    return Boolean.valueOf(qVar3.f5306b.post(new p(qVar3, vVar3, vVar4, iVar, 0)));
                }
            });
            pl0 pl0Var3 = this.f42709g;
            e eVar2 = (e) ((WeakReference) pl0Var3.f28056j).get();
            if (eVar2 != null && eVar2.f42709g == pl0Var3) {
                if (((c0.l) pl0Var3.f28057k) == null) {
                    pl0Var3.f28057k = a2;
                    r2 r2Var = new r2(pl0Var3, 13);
                    b bVar = eVar2.f42705a;
                    Objects.requireNonNull(bVar);
                    a2.f4107b.a(r2Var, new i2.f0(bVar, 3));
                    return;
                }
                throw new IllegalStateException("future is already set");
            }
            Log.w("AxMediaRouter", "Router is released. Cancel transfer");
            pl0Var3.a();
            return;
        }
        pl0Var2.b();
    }

    public final void i(v vVar, int i10) {
        if (!this.f42711j.contains(vVar)) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select removed route: " + vVar);
        } else if (!vVar.f42822g) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select disabled route: " + vVar);
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                g3 c10 = vVar.c();
                k kVar = this.f42719r;
                if (c10 == kVar && this.d != vVar) {
                    kVar.s(vVar.f42819b);
                    return;
                }
            }
            j(vVar, i10);
        }
    }

    public final void j(v vVar, int i10) {
        b2.u uVar;
        if (this.d == vVar) {
            return;
        }
        if (this.f42724x != null) {
            this.f42724x = null;
            p pVar = this.f42725y;
            if (pVar != null) {
                pVar.h(3);
                this.f42725y.d();
                this.f42725y = null;
            }
        }
        if (f() && (uVar = vVar.f42818a.e) != null && uVar.f2400b) {
            p c10 = vVar.c().c(vVar.f42819b);
            if (c10 != null) {
                Executor d = f0.c.d(this.h);
                m.h hVar = this.E;
                synchronized (c10.f42779a) {
                    try {
                        if (d != null) {
                            if (hVar != null) {
                                c10.f42780b = d;
                                c10.f42781c = hVar;
                                ArrayList arrayList = c10.e;
                                if (arrayList != null && !arrayList.isEmpty()) {
                                    m mVar = c10.d;
                                    ArrayList arrayList2 = c10.e;
                                    c10.d = null;
                                    c10.e = null;
                                    c10.f42780b.execute(new com.google.android.gms.internal.cast.p(c10, hVar, mVar, arrayList2, false, 2));
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
                this.f42724x = vVar;
                this.f42725y = c10;
                c10.e();
                return;
            }
            Log.w("GlobalMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + vVar);
        }
        q d10 = vVar.c().d(vVar.f42819b);
        if (d10 != null) {
            d10.e();
        }
        if (this.d == null) {
            this.d = vVar;
            this.e = d10;
            Message obtainMessage = this.f42705a.obtainMessage(262, new q0.b(null, vVar));
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
            int i11 = vVar.f42830p;
            e2.s sVar = this.f42715n;
            sVar.f8401a = i11;
            sVar.f8402b = vVar.f42831q;
            int i12 = 0;
            if (vVar.e() && !x.g()) {
                i10 = 0;
            } else {
                i10 = vVar.f42829o;
            }
            sVar.f8403c = i10;
            sVar.d = this.d.f42827m;
            if (f() && this.d.c() == this.f42719r) {
                sVar.e = k.p(this.e);
            } else {
                sVar.e = null;
            }
            ArrayList arrayList = this.f42714m;
            if (arrayList.size() <= 0) {
                h3 h3Var = this.C;
                if (h3Var != null) {
                    v vVar2 = this.d;
                    v vVar3 = this.v;
                    if (vVar3 != null) {
                        if (vVar2 != vVar3 && vVar2 != this.f42723w) {
                            if (sVar.f8403c == 1) {
                                i12 = 2;
                            }
                            int i13 = sVar.f8402b;
                            int i14 = sVar.f8401a;
                            String str = (String) sVar.e;
                            android.support.v4.media.session.b0 b0Var = (android.support.v4.media.session.b0) h3Var.f14850b;
                            if (b0Var != null) {
                                androidx.emoji2.text.p pVar = (androidx.emoji2.text.p) h3Var.f14851c;
                                if (pVar != null && i12 == 0 && i13 == 0) {
                                    pVar.f1508c = i14;
                                    y1.g.a(pVar.c(), i14);
                                    return;
                                }
                                ?? obj = new Object();
                                obj.f1509f = h3Var;
                                obj.f1506a = i12;
                                obj.f1507b = i13;
                                obj.f1508c = i14;
                                obj.d = str;
                                h3Var.f14851c = obj;
                                b0Var.f981a.f1003a.setPlaybackToRemote(obj.c());
                                return;
                            }
                            return;
                        }
                        h3Var.t();
                        return;
                    }
                    throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
                }
                return;
            }
            ((d) arrayList.get(0)).getClass();
            throw null;
        }
        h3 h3Var2 = this.C;
        if (h3Var2 != null) {
            h3Var2.t();
        }
    }

    public final void m(p4.u r20, b2.u r21) {
        throw new UnsupportedOperationException("Method not decompiled: p4.e.m(p4.u, b2.u):void");
    }

    public final int n(v vVar, m mVar) {
        int i10 = vVar.i(mVar);
        if (i10 != 0) {
            int i11 = i10 & 1;
            b bVar = this.f42705a;
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
        j0 j0Var = this.f42720s;
        ArrayList arrayList = this.f42711j;
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
                if (vVar3.c() == j0Var && vVar3.f42819b.equals("DEFAULT_ROUTE") && vVar3.f()) {
                    this.v = vVar3;
                    Log.i("GlobalMediaRouter", "Found default route: " + this.v);
                    break;
                }
            }
        }
        v vVar4 = this.f42723w;
        if (vVar4 != null && !vVar4.f()) {
            Log.i("GlobalMediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.f42723w);
            this.f42723w = null;
        }
        if (this.f42723w == null) {
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
                    this.f42723w = vVar5;
                    Log.i("GlobalMediaRouter", "Found bluetooth route: " + this.f42723w);
                    break;
                }
            }
        }
        v vVar6 = this.d;
        if (vVar6 != null && vVar6.f42822g) {
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
