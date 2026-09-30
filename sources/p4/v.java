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
    public final u f41029a;
    public final String f41030b;
    public final String f41031c;
    public String d;
    public String e;
    public Uri f41032f;
    public boolean f41033g;
    public final boolean h;
    public int f41034i;
    public boolean f41035j;
    public int f41037l;
    public int f41038m;
    public int f41039n;
    public int f41040o;
    public int f41041p;
    public int f41042q;
    public Bundle f41044s;
    public IntentSender f41045t;
    public m f41046u;
    public a0.f f41047w;
    public final ArrayList f41036k = new ArrayList();
    public int f41043r = -1;
    public ArrayList v = new ArrayList();

    public v(u uVar, String str, String str2, boolean z10) {
        this.f41029a = uVar;
        this.f41030b = str;
        this.f41031c = str2;
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
            String str = vVar.f41031c;
            a0.f fVar = this.f41047w;
            if (fVar != null && fVar.containsKey(str)) {
                return new k2.u((o) this.f41047w.get(str), 18);
            }
            return null;
        }
        throw new NullPointerException("route must not be null");
    }

    public final h3 c() {
        u uVar = this.f41029a;
        uVar.getClass();
        x.b();
        return uVar.f41026a;
    }

    public final boolean d() {
        x.b();
        v vVar = x.c().v;
        if (vVar != null) {
            if (vVar != this && this.f41039n != 3) {
                if (TextUtils.equals(((ComponentName) ((n2.e) c().d).f15132b).getPackageName(), "android") && m("android.media.intent.category.LIVE_AUDIO") && !m("android.media.intent.category.LIVE_VIDEO")) {
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
        if (this.f41046u != null && this.f41033g) {
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
            ArrayList arrayList = this.f41036k;
            if (arrayList != null) {
                rVar.a();
                if (!rVar.f41010b.isEmpty()) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        IntentFilter intentFilter = (IntentFilter) obj;
                        if (intentFilter != null) {
                            for (String str : rVar.f41010b) {
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
        int min = Math.min(this.f41042q, Math.max(0, i10));
        HashMap hashMap = c10.f40919b;
        if (this == c10.d && (qVar2 = c10.e) != null) {
            qVar2.f(min);
        } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f41031c)) != null) {
            qVar.f(min);
        }
    }

    public final void k(int i10) {
        q qVar;
        q qVar2;
        x.b();
        if (i10 != 0) {
            e c10 = x.c();
            HashMap hashMap = c10.f40919b;
            if (this == c10.d && (qVar2 = c10.e) != null) {
                qVar2.i(i10);
            } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f41031c)) != null) {
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
        ArrayList arrayList = this.f41036k;
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
        if (this.f41047w == null) {
            this.f41047w = new a0.m(0);
        }
        this.f41047w.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            v a2 = this.f41029a.a(oVar.f40988a.d());
            if (a2 != null) {
                this.f41047w.put(a2.f41031c, oVar);
                int i10 = oVar.f40989b;
                if (i10 == 2 || i10 == 3) {
                    this.v.add(a2);
                }
            }
        }
        x.c().f40918a.b(259, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb2.append(this.f41031c);
        sb2.append(", name=");
        sb2.append(this.d);
        sb2.append(", description=");
        sb2.append(this.e);
        sb2.append(", iconUri=");
        sb2.append(this.f41032f);
        sb2.append(", enabled=");
        sb2.append(this.f41033g);
        sb2.append(", isSystemRoute=");
        sb2.append(this.h);
        sb2.append(", connectionState=");
        sb2.append(this.f41034i);
        sb2.append(", canDisconnect=");
        sb2.append(this.f41035j);
        sb2.append(", playbackType=");
        sb2.append(this.f41037l);
        sb2.append(", playbackStream=");
        sb2.append(this.f41038m);
        sb2.append(", deviceType=");
        sb2.append(this.f41039n);
        sb2.append(", volumeHandling=");
        sb2.append(this.f41040o);
        sb2.append(", volume=");
        sb2.append(this.f41041p);
        sb2.append(", volumeMax=");
        sb2.append(this.f41042q);
        sb2.append(", presentationDisplayId=");
        sb2.append(this.f41043r);
        sb2.append(", extras=");
        sb2.append(this.f41044s);
        sb2.append(", settingsIntent=");
        sb2.append(this.f41045t);
        sb2.append(", providerPackageName=");
        sb2.append(((ComponentName) this.f41029a.d.f15132b).getPackageName());
        if (e()) {
            sb2.append(", members=[");
            int size = this.v.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                if (this.v.get(i10) != this) {
                    sb2.append(((v) this.v.get(i10)).f41031c);
                }
            }
            sb2.append(']');
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
