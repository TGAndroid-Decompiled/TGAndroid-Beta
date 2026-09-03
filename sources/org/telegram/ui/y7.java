package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class y7 extends f2.p0 {
    public final int f43566c;
    public final Object d;

    public y7(Object obj, int i10) {
        this.f43566c = i10;
        this.d = obj;
    }

    @Override
    public final int h() {
        switch (this.f43566c) {
            case 0:
                return ((j8) this.d).H;
            case 1:
                return ((org.telegram.ui.Cells.t) this.d).U2.size();
            case 2:
                return ((org.telegram.ui.Components.t8) this.d).U2.size() + 1;
            case 3:
                return 1;
            case 4:
                return 1;
            default:
                return ((mp0) this.d).f39021f.size();
        }
    }

    @Override
    public long i(int i10) {
        switch (this.f43566c) {
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
                return ((org.telegram.ui.Components.s8) t8Var.U2.get(i10)).f31000a;
        }
    }

    @Override
    public int j(int i10) {
        switch (this.f43566c) {
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
        switch (this.f43566c) {
            case 0:
                return new f2.m1(new g8((j8) this.d, viewGroup.getContext()));
            case 1:
                Context context = viewGroup.getContext();
                ?? linearLayout = new LinearLayout(context);
                Paint paint = new Paint(1);
                linearLayout.f23607a = paint;
                Paint paint2 = new Paint(1);
                linearLayout.f23608b = paint2;
                linearLayout.setOrientation(1);
                linearLayout.setWillNotDraw(false);
                org.telegram.ui.Cells.q qVar = new org.telegram.ui.Cells.q(context);
                linearLayout.f23609c = qVar;
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
                return new f2.m1(((org.telegram.ui.Components.pm) this.d).v);
            case 4:
                return new f2.m1(new fg.h0(this, ((org.telegram.ui.Components.sn) this.d).getContext(), 10));
            default:
                org.telegram.ui.Components.g90 g90Var = new org.telegram.ui.Components.g90(viewGroup.getContext(), null);
                g90Var.setGravity(17);
                g90Var.setTypeface(AndroidUtilities.bold());
                g90Var.setTextSize(1, 14.0f);
                g90Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                g90Var.setEllipsize(TextUtils.TruncateAt.END);
                g90Var.setSingleLine();
                g90Var.setMaxLines(1);
                g90Var.setLayoutParams(new f2.x0(-2, AndroidUtilities.dp(28.0f)));
                k7.e6.b(g90Var, 0.075f, 1.4f);
                return new f2.m1(g90Var);
        }
    }

    private final void D(f2.m1 m1Var, int i10) {
    }

    private final void E(f2.m1 m1Var, int i10) {
    }
}
