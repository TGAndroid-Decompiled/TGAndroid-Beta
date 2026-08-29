package ph;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.SparseIntArray;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
public final class o1 {
    public final SparseIntArray f45928a = new SparseIntArray();
    public final SparseIntArray f45929b = new SparseIntArray();
    public final int[] f45930c = {g6.G6, g6.f23367u8, g6.G8, g6.E8, g6.F8, g6.I5, g6.Ii};
    public float d;

    public final int a(int i10) {
        return i0.a.d(this.d, this.f45928a.get(i10), this.f45929b.get(i10));
    }

    public final void b(org.telegram.ui.ActionBar.l lVar, float f9) {
        this.d = f9;
        int i10 = g6.G6;
        lVar.setTitleColor(a(i10));
        lVar.setSubtitleColor(g6.l1(0.45f, a(i10)));
        lVar.C(a(i10), false);
        ImageView imageView = lVar.f23600e;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(a(i10), PorterDuff.Mode.SRC_IN));
        }
        lVar.B(a(g6.f23367u8), false);
    }

    public final void c(SparseIntArray sparseIntArray, int i10, c6 c6Var) {
        int i11;
        int i12;
        int[] iArr = this.f45930c;
        int i13 = 0;
        if (i10 == 0) {
            while (i13 < iArr.length) {
                int i14 = iArr[i13];
                sparseIntArray.put(i14, g6.v0(i14, c6Var));
                i13++;
            }
            return;
        }
        if (i0.a.f(i10) < 0.5d) {
            i11 = -1;
        } else {
            i11 = -16777216;
        }
        int k9 = i0.a.k(i11, 60);
        while (i13 < iArr.length) {
            int i15 = iArr[i13];
            if (i15 != g6.G8 && i15 != g6.E8 && i15 != g6.F8 && i15 != (i12 = g6.I5)) {
                if (i15 == g6.Ii) {
                    sparseIntArray.put(i15, i0.a.d(0.5f, i10, i11));
                } else if (i15 != g6.f23367u8 && i15 != i12) {
                    sparseIntArray.put(i15, i11);
                } else {
                    sparseIntArray.put(i15, k9);
                }
            } else {
                sparseIntArray.put(i15, g6.v0(i15, c6Var));
            }
            i13++;
        }
    }
}
