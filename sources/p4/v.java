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
import m.g3;
public final class v {
    public final u f39788a;
    public final String f39789b;
    public final String f39790c;
    public String d;
    public String e;
    public Uri f39791f;
    public boolean f39792g;
    public final boolean h;
    public int f39793i;
    public boolean f39794j;
    public int f39796l;
    public int f39797m;
    public int f39798n;
    public int f39799o;
    public int f39800p;
    public int f39801q;
    public Bundle f39803s;
    public IntentSender f39804t;
    public m f39805u;
    public a0.f f39806w;
    public final ArrayList f39795k = new ArrayList();
    public int f39802r = -1;
    public ArrayList v = new ArrayList();

    public v(u uVar, String str, String str2, boolean z10) {
        this.f39788a = uVar;
        this.f39789b = str;
        this.f39790c = str2;
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

    public final l2.g b(v vVar) {
        if (vVar != null) {
            String str = vVar.f39790c;
            a0.f fVar = this.f39806w;
            if (fVar != null && fVar.containsKey(str)) {
                return new l2.g((o) this.f39806w.get(str), 13);
            }
            return null;
        }
        throw new NullPointerException("route must not be null");
    }

    public final h3 c() {
        u uVar = this.f39788a;
        uVar.getClass();
        x.b();
        return uVar.f39785a;
    }

    public final boolean d() {
        x.b();
        v vVar = x.c().v;
        if (vVar != null) {
            if (vVar != this && this.f39798n != 3) {
                if (TextUtils.equals(((ComponentName) ((g3) c().d).f13018b).getPackageName(), "android") && m("android.media.intent.category.LIVE_AUDIO") && !m("android.media.intent.category.LIVE_VIDEO")) {
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
        if (this.f39805u != null && this.f39792g) {
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
            ArrayList arrayList = this.f39795k;
            if (arrayList != null) {
                rVar.a();
                if (!rVar.f39769b.isEmpty()) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        IntentFilter intentFilter = (IntentFilter) obj;
                        if (intentFilter != null) {
                            for (String str : rVar.f39769b) {
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
        int min = Math.min(this.f39801q, Math.max(0, i10));
        HashMap hashMap = c10.f39678b;
        if (this == c10.d && (qVar2 = c10.e) != null) {
            qVar2.f(min);
        } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f39790c)) != null) {
            qVar.f(min);
        }
    }

    public final void k(int i10) {
        q qVar;
        q qVar2;
        x.b();
        if (i10 != 0) {
            e c10 = x.c();
            HashMap hashMap = c10.f39678b;
            if (this == c10.d && (qVar2 = c10.e) != null) {
                qVar2.i(i10);
            } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f39790c)) != null) {
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
        ArrayList arrayList = this.f39795k;
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
        if (this.f39806w == null) {
            this.f39806w = new a0.l(0);
        }
        this.f39806w.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            v a2 = this.f39788a.a(oVar.f39747a.d());
            if (a2 != null) {
                this.f39806w.put(a2.f39790c, oVar);
                int i10 = oVar.f39748b;
                if (i10 == 2 || i10 == 3) {
                    this.v.add(a2);
                }
            }
        }
        x.c().f39677a.b(259, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb2.append(this.f39790c);
        sb2.append(", name=");
        sb2.append(this.d);
        sb2.append(", description=");
        sb2.append(this.e);
        sb2.append(", iconUri=");
        sb2.append(this.f39791f);
        sb2.append(", enabled=");
        sb2.append(this.f39792g);
        sb2.append(", isSystemRoute=");
        sb2.append(this.h);
        sb2.append(", connectionState=");
        sb2.append(this.f39793i);
        sb2.append(", canDisconnect=");
        sb2.append(this.f39794j);
        sb2.append(", playbackType=");
        sb2.append(this.f39796l);
        sb2.append(", playbackStream=");
        sb2.append(this.f39797m);
        sb2.append(", deviceType=");
        sb2.append(this.f39798n);
        sb2.append(", volumeHandling=");
        sb2.append(this.f39799o);
        sb2.append(", volume=");
        sb2.append(this.f39800p);
        sb2.append(", volumeMax=");
        sb2.append(this.f39801q);
        sb2.append(", presentationDisplayId=");
        sb2.append(this.f39802r);
        sb2.append(", extras=");
        sb2.append(this.f39803s);
        sb2.append(", settingsIntent=");
        sb2.append(this.f39804t);
        sb2.append(", providerPackageName=");
        sb2.append(((ComponentName) this.f39788a.d.f13018b).getPackageName());
        if (e()) {
            sb2.append(", members=[");
            int size = this.v.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                if (this.v.get(i10) != this) {
                    sb2.append(((v) this.v.get(i10)).f39790c);
                }
            }
            sb2.append(']');
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
