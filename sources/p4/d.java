package p4;

import a8.ma;
import android.os.Bundle;
import android.text.TextUtils;
import e2.q1;
import h9.s1;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;
public final class d {
    public static final String h;
    public static final String f55295i;
    public static final String f55296j;
    public static final String f55297k;
    public static final String f55298l;
    public static final String f55299m;
    public static final String f55300n;
    public final j1 f55301a;
    public final int f55302b;
    public final int f55303c;
    public final Bundle d;
    public final l9.a f55304e;
    public final boolean f55305f;
    public final Object f55306g;

    static {
        String str = h2.l0.f13778a;
        h = Integer.toString(0, 36);
        f55295i = Integer.toString(1, 36);
        f55296j = Integer.toString(2, 36);
        Integer.toString(3, 36);
        f55297k = Integer.toString(4, 36);
        f55298l = Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        f55299m = Integer.toString(8, 36);
        f55300n = Integer.toString(9, 36);
    }

    public d(j1 j1Var, int i7, int i10, Bundle bundle, boolean z10, l9.a aVar, Object obj) {
        this.f55301a = j1Var;
        this.f55302b = i7;
        this.f55303c = i10;
        this.d = new Bundle(bundle);
        this.f55305f = z10;
        this.f55304e = aVar;
        this.f55306g = obj;
    }

    public static Object a(int i7, Object obj) {
        if (obj == null) {
            return null;
        }
        switch (i7) {
            case 1:
                if (obj instanceof Integer) {
                    obj = Long.valueOf(((Integer) obj).longValue());
                }
                ma.e("Parameter has incorrect type.", obj instanceof Long);
                return obj;
            case 2:
                ma.e("Parameter has incorrect type.", obj instanceof Integer);
                return obj;
            case 3:
                ma.e("Parameter has incorrect type.", obj instanceof Boolean);
                return obj;
            case 4:
                if (obj instanceof Double) {
                    obj = Float.valueOf(((Double) obj).floatValue());
                }
                ma.e("Parameter has incorrect type.", obj instanceof Float);
                return obj;
            case 5:
                ma.e("Parameter has incorrect type.", obj instanceof e2.d1);
                return obj;
            case 6:
                ma.e("Parameter has incorrect type.", obj instanceof e2.l0);
                return obj;
            case 7:
                ma.e("Parameter has incorrect type.", obj instanceof e2.o0);
                return obj;
            case 8:
                ma.e("Parameter has incorrect type.", obj instanceof q1);
                return obj;
            default:
                return null;
        }
    }

    public static boolean c(int i7, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((d) list.get(i10)).f55304e.b(0) == i7) {
                return true;
            }
        }
        return false;
    }

    public static d d(j1 j1Var) {
        int i7;
        String str = j1Var.f55445b;
        Bundle bundle = j1Var.f55446c;
        boolean z10 = true;
        int i10 = 0;
        if (str.startsWith("androidx.media3.session.PLAYER_COMMAND_")) {
            int parseInt = Integer.parseInt(str.substring(39));
            Object h7 = h(i(parseInt), bundle);
            c cVar = new c();
            if (((j1) cVar.d) != null) {
                z10 = false;
            }
            ma.e("sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.", z10);
            cVar.f55286a = parseInt;
            cVar.f55291g = a(i(parseInt), h7);
            return cVar.a();
        }
        int parseInt2 = Integer.parseInt(str.substring(40));
        if (parseInt2 == 40010) {
            i7 = 5;
        } else {
            i7 = 0;
        }
        Object h10 = h(i7, bundle);
        c cVar2 = new c();
        j1 j1Var2 = new j1(parseInt2);
        if (cVar2.f55286a != -1) {
            z10 = false;
        }
        ma.e("playerCommands is already set. Only one of sessionCommand and playerCommand should be set.", z10);
        cVar2.d = j1Var2;
        if (j1Var2.f55444a == 40010) {
            i10 = 5;
        }
        cVar2.f55291g = a(i10, h10);
        return cVar2.a();
    }

    public static s1 g(List list) {
        int b10;
        if (list.isEmpty()) {
            h9.g0 g0Var = h9.i0.f13995b;
            return s1.f14058e;
        }
        int i7 = -1;
        int i10 = -1;
        for (int i11 = 0; i11 < list.size(); i11++) {
            d dVar = (d) list.get(i11);
            boolean z10 = dVar.f55305f;
            l9.a aVar = dVar.f55304e;
            if (z10 && dVar.b()) {
                int i12 = 0;
                while (true) {
                    if (i12 < aVar.f19799b && (b10 = aVar.b(i12)) != 6) {
                        if (i7 == -1 && b10 == 2) {
                            i7 = i11;
                            break;
                        } else if (i10 == -1 && b10 == 3) {
                            i10 = i11;
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
            }
        }
        h9.f0 p10 = h9.i0.p();
        if (i7 != -1) {
            p10.c(((d) list.get(i7)).e(2));
        }
        if (i10 != -1) {
            p10.c(((d) list.get(i10)).e(3));
        }
        for (int i13 = 0; i13 < list.size(); i13++) {
            d dVar2 = (d) list.get(i13);
            if (dVar2.f55305f && dVar2.b() && i13 != i7 && i13 != i10 && dVar2.f55304e.a(6)) {
                p10.c(dVar2.e(6));
            }
        }
        return p10.f();
    }

    public static Object h(int i7, Bundle bundle) {
        if (!bundle.containsKey("androidx.media3.session.CUSTOM_COMMAND_PARAMETER")) {
            return null;
        }
        switch (i7) {
            case 1:
                return Long.valueOf(bundle.getLong("androidx.media3.session.CUSTOM_COMMAND_PARAMETER"));
            case 2:
                return Integer.valueOf(bundle.getInt("androidx.media3.session.CUSTOM_COMMAND_PARAMETER"));
            case 3:
                return Boolean.valueOf(bundle.getBoolean("androidx.media3.session.CUSTOM_COMMAND_PARAMETER"));
            case 4:
                return Float.valueOf(bundle.getFloat("androidx.media3.session.CUSTOM_COMMAND_PARAMETER"));
            case 5:
                Bundle bundle2 = bundle.getBundle("androidx.media3.session.CUSTOM_COMMAND_PARAMETER");
                bundle2.getClass();
                return e2.d1.a(bundle2);
            case 6:
                Bundle bundle3 = bundle.getBundle("androidx.media3.session.CUSTOM_COMMAND_PARAMETER");
                bundle3.getClass();
                return e2.l0.a(9, bundle3);
            case 7:
                Bundle bundle4 = bundle.getBundle("androidx.media3.session.CUSTOM_COMMAND_PARAMETER");
                bundle4.getClass();
                return e2.o0.b(9, bundle4);
            case 8:
                Bundle bundle5 = bundle.getBundle("androidx.media3.session.CUSTOM_COMMAND_PARAMETER");
                bundle5.getClass();
                return q1.b(bundle5);
            default:
                return null;
        }
    }

    public static int i(int i7) {
        if (i7 != 1) {
            if (i7 == 5) {
                return 1;
            }
            if (i7 != 10) {
                if (i7 != 19) {
                    if (i7 != 24) {
                        if (i7 != 29) {
                            if (i7 == 31) {
                                return 6;
                            }
                            switch (i7) {
                                case 13:
                                    return 4;
                                case 14:
                                    return 3;
                                case 15:
                                    return 2;
                                default:
                                    return 0;
                            }
                        }
                        return 8;
                    }
                    return 4;
                }
                return 7;
            }
            return 2;
        }
        return 3;
    }

    public static boolean j(String str) {
        if (!str.startsWith("androidx.media3.session.PLAYER_COMMAND_") && !str.startsWith("androidx.media3.session.SESSION_COMMAND_")) {
            return false;
        }
        return true;
    }

    public final boolean b() {
        Object obj = this.f55306g;
        j1 j1Var = this.f55301a;
        if (j1Var != null) {
            int i7 = j1Var.f55444a;
            if (i7 == 0) {
                return true;
            }
            if (i7 == 40010 && obj != null) {
                return true;
            }
            return false;
        }
        int i10 = this.f55302b;
        if (i10 != 19) {
            if (i10 != 24) {
                if (i10 != 29 && i10 != 31) {
                    switch (i10) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 11:
                        case 12:
                        case 14:
                            break;
                        case 5:
                        case 10:
                        case 13:
                        case 15:
                            break;
                        default:
                            return false;
                    }
                }
            }
            return true;
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    public final d e(int i7) {
        String str;
        j1 j1Var = this.f55301a;
        if (j1Var != null && j1Var.f55444a == 0) {
            l9.a aVar = new l9.a(new int[]{i7});
            if (this.f55304e.equals(aVar)) {
                return this;
            }
            return new d(this.f55301a, this.f55302b, this.f55303c, new Bundle(this.d), this.f55305f, aVar, this.f55306g);
        }
        Bundle bundle = Bundle.EMPTY;
        if (this.f55306g != null) {
            bundle = new Bundle();
            l("androidx.media3.session.CUSTOM_COMMAND_PARAMETER", 9, bundle);
        }
        if (j1Var != null) {
            str = "androidx.media3.session.SESSION_COMMAND_" + j1Var.f55444a;
        } else {
            str = "androidx.media3.session.PLAYER_COMMAND_" + this.f55302b;
        }
        return new d(new j1(str, bundle), -1, this.f55303c, this.d, this.f55305f, new l9.a(new int[]{i7}), null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (Objects.equals(this.f55301a, dVar.f55301a) && this.f55302b == dVar.f55302b && this.f55303c == dVar.f55303c && TextUtils.equals("", "") && this.f55305f == dVar.f55305f && this.f55304e.equals(dVar.f55304e) && Objects.equals(this.f55306g, dVar.f55306g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void f(e2.c1 c1Var) {
        if (this.f55305f) {
            Object obj = this.f55306g;
            int i7 = this.f55302b;
            if (i7 != 19) {
                if (i7 != 24) {
                    if (i7 != 29) {
                        if (i7 != 31) {
                            switch (i7) {
                                case 1:
                                    if (obj != null) {
                                        c1Var.Y(((Boolean) obj).booleanValue());
                                        return;
                                    } else {
                                        c1Var.Y(!c1Var.v());
                                        return;
                                    }
                                case 2:
                                    c1Var.a();
                                    return;
                                case 3:
                                    c1Var.stop();
                                    return;
                                case 4:
                                    c1Var.H();
                                    return;
                                case 5:
                                    if (obj != null) {
                                        c1Var.c(((Long) obj).longValue());
                                        return;
                                    }
                                    return;
                                case 6:
                                    c1Var.F();
                                    return;
                                case 7:
                                    c1Var.V();
                                    return;
                                case 8:
                                    c1Var.h0();
                                    return;
                                case 9:
                                    c1Var.I0();
                                    return;
                                case 10:
                                    if (obj != null) {
                                        c1Var.Z(((Integer) obj).intValue());
                                        return;
                                    }
                                    return;
                                case 11:
                                    c1Var.M0();
                                    return;
                                case 12:
                                    c1Var.K0();
                                    return;
                                case 13:
                                    if (obj != null) {
                                        c1Var.d(((Float) obj).floatValue());
                                        return;
                                    }
                                    return;
                                case 14:
                                    if (obj != null) {
                                        c1Var.y(((Boolean) obj).booleanValue());
                                        return;
                                    } else {
                                        c1Var.y(!c1Var.E0());
                                        return;
                                    }
                                case 15:
                                    if (obj != null) {
                                        c1Var.k(((Integer) obj).intValue());
                                        return;
                                    }
                                    return;
                                default:
                                    return;
                            }
                        } else if (obj != null) {
                            c1Var.n0((e2.l0) obj);
                        }
                    } else if (obj != null) {
                        c1Var.r0((q1) obj);
                    }
                } else if (obj != null) {
                    c1Var.U(((Float) obj).floatValue());
                } else if (c1Var.G() == 0.0f) {
                    c1Var.d0();
                } else {
                    c1Var.C0();
                }
            } else if (obj != null) {
                c1Var.L0((e2.o0) obj);
            }
        }
    }

    public final int hashCode() {
        return Objects.hash(this.f55301a, Integer.valueOf(this.f55302b), 0, Integer.valueOf(this.f55303c), "", Boolean.valueOf(this.f55305f), null, this.f55304e, this.f55306g);
    }

    public final Bundle k(int i7) {
        Bundle bundle = new Bundle();
        j1 j1Var = this.f55301a;
        if (j1Var != null) {
            bundle.putBundle(h, j1Var.a());
        }
        int i10 = this.f55302b;
        if (i10 != -1) {
            bundle.putInt(f55295i, i10);
        }
        int i11 = this.f55303c;
        if (i11 != 0) {
            bundle.putInt(f55296j, i11);
        }
        Bundle bundle2 = this.d;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f55297k, bundle2);
        }
        boolean z10 = this.f55305f;
        if (!z10) {
            bundle.putBoolean(f55298l, z10);
        }
        l9.a aVar = this.f55304e;
        if (aVar.f19799b != 1 || aVar.b(0) != 6) {
            bundle.putIntArray(f55299m, Arrays.copyOfRange(aVar.f19798a, 0, aVar.f19799b));
        }
        if (this.f55306g != null) {
            l(f55300n, i7, bundle);
        }
        return bundle;
    }

    public final void l(String str, int i7, Bundle bundle) {
        int i10;
        j1 j1Var = this.f55301a;
        if (j1Var != null) {
            if (j1Var.f55444a == 40010) {
                i10 = 5;
            } else {
                i10 = 0;
            }
        } else {
            i10 = i(this.f55302b);
        }
        Object obj = this.f55306g;
        switch (i10) {
            case 1:
                bundle.putLong(str, ((Long) obj).longValue());
                return;
            case 2:
                bundle.putInt(str, ((Integer) obj).intValue());
                return;
            case 3:
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                return;
            case 4:
                bundle.putFloat(str, ((Float) obj).floatValue());
                return;
            case 5:
                bundle.putBundle(str, ((e2.d1) obj).c());
                return;
            case 6:
                bundle.putBundle(str, ((e2.l0) obj).c(i7, false));
                return;
            case 7:
                bundle.putBundle(str, ((e2.o0) obj).c(i7));
                return;
            case 8:
                bundle.putBundle(str, ((q1) obj).c());
                return;
            default:
                return;
        }
    }
}
