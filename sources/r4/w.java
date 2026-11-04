package r4;

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
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.y00;
public final class w {
    public final v f54372a;
    public final String f54373b;
    public final String f54374c;
    public String d;
    public String f54375e;
    public Uri f54376f;
    public boolean f54377g;
    public final boolean h;
    public int f54378i;
    public boolean f54379j;
    public int f54381l;
    public int f54382m;
    public int f54383n;
    public int f54384o;
    public int f54385p;
    public int f54386q;
    public Bundle f54388s;
    public IntentSender f54389t;
    public m f54390u;
    public a0.f f54391w;
    public final ArrayList f54380k = new ArrayList();
    public int f54387r = -1;
    public ArrayList v = new ArrayList();

    public w(v vVar, String str, String str2, boolean z10) {
        this.f54372a = vVar;
        this.f54373b = str;
        this.f54374c = str2;
        this.h = z10;
    }

    public static p a() {
        y.b();
        q qVar = y.c().f54260e;
        if (qVar instanceof p) {
            return (p) qVar;
        }
        return null;
    }

    public final y00 b(w wVar) {
        if (wVar != null) {
            String str = wVar.f54374c;
            a0.f fVar = this.f54391w;
            if (fVar != null && fVar.containsKey(str)) {
                return new y00((o) this.f54391w.get(str));
            }
            return null;
        }
        throw new NullPointerException("route must not be null");
    }

    public final g3 c() {
        v vVar = this.f54372a;
        vVar.getClass();
        y.b();
        return vVar.f54368a;
    }

    public final boolean d() {
        y.b();
        w wVar = y.c().v;
        if (wVar != null) {
            if (wVar != this && this.f54383n != 3) {
                if (TextUtils.equals(((ComponentName) ((nh) c().d).f36540b).getPackageName(), "android") && m("android.media.intent.category.LIVE_AUDIO") && !m("android.media.intent.category.LIVE_VIDEO")) {
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
        if (this.f54390u != null && this.f54377g) {
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

    public final boolean h(r rVar) {
        if (rVar != null) {
            y.b();
            ArrayList arrayList = this.f54380k;
            if (arrayList != null) {
                rVar.a();
                if (!rVar.f54348b.isEmpty()) {
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        IntentFilter intentFilter = (IntentFilter) obj;
                        if (intentFilter != null) {
                            for (String str : rVar.f54348b) {
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

    public final int i(r4.m r18) {
        throw new UnsupportedOperationException("Method not decompiled: r4.w.i(r4.m):int");
    }

    public final void j(int i3) {
        q qVar;
        q qVar2;
        y.b();
        e c2 = y.c();
        int min = Math.min(this.f54386q, Math.max(0, i3));
        HashMap hashMap = c2.f54258b;
        if (this == c2.d && (qVar2 = c2.f54260e) != null) {
            qVar2.f(min);
        } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f54374c)) != null) {
            qVar.f(min);
        }
    }

    public final void k(int i3) {
        q qVar;
        q qVar2;
        y.b();
        if (i3 != 0) {
            e c2 = y.c();
            HashMap hashMap = c2.f54258b;
            if (this == c2.d && (qVar2 = c2.f54260e) != null) {
                qVar2.i(i3);
            } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f54374c)) != null) {
                qVar.i(i3);
            }
        }
    }

    public final void l() {
        y.b();
        y.c().i(this, 3);
    }

    public final boolean m(String str) {
        y.b();
        ArrayList arrayList = this.f54380k;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            if (((IntentFilter) obj).hasCategory(str)) {
                return true;
            }
        }
        return false;
    }

    public final void n(Collection collection) {
        this.v.clear();
        if (this.f54391w == null) {
            this.f54391w = new a0.l(0);
        }
        this.f54391w.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            w a10 = this.f54372a.a(oVar.f54329a.d());
            if (a10 != null) {
                this.f54391w.put(a10.f54374c, oVar);
                int i3 = oVar.f54330b;
                if (i3 == 2 || i3 == 3) {
                    this.v.add(a10);
                }
            }
        }
        y.c().f54257a.b(259, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb2.append(this.f54374c);
        sb2.append(", name=");
        sb2.append(this.d);
        sb2.append(", description=");
        sb2.append(this.f54375e);
        sb2.append(", iconUri=");
        sb2.append(this.f54376f);
        sb2.append(", enabled=");
        sb2.append(this.f54377g);
        sb2.append(", isSystemRoute=");
        sb2.append(this.h);
        sb2.append(", connectionState=");
        sb2.append(this.f54378i);
        sb2.append(", canDisconnect=");
        sb2.append(this.f54379j);
        sb2.append(", playbackType=");
        sb2.append(this.f54381l);
        sb2.append(", playbackStream=");
        sb2.append(this.f54382m);
        sb2.append(", deviceType=");
        sb2.append(this.f54383n);
        sb2.append(", volumeHandling=");
        sb2.append(this.f54384o);
        sb2.append(", volume=");
        sb2.append(this.f54385p);
        sb2.append(", volumeMax=");
        sb2.append(this.f54386q);
        sb2.append(", presentationDisplayId=");
        sb2.append(this.f54387r);
        sb2.append(", extras=");
        sb2.append(this.f54388s);
        sb2.append(", settingsIntent=");
        sb2.append(this.f54389t);
        sb2.append(", providerPackageName=");
        sb2.append(((ComponentName) this.f54372a.d.f36540b).getPackageName());
        if (e()) {
            sb2.append(", members=[");
            int size = this.v.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (i3 > 0) {
                    sb2.append(", ");
                }
                if (this.v.get(i3) != this) {
                    sb2.append(((w) this.v.get(i3)).f54374c);
                }
            }
            sb2.append(']');
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
