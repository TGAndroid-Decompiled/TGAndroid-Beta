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
import org.telegram.ui.Components.uy;
public final class v {
    public final u f54809a;
    public final String f54810b;
    public final String f54811c;
    public String d;
    public String f54812e;
    public Uri f54813f;
    public boolean f54814g;
    public final boolean h;
    public int f54815i;
    public boolean f54816j;
    public int f54818l;
    public int f54819m;
    public int f54820n;
    public int f54821o;
    public int f54822p;
    public int f54823q;
    public Bundle f54825s;
    public IntentSender f54826t;
    public m f54827u;
    public a0.f f54828w;
    public final ArrayList f54817k = new ArrayList();
    public int f54824r = -1;
    public ArrayList v = new ArrayList();

    public v(u uVar, String str, String str2, boolean z9) {
        this.f54809a = uVar;
        this.f54810b = str;
        this.f54811c = str2;
        this.h = z9;
    }

    public static p a() {
        x.b();
        q qVar = x.c().f54699e;
        if (qVar instanceof p) {
            return (p) qVar;
        }
        return null;
    }

    public final org.telegram.ui.Components.n b(v vVar) {
        if (vVar != null) {
            String str = vVar.f54811c;
            a0.f fVar = this.f54828w;
            if (fVar != null && fVar.containsKey(str)) {
                return new org.telegram.ui.Components.n((o) this.f54828w.get(str));
            }
            return null;
        }
        throw new NullPointerException("route must not be null");
    }

    public final g3 c() {
        u uVar = this.f54809a;
        uVar.getClass();
        x.b();
        return uVar.f54805a;
    }

    public final boolean d() {
        x.b();
        v vVar = x.c().v;
        if (vVar != null) {
            if (vVar != this && this.f54820n != 3) {
                if (TextUtils.equals(((ComponentName) ((uy) c().d).f38757b).getPackageName(), "android") && m("android.media.intent.category.LIVE_AUDIO") && !m("android.media.intent.category.LIVE_VIDEO")) {
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
        if (this.f54827u != null && this.f54814g) {
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
            ArrayList arrayList = this.f54817k;
            if (arrayList != null) {
                rVar.a();
                if (!rVar.f54793b.isEmpty()) {
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        IntentFilter intentFilter = (IntentFilter) obj;
                        if (intentFilter != null) {
                            for (String str : rVar.f54793b) {
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
        int min = Math.min(this.f54823q, Math.max(0, i7));
        HashMap hashMap = c10.f54697b;
        if (this == c10.d && (qVar2 = c10.f54699e) != null) {
            qVar2.f(min);
        } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f54811c)) != null) {
            qVar.f(min);
        }
    }

    public final void k(int i7) {
        q qVar;
        q qVar2;
        x.b();
        if (i7 != 0) {
            e c10 = x.c();
            HashMap hashMap = c10.f54697b;
            if (this == c10.d && (qVar2 = c10.f54699e) != null) {
                qVar2.i(i7);
            } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f54811c)) != null) {
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
        ArrayList arrayList = this.f54817k;
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
        if (this.f54828w == null) {
            this.f54828w = new a0.l(0);
        }
        this.f54828w.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            v a10 = this.f54809a.a(oVar.f54768a.d());
            if (a10 != null) {
                this.f54828w.put(a10.f54811c, oVar);
                int i7 = oVar.f54769b;
                if (i7 == 2 || i7 == 3) {
                    this.v.add(a10);
                }
            }
        }
        x.c().f54696a.b(259, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb2.append(this.f54811c);
        sb2.append(", name=");
        sb2.append(this.d);
        sb2.append(", description=");
        sb2.append(this.f54812e);
        sb2.append(", iconUri=");
        sb2.append(this.f54813f);
        sb2.append(", enabled=");
        sb2.append(this.f54814g);
        sb2.append(", isSystemRoute=");
        sb2.append(this.h);
        sb2.append(", connectionState=");
        sb2.append(this.f54815i);
        sb2.append(", canDisconnect=");
        sb2.append(this.f54816j);
        sb2.append(", playbackType=");
        sb2.append(this.f54818l);
        sb2.append(", playbackStream=");
        sb2.append(this.f54819m);
        sb2.append(", deviceType=");
        sb2.append(this.f54820n);
        sb2.append(", volumeHandling=");
        sb2.append(this.f54821o);
        sb2.append(", volume=");
        sb2.append(this.f54822p);
        sb2.append(", volumeMax=");
        sb2.append(this.f54823q);
        sb2.append(", presentationDisplayId=");
        sb2.append(this.f54824r);
        sb2.append(", extras=");
        sb2.append(this.f54825s);
        sb2.append(", settingsIntent=");
        sb2.append(this.f54826t);
        sb2.append(", providerPackageName=");
        sb2.append(((ComponentName) this.f54809a.d.f38757b).getPackageName());
        if (e()) {
            sb2.append(", members=[");
            int size = this.v.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (i7 > 0) {
                    sb2.append(", ");
                }
                if (this.v.get(i7) != this) {
                    sb2.append(((v) this.v.get(i7)).f54811c);
                }
            }
            sb2.append(']');
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
