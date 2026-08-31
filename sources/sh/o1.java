package sh;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.SparseIntArray;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
public final class o1 {
    public final SparseIntArray f47553a = new SparseIntArray();
    public final SparseIntArray f47554b = new SparseIntArray();
    public final int[] f47555c = {k6.G6, k6.f21963u8, k6.G8, k6.E8, k6.F8, k6.I5, k6.Ii};
    public float d;

    public final int a(int i10) {
        return i0.a.d(this.d, this.f47553a.get(i10), this.f47554b.get(i10));
    }

    public final void b(org.telegram.ui.ActionBar.k kVar, float f10) {
        this.d = f10;
        int i10 = k6.G6;
        kVar.setTitleColor(a(i10));
        kVar.setSubtitleColor(k6.l1(0.45f, a(i10)));
        kVar.C(a(i10), false);
        ImageView imageView = kVar.f21532e;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(a(i10), PorterDuff.Mode.SRC_IN));
        }
        kVar.B(a(k6.f21963u8), false);
    }

    public final void c(SparseIntArray sparseIntArray, int i10, g6 g6Var) {
        int i11;
        int i12;
        int[] iArr = this.f47555c;
        int i13 = 0;
        if (i10 == 0) {
            while (i13 < iArr.length) {
                int i14 = iArr[i13];
                sparseIntArray.put(i14, k6.v0(i14, g6Var));
                i13++;
            }
            return;
        }
        if (i0.a.f(i10) < 0.5d) {
            i11 = -1;
        } else {
            i11 = -16777216;
        }
        int k10 = i0.a.k(i11, 60);
        while (i13 < iArr.length) {
            int i15 = iArr[i13];
            if (i15 != k6.G8 && i15 != k6.E8 && i15 != k6.F8 && i15 != (i12 = k6.I5)) {
                if (i15 == k6.Ii) {
                    sparseIntArray.put(i15, i0.a.d(0.5f, i10, i11));
                } else if (i15 != k6.f21963u8 && i15 != i12) {
                    sparseIntArray.put(i15, i11);
                } else {
                    sparseIntArray.put(i15, k10);
                }
            } else {
                sparseIntArray.put(i15, k6.v0(i15, g6Var));
            }
            i13++;
        }
    }
}
