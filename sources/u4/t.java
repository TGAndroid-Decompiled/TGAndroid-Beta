package u4;

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

    public abstract boolean B1(int i3);

    public abstract boolean C1(View view);

    @Override
    public final void Z0(tf.e r22, u4.a1 r23, u4.z r24, m2.j r25) {
        throw new UnsupportedOperationException("Method not decompiled: u4.t.Z0(tf.e, u4.a1, u4.z, m2.j):void");
    }

    @Override
    public final boolean e() {
        return this.R;
    }

    @Override
    public final void e1(tf.e eVar, int i3, int i10) {
        if (i3 >= 0) {
            int r5 = r();
            if (this.v) {
                int i11 = r5 - 1;
                for (int i12 = i11; i12 >= 0; i12--) {
                    View q10 = q(i12);
                    if (q10.getBottom() + ((ViewGroup.MarginLayoutParams) ((p0) q10.getLayoutParams())).bottomMargin <= i3) {
                        if (q10.getHeight() + q10.getTop() <= i3) {
                        }
                    }
                    d1(eVar, i11, i12);
                    return;
                }
                return;
            }
            for (int i13 = 0; i13 < r5; i13++) {
                View q11 = q(i13);
                if (q11.getBottom() + ((ViewGroup.MarginLayoutParams) ((p0) q11.getLayoutParams())).bottomMargin <= i3) {
                    if (q11.getHeight() + q11.getTop() <= i3) {
                    }
                }
                d1(eVar, 0, i13);
                return;
            }
        }
    }

    @Override
    public final int[] q1(int i3, int i10, int[] iArr) {
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i10) {
            iArr = new int[i3 + 1];
        }
        iArr[0] = 0;
        for (int i11 = 1; i11 <= i3; i11++) {
            iArr[i11] = (int) Math.ceil((i11 / i3) * i10);
        }
        return iArr;
    }

    @Override
    public final void w1(int i3, View view, boolean z10) {
        r rVar = (r) view.getLayoutParams();
        Rect rect = rVar.f55646b;
        int i10 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        x1(o0.s(false, this.K[rVar.f55654f], i3, rect.left + rect.right + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin, ((ViewGroup.MarginLayoutParams) rVar).width), o0.s(true, this.f55511q.k(), this.f55638l, i10, ((ViewGroup.MarginLayoutParams) rVar).height), view, z10);
    }
}
