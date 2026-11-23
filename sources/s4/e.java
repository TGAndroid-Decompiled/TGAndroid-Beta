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
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.Cells.c5;
import org.telegram.ui.Components.jn;
import org.telegram.ui.md0;
import org.telegram.ui.web.z0;
public final class e {
    public static final int F = 0;
    public n A;
    public int B;
    public md0 C;
    public android.support.v4.media.session.a0 D;
    public final jn E;
    public final qe.h f56974c;
    public v d;
    public q f56975e;
    public com.google.android.gms.internal.cast.o f56976f;
    public k5 f56977g;
    public final Context h;
    public final h2.s f56983n;
    public final c5 f56984o;
    public final boolean f56985p;
    public final boolean f56986q;
    public k f56987r;
    public final j0 f56988s;
    public final q1 f56989t;
    public z f56990u;
    public v v;
    public v f56991w;
    public v f56992x;
    public p f56993y;
    public n f56994z;
    public final b f56972a = new b(this);
    public final HashMap f56973b = new HashMap();
    public final ArrayList f56978i = new ArrayList();
    public final ArrayList f56979j = new ArrayList();
    public final HashMap f56980k = new HashMap();
    public final ArrayList f56981l = new ArrayList();
    public final ArrayList f56982m = new ArrayList();

    static {
        Log.isLoggable("GlobalMediaRouter", 3);
    }

    public e(android.content.Context r8) {
        throw new UnsupportedOperationException("Method not decompiled: s4.e.<init>(android.content.Context):void");
    }

    public final void a(h3 h3Var, boolean z10) {
        if (d(h3Var) == null) {
            u uVar = new u(h3Var, z10);
            this.f56981l.add(uVar);
            this.f56972a.b(513, uVar);
            m(uVar, (ca.i) h3Var.f7243n);
            x.b();
            h3Var.f7242f = this.f56984o;
            h3Var.h(this.f56994z);
        }
    }

    public final String b(u uVar, String str) {
        String E;
        String flattenToShortString = ((ComponentName) uVar.d.f36566b).flattenToShortString();
        boolean z10 = uVar.f57085c;
        if (z10) {
            E = str;
        } else {
            E = a8.p0.E(flattenToShortString, ":", str);
        }
        HashMap hashMap = this.f56980k;
        if (!z10) {
            ArrayList arrayList = this.f56979j;
            int size = arrayList.size();
            int i7 = 0;
            while (true) {
                if (i7 < size) {
                    if (((v) arrayList.get(i7)).f57089c.equals(E)) {
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
                            if (((v) arrayList.get(i11)).f57089c.equals(str2)) {
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
        ArrayList arrayList = this.f56979j;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            v vVar = (v) obj;
            if (vVar != this.v && vVar.c() == this.f56988s && vVar.m("android.media.intent.category.LIVE_AUDIO") && !vVar.m("android.media.intent.category.LIVE_VIDEO") && vVar.f()) {
                return vVar;
            }
        }
        return this.v;
    }

    public final u d(h3 h3Var) {
        ArrayList arrayList = this.f56981l;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            u uVar = (u) obj;
            if (uVar.f57083a == h3Var) {
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
        if (this.f56986q) {
            z zVar = this.f56990u;
            if (zVar == null || zVar.f57115b) {
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
                hashSet.add(vVar.f57089c);
            }
            HashMap hashMap = this.f56973b;
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
                if (!hashMap.containsKey(vVar2.f57089c)) {
                    q e10 = vVar2.c().e(vVar2.f57088b, this.d.f57088b);
                    e10.e();
                    hashMap.put(vVar2.f57089c, e10);
                }
            }
        }
    }

    public final void h(e eVar, v vVar, q qVar, int i7, v vVar2, Collection collection) {
        final com.google.android.gms.internal.cast.o oVar;
        k5 k5Var = this.f56977g;
        if (k5Var != null) {
            k5Var.c();
            this.f56977g = null;
        }
        k5 k5Var2 = new k5(eVar, vVar, qVar, i7, vVar2, collection);
        this.f56977g = k5Var2;
        if (k5Var2.f29186b == 3 && (oVar = this.f56976f) != null) {
            final v vVar3 = this.d;
            final v vVar4 = (v) k5Var2.h;
            com.google.android.gms.internal.cast.o.f6626c.b("Prepare transfer from Route(%s) to Route(%s)", vVar3, vVar4);
            c0.l a10 = t7.a(new c0.j() {
                @Override
                public final Object e(c0.i iVar) {
                    o oVar2 = o.this;
                    oVar2.getClass();
                    return Boolean.valueOf(oVar2.f6628b.post(new qa(oVar2, vVar3, vVar4, iVar, 2)));
                }
            });
            k5 k5Var3 = this.f56977g;
            e eVar2 = (e) ((WeakReference) k5Var3.f29192s).get();
            if (eVar2 != null && eVar2.f56977g == k5Var3) {
                if (((c0.l) k5Var3.f29193w) == null) {
                    k5Var3.f29193w = a10;
                    z0 z0Var = new z0(k5Var3, 10);
                    b bVar = eVar2.f56972a;
                    Objects.requireNonNull(bVar);
                    a10.f4377b.b(z0Var, new l2.d0(bVar, 3));
                    return;
                }
                throw new IllegalStateException("future is already set");
            }
            Log.w("AxMediaRouter", "Router is released. Cancel transfer");
            k5Var3.c();
            return;
        }
        k5Var2.i();
    }

    public final void i(v vVar, int i7) {
        if (!this.f56979j.contains(vVar)) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select removed route: " + vVar);
        } else if (!vVar.f57092g) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select disabled route: " + vVar);
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                h3 c10 = vVar.c();
                k kVar = this.f56987r;
                if (c10 == kVar && this.d != vVar) {
                    kVar.s(vVar.f57088b);
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
        if (this.f56992x != null) {
            this.f56992x = null;
            p pVar = this.f56993y;
            if (pVar != null) {
                pVar.h(3);
                this.f56993y.d();
                this.f56993y = null;
            }
        }
        if (f() && (iVar = vVar.f57087a.f57086e) != null && iVar.f5154b) {
            p c10 = vVar.c().c(vVar.f57088b);
            if (c10 != null) {
                Executor e10 = f0.d.e(this.h);
                jn jnVar = this.E;
                synchronized (c10.f57049a) {
                    try {
                        if (e10 != null) {
                            if (jnVar != null) {
                                c10.f57050b = e10;
                                c10.f57051c = jnVar;
                                ArrayList arrayList = c10.f57052e;
                                if (arrayList != null && !arrayList.isEmpty()) {
                                    m mVar = c10.d;
                                    ArrayList arrayList2 = c10.f57052e;
                                    c10.d = null;
                                    c10.f57052e = null;
                                    c10.f57050b.execute(new qa(c10, jnVar, mVar, arrayList2, false, 5));
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
                this.f56992x = vVar;
                this.f56993y = c10;
                c10.e();
                return;
            }
            Log.w("GlobalMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + vVar);
        }
        q d = vVar.c().d(vVar.f57088b);
        if (d != null) {
            d.e();
        }
        if (this.d == null) {
            this.d = vVar;
            this.f56975e = d;
            Message obtainMessage = this.f56972a.obtainMessage(262, new q0.b(null, vVar));
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
            int i10 = vVar.f57100p;
            h2.s sVar = this.f56983n;
            sVar.f13849a = i10;
            sVar.f13850b = vVar.f57101q;
            int i11 = 0;
            if (vVar.e() && !x.g()) {
                i7 = 0;
            } else {
                i7 = vVar.f57099o;
            }
            sVar.f13851c = i7;
            sVar.d = this.d.f57097m;
            if (f() && this.d.c() == this.f56987r) {
                sVar.f13852e = k.p(this.f56975e);
            } else {
                sVar.f13852e = null;
            }
            ArrayList arrayList = this.f56982m;
            if (arrayList.size() <= 0) {
                md0 md0Var = this.C;
                if (md0Var != null) {
                    v vVar2 = this.d;
                    v vVar3 = this.v;
                    if (vVar3 != null) {
                        if (vVar2 != vVar3 && vVar2 != this.f56991w) {
                            if (sVar.f13851c == 1) {
                                i11 = 2;
                            }
                            int i12 = sVar.f13850b;
                            int i13 = sVar.f13849a;
                            String str = (String) sVar.f13852e;
                            android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) md0Var.f49857b;
                            if (a0Var != null) {
                                androidx.emoji2.text.q qVar = (androidx.emoji2.text.q) md0Var.f49858c;
                                if (qVar != null && i11 == 0 && i12 == 0) {
                                    qVar.f2288c = i13;
                                    b2.g.a(qVar.c(), i13);
                                    return;
                                }
                                ?? obj = new Object();
                                obj.f2290f = md0Var;
                                obj.f2286a = i11;
                                obj.f2287b = i12;
                                obj.f2288c = i13;
                                obj.d = str;
                                md0Var.f49858c = obj;
                                ((android.support.v4.media.session.u) a0Var.f1724b).f1754a.setPlaybackToRemote(obj.c());
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
            b bVar = this.f56972a;
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
        j0 j0Var = this.f56988s;
        ArrayList arrayList = this.f56979j;
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
                if (vVar3.c() == j0Var && vVar3.f57088b.equals("DEFAULT_ROUTE") && vVar3.f()) {
                    this.v = vVar3;
                    Log.i("GlobalMediaRouter", "Found default route: " + this.v);
                    break;
                }
            }
        }
        v vVar4 = this.f56991w;
        if (vVar4 != null && !vVar4.f()) {
            Log.i("GlobalMediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.f56991w);
            this.f56991w = null;
        }
        if (this.f56991w == null) {
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
                    this.f56991w = vVar5;
                    Log.i("GlobalMediaRouter", "Found bluetooth route: " + this.f56991w);
                    break;
                }
            }
        }
        v vVar6 = this.d;
        if (vVar6 != null && vVar6.f57092g) {
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
