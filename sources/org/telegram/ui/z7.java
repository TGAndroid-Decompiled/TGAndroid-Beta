package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class z7 extends s4.g0 {
    public final int f43652c;
    public final Object d;

    public z7(Object obj, int i10) {
        this.f43652c = i10;
        this.d = obj;
    }

    @Override
    public final int h() {
        switch (this.f43652c) {
            case 0:
                return ((k8) this.d).K;
            case 1:
                return ((org.telegram.ui.Cells.t) this.d).V2.size();
            case 2:
                return ((org.telegram.ui.Components.b9) this.d).V2.size() + 1;
            case 3:
                return 1;
            case 4:
                return 1;
            default:
                return ((hp0) this.d).f37726f.size();
        }
    }

    @Override
    public long i(int i10) {
        switch (this.f43652c) {
            case 0:
                k8 k8Var = (k8) this.d;
                return ((k8Var.I - (i10 / 12)) * 100) + (k8Var.J - (i10 % 12));
            case 1:
            default:
                return super.i(i10);
            case 2:
                org.telegram.ui.Components.b9 b9Var = (org.telegram.ui.Components.b9) this.d;
                if (i10 >= b9Var.V2.size()) {
                    return 1L;
                }
                return ((org.telegram.ui.Components.a9) b9Var.V2.get(i10)).f24517a;
        }
    }

    @Override
    public int j(int i10) {
        switch (this.f43652c) {
            case 2:
                if (i10 >= ((org.telegram.ui.Components.b9) this.d).V2.size()) {
                    return 1;
                }
                return 0;
            default:
                return super.j(i10);
        }
    }

    @Override
    public final void v(s4.b1 r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z7.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        switch (this.f43652c) {
            case 0:
                return new s4.b1(new h8((k8) this.d, viewGroup.getContext()));
            case 1:
                Context context = viewGroup.getContext();
                ?? linearLayout = new LinearLayout(context);
                Paint paint = new Paint(1);
                linearLayout.f22962a = paint;
                Paint paint2 = new Paint(1);
                linearLayout.f22963b = paint2;
                linearLayout.setOrientation(1);
                linearLayout.setWillNotDraw(false);
                org.telegram.ui.Cells.q qVar = new org.telegram.ui.Cells.q(context);
                linearLayout.f22964c = qVar;
                qVar.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                linearLayout.addView(qVar, w7.z5.q(58, 58, 1));
                TextView textView = new TextView(context);
                linearLayout.d = textView;
                textView.setSingleLine();
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
                linearLayout.addView(textView, w7.z5.t(-2, -2, 1, 0, 4, 0, 0));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2, AndroidUtilities.dp(0.5f)));
                paint2.setColor(-1);
                return new s4.b1(linearLayout);
            case 2:
                org.telegram.ui.Components.b9 b9Var = (org.telegram.ui.Components.b9) this.d;
                return new s4.b1(new org.telegram.ui.Components.c9(b9Var.f24853a3, b9Var.getContext()));
            case 3:
                return new s4.b1(((org.telegram.ui.Components.bn) this.d).v);
            case 4:
                return new s4.b1(new ai.ic(this, ((org.telegram.ui.Components.go) this.d).getContext(), 16));
            default:
                org.telegram.ui.Components.x90 x90Var = new org.telegram.ui.Components.x90(viewGroup.getContext(), null);
                x90Var.setGravity(17);
                x90Var.setTypeface(AndroidUtilities.bold());
                x90Var.setTextSize(1, 14.0f);
                x90Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                x90Var.setEllipsize(TextUtils.TruncateAt.END);
                x90Var.setSingleLine();
                x90Var.setMaxLines(1);
                x90Var.setLayoutParams(new s4.o0(-2, AndroidUtilities.dp(28.0f)));
                w7.b6.b(x90Var, 0.075f, 1.4f);
                return new s4.b1(x90Var);
        }
    }

    private final void D(s4.b1 b1Var, int i10) {
    }

    private final void E(s4.b1 b1Var, int i10) {
    }
}
