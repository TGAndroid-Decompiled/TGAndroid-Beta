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
import g7.e6;
import g7.g6;
import kh.k3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Components.o9;
public final class h extends FrameLayout implements w5 {
    public final b6 f43865a;
    public final o9 f43866b;
    public final LinearLayout f43867c;
    public final FrameLayout.LayoutParams d;
    public final TextView f43868e;
    public final TextView f43869f;
    public final TextView h;
    public final ImageView f43870n;
    public final k3 f43871r;
    public int f43872s;
    public final Paint v;
    public boolean f43873w;

    public h(Context context, b6 b6Var) {
        super(context);
        this.v = new Paint(1);
        this.f43865a = b6Var;
        g6.b(this, 0.03f, 1.25f);
        o9 o9Var = new o9(context);
        this.f43866b = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        addView(o9Var, e6.d(32, 32.0f, 19, 10.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f43867c = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.f43868e = textView;
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, e6.q(-1, -2, 51));
        TextView textView2 = new TextView(context);
        this.f43869f = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, e6.t(-1, -2, 51, 0, 3, 0, 0));
        FrameLayout.LayoutParams d = e6.d(-1, -2.0f, 19, 64.0f, 0.0f, 70.0f, 0.0f);
        this.d = d;
        addView(linearLayout, d);
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setMaxLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(5);
        textView3.setTextAlignment(6);
        addView(textView3, e6.d(-2, -2.0f, 21, 64.0f, -10.0f, 12.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f43870n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        addView(imageView, e6.d(32, 32.0f, 21, 8.0f, 8.0f, 8.0f, 8.0f));
        k3 k3Var = new k3(this, getContext(), b6Var, 2);
        this.f43871r = k3Var;
        k3Var.b(-1, f6.f23001d6, f6.f23128k7);
        k3Var.setDrawUnchecked(false);
        k3Var.setDrawBackgroundAsArc(3);
        addView(k3Var, e6.d(24, 24.0f, 19, 26.0f, 12.0f, 0.0f, 0.0f));
    }

    @Override
    public final void d() {
        int i9 = f6.f23001d6;
        b6 b6Var = this.f43865a;
        int v02 = f6.v0(i9, b6Var);
        int v03 = f6.v0(f6.G6, b6Var);
        this.f43872s = v03;
        this.f43868e.setTextColor(v03);
        this.f43869f.setTextColor(f6.v(v02, f6.l1(0.55f, v03)));
        this.h.setTextColor(f6.l1(0.55f, v03));
        this.f43870n.setColorFilter(new PorterDuffColorFilter(f6.l1(0.6f, v03), PorterDuff.Mode.SRC_IN));
        this.v.setColor(f6.l1(0.1f, v03));
        this.f43866b.invalidate();
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f43873w) {
            canvas.drawRect(AndroidUtilities.dp(59.0f), getHeight() - Math.max(AndroidUtilities.dp(0.66f), 1), getWidth(), getHeight(), this.v);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }

    public void setChecked(boolean z10) {
        this.f43871r.a(z10, true);
    }
}
