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
import hi.z2;
import java.util.HashSet;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.q9;
public final class h extends FrameLayout implements c6 {
    public final i6 f53144a;
    public final q9 f53145b;
    public final LinearLayout f53146c;
    public final FrameLayout.LayoutParams d;
    public final TextView f53147e;
    public final TextView f53148f;
    public final TextView h;
    public final ImageView f53149n;
    public final z2 f53150r;
    public int f53151s;
    public final Paint f53152w;
    public boolean f53153x;

    public h(Context context, i6 i6Var) {
        super(context);
        this.f53152w = new Paint(1);
        this.f53144a = i6Var;
        ra.b(this, 0.03f, 1.25f);
        q9 q9Var = new q9(context);
        this.f53145b = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
        addView(q9Var, ma.d(32, 32.0f, 19, 10.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f53146c = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.f53147e = textView;
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, ma.r(-1, -2, 51));
        TextView textView2 = new TextView(context);
        this.f53148f = textView2;
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
        this.f53149n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131230875);
        addView(imageView, ma.d(32, 32.0f, 21, 8.0f, 8.0f, 8.0f, 8.0f));
        z2 z2Var = new z2(this, getContext(), i6Var, 2);
        this.f53150r = z2Var;
        z2Var.b(-1, n6.f29396d6, n6.f29526k7);
        z2Var.setDrawUnchecked(false);
        z2Var.setDrawBackgroundAsArc(3);
        addView(z2Var, ma.d(24, 24.0f, 19, 26.0f, 12.0f, 0.0f, 0.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(n6.f29396d6));
        hashSet.add(Integer.valueOf(n6.G6));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f53153x) {
            canvas.drawRect(org.telegram.messenger.g0.L(59.0f), getHeight() - Math.max(org.telegram.messenger.g0.L(0.66f), 1), getWidth(), getHeight(), this.f53152w);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
    }

    public void setChecked(boolean z10) {
        this.f53150r.a(z10, true);
    }

    @Override
    public final void updateColors() {
        int i7 = n6.f29396d6;
        i6 i6Var = this.f53144a;
        int w02 = n6.w0(i7, i6Var);
        int w03 = n6.w0(n6.G6, i6Var);
        this.f53151s = w03;
        this.f53147e.setTextColor(w03);
        this.f53148f.setTextColor(n6.w(w02, n6.r1(0.55f, w03)));
        this.h.setTextColor(n6.r1(0.55f, w03));
        this.f53149n.setColorFilter(new PorterDuffColorFilter(n6.r1(0.6f, w03), PorterDuff.Mode.SRC_IN));
        this.f53152w.setColor(n6.r1(0.1f, w03));
        this.f53145b.invalidate();
    }
}
