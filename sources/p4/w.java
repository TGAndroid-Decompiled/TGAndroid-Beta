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
import ji.d4;
import ji.w4;
public final class w {
    public final v f43120a;
    public final String f43121b;
    public final String f43122c;
    public String d;
    public String e;
    public Uri f43123f;
    public boolean f43124g;
    public final boolean h;
    public int f43125i;
    public boolean f43126j;
    public int f43128l;
    public int f43129m;
    public int f43130n;
    public int f43131o;
    public int f43132p;
    public int f43133q;
    public Bundle f43135s;
    public IntentSender f43136t;
    public m f43137u;
    public a0.f f43138w;
    public final ArrayList f43127k = new ArrayList();
    public int f43134r = -1;
    public ArrayList v = new ArrayList();

    public w(v vVar, String str, String str2, boolean z10) {
        this.f43120a = vVar;
        this.f43121b = str;
        this.f43122c = str2;
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

    public final w4 b(w wVar) {
        if (wVar != null) {
            String str = wVar.f43122c;
            a0.f fVar = this.f43138w;
            if (fVar != null && fVar.containsKey(str)) {
                return new w4((o) this.f43138w.get(str), 21);
            }
            return null;
        }
        throw new NullPointerException("route must not be null");
    }

    public final g3 c() {
        v vVar = this.f43120a;
        vVar.getClass();
        y.b();
        return vVar.f43117a;
    }

    public final boolean d() {
        y.b();
        w wVar = y.c().v;
        if (wVar != null) {
            if (wVar != this && this.f43130n != 3) {
                if (TextUtils.equals(((ComponentName) ((d4) c().d).f13233b).getPackageName(), "android") && m("android.media.intent.category.LIVE_AUDIO") && !m("android.media.intent.category.LIVE_VIDEO")) {
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
        if (this.f43137u != null && this.f43124g) {
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
            ArrayList arrayList = this.f43127k;
            if (arrayList != null) {
                sVar.a();
                if (!sVar.f43101b.isEmpty()) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        IntentFilter intentFilter = (IntentFilter) obj;
                        if (intentFilter != null) {
                            for (String str : sVar.f43101b) {
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
        int min = Math.min(this.f43133q, Math.max(0, i10));
        HashMap hashMap = c10.f43009b;
        if (this == c10.d && (qVar2 = c10.e) != null) {
            qVar2.f(min);
        } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f43122c)) != null) {
            qVar.f(min);
        }
    }

    public final void k(int i10) {
        q qVar;
        q qVar2;
        y.b();
        if (i10 != 0) {
            e c10 = y.c();
            HashMap hashMap = c10.f43009b;
            if (this == c10.d && (qVar2 = c10.e) != null) {
                qVar2.i(i10);
            } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f43122c)) != null) {
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
        ArrayList arrayList = this.f43127k;
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
        if (this.f43138w == null) {
            this.f43138w = new a0.l(0);
        }
        this.f43138w.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            w a2 = this.f43120a.a(oVar.f43078a.d());
            if (a2 != null) {
                this.f43138w.put(a2.f43122c, oVar);
                int i10 = oVar.f43079b;
                if (i10 == 2 || i10 == 3) {
                    this.v.add(a2);
                }
            }
        }
        y.c().f43008a.b(259, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb2.append(this.f43122c);
        sb2.append(", name=");
        sb2.append(this.d);
        sb2.append(", description=");
        sb2.append(this.e);
        sb2.append(", iconUri=");
        sb2.append(this.f43123f);
        sb2.append(", enabled=");
        sb2.append(this.f43124g);
        sb2.append(", isSystemRoute=");
        sb2.append(this.h);
        sb2.append(", connectionState=");
        sb2.append(this.f43125i);
        sb2.append(", canDisconnect=");
        sb2.append(this.f43126j);
        sb2.append(", playbackType=");
        sb2.append(this.f43128l);
        sb2.append(", playbackStream=");
        sb2.append(this.f43129m);
        sb2.append(", deviceType=");
        sb2.append(this.f43130n);
        sb2.append(", volumeHandling=");
        sb2.append(this.f43131o);
        sb2.append(", volume=");
        sb2.append(this.f43132p);
        sb2.append(", volumeMax=");
        sb2.append(this.f43133q);
        sb2.append(", presentationDisplayId=");
        sb2.append(this.f43134r);
        sb2.append(", extras=");
        sb2.append(this.f43135s);
        sb2.append(", settingsIntent=");
        sb2.append(this.f43136t);
        sb2.append(", providerPackageName=");
        sb2.append(((ComponentName) this.f43120a.d.f13233b).getPackageName());
        if (e()) {
            sb2.append(", members=[");
            int size = this.v.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                if (this.v.get(i10) != this) {
                    sb2.append(((w) this.v.get(i10)).f43122c);
                }
            }
            sb2.append(']');
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
