package p4;

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
import m.y0;
public final class w {
    public final v f45341a;
    public final String f45342b;
    public final String f45343c;
    public String d;
    public String f45344e;
    public Uri f45345f;
    public boolean f45346g;
    public final boolean h;
    public int f45347i;
    public boolean f45348j;
    public int f45350l;
    public int f45351m;
    public int f45352n;
    public int f45353o;
    public int f45354p;
    public int f45355q;
    public Bundle f45357s;
    public IntentSender f45358t;
    public m f45359u;
    public a0.f f45360w;
    public final ArrayList f45349k = new ArrayList();
    public int f45356r = -1;
    public ArrayList v = new ArrayList();

    public w(v vVar, String str, String str2, boolean z10) {
        this.f45341a = vVar;
        this.f45342b = str;
        this.f45343c = str2;
        this.h = z10;
    }

    public static p a() {
        y.b();
        q qVar = y.c().f45222e;
        if (qVar instanceof p) {
            return (p) qVar;
        }
        return null;
    }

    public final y0 b(w wVar) {
        if (wVar != null) {
            String str = wVar.f45343c;
            a0.f fVar = this.f45360w;
            if (fVar != null && fVar.containsKey(str)) {
                return new y0((o) this.f45360w.get(str), 14);
            }
            return null;
        }
        throw new NullPointerException("route must not be null");
    }

    public final h3 c() {
        v vVar = this.f45341a;
        vVar.getClass();
        y.b();
        return vVar.f45335a;
    }

    public final boolean d() {
        y.b();
        w wVar = y.c().v;
        if (wVar != null) {
            if (wVar != this && this.f45352n != 3) {
                if (TextUtils.equals(((ComponentName) ((k2.g0) c().d).f14467b).getPackageName(), "android") && m("android.media.intent.category.LIVE_AUDIO") && !m("android.media.intent.category.LIVE_VIDEO")) {
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
        if (this.f45359u != null && this.f45346g) {
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

    public final boolean h(s sVar) {
        if (sVar != null) {
            y.b();
            ArrayList arrayList = this.f45349k;
            if (arrayList != null) {
                sVar.a();
                if (!sVar.f45317b.isEmpty()) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        IntentFilter intentFilter = (IntentFilter) obj;
                        if (intentFilter != null) {
                            for (String str : sVar.f45317b) {
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
        throw new UnsupportedOperationException("Method not decompiled: p4.w.i(p4.m):int");
    }

    public final void j(int i10) {
        q qVar;
        q qVar2;
        y.b();
        e c10 = y.c();
        int min = Math.min(this.f45355q, Math.max(0, i10));
        HashMap hashMap = c10.f45220b;
        if (this == c10.d && (qVar2 = c10.f45222e) != null) {
            qVar2.f(min);
        } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f45343c)) != null) {
            qVar.f(min);
        }
    }

    public final void k(int i10) {
        q qVar;
        q qVar2;
        y.b();
        if (i10 != 0) {
            e c10 = y.c();
            HashMap hashMap = c10.f45220b;
            if (this == c10.d && (qVar2 = c10.f45222e) != null) {
                qVar2.i(i10);
            } else if (!hashMap.isEmpty() && (qVar = (q) hashMap.get(this.f45343c)) != null) {
                qVar.i(i10);
            }
        }
    }

    public final void l() {
        y.b();
        y.c().i(this, 3);
    }

    public final boolean m(String str) {
        y.b();
        ArrayList arrayList = this.f45349k;
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
        if (this.f45360w == null) {
            this.f45360w = new a0.m(0);
        }
        this.f45360w.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            w a2 = this.f45341a.a(oVar.f45291a.d());
            if (a2 != null) {
                this.f45360w.put(a2.f45343c, oVar);
                int i10 = oVar.f45292b;
                if (i10 == 2 || i10 == 3) {
                    this.v.add(a2);
                }
            }
        }
        y.c().f45219a.b(259, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb2.append(this.f45343c);
        sb2.append(", name=");
        sb2.append(this.d);
        sb2.append(", description=");
        sb2.append(this.f45344e);
        sb2.append(", iconUri=");
        sb2.append(this.f45345f);
        sb2.append(", enabled=");
        sb2.append(this.f45346g);
        sb2.append(", isSystemRoute=");
        sb2.append(this.h);
        sb2.append(", connectionState=");
        sb2.append(this.f45347i);
        sb2.append(", canDisconnect=");
        sb2.append(this.f45348j);
        sb2.append(", playbackType=");
        sb2.append(this.f45350l);
        sb2.append(", playbackStream=");
        sb2.append(this.f45351m);
        sb2.append(", deviceType=");
        sb2.append(this.f45352n);
        sb2.append(", volumeHandling=");
        sb2.append(this.f45353o);
        sb2.append(", volume=");
        sb2.append(this.f45354p);
        sb2.append(", volumeMax=");
        sb2.append(this.f45355q);
        sb2.append(", presentationDisplayId=");
        sb2.append(this.f45356r);
        sb2.append(", extras=");
        sb2.append(this.f45357s);
        sb2.append(", settingsIntent=");
        sb2.append(this.f45358t);
        sb2.append(", providerPackageName=");
        sb2.append(((ComponentName) this.f45341a.d.f14467b).getPackageName());
        if (e()) {
            sb2.append(", members=[");
            int size = this.v.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                if (this.v.get(i10) != this) {
                    sb2.append(((w) this.v.get(i10)).f45343c);
                }
            }
            sb2.append(']');
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
