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
import ci.o3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.y9;
import w7.x5;
public final class h extends FrameLayout implements z5 {
    public final e6 f43367a;
    public final y9 f43368b;
    public final LinearLayout f43369c;
    public final FrameLayout.LayoutParams d;
    public final TextView f43370e;
    public final TextView f43371f;
    public final TextView h;
    public final ImageView f43372n;
    public final o3 f43373r;
    public int f43374s;
    public final Paint v;
    public boolean f43375w;

    public h(Context context, e6 e6Var) {
        super(context);
        this.v = new Paint(1);
        this.f43367a = e6Var;
        w7.z5.b(this, 0.03f, 1.25f);
        y9 y9Var = new y9(context);
        this.f43368b = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        addView(y9Var, x5.a(32.0f, 10.0f, 8.0f, 8.0f, 8.0f, 32, 19));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f43369c = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.f43370e = textView;
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, x5.q(-1, -2, 51));
        TextView textView2 = new TextView(context);
        this.f43371f = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, x5.t(-1, -2, 51, 0, 3, 0, 0));
        FrameLayout.LayoutParams a2 = x5.a(-2.0f, 64.0f, 0.0f, 70.0f, 0.0f, -1, 19);
        this.d = a2;
        addView(linearLayout, a2);
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setMaxLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(5);
        textView3.setTextAlignment(6);
        addView(textView3, x5.a(-2.0f, 64.0f, -10.0f, 12.0f, 0.0f, -2, 21));
        ImageView imageView = new ImageView(context);
        this.f43372n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        addView(imageView, x5.a(32.0f, 8.0f, 8.0f, 8.0f, 8.0f, 32, 21));
        o3 o3Var = new o3(this, getContext(), e6Var, 2);
        this.f43373r = o3Var;
        o3Var.b(-1, i6.f20801d6, i6.f20930k7);
        o3Var.setDrawUnchecked(false);
        o3Var.setDrawBackgroundAsArc(3);
        addView(o3Var, x5.a(24.0f, 26.0f, 12.0f, 0.0f, 0.0f, 24, 19));
    }

    @Override
    public final void e() {
        int i10 = i6.f20801d6;
        e6 e6Var = this.f43367a;
        int w02 = i6.w0(i10, e6Var);
        int w03 = i6.w0(i6.G6, e6Var);
        this.f43374s = w03;
        this.f43370e.setTextColor(w03);
        this.f43371f.setTextColor(i6.v(w02, i6.m1(0.55f, w03)));
        this.h.setTextColor(i6.m1(0.55f, w03));
        this.f43372n.setColorFilter(new PorterDuffColorFilter(i6.m1(0.6f, w03), PorterDuff.Mode.SRC_IN));
        this.v.setColor(i6.m1(0.1f, w03));
        this.f43368b.invalidate();
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f43375w) {
            canvas.drawRect(AndroidUtilities.dp(59.0f), getHeight() - Math.max(AndroidUtilities.dp(0.66f), 1), getWidth(), getHeight(), this.v);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }

    public void setChecked(boolean z10) {
        this.f43373r.a(z10, true);
    }
}
