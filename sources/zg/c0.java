package zg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TableRow;
import android.widget.TextView;
import b8.mf;
import cg.p0;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.s70;
public final class c0 extends FrameLayout {
    public final TableRow E;
    public final TextView f60479a;
    public final TextView f60480b;
    public final TextView f60481c;
    public final TextView d;
    public final TextView f60482e;
    public final k9 f60483f;
    public final k9 h;
    public final e6 f60484n;
    public final Paint f60485r;
    public final Path f60486s;
    public final RectF f60487w;
    public final FrameLayout f60488x;
    public final FrameLayout f60489y;

    public c0(Context context, e6 e6Var) {
        super(context);
        int i3;
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
        boolean z10;
        Paint paint = new Paint();
        this.f60485r = paint;
        this.f60486s = new Path();
        this.f60487w = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        this.f60484n = e6Var;
        TextView a10 = a(bd.M0(2131753523, null), false);
        TextView a11 = a(bd.M0(2131753179, null), false);
        TextView a12 = a(bd.M0(2131753501, null), false);
        TextView a13 = a(bd.M0(2131753322, null), false);
        TextView a14 = a(bd.M0(2131753540, null), false);
        TextView a15 = a(null, true);
        this.f60479a = a15;
        TextView a16 = a(null, true);
        this.f60480b = a16;
        TextView a17 = a(null, false);
        this.f60481c = a17;
        TextView a18 = a(null, true);
        this.d = a18;
        TextView a19 = a(null, false);
        this.f60482e = a19;
        k9 k9Var = new k9(context);
        this.f60483f = k9Var;
        k9Var.setRoundRadius(g0.L(12.0f));
        k9 k9Var2 = new k9(context);
        this.h = k9Var2;
        k9Var2.setRoundRadius(g0.L(12.0f));
        TableRow tableRow = new TableRow(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f60488x = frameLayout;
        boolean z11 = bd.f21784a0;
        if (z11) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        if (z11) {
            f10 = 0.0f;
        } else {
            f10 = 12.0f;
        }
        if (z11) {
            f11 = 12.0f;
        } else {
            f11 = 0.0f;
        }
        frameLayout.addView(k9Var, mf.d(24, 24.0f, i3, f10, 0.0f, f11, 0.0f));
        boolean z12 = bd.f21784a0;
        if (z12) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i12 = i10 | 16;
        if (z12) {
            f12 = 0.0f;
        } else {
            f12 = 29.0f;
        }
        if (z12) {
            f13 = 29.0f;
        } else {
            f13 = 0.0f;
        }
        frameLayout.addView(a15, mf.d(-2, -2.0f, i12, f12, 0.0f, f13, 0.0f));
        if (bd.f21784a0) {
            f14 = 1.0f;
        } else {
            f14 = 0.0f;
        }
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -2, f14);
        layoutParams.gravity = 16;
        if (bd.f21784a0) {
            tableRow.addView(frameLayout, layoutParams);
            tableRow.addView(a10, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow.addView(a10, new TableRow.LayoutParams(-2, -2));
            tableRow.addView(frameLayout, layoutParams);
        }
        frameLayout.setPadding(0, g0.L(6.0f), 0, g0.L(6.0f));
        TableRow tableRow2 = new TableRow(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f60489y = frameLayout2;
        boolean z13 = bd.f21784a0;
        if (z13) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        if (z13) {
            f15 = 0.0f;
        } else {
            f15 = 12.0f;
        }
        if (z13) {
            f16 = 12.0f;
        } else {
            f16 = 0.0f;
        }
        frameLayout2.addView(k9Var2, mf.d(24, 24.0f, i11, f15, 0.0f, f16, 0.0f));
        boolean z14 = bd.f21784a0;
        int i13 = (z14 ? 5 : 3) | 16;
        if (z14) {
            f17 = 0.0f;
        } else {
            f17 = 29.0f;
        }
        if (z14) {
            f18 = 29.0f;
        } else {
            f18 = 0.0f;
        }
        frameLayout2.addView(a16, mf.d(-2, -2.0f, i13, f17, 0.0f, f18, 0.0f));
        if (bd.f21784a0) {
            f19 = 1.0f;
        } else {
            f19 = 0.0f;
        }
        TableRow.LayoutParams layoutParams2 = new TableRow.LayoutParams(-2, -2, f19);
        layoutParams2.gravity = 16;
        if (bd.f21784a0) {
            tableRow2.addView(frameLayout2, layoutParams2);
            tableRow2.addView(a11, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow2.addView(a11, new TableRow.LayoutParams(-2, -2));
            tableRow2.addView(frameLayout2, layoutParams2);
        }
        frameLayout2.setPadding(0, g0.L(6.0f), 0, g0.L(6.0f));
        TableRow tableRow3 = new TableRow(context);
        if (bd.f21784a0) {
            tableRow3.addView(a17, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow3.addView(a12, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow3.addView(a12, new TableRow.LayoutParams(-2, -2));
            tableRow3.addView(a17, new TableRow.LayoutParams(-2, -2));
        }
        TableRow tableRow4 = new TableRow(context);
        this.E = tableRow4;
        if (bd.f21784a0) {
            tableRow4.addView(a18, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow4.addView(a13, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow4.addView(a13, new TableRow.LayoutParams(-2, -2));
            tableRow4.addView(a18, new TableRow.LayoutParams(-2, -2));
        }
        TableRow tableRow5 = new TableRow(context);
        if (bd.f21784a0) {
            tableRow5.addView(a19, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow5.addView(a14, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow5.addView(a14, new TableRow.LayoutParams(-2, -2));
            tableRow5.addView(a19, new TableRow.LayoutParams(-2, -2));
        }
        b0 b0Var = new b0(this, context, e6Var);
        b0Var.addView(tableRow);
        b0Var.addView(tableRow2);
        b0Var.addView(tableRow3);
        b0Var.addView(tableRow4);
        b0Var.addView(tableRow5);
        if (bd.f21784a0) {
            z10 = true;
            b0Var.setColumnShrinkable(0, true);
        } else {
            z10 = true;
            b0Var.setColumnShrinkable(1, true);
        }
        addView(b0Var, mf.c(-2.0f, -1));
        b0Var.setOutlineProvider(new p0(26));
        b0Var.setClipToOutline(z10);
        setPaddingRelative(g0.L(14.0f), g0.L(18.0f), g0.L(14.0f), 0);
    }

    public final TextView a(String str, boolean z10) {
        TextView textView;
        int i3;
        float f10;
        int i10;
        e6 e6Var = this.f60484n;
        if (z10) {
            textView = new s70(getContext(), e6Var);
            r6.H(textView, k6.J6, e6Var);
        } else {
            textView = new TextView(getContext());
        }
        if (z10) {
            i3 = k6.f28042m5;
        } else {
            i3 = k6.f27988j5;
        }
        r6.V(textView, i3, e6Var);
        textView.setTextSize(1, 14.0f);
        if (!z10) {
            if (bd.f21784a0) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            textView.setGravity(i10);
        }
        if (str != null) {
            textView.setTypeface(g0.o());
            textView.setText(str);
            r6.i(k6.f27899e7, textView, e6Var);
            float f11 = 12.0f;
            if (bd.f21784a0) {
                f10 = 32.0f;
            } else {
                f10 = 12.0f;
            }
            int L = g0.L(f10);
            int L2 = g0.L(11.0f);
            if (!bd.f21784a0) {
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
