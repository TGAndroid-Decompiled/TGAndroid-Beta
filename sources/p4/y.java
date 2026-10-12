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
import ji.w4;
import org.telegram.ui.Wallet.m5;
public final class y {
    public static e f43139c;
    public final Context f43140a;
    public final ArrayList f43141b = new ArrayList();

    static {
        Log.isLoggable("AxMediaRouter", 3);
    }

    public y(Context context) {
        this.f43140a = context;
    }

    public static void b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
    }

    public static e c() {
        e eVar = f43139c;
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalStateException("getGlobalRouter cannot be called when sGlobal is null");
    }

    public static y d(Context context) {
        if (context != null) {
            b();
            if (f43139c == null) {
                f43139c = new e(context.getApplicationContext());
            }
            ArrayList arrayList = f43139c.f43013i;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    y yVar = (y) ((WeakReference) arrayList.get(size)).get();
                    if (yVar == null) {
                        arrayList.remove(size);
                    } else if (yVar.f43140a == context) {
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
        e eVar = f43139c;
        if (eVar != null) {
            li.k kVar = eVar.C;
            if (kVar != null) {
                android.support.v4.media.session.b0 b0Var = (android.support.v4.media.session.b0) kVar.f14820b;
                if (b0Var != null) {
                    return b0Var.f977a.f1001c;
                }
                return null;
            }
            android.support.v4.media.session.b0 b0Var2 = eVar.D;
            if (b0Var2 != null) {
                return b0Var2.f977a.f1001c;
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
        if (f43139c == null) {
            return false;
        }
        a0 a0Var = c().f43025u;
        if (a0Var != null && (bundle = a0Var.e) != null && !bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true)) {
            return false;
        }
        return true;
    }

    public static void i(a0 a0Var) {
        boolean z10;
        b();
        e c10 = c();
        a0 a0Var2 = c10.f43025u;
        b bVar = c10.f43008a;
        c10.f43025u = a0Var;
        if (c10.f()) {
            if (c10.f43022r == null) {
                k kVar = new k(c10.h, new w4(c10, 20));
                c10.f43022r = kVar;
                c10.a(kVar, true);
                c10.k();
                t0 t0Var = c10.f43010c;
                ((Handler) t0Var.d).post((m5) t0Var.h);
            }
            if (a0Var2 != null && a0Var2.d) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != a0Var.d) {
                k kVar2 = c10.f43022r;
                kVar2.h = c10.A;
                if (!kVar2.f5822b) {
                    kVar2.f5822b = true;
                    ((ab.o0) kVar2.e).sendEmptyMessage(2);
                }
            }
        } else {
            k kVar3 = c10.f43022r;
            if (kVar3 != null) {
                v d = c10.d(kVar3);
                if (d != null) {
                    b();
                    kVar3.f5824f = null;
                    kVar3.h(null);
                    c10.m(d, null);
                    bVar.b(514, d);
                    c10.f43016l.remove(d);
                }
                c10.f43022r = null;
                t0 t0Var2 = c10.f43010c;
                ((Handler) t0Var2.d).post((m5) t0Var2.h);
            }
        }
        bVar.b(769, a0Var);
    }

    public static void j(int i10) {
        if (i10 >= 0 && i10 <= 3) {
            b();
            e c10 = c();
            w c11 = c10.c();
            if (c10.e() != c11) {
                c10.i(c11, i10);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Unsupported reason to unselect route");
    }

    public final void a(s sVar, t tVar, int i10) {
        u uVar;
        boolean z10;
        ArrayList<String> arrayList;
        s sVar2;
        if (sVar != null) {
            if (tVar != null) {
                b();
                ArrayList arrayList2 = this.f43141b;
                int size = arrayList2.size();
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (i12 < size) {
                        if (((u) arrayList2.get(i12)).f43113b == tVar) {
                            break;
                        }
                        i12++;
                    } else {
                        i12 = -1;
                        break;
                    }
                }
                if (i12 < 0) {
                    uVar = new u(this, tVar);
                    arrayList2.add(uVar);
                } else {
                    uVar = (u) arrayList2.get(i12);
                }
                boolean z11 = true;
                if (i10 != uVar.d) {
                    uVar.d = i10;
                    z10 = true;
                } else {
                    z10 = false;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if ((i10 & 1) != 0) {
                    z10 = true;
                }
                uVar.e = elapsedRealtime;
                s sVar3 = uVar.f43114c;
                sVar3.a();
                sVar.a();
                if (!sVar3.f43101b.containsAll(sVar.f43101b)) {
                    s sVar4 = uVar.f43114c;
                    if (sVar4 != null) {
                        sVar4.a();
                        if (!sVar4.f43101b.isEmpty()) {
                            arrayList = new ArrayList<>(sVar4.f43101b);
                        } else {
                            arrayList = null;
                        }
                        ArrayList c10 = sVar.c();
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
                            sVar2 = s.f43099c;
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putStringArrayList("controlCategories", arrayList);
                            sVar2 = new s(bundle, arrayList);
                        }
                        uVar.f43114c = sVar2;
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

    public final void h(t tVar) {
        if (tVar != null) {
            b();
            ArrayList arrayList = this.f43141b;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    if (((u) arrayList.get(i10)).f43113b == tVar) {
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
