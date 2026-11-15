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
import org.telegram.messenger.ou;
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.wi0;
import org.telegram.ui.ld0;
public final class e {
    public static final int F = 0;
    public n A;
    public int B;
    public ld0 C;
    public android.support.v4.media.session.a0 D;
    public final ou E;
    public final qe.h f56355c;
    public v d;
    public q f56356e;
    public com.google.android.gms.internal.cast.o f56357f;
    public wi0 f56358g;
    public final Context h;
    public final h2.s f56364n;
    public final cf f56365o;
    public final boolean f56366p;
    public final boolean f56367q;
    public k f56368r;
    public final j0 f56369s;
    public final q1 f56370t;
    public z f56371u;
    public v v;
    public v f56372w;
    public v f56373x;
    public p f56374y;
    public n f56375z;
    public final b f56353a = new b(this);
    public final HashMap f56354b = new HashMap();
    public final ArrayList f56359i = new ArrayList();
    public final ArrayList f56360j = new ArrayList();
    public final HashMap f56361k = new HashMap();
    public final ArrayList f56362l = new ArrayList();
    public final ArrayList f56363m = new ArrayList();

    static {
        Log.isLoggable("GlobalMediaRouter", 3);
    }

    public e(android.content.Context r8) {
        throw new UnsupportedOperationException("Method not decompiled: s4.e.<init>(android.content.Context):void");
    }

    public final void a(h3 h3Var, boolean z10) {
        if (d(h3Var) == null) {
            u uVar = new u(h3Var, z10);
            this.f56362l.add(uVar);
            this.f56353a.b(513, uVar);
            m(uVar, (ca.i) h3Var.f6931n);
            x.b();
            h3Var.f6930f = this.f56365o;
            h3Var.h(this.f56375z);
        }
    }

    public final String b(u uVar, String str) {
        String E;
        String flattenToShortString = ((ComponentName) uVar.d.f25806b).flattenToShortString();
        boolean z10 = uVar.f56466c;
        if (z10) {
            E = str;
        } else {
            E = a8.p0.E(flattenToShortString, ":", str);
        }
        HashMap hashMap = this.f56361k;
        if (!z10) {
            ArrayList arrayList = this.f56360j;
            int size = arrayList.size();
            int i7 = 0;
            while (true) {
                if (i7 < size) {
                    if (((v) arrayList.get(i7)).f56470c.equals(E)) {
                        break;
                    }
                    i7++;
                } else {
                    i7 = -1;
                    break;
                }
            }
            if (i7 >= 0) {
                Log.w("GlobalMediaRouter", r.b.l("Either ", str, " isn't unique in ", flattenToShortString, " or we're trying to assign a unique ID for an already added route"));
                int i10 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String str2 = E + "_" + i10;
                    int size2 = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size2) {
                            if (((v) arrayList.get(i11)).f56470c.equals(str2)) {
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
        ArrayList arrayList = this.f56360j;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            v vVar = (v) obj;
            if (vVar != this.v && vVar.c() == this.f56369s && vVar.m("android.media.intent.category.LIVE_AUDIO") && !vVar.m("android.media.intent.category.LIVE_VIDEO") && vVar.f()) {
                return vVar;
            }
        }
        return this.v;
    }

    public final u d(h3 h3Var) {
        ArrayList arrayList = this.f56362l;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            u uVar = (u) obj;
            if (uVar.f56464a == h3Var) {
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
        if (this.f56367q) {
            z zVar = this.f56371u;
            if (zVar == null || zVar.f56496b) {
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
                hashSet.add(vVar.f56470c);
            }
            HashMap hashMap = this.f56354b;
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
                if (!hashMap.containsKey(vVar2.f56470c)) {
                    q e10 = vVar2.c().e(vVar2.f56469b, this.d.f56469b);
                    e10.e();
                    hashMap.put(vVar2.f56470c, e10);
                }
            }
        }
    }

    public final void h(e eVar, v vVar, q qVar, int i7, v vVar2, Collection collection) {
        final com.google.android.gms.internal.cast.o oVar;
        wi0 wi0Var = this.f56358g;
        if (wi0Var != null) {
            wi0Var.a();
            this.f56358g = null;
        }
        wi0 wi0Var2 = new wi0(eVar, vVar, qVar, i7, vVar2, collection);
        this.f56358g = wi0Var2;
        if (wi0Var2.f41357b == 3 && (oVar = this.f56357f) != null) {
            final v vVar3 = this.d;
            final v vVar4 = (v) wi0Var2.f41361g;
            com.google.android.gms.internal.cast.o.f6314c.b("Prepare transfer from Route(%s) to Route(%s)", vVar3, vVar4);
            c0.l a10 = t7.a(new c0.j() {
                @Override
                public final Object d(c0.i iVar) {
                    o oVar2 = o.this;
                    oVar2.getClass();
                    return Boolean.valueOf(oVar2.f6316b.post(new qa(oVar2, vVar3, vVar4, iVar, 2)));
                }
            });
            wi0 wi0Var3 = this.f56358g;
            e eVar2 = (e) ((WeakReference) wi0Var3.f41363j).get();
            if (eVar2 != null && eVar2.f56358g == wi0Var3) {
                if (((c0.l) wi0Var3.f41364k) == null) {
                    wi0Var3.f41364k = a10;
                    q2.d dVar = new q2.d(wi0Var3, 7);
                    b bVar = eVar2.f56353a;
                    Objects.requireNonNull(bVar);
                    a10.f4067b.b(dVar, new l2.d0(bVar, 3));
                    return;
                }
                throw new IllegalStateException("future is already set");
            }
            Log.w("AxMediaRouter", "Router is released. Cancel transfer");
            wi0Var3.a();
            return;
        }
        wi0Var2.b();
    }

    public final void i(v vVar, int i7) {
        if (!this.f56360j.contains(vVar)) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select removed route: " + vVar);
        } else if (!vVar.f56473g) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select disabled route: " + vVar);
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                h3 c10 = vVar.c();
                k kVar = this.f56368r;
                if (c10 == kVar && this.d != vVar) {
                    kVar.s(vVar.f56469b);
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
        if (this.f56373x != null) {
            this.f56373x = null;
            p pVar = this.f56374y;
            if (pVar != null) {
                pVar.h(3);
                this.f56374y.d();
                this.f56374y = null;
            }
        }
        if (f() && (iVar = vVar.f56468a.f56467e) != null && iVar.f4843b) {
            p c10 = vVar.c().c(vVar.f56469b);
            if (c10 != null) {
                Executor e10 = f0.d.e(this.h);
                ou ouVar = this.E;
                synchronized (c10.f56430a) {
                    try {
                        if (e10 != null) {
                            if (ouVar != null) {
                                c10.f56431b = e10;
                                c10.f56432c = ouVar;
                                ArrayList arrayList = c10.f56433e;
                                if (arrayList != null && !arrayList.isEmpty()) {
                                    m mVar = c10.d;
                                    ArrayList arrayList2 = c10.f56433e;
                                    c10.d = null;
                                    c10.f56433e = null;
                                    c10.f56431b.execute(new qa(c10, ouVar, mVar, arrayList2, false, 5));
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
                this.f56373x = vVar;
                this.f56374y = c10;
                c10.e();
                return;
            }
            Log.w("GlobalMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + vVar);
        }
        q d = vVar.c().d(vVar.f56469b);
        if (d != null) {
            d.e();
        }
        if (this.d == null) {
            this.d = vVar;
            this.f56356e = d;
            Message obtainMessage = this.f56353a.obtainMessage(262, new q0.b(null, vVar));
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
            int i10 = vVar.f56481p;
            h2.s sVar = this.f56364n;
            sVar.f13505a = i10;
            sVar.f13506b = vVar.f56482q;
            int i11 = 0;
            if (vVar.e() && !x.g()) {
                i7 = 0;
            } else {
                i7 = vVar.f56480o;
            }
            sVar.f13507c = i7;
            sVar.d = this.d.f56478m;
            if (f() && this.d.c() == this.f56368r) {
                sVar.f13508e = k.p(this.f56356e);
            } else {
                sVar.f13508e = null;
            }
            ArrayList arrayList = this.f56363m;
            if (arrayList.size() <= 0) {
                ld0 ld0Var = this.C;
                if (ld0Var != null) {
                    v vVar2 = this.d;
                    v vVar3 = this.v;
                    if (vVar3 != null) {
                        if (vVar2 != vVar3 && vVar2 != this.f56372w) {
                            if (sVar.f13507c == 1) {
                                i11 = 2;
                            }
                            int i12 = sVar.f13506b;
                            int i13 = sVar.f13505a;
                            String str = (String) sVar.f13508e;
                            android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) ld0Var.f48972b;
                            if (a0Var != null) {
                                androidx.emoji2.text.q qVar = (androidx.emoji2.text.q) ld0Var.f48973c;
                                if (qVar != null && i11 == 0 && i12 == 0) {
                                    qVar.f2277c = i13;
                                    b2.g.a(qVar.c(), i13);
                                    return;
                                }
                                ?? obj = new Object();
                                obj.f2279f = ld0Var;
                                obj.f2275a = i11;
                                obj.f2276b = i12;
                                obj.f2277c = i13;
                                obj.d = str;
                                ld0Var.f48973c = obj;
                                ((android.support.v4.media.session.u) a0Var.f1713b).f1743a.setPlaybackToRemote(obj.c());
                                return;
                            }
                            return;
                        }
                        ld0Var.n();
                        return;
                    }
                    throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
                }
                return;
            }
            ((d) arrayList.get(0)).getClass();
            throw null;
        }
        ld0 ld0Var2 = this.C;
        if (ld0Var2 != null) {
            ld0Var2.n();
        }
    }

    public final void m(s4.u r20, ca.i r21) {
        throw new UnsupportedOperationException("Method not decompiled: s4.e.m(s4.u, ca.i):void");
    }

    public final int n(v vVar, m mVar) {
        int i7 = vVar.i(mVar);
        if (i7 != 0) {
            int i10 = i7 & 1;
            b bVar = this.f56353a;
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
        j0 j0Var = this.f56369s;
        ArrayList arrayList = this.f56360j;
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
                if (vVar3.c() == j0Var && vVar3.f56469b.equals("DEFAULT_ROUTE") && vVar3.f()) {
                    this.v = vVar3;
                    Log.i("GlobalMediaRouter", "Found default route: " + this.v);
                    break;
                }
            }
        }
        v vVar4 = this.f56372w;
        if (vVar4 != null && !vVar4.f()) {
            Log.i("GlobalMediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.f56372w);
            this.f56372w = null;
        }
        if (this.f56372w == null) {
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
                    this.f56372w = vVar5;
                    Log.i("GlobalMediaRouter", "Found bluetooth route: " + this.f56372w);
                    break;
                }
            }
        }
        v vVar6 = this.d;
        if (vVar6 != null && vVar6.f56473g) {
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
