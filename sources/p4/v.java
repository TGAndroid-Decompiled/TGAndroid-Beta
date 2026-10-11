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
    public final u f45480a;
    public final String f45481b;
    public final String f45482c;
    public String d;
    public String f45483e;
    public Uri f45484f;
    public boolean f45485g;
    public final boolean h;
    public int f45486i;
    public boolean f45487j;
    public int f45489l;
    public int f45490m;
    public int f45491n;
    public int f45492o;
    public int f45493p;
    public int f45494q;
    public Bundle f45496s;
    public IntentSender f45497t;
    public m f45498u;
    public a0.f f45499w;
    public final ArrayList f45488k = new ArrayList();
    public int f45495r = -1;
    public ArrayList v = new ArrayList();

    public v(u uVar, String str, String str2, boolean z10) {
        this.f45480a = uVar;
        this.f45481b = str;
        this.f45482c = str2;
        this.h = z10;
    }

    public static p a() {
        x.b();
        q qVar = x.c().f45364e;
        if (qVar instanceof p) {
            return (p) qVar;
        }
        return null;
    }

    public final l2.f b(v vVar) {
        if (vVar != null) {
            String str = vVar.f45482c;
            a0.f fVar = this.f45499w;
            if (fVar != null && fVar.containsKey(str)) {
                return new l2.f((o) this.f45499w.get(str), 17);
            }
            return null;
        }
        throw new NullPointerException("route must not be null");
    }

    public final h3 c() {
        u uVar = this.f45480a;
        uVar.getClass();
        x.b();
        return uVar.f45476a;
    }

    public final boolean d() {
        x.b();
        v vVar = x.c().v;
        if (vVar != null) {
            if (vVar != this && this.f45491n != 3) {
                if (TextUtils.equals(((ComponentName) ((f3) c().d).f15693b).getPackageName(), "android") && m("android.media.intent.category.LIVE_AUDIO") && !m("android.media.intent.category.LIVE_VIDEO")) {
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
        if (this.f45498u != null && this.f45485g) {
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
            ArrayList arrayList = this.f45488k;
            if (arrayList != null) {
                rVar.a();
                if (!rVar.f45458b.isEmpty()) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        IntentFilter intentFilter = (IntentFilter) obj;
                        if (intentFilter != null) {
                            for (String str : rVar.f45458b) {
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
        int min = Math.min(this.f45494q, Math.max(0, i10));
        HashMap hashMap = c10.f45362b;
        if (this == c10.d && (qVar2 = c10.f45364e) != null) {
            qVar2.f(min);
        } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f45482c)) != null) {
            qVar.f(min);
        }
    }

    public final void k(int i10) {
        q qVar;
        q qVar2;
        x.b();
        if (i10 != 0) {
            e c10 = x.c();
            HashMap hashMap = c10.f45362b;
            if (this == c10.d && (qVar2 = c10.f45364e) != null) {
                qVar2.i(i10);
            } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f45482c)) != null) {
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
        ArrayList arrayList = this.f45488k;
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
        if (this.f45499w == null) {
            this.f45499w = new a0.m(0);
        }
        this.f45499w.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            v a2 = this.f45480a.a(oVar.f45433a.d());
            if (a2 != null) {
                this.f45499w.put(a2.f45482c, oVar);
                int i10 = oVar.f45434b;
                if (i10 == 2 || i10 == 3) {
                    this.v.add(a2);
                }
            }
        }
        x.c().f45361a.b(259, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb2.append(this.f45482c);
        sb2.append(", name=");
        sb2.append(this.d);
        sb2.append(", description=");
        sb2.append(this.f45483e);
        sb2.append(", iconUri=");
        sb2.append(this.f45484f);
        sb2.append(", enabled=");
        sb2.append(this.f45485g);
        sb2.append(", isSystemRoute=");
        sb2.append(this.h);
        sb2.append(", connectionState=");
        sb2.append(this.f45486i);
        sb2.append(", canDisconnect=");
        sb2.append(this.f45487j);
        sb2.append(", playbackType=");
        sb2.append(this.f45489l);
        sb2.append(", playbackStream=");
        sb2.append(this.f45490m);
        sb2.append(", deviceType=");
        sb2.append(this.f45491n);
        sb2.append(", volumeHandling=");
        sb2.append(this.f45492o);
        sb2.append(", volume=");
        sb2.append(this.f45493p);
        sb2.append(", volumeMax=");
        sb2.append(this.f45494q);
        sb2.append(", presentationDisplayId=");
        sb2.append(this.f45495r);
        sb2.append(", extras=");
        sb2.append(this.f45496s);
        sb2.append(", settingsIntent=");
        sb2.append(this.f45497t);
        sb2.append(", providerPackageName=");
        sb2.append(((ComponentName) this.f45480a.d.f15693b).getPackageName());
        if (e()) {
            sb2.append(", members=[");
            int size = this.v.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                if (this.v.get(i10) != this) {
                    sb2.append(((v) this.v.get(i10)).f45482c);
                }
            }
            sb2.append(']');
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
