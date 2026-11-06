package s4;

import a8.pa;
import a8.q7;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.util.Log;
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
import l2.u1;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.uy;
import org.telegram.ui.hy0;
public final class e {
    public static final int F = 0;
    public n A;
    public int B;
    public hy0 C;
    public android.support.v4.media.session.a0 D;
    public final uy E;
    public final qe.h f54697c;
    public v d;
    public q f54698e;
    public com.google.android.gms.internal.cast.o f54699f;
    public ri0 f54700g;
    public final Context h;
    public final h2.s f54706n;
    public final org.telegram.ui.Components.n f54707o;
    public final boolean f54708p;
    public final boolean f54709q;
    public k f54710r;
    public final j0 f54711s;
    public final u1 f54712t;
    public z f54713u;
    public v v;
    public v f54714w;
    public v f54715x;
    public p f54716y;
    public n f54717z;
    public final b f54695a = new b(this);
    public final HashMap f54696b = new HashMap();
    public final ArrayList f54701i = new ArrayList();
    public final ArrayList f54702j = new ArrayList();
    public final HashMap f54703k = new HashMap();
    public final ArrayList f54704l = new ArrayList();
    public final ArrayList f54705m = new ArrayList();

    static {
        Log.isLoggable("GlobalMediaRouter", 3);
    }

    public e(android.content.Context r8) {
        throw new UnsupportedOperationException("Method not decompiled: s4.e.<init>(android.content.Context):void");
    }

    public final void a(g3 g3Var, boolean z9) {
        if (d(g3Var) == null) {
            u uVar = new u(g3Var, z9);
            this.f54704l.add(uVar);
            this.f54695a.b(513, uVar);
            m(uVar, (ca.i) g3Var.f7538n);
            x.b();
            g3Var.f7537f = this.f54707o;
            g3Var.h(this.f54717z);
        }
    }

    public final String b(u uVar, String str) {
        String D;
        String flattenToShortString = ((ComponentName) uVar.d.f38750b).flattenToShortString();
        boolean z9 = uVar.f54806c;
        if (z9) {
            D = str;
        } else {
            D = a8.p0.D(flattenToShortString, ":", str);
        }
        HashMap hashMap = this.f54703k;
        if (!z9) {
            ArrayList arrayList = this.f54702j;
            int size = arrayList.size();
            int i7 = 0;
            while (true) {
                if (i7 < size) {
                    if (((v) arrayList.get(i7)).f54810c.equals(D)) {
                        break;
                    }
                    i7++;
                } else {
                    i7 = -1;
                    break;
                }
            }
            if (i7 >= 0) {
                Log.w("GlobalMediaRouter", f1.m("Either ", str, " isn't unique in ", flattenToShortString, " or we're trying to assign a unique ID for an already added route"));
                int i10 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String str2 = D + "_" + i10;
                    int size2 = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size2) {
                            if (((v) arrayList.get(i11)).f54810c.equals(str2)) {
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
        hashMap.put(new q0.b(flattenToShortString, str), D);
        return D;
    }

    public final v c() {
        ArrayList arrayList = this.f54702j;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            v vVar = (v) obj;
            if (vVar != this.v && vVar.c() == this.f54711s && vVar.m("android.media.intent.category.LIVE_AUDIO") && !vVar.m("android.media.intent.category.LIVE_VIDEO") && vVar.f()) {
                return vVar;
            }
        }
        return this.v;
    }

    public final u d(g3 g3Var) {
        ArrayList arrayList = this.f54704l;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            u uVar = (u) obj;
            if (uVar.f54804a == g3Var) {
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
        if (this.f54709q) {
            z zVar = this.f54713u;
            if (zVar == null || zVar.f54836b) {
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
                hashSet.add(vVar.f54810c);
            }
            HashMap hashMap = this.f54696b;
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
                if (!hashMap.containsKey(vVar2.f54810c)) {
                    q e10 = vVar2.c().e(vVar2.f54809b, this.d.f54809b);
                    e10.e();
                    hashMap.put(vVar2.f54810c, e10);
                }
            }
        }
    }

    public final void h(e eVar, v vVar, q qVar, int i7, v vVar2, Collection collection) {
        final com.google.android.gms.internal.cast.o oVar;
        ri0 ri0Var = this.f54700g;
        if (ri0Var != null) {
            ri0Var.a();
            this.f54700g = null;
        }
        ri0 ri0Var2 = new ri0(eVar, vVar, qVar, i7, vVar2, collection);
        this.f54700g = ri0Var2;
        if (ri0Var2.f37652b == 3 && (oVar = this.f54699f) != null) {
            final v vVar3 = this.d;
            final v vVar4 = (v) ri0Var2.f37656g;
            com.google.android.gms.internal.cast.o.f6922c.b("Prepare transfer from Route(%s) to Route(%s)", vVar3, vVar4);
            c0.l a10 = q7.a(new c0.j() {
                @Override
                public final Object d(c0.i iVar) {
                    o oVar2 = o.this;
                    oVar2.getClass();
                    return Boolean.valueOf(oVar2.f6924b.post(new pa(oVar2, vVar3, vVar4, iVar, 2)));
                }
            });
            ri0 ri0Var3 = this.f54700g;
            e eVar2 = (e) ((WeakReference) ri0Var3.f37658j).get();
            if (eVar2 != null && eVar2.f54700g == ri0Var3) {
                if (((c0.l) ri0Var3.f37659k) == null) {
                    ri0Var3.f37659k = a10;
                    m5 m5Var = new m5(ri0Var3, 27);
                    b bVar = eVar2.f54695a;
                    Objects.requireNonNull(bVar);
                    a10.f5245b.b(m5Var, new l2.g0(bVar, 3));
                    return;
                }
                throw new IllegalStateException("future is already set");
            }
            Log.w("AxMediaRouter", "Router is released. Cancel transfer");
            ri0Var3.a();
            return;
        }
        ri0Var2.b();
    }

    public final void i(v vVar, int i7) {
        if (!this.f54702j.contains(vVar)) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select removed route: " + vVar);
        } else if (!vVar.f54813g) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select disabled route: " + vVar);
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                g3 c10 = vVar.c();
                k kVar = this.f54710r;
                if (c10 == kVar && this.d != vVar) {
                    kVar.s(vVar.f54809b);
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
        if (this.f54715x != null) {
            this.f54715x = null;
            p pVar = this.f54716y;
            if (pVar != null) {
                pVar.h(3);
                this.f54716y.d();
                this.f54716y = null;
            }
        }
        if (f() && (iVar = vVar.f54808a.f54807e) != null && iVar.f6015b) {
            p c10 = vVar.c().c(vVar.f54809b);
            if (c10 != null) {
                Executor e10 = f0.d.e(this.h);
                uy uyVar = this.E;
                synchronized (c10.f54772a) {
                    try {
                        if (e10 != null) {
                            if (uyVar != null) {
                                c10.f54773b = e10;
                                c10.f54774c = uyVar;
                                ArrayList arrayList = c10.f54775e;
                                if (arrayList != null && !arrayList.isEmpty()) {
                                    m mVar = c10.d;
                                    ArrayList arrayList2 = c10.f54775e;
                                    c10.d = null;
                                    c10.f54775e = null;
                                    c10.f54773b.execute(new pa(c10, uyVar, mVar, arrayList2, false, 5));
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
                this.f54715x = vVar;
                this.f54716y = c10;
                c10.e();
                return;
            }
            Log.w("GlobalMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + vVar);
        }
        q d = vVar.c().d(vVar.f54809b);
        if (d != null) {
            d.e();
        }
        if (this.d == null) {
            this.d = vVar;
            this.f54698e = d;
            Message obtainMessage = this.f54695a.obtainMessage(262, new q0.b(null, vVar));
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
            int i10 = vVar.f54821p;
            h2.s sVar = this.f54706n;
            sVar.f14146a = i10;
            sVar.f14147b = vVar.f54822q;
            int i11 = 0;
            if (vVar.e() && !x.g()) {
                i7 = 0;
            } else {
                i7 = vVar.f54820o;
            }
            sVar.f14148c = i7;
            sVar.d = this.d.f54818m;
            if (f() && this.d.c() == this.f54710r) {
                sVar.f14149e = k.p(this.f54698e);
            } else {
                sVar.f14149e = null;
            }
            ArrayList arrayList = this.f54705m;
            if (arrayList.size() <= 0) {
                hy0 hy0Var = this.C;
                if (hy0Var != null) {
                    v vVar2 = this.d;
                    v vVar3 = this.v;
                    if (vVar3 != null) {
                        if (vVar2 != vVar3 && vVar2 != this.f54714w) {
                            if (sVar.f14148c == 1) {
                                i11 = 2;
                            }
                            int i12 = sVar.f14147b;
                            int i13 = sVar.f14146a;
                            String str = (String) sVar.f14149e;
                            android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) hy0Var.f46527b;
                            if (a0Var != null) {
                                androidx.emoji2.text.p pVar = (androidx.emoji2.text.p) hy0Var.f46528c;
                                if (pVar != null && i11 == 0 && i12 == 0) {
                                    pVar.f2325c = i13;
                                    b2.g.a(pVar.c(), i13);
                                    return;
                                }
                                ?? obj = new Object();
                                obj.f2327f = hy0Var;
                                obj.f2323a = i11;
                                obj.f2324b = i12;
                                obj.f2325c = i13;
                                obj.d = str;
                                hy0Var.f46528c = obj;
                                ((android.support.v4.media.session.u) a0Var.f1763b).f1793a.setPlaybackToRemote(obj.c());
                                return;
                            }
                            return;
                        }
                        hy0Var.n();
                        return;
                    }
                    throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
                }
                return;
            }
            ((d) arrayList.get(0)).getClass();
            throw null;
        }
        hy0 hy0Var2 = this.C;
        if (hy0Var2 != null) {
            hy0Var2.n();
        }
    }

    public final void m(s4.u r20, ca.i r21) {
        throw new UnsupportedOperationException("Method not decompiled: s4.e.m(s4.u, ca.i):void");
    }

    public final int n(v vVar, m mVar) {
        int i7 = vVar.i(mVar);
        if (i7 != 0) {
            int i10 = i7 & 1;
            b bVar = this.f54695a;
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

    public final void o(boolean z9) {
        v vVar = this.v;
        if (vVar != null && !vVar.f()) {
            Log.i("GlobalMediaRouter", "Clearing the default route because it is no longer selectable: " + this.v);
            this.v = null;
        }
        v vVar2 = this.v;
        j0 j0Var = this.f54711s;
        ArrayList arrayList = this.f54702j;
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
                if (vVar3.c() == j0Var && vVar3.f54809b.equals("DEFAULT_ROUTE") && vVar3.f()) {
                    this.v = vVar3;
                    Log.i("GlobalMediaRouter", "Found default route: " + this.v);
                    break;
                }
            }
        }
        v vVar4 = this.f54714w;
        if (vVar4 != null && !vVar4.f()) {
            Log.i("GlobalMediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.f54714w);
            this.f54714w = null;
        }
        if (this.f54714w == null) {
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
                    this.f54714w = vVar5;
                    Log.i("GlobalMediaRouter", "Found bluetooth route: " + this.f54714w);
                    break;
                }
            }
        }
        v vVar6 = this.d;
        if (vVar6 != null && vVar6.f54813g) {
            if (z9) {
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
