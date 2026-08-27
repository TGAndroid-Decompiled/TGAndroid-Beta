package rb;

import java.util.ArrayList;
import java.util.Arrays;

public final class e {

    public static final d f46891e = new d();

    public final mb.b f46892a;

    public boolean f46894c;

    public final ArrayList f46893b = new ArrayList();
    public final int[] d = new int[5];

    public e(mb.b bVar) {
        this.f46892a = bVar;
    }

    public static float a(int i10, int[] iArr) {
        return ((i10 - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    public static boolean b(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 5; i11++) {
            int i12 = iArr[i11];
            if (i12 == 0) {
                return false;
            }
            i10 += i12;
        }
        if (i10 >= 7) {
            float f10 = i10 / 7.0f;
            float f11 = f10 / 2.0f;
            if (Math.abs(f10 - iArr[0]) < f11 && Math.abs(f10 - iArr[1]) < f11 && Math.abs((f10 * 3.0f) - iArr[2]) < 3.0f * f11 && Math.abs(f10 - iArr[3]) < f11 && Math.abs(f10 - iArr[4]) < f11) {
                return true;
            }
        }
        return false;
    }

    public static double e(c cVar, c cVar2) {
        double d = cVar.f15529a - cVar2.f15529a;
        double d10 = cVar.f15530b - cVar2.f15530b;
        return (d10 * d10) + (d * d);
    }

    public final boolean c(int i10, int i11, int[] iArr) {
        char c10;
        float fA;
        char c11;
        int i12;
        int i13;
        int i14;
        int i15 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int iA = (int) a(i11, iArr);
        int i16 = iArr[2];
        mb.b bVar = this.f46892a;
        int i17 = bVar.f17920b;
        int i18 = bVar.f17919a;
        int[] iArr2 = this.d;
        Arrays.fill(iArr2, 0);
        int i19 = i10;
        while (i19 >= 0 && bVar.b(iA, i19)) {
            iArr2[2] = iArr2[2] + 1;
            i19--;
        }
        float fA2 = Float.NaN;
        if (i19 < 0) {
            fA = Float.NaN;
            c10 = 2;
        } else {
            while (true) {
                if (i19 < 0 || bVar.b(iA, i19)) {
                    c10 = 2;
                    break;
                }
                c10 = 2;
                int i20 = iArr2[1];
                if (i20 > i16) {
                    break;
                }
                iArr2[1] = i20 + 1;
                i19--;
            }
            if (i19 < 0 || iArr2[1] > i16) {
                fA = Float.NaN;
            } else {
                while (i19 >= 0 && bVar.b(iA, i19)) {
                    int i21 = iArr2[0];
                    if (i21 > i16) {
                        break;
                    }
                    iArr2[0] = i21 + 1;
                    i19--;
                }
                if (iArr2[0] > i16) {
                    fA = Float.NaN;
                } else {
                    int i22 = i10 + 1;
                    while (i22 < i17 && bVar.b(iA, i22)) {
                        iArr2[c10] = iArr2[c10] + 1;
                        i22++;
                    }
                    if (i22 == i17) {
                        fA = Float.NaN;
                    } else {
                        while (i22 < i17 && !bVar.b(iA, i22)) {
                            int i23 = iArr2[3];
                            if (i23 >= i16) {
                                break;
                            }
                            iArr2[3] = i23 + 1;
                            i22++;
                        }
                        if (i22 == i17 || iArr2[3] >= i16) {
                            fA = Float.NaN;
                        } else {
                            while (i22 < i17 && bVar.b(iA, i22)) {
                                int i24 = iArr2[4];
                                if (i24 >= i16) {
                                    break;
                                }
                                iArr2[4] = i24 + 1;
                                i22++;
                            }
                            int i25 = iArr2[4];
                            if (i25 < i16 && Math.abs(((((iArr2[0] + iArr2[1]) + iArr2[c10]) + iArr2[3]) + i25) - i15) * 5 < i15 * 2 && b(iArr2)) {
                                fA = a(i22, iArr2);
                            } else {
                                fA = Float.NaN;
                            }
                        }
                    }
                }
            }
        }
        if (!Float.isNaN(fA)) {
            int i26 = (int) fA;
            int i27 = iArr[c10];
            Arrays.fill(iArr2, 0);
            int i28 = iA;
            while (i28 >= 0 && bVar.b(i28, i26)) {
                iArr2[c10] = iArr2[c10] + 1;
                i28--;
            }
            if (i28 < 0) {
                c11 = 3;
            } else {
                while (true) {
                    if (i28 < 0 || bVar.b(i28, i26)) {
                        c11 = 3;
                        break;
                    }
                    c11 = 3;
                    int i29 = iArr2[1];
                    if (i29 > i27) {
                        break;
                    }
                    iArr2[1] = i29 + 1;
                    i28--;
                }
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
                        int i31 = iA + 1;
                        while (i31 < i18 && bVar.b(i31, i26)) {
                            iArr2[c10] = iArr2[c10] + 1;
                            i31++;
                        }
                        if (i31 != i18) {
                            while (i31 < i18 && !bVar.b(i31, i26)) {
                                int i32 = iArr2[c11];
                                if (i32 >= i27) {
                                    break;
                                }
                                iArr2[c11] = i32 + 1;
                                i31++;
                            }
                            if (i31 != i18 && iArr2[c11] < i27) {
                                while (i31 < i18 && bVar.b(i31, i26)) {
                                    int i33 = iArr2[4];
                                    if (i33 >= i27) {
                                        break;
                                    }
                                    iArr2[4] = i33 + 1;
                                    i31++;
                                }
                                int i34 = iArr2[4];
                                if (i34 < i27 && Math.abs(((((iArr2[0] + iArr2[1]) + iArr2[c10]) + iArr2[c11]) + i34) - i15) * 5 < i15 && b(iArr2)) {
                                    fA2 = a(i31, iArr2);
                                }
                            }
                        }
                    }
                }
            }
            if (!Float.isNaN(fA2)) {
                int i35 = (int) fA2;
                Arrays.fill(iArr2, 0);
                int i36 = 0;
                while (i26 >= i36 && i35 >= i36 && bVar.b(i35 - i36, i26 - i36)) {
                    iArr2[c10] = iArr2[c10] + 1;
                    i36++;
                }
                if (iArr2[c10] != 0) {
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
                            int i37 = bVar.f17920b;
                            int i38 = 1;
                            while (true) {
                                int i39 = i26 + i38;
                                if (i39 >= i37 || (i14 = i35 + i38) >= i18 || !bVar.b(i14, i39)) {
                                    break;
                                }
                                iArr2[c10] = iArr2[c10] + 1;
                                i38++;
                            }
                            while (true) {
                                int i40 = i26 + i38;
                                if (i40 >= i37 || (i13 = i35 + i38) >= i18 || bVar.b(i13, i40)) {
                                    break;
                                }
                                iArr2[c11] = iArr2[c11] + 1;
                                i38++;
                            }
                            if (iArr2[c11] == 0) {
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
                            float f10 = i42 / 7.0f;
                            float f11 = f10 / 1.333f;
                            if (Math.abs(f10 - iArr2[0]) >= f11 || Math.abs(f10 - iArr2[1]) >= f11 || Math.abs((f10 * 3.0f) - iArr2[c10]) >= 3.0f * f11 || Math.abs(f10 - iArr2[c11]) >= f11 || Math.abs(f10 - iArr2[4]) >= f11) {
                                return false;
                            }
                            float f12 = i15 / 7.0f;
                            int i45 = 0;
                            while (true) {
                                ArrayList arrayList = this.f46893b;
                                if (i45 >= arrayList.size()) {
                                    arrayList.add(new c(fA2, fA, f12, 1));
                                    return true;
                                }
                                c cVar = (c) arrayList.get(i45);
                                float f13 = cVar.f46890c;
                                float f14 = cVar.f15529a;
                                float f15 = cVar.f15530b;
                                if (Math.abs(fA - f15) <= f12 && Math.abs(fA2 - f14) <= f12) {
                                    float fAbs = Math.abs(f12 - f13);
                                    if (fAbs <= 1.0f || fAbs <= f13) {
                                        int i46 = cVar.d;
                                        int i47 = i46 + 1;
                                        float f16 = i46;
                                        float f17 = i47;
                                        arrayList.set(i45, new c(((f14 * f16) + fA2) / f17, com.google.android.recaptcha.internal.a.y(f16, f15, fA, f17), com.google.android.recaptcha.internal.a.y(f16, cVar.f46890c, f12, f17), i47));
                                        return true;
                                    }
                                }
                                i45++;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean d() {
        ArrayList arrayList = this.f46893b;
        int size = arrayList.size();
        int size2 = arrayList.size();
        float fAbs = 0.0f;
        int i10 = 0;
        float f10 = 0.0f;
        int i11 = 0;
        while (i11 < size2) {
            Object obj = arrayList.get(i11);
            i11++;
            c cVar = (c) obj;
            if (cVar.d >= 2) {
                i10++;
                f10 += cVar.f46890c;
            }
        }
        if (i10 >= 3) {
            float f11 = f10 / size;
            int size3 = arrayList.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj2 = arrayList.get(i12);
                i12++;
                fAbs += Math.abs(((c) obj2).f46890c - f11);
            }
            if (fAbs <= f10 * 0.05f) {
                return true;
            }
        }
        return false;
    }
}
