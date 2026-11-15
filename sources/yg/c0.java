package yg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TableRow;
import android.widget.TextView;
import bg.p0;
import c8.ja;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.z70;
public final class c0 extends FrameLayout {
    public final TableRow E;
    public final TextView f60650a;
    public final TextView f60651b;
    public final TextView f60652c;
    public final TextView d;
    public final TextView f60653e;
    public final i9 f60654f;
    public final i9 h;
    public final e6 f60655n;
    public final Paint f60656r;
    public final Path f60657s;
    public final RectF f60658w;
    public final FrameLayout f60659x;
    public final FrameLayout f60660y;

    public c0(Context context, e6 e6Var) {
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
        boolean z10;
        Paint paint = new Paint();
        this.f60656r = paint;
        this.f60657s = new Path();
        this.f60658w = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        this.f60655n = e6Var;
        TextView a10 = a(hd.M0(2131753523, null), false);
        TextView a11 = a(hd.M0(2131753179, null), false);
        TextView a12 = a(hd.M0(2131753501, null), false);
        TextView a13 = a(hd.M0(2131753322, null), false);
        TextView a14 = a(hd.M0(2131753540, null), false);
        TextView a15 = a(null, true);
        this.f60650a = a15;
        TextView a16 = a(null, true);
        this.f60651b = a16;
        TextView a17 = a(null, false);
        this.f60652c = a17;
        TextView a18 = a(null, true);
        this.d = a18;
        TextView a19 = a(null, false);
        this.f60653e = a19;
        i9 i9Var = new i9(context);
        this.f60654f = i9Var;
        i9Var.setRoundRadius(g0.L(12.0f));
        i9 i9Var2 = new i9(context);
        this.h = i9Var2;
        i9Var2.setRoundRadius(g0.L(12.0f));
        TableRow tableRow = new TableRow(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f60659x = frameLayout;
        boolean z11 = hd.f24101a0;
        if (z11) {
            i7 = 5;
        } else {
            i7 = 3;
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
        frameLayout.addView(i9Var, ja.d(24, 24.0f, i7, f10, 0.0f, f11, 0.0f));
        boolean z12 = hd.f24101a0;
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
        frameLayout.addView(a15, ja.d(-2, -2.0f, i12, f12, 0.0f, f13, 0.0f));
        if (hd.f24101a0) {
            f14 = 1.0f;
        } else {
            f14 = 0.0f;
        }
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -2, f14);
        layoutParams.gravity = 16;
        if (hd.f24101a0) {
            tableRow.addView(frameLayout, layoutParams);
            tableRow.addView(a10, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow.addView(a10, new TableRow.LayoutParams(-2, -2));
            tableRow.addView(frameLayout, layoutParams);
        }
        frameLayout.setPadding(0, g0.L(6.0f), 0, g0.L(6.0f));
        TableRow tableRow2 = new TableRow(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f60660y = frameLayout2;
        boolean z13 = hd.f24101a0;
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
        frameLayout2.addView(i9Var2, ja.d(24, 24.0f, i11, f15, 0.0f, f16, 0.0f));
        boolean z14 = hd.f24101a0;
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
        frameLayout2.addView(a16, ja.d(-2, -2.0f, i13, f17, 0.0f, f18, 0.0f));
        if (hd.f24101a0) {
            f19 = 1.0f;
        } else {
            f19 = 0.0f;
        }
        TableRow.LayoutParams layoutParams2 = new TableRow.LayoutParams(-2, -2, f19);
        layoutParams2.gravity = 16;
        if (hd.f24101a0) {
            tableRow2.addView(frameLayout2, layoutParams2);
            tableRow2.addView(a11, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow2.addView(a11, new TableRow.LayoutParams(-2, -2));
            tableRow2.addView(frameLayout2, layoutParams2);
        }
        frameLayout2.setPadding(0, g0.L(6.0f), 0, g0.L(6.0f));
        TableRow tableRow3 = new TableRow(context);
        if (hd.f24101a0) {
            tableRow3.addView(a17, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow3.addView(a12, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow3.addView(a12, new TableRow.LayoutParams(-2, -2));
            tableRow3.addView(a17, new TableRow.LayoutParams(-2, -2));
        }
        TableRow tableRow4 = new TableRow(context);
        this.E = tableRow4;
        if (hd.f24101a0) {
            tableRow4.addView(a18, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow4.addView(a13, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow4.addView(a13, new TableRow.LayoutParams(-2, -2));
            tableRow4.addView(a18, new TableRow.LayoutParams(-2, -2));
        }
        TableRow tableRow5 = new TableRow(context);
        if (hd.f24101a0) {
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
        if (hd.f24101a0) {
            z10 = true;
            b0Var.setColumnShrinkable(0, true);
        } else {
            z10 = true;
            b0Var.setColumnShrinkable(1, true);
        }
        addView(b0Var, ja.c(-2.0f, -1));
        b0Var.setOutlineProvider(new p0(23));
        b0Var.setClipToOutline(z10);
        setPaddingRelative(g0.L(14.0f), g0.L(18.0f), g0.L(14.0f), 0);
    }

    public final TextView a(String str, boolean z10) {
        TextView textView;
        int i7;
        float f10;
        int i10;
        e6 e6Var = this.f60655n;
        if (z10) {
            textView = new z70(getContext(), e6Var);
            q6.G(textView, j6.J6, e6Var);
        } else {
            textView = new TextView(getContext());
        }
        if (z10) {
            i7 = j6.f29013m5;
        } else {
            i7 = j6.f28957j5;
        }
        q6.U(textView, i7, e6Var);
        textView.setTextSize(1, 14.0f);
        if (!z10) {
            if (hd.f24101a0) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            textView.setGravity(i10);
        }
        if (str != null) {
            textView.setTypeface(g0.o());
            textView.setText(str);
            q6.h(j6.f28869e7, textView, e6Var);
            float f11 = 12.0f;
            if (hd.f24101a0) {
                f10 = 32.0f;
            } else {
                f10 = 12.0f;
            }
            int L = g0.L(f10);
            int L2 = g0.L(11.0f);
            if (!hd.f24101a0) {
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
