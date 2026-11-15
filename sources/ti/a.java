package ti;

import android.graphics.RectF;
import i5.c;
import java.util.ArrayList;
public final class a {
    public final ArrayList f57661a = new ArrayList();
    public int f57662b;

    public final RectF a(float f10, float f11, float f12, float f13) {
        RectF rectF;
        int i7 = this.f57662b;
        ArrayList arrayList = this.f57661a;
        if (i7 < arrayList.size()) {
            rectF = (RectF) arrayList.get(this.f57662b);
            rectF.set(f10, f11, f12, f13);
        } else {
            rectF = new RectF(f10, f11, f12, f13);
            arrayList.add(rectF);
        }
        this.f57662b++;
        return rectF;
    }

    public final void b(float f10, float f11, float f12) {
        int i7 = 0;
        while (i7 < this.f57662b) {
            RectF rectF = (RectF) this.f57661a.get(i7);
            float f13 = rectF.right;
            if (f13 > 0.0f) {
                float f14 = rectF.bottom;
                if (f14 > f10) {
                    float f15 = rectF.left;
                    if (f15 < f11) {
                        float f16 = rectF.top;
                        if (f16 < f12) {
                            if (f15 < 0.0f) {
                                rectF.left = 0.0f;
                            }
                            if (f16 < f10) {
                                rectF.top = f10;
                            }
                            if (f13 > f11) {
                                rectF.right = f11;
                            }
                            if (f14 > f12) {
                                rectF.bottom = f12;
                            }
                            i7++;
                        }
                    }
                }
            }
            d(i7);
        }
    }

    public final RectF c(int i7) {
        if (i7 >= 0 && i7 < this.f57662b) {
            return (RectF) this.f57661a.get(i7);
        }
        StringBuilder m10 = c.m(i7, "index=", ", size=");
        m10.append(this.f57662b);
        throw new IndexOutOfBoundsException(m10.toString());
    }

    public final void d(int i7) {
        int i10;
        if (i7 >= 0 && i7 < (i10 = this.f57662b)) {
            int i11 = i10 - 1;
            ArrayList arrayList = this.f57661a;
            RectF rectF = (RectF) arrayList.get(i7);
            if (i7 != i11) {
                arrayList.set(i7, (RectF) arrayList.get(i11));
                arrayList.set(i11, rectF);
            }
            this.f57662b = i11;
            return;
        }
        StringBuilder m10 = c.m(i7, "index=", ", size=");
        m10.append(this.f57662b);
        throw new IndexOutOfBoundsException(m10.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f57662b != aVar.f57662b) {
            return false;
        }
        for (int i7 = 0; i7 < this.f57662b; i7++) {
            if (!((RectF) this.f57661a.get(i7)).equals(aVar.f57661a.get(i7))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i7 = 1;
        for (int i10 = 0; i10 < this.f57662b; i10++) {
            i7 = (i7 * 31) + ((RectF) this.f57661a.get(i10)).hashCode();
        }
        return i7;
    }
}
