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
import ji.h5;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.voip.m2;
public final class e {
    public static final int F = 0;
    public n A;
    public int B;
    public li.k C;
    public android.support.v4.media.session.b0 D;
    public final l2.f E;
    public final t0 f43010c;
    public w d;
    public q e;
    public com.google.android.gms.internal.cast.q f43011f;
    public pl0 f43012g;
    public final Context h;
    public final e2.s f43018n;
    public final h5 f43019o;
    public final boolean f43020p;
    public final boolean f43021q;
    public k f43022r;
    public final k0 f43023s;
    public final u1 f43024t;
    public a0 f43025u;
    public w v;
    public w f43026w;
    public w f43027x;
    public p f43028y;
    public n f43029z;
    public final b f43008a = new b(this);
    public final HashMap f43009b = new HashMap();
    public final ArrayList f43013i = new ArrayList();
    public final ArrayList f43014j = new ArrayList();
    public final HashMap f43015k = new HashMap();
    public final ArrayList f43016l = new ArrayList();
    public final ArrayList f43017m = new ArrayList();

    static {
        Log.isLoggable("GlobalMediaRouter", 3);
    }

    public e(android.content.Context r8) {
        throw new UnsupportedOperationException("Method not decompiled: p4.e.<init>(android.content.Context):void");
    }

    public final void a(g3 g3Var, boolean z10) {
        if (d(g3Var) == null) {
            v vVar = new v(g3Var, z10);
            this.f43016l.add(vVar);
            this.f43008a.b(513, vVar);
            m(vVar, (b2.u) g3Var.f5825n);
            y.b();
            g3Var.f5824f = this.f43019o;
            g3Var.h(this.f43029z);
        }
    }

    public final String b(v vVar, String str) {
        String D;
        String flattenToShortString = ((ComponentName) vVar.d.f13233b).flattenToShortString();
        boolean z10 = vVar.f43119c;
        if (z10) {
            D = str;
        } else {
            D = a1.g.D(flattenToShortString, ":", str);
        }
        HashMap hashMap = this.f43015k;
        if (!z10) {
            ArrayList arrayList = this.f43014j;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    if (((w) arrayList.get(i10)).f43122c.equals(D)) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                Log.w("GlobalMediaRouter", org.telegram.ui.Cells.d0.j("Either ", str, " isn't unique in ", flattenToShortString, " or we're trying to assign a unique ID for an already added route"));
                int i11 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String str2 = D + "_" + i11;
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            if (((w) arrayList.get(i12)).f43122c.equals(str2)) {
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

    public final w c() {
        ArrayList arrayList = this.f43014j;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            w wVar = (w) obj;
            if (wVar != this.v && wVar.c() == this.f43023s && wVar.m("android.media.intent.category.LIVE_AUDIO") && !wVar.m("android.media.intent.category.LIVE_VIDEO") && wVar.f()) {
                return wVar;
            }
        }
        return this.v;
    }

    public final v d(g3 g3Var) {
        ArrayList arrayList = this.f43016l;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v vVar = (v) obj;
            if (vVar.f43117a == g3Var) {
                return vVar;
            }
        }
        return null;
    }

    public final w e() {
        w wVar = this.d;
        if (wVar != null) {
            return wVar;
        }
        throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
    }

    public final boolean f() {
        if (this.f43021q) {
            a0 a0Var = this.f43025u;
            if (a0Var == null || a0Var.f42998b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void g() {
        if (this.d.e()) {
            List<w> unmodifiableList = DesugarCollections.unmodifiableList(this.d.v);
            HashSet hashSet = new HashSet();
            for (w wVar : unmodifiableList) {
                hashSet.add(wVar.f43122c);
            }
            HashMap hashMap = this.f43009b;
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
            for (w wVar2 : unmodifiableList) {
                if (!hashMap.containsKey(wVar2.f43122c)) {
                    q e = wVar2.c().e(wVar2.f43121b, this.d.f43121b);
                    e.e();
                    hashMap.put(wVar2.f43122c, e);
                }
            }
        }
    }

    public final void h(e eVar, w wVar, q qVar, int i10, w wVar2, Collection collection) {
        final com.google.android.gms.internal.cast.q qVar2;
        pl0 pl0Var = this.f43012g;
        if (pl0Var != null) {
            pl0Var.a();
            this.f43012g = null;
        }
        pl0 pl0Var2 = new pl0(eVar, wVar, qVar, i10, wVar2, collection);
        this.f43012g = pl0Var2;
        if (pl0Var2.f28360b == 3 && (qVar2 = this.f43011f) != null) {
            final w wVar3 = this.d;
            final w wVar4 = (w) pl0Var2.f28363g;
            com.google.android.gms.internal.cast.q.f5301c.b("Prepare transfer from Route(%s) to Route(%s)", wVar3, wVar4);
            c0.l a2 = v7.h0.a(new c0.j() {
                @Override
                public final Object b(c0.i iVar) {
                    q qVar3 = q.this;
                    qVar3.getClass();
                    return Boolean.valueOf(qVar3.f5303b.post(new p(qVar3, wVar3, wVar4, iVar, 0)));
                }
            });
            pl0 pl0Var3 = this.f43012g;
            e eVar2 = (e) ((WeakReference) pl0Var3.f28365j).get();
            if (eVar2 != null && eVar2.f43012g == pl0Var3) {
                if (((c0.l) pl0Var3.f28366k) == null) {
                    pl0Var3.f28366k = a2;
                    m2 m2Var = new m2(pl0Var3, 14);
                    b bVar = eVar2.f43008a;
                    Objects.requireNonNull(bVar);
                    a2.f4103b.a(m2Var, new i2.f0(bVar, 3));
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

    public final void i(w wVar, int i10) {
        if (!this.f43014j.contains(wVar)) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select removed route: " + wVar);
        } else if (!wVar.f43124g) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select disabled route: " + wVar);
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                g3 c10 = wVar.c();
                k kVar = this.f43022r;
                if (c10 == kVar && this.d != wVar) {
                    kVar.s(wVar.f43121b);
                    return;
                }
            }
            j(wVar, i10);
        }
    }

    public final void j(w wVar, int i10) {
        b2.u uVar;
        if (this.d == wVar) {
            return;
        }
        if (this.f43027x != null) {
            this.f43027x = null;
            p pVar = this.f43028y;
            if (pVar != null) {
                pVar.h(3);
                this.f43028y.d();
                this.f43028y = null;
            }
        }
        if (f() && (uVar = wVar.f43120a.e) != null && uVar.f2396b) {
            p c10 = wVar.c().c(wVar.f43121b);
            if (c10 != null) {
                Executor d = f0.c.d(this.h);
                l2.f fVar = this.E;
                synchronized (c10.f43081a) {
                    try {
                        if (d != null) {
                            if (fVar != null) {
                                c10.f43082b = d;
                                c10.f43083c = fVar;
                                ArrayList arrayList = c10.e;
                                if (arrayList != null && !arrayList.isEmpty()) {
                                    m mVar = c10.d;
                                    ArrayList arrayList2 = c10.e;
                                    c10.d = null;
                                    c10.e = null;
                                    c10.f43082b.execute(new com.google.android.gms.internal.cast.p(c10, fVar, mVar, arrayList2, false, 2));
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
                this.f43027x = wVar;
                this.f43028y = c10;
                c10.e();
                return;
            }
            Log.w("GlobalMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + wVar);
        }
        q d10 = wVar.c().d(wVar.f43121b);
        if (d10 != null) {
            d10.e();
        }
        if (this.d == null) {
            this.d = wVar;
            this.e = d10;
            Message obtainMessage = this.f43008a.obtainMessage(262, new q0.b(null, wVar));
            obtainMessage.arg1 = i10;
            obtainMessage.sendToTarget();
            return;
        }
        h(this, wVar, d10, i10, null, null);
    }

    public final void k() {
        throw new UnsupportedOperationException("Method not decompiled: p4.e.k():void");
    }

    public final void l() {
        int i10;
        w wVar = this.d;
        if (wVar != null) {
            int i11 = wVar.f43132p;
            e2.s sVar = this.f43018n;
            sVar.f8398a = i11;
            sVar.f8399b = wVar.f43133q;
            int i12 = 0;
            if (wVar.e() && !y.g()) {
                i10 = 0;
            } else {
                i10 = wVar.f43131o;
            }
            sVar.f8400c = i10;
            sVar.d = this.d.f43129m;
            if (f() && this.d.c() == this.f43022r) {
                sVar.e = k.p(this.e);
            } else {
                sVar.e = null;
            }
            ArrayList arrayList = this.f43017m;
            if (arrayList.size() <= 0) {
                li.k kVar = this.C;
                if (kVar != null) {
                    w wVar2 = this.d;
                    w wVar3 = this.v;
                    if (wVar3 != null) {
                        if (wVar2 != wVar3 && wVar2 != this.f43026w) {
                            if (sVar.f8400c == 1) {
                                i12 = 2;
                            }
                            int i13 = sVar.f8399b;
                            int i14 = sVar.f8398a;
                            String str = (String) sVar.e;
                            android.support.v4.media.session.b0 b0Var = (android.support.v4.media.session.b0) kVar.f14820b;
                            if (b0Var != null) {
                                androidx.emoji2.text.p pVar = (androidx.emoji2.text.p) kVar.f14821c;
                                if (pVar != null && i12 == 0 && i13 == 0) {
                                    pVar.f1504c = i14;
                                    y1.g.a(pVar.c(), i14);
                                    return;
                                }
                                ?? obj = new Object();
                                obj.f1505f = kVar;
                                obj.f1502a = i12;
                                obj.f1503b = i13;
                                obj.f1504c = i14;
                                obj.d = str;
                                kVar.f14821c = obj;
                                b0Var.f977a.f999a.setPlaybackToRemote(obj.c());
                                return;
                            }
                            return;
                        }
                        kVar.s();
                        return;
                    }
                    throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
                }
                return;
            }
            ((d) arrayList.get(0)).getClass();
            throw null;
        }
        li.k kVar2 = this.C;
        if (kVar2 != null) {
            kVar2.s();
        }
    }

    public final void m(p4.v r20, b2.u r21) {
        throw new UnsupportedOperationException("Method not decompiled: p4.e.m(p4.v, b2.u):void");
    }

    public final int n(w wVar, m mVar) {
        int i10 = wVar.i(mVar);
        if (i10 != 0) {
            int i11 = i10 & 1;
            b bVar = this.f43008a;
            if (i11 != 0) {
                bVar.b(259, wVar);
            }
            if ((i10 & 2) != 0) {
                bVar.b(260, wVar);
            }
            if ((i10 & 4) != 0) {
                bVar.b(261, wVar);
            }
        }
        return i10;
    }

    public final void o(boolean z10) {
        w wVar = this.v;
        if (wVar != null && !wVar.f()) {
            Log.i("GlobalMediaRouter", "Clearing the default route because it is no longer selectable: " + this.v);
            this.v = null;
        }
        w wVar2 = this.v;
        k0 k0Var = this.f43023s;
        ArrayList arrayList = this.f43014j;
        if (wVar2 == null) {
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                Object obj = arrayList.get(i10);
                i10++;
                w wVar3 = (w) obj;
                if (wVar3.c() == k0Var && wVar3.f43121b.equals("DEFAULT_ROUTE") && wVar3.f()) {
                    this.v = wVar3;
                    Log.i("GlobalMediaRouter", "Found default route: " + this.v);
                    break;
                }
            }
        }
        w wVar4 = this.f43026w;
        if (wVar4 != null && !wVar4.f()) {
            Log.i("GlobalMediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.f43026w);
            this.f43026w = null;
        }
        if (this.f43026w == null) {
            int size2 = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    break;
                }
                Object obj2 = arrayList.get(i11);
                i11++;
                w wVar5 = (w) obj2;
                if (wVar5.c() == k0Var && wVar5.m("android.media.intent.category.LIVE_AUDIO") && !wVar5.m("android.media.intent.category.LIVE_VIDEO") && wVar5.f()) {
                    this.f43026w = wVar5;
                    Log.i("GlobalMediaRouter", "Found bluetooth route: " + this.f43026w);
                    break;
                }
            }
        }
        w wVar6 = this.d;
        if (wVar6 != null && wVar6.f43124g) {
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
