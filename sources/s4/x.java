package s4;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.telegram.ui.Components.qf;
import org.telegram.ui.md0;
public final class x {
    public static e f57103c;
    public final Context f57104a;
    public final ArrayList f57105b = new ArrayList();

    static {
        Log.isLoggable("AxMediaRouter", 3);
    }

    public x(Context context) {
        this.f57104a = context;
    }

    public static void b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
    }

    public static e c() {
        e eVar = f57103c;
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalStateException("getGlobalRouter cannot be called when sGlobal is null");
    }

    public static x d(Context context) {
        if (context != null) {
            b();
            if (f57103c == null) {
                f57103c = new e(context.getApplicationContext());
            }
            ArrayList arrayList = f57103c.f56974i;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    x xVar = (x) ((WeakReference) arrayList.get(size)).get();
                    if (xVar == null) {
                        arrayList.remove(size);
                    } else if (xVar.f57104a == context) {
                        return xVar;
                    }
                } else {
                    x xVar2 = new x(context);
                    arrayList.add(new WeakReference(xVar2));
                    return xVar2;
                }
            }
        } else {
            throw new IllegalArgumentException("context must not be null");
        }
    }

    public static MediaSessionCompat$Token e() {
        e eVar = f57103c;
        if (eVar != null) {
            md0 md0Var = eVar.C;
            if (md0Var != null) {
                android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) md0Var.f49853b;
                if (a0Var != null) {
                    return ((android.support.v4.media.session.u) a0Var.f1717b).f1749c;
                }
                return null;
            }
            android.support.v4.media.session.a0 a0Var2 = eVar.D;
            if (a0Var2 != null) {
                return ((android.support.v4.media.session.u) a0Var2.f1717b).f1749c;
            }
            return null;
        }
        return null;
    }

    public static v f() {
        b();
        return c().e();
    }

    public static boolean g() {
        Bundle bundle;
        if (f57103c == null) {
            return false;
        }
        z zVar = c().f56986u;
        if (zVar != null && (bundle = zVar.f57113e) != null && !bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true)) {
            return false;
        }
        return true;
    }

    public static void i(z zVar) {
        boolean z10;
        b();
        e c10 = c();
        z zVar2 = c10.f56986u;
        b bVar = c10.f56968a;
        c10.f56986u = zVar;
        if (c10.f()) {
            if (c10.f56983r == null) {
                k kVar = new k(c10.h, new qf(c10, 16));
                c10.f56983r = kVar;
                c10.a(kVar, true);
                c10.k();
                qe.h hVar = c10.f56970c;
                ((Handler) hVar.d).post((s0) hVar.h);
            }
            if (zVar2 != null && zVar2.d) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != zVar.d) {
                k kVar2 = c10.f56983r;
                kVar2.h = c10.A;
                if (!kVar2.f7236b) {
                    kVar2.f7236b = true;
                    ((android.support.v4.media.session.q) kVar2.f7238e).sendEmptyMessage(2);
                }
            }
        } else {
            k kVar3 = c10.f56983r;
            if (kVar3 != null) {
                u d = c10.d(kVar3);
                if (d != null) {
                    b();
                    kVar3.f7239f = null;
                    kVar3.h(null);
                    c10.m(d, null);
                    bVar.b(514, d);
                    c10.f56977l.remove(d);
                }
                c10.f56983r = null;
                qe.h hVar2 = c10.f56970c;
                ((Handler) hVar2.d).post((s0) hVar2.h);
            }
        }
        bVar.b(769, zVar);
    }

    public static void j(int i7) {
        if (i7 >= 0 && i7 <= 3) {
            b();
            e c10 = c();
            v c11 = c10.c();
            if (c10.e() != c11) {
                c10.i(c11, i7);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Unsupported reason to unselect route");
    }

    public final void a(r rVar, s sVar, int i7) {
        t tVar;
        boolean z10;
        ArrayList<String> arrayList;
        r rVar2;
        if (rVar != null) {
            if (sVar != null) {
                b();
                ArrayList arrayList2 = this.f57105b;
                int size = arrayList2.size();
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 < size) {
                        if (((t) arrayList2.get(i11)).f57074b == sVar) {
                            break;
                        }
                        i11++;
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                if (i11 < 0) {
                    tVar = new t(this, sVar);
                    arrayList2.add(tVar);
                } else {
                    tVar = (t) arrayList2.get(i11);
                }
                boolean z11 = true;
                if (i7 != tVar.d) {
                    tVar.d = i7;
                    z10 = true;
                } else {
                    z10 = false;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if ((i7 & 1) != 0) {
                    z10 = true;
                }
                tVar.f57076e = elapsedRealtime;
                r rVar3 = tVar.f57075c;
                rVar3.a();
                rVar.a();
                if (!rVar3.f57065b.containsAll(rVar.f57065b)) {
                    r rVar4 = tVar.f57075c;
                    if (rVar4 != null) {
                        rVar4.a();
                        if (!rVar4.f57065b.isEmpty()) {
                            arrayList = new ArrayList<>(rVar4.f57065b);
                        } else {
                            arrayList = null;
                        }
                        ArrayList c10 = rVar.c();
                        if (!c10.isEmpty()) {
                            int size2 = c10.size();
                            while (i10 < size2) {
                                Object obj = c10.get(i10);
                                i10++;
                                String str = (String) obj;
                                if (str != null) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList<>();
                                    }
                                    if (!arrayList.contains(str)) {
                                        arrayList.add(str);
                                    }
                                } else {
                                    throw new IllegalArgumentException("category must not be null");
                                }
                            }
                        }
                        if (arrayList == null) {
                            rVar2 = r.f57063c;
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putStringArrayList("controlCategories", arrayList);
                            rVar2 = new r(bundle, arrayList);
                        }
                        tVar.f57075c = rVar2;
                    } else {
                        throw new IllegalArgumentException("selector must not be null");
                    }
                } else {
                    z11 = z10;
                }
                if (z11) {
                    c().k();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("callback must not be null");
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void h(s sVar) {
        if (sVar != null) {
            b();
            ArrayList arrayList = this.f57105b;
            int size = arrayList.size();
            int i7 = 0;
            while (true) {
                if (i7 < size) {
                    if (((t) arrayList.get(i7)).f57074b == sVar) {
                        break;
                    }
                    i7++;
                } else {
                    i7 = -1;
                    break;
                }
            }
            if (i7 >= 0) {
                arrayList.remove(i7);
                c().k();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }
}
