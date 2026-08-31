package qh;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.yh;
public final class la extends Path {
    public final int f45635a = AndroidUtilities.dp(10.0f);
    public final float[] f45636b;
    public ArrayList f45637c;
    public ArrayList d;
    public float f45638e;
    public float f45639f;
    public float f45640g;
    public float h;
    public float f45641i;
    public float f45642j;
    public float f45643k;

    public la() {
        this.f45636b = r0;
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
                i10 += ((fa) arrayList.get(i11)).f45339e;
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
            if (Math.abs(this.f45638e - f13) <= 1.0f && Math.abs(this.f45639f - f14) <= 0.01f && Math.abs(this.f45640g - 0.0f) <= 0.1f && Math.abs(this.h - f15) <= 1.0f && Math.abs(this.f45641i - f18) <= 1.0f && Math.abs(this.f45642j - f11) <= 1.0f && Math.abs(this.f45643k - f19) <= 1.0f) {
                ArrayList arrayList2 = this.f45637c;
                if (arrayList2 != null && arrayList2.size() == arrayList.size()) {
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        int intValue = ((Integer) arrayList2.get(i12)).intValue();
                        if (arrayList.get(i12) == null) {
                            i11 = 0;
                        } else {
                            i11 = ((fa) arrayList.get(i12)).f45337b;
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
                            d10 = ((fa) arrayList.get(i13)).f45336a.d(((fa) arrayList.get(i13)).f45338c, false);
                        }
                        if (floatValue != d10) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            ArrayList arrayList4 = this.f45637c;
            if (arrayList4 == null) {
                this.f45637c = new ArrayList();
            } else {
                arrayList4.clear();
            }
            int i14 = 0;
            while (i14 < arrayList.size()) {
                ArrayList arrayList5 = this.f45637c;
                if (arrayList.get(i14) == null) {
                    i10 = 0;
                } else {
                    i10 = ((fa) arrayList.get(i14)).f45337b;
                }
                i14 = yh.d(i10, i14, 1, arrayList5);
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
                    d = ((fa) arrayList.get(i15)).f45336a.d(((fa) arrayList.get(i15)).f45338c, false);
                }
                arrayList7.add(Float.valueOf(d));
            }
            this.f45641i = f18;
            this.f45642j = f11;
            this.f45643k = f19;
            this.f45640g = 0.0f;
            this.f45639f = f14;
            this.f45638e = f13;
            this.h = f15;
            ArrayList arrayList8 = this.d;
            rewind();
            float round = Math.round(AndroidUtilities.dpf2(3.3333f));
            int i16 = 0;
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                if (arrayList.get(i17) != null) {
                    i16 = Math.max(i16, ((fa) arrayList.get(i17)).f45337b);
                }
            }
            int max = Math.max(0, (int) (((f11 - this.f45635a) - f18) / round));
            int min = Math.min(i16 - 1, (int) Math.ceil(((f19 + f16) - f18) / round));
            while (max <= min) {
                float f20 = max;
                float dp = (f20 * round) + f18 + AndroidUtilities.dp(2.0f);
                int i18 = 0;
                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                    if (arrayList.get(i19) != null && max < ((fa) arrayList.get(i19)).f45337b) {
                        s6 = ((fa) arrayList.get(i19)).d[max];
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
                addRoundRect(rectF, this.f45636b, Path.Direction.CW);
                max++;
                f18 = f10;
                f19 = f12;
            }
            return;
        }
        rewind();
    }

    public final void b(float f10, float f11, float f12, float f13, long j10, float f14, float f15, float f16, fa faVar) {
        float f17;
        float f18;
        ArrayList arrayList;
        float f19;
        float f20 = f10;
        float f21 = f11;
        float f22 = f12;
        if (faVar == null) {
            rewind();
            return;
        }
        int i10 = faVar.f45337b;
        org.telegram.ui.Components.z5 z5Var = faVar.f45336a;
        float d = z5Var.d(faVar.f45338c, false);
        if (0 == j10 && Math.abs(this.f45638e - f14) <= 1.0f && Math.abs(this.f45639f - f15) <= 0.01f && Math.abs(this.f45640g - f13) <= 0.1f && Math.abs(this.h - f16) <= 1.0f && Math.abs(this.f45641i - f20) <= 1.0f && Math.abs(this.f45642j - f21) <= 1.0f && Math.abs(this.f45643k - f22) <= 1.0f && (arrayList = this.f45637c) != null && arrayList.size() == 1) {
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
        ArrayList arrayList3 = this.f45637c;
        if (arrayList3 == null) {
            this.f45637c = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.f45637c.add(Integer.valueOf(i10));
        ArrayList arrayList4 = this.d;
        if (arrayList4 == null) {
            this.d = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.d.add(Float.valueOf(d));
        this.f45641i = f20;
        this.f45642j = f21;
        this.f45643k = f22;
        this.f45640g = f13;
        this.f45639f = f15;
        this.f45638e = f14;
        this.h = f16;
        float d10 = z5Var.d(faVar.f45338c, false);
        rewind();
        float round = Math.round(AndroidUtilities.dpf2(3.3333f));
        int max = Math.max(0, (int) (((f21 - this.f45635a) - f20) / round));
        int min = Math.min(i10 - 1, (int) Math.ceil(((f17 + f22) - f20) / round));
        while (max <= min) {
            float f23 = max;
            float dp = (f23 * round) + f20 + AndroidUtilities.dp(2.0f);
            short s6 = faVar.d[max];
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
            addRoundRect(rectF, this.f45636b, Path.Direction.CW);
            max++;
            f20 = f10;
            f21 = f11;
            f22 = f12;
        }
    }
}
