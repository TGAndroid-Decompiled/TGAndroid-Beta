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
import java.util.HashSet;
import org.telegram.messenger.f8;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.q2;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.f5;
import w7.b6;
public final class o1 extends FrameLayout implements k6 {
    public final ImageView f43152a;
    public final TextView f43153b;
    public final q2 f43154c;
    public f5 d;
    public String e;
    public boolean f43155f;
    public ShapeDrawable h;

    public o1(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.f43152a = imageView;
        addView(imageView, b6.d(32, 32.0f, 19, 16.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f43153b = textView;
        a7.V(textView, t6.G6, null);
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, b6.d(-1, -2.0f, 55, 68.0f, 7.0f, 54.0f, 0.0f));
        q2 q2Var = new q2(this, context, 11);
        this.f43154c = q2Var;
        a7.V(q2Var, t6.f21311y6, null);
        q2Var.setTextSize(1, 13.0f);
        q2Var.setMaxLines(1);
        q2Var.setEllipsize(truncateAt);
        q2Var.setPivotX(0.0f);
        addView(q2Var, b6.d(-1, -2.0f, 55, 68.0f, 30.0f, 54.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(2131231245);
        a7.t(imageView2, t6.A6, null, PorterDuff.Mode.SRC_IN);
        addView(imageView2, b6.d(32, 32.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f43155f) {
            canvas.drawRect(org.telegram.messenger.i0.L(64.0f), getHeight() - 1, getWidth(), getHeight(), t6.f21052k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(56.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            ShapeDrawable shapeDrawable = this.h;
            if (shapeDrawable != null) {
                t6.C1(t6.r1(0.1f, t6.x0(null, t6.G6, false)), shapeDrawable);
                ImageView imageView = this.f43152a;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
