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
public final class v {
    public final u f40931a;
    public final String f40932b;
    public final String f40933c;
    public String d;
    public String e;
    public Uri f40934f;
    public boolean f40935g;
    public final boolean h;
    public int f40936i;
    public boolean f40937j;
    public int f40939l;
    public int f40940m;
    public int f40941n;
    public int f40942o;
    public int f40943p;
    public int f40944q;
    public Bundle f40946s;
    public IntentSender f40947t;
    public m f40948u;
    public a0.f f40949w;
    public final ArrayList f40938k = new ArrayList();
    public int f40945r = -1;
    public ArrayList v = new ArrayList();

    public v(u uVar, String str, String str2, boolean z10) {
        this.f40931a = uVar;
        this.f40932b = str;
        this.f40933c = str2;
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

    public final k2.u b(v vVar) {
        if (vVar != null) {
            String str = vVar.f40933c;
            a0.f fVar = this.f40949w;
            if (fVar != null && fVar.containsKey(str)) {
                return new k2.u((o) this.f40949w.get(str), 18);
            }
            return null;
        }
        throw new NullPointerException("route must not be null");
    }

    public final h3 c() {
        u uVar = this.f40931a;
        uVar.getClass();
        x.b();
        return uVar.f40928a;
    }

    public final boolean d() {
        x.b();
        v vVar = x.c().v;
        if (vVar != null) {
            if (vVar != this && this.f40941n != 3) {
                if (TextUtils.equals(((ComponentName) ((n2.e) c().d).f15116b).getPackageName(), "android") && m("android.media.intent.category.LIVE_AUDIO") && !m("android.media.intent.category.LIVE_VIDEO")) {
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
        if (this.f40948u != null && this.f40935g) {
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
            ArrayList arrayList = this.f40938k;
            if (arrayList != null) {
                rVar.a();
                if (!rVar.f40912b.isEmpty()) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        IntentFilter intentFilter = (IntentFilter) obj;
                        if (intentFilter != null) {
                            for (String str : rVar.f40912b) {
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
        int min = Math.min(this.f40944q, Math.max(0, i10));
        HashMap hashMap = c10.f40821b;
        if (this == c10.d && (qVar2 = c10.e) != null) {
            qVar2.f(min);
        } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f40933c)) != null) {
            qVar.f(min);
        }
    }

    public final void k(int i10) {
        q qVar;
        q qVar2;
        x.b();
        if (i10 != 0) {
            e c10 = x.c();
            HashMap hashMap = c10.f40821b;
            if (this == c10.d && (qVar2 = c10.e) != null) {
                qVar2.i(i10);
            } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f40933c)) != null) {
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
        ArrayList arrayList = this.f40938k;
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
        if (this.f40949w == null) {
            this.f40949w = new a0.m(0);
        }
        this.f40949w.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            v a2 = this.f40931a.a(oVar.f40890a.d());
            if (a2 != null) {
                this.f40949w.put(a2.f40933c, oVar);
                int i10 = oVar.f40891b;
                if (i10 == 2 || i10 == 3) {
                    this.v.add(a2);
                }
            }
        }
        x.c().f40820a.b(259, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb2.append(this.f40933c);
        sb2.append(", name=");
        sb2.append(this.d);
        sb2.append(", description=");
        sb2.append(this.e);
        sb2.append(", iconUri=");
        sb2.append(this.f40934f);
        sb2.append(", enabled=");
        sb2.append(this.f40935g);
        sb2.append(", isSystemRoute=");
        sb2.append(this.h);
        sb2.append(", connectionState=");
        sb2.append(this.f40936i);
        sb2.append(", canDisconnect=");
        sb2.append(this.f40937j);
        sb2.append(", playbackType=");
        sb2.append(this.f40939l);
        sb2.append(", playbackStream=");
        sb2.append(this.f40940m);
        sb2.append(", deviceType=");
        sb2.append(this.f40941n);
        sb2.append(", volumeHandling=");
        sb2.append(this.f40942o);
        sb2.append(", volume=");
        sb2.append(this.f40943p);
        sb2.append(", volumeMax=");
        sb2.append(this.f40944q);
        sb2.append(", presentationDisplayId=");
        sb2.append(this.f40945r);
        sb2.append(", extras=");
        sb2.append(this.f40946s);
        sb2.append(", settingsIntent=");
        sb2.append(this.f40947t);
        sb2.append(", providerPackageName=");
        sb2.append(((ComponentName) this.f40931a.d.f15116b).getPackageName());
        if (e()) {
            sb2.append(", members=[");
            int size = this.v.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                if (this.v.get(i10) != this) {
                    sb2.append(((v) this.v.get(i10)).f40933c);
                }
            }
            sb2.append(']');
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
