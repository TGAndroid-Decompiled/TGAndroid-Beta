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
public final class w {
    public final v f44834a;
    public final String f44835b;
    public final String f44836c;
    public String d;
    public String e;
    public Uri f44837f;
    public boolean f44838g;
    public final boolean h;
    public int f44839i;
    public boolean f44840j;
    public int f44842l;
    public int f44843m;
    public int f44844n;
    public int f44845o;
    public int f44846p;
    public int f44847q;
    public Bundle f44849s;
    public IntentSender f44850t;
    public m f44851u;
    public a0.f f44852w;
    public final ArrayList f44841k = new ArrayList();
    public int f44848r = -1;
    public ArrayList v = new ArrayList();

    public w(v vVar, String str, String str2, boolean z10) {
        this.f44834a = vVar;
        this.f44835b = str;
        this.f44836c = str2;
        this.h = z10;
    }

    public static p a() {
        y.b();
        q qVar = y.c().e;
        if (qVar instanceof p) {
            return (p) qVar;
        }
        return null;
    }

    public final k2.m0 b(w wVar) {
        if (wVar != null) {
            String str = wVar.f44836c;
            a0.f fVar = this.f44852w;
            if (fVar != null && fVar.containsKey(str)) {
                return new k2.m0((o) this.f44852w.get(str));
            }
            return null;
        }
        throw new NullPointerException("route must not be null");
    }

    public final g3 c() {
        v vVar = this.f44834a;
        vVar.getClass();
        y.b();
        return vVar.f44831a;
    }

    public final boolean d() {
        y.b();
        w wVar = y.c().v;
        if (wVar != null) {
            if (wVar != this && this.f44844n != 3) {
                if (TextUtils.equals(((ComponentName) ((l2.f) c().d).f11588b).getPackageName(), "android") && m("android.media.intent.category.LIVE_AUDIO") && !m("android.media.intent.category.LIVE_VIDEO")) {
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
        if (this.f44851u != null && this.f44838g) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        y.b();
        if (y.c().e() == this) {
            return true;
        }
        return false;
    }

    public final boolean h(s sVar) {
        if (sVar != null) {
            y.b();
            ArrayList arrayList = this.f44841k;
            if (arrayList != null) {
                sVar.a();
                if (!sVar.f44815b.isEmpty()) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        IntentFilter intentFilter = (IntentFilter) obj;
                        if (intentFilter != null) {
                            for (String str : sVar.f44815b) {
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
        throw new UnsupportedOperationException("Method not decompiled: p4.w.i(p4.m):int");
    }

    public final void j(int i10) {
        q qVar;
        q qVar2;
        y.b();
        e c10 = y.c();
        int min = Math.min(this.f44847q, Math.max(0, i10));
        HashMap hashMap = c10.f44722b;
        if (this == c10.d && (qVar2 = c10.e) != null) {
            qVar2.f(min);
        } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f44836c)) != null) {
            qVar.f(min);
        }
    }

    public final void k(int i10) {
        q qVar;
        q qVar2;
        y.b();
        if (i10 != 0) {
            e c10 = y.c();
            HashMap hashMap = c10.f44722b;
            if (this == c10.d && (qVar2 = c10.e) != null) {
                qVar2.i(i10);
            } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f44836c)) != null) {
                qVar.i(i10);
            }
        }
    }

    public final void l() {
        y.b();
        y.c().i(this, 3);
    }

    public final boolean m(String str) {
        y.b();
        ArrayList arrayList = this.f44841k;
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
        if (this.f44852w == null) {
            this.f44852w = new a0.l(0);
        }
        this.f44852w.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            w a2 = this.f44834a.a(oVar.f44791a.d());
            if (a2 != null) {
                this.f44852w.put(a2.f44836c, oVar);
                int i10 = oVar.f44792b;
                if (i10 == 2 || i10 == 3) {
                    this.v.add(a2);
                }
            }
        }
        y.c().f44721a.b(259, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb2.append(this.f44836c);
        sb2.append(", name=");
        sb2.append(this.d);
        sb2.append(", description=");
        sb2.append(this.e);
        sb2.append(", iconUri=");
        sb2.append(this.f44837f);
        sb2.append(", enabled=");
        sb2.append(this.f44838g);
        sb2.append(", isSystemRoute=");
        sb2.append(this.h);
        sb2.append(", connectionState=");
        sb2.append(this.f44839i);
        sb2.append(", canDisconnect=");
        sb2.append(this.f44840j);
        sb2.append(", playbackType=");
        sb2.append(this.f44842l);
        sb2.append(", playbackStream=");
        sb2.append(this.f44843m);
        sb2.append(", deviceType=");
        sb2.append(this.f44844n);
        sb2.append(", volumeHandling=");
        sb2.append(this.f44845o);
        sb2.append(", volume=");
        sb2.append(this.f44846p);
        sb2.append(", volumeMax=");
        sb2.append(this.f44847q);
        sb2.append(", presentationDisplayId=");
        sb2.append(this.f44848r);
        sb2.append(", extras=");
        sb2.append(this.f44849s);
        sb2.append(", settingsIntent=");
        sb2.append(this.f44850t);
        sb2.append(", providerPackageName=");
        sb2.append(((ComponentName) this.f44834a.d.f11588b).getPackageName());
        if (e()) {
            sb2.append(", members=[");
            int size = this.v.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                if (this.v.get(i10) != this) {
                    sb2.append(((w) this.v.get(i10)).f44836c);
                }
            }
            sb2.append(']');
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
