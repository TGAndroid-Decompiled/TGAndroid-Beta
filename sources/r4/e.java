package r4;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.util.Log;
import b8.cg;
import b8.v1;
import com.google.android.gms.internal.vision.g3;
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
import k2.u1;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.Components.y00;
public final class e {
    public static final int F = 0;
    public n A;
    public int B;
    public p7.d C;
    public android.support.v4.media.session.a0 D;
    public final nh E;
    public final ne.h f54259c;
    public w d;
    public q f54260e;
    public com.google.android.gms.internal.cast.p f54261f;
    public vi0 f54262g;
    public final Context h;
    public final g2.t f54268n;
    public final y00 f54269o;
    public final boolean f54270p;
    public final boolean f54271q;
    public k f54272r;
    public final k0 f54273s;
    public final u1 f54274t;
    public a0 f54275u;
    public w v;
    public w f54276w;
    public w f54277x;
    public p f54278y;
    public n f54279z;
    public final b f54257a = new b(this);
    public final HashMap f54258b = new HashMap();
    public final ArrayList f54263i = new ArrayList();
    public final ArrayList f54264j = new ArrayList();
    public final HashMap f54265k = new HashMap();
    public final ArrayList f54266l = new ArrayList();
    public final ArrayList f54267m = new ArrayList();

    static {
        Log.isLoggable("GlobalMediaRouter", 3);
    }

    public e(android.content.Context r8) {
        throw new UnsupportedOperationException("Method not decompiled: r4.e.<init>(android.content.Context):void");
    }

    public final void a(g3 g3Var, boolean z10) {
        if (d(g3Var) == null) {
            v vVar = new v(g3Var, z10);
            this.f54266l.add(vVar);
            this.f54257a.b(513, vVar);
            m(vVar, (ba.i) g3Var.f7593n);
            y.b();
            g3Var.f7592f = this.f54269o;
            g3Var.h(this.f54279z);
        }
    }

    public final String b(v vVar, String str) {
        String C;
        String flattenToShortString = ((ComponentName) vVar.d.f36540b).flattenToShortString();
        boolean z10 = vVar.f54370c;
        if (z10) {
            C = str;
        } else {
            C = a1.g.C(flattenToShortString, ":", str);
        }
        HashMap hashMap = this.f54265k;
        if (!z10) {
            ArrayList arrayList = this.f54264j;
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 < size) {
                    if (((w) arrayList.get(i3)).f54374c.equals(C)) {
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            if (i3 >= 0) {
                Log.w("GlobalMediaRouter", f1.q("Either ", str, " isn't unique in ", flattenToShortString, " or we're trying to assign a unique ID for an already added route"));
                int i10 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String str2 = C + "_" + i10;
                    int size2 = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size2) {
                            if (((w) arrayList.get(i11)).f54374c.equals(str2)) {
                                break;
                            }
                            i11++;
                        } else {
                            i11 = -1;
                            break;
                        }
                    }
                    if (i11 < 0) {
                        hashMap.put(new q0.b(flattenToShortString, str), str2);
                        return str2;
                    }
                    i10++;
                }
            }
        }
        hashMap.put(new q0.b(flattenToShortString, str), C);
        return C;
    }

    public final w c() {
        ArrayList arrayList = this.f54264j;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            w wVar = (w) obj;
            if (wVar != this.v && wVar.c() == this.f54273s && wVar.m("android.media.intent.category.LIVE_AUDIO") && !wVar.m("android.media.intent.category.LIVE_VIDEO") && wVar.f()) {
                return wVar;
            }
        }
        return this.v;
    }

    public final v d(g3 g3Var) {
        ArrayList arrayList = this.f54266l;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            v vVar = (v) obj;
            if (vVar.f54368a == g3Var) {
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
        if (this.f54271q) {
            a0 a0Var = this.f54275u;
            if (a0Var == null || a0Var.f54246b) {
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
                hashSet.add(wVar.f54374c);
            }
            HashMap hashMap = this.f54258b;
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
                if (!hashMap.containsKey(wVar2.f54374c)) {
                    q e10 = wVar2.c().e(wVar2.f54373b, this.d.f54373b);
                    e10.e();
                    hashMap.put(wVar2.f54374c, e10);
                }
            }
        }
    }

    public final void h(e eVar, w wVar, q qVar, int i3, w wVar2, Collection collection) {
        final com.google.android.gms.internal.cast.p pVar;
        vi0 vi0Var = this.f54262g;
        if (vi0Var != null) {
            vi0Var.a();
            this.f54262g = null;
        }
        vi0 vi0Var2 = new vi0(eVar, wVar, qVar, i3, wVar2, collection);
        this.f54262g = vi0Var2;
        if (vi0Var2.f39126b == 3 && (pVar = this.f54261f) != null) {
            final w wVar3 = this.d;
            final w wVar4 = (w) vi0Var2.f39130g;
            com.google.android.gms.internal.cast.p.f6988c.b("Prepare transfer from Route(%s) to Route(%s)", wVar3, wVar4);
            c0.l a10 = v1.a(new c0.j() {
                @Override
                public final Object a(c0.i iVar) {
                    p pVar2 = p.this;
                    pVar2.getClass();
                    return Boolean.valueOf(pVar2.f6990b.post(new cg(pVar2, wVar3, wVar4, iVar, 1)));
                }
            });
            vi0 vi0Var3 = this.f54262g;
            e eVar2 = (e) ((WeakReference) vi0Var3.f39132j).get();
            if (eVar2 != null && eVar2.f54262g == vi0Var3) {
                if (((c0.l) vi0Var3.f39133k) == null) {
                    vi0Var3.f39133k = a10;
                    u uVar = new u(vi0Var3, 0);
                    b bVar = eVar2.f54257a;
                    Objects.requireNonNull(bVar);
                    a10.f3957b.b(uVar, new k2.g0(bVar, 3));
                    return;
                }
                throw new IllegalStateException("future is already set");
            }
            Log.w("AxMediaRouter", "Router is released. Cancel transfer");
            vi0Var3.a();
            return;
        }
        vi0Var2.b();
    }

    public final void i(w wVar, int i3) {
        if (!this.f54264j.contains(wVar)) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select removed route: " + wVar);
        } else if (!wVar.f54377g) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select disabled route: " + wVar);
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                g3 c2 = wVar.c();
                k kVar = this.f54272r;
                if (c2 == kVar && this.d != wVar) {
                    kVar.s(wVar.f54373b);
                    return;
                }
            }
            j(wVar, i3);
        }
    }

    public final void j(w wVar, int i3) {
        ba.i iVar;
        if (this.d == wVar) {
            return;
        }
        if (this.f54277x != null) {
            this.f54277x = null;
            p pVar = this.f54278y;
            if (pVar != null) {
                pVar.h(3);
                this.f54278y.d();
                this.f54278y = null;
            }
        }
        if (f() && (iVar = wVar.f54372a.f54371e) != null && iVar.f3186b) {
            p c2 = wVar.c().c(wVar.f54373b);
            if (c2 != null) {
                Executor e10 = f0.d.e(this.h);
                nh nhVar = this.E;
                synchronized (c2.f54333a) {
                    try {
                        if (e10 != null) {
                            if (nhVar != null) {
                                c2.f54334b = e10;
                                c2.f54335c = nhVar;
                                ArrayList arrayList = c2.f54336e;
                                if (arrayList != null && !arrayList.isEmpty()) {
                                    m mVar = c2.d;
                                    ArrayList arrayList2 = c2.f54336e;
                                    c2.d = null;
                                    c2.f54336e = null;
                                    c2.f54334b.execute(new cg(c2, nhVar, mVar, arrayList2, false, 4));
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
                this.f54277x = wVar;
                this.f54278y = c2;
                c2.e();
                return;
            }
            Log.w("GlobalMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + wVar);
        }
        q d = wVar.c().d(wVar.f54373b);
        if (d != null) {
            d.e();
        }
        if (this.d == null) {
            this.d = wVar;
            this.f54260e = d;
            Message obtainMessage = this.f54257a.obtainMessage(262, new q0.b(null, wVar));
            obtainMessage.arg1 = i3;
            obtainMessage.sendToTarget();
            return;
        }
        h(this, wVar, d, i3, null, null);
    }

    public final void k() {
        throw new UnsupportedOperationException("Method not decompiled: r4.e.k():void");
    }

    public final void l() {
        int i3;
        w wVar = this.d;
        if (wVar != null) {
            int i10 = wVar.f54385p;
            g2.t tVar = this.f54268n;
            tVar.f11907a = i10;
            tVar.f11908b = wVar.f54386q;
            int i11 = 0;
            if (wVar.e() && !y.g()) {
                i3 = 0;
            } else {
                i3 = wVar.f54384o;
            }
            tVar.f11909c = i3;
            tVar.d = this.d.f54382m;
            if (f() && this.d.c() == this.f54272r) {
                tVar.f11910e = k.p(this.f54260e);
            } else {
                tVar.f11910e = null;
            }
            ArrayList arrayList = this.f54267m;
            if (arrayList.size() <= 0) {
                p7.d dVar = this.C;
                if (dVar != null) {
                    w wVar2 = this.d;
                    w wVar3 = this.v;
                    if (wVar3 != null) {
                        if (wVar2 != wVar3 && wVar2 != this.f54276w) {
                            if (tVar.f11909c == 1) {
                                i11 = 2;
                            }
                            int i12 = tVar.f11908b;
                            int i13 = tVar.f11907a;
                            String str = (String) tVar.f11910e;
                            android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) dVar.f53345b;
                            if (a0Var != null) {
                                androidx.emoji2.text.q qVar = (androidx.emoji2.text.q) dVar.d;
                                if (qVar != null && i11 == 0 && i12 == 0) {
                                    qVar.f1749c = i13;
                                    a2.g.a(qVar.c(), i13);
                                    return;
                                }
                                ?? obj = new Object();
                                obj.f1751f = dVar;
                                obj.f1747a = i11;
                                obj.f1748b = i12;
                                obj.f1749c = i13;
                                obj.d = str;
                                dVar.d = obj;
                                ((android.support.v4.media.session.u) a0Var.f1186b).f1216a.setPlaybackToRemote(obj.c());
                                return;
                            }
                            return;
                        }
                        dVar.j();
                        return;
                    }
                    throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
                }
                return;
            }
            ((d) arrayList.get(0)).getClass();
            throw null;
        }
        p7.d dVar2 = this.C;
        if (dVar2 != null) {
            dVar2.j();
        }
    }

    public final void m(r4.v r20, ba.i r21) {
        throw new UnsupportedOperationException("Method not decompiled: r4.e.m(r4.v, ba.i):void");
    }

    public final int n(w wVar, m mVar) {
        int i3 = wVar.i(mVar);
        if (i3 != 0) {
            int i10 = i3 & 1;
            b bVar = this.f54257a;
            if (i10 != 0) {
                bVar.b(259, wVar);
            }
            if ((i3 & 2) != 0) {
                bVar.b(260, wVar);
            }
            if ((i3 & 4) != 0) {
                bVar.b(261, wVar);
            }
        }
        return i3;
    }

    public final void o(boolean z10) {
        w wVar = this.v;
        if (wVar != null && !wVar.f()) {
            Log.i("GlobalMediaRouter", "Clearing the default route because it is no longer selectable: " + this.v);
            this.v = null;
        }
        w wVar2 = this.v;
        k0 k0Var = this.f54273s;
        ArrayList arrayList = this.f54264j;
        if (wVar2 == null) {
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                Object obj = arrayList.get(i3);
                i3++;
                w wVar3 = (w) obj;
                if (wVar3.c() == k0Var && wVar3.f54373b.equals("DEFAULT_ROUTE") && wVar3.f()) {
                    this.v = wVar3;
                    Log.i("GlobalMediaRouter", "Found default route: " + this.v);
                    break;
                }
            }
        }
        w wVar4 = this.f54276w;
        if (wVar4 != null && !wVar4.f()) {
            Log.i("GlobalMediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.f54276w);
            this.f54276w = null;
        }
        if (this.f54276w == null) {
            int size2 = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size2) {
                    break;
                }
                Object obj2 = arrayList.get(i10);
                i10++;
                w wVar5 = (w) obj2;
                if (wVar5.c() == k0Var && wVar5.m("android.media.intent.category.LIVE_AUDIO") && !wVar5.m("android.media.intent.category.LIVE_VIDEO") && wVar5.f()) {
                    this.f54276w = wVar5;
                    Log.i("GlobalMediaRouter", "Found bluetooth route: " + this.f54276w);
                    break;
                }
            }
        }
        w wVar6 = this.d;
        if (wVar6 != null && wVar6.f54377g) {
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
