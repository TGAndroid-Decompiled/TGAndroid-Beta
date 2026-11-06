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
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.l9;
public final class g extends FrameLayout implements a6 {
    public final f6 f51120a;
    public final l9 f51121b;
    public final LinearLayout f51122c;
    public final FrameLayout.LayoutParams d;
    public final TextView f51123e;
    public final TextView f51124f;
    public final TextView h;
    public final ImageView f51125n;
    public final a3 f51126r;
    public int f51127s;
    public final Paint f51128w;
    public boolean f51129x;

    public g(Context context, f6 f6Var) {
        super(context);
        this.f51128w = new Paint(1);
        this.f51120a = f6Var;
        ka.b(this, 0.03f, 1.25f);
        l9 l9Var = new l9(context);
        this.f51121b = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
        addView(l9Var, ha.d(32, 32.0f, 19, 10.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f51122c = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.f51123e = textView;
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, ha.r(-1, -2, 51));
        TextView textView2 = new TextView(context);
        this.f51124f = textView2;
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
        this.f51125n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131230875);
        addView(imageView, ha.d(32, 32.0f, 21, 8.0f, 8.0f, 8.0f, 8.0f));
        a3 a3Var = new a3(this, getContext(), f6Var, 2);
        this.f51126r = a3Var;
        a3Var.b(-1, k6.f27848d6, k6.f27978k7);
        a3Var.setDrawUnchecked(false);
        a3Var.setDrawBackgroundAsArc(3);
        addView(a3Var, ha.d(24, 24.0f, 19, 26.0f, 12.0f, 0.0f, 0.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.f27848d6));
        hashSet.add(Integer.valueOf(k6.G6));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f51129x) {
            canvas.drawRect(org.telegram.messenger.g0.L(59.0f), getHeight() - Math.max(org.telegram.messenger.g0.L(0.66f), 1), getWidth(), getHeight(), this.f51128w);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
    }

    public void setChecked(boolean z9) {
        this.f51126r.a(z9, true);
    }

    @Override
    public final void updateColors() {
        int i7 = k6.f27848d6;
        f6 f6Var = this.f51120a;
        int w02 = k6.w0(i7, f6Var);
        int w03 = k6.w0(k6.G6, f6Var);
        this.f51127s = w03;
        this.f51123e.setTextColor(w03);
        this.f51124f.setTextColor(k6.w(w02, k6.r1(0.55f, w03)));
        this.h.setTextColor(k6.r1(0.55f, w03));
        this.f51125n.setColorFilter(new PorterDuffColorFilter(k6.r1(0.6f, w03), PorterDuff.Mode.SRC_IN));
        this.f51128w.setColor(k6.r1(0.1f, w03));
        this.f51121b.invalidate();
    }
}
