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
import org.telegram.ui.Components.dt;
import org.telegram.ui.Components.qt;
import org.telegram.ui.hy0;
public final class x {
    public static e f54828c;
    public final Context f54829a;
    public final ArrayList f54830b = new ArrayList();

    static {
        Log.isLoggable("AxMediaRouter", 3);
    }

    public x(Context context) {
        this.f54829a = context;
    }

    public static void b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
    }

    public static e c() {
        e eVar = f54828c;
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalStateException("getGlobalRouter cannot be called when sGlobal is null");
    }

    public static x d(Context context) {
        if (context != null) {
            b();
            if (f54828c == null) {
                f54828c = new e(context.getApplicationContext());
            }
            ArrayList arrayList = f54828c.f54701i;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    x xVar = (x) ((WeakReference) arrayList.get(size)).get();
                    if (xVar == null) {
                        arrayList.remove(size);
                    } else if (xVar.f54829a == context) {
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
        e eVar = f54828c;
        if (eVar != null) {
            hy0 hy0Var = eVar.C;
            if (hy0Var != null) {
                android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) hy0Var.f46527b;
                if (a0Var != null) {
                    return ((android.support.v4.media.session.u) a0Var.f1763b).f1795c;
                }
                return null;
            }
            android.support.v4.media.session.a0 a0Var2 = eVar.D;
            if (a0Var2 != null) {
                return ((android.support.v4.media.session.u) a0Var2.f1763b).f1795c;
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
        if (f54828c == null) {
            return false;
        }
        z zVar = c().f54713u;
        if (zVar != null && (bundle = zVar.f54838e) != null && !bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true)) {
            return false;
        }
        return true;
    }

    public static void i(z zVar) {
        boolean z9;
        b();
        e c10 = c();
        z zVar2 = c10.f54713u;
        b bVar = c10.f54695a;
        c10.f54713u = zVar;
        if (c10.f()) {
            if (c10.f54710r == null) {
                k kVar = new k(c10.h, new qt(c10, 13));
                c10.f54710r = kVar;
                c10.a(kVar, true);
                c10.k();
                qe.h hVar = c10.f54697c;
                ((Handler) hVar.d).post((dt) hVar.h);
            }
            if (zVar2 != null && zVar2.d) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9 != zVar.d) {
                k kVar2 = c10.f54710r;
                kVar2.h = c10.A;
                if (!kVar2.f7534b) {
                    kVar2.f7534b = true;
                    ((android.support.v4.media.session.q) kVar2.f7536e).sendEmptyMessage(2);
                }
            }
        } else {
            k kVar3 = c10.f54710r;
            if (kVar3 != null) {
                u d = c10.d(kVar3);
                if (d != null) {
                    b();
                    kVar3.f7537f = null;
                    kVar3.h(null);
                    c10.m(d, null);
                    bVar.b(514, d);
                    c10.f54704l.remove(d);
                }
                c10.f54710r = null;
                qe.h hVar2 = c10.f54697c;
                ((Handler) hVar2.d).post((dt) hVar2.h);
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
        boolean z9;
        ArrayList<String> arrayList;
        r rVar2;
        if (rVar != null) {
            if (sVar != null) {
                b();
                ArrayList arrayList2 = this.f54830b;
                int size = arrayList2.size();
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 < size) {
                        if (((t) arrayList2.get(i11)).f54801b == sVar) {
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
                boolean z10 = true;
                if (i7 != tVar.d) {
                    tVar.d = i7;
                    z9 = true;
                } else {
                    z9 = false;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if ((i7 & 1) != 0) {
                    z9 = true;
                }
                tVar.f54803e = elapsedRealtime;
                r rVar3 = tVar.f54802c;
                rVar3.a();
                rVar.a();
                if (!rVar3.f54792b.containsAll(rVar.f54792b)) {
                    r rVar4 = tVar.f54802c;
                    if (rVar4 != null) {
                        rVar4.a();
                        if (!rVar4.f54792b.isEmpty()) {
                            arrayList = new ArrayList<>(rVar4.f54792b);
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
                            rVar2 = r.f54790c;
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putStringArrayList("controlCategories", arrayList);
                            rVar2 = new r(bundle, arrayList);
                        }
                        tVar.f54802c = rVar2;
                    } else {
                        throw new IllegalArgumentException("selector must not be null");
                    }
                } else {
                    z10 = z9;
                }
                if (z10) {
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
            ArrayList arrayList = this.f54830b;
            int size = arrayList.size();
            int i7 = 0;
            while (true) {
                if (i7 < size) {
                    if (((t) arrayList.get(i7)).f54801b == sVar) {
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
