package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class w7 extends s4.h0 {
    public final int f41781c;
    public final Object d;

    public w7(Object obj, int i10) {
        this.f41781c = i10;
        this.d = obj;
    }

    @Override
    public final int h() {
        switch (this.f41781c) {
            case 0:
                return ((h8) this.d).K;
            case 1:
                return ((org.telegram.ui.Cells.t) this.d).X2.size();
            case 2:
                return ((org.telegram.ui.Components.c9) this.d).X2.size() + 1;
            case 3:
                return 1;
            case 4:
                return 1;
            default:
                return ((aq0) this.d).f34530f.size();
        }
    }

    @Override
    public long i(int i10) {
        switch (this.f41781c) {
            case 0:
                h8 h8Var = (h8) this.d;
                return ((h8Var.I - (i10 / 12)) * 100) + (h8Var.J - (i10 % 12));
            case 1:
            default:
                return super.i(i10);
            case 2:
                org.telegram.ui.Components.c9 c9Var = (org.telegram.ui.Components.c9) this.d;
                if (i10 >= c9Var.X2.size()) {
                    return 1L;
                }
                return ((org.telegram.ui.Components.b9) c9Var.X2.get(i10)).f24599a;
        }
    }

    @Override
    public int j(int i10) {
        switch (this.f41781c) {
            case 2:
                if (i10 >= ((org.telegram.ui.Components.c9) this.d).X2.size()) {
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
        switch (this.f41781c) {
            case 0:
                return new s4.c1(new e8((h8) this.d, viewGroup.getContext()));
            case 1:
                Context context = viewGroup.getContext();
                ?? linearLayout = new LinearLayout(context);
                Paint paint = new Paint(1);
                linearLayout.f22701a = paint;
                Paint paint2 = new Paint(1);
                linearLayout.f22702b = paint2;
                linearLayout.setOrientation(1);
                linearLayout.setWillNotDraw(false);
                org.telegram.ui.Cells.q qVar = new org.telegram.ui.Cells.q(context);
                linearLayout.f22703c = qVar;
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
                org.telegram.ui.Components.c9 c9Var = (org.telegram.ui.Components.c9) this.d;
                return new s4.c1(new org.telegram.ui.Components.d9(c9Var.f24925c3, c9Var.getContext()));
            case 3:
                return new s4.c1(((org.telegram.ui.Components.qm) this.d).v);
            case 4:
                return new s4.c1(new di.eb(this, ((org.telegram.ui.Components.un) this.d).getContext(), 15));
            default:
                org.telegram.ui.Components.d90 d90Var = new org.telegram.ui.Components.d90(viewGroup.getContext(), null);
                d90Var.setGravity(17);
                d90Var.setTypeface(AndroidUtilities.bold());
                d90Var.setTextSize(1, 14.0f);
                d90Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                d90Var.setEllipsize(TextUtils.TruncateAt.END);
                d90Var.setSingleLine();
                d90Var.setMaxLines(1);
                d90Var.setLayoutParams(new s4.p0(-2, AndroidUtilities.dp(28.0f)));
                w7.z5.b(d90Var, 0.075f, 1.4f);
                return new s4.c1(d90Var);
        }
    }

    private final void D(s4.c1 c1Var, int i10) {
    }

    private final void E(s4.c1 c1Var, int i10) {
    }
}
