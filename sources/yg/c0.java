package yg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TableRow;
import android.widget.TextView;
import bg.q0;
import c8.ha;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.w70;
public final class c0 extends FrameLayout {
    public final TableRow D;
    public final TextView f59446a;
    public final TextView f59447b;
    public final TextView f59448c;
    public final TextView d;
    public final TextView f59449e;
    public final k9 f59450f;
    public final k9 h;
    public final h6 f59451n;
    public final Paint f59452r;
    public final Path f59453s;
    public final RectF f59454w;
    public final FrameLayout f59455x;
    public final FrameLayout f59456y;

    public c0(Context context, h6 h6Var) {
        super(context);
        int i7;
        float f10;
        float f11;
        int i10;
        float f12;
        float f13;
        float f14;
        int i11;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        boolean z9;
        Paint paint = new Paint();
        this.f59452r = paint;
        this.f59453s = new Path();
        this.f59454w = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        this.f59451n = h6Var;
        TextView a10 = a(id.M0(2131753523, null), false);
        TextView a11 = a(id.M0(2131753179, null), false);
        TextView a12 = a(id.M0(2131753501, null), false);
        TextView a13 = a(id.M0(2131753322, null), false);
        TextView a14 = a(id.M0(2131753540, null), false);
        TextView a15 = a(null, true);
        this.f59446a = a15;
        TextView a16 = a(null, true);
        this.f59447b = a16;
        TextView a17 = a(null, false);
        this.f59448c = a17;
        TextView a18 = a(null, true);
        this.d = a18;
        TextView a19 = a(null, false);
        this.f59449e = a19;
        k9 k9Var = new k9(context);
        this.f59450f = k9Var;
        k9Var.setRoundRadius(g0.L(12.0f));
        k9 k9Var2 = new k9(context);
        this.h = k9Var2;
        k9Var2.setRoundRadius(g0.L(12.0f));
        TableRow tableRow = new TableRow(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f59455x = frameLayout;
        boolean z10 = id.f23161a0;
        if (z10) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 12.0f;
        }
        if (z10) {
            f11 = 12.0f;
        } else {
            f11 = 0.0f;
        }
        frameLayout.addView(k9Var, ha.d(24, 24.0f, i7, f10, 0.0f, f11, 0.0f));
        boolean z11 = id.f23161a0;
        if (z11) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i12 = i10 | 16;
        if (z11) {
            f12 = 0.0f;
        } else {
            f12 = 29.0f;
        }
        if (z11) {
            f13 = 29.0f;
        } else {
            f13 = 0.0f;
        }
        frameLayout.addView(a15, ha.d(-2, -2.0f, i12, f12, 0.0f, f13, 0.0f));
        if (id.f23161a0) {
            f14 = 1.0f;
        } else {
            f14 = 0.0f;
        }
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -2, f14);
        layoutParams.gravity = 16;
        if (id.f23161a0) {
            tableRow.addView(frameLayout, layoutParams);
            tableRow.addView(a10, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow.addView(a10, new TableRow.LayoutParams(-2, -2));
            tableRow.addView(frameLayout, layoutParams);
        }
        frameLayout.setPadding(0, g0.L(6.0f), 0, g0.L(6.0f));
        TableRow tableRow2 = new TableRow(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f59456y = frameLayout2;
        boolean z12 = id.f23161a0;
        if (z12) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        if (z12) {
            f15 = 0.0f;
        } else {
            f15 = 12.0f;
        }
        if (z12) {
            f16 = 12.0f;
        } else {
            f16 = 0.0f;
        }
        frameLayout2.addView(k9Var2, ha.d(24, 24.0f, i11, f15, 0.0f, f16, 0.0f));
        boolean z13 = id.f23161a0;
        int i13 = (z13 ? 5 : 3) | 16;
        if (z13) {
            f17 = 0.0f;
        } else {
            f17 = 29.0f;
        }
        if (z13) {
            f18 = 29.0f;
        } else {
            f18 = 0.0f;
        }
        frameLayout2.addView(a16, ha.d(-2, -2.0f, i13, f17, 0.0f, f18, 0.0f));
        if (id.f23161a0) {
            f19 = 1.0f;
        } else {
            f19 = 0.0f;
        }
        TableRow.LayoutParams layoutParams2 = new TableRow.LayoutParams(-2, -2, f19);
        layoutParams2.gravity = 16;
        if (id.f23161a0) {
            tableRow2.addView(frameLayout2, layoutParams2);
            tableRow2.addView(a11, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow2.addView(a11, new TableRow.LayoutParams(-2, -2));
            tableRow2.addView(frameLayout2, layoutParams2);
        }
        frameLayout2.setPadding(0, g0.L(6.0f), 0, g0.L(6.0f));
        TableRow tableRow3 = new TableRow(context);
        if (id.f23161a0) {
            tableRow3.addView(a17, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow3.addView(a12, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow3.addView(a12, new TableRow.LayoutParams(-2, -2));
            tableRow3.addView(a17, new TableRow.LayoutParams(-2, -2));
        }
        TableRow tableRow4 = new TableRow(context);
        this.D = tableRow4;
        if (id.f23161a0) {
            tableRow4.addView(a18, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow4.addView(a13, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow4.addView(a13, new TableRow.LayoutParams(-2, -2));
            tableRow4.addView(a18, new TableRow.LayoutParams(-2, -2));
        }
        TableRow tableRow5 = new TableRow(context);
        if (id.f23161a0) {
            tableRow5.addView(a19, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow5.addView(a14, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow5.addView(a14, new TableRow.LayoutParams(-2, -2));
            tableRow5.addView(a19, new TableRow.LayoutParams(-2, -2));
        }
        b0 b0Var = new b0(this, context, h6Var);
        b0Var.addView(tableRow);
        b0Var.addView(tableRow2);
        b0Var.addView(tableRow3);
        b0Var.addView(tableRow4);
        b0Var.addView(tableRow5);
        if (id.f23161a0) {
            z9 = true;
            b0Var.setColumnShrinkable(0, true);
        } else {
            z9 = true;
            b0Var.setColumnShrinkable(1, true);
        }
        addView(b0Var, ha.c(-2.0f, -1));
        b0Var.setOutlineProvider(new q0(23));
        b0Var.setClipToOutline(z9);
        setPaddingRelative(g0.L(14.0f), g0.L(18.0f), g0.L(14.0f), 0);
    }

    public final TextView a(String str, boolean z9) {
        TextView textView;
        int i7;
        float f10;
        int i10;
        h6 h6Var = this.f59451n;
        if (z9) {
            textView = new w70(getContext(), h6Var);
            t6.G(textView, m6.J6, h6Var);
        } else {
            textView = new TextView(getContext());
        }
        if (z9) {
            i7 = m6.f28054m5;
        } else {
            i7 = m6.f27998j5;
        }
        t6.U(textView, i7, h6Var);
        textView.setTextSize(1, 14.0f);
        if (!z9) {
            if (id.f23161a0) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            textView.setGravity(i10);
        }
        if (str != null) {
            textView.setTypeface(g0.o());
            textView.setText(str);
            t6.h(m6.f27910e7, textView, h6Var);
            float f11 = 12.0f;
            if (id.f23161a0) {
                f10 = 32.0f;
            } else {
                f10 = 12.0f;
            }
            int L = g0.L(f10);
            int L2 = g0.L(11.0f);
            if (!id.f23161a0) {
                f11 = 32.0f;
            }
            textView.setPadding(L, L2, g0.L(f11), g0.L(11.0f));
            return textView;
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(g0.L(14.0f), 0, g0.L(14.0f), 0);
        return textView;
    }
}
