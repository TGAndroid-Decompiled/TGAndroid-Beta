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
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.w70;
public final class c0 extends FrameLayout {
    public final TableRow D;
    public final TextView f59316a;
    public final TextView f59317b;
    public final TextView f59318c;
    public final TextView d;
    public final TextView f59319e;
    public final l9 f59320f;
    public final l9 h;
    public final f6 f59321n;
    public final Paint f59322r;
    public final Path f59323s;
    public final RectF f59324w;
    public final FrameLayout f59325x;
    public final FrameLayout f59326y;

    public c0(Context context, f6 f6Var) {
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
        this.f59322r = paint;
        this.f59323s = new Path();
        this.f59324w = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        this.f59321n = f6Var;
        TextView a10 = a(hd.M0(2131753523, null), false);
        TextView a11 = a(hd.M0(2131753179, null), false);
        TextView a12 = a(hd.M0(2131753501, null), false);
        TextView a13 = a(hd.M0(2131753322, null), false);
        TextView a14 = a(hd.M0(2131753540, null), false);
        TextView a15 = a(null, true);
        this.f59316a = a15;
        TextView a16 = a(null, true);
        this.f59317b = a16;
        TextView a17 = a(null, false);
        this.f59318c = a17;
        TextView a18 = a(null, true);
        this.d = a18;
        TextView a19 = a(null, false);
        this.f59319e = a19;
        l9 l9Var = new l9(context);
        this.f59320f = l9Var;
        l9Var.setRoundRadius(g0.L(12.0f));
        l9 l9Var2 = new l9(context);
        this.h = l9Var2;
        l9Var2.setRoundRadius(g0.L(12.0f));
        TableRow tableRow = new TableRow(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f59325x = frameLayout;
        boolean z10 = hd.f22871a0;
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
        frameLayout.addView(l9Var, ha.d(24, 24.0f, i7, f10, 0.0f, f11, 0.0f));
        boolean z11 = hd.f22871a0;
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
        if (hd.f22871a0) {
            f14 = 1.0f;
        } else {
            f14 = 0.0f;
        }
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -2, f14);
        layoutParams.gravity = 16;
        if (hd.f22871a0) {
            tableRow.addView(frameLayout, layoutParams);
            tableRow.addView(a10, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow.addView(a10, new TableRow.LayoutParams(-2, -2));
            tableRow.addView(frameLayout, layoutParams);
        }
        frameLayout.setPadding(0, g0.L(6.0f), 0, g0.L(6.0f));
        TableRow tableRow2 = new TableRow(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f59326y = frameLayout2;
        boolean z12 = hd.f22871a0;
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
        frameLayout2.addView(l9Var2, ha.d(24, 24.0f, i11, f15, 0.0f, f16, 0.0f));
        boolean z13 = hd.f22871a0;
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
        if (hd.f22871a0) {
            f19 = 1.0f;
        } else {
            f19 = 0.0f;
        }
        TableRow.LayoutParams layoutParams2 = new TableRow.LayoutParams(-2, -2, f19);
        layoutParams2.gravity = 16;
        if (hd.f22871a0) {
            tableRow2.addView(frameLayout2, layoutParams2);
            tableRow2.addView(a11, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow2.addView(a11, new TableRow.LayoutParams(-2, -2));
            tableRow2.addView(frameLayout2, layoutParams2);
        }
        frameLayout2.setPadding(0, g0.L(6.0f), 0, g0.L(6.0f));
        TableRow tableRow3 = new TableRow(context);
        if (hd.f22871a0) {
            tableRow3.addView(a17, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow3.addView(a12, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow3.addView(a12, new TableRow.LayoutParams(-2, -2));
            tableRow3.addView(a17, new TableRow.LayoutParams(-2, -2));
        }
        TableRow tableRow4 = new TableRow(context);
        this.D = tableRow4;
        if (hd.f22871a0) {
            tableRow4.addView(a18, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow4.addView(a13, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow4.addView(a13, new TableRow.LayoutParams(-2, -2));
            tableRow4.addView(a18, new TableRow.LayoutParams(-2, -2));
        }
        TableRow tableRow5 = new TableRow(context);
        if (hd.f22871a0) {
            tableRow5.addView(a19, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow5.addView(a14, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow5.addView(a14, new TableRow.LayoutParams(-2, -2));
            tableRow5.addView(a19, new TableRow.LayoutParams(-2, -2));
        }
        b0 b0Var = new b0(this, context, f6Var);
        b0Var.addView(tableRow);
        b0Var.addView(tableRow2);
        b0Var.addView(tableRow3);
        b0Var.addView(tableRow4);
        b0Var.addView(tableRow5);
        if (hd.f22871a0) {
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
        f6 f6Var = this.f59321n;
        if (z9) {
            textView = new w70(getContext(), f6Var);
            r6.H(textView, k6.J6, f6Var);
        } else {
            textView = new TextView(getContext());
        }
        if (z9) {
            i7 = k6.f28012m5;
        } else {
            i7 = k6.f27956j5;
        }
        r6.V(textView, i7, f6Var);
        textView.setTextSize(1, 14.0f);
        if (!z9) {
            if (hd.f22871a0) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            textView.setGravity(i10);
        }
        if (str != null) {
            textView.setTypeface(g0.o());
            textView.setText(str);
            r6.i(k6.f27868e7, textView, f6Var);
            float f11 = 12.0f;
            if (hd.f22871a0) {
                f10 = 32.0f;
            } else {
                f10 = 12.0f;
            }
            int L = g0.L(f10);
            int L2 = g0.L(11.0f);
            if (!hd.f22871a0) {
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
