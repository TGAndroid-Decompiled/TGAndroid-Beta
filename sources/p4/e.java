package p4;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.vision.g3;
import i2.w1;
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
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.wj0;
import v7.e5;
public final class e {
    public static final int F = 0;
    public n A;
    public int B;
    public li.k C;
    public android.support.v4.media.session.a0 D;
    public final n2.u E;
    public final t0 f44723c;
    public w d;
    public q e;
    public com.google.android.gms.internal.cast.p f44724f;
    public wj0 f44725g;
    public final Context h;
    public final e2.s f44731n;
    public final m2.t f44732o;
    public final boolean f44733p;
    public final boolean f44734q;
    public k f44735r;
    public final k0 f44736s;
    public final w1 f44737t;
    public a0 f44738u;
    public w v;
    public w f44739w;
    public w f44740x;
    public p f44741y;
    public n f44742z;
    public final b f44721a = new b(this);
    public final HashMap f44722b = new HashMap();
    public final ArrayList f44726i = new ArrayList();
    public final ArrayList f44727j = new ArrayList();
    public final HashMap f44728k = new HashMap();
    public final ArrayList f44729l = new ArrayList();
    public final ArrayList f44730m = new ArrayList();

    static {
        Log.isLoggable("GlobalMediaRouter", 3);
    }

    public e(android.content.Context r8) {
        throw new UnsupportedOperationException("Method not decompiled: p4.e.<init>(android.content.Context):void");
    }

    public final void a(g3 g3Var, boolean z10) {
        if (d(g3Var) == null) {
            v vVar = new v(g3Var, z10);
            this.f44729l.add(vVar);
            this.f44721a.b(513, vVar);
            m(vVar, (b2.u) g3Var.f5275n);
            y.b();
            g3Var.f5274f = this.f44732o;
            g3Var.h(this.f44742z);
        }
    }

    public final String b(v vVar, String str) {
        String C;
        String flattenToShortString = ((ComponentName) vVar.d.f11588b).flattenToShortString();
        boolean z10 = vVar.f44833c;
        if (z10) {
            C = str;
        } else {
            C = a1.g.C(flattenToShortString, ":", str);
        }
        HashMap hashMap = this.f44728k;
        if (!z10) {
            ArrayList arrayList = this.f44727j;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    if (((w) arrayList.get(i10)).f44836c.equals(C)) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                Log.w("GlobalMediaRouter", f1.o("Either ", str, " isn't unique in ", flattenToShortString, " or we're trying to assign a unique ID for an already added route"));
                int i11 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String str2 = C + "_" + i11;
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            if (((w) arrayList.get(i12)).f44836c.equals(str2)) {
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

    public final w c() {
        ArrayList arrayList = this.f44727j;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            w wVar = (w) obj;
            if (wVar != this.v && wVar.c() == this.f44736s && wVar.m("android.media.intent.category.LIVE_AUDIO") && !wVar.m("android.media.intent.category.LIVE_VIDEO") && wVar.f()) {
                return wVar;
            }
        }
        return this.v;
    }

    public final v d(g3 g3Var) {
        ArrayList arrayList = this.f44729l;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v vVar = (v) obj;
            if (vVar.f44831a == g3Var) {
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
        if (this.f44734q) {
            a0 a0Var = this.f44738u;
            if (a0Var == null || a0Var.f44711b) {
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
                hashSet.add(wVar.f44836c);
            }
            HashMap hashMap = this.f44722b;
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
                if (!hashMap.containsKey(wVar2.f44836c)) {
                    q e = wVar2.c().e(wVar2.f44835b, this.d.f44835b);
                    e.e();
                    hashMap.put(wVar2.f44836c, e);
                }
            }
        }
    }

    public final void h(e eVar, w wVar, q qVar, int i10, w wVar2, Collection collection) {
        final com.google.android.gms.internal.cast.p pVar;
        wj0 wj0Var = this.f44725g;
        if (wj0Var != null) {
            wj0Var.a();
            this.f44725g = null;
        }
        wj0 wj0Var2 = new wj0(eVar, wVar, qVar, i10, wVar2, collection);
        this.f44725g = wj0Var2;
        if (wj0Var2.f32267b == 3 && (pVar = this.f44724f) != null) {
            final w wVar3 = this.d;
            final w wVar4 = (w) wj0Var2.f32270g;
            com.google.android.gms.internal.cast.p.f4730c.b("Prepare transfer from Route(%s) to Route(%s)", wVar3, wVar4);
            c0.l a2 = e5.a(new c0.j() {
                @Override
                public final Object d(c0.i iVar) {
                    p pVar2 = p.this;
                    pVar2.getClass();
                    return Boolean.valueOf(pVar2.f4732b.post(new o(pVar2, wVar3, wVar4, iVar, 0)));
                }
            });
            wj0 wj0Var3 = this.f44725g;
            e eVar2 = (e) ((WeakReference) wj0Var3.f32272j).get();
            if (eVar2 != null && eVar2.f44725g == wj0Var3) {
                if (((c0.l) wj0Var3.f32273k) == null) {
                    wj0Var3.f32273k = a2;
                    w5 w5Var = new w5(wj0Var3, 23);
                    b bVar = eVar2.f44721a;
                    Objects.requireNonNull(bVar);
                    a2.f3513b.a(w5Var, new i2.g0(bVar, 3));
                    return;
                }
                throw new IllegalStateException("future is already set");
            }
            Log.w("AxMediaRouter", "Router is released. Cancel transfer");
            wj0Var3.a();
            return;
        }
        wj0Var2.b();
    }

    public final void i(w wVar, int i10) {
        if (!this.f44727j.contains(wVar)) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select removed route: " + wVar);
        } else if (!wVar.f44838g) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select disabled route: " + wVar);
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                g3 c10 = wVar.c();
                k kVar = this.f44735r;
                if (c10 == kVar && this.d != wVar) {
                    kVar.s(wVar.f44835b);
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
        if (this.f44740x != null) {
            this.f44740x = null;
            p pVar = this.f44741y;
            if (pVar != null) {
                pVar.h(3);
                this.f44741y.d();
                this.f44741y = null;
            }
        }
        if (f() && (uVar = wVar.f44834a.e) != null && uVar.f2300b) {
            p c10 = wVar.c().c(wVar.f44835b);
            if (c10 != null) {
                Executor d = f0.c.d(this.h);
                n2.u uVar2 = this.E;
                synchronized (c10.f44794a) {
                    try {
                        if (d != null) {
                            if (uVar2 != null) {
                                c10.f44795b = d;
                                c10.f44796c = uVar2;
                                ArrayList arrayList = c10.e;
                                if (arrayList != null && !arrayList.isEmpty()) {
                                    m mVar = c10.d;
                                    ArrayList arrayList2 = c10.e;
                                    c10.d = null;
                                    c10.e = null;
                                    c10.f44795b.execute(new com.google.android.gms.internal.cast.o(c10, uVar2, mVar, arrayList2, false, 3));
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
                this.f44740x = wVar;
                this.f44741y = c10;
                c10.e();
                return;
            }
            Log.w("GlobalMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + wVar);
        }
        q d10 = wVar.c().d(wVar.f44835b);
        if (d10 != null) {
            d10.e();
        }
        if (this.d == null) {
            this.d = wVar;
            this.e = d10;
            Message obtainMessage = this.f44721a.obtainMessage(262, new q0.b(null, wVar));
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
            int i11 = wVar.f44846p;
            e2.s sVar = this.f44731n;
            sVar.f6194a = i11;
            sVar.f6195b = wVar.f44847q;
            int i12 = 0;
            if (wVar.e() && !y.g()) {
                i10 = 0;
            } else {
                i10 = wVar.f44845o;
            }
            sVar.f6196c = i10;
            sVar.d = this.d.f44843m;
            if (f() && this.d.c() == this.f44735r) {
                sVar.e = k.p(this.e);
            } else {
                sVar.e = null;
            }
            ArrayList arrayList = this.f44730m;
            if (arrayList.size() <= 0) {
                li.k kVar = this.C;
                if (kVar != null) {
                    w wVar2 = this.d;
                    w wVar3 = this.v;
                    if (wVar3 != null) {
                        if (wVar2 != wVar3 && wVar2 != this.f44739w) {
                            if (sVar.f6196c == 1) {
                                i12 = 2;
                            }
                            int i13 = sVar.f6195b;
                            int i14 = sVar.f6194a;
                            String str = (String) sVar.e;
                            android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) kVar.f12101b;
                            if (a0Var != null) {
                                androidx.emoji2.text.p pVar = (androidx.emoji2.text.p) kVar.f12102c;
                                if (pVar != null && i12 == 0 && i13 == 0) {
                                    pVar.f1403c = i14;
                                    y1.g.a(pVar.c(), i14);
                                    return;
                                }
                                ?? obj = new Object();
                                obj.f1404f = kVar;
                                obj.f1401a = i12;
                                obj.f1402b = i13;
                                obj.f1403c = i14;
                                obj.d = str;
                                kVar.f12102c = obj;
                                ((android.support.v4.media.session.u) a0Var.f875b).f902a.setPlaybackToRemote(obj.c());
                                return;
                            }
                            return;
                        }
                        kVar.k();
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
            kVar2.k();
        }
    }

    public final void m(p4.v r20, b2.u r21) {
        throw new UnsupportedOperationException("Method not decompiled: p4.e.m(p4.v, b2.u):void");
    }

    public final int n(w wVar, m mVar) {
        int i10 = wVar.i(mVar);
        if (i10 != 0) {
            int i11 = i10 & 1;
            b bVar = this.f44721a;
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
        k0 k0Var = this.f44736s;
        ArrayList arrayList = this.f44727j;
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
                if (wVar3.c() == k0Var && wVar3.f44835b.equals("DEFAULT_ROUTE") && wVar3.f()) {
                    this.v = wVar3;
                    Log.i("GlobalMediaRouter", "Found default route: " + this.v);
                    break;
                }
            }
        }
        w wVar4 = this.f44739w;
        if (wVar4 != null && !wVar4.f()) {
            Log.i("GlobalMediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.f44739w);
            this.f44739w = null;
        }
        if (this.f44739w == null) {
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
                    this.f44739w = wVar5;
                    Log.i("GlobalMediaRouter", "Found bluetooth route: " + this.f44739w);
                    break;
                }
            }
        }
        w wVar6 = this.d;
        if (wVar6 != null && wVar6.f44838g) {
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
