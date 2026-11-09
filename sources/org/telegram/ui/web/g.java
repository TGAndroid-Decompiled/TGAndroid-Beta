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
import c8.ha;
import c8.ka;
import fi.a3;
import java.util.HashSet;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.l9;
public final class g extends FrameLayout implements b6 {
    public final g6 f51113a;
    public final l9 f51114b;
    public final LinearLayout f51115c;
    public final FrameLayout.LayoutParams d;
    public final TextView f51116e;
    public final TextView f51117f;
    public final TextView h;
    public final ImageView f51118n;
    public final a3 f51119r;
    public int f51120s;
    public final Paint f51121w;
    public boolean f51122x;

    public g(Context context, g6 g6Var) {
        super(context);
        this.f51121w = new Paint(1);
        this.f51113a = g6Var;
        ka.b(this, 0.03f, 1.25f);
        l9 l9Var = new l9(context);
        this.f51114b = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
        addView(l9Var, ha.d(32, 32.0f, 19, 10.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f51115c = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.f51116e = textView;
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, ha.r(-1, -2, 51));
        TextView textView2 = new TextView(context);
        this.f51117f = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, ha.t(-1, -2, 51, 0, 3, 0, 0));
        FrameLayout.LayoutParams d = ha.d(-1, -2.0f, 19, 64.0f, 0.0f, 70.0f, 0.0f);
        this.d = d;
        addView(linearLayout, d);
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setMaxLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(5);
        textView3.setTextAlignment(6);
        addView(textView3, ha.d(-2, -2.0f, 21, 64.0f, -10.0f, 12.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f51118n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131230875);
        addView(imageView, ha.d(32, 32.0f, 21, 8.0f, 8.0f, 8.0f, 8.0f));
        a3 a3Var = new a3(this, getContext(), g6Var, 2);
        this.f51119r = a3Var;
        a3Var.b(-1, l6.f27865d6, l6.f27995k7);
        a3Var.setDrawUnchecked(false);
        a3Var.setDrawBackgroundAsArc(3);
        addView(a3Var, ha.d(24, 24.0f, 19, 26.0f, 12.0f, 0.0f, 0.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(l6.f27865d6));
        hashSet.add(Integer.valueOf(l6.G6));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f51122x) {
            canvas.drawRect(org.telegram.messenger.g0.L(59.0f), getHeight() - Math.max(org.telegram.messenger.g0.L(0.66f), 1), getWidth(), getHeight(), this.f51121w);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
    }

    public void setChecked(boolean z9) {
        this.f51119r.a(z9, true);
    }

    @Override
    public final void updateColors() {
        int i7 = l6.f27865d6;
        g6 g6Var = this.f51113a;
        int w02 = l6.w0(i7, g6Var);
        int w03 = l6.w0(l6.G6, g6Var);
        this.f51120s = w03;
        this.f51116e.setTextColor(w03);
        this.f51117f.setTextColor(l6.w(w02, l6.r1(0.55f, w03)));
        this.h.setTextColor(l6.r1(0.55f, w03));
        this.f51118n.setColorFilter(new PorterDuffColorFilter(l6.r1(0.6f, w03), PorterDuff.Mode.SRC_IN));
        this.f51121w.setColor(l6.r1(0.1f, w03));
        this.f51114b.invalidate();
    }
}
