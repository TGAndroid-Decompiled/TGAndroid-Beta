package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class z7 extends s4.h0 {
    public final int f43710c;
    public final Object d;

    public z7(Object obj, int i10) {
        this.f43710c = i10;
        this.d = obj;
    }

    @Override
    public final int h() {
        switch (this.f43710c) {
            case 0:
                return ((k8) this.d).K;
            case 1:
                return ((org.telegram.ui.Cells.t) this.d).f22926e3.size();
            case 2:
                return ((org.telegram.ui.Components.b9) this.d).f24862e3.size() + 1;
            case 3:
                return 1;
            case 4:
                return 1;
            default:
                return ((vp0) this.d).f41793f.size();
        }
    }

    @Override
    public long i(int i10) {
        switch (this.f43710c) {
            case 0:
                k8 k8Var = (k8) this.d;
                return ((k8Var.I - (i10 / 12)) * 100) + (k8Var.J - (i10 % 12));
            case 1:
            default:
                return super.i(i10);
            case 2:
                org.telegram.ui.Components.b9 b9Var = (org.telegram.ui.Components.b9) this.d;
                if (i10 >= b9Var.f24862e3.size()) {
                    return 1L;
                }
                return ((org.telegram.ui.Components.a9) b9Var.f24862e3.get(i10)).f24479a;
        }
    }

    @Override
    public int j(int i10) {
        switch (this.f43710c) {
            case 2:
                if (i10 >= ((org.telegram.ui.Components.b9) this.d).f24862e3.size()) {
                    return 1;
                }
                return 0;
            default:
                return super.j(i10);
        }
    }

    @Override
    public final void v(s4.c1 r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z7.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        switch (this.f43710c) {
            case 0:
                return new s4.c1(new h8((k8) this.d, viewGroup.getContext()));
            case 1:
                Context context = viewGroup.getContext();
                ?? linearLayout = new LinearLayout(context);
                Paint paint = new Paint(1);
                linearLayout.f22740a = paint;
                Paint paint2 = new Paint(1);
                linearLayout.f22741b = paint2;
                linearLayout.setOrientation(1);
                linearLayout.setWillNotDraw(false);
                org.telegram.ui.Cells.q qVar = new org.telegram.ui.Cells.q(context);
                linearLayout.f22742c = qVar;
                qVar.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                linearLayout.addView(qVar, w7.z5.q(58, 58, 1));
                TextView textView = new TextView(context);
                linearLayout.d = textView;
                textView.setSingleLine();
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G6, false));
                linearLayout.addView(textView, w7.z5.t(-2, -2, 1, 0, 4, 0, 0));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2, AndroidUtilities.dp(0.5f)));
                paint2.setColor(-1);
                return new s4.c1(linearLayout);
            case 2:
                org.telegram.ui.Components.b9 b9Var = (org.telegram.ui.Components.b9) this.d;
                return new s4.c1(new org.telegram.ui.Components.c9(b9Var.j3, b9Var.getContext()));
            case 3:
                return new s4.c1(((org.telegram.ui.Components.tm) this.d).v);
            case 4:
                return new s4.c1(new ci.ab(this, ((org.telegram.ui.Components.yn) this.d).getContext(), 15));
            default:
                org.telegram.ui.Components.q90 q90Var = new org.telegram.ui.Components.q90(viewGroup.getContext(), null);
                q90Var.setGravity(17);
                q90Var.setTypeface(AndroidUtilities.bold());
                q90Var.setTextSize(1, 14.0f);
                q90Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                q90Var.setEllipsize(TextUtils.TruncateAt.END);
                q90Var.setSingleLine();
                q90Var.setMaxLines(1);
                q90Var.setLayoutParams(new s4.p0(-2, AndroidUtilities.dp(28.0f)));
                w7.b6.b(q90Var, 0.075f, 1.4f);
                return new s4.c1(q90Var);
        }
    }

    private final void D(s4.c1 c1Var, int i10) {
    }

    private final void E(s4.c1 c1Var, int i10) {
    }
}
