package s4;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public abstract class t extends s {
    public final ArrayList Q;
    public boolean R;

    public t(boolean z10) {
        super(1000, z10);
        this.Q = new ArrayList(4);
        this.R = true;
    }

    public abstract boolean B1(int i10);

    public abstract boolean C1(View view);

    @Override
    public final void Z0(pf.e r22, s4.z0 r23, s4.a0 r24, s4.z r25) {
        throw new UnsupportedOperationException("Method not decompiled: s4.t.Z0(pf.e, s4.z0, s4.a0, s4.z):void");
    }

    @Override
    public final boolean e() {
        return this.R;
    }

    @Override
    public final void e1(pf.e eVar, int i10, int i11) {
        if (i10 >= 0) {
            int r10 = r();
            if (this.v) {
                int i12 = r10 - 1;
                for (int i13 = i12; i13 >= 0; i13--) {
                    View q6 = q(i13);
                    if (q6.getBottom() + ((ViewGroup.MarginLayoutParams) ((p0) q6.getLayoutParams())).bottomMargin <= i10) {
                        if (q6.getHeight() + q6.getTop() <= i10) {
                        }
                    }
                    d1(eVar, i12, i13);
                    return;
                }
                return;
            }
            for (int i14 = 0; i14 < r10; i14++) {
                View q10 = q(i14);
                if (q10.getBottom() + ((ViewGroup.MarginLayoutParams) ((p0) q10.getLayoutParams())).bottomMargin <= i10) {
                    if (q10.getHeight() + q10.getTop() <= i10) {
                    }
                }
                d1(eVar, 0, i14);
                return;
            }
        }
    }

    @Override
    public final int[] q1(int i10, int i11, int[] iArr) {
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
    public final void w1(View view, int i10, boolean z10) {
        r rVar = (r) view.getLayoutParams();
        Rect rect = rVar.f45858b;
        int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        x1(o0.s(false, this.K[rVar.f45866f], i10, rect.left + rect.right + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin, ((ViewGroup.MarginLayoutParams) rVar).width), o0.s(true, this.f45728q.k(), this.f45850l, i11, ((ViewGroup.MarginLayoutParams) rVar).height), view, z10);
    }
}
