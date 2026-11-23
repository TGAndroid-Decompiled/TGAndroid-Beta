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
import c8.ma;
import c8.ra;
import hi.y2;
import java.util.HashSet;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.q9;
public final class h extends FrameLayout implements b6 {
    public final h6 f53142a;
    public final q9 f53143b;
    public final LinearLayout f53144c;
    public final FrameLayout.LayoutParams d;
    public final TextView f53145e;
    public final TextView f53146f;
    public final TextView h;
    public final ImageView f53147n;
    public final y2 f53148r;
    public int f53149s;
    public final Paint f53150w;
    public boolean f53151x;

    public h(Context context, h6 h6Var) {
        super(context);
        this.f53150w = new Paint(1);
        this.f53142a = h6Var;
        ra.b(this, 0.03f, 1.25f);
        q9 q9Var = new q9(context);
        this.f53143b = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
        addView(q9Var, ma.d(32, 32.0f, 19, 10.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f53144c = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.f53145e = textView;
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, ma.r(-1, -2, 51));
        TextView textView2 = new TextView(context);
        this.f53146f = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, ma.t(-1, -2, 51, 0, 3, 0, 0));
        FrameLayout.LayoutParams d = ma.d(-1, -2.0f, 19, 64.0f, 0.0f, 70.0f, 0.0f);
        this.d = d;
        addView(linearLayout, d);
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setMaxLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(5);
        textView3.setTextAlignment(6);
        addView(textView3, ma.d(-2, -2.0f, 21, 64.0f, -10.0f, 12.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f53147n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131230875);
        addView(imageView, ma.d(32, 32.0f, 21, 8.0f, 8.0f, 8.0f, 8.0f));
        y2 y2Var = new y2(this, getContext(), h6Var, 2);
        this.f53148r = y2Var;
        y2Var.b(-1, m6.f29381d6, m6.f29511k7);
        y2Var.setDrawUnchecked(false);
        y2Var.setDrawBackgroundAsArc(3);
        addView(y2Var, ma.d(24, 24.0f, 19, 26.0f, 12.0f, 0.0f, 0.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.f29381d6));
        hashSet.add(Integer.valueOf(m6.G6));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f53151x) {
            canvas.drawRect(org.telegram.messenger.g0.L(59.0f), getHeight() - Math.max(org.telegram.messenger.g0.L(0.66f), 1), getWidth(), getHeight(), this.f53150w);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
    }

    public void setChecked(boolean z10) {
        this.f53148r.a(z10, true);
    }

    @Override
    public final void updateColors() {
        int i7 = m6.f29381d6;
        h6 h6Var = this.f53142a;
        int w02 = m6.w0(i7, h6Var);
        int w03 = m6.w0(m6.G6, h6Var);
        this.f53149s = w03;
        this.f53145e.setTextColor(w03);
        this.f53146f.setTextColor(m6.w(w02, m6.r1(0.55f, w03)));
        this.h.setTextColor(m6.r1(0.55f, w03));
        this.f53147n.setColorFilter(new PorterDuffColorFilter(m6.r1(0.6f, w03), PorterDuff.Mode.SRC_IN));
        this.f53150w.setColor(m6.r1(0.1f, w03));
        this.f53143b.invalidate();
    }
}
