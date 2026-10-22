package p4;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.util.Log;
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
import k2.w0;
import ki.t1;
import m.g3;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.web.z1;
public final class e {
    public static final int F = 0;
    public n A;
    public int B;
    public g3 C;
    public android.support.v4.media.session.b0 D;
    public final w0 E;
    public final s0 f44102c;
    public v d;
    public q e;
    public com.google.android.gms.internal.cast.q f44103f;
    public ml0 f44104g;
    public final Context h;
    public final e2.s f44110n;
    public final t1 f44111o;
    public final boolean f44112p;
    public final boolean f44113q;
    public k f44114r;
    public final j0 f44115s;
    public final i2.t1 f44116t;
    public z f44117u;
    public v v;
    public v f44118w;
    public v f44119x;
    public p f44120y;
    public n f44121z;
    public final b f44100a = new b(this);
    public final HashMap f44101b = new HashMap();
    public final ArrayList f44105i = new ArrayList();
    public final ArrayList f44106j = new ArrayList();
    public final HashMap f44107k = new HashMap();
    public final ArrayList f44108l = new ArrayList();
    public final ArrayList f44109m = new ArrayList();

    static {
        Log.isLoggable("GlobalMediaRouter", 3);
    }

    public e(android.content.Context r8) {
        throw new UnsupportedOperationException("Method not decompiled: p4.e.<init>(android.content.Context):void");
    }

    public final void a(com.google.android.gms.internal.vision.g3 g3Var, boolean z10) {
        if (d(g3Var) == null) {
            u uVar = new u(g3Var, z10);
            this.f44108l.add(uVar);
            this.f44100a.b(513, uVar);
            m(uVar, (b2.t) g3Var.f7282n);
            x.b();
            g3Var.f7281f = this.f44111o;
            g3Var.h(this.f44121z);
        }
    }

    public final String b(u uVar, String str) {
        String C;
        String flattenToShortString = ((ComponentName) uVar.d.f16009b).flattenToShortString();
        boolean z10 = uVar.f44210c;
        if (z10) {
            C = str;
        } else {
            C = a1.g.C(flattenToShortString, ":", str);
        }
        HashMap hashMap = this.f44107k;
        if (!z10) {
            ArrayList arrayList = this.f44106j;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    if (((v) arrayList.get(i10)).f44213c.equals(C)) {
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
                            if (((v) arrayList.get(i12)).f44213c.equals(str2)) {
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
        ArrayList arrayList = this.f44106j;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v vVar = (v) obj;
            if (vVar != this.v && vVar.c() == this.f44115s && vVar.m("android.media.intent.category.LIVE_AUDIO") && !vVar.m("android.media.intent.category.LIVE_VIDEO") && vVar.f()) {
                return vVar;
            }
        }
        return this.v;
    }

    public final u d(com.google.android.gms.internal.vision.g3 g3Var) {
        ArrayList arrayList = this.f44108l;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            u uVar = (u) obj;
            if (uVar.f44208a == g3Var) {
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
        if (this.f44113q) {
            z zVar = this.f44117u;
            if (zVar == null || zVar.f44237b) {
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
                hashSet.add(vVar.f44213c);
            }
            HashMap hashMap = this.f44101b;
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
                if (!hashMap.containsKey(vVar2.f44213c)) {
                    q e = vVar2.c().e(vVar2.f44212b, this.d.f44212b);
                    e.e();
                    hashMap.put(vVar2.f44213c, e);
                }
            }
        }
    }

    public final void h(e eVar, v vVar, q qVar, int i10, v vVar2, Collection collection) {
        final com.google.android.gms.internal.cast.q qVar2;
        ml0 ml0Var = this.f44104g;
        if (ml0Var != null) {
            ml0Var.a();
            this.f44104g = null;
        }
        ml0 ml0Var2 = new ml0(eVar, vVar, qVar, i10, vVar2, collection);
        this.f44104g = ml0Var2;
        if (ml0Var2.f28547b == 3 && (qVar2 = this.f44103f) != null) {
            final v vVar3 = this.d;
            final v vVar4 = (v) ml0Var2.f28550g;
            com.google.android.gms.internal.cast.q.f6756c.b("Prepare transfer from Route(%s) to Route(%s)", vVar3, vVar4);
            c0.l a2 = v7.h0.a(new c0.j() {
                @Override
                public final Object a(c0.i iVar) {
                    q qVar3 = q.this;
                    qVar3.getClass();
                    return Boolean.valueOf(qVar3.f6758b.post(new p(qVar3, vVar3, vVar4, iVar, 0)));
                }
            });
            ml0 ml0Var3 = this.f44104g;
            e eVar2 = (e) ((WeakReference) ml0Var3.f28552j).get();
            if (eVar2 != null && eVar2.f44104g == ml0Var3) {
                if (((c0.l) ml0Var3.f28553k) == null) {
                    ml0Var3.f28553k = a2;
                    z1 z1Var = new z1(ml0Var3, 3);
                    b bVar = eVar2.f44100a;
                    Objects.requireNonNull(bVar);
                    a2.f4474b.a(z1Var, new i2.g0(bVar, 3));
                    return;
                }
                throw new IllegalStateException("future is already set");
            }
            Log.w("AxMediaRouter", "Router is released. Cancel transfer");
            ml0Var3.a();
            return;
        }
        ml0Var2.b();
    }

    public final void i(v vVar, int i10) {
        if (!this.f44106j.contains(vVar)) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select removed route: " + vVar);
        } else if (!vVar.f44215g) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select disabled route: " + vVar);
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                com.google.android.gms.internal.vision.g3 c10 = vVar.c();
                k kVar = this.f44114r;
                if (c10 == kVar && this.d != vVar) {
                    kVar.s(vVar.f44212b);
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
        if (this.f44119x != null) {
            this.f44119x = null;
            p pVar = this.f44120y;
            if (pVar != null) {
                pVar.h(3);
                this.f44120y.d();
                this.f44120y = null;
            }
        }
        if (f() && (tVar = vVar.f44211a.e) != null && tVar.f4005b) {
            p c10 = vVar.c().c(vVar.f44212b);
            if (c10 != null) {
                Executor d = f0.c.d(this.h);
                w0 w0Var = this.E;
                synchronized (c10.f44174a) {
                    try {
                        if (d != null) {
                            if (w0Var != null) {
                                c10.f44175b = d;
                                c10.f44176c = w0Var;
                                ArrayList arrayList = c10.e;
                                if (arrayList != null && !arrayList.isEmpty()) {
                                    m mVar = c10.d;
                                    ArrayList arrayList2 = c10.e;
                                    c10.d = null;
                                    c10.e = null;
                                    c10.f44175b.execute(new com.google.android.gms.internal.cast.p(c10, w0Var, mVar, arrayList2, false, 2));
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
                this.f44119x = vVar;
                this.f44120y = c10;
                c10.e();
                return;
            }
            Log.w("GlobalMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + vVar);
        }
        q d10 = vVar.c().d(vVar.f44212b);
        if (d10 != null) {
            d10.e();
        }
        if (this.d == null) {
            this.d = vVar;
            this.e = d10;
            Message obtainMessage = this.f44100a.obtainMessage(262, new q0.b(null, vVar));
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
            int i11 = vVar.f44223p;
            e2.s sVar = this.f44110n;
            sVar.f8278a = i11;
            sVar.f8279b = vVar.f44224q;
            int i12 = 0;
            if (vVar.e() && !x.g()) {
                i10 = 0;
            } else {
                i10 = vVar.f44222o;
            }
            sVar.f8280c = i10;
            sVar.d = this.d.f44220m;
            if (f() && this.d.c() == this.f44114r) {
                sVar.e = k.p(this.e);
            } else {
                sVar.e = null;
            }
            ArrayList arrayList = this.f44109m;
            if (arrayList.size() <= 0) {
                g3 g3Var = this.C;
                if (g3Var != null) {
                    v vVar2 = this.d;
                    v vVar3 = this.v;
                    if (vVar3 != null) {
                        if (vVar2 != vVar3 && vVar2 != this.f44118w) {
                            if (sVar.f8280c == 1) {
                                i12 = 2;
                            }
                            int i13 = sVar.f8279b;
                            int i14 = sVar.f8278a;
                            String str = (String) sVar.e;
                            android.support.v4.media.session.b0 b0Var = (android.support.v4.media.session.b0) g3Var.f16202b;
                            if (b0Var != null) {
                                androidx.emoji2.text.p pVar = (androidx.emoji2.text.p) g3Var.f16203c;
                                if (pVar != null && i12 == 0 && i13 == 0) {
                                    pVar.f3116c = i14;
                                    y1.g.a(pVar.c(), i14);
                                    return;
                                }
                                ?? obj = new Object();
                                obj.f3117f = g3Var;
                                obj.f3114a = i12;
                                obj.f3115b = i13;
                                obj.f3116c = i14;
                                obj.d = str;
                                g3Var.f16203c = obj;
                                b0Var.f2596a.f2618a.setPlaybackToRemote(obj.c());
                                return;
                            }
                            return;
                        }
                        g3Var.t();
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
            g3Var2.t();
        }
    }

    public final void m(p4.u r20, b2.t r21) {
        throw new UnsupportedOperationException("Method not decompiled: p4.e.m(p4.u, b2.t):void");
    }

    public final int n(v vVar, m mVar) {
        int i10 = vVar.i(mVar);
        if (i10 != 0) {
            int i11 = i10 & 1;
            b bVar = this.f44100a;
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
        j0 j0Var = this.f44115s;
        ArrayList arrayList = this.f44106j;
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
                if (vVar3.c() == j0Var && vVar3.f44212b.equals("DEFAULT_ROUTE") && vVar3.f()) {
                    this.v = vVar3;
                    Log.i("GlobalMediaRouter", "Found default route: " + this.v);
                    break;
                }
            }
        }
        v vVar4 = this.f44118w;
        if (vVar4 != null && !vVar4.f()) {
            Log.i("GlobalMediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.f44118w);
            this.f44118w = null;
        }
        if (this.f44118w == null) {
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
                    this.f44118w = vVar5;
                    Log.i("GlobalMediaRouter", "Found bluetooth route: " + this.f44118w);
                    break;
                }
            }
        }
        v vVar6 = this.d;
        if (vVar6 != null && vVar6.f44215g) {
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
