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
    public final u f54912a;
    public final String f54913b;
    public final String f54914c;
    public String d;
    public String f54915e;
    public Uri f54916f;
    public boolean f54917g;
    public final boolean h;
    public int f54918i;
    public boolean f54919j;
    public int f54921l;
    public int f54922m;
    public int f54923n;
    public int f54924o;
    public int f54925p;
    public int f54926q;
    public Bundle f54928s;
    public IntentSender f54929t;
    public m f54930u;
    public a0.f f54931w;
    public final ArrayList f54920k = new ArrayList();
    public int f54927r = -1;
    public ArrayList v = new ArrayList();

    public v(u uVar, String str, String str2, boolean z9) {
        this.f54912a = uVar;
        this.f54913b = str;
        this.f54914c = str2;
        this.h = z9;
    }

    public static p a() {
        x.b();
        q qVar = x.c().f54802e;
        if (qVar instanceof p) {
            return (p) qVar;
        }
        return null;
    }

    public final org.telegram.ui.Components.m b(v vVar) {
        if (vVar != null) {
            String str = vVar.f54914c;
            a0.f fVar = this.f54931w;
            if (fVar != null && fVar.containsKey(str)) {
                return new org.telegram.ui.Components.m((o) this.f54931w.get(str));
            }
            return null;
        }
        throw new NullPointerException("route must not be null");
    }

    public final g3 c() {
        u uVar = this.f54912a;
        uVar.getClass();
        x.b();
        return uVar.f54908a;
    }

    public final boolean d() {
        x.b();
        v vVar = x.c().v;
        if (vVar != null) {
            if (vVar != this && this.f54923n != 3) {
                if (TextUtils.equals(((ComponentName) ((uy) c().d).f38776b).getPackageName(), "android") && m("android.media.intent.category.LIVE_AUDIO") && !m("android.media.intent.category.LIVE_VIDEO")) {
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
        if (this.f54930u != null && this.f54917g) {
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
            ArrayList arrayList = this.f54920k;
            if (arrayList != null) {
                rVar.a();
                if (!rVar.f54896b.isEmpty()) {
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        IntentFilter intentFilter = (IntentFilter) obj;
                        if (intentFilter != null) {
                            for (String str : rVar.f54896b) {
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
        int min = Math.min(this.f54926q, Math.max(0, i7));
        HashMap hashMap = c10.f54800b;
        if (this == c10.d && (qVar2 = c10.f54802e) != null) {
            qVar2.f(min);
        } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f54914c)) != null) {
            qVar.f(min);
        }
    }

    public final void k(int i7) {
        q qVar;
        q qVar2;
        x.b();
        if (i7 != 0) {
            e c10 = x.c();
            HashMap hashMap = c10.f54800b;
            if (this == c10.d && (qVar2 = c10.f54802e) != null) {
                qVar2.i(i7);
            } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f54914c)) != null) {
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
        ArrayList arrayList = this.f54920k;
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
        if (this.f54931w == null) {
            this.f54931w = new a0.l(0);
        }
        this.f54931w.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            v a10 = this.f54912a.a(oVar.f54871a.d());
            if (a10 != null) {
                this.f54931w.put(a10.f54914c, oVar);
                int i7 = oVar.f54872b;
                if (i7 == 2 || i7 == 3) {
                    this.v.add(a10);
                }
            }
        }
        x.c().f54799a.b(259, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb2.append(this.f54914c);
        sb2.append(", name=");
        sb2.append(this.d);
        sb2.append(", description=");
        sb2.append(this.f54915e);
        sb2.append(", iconUri=");
        sb2.append(this.f54916f);
        sb2.append(", enabled=");
        sb2.append(this.f54917g);
        sb2.append(", isSystemRoute=");
        sb2.append(this.h);
        sb2.append(", connectionState=");
        sb2.append(this.f54918i);
        sb2.append(", canDisconnect=");
        sb2.append(this.f54919j);
        sb2.append(", playbackType=");
        sb2.append(this.f54921l);
        sb2.append(", playbackStream=");
        sb2.append(this.f54922m);
        sb2.append(", deviceType=");
        sb2.append(this.f54923n);
        sb2.append(", volumeHandling=");
        sb2.append(this.f54924o);
        sb2.append(", volume=");
        sb2.append(this.f54925p);
        sb2.append(", volumeMax=");
        sb2.append(this.f54926q);
        sb2.append(", presentationDisplayId=");
        sb2.append(this.f54927r);
        sb2.append(", extras=");
        sb2.append(this.f54928s);
        sb2.append(", settingsIntent=");
        sb2.append(this.f54929t);
        sb2.append(", providerPackageName=");
        sb2.append(((ComponentName) this.f54912a.d.f38776b).getPackageName());
        if (e()) {
            sb2.append(", members=[");
            int size = this.v.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (i7 > 0) {
                    sb2.append(", ");
                }
                if (this.v.get(i7) != this) {
                    sb2.append(((v) this.v.get(i7)).f54914c);
                }
            }
            sb2.append(']');
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
