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
    public final u f54913a;
    public final String f54914b;
    public final String f54915c;
    public String d;
    public String f54916e;
    public Uri f54917f;
    public boolean f54918g;
    public final boolean h;
    public int f54919i;
    public boolean f54920j;
    public int f54922l;
    public int f54923m;
    public int f54924n;
    public int f54925o;
    public int f54926p;
    public int f54927q;
    public Bundle f54929s;
    public IntentSender f54930t;
    public m f54931u;
    public a0.f f54932w;
    public final ArrayList f54921k = new ArrayList();
    public int f54928r = -1;
    public ArrayList v = new ArrayList();

    public v(u uVar, String str, String str2, boolean z9) {
        this.f54913a = uVar;
        this.f54914b = str;
        this.f54915c = str2;
        this.h = z9;
    }

    public static p a() {
        x.b();
        q qVar = x.c().f54803e;
        if (qVar instanceof p) {
            return (p) qVar;
        }
        return null;
    }

    public final org.telegram.ui.Components.n b(v vVar) {
        if (vVar != null) {
            String str = vVar.f54915c;
            a0.f fVar = this.f54932w;
            if (fVar != null && fVar.containsKey(str)) {
                return new org.telegram.ui.Components.n((o) this.f54932w.get(str));
            }
            return null;
        }
        throw new NullPointerException("route must not be null");
    }

    public final g3 c() {
        u uVar = this.f54913a;
        uVar.getClass();
        x.b();
        return uVar.f54909a;
    }

    public final boolean d() {
        x.b();
        v vVar = x.c().v;
        if (vVar != null) {
            if (vVar != this && this.f54924n != 3) {
                if (TextUtils.equals(((ComponentName) ((vy) c().d).f39835b).getPackageName(), "android") && m("android.media.intent.category.LIVE_AUDIO") && !m("android.media.intent.category.LIVE_VIDEO")) {
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
        if (this.f54931u != null && this.f54918g) {
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
            ArrayList arrayList = this.f54921k;
            if (arrayList != null) {
                rVar.a();
                if (!rVar.f54897b.isEmpty()) {
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        IntentFilter intentFilter = (IntentFilter) obj;
                        if (intentFilter != null) {
                            for (String str : rVar.f54897b) {
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
        int min = Math.min(this.f54927q, Math.max(0, i7));
        HashMap hashMap = c10.f54801b;
        if (this == c10.d && (qVar2 = c10.f54803e) != null) {
            qVar2.f(min);
        } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f54915c)) != null) {
            qVar.f(min);
        }
    }

    public final void k(int i7) {
        q qVar;
        q qVar2;
        x.b();
        if (i7 != 0) {
            e c10 = x.c();
            HashMap hashMap = c10.f54801b;
            if (this == c10.d && (qVar2 = c10.f54803e) != null) {
                qVar2.i(i7);
            } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f54915c)) != null) {
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
        ArrayList arrayList = this.f54921k;
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
        if (this.f54932w == null) {
            this.f54932w = new a0.l(0);
        }
        this.f54932w.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            v a10 = this.f54913a.a(oVar.f54872a.d());
            if (a10 != null) {
                this.f54932w.put(a10.f54915c, oVar);
                int i7 = oVar.f54873b;
                if (i7 == 2 || i7 == 3) {
                    this.v.add(a10);
                }
            }
        }
        x.c().f54800a.b(259, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb2.append(this.f54915c);
        sb2.append(", name=");
        sb2.append(this.d);
        sb2.append(", description=");
        sb2.append(this.f54916e);
        sb2.append(", iconUri=");
        sb2.append(this.f54917f);
        sb2.append(", enabled=");
        sb2.append(this.f54918g);
        sb2.append(", isSystemRoute=");
        sb2.append(this.h);
        sb2.append(", connectionState=");
        sb2.append(this.f54919i);
        sb2.append(", canDisconnect=");
        sb2.append(this.f54920j);
        sb2.append(", playbackType=");
        sb2.append(this.f54922l);
        sb2.append(", playbackStream=");
        sb2.append(this.f54923m);
        sb2.append(", deviceType=");
        sb2.append(this.f54924n);
        sb2.append(", volumeHandling=");
        sb2.append(this.f54925o);
        sb2.append(", volume=");
        sb2.append(this.f54926p);
        sb2.append(", volumeMax=");
        sb2.append(this.f54927q);
        sb2.append(", presentationDisplayId=");
        sb2.append(this.f54928r);
        sb2.append(", extras=");
        sb2.append(this.f54929s);
        sb2.append(", settingsIntent=");
        sb2.append(this.f54930t);
        sb2.append(", providerPackageName=");
        sb2.append(((ComponentName) this.f54913a.d.f39835b).getPackageName());
        if (e()) {
            sb2.append(", members=[");
            int size = this.v.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (i7 > 0) {
                    sb2.append(", ");
                }
                if (this.v.get(i7) != this) {
                    sb2.append(((v) this.v.get(i7)).f54915c);
                }
            }
            sb2.append(']');
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
