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
import ci.p3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.y5;
import org.telegram.ui.Components.w9;
import w7.x5;
import w7.z5;
public final class h extends FrameLayout implements y5 {
    public final d6 f38709a;
    public final w9 f38710b;
    public final LinearLayout f38711c;
    public final FrameLayout.LayoutParams d;
    public final TextView e;
    public final TextView f38712f;
    public final TextView h;
    public final ImageView f38713n;
    public final p3 f38714r;
    public int f38715s;
    public final Paint v;
    public boolean f38716w;

    public h(Context context, d6 d6Var) {
        super(context);
        this.v = new Paint(1);
        this.f38709a = d6Var;
        z5.b(this, 0.03f, 1.25f);
        w9 w9Var = new w9(context);
        this.f38710b = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        addView(w9Var, x5.d(32, 32.0f, 19, 10.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f38711c = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, x5.q(-1, -2, 51));
        TextView textView2 = new TextView(context);
        this.f38712f = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, x5.t(-1, -2, 51, 0, 3, 0, 0));
        FrameLayout.LayoutParams d = x5.d(-1, -2.0f, 19, 64.0f, 0.0f, 70.0f, 0.0f);
        this.d = d;
        addView(linearLayout, d);
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setMaxLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(5);
        textView3.setTextAlignment(6);
        addView(textView3, x5.d(-2, -2.0f, 21, 64.0f, -10.0f, 12.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f38713n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        addView(imageView, x5.d(32, 32.0f, 21, 8.0f, 8.0f, 8.0f, 8.0f));
        p3 p3Var = new p3(this, getContext(), d6Var, 2);
        this.f38714r = p3Var;
        p3Var.b(-1, h6.f18789d6, h6.f18917k7);
        p3Var.setDrawUnchecked(false);
        p3Var.setDrawBackgroundAsArc(3);
        addView(p3Var, x5.d(24, 24.0f, 19, 26.0f, 12.0f, 0.0f, 0.0f));
    }

    @Override
    public final void e() {
        int i10 = h6.f18789d6;
        d6 d6Var = this.f38709a;
        int v02 = h6.v0(i10, d6Var);
        int v03 = h6.v0(h6.G6, d6Var);
        this.f38715s = v03;
        this.e.setTextColor(v03);
        this.f38712f.setTextColor(h6.v(v02, h6.l1(0.55f, v03)));
        this.h.setTextColor(h6.l1(0.55f, v03));
        this.f38713n.setColorFilter(new PorterDuffColorFilter(h6.l1(0.6f, v03), PorterDuff.Mode.SRC_IN));
        this.v.setColor(h6.l1(0.1f, v03));
        this.f38710b.invalidate();
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f38716w) {
            canvas.drawRect(AndroidUtilities.dp(59.0f), getHeight() - Math.max(AndroidUtilities.dp(0.66f), 1), getWidth(), getHeight(), this.v);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }

    public void setChecked(boolean z10) {
        this.f38714r.a(z10, true);
    }
}
