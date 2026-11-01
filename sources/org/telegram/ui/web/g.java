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
import java.util.HashSet;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.n2;
import org.telegram.ui.Components.g9;
import w7.b6;
import w7.e6;
public final class g extends FrameLayout implements k6 {
    public final p6 f42835a;
    public final g9 f42836b;
    public final LinearLayout f42837c;
    public final FrameLayout.LayoutParams d;
    public final TextView e;
    public final TextView f42838f;
    public final TextView h;
    public final ImageView f42839n;
    public final n2 f42840r;
    public int f42841s;
    public final Paint f42842w;
    public boolean f42843x;

    public g(Context context, p6 p6Var) {
        super(context);
        this.f42842w = new Paint(1);
        this.f42835a = p6Var;
        e6.b(this, 0.03f, 1.25f);
        g9 g9Var = new g9(context);
        this.f42836b = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(6.0f));
        addView(g9Var, b6.d(32, 32.0f, 19, 10.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f42837c = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, b6.r(-1, -2, 51));
        TextView textView2 = new TextView(context);
        this.f42838f = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, b6.t(-1, -2, 51, 0, 3, 0, 0));
        FrameLayout.LayoutParams d = b6.d(-1, -2.0f, 19, 64.0f, 0.0f, 70.0f, 0.0f);
        this.d = d;
        addView(linearLayout, d);
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setMaxLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(5);
        textView3.setTextAlignment(6);
        addView(textView3, b6.d(-2, -2.0f, 21, 64.0f, -10.0f, 12.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f42839n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131230875);
        addView(imageView, b6.d(32, 32.0f, 21, 8.0f, 8.0f, 8.0f, 8.0f));
        n2 n2Var = new n2(this, getContext(), p6Var, 1);
        this.f42840r = n2Var;
        n2Var.b(-1, t6.f20930d6, t6.f21060k7);
        n2Var.setDrawUnchecked(false);
        n2Var.setDrawBackgroundAsArc(3);
        addView(n2Var, b6.d(24, 24.0f, 19, 26.0f, 12.0f, 0.0f, 0.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(t6.f20930d6));
        hashSet.add(Integer.valueOf(t6.G6));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f42843x) {
            canvas.drawRect(org.telegram.messenger.i0.L(59.0f), getHeight() - Math.max(org.telegram.messenger.i0.L(0.66f), 1), getWidth(), getHeight(), this.f42842w);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(56.0f), 1073741824));
    }

    public void setChecked(boolean z10) {
        this.f42840r.a(z10, true);
    }

    @Override
    public final void updateColors() {
        int i10 = t6.f20930d6;
        p6 p6Var = this.f42835a;
        int w02 = t6.w0(i10, p6Var);
        int w03 = t6.w0(t6.G6, p6Var);
        this.f42841s = w03;
        this.e.setTextColor(w03);
        this.f42838f.setTextColor(t6.w(w02, t6.r1(0.55f, w03)));
        this.h.setTextColor(t6.r1(0.55f, w03));
        this.f42839n.setColorFilter(new PorterDuffColorFilter(t6.r1(0.6f, w03), PorterDuff.Mode.SRC_IN));
        this.f42842w.setColor(t6.r1(0.1f, w03));
        this.f42836b.invalidate();
    }
}
