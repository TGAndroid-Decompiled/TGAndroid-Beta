package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class x7 extends s4.h0 {
    public final int f39369c;
    public final Object d;

    public x7(Object obj, int i10) {
        this.f39369c = i10;
        this.d = obj;
    }

    @Override
    public final int h() {
        switch (this.f39369c) {
            case 0:
                return ((i8) this.d).K;
            case 1:
                return ((org.telegram.ui.Cells.t) this.d).X2.size();
            case 2:
                return ((org.telegram.ui.Components.b9) this.d).X2.size() + 1;
            case 3:
                return 1;
            case 4:
                return 1;
            default:
                return ((bq0) this.d).f32438f.size();
        }
    }

    @Override
    public long i(int i10) {
        switch (this.f39369c) {
            case 0:
                i8 i8Var = (i8) this.d;
                return ((i8Var.I - (i10 / 12)) * 100) + (i8Var.J - (i10 % 12));
            case 1:
            default:
                return super.i(i10);
            case 2:
                org.telegram.ui.Components.b9 b9Var = (org.telegram.ui.Components.b9) this.d;
                if (i10 >= b9Var.X2.size()) {
                    return 1L;
                }
                return ((org.telegram.ui.Components.a9) b9Var.X2.get(i10)).f22564a;
        }
    }

    @Override
    public int j(int i10) {
        switch (this.f39369c) {
            case 2:
                if (i10 >= ((org.telegram.ui.Components.b9) this.d).X2.size()) {
                    return 1;
                }
                return 0;
            default:
                return super.j(i10);
        }
    }

    @Override
    public final void v(s4.c1 r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x7.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        switch (this.f39369c) {
            case 0:
                return new s4.c1(new f8((i8) this.d, viewGroup.getContext()));
            case 1:
                Context context = viewGroup.getContext();
                ?? linearLayout = new LinearLayout(context);
                Paint paint = new Paint(1);
                linearLayout.f20858a = paint;
                Paint paint2 = new Paint(1);
                linearLayout.f20859b = paint2;
                linearLayout.setOrientation(1);
                linearLayout.setWillNotDraw(false);
                org.telegram.ui.Cells.q qVar = new org.telegram.ui.Cells.q(context);
                linearLayout.f20860c = qVar;
                qVar.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                linearLayout.addView(qVar, w7.y5.q(58, 58, 1));
                TextView textView = new TextView(context);
                linearLayout.d = textView;
                textView.setSingleLine();
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
                linearLayout.addView(textView, w7.y5.t(-2, -2, 1, 0, 4, 0, 0));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2, AndroidUtilities.dp(0.5f)));
                paint2.setColor(-1);
                return new s4.c1(linearLayout);
            case 2:
                org.telegram.ui.Components.b9 b9Var = (org.telegram.ui.Components.b9) this.d;
                return new s4.c1(new org.telegram.ui.Components.c9(b9Var.f22897c3, b9Var.getContext()));
            case 3:
                return new s4.c1(((org.telegram.ui.Components.qm) this.d).v);
            case 4:
                return new s4.c1(new ci.eb(this, ((org.telegram.ui.Components.vn) this.d).getContext(), 15));
            default:
                org.telegram.ui.Components.l90 l90Var = new org.telegram.ui.Components.l90(viewGroup.getContext(), null);
                l90Var.setGravity(17);
                l90Var.setTypeface(AndroidUtilities.bold());
                l90Var.setTextSize(1, 14.0f);
                l90Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                l90Var.setEllipsize(TextUtils.TruncateAt.END);
                l90Var.setSingleLine();
                l90Var.setMaxLines(1);
                l90Var.setLayoutParams(new s4.p0(-2, AndroidUtilities.dp(28.0f)));
                w7.a6.b(l90Var, 0.075f, 1.4f);
                return new s4.c1(l90Var);
        }
    }

    private final void D(s4.c1 c1Var, int i10) {
    }

    private final void E(s4.c1 c1Var, int i10) {
    }
}
