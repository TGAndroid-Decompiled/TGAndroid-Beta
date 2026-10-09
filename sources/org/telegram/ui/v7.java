package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class v7 extends s4.i0 {
    public final int f42666c;
    public final Object d;

    public v7(Object obj, int i10) {
        this.f42666c = i10;
        this.d = obj;
    }

    @Override
    public final int h() {
        switch (this.f42666c) {
            case 0:
                return ((g8) this.d).K;
            case 1:
                return ((org.telegram.ui.Cells.t) this.d).V2.size();
            case 2:
                return ((org.telegram.ui.Components.d9) this.d).V2.size() + 1;
            case 3:
                return 1;
            case 4:
                return 1;
            default:
                return ((zp0) this.d).f45037f.size();
        }
    }

    @Override
    public long i(int i10) {
        switch (this.f42666c) {
            case 0:
                g8 g8Var = (g8) this.d;
                return ((g8Var.I - (i10 / 12)) * 100) + (g8Var.J - (i10 % 12));
            case 1:
            default:
                return super.i(i10);
            case 2:
                org.telegram.ui.Components.d9 d9Var = (org.telegram.ui.Components.d9) this.d;
                if (i10 >= d9Var.V2.size()) {
                    return 1L;
                }
                return ((org.telegram.ui.Components.c9) d9Var.V2.get(i10)).f25292a;
        }
    }

    @Override
    public int j(int i10) {
        switch (this.f42666c) {
            case 2:
                if (i10 >= ((org.telegram.ui.Components.d9) this.d).V2.size()) {
                    return 1;
                }
                return 0;
            default:
                return super.j(i10);
        }
    }

    @Override
    public final void v(s4.d1 r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v7.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        switch (this.f42666c) {
            case 0:
                return new s4.d1(new d8((g8) this.d, viewGroup.getContext()));
            case 1:
                Context context = viewGroup.getContext();
                ?? linearLayout = new LinearLayout(context);
                Paint paint = new Paint(1);
                linearLayout.f22737a = paint;
                Paint paint2 = new Paint(1);
                linearLayout.f22738b = paint2;
                linearLayout.setOrientation(1);
                linearLayout.setWillNotDraw(false);
                org.telegram.ui.Cells.q qVar = new org.telegram.ui.Cells.q(context);
                linearLayout.f22739c = qVar;
                qVar.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                linearLayout.addView(qVar, w7.x5.q(58, 58, 1));
                TextView textView = new TextView(context);
                linearLayout.d = textView;
                textView.setSingleLine();
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.G6, false));
                linearLayout.addView(textView, w7.x5.t(-2, -2, 1, 0, 4, 0, 0));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2, AndroidUtilities.dp(0.5f)));
                paint2.setColor(-1);
                return new s4.d1(linearLayout);
            case 2:
                org.telegram.ui.Components.d9 d9Var = (org.telegram.ui.Components.d9) this.d;
                return new s4.d1(new org.telegram.ui.Components.e9(d9Var.f25645a3, d9Var.getContext()));
            case 3:
                return new s4.d1(((org.telegram.ui.Components.hn) this.d).v);
            case 4:
                return new s4.d1(new ci.bb(this, ((org.telegram.ui.Components.mo) this.d).getContext(), 15));
            default:
                org.telegram.ui.Components.ea0 ea0Var = new org.telegram.ui.Components.ea0(viewGroup.getContext(), null);
                ea0Var.setGravity(17);
                ea0Var.setTypeface(AndroidUtilities.bold());
                ea0Var.setTextSize(1, 14.0f);
                ea0Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                ea0Var.setEllipsize(TextUtils.TruncateAt.END);
                ea0Var.setSingleLine();
                ea0Var.setMaxLines(1);
                ea0Var.setLayoutParams(new s4.q0(-2, AndroidUtilities.dp(28.0f)));
                w7.z5.b(ea0Var, 0.075f, 1.4f);
                return new s4.d1(ea0Var);
        }
    }

    private final void D(s4.d1 d1Var, int i10) {
    }

    private final void E(s4.d1 d1Var, int i10) {
    }
}
