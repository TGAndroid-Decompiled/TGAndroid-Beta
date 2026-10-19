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
public final class v {
    public final u f44200a;
    public final String f44201b;
    public final String f44202c;
    public String d;
    public String e;
    public Uri f44203f;
    public boolean f44204g;
    public final boolean h;
    public int f44205i;
    public boolean f44206j;
    public int f44208l;
    public int f44209m;
    public int f44210n;
    public int f44211o;
    public int f44212p;
    public int f44213q;
    public Bundle f44215s;
    public IntentSender f44216t;
    public m f44217u;
    public a0.f f44218w;
    public final ArrayList f44207k = new ArrayList();
    public int f44214r = -1;
    public ArrayList v = new ArrayList();

    public v(u uVar, String str, String str2, boolean z10) {
        this.f44200a = uVar;
        this.f44201b = str;
        this.f44202c = str2;
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

    public final l2.f b(v vVar) {
        if (vVar != null) {
            String str = vVar.f44202c;
            a0.f fVar = this.f44218w;
            if (fVar != null && fVar.containsKey(str)) {
                return new l2.f((o) this.f44218w.get(str), 15);
            }
            return null;
        }
        throw new NullPointerException("route must not be null");
    }

    public final g3 c() {
        u uVar = this.f44200a;
        uVar.getClass();
        x.b();
        return uVar.f44197a;
    }

    public final boolean d() {
        x.b();
        v vVar = x.c().v;
        if (vVar != null) {
            if (vVar != this && this.f44210n != 3) {
                if (TextUtils.equals(((ComponentName) ((le.b) c().d).f16009b).getPackageName(), "android") && m("android.media.intent.category.LIVE_AUDIO") && !m("android.media.intent.category.LIVE_VIDEO")) {
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
        if (this.f44217u != null && this.f44204g) {
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
            ArrayList arrayList = this.f44207k;
            if (arrayList != null) {
                rVar.a();
                if (!rVar.f44181b.isEmpty()) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        IntentFilter intentFilter = (IntentFilter) obj;
                        if (intentFilter != null) {
                            for (String str : rVar.f44181b) {
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
        int min = Math.min(this.f44213q, Math.max(0, i10));
        HashMap hashMap = c10.f44090b;
        if (this == c10.d && (qVar2 = c10.e) != null) {
            qVar2.f(min);
        } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f44202c)) != null) {
            qVar.f(min);
        }
    }

    public final void k(int i10) {
        q qVar;
        q qVar2;
        x.b();
        if (i10 != 0) {
            e c10 = x.c();
            HashMap hashMap = c10.f44090b;
            if (this == c10.d && (qVar2 = c10.e) != null) {
                qVar2.i(i10);
            } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f44202c)) != null) {
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
        ArrayList arrayList = this.f44207k;
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
        if (this.f44218w == null) {
            this.f44218w = new a0.l(0);
        }
        this.f44218w.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            v a2 = this.f44200a.a(oVar.f44159a.d());
            if (a2 != null) {
                this.f44218w.put(a2.f44202c, oVar);
                int i10 = oVar.f44160b;
                if (i10 == 2 || i10 == 3) {
                    this.v.add(a2);
                }
            }
        }
        x.c().f44089a.b(259, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb2.append(this.f44202c);
        sb2.append(", name=");
        sb2.append(this.d);
        sb2.append(", description=");
        sb2.append(this.e);
        sb2.append(", iconUri=");
        sb2.append(this.f44203f);
        sb2.append(", enabled=");
        sb2.append(this.f44204g);
        sb2.append(", isSystemRoute=");
        sb2.append(this.h);
        sb2.append(", connectionState=");
        sb2.append(this.f44205i);
        sb2.append(", canDisconnect=");
        sb2.append(this.f44206j);
        sb2.append(", playbackType=");
        sb2.append(this.f44208l);
        sb2.append(", playbackStream=");
        sb2.append(this.f44209m);
        sb2.append(", deviceType=");
        sb2.append(this.f44210n);
        sb2.append(", volumeHandling=");
        sb2.append(this.f44211o);
        sb2.append(", volume=");
        sb2.append(this.f44212p);
        sb2.append(", volumeMax=");
        sb2.append(this.f44213q);
        sb2.append(", presentationDisplayId=");
        sb2.append(this.f44214r);
        sb2.append(", extras=");
        sb2.append(this.f44215s);
        sb2.append(", settingsIntent=");
        sb2.append(this.f44216t);
        sb2.append(", providerPackageName=");
        sb2.append(((ComponentName) this.f44200a.d.f16009b).getPackageName());
        if (e()) {
            sb2.append(", members=[");
            int size = this.v.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                if (this.v.get(i10) != this) {
                    sb2.append(((v) this.v.get(i10)).f44202c);
                }
            }
            sb2.append(']');
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
