package p4;

import a8.fg;
import a8.w9;
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
import li.h5;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.web.h1;
public final class e {
    public static final int F = 0;
    public n A;
    public int B;
    public k6.c C;
    public android.support.v4.media.session.b0 D;
    public final h5 E;
    public final s0 f46660c;
    public v d;
    public q e;
    public com.google.android.gms.internal.cast.o f46661f;
    public pl0 f46662g;
    public final Context h;
    public final e2.s f46668n;
    public final jg.s0 f46669o;
    public final boolean f46670p;
    public final boolean f46671q;
    public k f46672r;
    public final j0 f46673s;
    public final u1 f46674t;
    public z f46675u;
    public v v;
    public v f46676w;
    public v f46677x;
    public p f46678y;
    public n f46679z;
    public final b f46658a = new b(this);
    public final HashMap f46659b = new HashMap();
    public final ArrayList f46663i = new ArrayList();
    public final ArrayList f46664j = new ArrayList();
    public final HashMap f46665k = new HashMap();
    public final ArrayList f46666l = new ArrayList();
    public final ArrayList f46667m = new ArrayList();

    static {
        Log.isLoggable("GlobalMediaRouter", 3);
    }

    public e(android.content.Context r9) {
        throw new UnsupportedOperationException("Method not decompiled: p4.e.<init>(android.content.Context):void");
    }

    public final void a(g3 g3Var, boolean z10) {
        if (d(g3Var) == null) {
            u uVar = new u(g3Var, z10);
            this.f46666l.add(uVar);
            this.f46658a.b(513, uVar);
            m(uVar, (b2.u) g3Var.f7393n);
            x.b();
            g3Var.f7392f = this.f46669o;
            g3Var.h(this.f46679z);
        }
    }

    public final String b(u uVar, String str) {
        String D;
        String flattenToShortString = ((ComponentName) uVar.d.f17210b).flattenToShortString();
        boolean z10 = uVar.f46768c;
        if (z10) {
            D = str;
        } else {
            D = a1.g.D(flattenToShortString, ":", str);
        }
        HashMap hashMap = this.f46665k;
        if (!z10) {
            ArrayList arrayList = this.f46664j;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    if (((v) arrayList.get(i10)).f46771c.equals(D)) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                Log.w("GlobalMediaRouter", b10.k("Either ", str, " isn't unique in ", flattenToShortString, " or we're trying to assign a unique ID for an already added route"));
                int i11 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String str2 = D + "_" + i11;
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            if (((v) arrayList.get(i12)).f46771c.equals(str2)) {
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
        ArrayList arrayList = this.f46664j;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v vVar = (v) obj;
            if (vVar != this.v && vVar.c() == this.f46673s && vVar.m("android.media.intent.category.LIVE_AUDIO") && !vVar.m("android.media.intent.category.LIVE_VIDEO") && vVar.f()) {
                return vVar;
            }
        }
        return this.v;
    }

    public final u d(g3 g3Var) {
        ArrayList arrayList = this.f46666l;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            u uVar = (u) obj;
            if (uVar.f46766a == g3Var) {
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
        if (this.f46671q) {
            z zVar = this.f46675u;
            if (zVar == null || zVar.f46795b) {
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
                hashSet.add(vVar.f46771c);
            }
            HashMap hashMap = this.f46659b;
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
                if (!hashMap.containsKey(vVar2.f46771c)) {
                    q e = vVar2.c().e(vVar2.f46770b, this.d.f46770b);
                    e.e();
                    hashMap.put(vVar2.f46771c, e);
                }
            }
        }
    }

    public final void h(e eVar, v vVar, q qVar, int i10, v vVar2, Collection collection) {
        final com.google.android.gms.internal.cast.o oVar;
        pl0 pl0Var = this.f46662g;
        if (pl0Var != null) {
            pl0Var.a();
            this.f46662g = null;
        }
        pl0 pl0Var2 = new pl0(eVar, vVar, qVar, i10, vVar2, collection);
        this.f46662g = pl0Var2;
        if (pl0Var2.f31597b == 3 && (oVar = this.f46661f) != null) {
            final v vVar3 = this.d;
            final v vVar4 = (v) pl0Var2.f31600g;
            com.google.android.gms.internal.cast.o.f6837c.b("Prepare transfer from Route(%s) to Route(%s)", vVar3, vVar4);
            c0.l a2 = w9.a(new c0.j() {
                @Override
                public final Object b(c0.i iVar) {
                    o oVar2 = o.this;
                    oVar2.getClass();
                    return Boolean.valueOf(oVar2.f6839b.post(new fg(oVar2, vVar3, vVar4, iVar, 1)));
                }
            });
            pl0 pl0Var3 = this.f46662g;
            e eVar2 = (e) ((WeakReference) pl0Var3.f31602j).get();
            if (eVar2 != null && eVar2.f46662g == pl0Var3) {
                if (((c0.l) pl0Var3.f31603k) == null) {
                    pl0Var3.f31603k = a2;
                    h1 h1Var = new h1(pl0Var3, 6);
                    b bVar = eVar2.f46658a;
                    Objects.requireNonNull(bVar);
                    a2.f5914b.a(h1Var, new i2.h0(bVar, 3));
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
        if (!this.f46664j.contains(vVar)) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select removed route: " + vVar);
        } else if (!vVar.f46773g) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select disabled route: " + vVar);
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                g3 c10 = vVar.c();
                k kVar = this.f46672r;
                if (c10 == kVar && this.d != vVar) {
                    kVar.s(vVar.f46770b);
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
        if (this.f46677x != null) {
            this.f46677x = null;
            p pVar = this.f46678y;
            if (pVar != null) {
                pVar.h(3);
                this.f46678y.d();
                this.f46678y = null;
            }
        }
        if (f() && (uVar = vVar.f46769a.e) != null && uVar.f3463b) {
            p c10 = vVar.c().c(vVar.f46770b);
            if (c10 != null) {
                Executor d = f0.c.d(this.h);
                h5 h5Var = this.E;
                synchronized (c10.f46732a) {
                    try {
                        if (d != null) {
                            if (h5Var != null) {
                                c10.f46733b = d;
                                c10.f46734c = h5Var;
                                ArrayList arrayList = c10.e;
                                if (arrayList != null && !arrayList.isEmpty()) {
                                    m mVar = c10.d;
                                    ArrayList arrayList2 = c10.e;
                                    c10.d = null;
                                    c10.e = null;
                                    c10.f46733b.execute(new fg(c10, h5Var, mVar, arrayList2, false, 3));
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
                this.f46677x = vVar;
                this.f46678y = c10;
                c10.e();
                return;
            }
            Log.w("GlobalMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + vVar);
        }
        q d10 = vVar.c().d(vVar.f46770b);
        if (d10 != null) {
            d10.e();
        }
        if (this.d == null) {
            this.d = vVar;
            this.e = d10;
            Message obtainMessage = this.f46658a.obtainMessage(262, new q0.b(null, vVar));
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
            int i11 = vVar.f46781p;
            e2.s sVar = this.f46668n;
            sVar.f9719a = i11;
            sVar.f9720b = vVar.f46782q;
            int i12 = 0;
            if (vVar.e() && !x.g()) {
                i10 = 0;
            } else {
                i10 = vVar.f46780o;
            }
            sVar.f9721c = i10;
            sVar.d = this.d.f46778m;
            if (f() && this.d.c() == this.f46672r) {
                sVar.e = k.p(this.e);
            } else {
                sVar.e = null;
            }
            ArrayList arrayList = this.f46667m;
            if (arrayList.size() <= 0) {
                k6.c cVar = this.C;
                if (cVar != null) {
                    v vVar2 = this.d;
                    v vVar3 = this.v;
                    if (vVar3 != null) {
                        if (vVar2 != vVar3 && vVar2 != this.f46676w) {
                            if (sVar.f9721c == 1) {
                                i12 = 2;
                            }
                            int i13 = sVar.f9720b;
                            int i14 = sVar.f9719a;
                            String str = (String) sVar.e;
                            android.support.v4.media.session.b0 b0Var = (android.support.v4.media.session.b0) cVar.f16406b;
                            if (b0Var != null) {
                                androidx.emoji2.text.p pVar = (androidx.emoji2.text.p) cVar.f16407c;
                                if (pVar != null && i12 == 0 && i13 == 0) {
                                    pVar.f2569c = i14;
                                    y1.g.a(pVar.c(), i14);
                                    return;
                                }
                                ?? obj = new Object();
                                obj.f2570f = cVar;
                                obj.f2567a = i12;
                                obj.f2568b = i13;
                                obj.f2569c = i14;
                                obj.d = str;
                                cVar.f16407c = obj;
                                b0Var.f2051a.f2073a.setPlaybackToRemote(obj.c());
                                return;
                            }
                            return;
                        }
                        cVar.n();
                        return;
                    }
                    throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
                }
                return;
            }
            ((d) arrayList.get(0)).getClass();
            throw null;
        }
        k6.c cVar2 = this.C;
        if (cVar2 != null) {
            cVar2.n();
        }
    }

    public final void m(p4.u r20, b2.u r21) {
        throw new UnsupportedOperationException("Method not decompiled: p4.e.m(p4.u, b2.u):void");
    }

    public final int n(v vVar, m mVar) {
        int i10 = vVar.i(mVar);
        if (i10 != 0) {
            int i11 = i10 & 1;
            b bVar = this.f46658a;
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
        j0 j0Var = this.f46673s;
        ArrayList arrayList = this.f46664j;
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
                if (vVar3.c() == j0Var && vVar3.f46770b.equals("DEFAULT_ROUTE") && vVar3.f()) {
                    this.v = vVar3;
                    Log.i("GlobalMediaRouter", "Found default route: " + this.v);
                    break;
                }
            }
        }
        v vVar4 = this.f46676w;
        if (vVar4 != null && !vVar4.f()) {
            Log.i("GlobalMediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.f46676w);
            this.f46676w = null;
        }
        if (this.f46676w == null) {
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
                    this.f46676w = vVar5;
                    Log.i("GlobalMediaRouter", "Found bluetooth route: " + this.f46676w);
                    break;
                }
            }
        }
        v vVar6 = this.d;
        if (vVar6 != null && vVar6.f46773g) {
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
