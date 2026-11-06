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
    public final u f54808a;
    public final String f54809b;
    public final String f54810c;
    public String d;
    public String f54811e;
    public Uri f54812f;
    public boolean f54813g;
    public final boolean h;
    public int f54814i;
    public boolean f54815j;
    public int f54817l;
    public int f54818m;
    public int f54819n;
    public int f54820o;
    public int f54821p;
    public int f54822q;
    public Bundle f54824s;
    public IntentSender f54825t;
    public m f54826u;
    public a0.f f54827w;
    public final ArrayList f54816k = new ArrayList();
    public int f54823r = -1;
    public ArrayList v = new ArrayList();

    public v(u uVar, String str, String str2, boolean z9) {
        this.f54808a = uVar;
        this.f54809b = str;
        this.f54810c = str2;
        this.h = z9;
    }

    public static p a() {
        x.b();
        q qVar = x.c().f54698e;
        if (qVar instanceof p) {
            return (p) qVar;
        }
        return null;
    }

    public final org.telegram.ui.Components.n b(v vVar) {
        if (vVar != null) {
            String str = vVar.f54810c;
            a0.f fVar = this.f54827w;
            if (fVar != null && fVar.containsKey(str)) {
                return new org.telegram.ui.Components.n((o) this.f54827w.get(str));
            }
            return null;
        }
        throw new NullPointerException("route must not be null");
    }

    public final g3 c() {
        u uVar = this.f54808a;
        uVar.getClass();
        x.b();
        return uVar.f54804a;
    }

    public final boolean d() {
        x.b();
        v vVar = x.c().v;
        if (vVar != null) {
            if (vVar != this && this.f54819n != 3) {
                if (TextUtils.equals(((ComponentName) ((uy) c().d).f38750b).getPackageName(), "android") && m("android.media.intent.category.LIVE_AUDIO") && !m("android.media.intent.category.LIVE_VIDEO")) {
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
        if (this.f54826u != null && this.f54813g) {
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
            ArrayList arrayList = this.f54816k;
            if (arrayList != null) {
                rVar.a();
                if (!rVar.f54792b.isEmpty()) {
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        IntentFilter intentFilter = (IntentFilter) obj;
                        if (intentFilter != null) {
                            for (String str : rVar.f54792b) {
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
        int min = Math.min(this.f54822q, Math.max(0, i7));
        HashMap hashMap = c10.f54696b;
        if (this == c10.d && (qVar2 = c10.f54698e) != null) {
            qVar2.f(min);
        } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f54810c)) != null) {
            qVar.f(min);
        }
    }

    public final void k(int i7) {
        q qVar;
        q qVar2;
        x.b();
        if (i7 != 0) {
            e c10 = x.c();
            HashMap hashMap = c10.f54696b;
            if (this == c10.d && (qVar2 = c10.f54698e) != null) {
                qVar2.i(i7);
            } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f54810c)) != null) {
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
        ArrayList arrayList = this.f54816k;
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
        if (this.f54827w == null) {
            this.f54827w = new a0.l(0);
        }
        this.f54827w.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            v a10 = this.f54808a.a(oVar.f54767a.d());
            if (a10 != null) {
                this.f54827w.put(a10.f54810c, oVar);
                int i7 = oVar.f54768b;
                if (i7 == 2 || i7 == 3) {
                    this.v.add(a10);
                }
            }
        }
        x.c().f54695a.b(259, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb2.append(this.f54810c);
        sb2.append(", name=");
        sb2.append(this.d);
        sb2.append(", description=");
        sb2.append(this.f54811e);
        sb2.append(", iconUri=");
        sb2.append(this.f54812f);
        sb2.append(", enabled=");
        sb2.append(this.f54813g);
        sb2.append(", isSystemRoute=");
        sb2.append(this.h);
        sb2.append(", connectionState=");
        sb2.append(this.f54814i);
        sb2.append(", canDisconnect=");
        sb2.append(this.f54815j);
        sb2.append(", playbackType=");
        sb2.append(this.f54817l);
        sb2.append(", playbackStream=");
        sb2.append(this.f54818m);
        sb2.append(", deviceType=");
        sb2.append(this.f54819n);
        sb2.append(", volumeHandling=");
        sb2.append(this.f54820o);
        sb2.append(", volume=");
        sb2.append(this.f54821p);
        sb2.append(", volumeMax=");
        sb2.append(this.f54822q);
        sb2.append(", presentationDisplayId=");
        sb2.append(this.f54823r);
        sb2.append(", extras=");
        sb2.append(this.f54824s);
        sb2.append(", settingsIntent=");
        sb2.append(this.f54825t);
        sb2.append(", providerPackageName=");
        sb2.append(((ComponentName) this.f54808a.d.f38750b).getPackageName());
        if (e()) {
            sb2.append(", members=[");
            int size = this.v.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (i7 > 0) {
                    sb2.append(", ");
                }
                if (this.v.get(i7) != this) {
                    sb2.append(((v) this.v.get(i7)).f54810c);
                }
            }
            sb2.append(']');
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
