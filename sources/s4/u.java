package s4;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public abstract class u extends t {
    public final ArrayList Q;
    public boolean R;

    public u(boolean z10) {
        super(1000, z10);
        this.Q = new ArrayList(4);
        this.R = true;
    }

    public abstract boolean C1(int i10);

    public abstract boolean D1(View view);

    @Override
    public final void Z0(rf.e r22, s4.b1 r23, s4.a0 r24, k2.l r25) {
        throw new UnsupportedOperationException("Method not decompiled: s4.u.Z0(rf.e, s4.b1, s4.a0, k2.l):void");
    }

    @Override
    public final boolean e() {
        return this.R;
    }

    @Override
    public final void e1(rf.e eVar, int i10, int i11) {
        if (i10 >= 0) {
            int r6 = r();
            if (this.v) {
                int i12 = r6 - 1;
                for (int i13 = i12; i13 >= 0; i13--) {
                    View q5 = q(i13);
                    if (q5.getBottom() + ((ViewGroup.MarginLayoutParams) ((q0) q5.getLayoutParams())).bottomMargin <= i10) {
                        if (q5.getHeight() + q5.getTop() <= i10) {
                        }
                    }
                    d1(eVar, i12, i13);
                    return;
                }
                return;
            }
            for (int i14 = 0; i14 < r6; i14++) {
                View q9 = q(i14);
                if (q9.getBottom() + ((ViewGroup.MarginLayoutParams) ((q0) q9.getLayoutParams())).bottomMargin <= i10) {
                    if (q9.getHeight() + q9.getTop() <= i10) {
                    }
                }
                d1(eVar, 0, i14);
                return;
            }
        }
    }

    @Override
    public final int[] r1(int i10, int i11, int[] iArr) {
        if (iArr == null || iArr.length != i10 + 1 || iArr[iArr.length - 1] != i11) {
            iArr = new int[i10 + 1];
        }
        iArr[0] = 0;
        for (int i12 = 1; i12 <= i10; i12++) {
            iArr[i12] = (int) Math.ceil((i12 / i10) * i11);
        }
        return iArr;
    }

    @Override
    public final void x1(View view, int i10, boolean z10) {
        s sVar = (s) view.getLayoutParams();
        Rect rect = sVar.f47833b;
        int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) sVar).topMargin + ((ViewGroup.MarginLayoutParams) sVar).bottomMargin;
        y1(p0.s(false, this.K[sVar.f47839f], i10, rect.left + rect.right + ((ViewGroup.MarginLayoutParams) sVar).leftMargin + ((ViewGroup.MarginLayoutParams) sVar).rightMargin, ((ViewGroup.MarginLayoutParams) sVar).width), p0.s(true, this.f47710q.k(), this.f47826l, i11, ((ViewGroup.MarginLayoutParams) sVar).height), view, z10);
    }
}
