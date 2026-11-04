package r4;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.lt;
public final class y {
    public static e f54392c;
    public final Context f54393a;
    public final ArrayList f54394b = new ArrayList();

    static {
        Log.isLoggable("AxMediaRouter", 3);
    }

    public y(Context context) {
        this.f54393a = context;
    }

    public static void b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
    }

    public static e c() {
        e eVar = f54392c;
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalStateException("getGlobalRouter cannot be called when sGlobal is null");
    }

    public static y d(Context context) {
        if (context != null) {
            b();
            if (f54392c == null) {
                f54392c = new e(context.getApplicationContext());
            }
            ArrayList arrayList = f54392c.f54263i;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    y yVar = (y) ((WeakReference) arrayList.get(size)).get();
                    if (yVar == null) {
                        arrayList.remove(size);
                    } else if (yVar.f54393a == context) {
                        return yVar;
                    }
                } else {
                    y yVar2 = new y(context);
                    arrayList.add(new WeakReference(yVar2));
                    return yVar2;
                }
            }
        } else {
            throw new IllegalArgumentException("context must not be null");
        }
    }

    public static MediaSessionCompat$Token e() {
        e eVar = f54392c;
        if (eVar != null) {
            p7.d dVar = eVar.C;
            if (dVar != null) {
                android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) dVar.f53345b;
                if (a0Var != null) {
                    return ((android.support.v4.media.session.u) a0Var.f1186b).f1218c;
                }
                return null;
            }
            android.support.v4.media.session.a0 a0Var2 = eVar.D;
            if (a0Var2 != null) {
                return ((android.support.v4.media.session.u) a0Var2.f1186b).f1218c;
            }
            return null;
        }
        return null;
    }

    public static w f() {
        b();
        return c().e();
    }

    public static boolean g() {
        Bundle bundle;
        if (f54392c == null) {
            return false;
        }
        a0 a0Var = c().f54275u;
        if (a0Var != null && (bundle = a0Var.f54248e) != null && !bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true)) {
            return false;
        }
        return true;
    }

    public static void i(a0 a0Var) {
        boolean z10;
        b();
        e c2 = c();
        a0 a0Var2 = c2.f54275u;
        b bVar = c2.f54257a;
        c2.f54275u = a0Var;
        if (c2.f()) {
            if (c2.f54272r == null) {
                k kVar = new k(c2.h, new i9(c2, 15));
                c2.f54272r = kVar;
                c2.a(kVar, true);
                c2.k();
                ne.h hVar = c2.f54259c;
                ((Handler) hVar.d).post((lt) hVar.h);
            }
            if (a0Var2 != null && a0Var2.d) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != a0Var.d) {
                k kVar2 = c2.f54272r;
                kVar2.h = c2.A;
                if (!kVar2.f7589b) {
                    kVar2.f7589b = true;
                    ((android.support.v4.media.session.q) kVar2.f7591e).sendEmptyMessage(2);
                }
            }
        } else {
            k kVar3 = c2.f54272r;
            if (kVar3 != null) {
                v d = c2.d(kVar3);
                if (d != null) {
                    b();
                    kVar3.f7592f = null;
                    kVar3.h(null);
                    c2.m(d, null);
                    bVar.b(514, d);
                    c2.f54266l.remove(d);
                }
                c2.f54272r = null;
                ne.h hVar2 = c2.f54259c;
                ((Handler) hVar2.d).post((lt) hVar2.h);
            }
        }
        bVar.b(769, a0Var);
    }

    public static void j(int i3) {
        if (i3 >= 0 && i3 <= 3) {
            b();
            e c2 = c();
            w c10 = c2.c();
            if (c2.e() != c10) {
                c2.i(c10, i3);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Unsupported reason to unselect route");
    }

    public final void a(r rVar, s sVar, int i3) {
        t tVar;
        boolean z10;
        ArrayList<String> arrayList;
        r rVar2;
        if (rVar != null) {
            if (sVar != null) {
                b();
                ArrayList arrayList2 = this.f54394b;
                int size = arrayList2.size();
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 < size) {
                        if (((t) arrayList2.get(i11)).f54361b == sVar) {
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
                if (i3 != tVar.d) {
                    tVar.d = i3;
                    z10 = true;
                } else {
                    z10 = false;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if ((i3 & 1) != 0) {
                    z10 = true;
                }
                tVar.f54363e = elapsedRealtime;
                r rVar3 = tVar.f54362c;
                rVar3.a();
                rVar.a();
                if (!rVar3.f54348b.containsAll(rVar.f54348b)) {
                    r rVar4 = tVar.f54362c;
                    if (rVar4 != null) {
                        rVar4.a();
                        if (!rVar4.f54348b.isEmpty()) {
                            arrayList = new ArrayList<>(rVar4.f54348b);
                        } else {
                            arrayList = null;
                        }
                        ArrayList c2 = rVar.c();
                        if (!c2.isEmpty()) {
                            int size2 = c2.size();
                            while (i10 < size2) {
                                Object obj = c2.get(i10);
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
                            rVar2 = r.f54346c;
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putStringArrayList("controlCategories", arrayList);
                            rVar2 = new r(bundle, arrayList);
                        }
                        tVar.f54362c = rVar2;
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
            ArrayList arrayList = this.f54394b;
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 < size) {
                    if (((t) arrayList.get(i3)).f54361b == sVar) {
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            if (i3 >= 0) {
                arrayList.remove(i3);
                c().k();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }
}
