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
import m.f3;
public final class v {
    public final u f45490a;
    public final String f45491b;
    public final String f45492c;
    public String d;
    public String f45493e;
    public Uri f45494f;
    public boolean f45495g;
    public final boolean h;
    public int f45496i;
    public boolean f45497j;
    public int f45499l;
    public int f45500m;
    public int f45501n;
    public int f45502o;
    public int f45503p;
    public int f45504q;
    public Bundle f45506s;
    public IntentSender f45507t;
    public m f45508u;
    public a0.f f45509w;
    public final ArrayList f45498k = new ArrayList();
    public int f45505r = -1;
    public ArrayList v = new ArrayList();

    public v(u uVar, String str, String str2, boolean z10) {
        this.f45490a = uVar;
        this.f45491b = str;
        this.f45492c = str2;
        this.h = z10;
    }

    public static p a() {
        x.b();
        q qVar = x.c().f45374e;
        if (qVar instanceof p) {
            return (p) qVar;
        }
        return null;
    }

    public final l2.f b(v vVar) {
        if (vVar != null) {
            String str = vVar.f45492c;
            a0.f fVar = this.f45509w;
            if (fVar != null && fVar.containsKey(str)) {
                return new l2.f((o) this.f45509w.get(str), 17);
            }
            return null;
        }
        throw new NullPointerException("route must not be null");
    }

    public final h3 c() {
        u uVar = this.f45490a;
        uVar.getClass();
        x.b();
        return uVar.f45486a;
    }

    public final boolean d() {
        x.b();
        v vVar = x.c().v;
        if (vVar != null) {
            if (vVar != this && this.f45501n != 3) {
                if (TextUtils.equals(((ComponentName) ((f3) c().d).f15672b).getPackageName(), "android") && m("android.media.intent.category.LIVE_AUDIO") && !m("android.media.intent.category.LIVE_VIDEO")) {
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
        if (this.f45508u != null && this.f45495g) {
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
            ArrayList arrayList = this.f45498k;
            if (arrayList != null) {
                rVar.a();
                if (!rVar.f45468b.isEmpty()) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        IntentFilter intentFilter = (IntentFilter) obj;
                        if (intentFilter != null) {
                            for (String str : rVar.f45468b) {
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
        int min = Math.min(this.f45504q, Math.max(0, i10));
        HashMap hashMap = c10.f45372b;
        if (this == c10.d && (qVar2 = c10.f45374e) != null) {
            qVar2.f(min);
        } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f45492c)) != null) {
            qVar.f(min);
        }
    }

    public final void k(int i10) {
        q qVar;
        q qVar2;
        x.b();
        if (i10 != 0) {
            e c10 = x.c();
            HashMap hashMap = c10.f45372b;
            if (this == c10.d && (qVar2 = c10.f45374e) != null) {
                qVar2.i(i10);
            } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f45492c)) != null) {
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
        ArrayList arrayList = this.f45498k;
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
        if (this.f45509w == null) {
            this.f45509w = new a0.m(0);
        }
        this.f45509w.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            v a2 = this.f45490a.a(oVar.f45443a.d());
            if (a2 != null) {
                this.f45509w.put(a2.f45492c, oVar);
                int i10 = oVar.f45444b;
                if (i10 == 2 || i10 == 3) {
                    this.v.add(a2);
                }
            }
        }
        x.c().f45371a.b(259, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb2.append(this.f45492c);
        sb2.append(", name=");
        sb2.append(this.d);
        sb2.append(", description=");
        sb2.append(this.f45493e);
        sb2.append(", iconUri=");
        sb2.append(this.f45494f);
        sb2.append(", enabled=");
        sb2.append(this.f45495g);
        sb2.append(", isSystemRoute=");
        sb2.append(this.h);
        sb2.append(", connectionState=");
        sb2.append(this.f45496i);
        sb2.append(", canDisconnect=");
        sb2.append(this.f45497j);
        sb2.append(", playbackType=");
        sb2.append(this.f45499l);
        sb2.append(", playbackStream=");
        sb2.append(this.f45500m);
        sb2.append(", deviceType=");
        sb2.append(this.f45501n);
        sb2.append(", volumeHandling=");
        sb2.append(this.f45502o);
        sb2.append(", volume=");
        sb2.append(this.f45503p);
        sb2.append(", volumeMax=");
        sb2.append(this.f45504q);
        sb2.append(", presentationDisplayId=");
        sb2.append(this.f45505r);
        sb2.append(", extras=");
        sb2.append(this.f45506s);
        sb2.append(", settingsIntent=");
        sb2.append(this.f45507t);
        sb2.append(", providerPackageName=");
        sb2.append(((ComponentName) this.f45490a.d.f15672b).getPackageName());
        if (e()) {
            sb2.append(", members=[");
            int size = this.v.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                if (this.v.get(i10) != this) {
                    sb2.append(((v) this.v.get(i10)).f45492c);
                }
            }
            sb2.append(']');
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
