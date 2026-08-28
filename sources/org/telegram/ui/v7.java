package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class v7 extends f2.r0 {
    public final int f43399c;
    public final Object d;

    public v7(Object obj, int i9) {
        this.f43399c = i9;
        this.d = obj;
    }

    @Override
    public final int h() {
        switch (this.f43399c) {
            case 0:
                return ((g8) this.d).G;
            case 1:
                return ((org.telegram.ui.Cells.t) this.d).T2.size();
            case 2:
                return ((org.telegram.ui.Components.t8) this.d).T2.size() + 1;
            case 3:
                return 1;
            default:
                return 1;
        }
    }

    @Override
    public long i(int i9) {
        switch (this.f43399c) {
            case 0:
                g8 g8Var = (g8) this.d;
                return ((g8Var.E - (i9 / 12)) * 100) + (g8Var.F - (i9 % 12));
            case 1:
            default:
                return super.i(i9);
            case 2:
                org.telegram.ui.Components.t8 t8Var = (org.telegram.ui.Components.t8) this.d;
                if (i9 >= t8Var.T2.size()) {
                    return 1L;
                }
                return ((org.telegram.ui.Components.s8) t8Var.T2.get(i9)).f32391a;
        }
    }

    @Override
    public int j(int i9) {
        switch (this.f43399c) {
            case 2:
                if (i9 >= ((org.telegram.ui.Components.t8) this.d).T2.size()) {
                    return 1;
                }
                return 0;
            default:
                return super.j(i9);
        }
    }

    @Override
    public final void v(f2.q1 r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v7.v(f2.q1, int):void");
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        switch (this.f43399c) {
            case 0:
                return new f2.q1(new d8((g8) this.d, viewGroup.getContext()));
            case 1:
                Context context = viewGroup.getContext();
                ?? linearLayout = new LinearLayout(context);
                Paint paint = new Paint(1);
                linearLayout.f25134a = paint;
                Paint paint2 = new Paint(1);
                linearLayout.f25135b = paint2;
                linearLayout.setOrientation(1);
                linearLayout.setWillNotDraw(false);
                org.telegram.ui.Cells.q qVar = new org.telegram.ui.Cells.q(context);
                linearLayout.f25136c = qVar;
                qVar.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                linearLayout.addView(qVar, g7.e6.q(58, 58, 1));
                TextView textView = new TextView(context);
                linearLayout.d = textView;
                textView.setSingleLine();
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
                linearLayout.addView(textView, g7.e6.t(-2, -2, 1, 0, 4, 0, 0));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2, AndroidUtilities.dp(0.5f)));
                paint2.setColor(-1);
                return new f2.q1(linearLayout);
            case 2:
                org.telegram.ui.Components.t8 t8Var = (org.telegram.ui.Components.t8) this.d;
                return new f2.q1(new org.telegram.ui.Components.u8(t8Var.Y2, t8Var.getContext()));
            case 3:
                return new f2.q1(((org.telegram.ui.Components.hm) this.d).v);
            default:
                return new f2.q1(new fh.l2(this, ((org.telegram.ui.Components.ln) this.d).getContext(), 14));
        }
    }

    private final void D(f2.q1 q1Var, int i9) {
    }

    private final void E(f2.q1 q1Var, int i9) {
    }
}
