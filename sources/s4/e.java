package s4;

import a8.qa;
import a8.t7;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.vision.h3;
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
import l2.q1;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Cells.b5;
import org.telegram.ui.Components.hn;
import org.telegram.ui.md0;
import org.telegram.ui.web.z0;
public final class e {
    public static final int F = 0;
    public n A;
    public int B;
    public md0 C;
    public android.support.v4.media.session.a0 D;
    public final hn E;
    public final qe.h f56929c;
    public v d;
    public q f56930e;
    public com.google.android.gms.internal.cast.o f56931f;
    public l5 f56932g;
    public final Context h;
    public final h2.s f56938n;
    public final b5 f56939o;
    public final boolean f56940p;
    public final boolean f56941q;
    public k f56942r;
    public final j0 f56943s;
    public final q1 f56944t;
    public z f56945u;
    public v v;
    public v f56946w;
    public v f56947x;
    public p f56948y;
    public n f56949z;
    public final b f56927a = new b(this);
    public final HashMap f56928b = new HashMap();
    public final ArrayList f56933i = new ArrayList();
    public final ArrayList f56934j = new ArrayList();
    public final HashMap f56935k = new HashMap();
    public final ArrayList f56936l = new ArrayList();
    public final ArrayList f56937m = new ArrayList();

    static {
        Log.isLoggable("GlobalMediaRouter", 3);
    }

    public e(android.content.Context r8) {
        throw new UnsupportedOperationException("Method not decompiled: s4.e.<init>(android.content.Context):void");
    }

    public final void a(h3 h3Var, boolean z10) {
        if (d(h3Var) == null) {
            u uVar = new u(h3Var, z10);
            this.f56936l.add(uVar);
            this.f56927a.b(513, uVar);
            m(uVar, (ca.i) h3Var.f7214n);
            x.b();
            h3Var.f7213f = this.f56939o;
            h3Var.h(this.f56949z);
        }
    }

    public final String b(u uVar, String str) {
        String E;
        String flattenToShortString = ((ComponentName) uVar.d.f35933b).flattenToShortString();
        boolean z10 = uVar.f57040c;
        if (z10) {
            E = str;
        } else {
            E = a8.p0.E(flattenToShortString, ":", str);
        }
        HashMap hashMap = this.f56935k;
        if (!z10) {
            ArrayList arrayList = this.f56934j;
            int size = arrayList.size();
            int i7 = 0;
            while (true) {
                if (i7 < size) {
                    if (((v) arrayList.get(i7)).f57044c.equals(E)) {
                        break;
                    }
                    i7++;
                } else {
                    i7 = -1;
                    break;
                }
            }
            if (i7 >= 0) {
                Log.w("GlobalMediaRouter", p5.c.l("Either ", str, " isn't unique in ", flattenToShortString, " or we're trying to assign a unique ID for an already added route"));
                int i10 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String str2 = E + "_" + i10;
                    int size2 = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size2) {
                            if (((v) arrayList.get(i11)).f57044c.equals(str2)) {
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
        hashMap.put(new q0.b(flattenToShortString, str), E);
        return E;
    }

    public final v c() {
        ArrayList arrayList = this.f56934j;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            v vVar = (v) obj;
            if (vVar != this.v && vVar.c() == this.f56943s && vVar.m("android.media.intent.category.LIVE_AUDIO") && !vVar.m("android.media.intent.category.LIVE_VIDEO") && vVar.f()) {
                return vVar;
            }
        }
        return this.v;
    }

    public final u d(h3 h3Var) {
        ArrayList arrayList = this.f56936l;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            u uVar = (u) obj;
            if (uVar.f57038a == h3Var) {
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
        if (this.f56941q) {
            z zVar = this.f56945u;
            if (zVar == null || zVar.f57070b) {
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
                hashSet.add(vVar.f57044c);
            }
            HashMap hashMap = this.f56928b;
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
                if (!hashMap.containsKey(vVar2.f57044c)) {
                    q e10 = vVar2.c().e(vVar2.f57043b, this.d.f57043b);
                    e10.e();
                    hashMap.put(vVar2.f57044c, e10);
                }
            }
        }
    }

    public final void h(e eVar, v vVar, q qVar, int i7, v vVar2, Collection collection) {
        final com.google.android.gms.internal.cast.o oVar;
        l5 l5Var = this.f56932g;
        if (l5Var != null) {
            l5Var.c();
            this.f56932g = null;
        }
        l5 l5Var2 = new l5(eVar, vVar, qVar, i7, vVar2, collection);
        this.f56932g = l5Var2;
        if (l5Var2.f29201b == 3 && (oVar = this.f56931f) != null) {
            final v vVar3 = this.d;
            final v vVar4 = (v) l5Var2.h;
            com.google.android.gms.internal.cast.o.f6597c.b("Prepare transfer from Route(%s) to Route(%s)", vVar3, vVar4);
            c0.l a10 = t7.a(new c0.j() {
                @Override
                public final Object e(c0.i iVar) {
                    o oVar2 = o.this;
                    oVar2.getClass();
                    return Boolean.valueOf(oVar2.f6599b.post(new qa(oVar2, vVar3, vVar4, iVar, 2)));
                }
            });
            l5 l5Var3 = this.f56932g;
            e eVar2 = (e) ((WeakReference) l5Var3.f29207s).get();
            if (eVar2 != null && eVar2.f56932g == l5Var3) {
                if (((c0.l) l5Var3.f29208w) == null) {
                    l5Var3.f29208w = a10;
                    z0 z0Var = new z0(l5Var3, 10);
                    b bVar = eVar2.f56927a;
                    Objects.requireNonNull(bVar);
                    a10.f4348b.b(z0Var, new l2.d0(bVar, 3));
                    return;
                }
                throw new IllegalStateException("future is already set");
            }
            Log.w("AxMediaRouter", "Router is released. Cancel transfer");
            l5Var3.c();
            return;
        }
        l5Var2.i();
    }

    public final void i(v vVar, int i7) {
        if (!this.f56934j.contains(vVar)) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select removed route: " + vVar);
        } else if (!vVar.f57047g) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select disabled route: " + vVar);
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                h3 c10 = vVar.c();
                k kVar = this.f56942r;
                if (c10 == kVar && this.d != vVar) {
                    kVar.s(vVar.f57043b);
                    return;
                }
            }
            j(vVar, i7);
        }
    }

    public final void j(v vVar, int i7) {
        ca.i iVar;
        if (this.d == vVar) {
            return;
        }
        if (this.f56947x != null) {
            this.f56947x = null;
            p pVar = this.f56948y;
            if (pVar != null) {
                pVar.h(3);
                this.f56948y.d();
                this.f56948y = null;
            }
        }
        if (f() && (iVar = vVar.f57042a.f57041e) != null && iVar.f5125b) {
            p c10 = vVar.c().c(vVar.f57043b);
            if (c10 != null) {
                Executor e10 = f0.d.e(this.h);
                hn hnVar = this.E;
                synchronized (c10.f57004a) {
                    try {
                        if (e10 != null) {
                            if (hnVar != null) {
                                c10.f57005b = e10;
                                c10.f57006c = hnVar;
                                ArrayList arrayList = c10.f57007e;
                                if (arrayList != null && !arrayList.isEmpty()) {
                                    m mVar = c10.d;
                                    ArrayList arrayList2 = c10.f57007e;
                                    c10.d = null;
                                    c10.f57007e = null;
                                    c10.f57005b.execute(new qa(c10, hnVar, mVar, arrayList2, false, 5));
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
                this.f56947x = vVar;
                this.f56948y = c10;
                c10.e();
                return;
            }
            Log.w("GlobalMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + vVar);
        }
        q d = vVar.c().d(vVar.f57043b);
        if (d != null) {
            d.e();
        }
        if (this.d == null) {
            this.d = vVar;
            this.f56930e = d;
            Message obtainMessage = this.f56927a.obtainMessage(262, new q0.b(null, vVar));
            obtainMessage.arg1 = i7;
            obtainMessage.sendToTarget();
            return;
        }
        h(this, vVar, d, i7, null, null);
    }

    public final void k() {
        throw new UnsupportedOperationException("Method not decompiled: s4.e.k():void");
    }

    public final void l() {
        int i7;
        v vVar = this.d;
        if (vVar != null) {
            int i10 = vVar.f57055p;
            h2.s sVar = this.f56938n;
            sVar.f13820a = i10;
            sVar.f13821b = vVar.f57056q;
            int i11 = 0;
            if (vVar.e() && !x.g()) {
                i7 = 0;
            } else {
                i7 = vVar.f57054o;
            }
            sVar.f13822c = i7;
            sVar.d = this.d.f57052m;
            if (f() && this.d.c() == this.f56942r) {
                sVar.f13823e = k.p(this.f56930e);
            } else {
                sVar.f13823e = null;
            }
            ArrayList arrayList = this.f56937m;
            if (arrayList.size() <= 0) {
                md0 md0Var = this.C;
                if (md0Var != null) {
                    v vVar2 = this.d;
                    v vVar3 = this.v;
                    if (vVar3 != null) {
                        if (vVar2 != vVar3 && vVar2 != this.f56946w) {
                            if (sVar.f13822c == 1) {
                                i11 = 2;
                            }
                            int i12 = sVar.f13821b;
                            int i13 = sVar.f13820a;
                            String str = (String) sVar.f13823e;
                            android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) md0Var.f49838b;
                            if (a0Var != null) {
                                androidx.emoji2.text.q qVar = (androidx.emoji2.text.q) md0Var.f49839c;
                                if (qVar != null && i11 == 0 && i12 == 0) {
                                    qVar.f2268c = i13;
                                    b2.g.a(qVar.c(), i13);
                                    return;
                                }
                                ?? obj = new Object();
                                obj.f2270f = md0Var;
                                obj.f2266a = i11;
                                obj.f2267b = i12;
                                obj.f2268c = i13;
                                obj.d = str;
                                md0Var.f49839c = obj;
                                ((android.support.v4.media.session.u) a0Var.f1704b).f1734a.setPlaybackToRemote(obj.c());
                                return;
                            }
                            return;
                        }
                        md0Var.n();
                        return;
                    }
                    throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
                }
                return;
            }
            ((d) arrayList.get(0)).getClass();
            throw null;
        }
        md0 md0Var2 = this.C;
        if (md0Var2 != null) {
            md0Var2.n();
        }
    }

    public final void m(s4.u r20, ca.i r21) {
        throw new UnsupportedOperationException("Method not decompiled: s4.e.m(s4.u, ca.i):void");
    }

    public final int n(v vVar, m mVar) {
        int i7 = vVar.i(mVar);
        if (i7 != 0) {
            int i10 = i7 & 1;
            b bVar = this.f56927a;
            if (i10 != 0) {
                bVar.b(259, vVar);
            }
            if ((i7 & 2) != 0) {
                bVar.b(260, vVar);
            }
            if ((i7 & 4) != 0) {
                bVar.b(261, vVar);
            }
        }
        return i7;
    }

    public final void o(boolean z10) {
        v vVar = this.v;
        if (vVar != null && !vVar.f()) {
            Log.i("GlobalMediaRouter", "Clearing the default route because it is no longer selectable: " + this.v);
            this.v = null;
        }
        v vVar2 = this.v;
        j0 j0Var = this.f56943s;
        ArrayList arrayList = this.f56934j;
        if (vVar2 == null) {
            int size = arrayList.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    break;
                }
                Object obj = arrayList.get(i7);
                i7++;
                v vVar3 = (v) obj;
                if (vVar3.c() == j0Var && vVar3.f57043b.equals("DEFAULT_ROUTE") && vVar3.f()) {
                    this.v = vVar3;
                    Log.i("GlobalMediaRouter", "Found default route: " + this.v);
                    break;
                }
            }
        }
        v vVar4 = this.f56946w;
        if (vVar4 != null && !vVar4.f()) {
            Log.i("GlobalMediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.f56946w);
            this.f56946w = null;
        }
        if (this.f56946w == null) {
            int size2 = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size2) {
                    break;
                }
                Object obj2 = arrayList.get(i10);
                i10++;
                v vVar5 = (v) obj2;
                if (vVar5.c() == j0Var && vVar5.m("android.media.intent.category.LIVE_AUDIO") && !vVar5.m("android.media.intent.category.LIVE_VIDEO") && vVar5.f()) {
                    this.f56946w = vVar5;
                    Log.i("GlobalMediaRouter", "Found bluetooth route: " + this.f56946w);
                    break;
                }
            }
        }
        v vVar6 = this.d;
        if (vVar6 != null && vVar6.f57047g) {
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
