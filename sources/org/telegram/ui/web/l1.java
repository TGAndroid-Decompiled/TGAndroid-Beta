package org.telegram.ui.web;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.g5;
public final class l1 extends FrameLayout implements z5 {
    public final ImageView f50939a;
    public final TextView f50940b;
    public final k2 f50941c;
    public g5 d;
    public String f50942e;
    public boolean f50943f;
    public ShapeDrawable h;

    public l1(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.f50939a = imageView;
        addView(imageView, mf.d(32, 32.0f, 19, 16.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f50940b = textView;
        r6.V(textView, k6.G6, null);
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, mf.d(-1, -2.0f, 55, 68.0f, 7.0f, 54.0f, 0.0f));
        k2 k2Var = new k2(11, context, this);
        this.f50941c = k2Var;
        r6.V(k2Var, k6.f28273y6, null);
        k2Var.setTextSize(1, 13.0f);
        k2Var.setMaxLines(1);
        k2Var.setEllipsize(truncateAt);
        k2Var.setPivotX(0.0f);
        addView(k2Var, mf.d(-1, -2.0f, 55, 68.0f, 30.0f, 54.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(2131231244);
        r6.t(imageView2, k6.A6, null, PorterDuff.Mode.SRC_IN);
        addView(imageView2, mf.d(32, 32.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f50943f) {
            canvas.drawRect(org.telegram.messenger.g0.L(64.0f), getHeight() - 1, getWidth(), getHeight(), k6.f28002k0);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            ShapeDrawable shapeDrawable = this.h;
            if (shapeDrawable != null) {
                k6.C1(k6.r1(0.1f, k6.x0(null, k6.G6, false)), shapeDrawable);
                ImageView imageView = this.f50939a;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
