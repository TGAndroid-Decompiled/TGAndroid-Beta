package vh;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
public final class y8 extends Path {
    public final int f52218a = org.telegram.messenger.i0.L(10.0f);
    public final float[] f52219b;
    public ArrayList f52220c;
    public ArrayList d;
    public float e;
    public float f52221f;
    public float f52222g;
    public float h;
    public float f52223i;
    public float f52224j;
    public float f52225k;

    public y8() {
        this.f52219b = r0;
        float L = org.telegram.messenger.i0.L(2.0f);
        float[] fArr = {L, L, L, L, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    public static int c(ArrayList arrayList) {
        if (arrayList == null) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (arrayList.get(i11) != null) {
                i10 += ((s8) arrayList.get(i11)).e;
            }
        }
        return i10;
    }

    public final void a(float f7, float f10, float f11, float f12, float f13, float f14, ArrayList arrayList) {
        float f15;
        float f16;
        float f17;
        short s10;
        float e;
        int i10;
        float e7;
        int i11;
        float f18 = f7;
        float f19 = f11;
        if (arrayList != null && !arrayList.isEmpty()) {
            float f20 = 0.0f;
            if (Math.abs(this.e - f12) <= 1.0f && Math.abs(this.f52221f - f13) <= 0.01f && Math.abs(this.f52222g - 0.0f) <= 0.1f && Math.abs(this.h - f14) <= 1.0f && Math.abs(this.f52223i - f18) <= 1.0f && Math.abs(this.f52224j - f10) <= 1.0f && Math.abs(this.f52225k - f19) <= 1.0f) {
                ArrayList arrayList2 = this.f52220c;
                if (arrayList2 != null && arrayList2.size() == arrayList.size()) {
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        int intValue = ((Integer) arrayList2.get(i12)).intValue();
                        if (arrayList.get(i12) == null) {
                            i11 = 0;
                        } else {
                            i11 = ((s8) arrayList.get(i12)).f51937b;
                        }
                        if (intValue == i11) {
                        }
                    }
                }
                ArrayList arrayList3 = this.d;
                if (arrayList3 != null && arrayList3.size() == arrayList.size()) {
                    for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                        float floatValue = ((Float) arrayList3.get(i13)).floatValue();
                        if (arrayList.get(i13) == null) {
                            e7 = 0.0f;
                        } else {
                            e7 = ((s8) arrayList.get(i13)).f51936a.e(false, ((s8) arrayList.get(i13)).f51938c);
                        }
                        if (floatValue != e7) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            ArrayList arrayList4 = this.f52220c;
            if (arrayList4 == null) {
                this.f52220c = new ArrayList();
            } else {
                arrayList4.clear();
            }
            int i14 = 0;
            while (i14 < arrayList.size()) {
                ArrayList arrayList5 = this.f52220c;
                if (arrayList.get(i14) == null) {
                    i10 = 0;
                } else {
                    i10 = ((s8) arrayList.get(i14)).f51937b;
                }
                i14 = c3.i0.j(i10, i14, 1, arrayList5);
            }
            ArrayList arrayList6 = this.d;
            if (arrayList6 == null) {
                this.d = new ArrayList();
            } else {
                arrayList6.clear();
            }
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                ArrayList arrayList7 = this.d;
                if (arrayList.get(i15) == null) {
                    e = 0.0f;
                } else {
                    e = ((s8) arrayList.get(i15)).f51936a.e(false, ((s8) arrayList.get(i15)).f51938c);
                }
                arrayList7.add(Float.valueOf(e));
            }
            this.f52223i = f18;
            this.f52224j = f10;
            this.f52225k = f19;
            this.f52222g = 0.0f;
            this.f52221f = f13;
            this.e = f12;
            this.h = f14;
            ArrayList arrayList8 = this.d;
            rewind();
            float round = Math.round(org.telegram.messenger.i0.N(3.3333f));
            int i16 = 0;
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                if (arrayList.get(i17) != null) {
                    i16 = Math.max(i16, ((s8) arrayList.get(i17)).f51937b);
                }
            }
            int max = Math.max(0, (int) (((f10 - this.f52218a) - f18) / round));
            int min = Math.min(i16 - 1, (int) Math.ceil(((f19 + f15) - f18) / round));
            while (max <= min) {
                float f21 = max;
                float L = (f21 * round) + f18 + org.telegram.messenger.i0.L(2.0f);
                float f22 = f20;
                int i18 = 0;
                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                    if (arrayList.get(i19) != null && max < ((s8) arrayList.get(i19)).f51937b) {
                        s10 = ((s8) arrayList.get(i19)).d[max];
                    } else {
                        s10 = 0;
                    }
                    if (f21 < ((Float) arrayList8.get(i19)).floatValue() && max + 1 > ((Float) arrayList8.get(i19)).floatValue()) {
                        s10 = (short) ((((Float) arrayList8.get(i19)).floatValue() - f21) * s10);
                    } else if (f21 > ((Float) arrayList8.get(i19)).floatValue()) {
                        s10 = 0;
                    }
                    i18 += s10;
                }
                if (f13 <= f22) {
                    f16 = f22;
                } else {
                    f16 = (i18 / f13) * f12 * 0.6f;
                }
                if (L < f10 || L > f19) {
                    f16 *= f22;
                    if (f16 <= f22) {
                        f17 = f22;
                        max++;
                        f18 = f7;
                        f19 = f11;
                        f20 = f17;
                    }
                }
                f17 = f22;
                float max2 = Math.max(f16, org.telegram.messenger.i0.T1(org.telegram.messenger.i0.N(0.66f), org.telegram.messenger.i0.N(1.5f), f17));
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(L, org.telegram.messenger.i0.T1(f14 - max2, f14 - ((f12 + max2) / 2.0f), f17), org.telegram.messenger.i0.N(1.66f) + L, org.telegram.messenger.i0.T1(f14, org.telegram.messenger.m5.y(f12, max2, 2.0f, f14), f17));
                addRoundRect(rectF, this.f52219b, Path.Direction.CW);
                max++;
                f18 = f7;
                f19 = f11;
                f20 = f17;
            }
            return;
        }
        rewind();
    }

    public final void b(float f7, float f10, float f11, float f12, long j10, float f13, float f14, float f15, s8 s8Var) {
        float f16;
        float f17;
        ArrayList arrayList;
        float f18;
        float f19 = f7;
        float f20 = f10;
        float f21 = f11;
        if (s8Var == null) {
            rewind();
            return;
        }
        int i10 = s8Var.f51937b;
        org.telegram.ui.Components.t5 t5Var = s8Var.f51936a;
        float e = t5Var.e(false, s8Var.f51938c);
        if (0 == j10 && Math.abs(this.e - f13) <= 1.0f && Math.abs(this.f52221f - f14) <= 0.01f && Math.abs(this.f52222g - f12) <= 0.1f && Math.abs(this.h - f15) <= 1.0f && Math.abs(this.f52223i - f19) <= 1.0f && Math.abs(this.f52224j - f20) <= 1.0f && Math.abs(this.f52225k - f21) <= 1.0f && (arrayList = this.f52220c) != null && arrayList.size() == 1) {
            ArrayList arrayList2 = this.d;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                f18 = ((Float) this.d.get(0)).floatValue();
            } else {
                f18 = 0.0f;
            }
            if (Math.abs(f18 - e) <= 0.01f) {
                return;
            }
        }
        ArrayList arrayList3 = this.f52220c;
        if (arrayList3 == null) {
            this.f52220c = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.f52220c.add(Integer.valueOf(i10));
        ArrayList arrayList4 = this.d;
        if (arrayList4 == null) {
            this.d = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.d.add(Float.valueOf(e));
        this.f52223i = f19;
        this.f52224j = f20;
        this.f52225k = f21;
        this.f52222g = f12;
        this.f52221f = f14;
        this.e = f13;
        this.h = f15;
        float e7 = t5Var.e(false, s8Var.f51938c);
        rewind();
        float round = Math.round(org.telegram.messenger.i0.N(3.3333f));
        int max = Math.max(0, (int) (((f20 - this.f52218a) - f19) / round));
        int min = Math.min(i10 - 1, (int) Math.ceil(((f16 + f21) - f19) / round));
        while (max <= min) {
            float f22 = max;
            float L = (f22 * round) + f19 + org.telegram.messenger.i0.L(2.0f);
            short s10 = s8Var.d[max];
            if (f14 <= 0.0f) {
                f17 = 0.0f;
            } else {
                f17 = (s10 / f14) * f13 * 0.6f;
            }
            if (f22 < e7 && max + 1 > e7) {
                f17 *= e7 - f22;
            } else if (f22 > e7) {
                f17 = 0.0f;
            }
            if (L < f20 || L > f21) {
                f17 *= f12;
                if (f17 <= 0.0f) {
                    max++;
                    f19 = f7;
                    f20 = f10;
                    f21 = f11;
                }
            }
            float max2 = Math.max(f17, org.telegram.messenger.i0.T1(org.telegram.messenger.i0.N(0.66f), org.telegram.messenger.i0.N(1.5f), f12));
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(L, org.telegram.messenger.i0.T1(f15 - max2, f15 - ((f13 + max2) / 2.0f), f12), org.telegram.messenger.i0.N(1.66f) + L, org.telegram.messenger.i0.T1(f15, org.telegram.messenger.m5.y(f13, max2, 2.0f, f15), f12));
            addRoundRect(rectF, this.f52219b, Path.Direction.CW);
            max++;
            f19 = f7;
            f20 = f10;
            f21 = f11;
        }
    }
}
