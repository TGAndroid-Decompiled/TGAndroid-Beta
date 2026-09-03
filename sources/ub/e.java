package ub;

import java.util.ArrayList;
import java.util.Arrays;
public final class e {
    public static final d e = new Object();
    public final pb.b f45274a;
    public boolean f45276c;
    public final ArrayList f45275b = new ArrayList();
    public final int[] d = new int[5];

    public e(pb.b bVar) {
        this.f45274a = bVar;
    }

    public static float a(int i10, int[] iArr) {
        return ((i10 - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    public static boolean b(int[] iArr) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 < 5) {
                int i12 = iArr[i10];
                if (i12 == 0) {
                    break;
                }
                i11 += i12;
                i10++;
            } else if (i11 >= 7) {
                float f10 = i11 / 7.0f;
                float f11 = f10 / 2.0f;
                if (Math.abs(f10 - iArr[0]) >= f11 || Math.abs(f10 - iArr[1]) >= f11 || Math.abs((f10 * 3.0f) - iArr[2]) >= 3.0f * f11 || Math.abs(f10 - iArr[3]) >= f11 || Math.abs(f10 - iArr[4]) >= f11) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    public static double e(c cVar, c cVar2) {
        double d = cVar.f16517a - cVar2.f16517a;
        double d10 = cVar.f16518b - cVar2.f16518b;
        return (d10 * d10) + (d * d);
    }

    public final boolean c(int i10, int i11, int[] iArr) {
        char c3;
        float f10;
        char c10;
        ArrayList arrayList;
        c cVar;
        float f11;
        float f12;
        int i12;
        int i13;
        int i14;
        int i15 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int a2 = (int) a(i11, iArr);
        int i16 = iArr[2];
        pb.b bVar = this.f45274a;
        int i17 = bVar.f41120b;
        int i18 = bVar.f41119a;
        int[] iArr2 = this.d;
        Arrays.fill(iArr2, 0);
        int i19 = i10;
        while (i19 >= 0 && bVar.b(a2, i19)) {
            iArr2[2] = iArr2[2] + 1;
            i19--;
        }
        float f13 = Float.NaN;
        if (i19 < 0) {
            f10 = Float.NaN;
            c3 = 2;
        } else {
            while (i19 >= 0 && !bVar.b(a2, i19)) {
                c3 = 2;
                int i20 = iArr2[1];
                if (i20 > i16) {
                    break;
                }
                iArr2[1] = i20 + 1;
                i19--;
            }
            c3 = 2;
            if (i19 >= 0 && iArr2[1] <= i16) {
                while (i19 >= 0 && bVar.b(a2, i19)) {
                    int i21 = iArr2[0];
                    if (i21 > i16) {
                        break;
                    }
                    iArr2[0] = i21 + 1;
                    i19--;
                }
                if (iArr2[0] <= i16) {
                    int i22 = i10 + 1;
                    while (i22 < i17 && bVar.b(a2, i22)) {
                        iArr2[c3] = iArr2[c3] + 1;
                        i22++;
                    }
                    if (i22 != i17) {
                        while (i22 < i17 && !bVar.b(a2, i22)) {
                            int i23 = iArr2[3];
                            if (i23 >= i16) {
                                break;
                            }
                            iArr2[3] = i23 + 1;
                            i22++;
                        }
                        if (i22 != i17 && iArr2[3] < i16) {
                            while (i22 < i17 && bVar.b(a2, i22)) {
                                int i24 = iArr2[4];
                                if (i24 >= i16) {
                                    break;
                                }
                                iArr2[4] = i24 + 1;
                                i22++;
                            }
                            int i25 = iArr2[4];
                            if (i25 < i16 && Math.abs(((((iArr2[0] + iArr2[1]) + iArr2[c3]) + iArr2[3]) + i25) - i15) * 5 < i15 * 2 && b(iArr2)) {
                                f10 = a(i22, iArr2);
                            }
                        }
                    }
                }
            }
            f10 = Float.NaN;
        }
        if (!Float.isNaN(f10)) {
            int i26 = (int) f10;
            int i27 = iArr[c3];
            Arrays.fill(iArr2, 0);
            int i28 = a2;
            while (i28 >= 0 && bVar.b(i28, i26)) {
                iArr2[c3] = iArr2[c3] + 1;
                i28--;
            }
            if (i28 < 0) {
                c10 = 3;
            } else {
                while (i28 >= 0 && !bVar.b(i28, i26)) {
                    c10 = 3;
                    int i29 = iArr2[1];
                    if (i29 > i27) {
                        break;
                    }
                    iArr2[1] = i29 + 1;
                    i28--;
                }
                c10 = 3;
                if (i28 >= 0 && iArr2[1] <= i27) {
                    while (i28 >= 0 && bVar.b(i28, i26)) {
                        int i30 = iArr2[0];
                        if (i30 > i27) {
                            break;
                        }
                        iArr2[0] = i30 + 1;
                        i28--;
                    }
                    if (iArr2[0] <= i27) {
                        int i31 = a2 + 1;
                        while (i31 < i18 && bVar.b(i31, i26)) {
                            iArr2[c3] = iArr2[c3] + 1;
                            i31++;
                        }
                        if (i31 != i18) {
                            while (i31 < i18 && !bVar.b(i31, i26)) {
                                int i32 = iArr2[c10];
                                if (i32 >= i27) {
                                    break;
                                }
                                iArr2[c10] = i32 + 1;
                                i31++;
                            }
                            if (i31 != i18 && iArr2[c10] < i27) {
                                while (i31 < i18 && bVar.b(i31, i26)) {
                                    int i33 = iArr2[4];
                                    if (i33 >= i27) {
                                        break;
                                    }
                                    iArr2[4] = i33 + 1;
                                    i31++;
                                }
                                int i34 = iArr2[4];
                                if (i34 < i27 && Math.abs(((((iArr2[0] + iArr2[1]) + iArr2[c3]) + iArr2[c10]) + i34) - i15) * 5 < i15 && b(iArr2)) {
                                    f13 = a(i31, iArr2);
                                }
                            }
                        }
                    }
                }
            }
            if (!Float.isNaN(f13)) {
                int i35 = (int) f13;
                Arrays.fill(iArr2, 0);
                int i36 = 0;
                while (i26 >= i36 && i35 >= i36 && bVar.b(i35 - i36, i26 - i36)) {
                    iArr2[c3] = iArr2[c3] + 1;
                    i36++;
                }
                if (iArr2[c3] != 0) {
                    while (i26 >= i36 && i35 >= i36 && !bVar.b(i35 - i36, i26 - i36)) {
                        iArr2[1] = iArr2[1] + 1;
                        i36++;
                    }
                    if (iArr2[1] != 0) {
                        while (i26 >= i36 && i35 >= i36 && bVar.b(i35 - i36, i26 - i36)) {
                            iArr2[0] = iArr2[0] + 1;
                            i36++;
                        }
                        if (iArr2[0] != 0) {
                            int i37 = bVar.f41120b;
                            int i38 = 1;
                            while (true) {
                                int i39 = i26 + i38;
                                if (i39 >= i37 || (i14 = i35 + i38) >= i18 || !bVar.b(i14, i39)) {
                                    break;
                                }
                                iArr2[c3] = iArr2[c3] + 1;
                                i38++;
                            }
                            while (true) {
                                int i40 = i26 + i38;
                                if (i40 >= i37 || (i13 = i35 + i38) >= i18 || bVar.b(i13, i40)) {
                                    break;
                                }
                                iArr2[c10] = iArr2[c10] + 1;
                                i38++;
                            }
                            if (iArr2[c10] == 0) {
                                return false;
                            }
                            while (true) {
                                int i41 = i26 + i38;
                                if (i41 >= i37 || (i12 = i35 + i38) >= i18 || !bVar.b(i12, i41)) {
                                    break;
                                }
                                iArr2[4] = iArr2[4] + 1;
                                i38++;
                            }
                            if (iArr2[4] == 0) {
                                return false;
                            }
                            int i42 = 0;
                            for (int i43 = 0; i43 < 5; i43++) {
                                int i44 = iArr2[i43];
                                if (i44 == 0) {
                                    return false;
                                }
                                i42 += i44;
                            }
                            if (i42 < 7) {
                                return false;
                            }
                            float f14 = i42 / 7.0f;
                            float f15 = f14 / 1.333f;
                            if (Math.abs(f14 - iArr2[0]) >= f15 || Math.abs(f14 - iArr2[1]) >= f15 || Math.abs((f14 * 3.0f) - iArr2[c3]) >= 3.0f * f15 || Math.abs(f14 - iArr2[c10]) >= f15 || Math.abs(f14 - iArr2[4]) >= f15) {
                                return false;
                            }
                            float f16 = i15 / 7.0f;
                            int i45 = 0;
                            while (true) {
                                arrayList = this.f45275b;
                                if (i45 < arrayList.size()) {
                                    cVar = (c) arrayList.get(i45);
                                    float f17 = cVar.f45273c;
                                    f11 = cVar.f16517a;
                                    f12 = cVar.f16518b;
                                    if (Math.abs(f10 - f12) <= f16 && Math.abs(f13 - f11) <= f16) {
                                        float abs = Math.abs(f16 - f17);
                                        if (abs <= 1.0f || abs <= f17) {
                                            break;
                                        }
                                    }
                                    i45++;
                                } else {
                                    arrayList.add(new c(f13, f10, f16, 1));
                                    return true;
                                }
                            }
                            int i46 = cVar.d;
                            int i47 = i46 + 1;
                            float f18 = i46;
                            float f19 = i47;
                            arrayList.set(i45, new c(((f11 * f18) + f13) / f19, e2.c.v(f18, f12, f10, f19), e2.c.v(f18, cVar.f45273c, f16, f19), i47));
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean d() {
        ArrayList arrayList = this.f45275b;
        int size = arrayList.size();
        int size2 = arrayList.size();
        float f10 = 0.0f;
        int i10 = 0;
        float f11 = 0.0f;
        int i11 = 0;
        while (i11 < size2) {
            Object obj = arrayList.get(i11);
            i11++;
            c cVar = (c) obj;
            if (cVar.d >= 2) {
                i10++;
                f11 += cVar.f45273c;
            }
        }
        if (i10 >= 3) {
            float f12 = f11 / size;
            int size3 = arrayList.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj2 = arrayList.get(i12);
                i12++;
                f10 += Math.abs(((c) obj2).f45273c - f12);
            }
            if (f10 <= f11 * 0.05f) {
                return true;
            }
        }
        return false;
    }
}
