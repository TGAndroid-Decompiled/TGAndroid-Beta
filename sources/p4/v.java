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
    public final u f43952a;
    public final String f43953b;
    public final String f43954c;
    public String d;
    public String f43955e;
    public Uri f43956f;
    public boolean f43957g;
    public final boolean h;
    public int f43958i;
    public boolean f43959j;
    public int f43961l;
    public int f43962m;
    public int f43963n;
    public int f43964o;
    public int f43965p;
    public int f43966q;
    public Bundle f43968s;
    public IntentSender f43969t;
    public m f43970u;
    public a0.f f43971w;
    public final ArrayList f43960k = new ArrayList();
    public int f43967r = -1;
    public ArrayList v = new ArrayList();

    public v(u uVar, String str, String str2, boolean z10) {
        this.f43952a = uVar;
        this.f43953b = str;
        this.f43954c = str2;
        this.h = z10;
    }

    public static p a() {
        x.b();
        q qVar = x.c().f43836e;
        if (qVar instanceof p) {
            return (p) qVar;
        }
        return null;
    }

    public final mg.n b(v vVar) {
        if (vVar != null) {
            String str = vVar.f43954c;
            a0.f fVar = this.f43971w;
            if (fVar != null && fVar.containsKey(str)) {
                return new mg.n((o) this.f43971w.get(str), 11);
            }
            return null;
        }
        throw new NullPointerException("route must not be null");
    }

    public final h3 c() {
        u uVar = this.f43952a;
        uVar.getClass();
        x.b();
        return uVar.f43948a;
    }

    public final boolean d() {
        x.b();
        v vVar = x.c().v;
        if (vVar != null) {
            if (vVar != this && this.f43963n != 3) {
                if (TextUtils.equals(((ComponentName) ((u4) c().d).f14247b).getPackageName(), "android") && m("android.media.intent.category.LIVE_AUDIO") && !m("android.media.intent.category.LIVE_VIDEO")) {
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
        if (this.f43970u != null && this.f43957g) {
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
            ArrayList arrayList = this.f43960k;
            if (arrayList != null) {
                rVar.a();
                if (!rVar.f43930b.isEmpty()) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        IntentFilter intentFilter = (IntentFilter) obj;
                        if (intentFilter != null) {
                            for (String str : rVar.f43930b) {
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
        int min = Math.min(this.f43966q, Math.max(0, i10));
        HashMap hashMap = c10.f43834b;
        if (this == c10.d && (qVar2 = c10.f43836e) != null) {
            qVar2.f(min);
        } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f43954c)) != null) {
            qVar.f(min);
        }
    }

    public final void k(int i10) {
        q qVar;
        q qVar2;
        x.b();
        if (i10 != 0) {
            e c10 = x.c();
            HashMap hashMap = c10.f43834b;
            if (this == c10.d && (qVar2 = c10.f43836e) != null) {
                qVar2.i(i10);
            } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f43954c)) != null) {
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
        ArrayList arrayList = this.f43960k;
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
        if (this.f43971w == null) {
            this.f43971w = new a0.l(0);
        }
        this.f43971w.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            v a2 = this.f43952a.a(oVar.f43905a.d());
            if (a2 != null) {
                this.f43971w.put(a2.f43954c, oVar);
                int i10 = oVar.f43906b;
                if (i10 == 2 || i10 == 3) {
                    this.v.add(a2);
                }
            }
        }
        x.c().f43833a.b(259, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb2.append(this.f43954c);
        sb2.append(", name=");
        sb2.append(this.d);
        sb2.append(", description=");
        sb2.append(this.f43955e);
        sb2.append(", iconUri=");
        sb2.append(this.f43956f);
        sb2.append(", enabled=");
        sb2.append(this.f43957g);
        sb2.append(", isSystemRoute=");
        sb2.append(this.h);
        sb2.append(", connectionState=");
        sb2.append(this.f43958i);
        sb2.append(", canDisconnect=");
        sb2.append(this.f43959j);
        sb2.append(", playbackType=");
        sb2.append(this.f43961l);
        sb2.append(", playbackStream=");
        sb2.append(this.f43962m);
        sb2.append(", deviceType=");
        sb2.append(this.f43963n);
        sb2.append(", volumeHandling=");
        sb2.append(this.f43964o);
        sb2.append(", volume=");
        sb2.append(this.f43965p);
        sb2.append(", volumeMax=");
        sb2.append(this.f43966q);
        sb2.append(", presentationDisplayId=");
        sb2.append(this.f43967r);
        sb2.append(", extras=");
        sb2.append(this.f43968s);
        sb2.append(", settingsIntent=");
        sb2.append(this.f43969t);
        sb2.append(", providerPackageName=");
        sb2.append(((ComponentName) this.f43952a.d.f14247b).getPackageName());
        if (e()) {
            sb2.append(", members=[");
            int size = this.v.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                if (this.v.get(i10) != this) {
                    sb2.append(((v) this.v.get(i10)).f43954c);
                }
            }
            sb2.append(']');
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
