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
    public final u f44208a;
    public final String f44209b;
    public final String f44210c;
    public String d;
    public String e;
    public Uri f44211f;
    public boolean f44212g;
    public final boolean h;
    public int f44213i;
    public boolean f44214j;
    public int f44216l;
    public int f44217m;
    public int f44218n;
    public int f44219o;
    public int f44220p;
    public int f44221q;
    public Bundle f44223s;
    public IntentSender f44224t;
    public m f44225u;
    public a0.f f44226w;
    public final ArrayList f44215k = new ArrayList();
    public int f44222r = -1;
    public ArrayList v = new ArrayList();

    public v(u uVar, String str, String str2, boolean z10) {
        this.f44208a = uVar;
        this.f44209b = str;
        this.f44210c = str2;
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
            String str = vVar.f44210c;
            a0.f fVar = this.f44226w;
            if (fVar != null && fVar.containsKey(str)) {
                return new l2.f((o) this.f44226w.get(str), 15);
            }
            return null;
        }
        throw new NullPointerException("route must not be null");
    }

    public final g3 c() {
        u uVar = this.f44208a;
        uVar.getClass();
        x.b();
        return uVar.f44205a;
    }

    public final boolean d() {
        x.b();
        v vVar = x.c().v;
        if (vVar != null) {
            if (vVar != this && this.f44218n != 3) {
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
        if (this.f44225u != null && this.f44212g) {
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
            ArrayList arrayList = this.f44215k;
            if (arrayList != null) {
                rVar.a();
                if (!rVar.f44189b.isEmpty()) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        IntentFilter intentFilter = (IntentFilter) obj;
                        if (intentFilter != null) {
                            for (String str : rVar.f44189b) {
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
        int min = Math.min(this.f44221q, Math.max(0, i10));
        HashMap hashMap = c10.f44098b;
        if (this == c10.d && (qVar2 = c10.e) != null) {
            qVar2.f(min);
        } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f44210c)) != null) {
            qVar.f(min);
        }
    }

    public final void k(int i10) {
        q qVar;
        q qVar2;
        x.b();
        if (i10 != 0) {
            e c10 = x.c();
            HashMap hashMap = c10.f44098b;
            if (this == c10.d && (qVar2 = c10.e) != null) {
                qVar2.i(i10);
            } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f44210c)) != null) {
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
        ArrayList arrayList = this.f44215k;
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
        if (this.f44226w == null) {
            this.f44226w = new a0.l(0);
        }
        this.f44226w.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            v a2 = this.f44208a.a(oVar.f44167a.d());
            if (a2 != null) {
                this.f44226w.put(a2.f44210c, oVar);
                int i10 = oVar.f44168b;
                if (i10 == 2 || i10 == 3) {
                    this.v.add(a2);
                }
            }
        }
        x.c().f44097a.b(259, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb2.append(this.f44210c);
        sb2.append(", name=");
        sb2.append(this.d);
        sb2.append(", description=");
        sb2.append(this.e);
        sb2.append(", iconUri=");
        sb2.append(this.f44211f);
        sb2.append(", enabled=");
        sb2.append(this.f44212g);
        sb2.append(", isSystemRoute=");
        sb2.append(this.h);
        sb2.append(", connectionState=");
        sb2.append(this.f44213i);
        sb2.append(", canDisconnect=");
        sb2.append(this.f44214j);
        sb2.append(", playbackType=");
        sb2.append(this.f44216l);
        sb2.append(", playbackStream=");
        sb2.append(this.f44217m);
        sb2.append(", deviceType=");
        sb2.append(this.f44218n);
        sb2.append(", volumeHandling=");
        sb2.append(this.f44219o);
        sb2.append(", volume=");
        sb2.append(this.f44220p);
        sb2.append(", volumeMax=");
        sb2.append(this.f44221q);
        sb2.append(", presentationDisplayId=");
        sb2.append(this.f44222r);
        sb2.append(", extras=");
        sb2.append(this.f44223s);
        sb2.append(", settingsIntent=");
        sb2.append(this.f44224t);
        sb2.append(", providerPackageName=");
        sb2.append(((ComponentName) this.f44208a.d.f16009b).getPackageName());
        if (e()) {
            sb2.append(", members=[");
            int size = this.v.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                if (this.v.get(i10) != this) {
                    sb2.append(((v) this.v.get(i10)).f44210c);
                }
            }
            sb2.append(']');
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
