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
import m.f3;
import m.y0;
public final class y {
    public static e f45356c;
    public final Context f45357a;
    public final ArrayList f45358b = new ArrayList();

    static {
        Log.isLoggable("AxMediaRouter", 3);
    }

    public y(Context context) {
        this.f45357a = context;
    }

    public static void b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
    }

    public static e c() {
        e eVar = f45356c;
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalStateException("getGlobalRouter cannot be called when sGlobal is null");
    }

    public static y d(Context context) {
        if (context != null) {
            b();
            if (f45356c == null) {
                f45356c = new e(context.getApplicationContext());
            }
            ArrayList arrayList = f45356c.f45220i;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    y yVar = (y) ((WeakReference) arrayList.get(size)).get();
                    if (yVar == null) {
                        arrayList.remove(size);
                    } else if (yVar.f45357a == context) {
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
        e eVar = f45356c;
        if (eVar != null) {
            f3 f3Var = eVar.C;
            if (f3Var != null) {
                android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) f3Var.f15423b;
                if (a0Var != null) {
                    return a0Var.f2069a.f2095c;
                }
                return null;
            }
            android.support.v4.media.session.a0 a0Var2 = eVar.D;
            if (a0Var2 != null) {
                return a0Var2.f2069a.f2095c;
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
        if (f45356c == null) {
            return false;
        }
        a0 a0Var = c().f45232u;
        if (a0Var != null && (bundle = a0Var.f45205e) != null && !bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true)) {
            return false;
        }
        return true;
    }

    public static void i(a0 a0Var) {
        boolean z10;
        b();
        e c10 = c();
        a0 a0Var2 = c10.f45232u;
        b bVar = c10.f45214a;
        c10.f45232u = a0Var;
        if (c10.f()) {
            if (c10.f45229r == null) {
                k kVar = new k(c10.h, new y0(c10, 13));
                c10.f45229r = kVar;
                c10.a(kVar, true);
                c10.k();
                u0 u0Var = c10.f45216c;
                ((Handler) u0Var.d).post((t0) u0Var.h);
            }
            if (a0Var2 != null && a0Var2.d) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != a0Var.d) {
                k kVar2 = c10.f45229r;
                kVar2.h = c10.A;
                if (!kVar2.f7542b) {
                    kVar2.f7542b = true;
                    ((androidx.mediarouter.app.c) kVar2.f7544e).sendEmptyMessage(2);
                }
            }
        } else {
            k kVar3 = c10.f45229r;
            if (kVar3 != null) {
                v d = c10.d(kVar3);
                if (d != null) {
                    b();
                    kVar3.f7545f = null;
                    kVar3.h(null);
                    c10.m(d, null);
                    bVar.b(514, d);
                    c10.f45223l.remove(d);
                }
                c10.f45229r = null;
                u0 u0Var2 = c10.f45216c;
                ((Handler) u0Var2.d).post((t0) u0Var2.h);
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
                ArrayList arrayList2 = this.f45358b;
                int size = arrayList2.size();
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (i12 < size) {
                        if (((u) arrayList2.get(i12)).f45321b == tVar) {
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
                uVar.f45323e = elapsedRealtime;
                s sVar3 = uVar.f45322c;
                sVar3.a();
                sVar.a();
                if (!sVar3.f45312b.containsAll(sVar.f45312b)) {
                    s sVar4 = uVar.f45322c;
                    if (sVar4 != null) {
                        sVar4.a();
                        if (!sVar4.f45312b.isEmpty()) {
                            arrayList = new ArrayList<>(sVar4.f45312b);
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
                            sVar2 = s.f45310c;
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putStringArrayList("controlCategories", arrayList);
                            sVar2 = new s(bundle, arrayList);
                        }
                        uVar.f45322c = sVar2;
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
            ArrayList arrayList = this.f45358b;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    if (((u) arrayList.get(i10)).f45321b == tVar) {
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
