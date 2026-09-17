package p4;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.telegram.ui.Cells.ia;
import org.telegram.ui.Cells.l7;
public final class x {
    public static e f40704c;
    public final Context f40705a;
    public final ArrayList f40706b = new ArrayList();

    static {
        Log.isLoggable("AxMediaRouter", 3);
    }

    public x(Context context) {
        this.f40705a = context;
    }

    public static void b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
    }

    public static e c() {
        e eVar = f40704c;
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalStateException("getGlobalRouter cannot be called when sGlobal is null");
    }

    public static x d(Context context) {
        if (context != null) {
            b();
            if (f40704c == null) {
                f40704c = new e(context.getApplicationContext());
            }
            ArrayList arrayList = f40704c.f40579i;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    x xVar = (x) ((WeakReference) arrayList.get(size)).get();
                    if (xVar == null) {
                        arrayList.remove(size);
                    } else if (xVar.f40705a == context) {
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
        e eVar = f40704c;
        if (eVar != null) {
            lf.i iVar = eVar.C;
            if (iVar != null) {
                android.support.v4.media.session.b0 b0Var = (android.support.v4.media.session.b0) iVar.f14033b;
                if (b0Var != null) {
                    return b0Var.f1838a.f1862c;
                }
                return null;
            }
            android.support.v4.media.session.b0 b0Var2 = eVar.D;
            if (b0Var2 != null) {
                return b0Var2.f1838a.f1862c;
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
        if (f40704c == null) {
            return false;
        }
        z zVar = c().f40591u;
        if (zVar != null && (bundle = zVar.e) != null && !bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true)) {
            return false;
        }
        return true;
    }

    public static void i(z zVar) {
        boolean z10;
        b();
        e c10 = c();
        z zVar2 = c10.f40591u;
        b bVar = c10.f40574a;
        c10.f40591u = zVar;
        if (c10.f()) {
            if (c10.f40588r == null) {
                k kVar = new k(c10.h, new ia(c10, 5));
                c10.f40588r = kVar;
                c10.a(kVar, true);
                c10.k();
                s0 s0Var = c10.f40576c;
                ((Handler) s0Var.d).post((l7) s0Var.h);
            }
            if (zVar2 != null && zVar2.d) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != zVar.d) {
                k kVar2 = c10.f40588r;
                kVar2.h = c10.A;
                if (!kVar2.f6958b) {
                    kVar2.f6958b = true;
                    ((androidx.mediarouter.app.c) kVar2.e).sendEmptyMessage(2);
                }
            }
        } else {
            k kVar3 = c10.f40588r;
            if (kVar3 != null) {
                u d = c10.d(kVar3);
                if (d != null) {
                    b();
                    kVar3.f6960f = null;
                    kVar3.h(null);
                    c10.m(d, null);
                    bVar.b(514, d);
                    c10.f40582l.remove(d);
                }
                c10.f40588r = null;
                s0 s0Var2 = c10.f40576c;
                ((Handler) s0Var2.d).post((l7) s0Var2.h);
            }
        }
        bVar.b(769, zVar);
    }

    public static void j(int i10) {
        if (i10 >= 0 && i10 <= 3) {
            b();
            e c10 = c();
            v c11 = c10.c();
            if (c10.e() != c11) {
                c10.i(c11, i10);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Unsupported reason to unselect route");
    }

    public final void a(r rVar, s sVar, int i10) {
        t tVar;
        boolean z10;
        ArrayList<String> arrayList;
        r rVar2;
        if (rVar != null) {
            if (sVar != null) {
                b();
                ArrayList arrayList2 = this.f40706b;
                int size = arrayList2.size();
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (i12 < size) {
                        if (((t) arrayList2.get(i12)).f40678b == sVar) {
                            break;
                        }
                        i12++;
                    } else {
                        i12 = -1;
                        break;
                    }
                }
                if (i12 < 0) {
                    tVar = new t(this, sVar);
                    arrayList2.add(tVar);
                } else {
                    tVar = (t) arrayList2.get(i12);
                }
                boolean z11 = true;
                if (i10 != tVar.d) {
                    tVar.d = i10;
                    z10 = true;
                } else {
                    z10 = false;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if ((i10 & 1) != 0) {
                    z10 = true;
                }
                tVar.e = elapsedRealtime;
                r rVar3 = tVar.f40679c;
                rVar3.a();
                rVar.a();
                if (!rVar3.f40666b.containsAll(rVar.f40666b)) {
                    r rVar4 = tVar.f40679c;
                    if (rVar4 != null) {
                        rVar4.a();
                        if (!rVar4.f40666b.isEmpty()) {
                            arrayList = new ArrayList<>(rVar4.f40666b);
                        } else {
                            arrayList = null;
                        }
                        ArrayList c10 = rVar.c();
                        if (!c10.isEmpty()) {
                            int size2 = c10.size();
                            while (i11 < size2) {
                                Object obj = c10.get(i11);
                                i11++;
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
                            rVar2 = r.f40664c;
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putStringArrayList("controlCategories", arrayList);
                            rVar2 = new r(bundle, arrayList);
                        }
                        tVar.f40679c = rVar2;
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
            ArrayList arrayList = this.f40706b;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    if (((t) arrayList.get(i10)).f40678b == sVar) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                arrayList.remove(i10);
                c().k();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }
}
