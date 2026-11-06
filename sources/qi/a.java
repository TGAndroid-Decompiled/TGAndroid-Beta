package qi;

import android.graphics.RectF;
import java.util.ArrayList;
import jg.g;
public final class a {
    public final ArrayList f54035a = new ArrayList();
    public int f54036b;

    public final RectF a(float f10, float f11, float f12, float f13) {
        RectF rectF;
        int i7 = this.f54036b;
        ArrayList arrayList = this.f54035a;
        if (i7 < arrayList.size()) {
            rectF = (RectF) arrayList.get(this.f54036b);
            rectF.set(f10, f11, f12, f13);
        } else {
            rectF = new RectF(f10, f11, f12, f13);
            arrayList.add(rectF);
        }
        this.f54036b++;
        return rectF;
    }

    public final void b(float f10, float f11, float f12) {
        int i7 = 0;
        while (i7 < this.f54036b) {
            RectF rectF = (RectF) this.f54035a.get(i7);
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
        if (i7 >= 0 && i7 < this.f54036b) {
            return (RectF) this.f54035a.get(i7);
        }
        StringBuilder n10 = g.n(i7, "index=", ", size=");
        n10.append(this.f54036b);
        throw new IndexOutOfBoundsException(n10.toString());
    }

    public final void d(int i7) {
        int i10;
        if (i7 >= 0 && i7 < (i10 = this.f54036b)) {
            int i11 = i10 - 1;
            ArrayList arrayList = this.f54035a;
            RectF rectF = (RectF) arrayList.get(i7);
            if (i7 != i11) {
                arrayList.set(i7, (RectF) arrayList.get(i11));
                arrayList.set(i11, rectF);
            }
            this.f54036b = i11;
            return;
        }
        StringBuilder n10 = g.n(i7, "index=", ", size=");
        n10.append(this.f54036b);
        throw new IndexOutOfBoundsException(n10.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f54036b != aVar.f54036b) {
            return false;
        }
        for (int i7 = 0; i7 < this.f54036b; i7++) {
            if (!((RectF) this.f54035a.get(i7)).equals(aVar.f54035a.get(i7))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i7 = 1;
        for (int i10 = 0; i10 < this.f54036b; i10++) {
            i7 = (i7 * 31) + ((RectF) this.f54035a.get(i10)).hashCode();
        }
        return i7;
    }
}
