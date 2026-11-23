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
import org.telegram.ui.Components.pf;
import org.telegram.ui.md0;
public final class x {
    public static e f57072c;
    public final Context f57073a;
    public final ArrayList f57074b = new ArrayList();

    static {
        Log.isLoggable("AxMediaRouter", 3);
    }

    public x(Context context) {
        this.f57073a = context;
    }

    public static void b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
    }

    public static e c() {
        e eVar = f57072c;
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalStateException("getGlobalRouter cannot be called when sGlobal is null");
    }

    public static x d(Context context) {
        if (context != null) {
            b();
            if (f57072c == null) {
                f57072c = new e(context.getApplicationContext());
            }
            ArrayList arrayList = f57072c.f56943i;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    x xVar = (x) ((WeakReference) arrayList.get(size)).get();
                    if (xVar == null) {
                        arrayList.remove(size);
                    } else if (xVar.f57073a == context) {
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
        e eVar = f57072c;
        if (eVar != null) {
            md0 md0Var = eVar.C;
            if (md0Var != null) {
                android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) md0Var.f49830b;
                if (a0Var != null) {
                    return ((android.support.v4.media.session.u) a0Var.f1675b).f1707c;
                }
                return null;
            }
            android.support.v4.media.session.a0 a0Var2 = eVar.D;
            if (a0Var2 != null) {
                return ((android.support.v4.media.session.u) a0Var2.f1675b).f1707c;
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
        if (f57072c == null) {
            return false;
        }
        z zVar = c().f56955u;
        if (zVar != null && (bundle = zVar.f57082e) != null && !bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true)) {
            return false;
        }
        return true;
    }

    public static void i(z zVar) {
        boolean z10;
        b();
        e c10 = c();
        z zVar2 = c10.f56955u;
        b bVar = c10.f56937a;
        c10.f56955u = zVar;
        if (c10.f()) {
            if (c10.f56952r == null) {
                k kVar = new k(c10.h, new pf(c10, 16));
                c10.f56952r = kVar;
                c10.a(kVar, true);
                c10.k();
                qe.h hVar = c10.f56939c;
                ((Handler) hVar.d).post((s0) hVar.h);
            }
            if (zVar2 != null && zVar2.d) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != zVar.d) {
                k kVar2 = c10.f56952r;
                kVar2.h = c10.A;
                if (!kVar2.f7202b) {
                    kVar2.f7202b = true;
                    ((android.support.v4.media.session.q) kVar2.f7204e).sendEmptyMessage(2);
                }
            }
        } else {
            k kVar3 = c10.f56952r;
            if (kVar3 != null) {
                u d = c10.d(kVar3);
                if (d != null) {
                    b();
                    kVar3.f7205f = null;
                    kVar3.h(null);
                    c10.m(d, null);
                    bVar.b(514, d);
                    c10.f56946l.remove(d);
                }
                c10.f56952r = null;
                qe.h hVar2 = c10.f56939c;
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
                ArrayList arrayList2 = this.f57074b;
                int size = arrayList2.size();
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 < size) {
                        if (((t) arrayList2.get(i11)).f57043b == sVar) {
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
                tVar.f57045e = elapsedRealtime;
                r rVar3 = tVar.f57044c;
                rVar3.a();
                rVar.a();
                if (!rVar3.f57034b.containsAll(rVar.f57034b)) {
                    r rVar4 = tVar.f57044c;
                    if (rVar4 != null) {
                        rVar4.a();
                        if (!rVar4.f57034b.isEmpty()) {
                            arrayList = new ArrayList<>(rVar4.f57034b);
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
                            rVar2 = r.f57032c;
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putStringArrayList("controlCategories", arrayList);
                            rVar2 = new r(bundle, arrayList);
                        }
                        tVar.f57044c = rVar2;
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
            ArrayList arrayList = this.f57074b;
            int size = arrayList.size();
            int i7 = 0;
            while (true) {
                if (i7 < size) {
                    if (((t) arrayList.get(i7)).f57043b == sVar) {
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
