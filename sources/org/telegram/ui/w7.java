package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class w7 extends s4.h0 {
    public final int f38898c;
    public final Object d;

    public w7(Object obj, int i10) {
        this.f38898c = i10;
        this.d = obj;
    }

    @Override
    public final int h() {
        switch (this.f38898c) {
            case 0:
                return ((h8) this.d).K;
            case 1:
                return ((org.telegram.ui.Cells.t) this.d).X2.size();
            case 2:
                return ((org.telegram.ui.Components.b9) this.d).X2.size() + 1;
            case 3:
                return 1;
            case 4:
                return 1;
            default:
                return ((sp0) this.d).f37826f.size();
        }
    }

    @Override
    public long i(int i10) {
        switch (this.f38898c) {
            case 0:
                h8 h8Var = (h8) this.d;
                return ((h8Var.I - (i10 / 12)) * 100) + (h8Var.J - (i10 % 12));
            case 1:
            default:
                return super.i(i10);
            case 2:
                org.telegram.ui.Components.b9 b9Var = (org.telegram.ui.Components.b9) this.d;
                if (i10 >= b9Var.X2.size()) {
                    return 1L;
                }
                return ((org.telegram.ui.Components.a9) b9Var.X2.get(i10)).f22617a;
        }
    }

    @Override
    public int j(int i10) {
        switch (this.f38898c) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w7.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        switch (this.f38898c) {
            case 0:
                return new s4.c1(new e8((h8) this.d, viewGroup.getContext()));
            case 1:
                Context context = viewGroup.getContext();
                ?? linearLayout = new LinearLayout(context);
                Paint paint = new Paint(1);
                linearLayout.f20880a = paint;
                Paint paint2 = new Paint(1);
                linearLayout.f20881b = paint2;
                linearLayout.setOrientation(1);
                linearLayout.setWillNotDraw(false);
                org.telegram.ui.Cells.q qVar = new org.telegram.ui.Cells.q(context);
                linearLayout.f20882c = qVar;
                qVar.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                linearLayout.addView(qVar, w7.y5.q(58, 58, 1));
                TextView textView = new TextView(context);
                linearLayout.d = textView;
                textView.setSingleLine();
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G6, false));
                linearLayout.addView(textView, w7.y5.t(-2, -2, 1, 0, 4, 0, 0));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2, AndroidUtilities.dp(0.5f)));
                paint2.setColor(-1);
                return new s4.c1(linearLayout);
            case 2:
                org.telegram.ui.Components.b9 b9Var = (org.telegram.ui.Components.b9) this.d;
                return new s4.c1(new org.telegram.ui.Components.c9(b9Var.f22922c3, b9Var.getContext()));
            case 3:
                return new s4.c1(((org.telegram.ui.Components.rm) this.d).v);
            case 4:
                return new s4.c1(new ci.bb(this, ((org.telegram.ui.Components.wn) this.d).getContext(), 15));
            default:
                org.telegram.ui.Components.n90 n90Var = new org.telegram.ui.Components.n90(viewGroup.getContext(), null);
                n90Var.setGravity(17);
                n90Var.setTypeface(AndroidUtilities.bold());
                n90Var.setTextSize(1, 14.0f);
                n90Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                n90Var.setEllipsize(TextUtils.TruncateAt.END);
                n90Var.setSingleLine();
                n90Var.setMaxLines(1);
                n90Var.setLayoutParams(new s4.p0(-2, AndroidUtilities.dp(28.0f)));
                w7.a6.b(n90Var, 0.075f, 1.4f);
                return new s4.c1(n90Var);
        }
    }

    private final void D(s4.c1 c1Var, int i10) {
    }

    private final void E(s4.c1 c1Var, int i10) {
    }
}
