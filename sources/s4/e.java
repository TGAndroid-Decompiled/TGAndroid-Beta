package s4;

import a8.qa;
import a8.u7;
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
import l2.r1;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.web.z0;
public final class e {
    public static final int F = 0;
    public n A;
    public int B;
    public i61 C;
    public android.support.v4.media.session.a0 D;
    public final nd0 E;
    public final qe.h f57055c;
    public v d;
    public q f57056e;
    public com.google.android.gms.internal.cast.o f57057f;
    public l5 f57058g;
    public final Context h;
    public final h2.s f57064n;
    public final i5 f57065o;
    public final boolean f57066p;
    public final boolean f57067q;
    public k f57068r;
    public final j0 f57069s;
    public final r1 f57070t;
    public z f57071u;
    public v v;
    public v f57072w;
    public v f57073x;
    public p f57074y;
    public n f57075z;
    public final b f57053a = new b(this);
    public final HashMap f57054b = new HashMap();
    public final ArrayList f57059i = new ArrayList();
    public final ArrayList f57060j = new ArrayList();
    public final HashMap f57061k = new HashMap();
    public final ArrayList f57062l = new ArrayList();
    public final ArrayList f57063m = new ArrayList();

    static {
        Log.isLoggable("GlobalMediaRouter", 3);
    }

    public e(android.content.Context r8) {
        throw new UnsupportedOperationException("Method not decompiled: s4.e.<init>(android.content.Context):void");
    }

    public final void a(h3 h3Var, boolean z10) {
        if (d(h3Var) == null) {
            u uVar = new u(h3Var, z10);
            this.f57062l.add(uVar);
            this.f57053a.b(513, uVar);
            m(uVar, (ca.i) h3Var.f7205n);
            x.b();
            h3Var.f7204f = this.f57065o;
            h3Var.h(this.f57075z);
        }
    }

    public final String b(u uVar, String str) {
        String E;
        String flattenToShortString = ((ComponentName) uVar.d.f37766b).flattenToShortString();
        boolean z10 = uVar.f57164c;
        if (z10) {
            E = str;
        } else {
            E = a8.p0.E(flattenToShortString, ":", str);
        }
        HashMap hashMap = this.f57061k;
        if (!z10) {
            ArrayList arrayList = this.f57060j;
            int size = arrayList.size();
            int i7 = 0;
            while (true) {
                if (i7 < size) {
                    if (((v) arrayList.get(i7)).f57168c.equals(E)) {
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
                            if (((v) arrayList.get(i11)).f57168c.equals(str2)) {
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
        ArrayList arrayList = this.f57060j;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            v vVar = (v) obj;
            if (vVar != this.v && vVar.c() == this.f57069s && vVar.m("android.media.intent.category.LIVE_AUDIO") && !vVar.m("android.media.intent.category.LIVE_VIDEO") && vVar.f()) {
                return vVar;
            }
        }
        return this.v;
    }

    public final u d(h3 h3Var) {
        ArrayList arrayList = this.f57062l;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            u uVar = (u) obj;
            if (uVar.f57162a == h3Var) {
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
        if (this.f57067q) {
            z zVar = this.f57071u;
            if (zVar == null || zVar.f57194b) {
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
                hashSet.add(vVar.f57168c);
            }
            HashMap hashMap = this.f57054b;
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
                if (!hashMap.containsKey(vVar2.f57168c)) {
                    q e10 = vVar2.c().e(vVar2.f57167b, this.d.f57167b);
                    e10.e();
                    hashMap.put(vVar2.f57168c, e10);
                }
            }
        }
    }

    public final void h(e eVar, v vVar, q qVar, int i7, v vVar2, Collection collection) {
        final com.google.android.gms.internal.cast.o oVar;
        l5 l5Var = this.f57058g;
        if (l5Var != null) {
            l5Var.c();
            this.f57058g = null;
        }
        l5 l5Var2 = new l5(eVar, vVar, qVar, i7, vVar2, collection);
        this.f57058g = l5Var2;
        if (l5Var2.f29284b == 3 && (oVar = this.f57057f) != null) {
            final v vVar3 = this.d;
            final v vVar4 = (v) l5Var2.h;
            com.google.android.gms.internal.cast.o.f6588c.b("Prepare transfer from Route(%s) to Route(%s)", vVar3, vVar4);
            c0.l a10 = u7.a(new c0.j() {
                @Override
                public final Object d(c0.i iVar) {
                    o oVar2 = o.this;
                    oVar2.getClass();
                    return Boolean.valueOf(oVar2.f6590b.post(new qa(oVar2, vVar3, vVar4, iVar, 2)));
                }
            });
            l5 l5Var3 = this.f57058g;
            e eVar2 = (e) ((WeakReference) l5Var3.f29290s).get();
            if (eVar2 != null && eVar2.f57058g == l5Var3) {
                if (((c0.l) l5Var3.f29291w) == null) {
                    l5Var3.f29291w = a10;
                    z0 z0Var = new z0(l5Var3, 10);
                    b bVar = eVar2.f57053a;
                    Objects.requireNonNull(bVar);
                    a10.f4340b.b(z0Var, new l2.e0(bVar, 3));
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
        if (!this.f57060j.contains(vVar)) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select removed route: " + vVar);
        } else if (!vVar.f57171g) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select disabled route: " + vVar);
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                h3 c10 = vVar.c();
                k kVar = this.f57068r;
                if (c10 == kVar && this.d != vVar) {
                    kVar.s(vVar.f57167b);
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
        if (this.f57073x != null) {
            this.f57073x = null;
            p pVar = this.f57074y;
            if (pVar != null) {
                pVar.h(3);
                this.f57074y.d();
                this.f57074y = null;
            }
        }
        if (f() && (iVar = vVar.f57166a.f57165e) != null && iVar.f5117b) {
            p c10 = vVar.c().c(vVar.f57167b);
            if (c10 != null) {
                Executor e10 = f0.d.e(this.h);
                nd0 nd0Var = this.E;
                synchronized (c10.f57130a) {
                    try {
                        if (e10 != null) {
                            if (nd0Var != null) {
                                c10.f57131b = e10;
                                c10.f57132c = nd0Var;
                                ArrayList arrayList = c10.f57133e;
                                if (arrayList != null && !arrayList.isEmpty()) {
                                    m mVar = c10.d;
                                    ArrayList arrayList2 = c10.f57133e;
                                    c10.d = null;
                                    c10.f57133e = null;
                                    c10.f57131b.execute(new qa(c10, nd0Var, mVar, arrayList2, false, 5));
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
                this.f57073x = vVar;
                this.f57074y = c10;
                c10.e();
                return;
            }
            Log.w("GlobalMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + vVar);
        }
        q d = vVar.c().d(vVar.f57167b);
        if (d != null) {
            d.e();
        }
        if (this.d == null) {
            this.d = vVar;
            this.f57056e = d;
            Message obtainMessage = this.f57053a.obtainMessage(262, new q0.b(null, vVar));
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
            int i10 = vVar.f57179p;
            h2.s sVar = this.f57064n;
            sVar.f13812a = i10;
            sVar.f13813b = vVar.f57180q;
            int i11 = 0;
            if (vVar.e() && !x.g()) {
                i7 = 0;
            } else {
                i7 = vVar.f57178o;
            }
            sVar.f13814c = i7;
            sVar.d = this.d.f57176m;
            if (f() && this.d.c() == this.f57068r) {
                sVar.f13815e = k.p(this.f57056e);
            } else {
                sVar.f13815e = null;
            }
            ArrayList arrayList = this.f57063m;
            if (arrayList.size() <= 0) {
                i61 i61Var = this.C;
                if (i61Var != null) {
                    v vVar2 = this.d;
                    v vVar3 = this.v;
                    if (vVar3 != null) {
                        if (vVar2 != vVar3 && vVar2 != this.f57072w) {
                            if (sVar.f13814c == 1) {
                                i11 = 2;
                            }
                            int i12 = sVar.f13813b;
                            int i13 = sVar.f13812a;
                            String str = (String) sVar.f13815e;
                            android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) i61Var.f35958b;
                            if (a0Var != null) {
                                androidx.emoji2.text.q qVar = (androidx.emoji2.text.q) i61Var.f35959c;
                                if (qVar != null && i11 == 0 && i12 == 0) {
                                    qVar.f2240c = i13;
                                    b2.g.a(qVar.c(), i13);
                                    return;
                                }
                                ?? obj = new Object();
                                obj.f2242f = i61Var;
                                obj.f2238a = i11;
                                obj.f2239b = i12;
                                obj.f2240c = i13;
                                obj.d = str;
                                i61Var.f35959c = obj;
                                ((android.support.v4.media.session.u) a0Var.f1676b).f1706a.setPlaybackToRemote(obj.c());
                                return;
                            }
                            return;
                        }
                        i61Var.q();
                        return;
                    }
                    throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
                }
                return;
            }
            ((d) arrayList.get(0)).getClass();
            throw null;
        }
        i61 i61Var2 = this.C;
        if (i61Var2 != null) {
            i61Var2.q();
        }
    }

    public final void m(s4.u r20, ca.i r21) {
        throw new UnsupportedOperationException("Method not decompiled: s4.e.m(s4.u, ca.i):void");
    }

    public final int n(v vVar, m mVar) {
        int i7 = vVar.i(mVar);
        if (i7 != 0) {
            int i10 = i7 & 1;
            b bVar = this.f57053a;
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
        j0 j0Var = this.f57069s;
        ArrayList arrayList = this.f57060j;
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
                if (vVar3.c() == j0Var && vVar3.f57167b.equals("DEFAULT_ROUTE") && vVar3.f()) {
                    this.v = vVar3;
                    Log.i("GlobalMediaRouter", "Found default route: " + this.v);
                    break;
                }
            }
        }
        v vVar4 = this.f57072w;
        if (vVar4 != null && !vVar4.f()) {
            Log.i("GlobalMediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.f57072w);
            this.f57072w = null;
        }
        if (this.f57072w == null) {
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
                    this.f57072w = vVar5;
                    Log.i("GlobalMediaRouter", "Found bluetooth route: " + this.f57072w);
                    break;
                }
            }
        }
        v vVar6 = this.d;
        if (vVar6 != null && vVar6.f57171g) {
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
