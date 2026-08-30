package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class y7 extends f2.o0 {
    public final int f40439c;
    public final Object d;

    public y7(Object obj, int i10) {
        this.f40439c = i10;
        this.d = obj;
    }

    @Override
    public final int h() {
        switch (this.f40439c) {
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
        switch (this.f40439c) {
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
                return ((org.telegram.ui.Components.s8) t8Var.U2.get(i10)).f28665a;
        }
    }

    @Override
    public int j(int i10) {
        switch (this.f40439c) {
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
    public final void v(f2.l1 r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y7.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        switch (this.f40439c) {
            case 0:
                return new f2.l1(new g8((j8) this.d, viewGroup.getContext()));
            case 1:
                Context context = viewGroup.getContext();
                ?? linearLayout = new LinearLayout(context);
                Paint paint = new Paint(1);
                linearLayout.f21811a = paint;
                Paint paint2 = new Paint(1);
                linearLayout.f21812b = paint2;
                linearLayout.setOrientation(1);
                linearLayout.setWillNotDraw(false);
                org.telegram.ui.Cells.q qVar = new org.telegram.ui.Cells.q(context);
                linearLayout.f21813c = qVar;
                qVar.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                linearLayout.addView(qVar, k7.b6.q(58, 58, 1));
                TextView textView = new TextView(context);
                linearLayout.d = textView;
                textView.setSingleLine();
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
                linearLayout.addView(textView, k7.b6.t(-2, -2, 1, 0, 4, 0, 0));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2, AndroidUtilities.dp(0.5f)));
                paint2.setColor(-1);
                return new f2.l1(linearLayout);
            case 2:
                org.telegram.ui.Components.t8 t8Var = (org.telegram.ui.Components.t8) this.d;
                return new f2.l1(new org.telegram.ui.Components.u8(t8Var.Z2, t8Var.getContext()));
            case 3:
                return new f2.l1(((org.telegram.ui.Components.om) this.d).v);
            default:
                return new f2.l1(new eg.h0(this, ((org.telegram.ui.Components.rn) this.d).getContext(), 10));
        }
    }

    private final void D(f2.l1 l1Var, int i10) {
    }

    private final void E(f2.l1 l1Var, int i10) {
    }
}
