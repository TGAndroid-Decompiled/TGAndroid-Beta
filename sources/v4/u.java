package v4;

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

    public abstract boolean B1(int i7);

    public abstract boolean C1(View view);

    @Override
    public final void Z0(v4.x0 r22, v4.c1 r23, v4.a0 r24, n2.j r25) {
        throw new UnsupportedOperationException("Method not decompiled: v4.u.Z0(v4.x0, v4.c1, v4.a0, n2.j):void");
    }

    @Override
    public final boolean e() {
        return this.R;
    }

    @Override
    public final void e1(x0 x0Var, int i7, int i10) {
        if (i7 >= 0) {
            int r10 = r();
            if (this.v) {
                int i11 = r10 - 1;
                for (int i12 = i11; i12 >= 0; i12--) {
                    View q10 = q(i12);
                    if (q10.getBottom() + ((ViewGroup.MarginLayoutParams) ((q0) q10.getLayoutParams())).bottomMargin <= i7) {
                        if (q10.getHeight() + q10.getTop() <= i7) {
                        }
                    }
                    d1(x0Var, i11, i12);
                    return;
                }
                return;
            }
            for (int i13 = 0; i13 < r10; i13++) {
                View q11 = q(i13);
                if (q11.getBottom() + ((ViewGroup.MarginLayoutParams) ((q0) q11.getLayoutParams())).bottomMargin <= i7) {
                    if (q11.getHeight() + q11.getTop() <= i7) {
                    }
                }
                d1(x0Var, 0, i13);
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
    public final void w1(int i7, View view, boolean z10) {
        s sVar = (s) view.getLayoutParams();
        Rect rect = sVar.f59223b;
        int i10 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) sVar).topMargin + ((ViewGroup.MarginLayoutParams) sVar).bottomMargin;
        x1(p0.s(false, this.K[sVar.f59231f], i7, rect.left + rect.right + ((ViewGroup.MarginLayoutParams) sVar).leftMargin + ((ViewGroup.MarginLayoutParams) sVar).rightMargin, ((ViewGroup.MarginLayoutParams) sVar).width), p0.s(true, this.f59076q.k(), this.f59215l, i10, ((ViewGroup.MarginLayoutParams) sVar).height), view, z10);
    }
}
