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
import org.telegram.messenger.ou;
import org.telegram.ui.Components.cf;
public final class v {
    public final u f56468a;
    public final String f56469b;
    public final String f56470c;
    public String d;
    public String f56471e;
    public Uri f56472f;
    public boolean f56473g;
    public final boolean h;
    public int f56474i;
    public boolean f56475j;
    public int f56477l;
    public int f56478m;
    public int f56479n;
    public int f56480o;
    public int f56481p;
    public int f56482q;
    public Bundle f56484s;
    public IntentSender f56485t;
    public m f56486u;
    public a0.f f56487w;
    public final ArrayList f56476k = new ArrayList();
    public int f56483r = -1;
    public ArrayList v = new ArrayList();

    public v(u uVar, String str, String str2, boolean z10) {
        this.f56468a = uVar;
        this.f56469b = str;
        this.f56470c = str2;
        this.h = z10;
    }

    public static p a() {
        x.b();
        q qVar = x.c().f56356e;
        if (qVar instanceof p) {
            return (p) qVar;
        }
        return null;
    }

    public final cf b(v vVar) {
        if (vVar != null) {
            String str = vVar.f56470c;
            a0.f fVar = this.f56487w;
            if (fVar != null && fVar.containsKey(str)) {
                return new cf((o) this.f56487w.get(str));
            }
            return null;
        }
        throw new NullPointerException("route must not be null");
    }

    public final h3 c() {
        u uVar = this.f56468a;
        uVar.getClass();
        x.b();
        return uVar.f56464a;
    }

    public final boolean d() {
        x.b();
        v vVar = x.c().v;
        if (vVar != null) {
            if (vVar != this && this.f56479n != 3) {
                if (TextUtils.equals(((ComponentName) ((ou) c().d).f25804b).getPackageName(), "android") && m("android.media.intent.category.LIVE_AUDIO") && !m("android.media.intent.category.LIVE_VIDEO")) {
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
        if (this.f56486u != null && this.f56473g) {
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
            ArrayList arrayList = this.f56476k;
            if (arrayList != null) {
                rVar.a();
                if (!rVar.f56450b.isEmpty()) {
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        IntentFilter intentFilter = (IntentFilter) obj;
                        if (intentFilter != null) {
                            for (String str : rVar.f56450b) {
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
        int min = Math.min(this.f56482q, Math.max(0, i7));
        HashMap hashMap = c10.f56354b;
        if (this == c10.d && (qVar2 = c10.f56356e) != null) {
            qVar2.f(min);
        } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f56470c)) != null) {
            qVar.f(min);
        }
    }

    public final void k(int i7) {
        q qVar;
        q qVar2;
        x.b();
        if (i7 != 0) {
            e c10 = x.c();
            HashMap hashMap = c10.f56354b;
            if (this == c10.d && (qVar2 = c10.f56356e) != null) {
                qVar2.i(i7);
            } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f56470c)) != null) {
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
        ArrayList arrayList = this.f56476k;
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
        if (this.f56487w == null) {
            this.f56487w = new a0.l(0);
        }
        this.f56487w.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            v a10 = this.f56468a.a(oVar.f56425a.d());
            if (a10 != null) {
                this.f56487w.put(a10.f56470c, oVar);
                int i7 = oVar.f56426b;
                if (i7 == 2 || i7 == 3) {
                    this.v.add(a10);
                }
            }
        }
        x.c().f56353a.b(259, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb2.append(this.f56470c);
        sb2.append(", name=");
        sb2.append(this.d);
        sb2.append(", description=");
        sb2.append(this.f56471e);
        sb2.append(", iconUri=");
        sb2.append(this.f56472f);
        sb2.append(", enabled=");
        sb2.append(this.f56473g);
        sb2.append(", isSystemRoute=");
        sb2.append(this.h);
        sb2.append(", connectionState=");
        sb2.append(this.f56474i);
        sb2.append(", canDisconnect=");
        sb2.append(this.f56475j);
        sb2.append(", playbackType=");
        sb2.append(this.f56477l);
        sb2.append(", playbackStream=");
        sb2.append(this.f56478m);
        sb2.append(", deviceType=");
        sb2.append(this.f56479n);
        sb2.append(", volumeHandling=");
        sb2.append(this.f56480o);
        sb2.append(", volume=");
        sb2.append(this.f56481p);
        sb2.append(", volumeMax=");
        sb2.append(this.f56482q);
        sb2.append(", presentationDisplayId=");
        sb2.append(this.f56483r);
        sb2.append(", extras=");
        sb2.append(this.f56484s);
        sb2.append(", settingsIntent=");
        sb2.append(this.f56485t);
        sb2.append(", providerPackageName=");
        sb2.append(((ComponentName) this.f56468a.d.f25804b).getPackageName());
        if (e()) {
            sb2.append(", members=[");
            int size = this.v.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (i7 > 0) {
                    sb2.append(", ");
                }
                if (this.v.get(i7) != this) {
                    sb2.append(((v) this.v.get(i7)).f56470c);
                }
            }
            sb2.append(']');
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
