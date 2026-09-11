package p4;

import android.content.ComponentName;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.vision.h3;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import ji.u4;
public final class v {
    public final u f43924a;
    public final String f43925b;
    public final String f43926c;
    public String d;
    public String f43927e;
    public Uri f43928f;
    public boolean f43929g;
    public final boolean h;
    public int f43930i;
    public boolean f43931j;
    public int f43933l;
    public int f43934m;
    public int f43935n;
    public int f43936o;
    public int f43937p;
    public int f43938q;
    public Bundle f43940s;
    public IntentSender f43941t;
    public m f43942u;
    public a0.f f43943w;
    public final ArrayList f43932k = new ArrayList();
    public int f43939r = -1;
    public ArrayList v = new ArrayList();

    public v(u uVar, String str, String str2, boolean z10) {
        this.f43924a = uVar;
        this.f43925b = str;
        this.f43926c = str2;
        this.h = z10;
    }

    public static p a() {
        x.b();
        q qVar = x.c().f43808e;
        if (qVar instanceof p) {
            return (p) qVar;
        }
        return null;
    }

    public final mg.n b(v vVar) {
        if (vVar != null) {
            String str = vVar.f43926c;
            a0.f fVar = this.f43943w;
            if (fVar != null && fVar.containsKey(str)) {
                return new mg.n((o) this.f43943w.get(str), 11);
            }
            return null;
        }
        throw new NullPointerException("route must not be null");
    }

    public final h3 c() {
        u uVar = this.f43924a;
        uVar.getClass();
        x.b();
        return uVar.f43920a;
    }

    public final boolean d() {
        x.b();
        v vVar = x.c().v;
        if (vVar != null) {
            if (vVar != this && this.f43935n != 3) {
                if (TextUtils.equals(((ComponentName) ((u4) c().d).f14221b).getPackageName(), "android") && m("android.media.intent.category.LIVE_AUDIO") && !m("android.media.intent.category.LIVE_VIDEO")) {
                    return true;
                }
                return false;
            }
            return true;
        }
        throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
    }

    public final boolean e() {
        if (DesugarCollections.unmodifiableList(this.v).size() >= 1) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (this.f43942u != null && this.f43929g) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        x.b();
        if (x.c().e() == this) {
            return true;
        }
        return false;
    }

    public final boolean h(r rVar) {
        if (rVar != null) {
            x.b();
            ArrayList arrayList = this.f43932k;
            if (arrayList != null) {
                rVar.a();
                if (!rVar.f43902b.isEmpty()) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        IntentFilter intentFilter = (IntentFilter) obj;
                        if (intentFilter != null) {
                            for (String str : rVar.f43902b) {
                                if (intentFilter.hasCategory(str)) {
                                    return true;
                                }
                            }
                            continue;
                        }
                    }
                }
            }
            return false;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final int i(p4.m r18) {
        throw new UnsupportedOperationException("Method not decompiled: p4.v.i(p4.m):int");
    }

    public final void j(int i10) {
        q qVar;
        q qVar2;
        x.b();
        e c10 = x.c();
        int min = Math.min(this.f43938q, Math.max(0, i10));
        HashMap hashMap = c10.f43806b;
        if (this == c10.d && (qVar2 = c10.f43808e) != null) {
            qVar2.f(min);
        } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f43926c)) != null) {
            qVar.f(min);
        }
    }

    public final void k(int i10) {
        q qVar;
        q qVar2;
        x.b();
        if (i10 != 0) {
            e c10 = x.c();
            HashMap hashMap = c10.f43806b;
            if (this == c10.d && (qVar2 = c10.f43808e) != null) {
                qVar2.i(i10);
            } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f43926c)) != null) {
                qVar.i(i10);
            }
        }
    }

    public final void l() {
        x.b();
        x.c().i(this, 3);
    }

    public final boolean m(String str) {
        x.b();
        ArrayList arrayList = this.f43932k;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((IntentFilter) obj).hasCategory(str)) {
                return true;
            }
        }
        return false;
    }

    public final void n(Collection collection) {
        this.v.clear();
        if (this.f43943w == null) {
            this.f43943w = new a0.l(0);
        }
        this.f43943w.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            v a2 = this.f43924a.a(oVar.f43877a.d());
            if (a2 != null) {
                this.f43943w.put(a2.f43926c, oVar);
                int i10 = oVar.f43878b;
                if (i10 == 2 || i10 == 3) {
                    this.v.add(a2);
                }
            }
        }
        x.c().f43805a.b(259, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb2.append(this.f43926c);
        sb2.append(", name=");
        sb2.append(this.d);
        sb2.append(", description=");
        sb2.append(this.f43927e);
        sb2.append(", iconUri=");
        sb2.append(this.f43928f);
        sb2.append(", enabled=");
        sb2.append(this.f43929g);
        sb2.append(", isSystemRoute=");
        sb2.append(this.h);
        sb2.append(", connectionState=");
        sb2.append(this.f43930i);
        sb2.append(", canDisconnect=");
        sb2.append(this.f43931j);
        sb2.append(", playbackType=");
        sb2.append(this.f43933l);
        sb2.append(", playbackStream=");
        sb2.append(this.f43934m);
        sb2.append(", deviceType=");
        sb2.append(this.f43935n);
        sb2.append(", volumeHandling=");
        sb2.append(this.f43936o);
        sb2.append(", volume=");
        sb2.append(this.f43937p);
        sb2.append(", volumeMax=");
        sb2.append(this.f43938q);
        sb2.append(", presentationDisplayId=");
        sb2.append(this.f43939r);
        sb2.append(", extras=");
        sb2.append(this.f43940s);
        sb2.append(", settingsIntent=");
        sb2.append(this.f43941t);
        sb2.append(", providerPackageName=");
        sb2.append(((ComponentName) this.f43924a.d.f14221b).getPackageName());
        if (e()) {
            sb2.append(", members=[");
            int size = this.v.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                if (this.v.get(i10) != this) {
                    sb2.append(((v) this.v.get(i10)).f43926c);
                }
            }
            sb2.append(']');
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
