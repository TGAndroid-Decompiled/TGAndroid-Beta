package ph;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.yh;
public final class na extends Path {
    public final int f42017a = AndroidUtilities.dp(10.0f);
    public final float[] f42018b;
    public ArrayList f42019c;
    public ArrayList d;
    public float e;
    public float f42020f;
    public float f42021g;
    public float h;
    public float f42022i;
    public float f42023j;
    public float f42024k;

    public na() {
        this.f42018b = r0;
        float dp = AndroidUtilities.dp(2.0f);
        float[] fArr = {dp, dp, dp, dp, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    public static int c(ArrayList arrayList) {
        if (arrayList == null) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (arrayList.get(i11) != null) {
                i10 += ((ha) arrayList.get(i11)).e;
            }
        }
        return i10;
    }

    public final void a(float f10, float f11, float f12, float f13, float f14, float f15, ArrayList arrayList) {
        float f16;
        float f17;
        short s6;
        float d;
        int i10;
        float d10;
        int i11;
        float f18 = f10;
        float f19 = f12;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (Math.abs(this.e - f13) <= 1.0f && Math.abs(this.f42020f - f14) <= 0.01f && Math.abs(this.f42021g - 0.0f) <= 0.1f && Math.abs(this.h - f15) <= 1.0f && Math.abs(this.f42022i - f18) <= 1.0f && Math.abs(this.f42023j - f11) <= 1.0f && Math.abs(this.f42024k - f19) <= 1.0f) {
                ArrayList arrayList2 = this.f42019c;
                if (arrayList2 != null && arrayList2.size() == arrayList.size()) {
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        int intValue = ((Integer) arrayList2.get(i12)).intValue();
                        if (arrayList.get(i12) == null) {
                            i11 = 0;
                        } else {
                            i11 = ((ha) arrayList.get(i12)).f41722b;
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
                            d10 = 0.0f;
                        } else {
                            d10 = ((ha) arrayList.get(i13)).f41721a.d(((ha) arrayList.get(i13)).f41723c, false);
                        }
                        if (floatValue != d10) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            ArrayList arrayList4 = this.f42019c;
            if (arrayList4 == null) {
                this.f42019c = new ArrayList();
            } else {
                arrayList4.clear();
            }
            int i14 = 0;
            while (i14 < arrayList.size()) {
                ArrayList arrayList5 = this.f42019c;
                if (arrayList.get(i14) == null) {
                    i10 = 0;
                } else {
                    i10 = ((ha) arrayList.get(i14)).f41722b;
                }
                i14 = yh.e(i10, i14, 1, arrayList5);
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
                    d = 0.0f;
                } else {
                    d = ((ha) arrayList.get(i15)).f41721a.d(((ha) arrayList.get(i15)).f41723c, false);
                }
                arrayList7.add(Float.valueOf(d));
            }
            this.f42022i = f18;
            this.f42023j = f11;
            this.f42024k = f19;
            this.f42021g = 0.0f;
            this.f42020f = f14;
            this.e = f13;
            this.h = f15;
            ArrayList arrayList8 = this.d;
            rewind();
            float round = Math.round(AndroidUtilities.dpf2(3.3333f));
            int i16 = 0;
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                if (arrayList.get(i17) != null) {
                    i16 = Math.max(i16, ((ha) arrayList.get(i17)).f41722b);
                }
            }
            int max = Math.max(0, (int) (((f11 - this.f42017a) - f18) / round));
            int min = Math.min(i16 - 1, (int) Math.ceil(((f19 + f16) - f18) / round));
            while (max <= min) {
                float f20 = max;
                float dp = (f20 * round) + f18 + AndroidUtilities.dp(2.0f);
                int i18 = 0;
                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                    if (arrayList.get(i19) != null && max < ((ha) arrayList.get(i19)).f41722b) {
                        s6 = ((ha) arrayList.get(i19)).d[max];
                    } else {
                        s6 = 0;
                    }
                    if (f20 < ((Float) arrayList8.get(i19)).floatValue() && max + 1 > ((Float) arrayList8.get(i19)).floatValue()) {
                        s6 = (short) ((((Float) arrayList8.get(i19)).floatValue() - f20) * s6);
                    } else if (f20 > ((Float) arrayList8.get(i19)).floatValue()) {
                        s6 = 0;
                    }
                    i18 += s6;
                }
                if (f14 <= 0.0f) {
                    f17 = 0.0f;
                } else {
                    f17 = (i18 / f14) * f13 * 0.6f;
                }
                if (dp < f11 || dp > f19) {
                    f17 *= 0.0f;
                    if (f17 <= 0.0f) {
                        max++;
                        f18 = f10;
                        f19 = f12;
                    }
                }
                float max2 = Math.max(f17, AndroidUtilities.lerp(AndroidUtilities.dpf2(0.66f), AndroidUtilities.dpf2(1.5f), 0.0f));
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(dp, AndroidUtilities.lerp(f15 - max2, f15 - ((f13 + max2) / 2.0f), 0.0f), AndroidUtilities.dpf2(1.66f) + dp, AndroidUtilities.lerp(f15, org.telegram.messenger.y3.a(f13, max2, 2.0f, f15), 0.0f));
                addRoundRect(rectF, this.f42018b, Path.Direction.CW);
                max++;
                f18 = f10;
                f19 = f12;
            }
            return;
        }
        rewind();
    }

    public final void b(float f10, float f11, float f12, float f13, long j10, float f14, float f15, float f16, ha haVar) {
        float f17;
        float f18;
        ArrayList arrayList;
        float f19;
        float f20 = f10;
        float f21 = f11;
        float f22 = f12;
        if (haVar == null) {
            rewind();
            return;
        }
        int i10 = haVar.f41722b;
        org.telegram.ui.Components.z5 z5Var = haVar.f41721a;
        float d = z5Var.d(haVar.f41723c, false);
        if (0 == j10 && Math.abs(this.e - f14) <= 1.0f && Math.abs(this.f42020f - f15) <= 0.01f && Math.abs(this.f42021g - f13) <= 0.1f && Math.abs(this.h - f16) <= 1.0f && Math.abs(this.f42022i - f20) <= 1.0f && Math.abs(this.f42023j - f21) <= 1.0f && Math.abs(this.f42024k - f22) <= 1.0f && (arrayList = this.f42019c) != null && arrayList.size() == 1) {
            ArrayList arrayList2 = this.d;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                f19 = ((Float) this.d.get(0)).floatValue();
            } else {
                f19 = 0.0f;
            }
            if (Math.abs(f19 - d) <= 0.01f) {
                return;
            }
        }
        ArrayList arrayList3 = this.f42019c;
        if (arrayList3 == null) {
            this.f42019c = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.f42019c.add(Integer.valueOf(i10));
        ArrayList arrayList4 = this.d;
        if (arrayList4 == null) {
            this.d = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.d.add(Float.valueOf(d));
        this.f42022i = f20;
        this.f42023j = f21;
        this.f42024k = f22;
        this.f42021g = f13;
        this.f42020f = f15;
        this.e = f14;
        this.h = f16;
        float d10 = z5Var.d(haVar.f41723c, false);
        rewind();
        float round = Math.round(AndroidUtilities.dpf2(3.3333f));
        int max = Math.max(0, (int) (((f21 - this.f42017a) - f20) / round));
        int min = Math.min(i10 - 1, (int) Math.ceil(((f17 + f22) - f20) / round));
        while (max <= min) {
            float f23 = max;
            float dp = (f23 * round) + f20 + AndroidUtilities.dp(2.0f);
            short s6 = haVar.d[max];
            if (f15 <= 0.0f) {
                f18 = 0.0f;
            } else {
                f18 = (s6 / f15) * f14 * 0.6f;
            }
            if (f23 < d10 && max + 1 > d10) {
                f18 *= d10 - f23;
            } else if (f23 > d10) {
                f18 = 0.0f;
            }
            if (dp < f21 || dp > f22) {
                f18 *= f13;
                if (f18 <= 0.0f) {
                    max++;
                    f20 = f10;
                    f21 = f11;
                    f22 = f12;
                }
            }
            float max2 = Math.max(f18, AndroidUtilities.lerp(AndroidUtilities.dpf2(0.66f), AndroidUtilities.dpf2(1.5f), f13));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(dp, AndroidUtilities.lerp(f16 - max2, f16 - ((f14 + max2) / 2.0f), f13), AndroidUtilities.dpf2(1.66f) + dp, AndroidUtilities.lerp(f16, org.telegram.messenger.y3.a(f14, max2, 2.0f, f16), f13));
            addRoundRect(rectF, this.f42018b, Path.Direction.CW);
            max++;
            f20 = f10;
            f21 = f11;
            f22 = f12;
        }
    }
}
