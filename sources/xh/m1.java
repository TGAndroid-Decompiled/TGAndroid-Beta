package xh;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.SparseIntArray;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
public final class m1 {
    public final SparseIntArray f53868a = new SparseIntArray();
    public final SparseIntArray f53869b = new SparseIntArray();
    public final int[] f53870c = {t6.G6, t6.f21244u8, t6.G8, t6.E8, t6.F8, t6.I5, t6.wj};
    public float d;

    public final int a(int i10) {
        return i0.b.f(this.d, this.f53868a.get(i10), this.f53869b.get(i10));
    }

    public final void b(org.telegram.ui.ActionBar.l lVar, float f7) {
        this.d = f7;
        int i10 = t6.G6;
        lVar.setTitleColor(a(i10));
        lVar.setSubtitleColor(t6.r1(0.45f, a(i10)));
        lVar.D(a(i10), false);
        ImageView imageView = lVar.e;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(a(i10), PorterDuff.Mode.SRC_IN));
        }
        lVar.C(a(t6.f21244u8), false);
    }

    public final void c(SparseIntArray sparseIntArray, int i10, p6 p6Var) {
        int i11;
        int i12;
        int[] iArr = this.f53870c;
        int i13 = 0;
        if (i10 == 0) {
            while (i13 < iArr.length) {
                int i14 = iArr[i13];
                sparseIntArray.put(i14, t6.w0(i14, p6Var));
                i13++;
            }
            return;
        }
        if (i0.b.h(i10) < 0.5d) {
            i11 = -1;
        } else {
            i11 = -16777216;
        }
        int o10 = i0.b.o(i11, 60);
        while (i13 < iArr.length) {
            int i15 = iArr[i13];
            if (i15 != t6.G8 && i15 != t6.E8 && i15 != t6.F8 && i15 != (i12 = t6.I5)) {
                if (i15 == t6.wj) {
                    sparseIntArray.put(i15, i0.b.f(0.5f, i10, i11));
                } else if (i15 != t6.f21244u8 && i15 != i12) {
                    sparseIntArray.put(i15, i11);
                } else {
                    sparseIntArray.put(i15, o10);
                }
            } else {
                sparseIntArray.put(i15, t6.w0(i15, p6Var));
            }
            i13++;
        }
    }
}
