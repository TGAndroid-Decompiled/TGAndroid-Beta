package ri;

import android.graphics.RectF;
import java.util.ArrayList;
import k2.p1;
public final class a {
    public final ArrayList f54543a = new ArrayList();
    public int f54544b;

    public final RectF a(float f10, float f11, float f12, float f13) {
        RectF rectF;
        int i3 = this.f54544b;
        ArrayList arrayList = this.f54543a;
        if (i3 < arrayList.size()) {
            rectF = (RectF) arrayList.get(this.f54544b);
            rectF.set(f10, f11, f12, f13);
        } else {
            rectF = new RectF(f10, f11, f12, f13);
            arrayList.add(rectF);
        }
        this.f54544b++;
        return rectF;
    }

    public final void b(float f10, float f11, float f12) {
        int i3 = 0;
        while (i3 < this.f54544b) {
            RectF rectF = (RectF) this.f54543a.get(i3);
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
                            i3++;
                        }
                    }
                }
            }
            d(i3);
        }
    }

    public final RectF c(int i3) {
        if (i3 >= 0 && i3 < this.f54544b) {
            return (RectF) this.f54543a.get(i3);
        }
        StringBuilder m10 = p1.m(i3, "index=", ", size=");
        m10.append(this.f54544b);
        throw new IndexOutOfBoundsException(m10.toString());
    }

    public final void d(int i3) {
        int i10;
        if (i3 >= 0 && i3 < (i10 = this.f54544b)) {
            int i11 = i10 - 1;
            ArrayList arrayList = this.f54543a;
            RectF rectF = (RectF) arrayList.get(i3);
            if (i3 != i11) {
                arrayList.set(i3, (RectF) arrayList.get(i11));
                arrayList.set(i11, rectF);
            }
            this.f54544b = i11;
            return;
        }
        StringBuilder m10 = p1.m(i3, "index=", ", size=");
        m10.append(this.f54544b);
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
        if (this.f54544b != aVar.f54544b) {
            return false;
        }
        for (int i3 = 0; i3 < this.f54544b; i3++) {
            if (!((RectF) this.f54543a.get(i3)).equals(aVar.f54543a.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i3 = 1;
        for (int i10 = 0; i10 < this.f54544b; i10++) {
            i3 = (i3 * 31) + ((RectF) this.f54543a.get(i10)).hashCode();
        }
        return i3;
    }
}
