package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class z7 extends s4.g0 {
    public final int f44032c;
    public final Object d;

    public z7(Object obj, int i10) {
        this.f44032c = i10;
        this.d = obj;
    }

    @Override
    public final int h() {
        switch (this.f44032c) {
            case 0:
                return ((k8) this.d).K;
            case 1:
                return ((org.telegram.ui.Cells.t) this.d).Y2.size();
            case 2:
                return ((org.telegram.ui.Components.z8) this.d).Y2.size() + 1;
            case 3:
                return 1;
            case 4:
                return 1;
            default:
                return ((jp0) this.d).f38604f.size();
        }
    }

    @Override
    public long i(int i10) {
        switch (this.f44032c) {
            case 0:
                k8 k8Var = (k8) this.d;
                return ((k8Var.I - (i10 / 12)) * 100) + (k8Var.J - (i10 % 12));
            case 1:
            default:
                return super.i(i10);
            case 2:
                org.telegram.ui.Components.z8 z8Var = (org.telegram.ui.Components.z8) this.d;
                if (i10 >= z8Var.Y2.size()) {
                    return 1L;
                }
                return ((org.telegram.ui.Components.y8) z8Var.Y2.get(i10)).f32840a;
        }
    }

    @Override
    public int j(int i10) {
        switch (this.f44032c) {
            case 2:
                if (i10 >= ((org.telegram.ui.Components.z8) this.d).Y2.size()) {
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
        switch (this.f44032c) {
            case 0:
                return new s4.b1(new h8((k8) this.d, viewGroup.getContext()));
            case 1:
                Context context = viewGroup.getContext();
                ?? linearLayout = new LinearLayout(context);
                Paint paint = new Paint(1);
                linearLayout.f23125a = paint;
                Paint paint2 = new Paint(1);
                linearLayout.f23126b = paint2;
                linearLayout.setOrientation(1);
                linearLayout.setWillNotDraw(false);
                org.telegram.ui.Cells.q qVar = new org.telegram.ui.Cells.q(context);
                linearLayout.f23127c = qVar;
                qVar.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                linearLayout.addView(qVar, w7.z5.q(58, 58, 1));
                TextView textView = new TextView(context);
                linearLayout.d = textView;
                textView.setSingleLine();
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
                linearLayout.addView(textView, w7.z5.t(-2, -2, 1, 0, 4, 0, 0));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2, AndroidUtilities.dp(0.5f)));
                paint2.setColor(-1);
                return new s4.b1(linearLayout);
            case 2:
                org.telegram.ui.Components.z8 z8Var = (org.telegram.ui.Components.z8) this.d;
                return new s4.b1(new org.telegram.ui.Components.a9(z8Var.f33172d3, z8Var.getContext()));
            case 3:
                return new s4.b1(((org.telegram.ui.Components.zm) this.d).v);
            case 4:
                return new s4.b1(new ai.jc(this, ((org.telegram.ui.Components.eo) this.d).getContext(), 15));
            default:
                org.telegram.ui.Components.w90 w90Var = new org.telegram.ui.Components.w90(viewGroup.getContext(), null);
                w90Var.setGravity(17);
                w90Var.setTypeface(AndroidUtilities.bold());
                w90Var.setTextSize(1, 14.0f);
                w90Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                w90Var.setEllipsize(TextUtils.TruncateAt.END);
                w90Var.setSingleLine();
                w90Var.setMaxLines(1);
                w90Var.setLayoutParams(new s4.o0(-2, AndroidUtilities.dp(28.0f)));
                w7.b6.b(w90Var, 0.075f, 1.4f);
                return new s4.b1(w90Var);
        }
    }

    private final void D(s4.b1 b1Var, int i10) {
    }

    private final void E(s4.b1 b1Var, int i10) {
    }
}
