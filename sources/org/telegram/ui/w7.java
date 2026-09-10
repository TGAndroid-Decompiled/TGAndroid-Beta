package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class w7 extends s4.h0 {
    public final int f37735c;
    public final Object d;

    public w7(Object obj, int i10) {
        this.f37735c = i10;
        this.d = obj;
    }

    @Override
    public final int h() {
        switch (this.f37735c) {
            case 0:
                return ((h8) this.d).K;
            case 1:
                return ((org.telegram.ui.Cells.t) this.d).X2.size();
            case 2:
                return ((org.telegram.ui.Components.a9) this.d).X2.size() + 1;
            case 3:
                return 1;
            case 4:
                return 1;
            default:
                return ((aq0) this.d).f31054f.size();
        }
    }

    @Override
    public long i(int i10) {
        switch (this.f37735c) {
            case 0:
                h8 h8Var = (h8) this.d;
                return ((h8Var.I - (i10 / 12)) * 100) + (h8Var.J - (i10 % 12));
            case 1:
            default:
                return super.i(i10);
            case 2:
                org.telegram.ui.Components.a9 a9Var = (org.telegram.ui.Components.a9) this.d;
                if (i10 >= a9Var.X2.size()) {
                    return 1L;
                }
                return ((org.telegram.ui.Components.z8) a9Var.X2.get(i10)).f29613a;
        }
    }

    @Override
    public int j(int i10) {
        switch (this.f37735c) {
            case 2:
                if (i10 >= ((org.telegram.ui.Components.a9) this.d).X2.size()) {
                    return 1;
                }
                return 0;
            default:
                return super.j(i10);
        }
    }

    @Override
    public final void v(s4.c1 r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w7.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        switch (this.f37735c) {
            case 0:
                return new s4.c1(new e8((h8) this.d, viewGroup.getContext()));
            case 1:
                Context context = viewGroup.getContext();
                ?? linearLayout = new LinearLayout(context);
                Paint paint = new Paint(1);
                linearLayout.f19913a = paint;
                Paint paint2 = new Paint(1);
                linearLayout.f19914b = paint2;
                linearLayout.setOrientation(1);
                linearLayout.setWillNotDraw(false);
                org.telegram.ui.Cells.q qVar = new org.telegram.ui.Cells.q(context);
                linearLayout.f19915c = qVar;
                qVar.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                linearLayout.addView(qVar, w7.a6.q(58, 58, 1));
                TextView textView = new TextView(context);
                linearLayout.d = textView;
                textView.setSingleLine();
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
                linearLayout.addView(textView, w7.a6.t(-2, -2, 1, 0, 4, 0, 0));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2, AndroidUtilities.dp(0.5f)));
                paint2.setColor(-1);
                return new s4.c1(linearLayout);
            case 2:
                org.telegram.ui.Components.a9 a9Var = (org.telegram.ui.Components.a9) this.d;
                return new s4.c1(new org.telegram.ui.Components.b9(a9Var.f21439c3, a9Var.getContext()));
            case 3:
                return new s4.c1(((org.telegram.ui.Components.xm) this.d).v);
            case 4:
                return new s4.c1(new bi.nc(this, ((org.telegram.ui.Components.ao) this.d).getContext(), 15));
            default:
                org.telegram.ui.Components.m90 m90Var = new org.telegram.ui.Components.m90(viewGroup.getContext(), null);
                m90Var.setGravity(17);
                m90Var.setTypeface(AndroidUtilities.bold());
                m90Var.setTextSize(1, 14.0f);
                m90Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                m90Var.setEllipsize(TextUtils.TruncateAt.END);
                m90Var.setSingleLine();
                m90Var.setMaxLines(1);
                m90Var.setLayoutParams(new s4.p0(-2, AndroidUtilities.dp(28.0f)));
                w7.c6.b(m90Var, 0.075f, 1.4f);
                return new s4.c1(m90Var);
        }
    }

    private final void D(s4.c1 c1Var, int i10) {
    }

    private final void E(s4.c1 c1Var, int i10) {
    }
}
