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
import li.e3;
public final class v {
    public final u f46766a;
    public final String f46767b;
    public final String f46768c;
    public String d;
    public String e;
    public Uri f46769f;
    public boolean f46770g;
    public final boolean h;
    public int f46771i;
    public boolean f46772j;
    public int f46774l;
    public int f46775m;
    public int f46776n;
    public int f46777o;
    public int f46778p;
    public int f46779q;
    public Bundle f46781s;
    public IntentSender f46782t;
    public m f46783u;
    public a0.f f46784w;
    public final ArrayList f46773k = new ArrayList();
    public int f46780r = -1;
    public ArrayList v = new ArrayList();

    public v(u uVar, String str, String str2, boolean z10) {
        this.f46766a = uVar;
        this.f46767b = str;
        this.f46768c = str2;
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

    public final jg.i b(v vVar) {
        if (vVar != null) {
            String str = vVar.f46768c;
            a0.f fVar = this.f46784w;
            if (fVar != null && fVar.containsKey(str)) {
                return new jg.i((o) this.f46784w.get(str));
            }
            return null;
        }
        throw new NullPointerException("route must not be null");
    }

    public final g3 c() {
        u uVar = this.f46766a;
        uVar.getClass();
        x.b();
        return uVar.f46763a;
    }

    public final boolean d() {
        x.b();
        v vVar = x.c().v;
        if (vVar != null) {
            if (vVar != this && this.f46776n != 3) {
                if (TextUtils.equals(((ComponentName) ((e3) c().d).f17210b).getPackageName(), "android") && m("android.media.intent.category.LIVE_AUDIO") && !m("android.media.intent.category.LIVE_VIDEO")) {
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
        if (this.f46783u != null && this.f46770g) {
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
            ArrayList arrayList = this.f46773k;
            if (arrayList != null) {
                rVar.a();
                if (!rVar.f46747b.isEmpty()) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        IntentFilter intentFilter = (IntentFilter) obj;
                        if (intentFilter != null) {
                            for (String str : rVar.f46747b) {
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
        int min = Math.min(this.f46779q, Math.max(0, i10));
        HashMap hashMap = c10.f46656b;
        if (this == c10.d && (qVar2 = c10.e) != null) {
            qVar2.f(min);
        } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f46768c)) != null) {
            qVar.f(min);
        }
    }

    public final void k(int i10) {
        q qVar;
        q qVar2;
        x.b();
        if (i10 != 0) {
            e c10 = x.c();
            HashMap hashMap = c10.f46656b;
            if (this == c10.d && (qVar2 = c10.e) != null) {
                qVar2.i(i10);
            } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f46768c)) != null) {
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
        ArrayList arrayList = this.f46773k;
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
        if (this.f46784w == null) {
            this.f46784w = new a0.l(0);
        }
        this.f46784w.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            v a2 = this.f46766a.a(oVar.f46725a.d());
            if (a2 != null) {
                this.f46784w.put(a2.f46768c, oVar);
                int i10 = oVar.f46726b;
                if (i10 == 2 || i10 == 3) {
                    this.v.add(a2);
                }
            }
        }
        x.c().f46655a.b(259, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb2.append(this.f46768c);
        sb2.append(", name=");
        sb2.append(this.d);
        sb2.append(", description=");
        sb2.append(this.e);
        sb2.append(", iconUri=");
        sb2.append(this.f46769f);
        sb2.append(", enabled=");
        sb2.append(this.f46770g);
        sb2.append(", isSystemRoute=");
        sb2.append(this.h);
        sb2.append(", connectionState=");
        sb2.append(this.f46771i);
        sb2.append(", canDisconnect=");
        sb2.append(this.f46772j);
        sb2.append(", playbackType=");
        sb2.append(this.f46774l);
        sb2.append(", playbackStream=");
        sb2.append(this.f46775m);
        sb2.append(", deviceType=");
        sb2.append(this.f46776n);
        sb2.append(", volumeHandling=");
        sb2.append(this.f46777o);
        sb2.append(", volume=");
        sb2.append(this.f46778p);
        sb2.append(", volumeMax=");
        sb2.append(this.f46779q);
        sb2.append(", presentationDisplayId=");
        sb2.append(this.f46780r);
        sb2.append(", extras=");
        sb2.append(this.f46781s);
        sb2.append(", settingsIntent=");
        sb2.append(this.f46782t);
        sb2.append(", providerPackageName=");
        sb2.append(((ComponentName) this.f46766a.d.f17210b).getPackageName());
        if (e()) {
            sb2.append(", members=[");
            int size = this.v.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                if (this.v.get(i10) != this) {
                    sb2.append(((v) this.v.get(i10)).f46768c);
                }
            }
            sb2.append(']');
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
