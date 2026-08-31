package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class y7 extends f2.p0 {
    public final int f43570c;
    public final Object d;

    public y7(Object obj, int i10) {
        this.f43570c = i10;
        this.d = obj;
    }

    @Override
    public final int h() {
        switch (this.f43570c) {
            case 0:
                return ((j8) this.d).H;
            case 1:
                return ((org.telegram.ui.Cells.t) this.d).U2.size();
            case 2:
                return ((org.telegram.ui.Components.t8) this.d).U2.size() + 1;
            case 3:
                return 1;
            default:
                return 1;
        }
    }

    @Override
    public long i(int i10) {
        switch (this.f43570c) {
            case 0:
                j8 j8Var = (j8) this.d;
                return ((j8Var.F - (i10 / 12)) * 100) + (j8Var.G - (i10 % 12));
            case 1:
            default:
                return super.i(i10);
            case 2:
                org.telegram.ui.Components.t8 t8Var = (org.telegram.ui.Components.t8) this.d;
                if (i10 >= t8Var.U2.size()) {
                    return 1L;
                }
                return ((org.telegram.ui.Components.s8) t8Var.U2.get(i10)).f31004a;
        }
    }

    @Override
    public int j(int i10) {
        switch (this.f43570c) {
            case 2:
                if (i10 >= ((org.telegram.ui.Components.t8) this.d).U2.size()) {
                    return 1;
                }
                return 0;
            default:
                return super.j(i10);
        }
    }

    @Override
    public final void v(f2.m1 r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y7.v(f2.m1, int):void");
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        switch (this.f43570c) {
            case 0:
                return new f2.m1(new g8((j8) this.d, viewGroup.getContext()));
            case 1:
                Context context = viewGroup.getContext();
                ?? linearLayout = new LinearLayout(context);
                Paint paint = new Paint(1);
                linearLayout.f23605a = paint;
                Paint paint2 = new Paint(1);
                linearLayout.f23606b = paint2;
                linearLayout.setOrientation(1);
                linearLayout.setWillNotDraw(false);
                org.telegram.ui.Cells.q qVar = new org.telegram.ui.Cells.q(context);
                linearLayout.f23607c = qVar;
                qVar.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                linearLayout.addView(qVar, k7.c6.q(58, 58, 1));
                TextView textView = new TextView(context);
                linearLayout.d = textView;
                textView.setSingleLine();
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false));
                linearLayout.addView(textView, k7.c6.t(-2, -2, 1, 0, 4, 0, 0));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2, AndroidUtilities.dp(0.5f)));
                paint2.setColor(-1);
                return new f2.m1(linearLayout);
            case 2:
                org.telegram.ui.Components.t8 t8Var = (org.telegram.ui.Components.t8) this.d;
                return new f2.m1(new org.telegram.ui.Components.u8(t8Var.Z2, t8Var.getContext()));
            case 3:
                return new f2.m1(((org.telegram.ui.Components.qm) this.d).v);
            default:
                return new f2.m1(new fg.h0(this, ((org.telegram.ui.Components.tn) this.d).getContext(), 10));
        }
    }

    private final void D(f2.m1 m1Var, int i10) {
    }

    private final void E(f2.m1 m1Var, int i10) {
    }
}
