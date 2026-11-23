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
import c8.na;
import c8.sa;
import hi.h3;
import java.util.HashSet;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.p9;
public final class h extends FrameLayout implements c6 {
    public final i6 f53377a;
    public final p9 f53378b;
    public final LinearLayout f53379c;
    public final FrameLayout.LayoutParams d;
    public final TextView f53380e;
    public final TextView f53381f;
    public final TextView h;
    public final ImageView f53382n;
    public final h3 f53383r;
    public int f53384s;
    public final Paint f53385w;
    public boolean f53386x;

    public h(Context context, i6 i6Var) {
        super(context);
        this.f53385w = new Paint(1);
        this.f53377a = i6Var;
        sa.b(this, 0.03f, 1.25f);
        p9 p9Var = new p9(context);
        this.f53378b = p9Var;
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
        addView(p9Var, na.d(32, 32.0f, 19, 10.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f53379c = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.f53380e = textView;
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, na.r(-1, -2, 51));
        TextView textView2 = new TextView(context);
        this.f53381f = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, na.t(-1, -2, 51, 0, 3, 0, 0));
        FrameLayout.LayoutParams d = na.d(-1, -2.0f, 19, 64.0f, 0.0f, 70.0f, 0.0f);
        this.d = d;
        addView(linearLayout, d);
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setMaxLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(5);
        textView3.setTextAlignment(6);
        addView(textView3, na.d(-2, -2.0f, 21, 64.0f, -10.0f, 12.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f53382n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131230875);
        addView(imageView, na.d(32, 32.0f, 21, 8.0f, 8.0f, 8.0f, 8.0f));
        h3 h3Var = new h3(this, getContext(), i6Var, 2);
        this.f53383r = h3Var;
        h3Var.b(-1, n6.f29451d6, n6.f29581k7);
        h3Var.setDrawUnchecked(false);
        h3Var.setDrawBackgroundAsArc(3);
        addView(h3Var, na.d(24, 24.0f, 19, 26.0f, 12.0f, 0.0f, 0.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(n6.f29451d6));
        hashSet.add(Integer.valueOf(n6.G6));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f53386x) {
            canvas.drawRect(org.telegram.messenger.g0.L(59.0f), getHeight() - Math.max(org.telegram.messenger.g0.L(0.66f), 1), getWidth(), getHeight(), this.f53385w);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
    }

    public void setChecked(boolean z10) {
        this.f53383r.a(z10, true);
    }

    @Override
    public final void updateColors() {
        int i7 = n6.f29451d6;
        i6 i6Var = this.f53377a;
        int w02 = n6.w0(i7, i6Var);
        int w03 = n6.w0(n6.G6, i6Var);
        this.f53384s = w03;
        this.f53380e.setTextColor(w03);
        this.f53381f.setTextColor(n6.w(w02, n6.r1(0.55f, w03)));
        this.h.setTextColor(n6.r1(0.55f, w03));
        this.f53382n.setColorFilter(new PorterDuffColorFilter(n6.r1(0.6f, w03), PorterDuff.Mode.SRC_IN));
        this.f53385w.setColor(n6.r1(0.1f, w03));
        this.f53378b.invalidate();
    }
}
