package s4;

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
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.Components.nd0;
public final class v {
    public final u f57166a;
    public final String f57167b;
    public final String f57168c;
    public String d;
    public String f57169e;
    public Uri f57170f;
    public boolean f57171g;
    public final boolean h;
    public int f57172i;
    public boolean f57173j;
    public int f57175l;
    public int f57176m;
    public int f57177n;
    public int f57178o;
    public int f57179p;
    public int f57180q;
    public Bundle f57182s;
    public IntentSender f57183t;
    public m f57184u;
    public a0.f f57185w;
    public final ArrayList f57174k = new ArrayList();
    public int f57181r = -1;
    public ArrayList v = new ArrayList();

    public v(u uVar, String str, String str2, boolean z10) {
        this.f57166a = uVar;
        this.f57167b = str;
        this.f57168c = str2;
        this.h = z10;
    }

    public static p a() {
        x.b();
        q qVar = x.c().f57056e;
        if (qVar instanceof p) {
            return (p) qVar;
        }
        return null;
    }

    public final i5 b(v vVar) {
        if (vVar != null) {
            String str = vVar.f57168c;
            a0.f fVar = this.f57185w;
            if (fVar != null && fVar.containsKey(str)) {
                return new i5((o) this.f57185w.get(str));
            }
            return null;
        }
        throw new NullPointerException("route must not be null");
    }

    public final h3 c() {
        u uVar = this.f57166a;
        uVar.getClass();
        x.b();
        return uVar.f57162a;
    }

    public final boolean d() {
        x.b();
        v vVar = x.c().v;
        if (vVar != null) {
            if (vVar != this && this.f57177n != 3) {
                if (TextUtils.equals(((ComponentName) ((nd0) c().d).f37766b).getPackageName(), "android") && m("android.media.intent.category.LIVE_AUDIO") && !m("android.media.intent.category.LIVE_VIDEO")) {
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
        if (this.f57184u != null && this.f57171g) {
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
            ArrayList arrayList = this.f57174k;
            if (arrayList != null) {
                rVar.a();
                if (!rVar.f57150b.isEmpty()) {
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        IntentFilter intentFilter = (IntentFilter) obj;
                        if (intentFilter != null) {
                            for (String str : rVar.f57150b) {
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
        int min = Math.min(this.f57180q, Math.max(0, i7));
        HashMap hashMap = c10.f57054b;
        if (this == c10.d && (qVar2 = c10.f57056e) != null) {
            qVar2.f(min);
        } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f57168c)) != null) {
            qVar.f(min);
        }
    }

    public final void k(int i7) {
        q qVar;
        q qVar2;
        x.b();
        if (i7 != 0) {
            e c10 = x.c();
            HashMap hashMap = c10.f57054b;
            if (this == c10.d && (qVar2 = c10.f57056e) != null) {
                qVar2.i(i7);
            } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f57168c)) != null) {
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
        ArrayList arrayList = this.f57174k;
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
        if (this.f57185w == null) {
            this.f57185w = new a0.l(0);
        }
        this.f57185w.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            v a10 = this.f57166a.a(oVar.f57125a.d());
            if (a10 != null) {
                this.f57185w.put(a10.f57168c, oVar);
                int i7 = oVar.f57126b;
                if (i7 == 2 || i7 == 3) {
                    this.v.add(a10);
                }
            }
        }
        x.c().f57053a.b(259, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb2.append(this.f57168c);
        sb2.append(", name=");
        sb2.append(this.d);
        sb2.append(", description=");
        sb2.append(this.f57169e);
        sb2.append(", iconUri=");
        sb2.append(this.f57170f);
        sb2.append(", enabled=");
        sb2.append(this.f57171g);
        sb2.append(", isSystemRoute=");
        sb2.append(this.h);
        sb2.append(", connectionState=");
        sb2.append(this.f57172i);
        sb2.append(", canDisconnect=");
        sb2.append(this.f57173j);
        sb2.append(", playbackType=");
        sb2.append(this.f57175l);
        sb2.append(", playbackStream=");
        sb2.append(this.f57176m);
        sb2.append(", deviceType=");
        sb2.append(this.f57177n);
        sb2.append(", volumeHandling=");
        sb2.append(this.f57178o);
        sb2.append(", volume=");
        sb2.append(this.f57179p);
        sb2.append(", volumeMax=");
        sb2.append(this.f57180q);
        sb2.append(", presentationDisplayId=");
        sb2.append(this.f57181r);
        sb2.append(", extras=");
        sb2.append(this.f57182s);
        sb2.append(", settingsIntent=");
        sb2.append(this.f57183t);
        sb2.append(", providerPackageName=");
        sb2.append(((ComponentName) this.f57166a.d.f37766b).getPackageName());
        if (e()) {
            sb2.append(", members=[");
            int size = this.v.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (i7 > 0) {
                    sb2.append(", ");
                }
                if (this.v.get(i7) != this) {
                    sb2.append(((v) this.v.get(i7)).f57168c);
                }
            }
            sb2.append(']');
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
