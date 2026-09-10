package org.telegram.ui.web;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.h4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.w9;
import w7.c6;
public final class i extends FrameLayout implements a6 {
    public final f6 f37950a;
    public final w9 f37951b;
    public final LinearLayout f37952c;
    public final FrameLayout.LayoutParams d;
    public final TextView e;
    public final TextView f37953f;
    public final TextView h;
    public final ImageView f37954n;
    public final h4 f37955r;
    public int f37956s;
    public final Paint v;
    public boolean f37957w;

    public i(Context context, f6 f6Var) {
        super(context);
        this.v = new Paint(1);
        this.f37950a = f6Var;
        c6.b(this, 0.03f, 1.25f);
        w9 w9Var = new w9(context);
        this.f37951b = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        addView(w9Var, w7.a6.d(32, 32.0f, 19, 10.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f37952c = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, w7.a6.q(-1, -2, 51));
        TextView textView2 = new TextView(context);
        this.f37953f = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, w7.a6.t(-1, -2, 51, 0, 3, 0, 0));
        FrameLayout.LayoutParams d = w7.a6.d(-1, -2.0f, 19, 64.0f, 0.0f, 70.0f, 0.0f);
        this.d = d;
        addView(linearLayout, d);
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setMaxLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(5);
        textView3.setTextAlignment(6);
        addView(textView3, w7.a6.d(-2, -2.0f, 21, 64.0f, -10.0f, 12.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f37954n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        addView(imageView, w7.a6.d(32, 32.0f, 21, 8.0f, 8.0f, 8.0f, 8.0f));
        h4 h4Var = new h4(this, getContext(), f6Var, 2);
        this.f37955r = h4Var;
        h4Var.b(-1, j6.f17928d6, j6.f18056k7);
        h4Var.setDrawUnchecked(false);
        h4Var.setDrawBackgroundAsArc(3);
        addView(h4Var, w7.a6.d(24, 24.0f, 19, 26.0f, 12.0f, 0.0f, 0.0f));
    }

    @Override
    public final void e() {
        int i10 = j6.f17928d6;
        f6 f6Var = this.f37950a;
        int v02 = j6.v0(i10, f6Var);
        int v03 = j6.v0(j6.G6, f6Var);
        this.f37956s = v03;
        this.e.setTextColor(v03);
        this.f37953f.setTextColor(j6.v(v02, j6.l1(0.55f, v03)));
        this.h.setTextColor(j6.l1(0.55f, v03));
        this.f37954n.setColorFilter(new PorterDuffColorFilter(j6.l1(0.6f, v03), PorterDuff.Mode.SRC_IN));
        this.v.setColor(j6.l1(0.1f, v03));
        this.f37951b.invalidate();
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f37957w) {
            canvas.drawRect(AndroidUtilities.dp(59.0f), getHeight() - Math.max(AndroidUtilities.dp(0.66f), 1), getWidth(), getHeight(), this.v);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }

    public void setChecked(boolean z10) {
        this.f37955r.a(z10, true);
    }
}
