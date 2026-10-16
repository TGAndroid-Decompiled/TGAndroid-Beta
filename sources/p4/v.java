package p4;

import android.content.ComponentName;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.vision.g3;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import ji.h5;
public final class v {
    public final u f42818a;
    public final String f42819b;
    public final String f42820c;
    public String d;
    public String e;
    public Uri f42821f;
    public boolean f42822g;
    public final boolean h;
    public int f42823i;
    public boolean f42824j;
    public int f42826l;
    public int f42827m;
    public int f42828n;
    public int f42829o;
    public int f42830p;
    public int f42831q;
    public Bundle f42833s;
    public IntentSender f42834t;
    public m f42835u;
    public a0.f f42836w;
    public final ArrayList f42825k = new ArrayList();
    public int f42832r = -1;
    public ArrayList v = new ArrayList();

    public v(u uVar, String str, String str2, boolean z10) {
        this.f42818a = uVar;
        this.f42819b = str;
        this.f42820c = str2;
        this.h = z10;
    }

    public static p a() {
        x.b();
        q qVar = x.c().e;
        if (qVar instanceof p) {
            return (p) qVar;
        }
        return null;
    }

    public final m.l b(v vVar) {
        if (vVar != null) {
            String str = vVar.f42820c;
            a0.f fVar = this.f42836w;
            if (fVar != null && fVar.containsKey(str)) {
                return new m.l((o) this.f42836w.get(str));
            }
            return null;
        }
        throw new NullPointerException("route must not be null");
    }

    public final g3 c() {
        u uVar = this.f42818a;
        uVar.getClass();
        x.b();
        return uVar.f42813a;
    }

    public final boolean d() {
        x.b();
        v vVar = x.c().v;
        if (vVar != null) {
            if (vVar != this && this.f42828n != 3) {
                if (TextUtils.equals(((ComponentName) ((h5) c().d).f13315b).getPackageName(), "android") && m("android.media.intent.category.LIVE_AUDIO") && !m("android.media.intent.category.LIVE_VIDEO")) {
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
        if (this.f42835u != null && this.f42822g) {
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
            ArrayList arrayList = this.f42825k;
            if (arrayList != null) {
                rVar.a();
                if (!rVar.f42797b.isEmpty()) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        IntentFilter intentFilter = (IntentFilter) obj;
                        if (intentFilter != null) {
                            for (String str : rVar.f42797b) {
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
        int min = Math.min(this.f42831q, Math.max(0, i10));
        HashMap hashMap = c10.f42706b;
        if (this == c10.d && (qVar2 = c10.e) != null) {
            qVar2.f(min);
        } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f42820c)) != null) {
            qVar.f(min);
        }
    }

    public final void k(int i10) {
        q qVar;
        q qVar2;
        x.b();
        if (i10 != 0) {
            e c10 = x.c();
            HashMap hashMap = c10.f42706b;
            if (this == c10.d && (qVar2 = c10.e) != null) {
                qVar2.i(i10);
            } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f42820c)) != null) {
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
        ArrayList arrayList = this.f42825k;
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
        if (this.f42836w == null) {
            this.f42836w = new a0.l(0);
        }
        this.f42836w.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            v a2 = this.f42818a.a(oVar.f42775a.d());
            if (a2 != null) {
                this.f42836w.put(a2.f42820c, oVar);
                int i10 = oVar.f42776b;
                if (i10 == 2 || i10 == 3) {
                    this.v.add(a2);
                }
            }
        }
        x.c().f42705a.b(259, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb2.append(this.f42820c);
        sb2.append(", name=");
        sb2.append(this.d);
        sb2.append(", description=");
        sb2.append(this.e);
        sb2.append(", iconUri=");
        sb2.append(this.f42821f);
        sb2.append(", enabled=");
        sb2.append(this.f42822g);
        sb2.append(", isSystemRoute=");
        sb2.append(this.h);
        sb2.append(", connectionState=");
        sb2.append(this.f42823i);
        sb2.append(", canDisconnect=");
        sb2.append(this.f42824j);
        sb2.append(", playbackType=");
        sb2.append(this.f42826l);
        sb2.append(", playbackStream=");
        sb2.append(this.f42827m);
        sb2.append(", deviceType=");
        sb2.append(this.f42828n);
        sb2.append(", volumeHandling=");
        sb2.append(this.f42829o);
        sb2.append(", volume=");
        sb2.append(this.f42830p);
        sb2.append(", volumeMax=");
        sb2.append(this.f42831q);
        sb2.append(", presentationDisplayId=");
        sb2.append(this.f42832r);
        sb2.append(", extras=");
        sb2.append(this.f42833s);
        sb2.append(", settingsIntent=");
        sb2.append(this.f42834t);
        sb2.append(", providerPackageName=");
        sb2.append(((ComponentName) this.f42818a.d.f13315b).getPackageName());
        if (e()) {
            sb2.append(", members=[");
            int size = this.v.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                if (this.v.get(i10) != this) {
                    sb2.append(((v) this.v.get(i10)).f42820c);
                }
            }
            sb2.append(']');
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
