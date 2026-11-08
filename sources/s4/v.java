package s4;

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
import org.telegram.ui.Components.vy;
public final class v {
    public final u f54901a;
    public final String f54902b;
    public final String f54903c;
    public String d;
    public String f54904e;
    public Uri f54905f;
    public boolean f54906g;
    public final boolean h;
    public int f54907i;
    public boolean f54908j;
    public int f54910l;
    public int f54911m;
    public int f54912n;
    public int f54913o;
    public int f54914p;
    public int f54915q;
    public Bundle f54917s;
    public IntentSender f54918t;
    public m f54919u;
    public a0.f f54920w;
    public final ArrayList f54909k = new ArrayList();
    public int f54916r = -1;
    public ArrayList v = new ArrayList();

    public v(u uVar, String str, String str2, boolean z9) {
        this.f54901a = uVar;
        this.f54902b = str;
        this.f54903c = str2;
        this.h = z9;
    }

    public static p a() {
        x.b();
        q qVar = x.c().f54791e;
        if (qVar instanceof p) {
            return (p) qVar;
        }
        return null;
    }

    public final org.telegram.ui.Components.n b(v vVar) {
        if (vVar != null) {
            String str = vVar.f54903c;
            a0.f fVar = this.f54920w;
            if (fVar != null && fVar.containsKey(str)) {
                return new org.telegram.ui.Components.n((o) this.f54920w.get(str));
            }
            return null;
        }
        throw new NullPointerException("route must not be null");
    }

    public final g3 c() {
        u uVar = this.f54901a;
        uVar.getClass();
        x.b();
        return uVar.f54897a;
    }

    public final boolean d() {
        x.b();
        v vVar = x.c().v;
        if (vVar != null) {
            if (vVar != this && this.f54912n != 3) {
                if (TextUtils.equals(((ComponentName) ((vy) c().d).f39747b).getPackageName(), "android") && m("android.media.intent.category.LIVE_AUDIO") && !m("android.media.intent.category.LIVE_VIDEO")) {
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
        if (this.f54919u != null && this.f54906g) {
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
            ArrayList arrayList = this.f54909k;
            if (arrayList != null) {
                rVar.a();
                if (!rVar.f54885b.isEmpty()) {
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        IntentFilter intentFilter = (IntentFilter) obj;
                        if (intentFilter != null) {
                            for (String str : rVar.f54885b) {
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

    public final int i(s4.m r18) {
        throw new UnsupportedOperationException("Method not decompiled: s4.v.i(s4.m):int");
    }

    public final void j(int i7) {
        q qVar;
        q qVar2;
        x.b();
        e c10 = x.c();
        int min = Math.min(this.f54915q, Math.max(0, i7));
        HashMap hashMap = c10.f54789b;
        if (this == c10.d && (qVar2 = c10.f54791e) != null) {
            qVar2.f(min);
        } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f54903c)) != null) {
            qVar.f(min);
        }
    }

    public final void k(int i7) {
        q qVar;
        q qVar2;
        x.b();
        if (i7 != 0) {
            e c10 = x.c();
            HashMap hashMap = c10.f54789b;
            if (this == c10.d && (qVar2 = c10.f54791e) != null) {
                qVar2.i(i7);
            } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f54903c)) != null) {
                qVar.i(i7);
            }
        }
    }

    public final void l() {
        x.b();
        x.c().i(this, 3);
    }

    public final boolean m(String str) {
        x.b();
        ArrayList arrayList = this.f54909k;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (((IntentFilter) obj).hasCategory(str)) {
                return true;
            }
        }
        return false;
    }

    public final void n(Collection collection) {
        this.v.clear();
        if (this.f54920w == null) {
            this.f54920w = new a0.l(0);
        }
        this.f54920w.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            v a10 = this.f54901a.a(oVar.f54860a.d());
            if (a10 != null) {
                this.f54920w.put(a10.f54903c, oVar);
                int i7 = oVar.f54861b;
                if (i7 == 2 || i7 == 3) {
                    this.v.add(a10);
                }
            }
        }
        x.c().f54788a.b(259, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb2.append(this.f54903c);
        sb2.append(", name=");
        sb2.append(this.d);
        sb2.append(", description=");
        sb2.append(this.f54904e);
        sb2.append(", iconUri=");
        sb2.append(this.f54905f);
        sb2.append(", enabled=");
        sb2.append(this.f54906g);
        sb2.append(", isSystemRoute=");
        sb2.append(this.h);
        sb2.append(", connectionState=");
        sb2.append(this.f54907i);
        sb2.append(", canDisconnect=");
        sb2.append(this.f54908j);
        sb2.append(", playbackType=");
        sb2.append(this.f54910l);
        sb2.append(", playbackStream=");
        sb2.append(this.f54911m);
        sb2.append(", deviceType=");
        sb2.append(this.f54912n);
        sb2.append(", volumeHandling=");
        sb2.append(this.f54913o);
        sb2.append(", volume=");
        sb2.append(this.f54914p);
        sb2.append(", volumeMax=");
        sb2.append(this.f54915q);
        sb2.append(", presentationDisplayId=");
        sb2.append(this.f54916r);
        sb2.append(", extras=");
        sb2.append(this.f54917s);
        sb2.append(", settingsIntent=");
        sb2.append(this.f54918t);
        sb2.append(", providerPackageName=");
        sb2.append(((ComponentName) this.f54901a.d.f39747b).getPackageName());
        if (e()) {
            sb2.append(", members=[");
            int size = this.v.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (i7 > 0) {
                    sb2.append(", ");
                }
                if (this.v.get(i7) != this) {
                    sb2.append(((v) this.v.get(i7)).f54903c);
                }
            }
            sb2.append(']');
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
