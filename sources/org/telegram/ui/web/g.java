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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.k9;
public final class g extends FrameLayout implements c6 {
    public final h6 f51067a;
    public final k9 f51068b;
    public final LinearLayout f51069c;
    public final FrameLayout.LayoutParams d;
    public final TextView f51070e;
    public final TextView f51071f;
    public final TextView h;
    public final ImageView f51072n;
    public final a3 f51073r;
    public int f51074s;
    public final Paint f51075w;
    public boolean f51076x;

    public g(Context context, h6 h6Var) {
        super(context);
        this.f51075w = new Paint(1);
        this.f51067a = h6Var;
        ka.b(this, 0.03f, 1.25f);
        k9 k9Var = new k9(context);
        this.f51068b = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
        addView(k9Var, ha.d(32, 32.0f, 19, 10.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f51069c = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.f51070e = textView;
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, ha.r(-1, -2, 51));
        TextView textView2 = new TextView(context);
        this.f51071f = textView2;
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
        this.f51072n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131230875);
        addView(imageView, ha.d(32, 32.0f, 21, 8.0f, 8.0f, 8.0f, 8.0f));
        a3 a3Var = new a3(this, getContext(), h6Var, 2);
        this.f51073r = a3Var;
        a3Var.b(-1, m6.f27890d6, m6.f28020k7);
        a3Var.setDrawUnchecked(false);
        a3Var.setDrawBackgroundAsArc(3);
        addView(a3Var, ha.d(24, 24.0f, 19, 26.0f, 12.0f, 0.0f, 0.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.f27890d6));
        hashSet.add(Integer.valueOf(m6.G6));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f51076x) {
            canvas.drawRect(org.telegram.messenger.g0.L(59.0f), getHeight() - Math.max(org.telegram.messenger.g0.L(0.66f), 1), getWidth(), getHeight(), this.f51075w);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
    }

    public void setChecked(boolean z9) {
        this.f51073r.a(z9, true);
    }

    @Override
    public final void updateColors() {
        int i7 = m6.f27890d6;
        h6 h6Var = this.f51067a;
        int w02 = m6.w0(i7, h6Var);
        int w03 = m6.w0(m6.G6, h6Var);
        this.f51074s = w03;
        this.f51070e.setTextColor(w03);
        this.f51071f.setTextColor(m6.w(w02, m6.r1(0.55f, w03)));
        this.h.setTextColor(m6.r1(0.55f, w03));
        this.f51072n.setColorFilter(new PorterDuffColorFilter(m6.r1(0.6f, w03), PorterDuff.Mode.SRC_IN));
        this.f51075w.setColor(m6.r1(0.1f, w03));
        this.f51068b.invalidate();
    }
}
