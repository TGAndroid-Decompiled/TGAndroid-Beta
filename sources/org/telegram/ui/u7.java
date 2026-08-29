package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class u7 extends f2.p0 {
    public final int f43192c;
    public final Object d;

    public u7(Object obj, int i10) {
        this.f43192c = i10;
        this.d = obj;
    }

    @Override
    public final int h() {
        switch (this.f43192c) {
            case 0:
                return ((f8) this.d).G;
            case 1:
                return ((org.telegram.ui.Cells.t) this.d).T2.size();
            case 2:
                return ((org.telegram.ui.Components.y8) this.d).T2.size() + 1;
            case 3:
                return 1;
            default:
                return 1;
        }
    }

    @Override
    public long i(int i10) {
        switch (this.f43192c) {
            case 0:
                f8 f8Var = (f8) this.d;
                return ((f8Var.E - (i10 / 12)) * 100) + (f8Var.F - (i10 % 12));
            case 1:
            default:
                return super.i(i10);
            case 2:
                org.telegram.ui.Components.y8 y8Var = (org.telegram.ui.Components.y8) this.d;
                if (i10 >= y8Var.T2.size()) {
                    return 1L;
                }
                return ((org.telegram.ui.Components.x8) y8Var.T2.get(i10)).f34648a;
        }
    }

    @Override
    public int j(int i10) {
        switch (this.f43192c) {
            case 2:
                if (i10 >= ((org.telegram.ui.Components.y8) this.d).T2.size()) {
                    return 1;
                }
                return 0;
            default:
                return super.j(i10);
        }
    }

    @Override
    public final void v(f2.n1 r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u7.v(f2.n1, int):void");
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        switch (this.f43192c) {
            case 0:
                return new f2.n1(new c8((f8) this.d, viewGroup.getContext()));
            case 1:
                Context context = viewGroup.getContext();
                ?? linearLayout = new LinearLayout(context);
                Paint paint = new Paint(1);
                linearLayout.f25259a = paint;
                Paint paint2 = new Paint(1);
                linearLayout.f25260b = paint2;
                linearLayout.setOrientation(1);
                linearLayout.setWillNotDraw(false);
                org.telegram.ui.Cells.q qVar = new org.telegram.ui.Cells.q(context);
                linearLayout.f25261c = qVar;
                qVar.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                linearLayout.addView(qVar, i7.f6.q(58, 58, 1));
                TextView textView = new TextView(context);
                linearLayout.d = textView;
                textView.setSingleLine();
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
                linearLayout.addView(textView, i7.f6.t(-2, -2, 1, 0, 4, 0, 0));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2, AndroidUtilities.dp(0.5f)));
                paint2.setColor(-1);
                return new f2.n1(linearLayout);
            case 2:
                org.telegram.ui.Components.y8 y8Var = (org.telegram.ui.Components.y8) this.d;
                return new f2.n1(new org.telegram.ui.Components.z8(y8Var.Y2, y8Var.getContext()));
            case 3:
                return new f2.n1(((org.telegram.ui.Components.lm) this.d).v);
            default:
                return new f2.n1(new cg.h0(this, ((org.telegram.ui.Components.pn) this.d).getContext(), 12));
        }
    }

    private final void D(f2.n1 n1Var, int i10) {
    }

    private final void E(f2.n1 n1Var, int i10) {
    }
}
