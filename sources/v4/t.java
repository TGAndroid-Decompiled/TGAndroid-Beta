package v4;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public abstract class t extends s {
    public final ArrayList Q;
    public boolean R;

    public t(boolean z9) {
        super(1000, z9);
        this.Q = new ArrayList(4);
        this.R = true;
    }

    public abstract boolean B1(int i7);

    public abstract boolean C1(View view);

    @Override
    public final void Z0(v4.v0 r22, v4.a1 r23, v4.z r24, n2.j r25) {
        throw new UnsupportedOperationException("Method not decompiled: v4.t.Z0(v4.v0, v4.a1, v4.z, n2.j):void");
    }

    @Override
    public final boolean e() {
        return this.R;
    }

    @Override
    public final void e1(v0 v0Var, int i7, int i10) {
        if (i7 >= 0) {
            int r10 = r();
            if (this.v) {
                int i11 = r10 - 1;
                for (int i12 = i11; i12 >= 0; i12--) {
                    View q10 = q(i12);
                    if (q10.getBottom() + ((ViewGroup.MarginLayoutParams) ((o0) q10.getLayoutParams())).bottomMargin <= i7) {
                        if (q10.getHeight() + q10.getTop() <= i7) {
                        }
                    }
                    d1(v0Var, i11, i12);
                    return;
                }
                return;
            }
            for (int i13 = 0; i13 < r10; i13++) {
                View q11 = q(i13);
                if (q11.getBottom() + ((ViewGroup.MarginLayoutParams) ((o0) q11.getLayoutParams())).bottomMargin <= i7) {
                    if (q11.getHeight() + q11.getTop() <= i7) {
                    }
                }
                d1(v0Var, 0, i13);
                return;
            }
        }
    }

    @Override
    public final int[] q1(int i7, int i10, int[] iArr) {
        if (iArr == null || iArr.length != i7 + 1 || iArr[iArr.length - 1] != i10) {
            iArr = new int[i7 + 1];
        }
        iArr[0] = 0;
        for (int i11 = 1; i11 <= i7; i11++) {
            iArr[i11] = (int) Math.ceil((i11 / i7) * i10);
        }
        return iArr;
    }

    @Override
    public final void w1(int i7, View view, boolean z9) {
        r rVar = (r) view.getLayoutParams();
        Rect rect = rVar.f57052b;
        int i10 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        x1(n0.s(false, this.K[rVar.f57064f], i7, rect.left + rect.right + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin, ((ViewGroup.MarginLayoutParams) rVar).width), n0.s(true, this.f56922q.k(), this.f57047l, i10, ((ViewGroup.MarginLayoutParams) rVar).height), view, z9);
    }
}
