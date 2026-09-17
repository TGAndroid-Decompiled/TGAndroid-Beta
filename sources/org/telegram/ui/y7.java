package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class y7 extends s4.h0 {
    public final int f39799c;
    public final Object d;

    public y7(Object obj, int i10) {
        this.f39799c = i10;
        this.d = obj;
    }

    @Override
    public final int h() {
        switch (this.f39799c) {
            case 0:
                return ((j8) this.d).K;
            case 1:
                return ((org.telegram.ui.Cells.t) this.d).X2.size();
            case 2:
                return ((org.telegram.ui.Components.z8) this.d).X2.size() + 1;
            case 3:
                return 1;
            case 4:
                return 1;
            default:
                return ((bq0) this.d).f32552f.size();
        }
    }

    @Override
    public long i(int i10) {
        switch (this.f39799c) {
            case 0:
                j8 j8Var = (j8) this.d;
                return ((j8Var.I - (i10 / 12)) * 100) + (j8Var.J - (i10 % 12));
            case 1:
            default:
                return super.i(i10);
            case 2:
                org.telegram.ui.Components.z8 z8Var = (org.telegram.ui.Components.z8) this.d;
                if (i10 >= z8Var.X2.size()) {
                    return 1L;
                }
                return ((org.telegram.ui.Components.y8) z8Var.X2.get(i10)).f30138a;
        }
    }

    @Override
    public int j(int i10) {
        switch (this.f39799c) {
            case 2:
                if (i10 >= ((org.telegram.ui.Components.z8) this.d).X2.size()) {
                    return 1;
                }
                return 0;
            default:
                return super.j(i10);
        }
    }

    @Override
    public final void v(s4.c1 r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y7.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        switch (this.f39799c) {
            case 0:
                return new s4.c1(new g8((j8) this.d, viewGroup.getContext()));
            case 1:
                Context context = viewGroup.getContext();
                ?? linearLayout = new LinearLayout(context);
                Paint paint = new Paint(1);
                linearLayout.f20832a = paint;
                Paint paint2 = new Paint(1);
                linearLayout.f20833b = paint2;
                linearLayout.setOrientation(1);
                linearLayout.setWillNotDraw(false);
                org.telegram.ui.Cells.q qVar = new org.telegram.ui.Cells.q(context);
                linearLayout.f20834c = qVar;
                qVar.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                linearLayout.addView(qVar, w7.x5.q(58, 58, 1));
                TextView textView = new TextView(context);
                linearLayout.d = textView;
                textView.setSingleLine();
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
                linearLayout.addView(textView, w7.x5.t(-2, -2, 1, 0, 4, 0, 0));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2, AndroidUtilities.dp(0.5f)));
                paint2.setColor(-1);
                return new s4.c1(linearLayout);
            case 2:
                org.telegram.ui.Components.z8 z8Var = (org.telegram.ui.Components.z8) this.d;
                return new s4.c1(new org.telegram.ui.Components.a9(z8Var.f30412c3, z8Var.getContext()));
            case 3:
                return new s4.c1(((org.telegram.ui.Components.qm) this.d).v);
            case 4:
                return new s4.c1(new ci.eb(this, ((org.telegram.ui.Components.vn) this.d).getContext(), 15));
            default:
                org.telegram.ui.Components.c90 c90Var = new org.telegram.ui.Components.c90(viewGroup.getContext(), null);
                c90Var.setGravity(17);
                c90Var.setTypeface(AndroidUtilities.bold());
                c90Var.setTextSize(1, 14.0f);
                c90Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                c90Var.setEllipsize(TextUtils.TruncateAt.END);
                c90Var.setSingleLine();
                c90Var.setMaxLines(1);
                c90Var.setLayoutParams(new s4.p0(-2, AndroidUtilities.dp(28.0f)));
                w7.z5.b(c90Var, 0.075f, 1.4f);
                return new s4.c1(c90Var);
        }
    }

    private final void D(s4.c1 c1Var, int i10) {
    }

    private final void E(s4.c1 c1Var, int i10) {
    }
}
