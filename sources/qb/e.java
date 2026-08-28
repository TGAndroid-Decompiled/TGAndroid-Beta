package qb;

import java.util.ArrayList;
import java.util.Arrays;
public final class e {
    public static final d f46132e = new Object();
    public final lb.b f46133a;
    public boolean f46135c;
    public final ArrayList f46134b = new ArrayList();
    public final int[] d = new int[5];

    public e(lb.b bVar) {
        this.f46133a = bVar;
    }

    public static float a(int i9, int[] iArr) {
        return ((i9 - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    public static boolean b(int[] iArr) {
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i9 < 5) {
                int i11 = iArr[i9];
                if (i11 == 0) {
                    break;
                }
                i10 += i11;
                i9++;
            } else if (i10 >= 7) {
                float f10 = i10 / 7.0f;
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
        double d = cVar.f14748a - cVar2.f14748a;
        double d9 = cVar.f14749b - cVar2.f14749b;
        return (d9 * d9) + (d * d);
    }

    public final boolean c(int i9, int i10, int[] iArr) {
        char c10;
        float f10;
        char c11;
        ArrayList arrayList;
        c cVar;
        float f11;
        float f12;
        int i11;
        int i12;
        int i13;
        int i14 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int a2 = (int) a(i10, iArr);
        int i15 = iArr[2];
        lb.b bVar = this.f46133a;
        int i16 = bVar.f16736b;
        int i17 = bVar.f16735a;
        int[] iArr2 = this.d;
        Arrays.fill(iArr2, 0);
        int i18 = i9;
        while (i18 >= 0 && bVar.b(a2, i18)) {
            iArr2[2] = iArr2[2] + 1;
            i18--;
        }
        float f13 = Float.NaN;
        if (i18 < 0) {
            f10 = Float.NaN;
            c10 = 2;
        } else {
            while (i18 >= 0 && !bVar.b(a2, i18)) {
                c10 = 2;
                int i19 = iArr2[1];
                if (i19 > i15) {
                    break;
                }
                iArr2[1] = i19 + 1;
                i18--;
            }
            c10 = 2;
            if (i18 >= 0 && iArr2[1] <= i15) {
                while (i18 >= 0 && bVar.b(a2, i18)) {
                    int i20 = iArr2[0];
                    if (i20 > i15) {
                        break;
                    }
                    iArr2[0] = i20 + 1;
                    i18--;
                }
                if (iArr2[0] <= i15) {
                    int i21 = i9 + 1;
                    while (i21 < i16 && bVar.b(a2, i21)) {
                        iArr2[c10] = iArr2[c10] + 1;
                        i21++;
                    }
                    if (i21 != i16) {
                        while (i21 < i16 && !bVar.b(a2, i21)) {
                            int i22 = iArr2[3];
                            if (i22 >= i15) {
                                break;
                            }
                            iArr2[3] = i22 + 1;
                            i21++;
                        }
                        if (i21 != i16 && iArr2[3] < i15) {
                            while (i21 < i16 && bVar.b(a2, i21)) {
                                int i23 = iArr2[4];
                                if (i23 >= i15) {
                                    break;
                                }
                                iArr2[4] = i23 + 1;
                                i21++;
                            }
                            int i24 = iArr2[4];
                            if (i24 < i15 && Math.abs(((((iArr2[0] + iArr2[1]) + iArr2[c10]) + iArr2[3]) + i24) - i14) * 5 < i14 * 2 && b(iArr2)) {
                                f10 = a(i21, iArr2);
                            }
                        }
                    }
                }
            }
            f10 = Float.NaN;
        }
        if (!Float.isNaN(f10)) {
            int i25 = (int) f10;
            int i26 = iArr[c10];
            Arrays.fill(iArr2, 0);
            int i27 = a2;
            while (i27 >= 0 && bVar.b(i27, i25)) {
                iArr2[c10] = iArr2[c10] + 1;
                i27--;
            }
            if (i27 < 0) {
                c11 = 3;
            } else {
                while (i27 >= 0 && !bVar.b(i27, i25)) {
                    c11 = 3;
                    int i28 = iArr2[1];
                    if (i28 > i26) {
                        break;
                    }
                    iArr2[1] = i28 + 1;
                    i27--;
                }
                c11 = 3;
                if (i27 >= 0 && iArr2[1] <= i26) {
                    while (i27 >= 0 && bVar.b(i27, i25)) {
                        int i29 = iArr2[0];
                        if (i29 > i26) {
                            break;
                        }
                        iArr2[0] = i29 + 1;
                        i27--;
                    }
                    if (iArr2[0] <= i26) {
                        int i30 = a2 + 1;
                        while (i30 < i17 && bVar.b(i30, i25)) {
                            iArr2[c10] = iArr2[c10] + 1;
                            i30++;
                        }
                        if (i30 != i17) {
                            while (i30 < i17 && !bVar.b(i30, i25)) {
                                int i31 = iArr2[c11];
                                if (i31 >= i26) {
                                    break;
                                }
                                iArr2[c11] = i31 + 1;
                                i30++;
                            }
                            if (i30 != i17 && iArr2[c11] < i26) {
                                while (i30 < i17 && bVar.b(i30, i25)) {
                                    int i32 = iArr2[4];
                                    if (i32 >= i26) {
                                        break;
                                    }
                                    iArr2[4] = i32 + 1;
                                    i30++;
                                }
                                int i33 = iArr2[4];
                                if (i33 < i26 && Math.abs(((((iArr2[0] + iArr2[1]) + iArr2[c10]) + iArr2[c11]) + i33) - i14) * 5 < i14 && b(iArr2)) {
                                    f13 = a(i30, iArr2);
                                }
                            }
                        }
                    }
                }
            }
            if (!Float.isNaN(f13)) {
                int i34 = (int) f13;
                Arrays.fill(iArr2, 0);
                int i35 = 0;
                while (i25 >= i35 && i34 >= i35 && bVar.b(i34 - i35, i25 - i35)) {
                    iArr2[c10] = iArr2[c10] + 1;
                    i35++;
                }
                if (iArr2[c10] != 0) {
                    while (i25 >= i35 && i34 >= i35 && !bVar.b(i34 - i35, i25 - i35)) {
                        iArr2[1] = iArr2[1] + 1;
                        i35++;
                    }
                    if (iArr2[1] != 0) {
                        while (i25 >= i35 && i34 >= i35 && bVar.b(i34 - i35, i25 - i35)) {
                            iArr2[0] = iArr2[0] + 1;
                            i35++;
                        }
                        if (iArr2[0] != 0) {
                            int i36 = bVar.f16736b;
                            int i37 = 1;
                            while (true) {
                                int i38 = i25 + i37;
                                if (i38 >= i36 || (i13 = i34 + i37) >= i17 || !bVar.b(i13, i38)) {
                                    break;
                                }
                                iArr2[c10] = iArr2[c10] + 1;
                                i37++;
                            }
                            while (true) {
                                int i39 = i25 + i37;
                                if (i39 >= i36 || (i12 = i34 + i37) >= i17 || bVar.b(i12, i39)) {
                                    break;
                                }
                                iArr2[c11] = iArr2[c11] + 1;
                                i37++;
                            }
                            if (iArr2[c11] == 0) {
                                return false;
                            }
                            while (true) {
                                int i40 = i25 + i37;
                                if (i40 >= i36 || (i11 = i34 + i37) >= i17 || !bVar.b(i11, i40)) {
                                    break;
                                }
                                iArr2[4] = iArr2[4] + 1;
                                i37++;
                            }
                            if (iArr2[4] == 0) {
                                return false;
                            }
                            int i41 = 0;
                            for (int i42 = 0; i42 < 5; i42++) {
                                int i43 = iArr2[i42];
                                if (i43 == 0) {
                                    return false;
                                }
                                i41 += i43;
                            }
                            if (i41 < 7) {
                                return false;
                            }
                            float f14 = i41 / 7.0f;
                            float f15 = f14 / 1.333f;
                            if (Math.abs(f14 - iArr2[0]) >= f15 || Math.abs(f14 - iArr2[1]) >= f15 || Math.abs((f14 * 3.0f) - iArr2[c10]) >= 3.0f * f15 || Math.abs(f14 - iArr2[c11]) >= f15 || Math.abs(f14 - iArr2[4]) >= f15) {
                                return false;
                            }
                            float f16 = i14 / 7.0f;
                            int i44 = 0;
                            while (true) {
                                arrayList = this.f46134b;
                                if (i44 < arrayList.size()) {
                                    cVar = (c) arrayList.get(i44);
                                    float f17 = cVar.f46131c;
                                    f11 = cVar.f14748a;
                                    f12 = cVar.f14749b;
                                    if (Math.abs(f10 - f12) <= f16 && Math.abs(f13 - f11) <= f16) {
                                        float abs = Math.abs(f16 - f17);
                                        if (abs <= 1.0f || abs <= f17) {
                                            break;
                                        }
                                    }
                                    i44++;
                                } else {
                                    arrayList.add(new c(f13, f10, f16, 1));
                                    return true;
                                }
                            }
                            int i45 = cVar.d;
                            int i46 = i45 + 1;
                            float f18 = i45;
                            float f19 = i46;
                            arrayList.set(i44, new c(((f11 * f18) + f13) / f19, e2.c.y(f18, f12, f10, f19), e2.c.y(f18, cVar.f46131c, f16, f19), i46));
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean d() {
        ArrayList arrayList = this.f46134b;
        int size = arrayList.size();
        int size2 = arrayList.size();
        float f10 = 0.0f;
        int i9 = 0;
        float f11 = 0.0f;
        int i10 = 0;
        while (i10 < size2) {
            Object obj = arrayList.get(i10);
            i10++;
            c cVar = (c) obj;
            if (cVar.d >= 2) {
                i9++;
                f11 += cVar.f46131c;
            }
        }
        if (i9 >= 3) {
            float f12 = f11 / size;
            int size3 = arrayList.size();
            int i11 = 0;
            while (i11 < size3) {
                Object obj2 = arrayList.get(i11);
                i11++;
                f10 += Math.abs(((c) obj2).f46131c - f12);
            }
            if (f10 <= f11 * 0.05f) {
                return true;
            }
        }
        return false;
    }
}
