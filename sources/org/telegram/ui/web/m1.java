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
import c8.ma;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.o5;
public final class m1 extends FrameLayout implements c6 {
    public final ImageView f53245a;
    public final TextView f53246b;
    public final o2 f53247c;
    public o5 d;
    public String f53248e;
    public boolean f53249f;
    public ShapeDrawable h;

    public m1(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.f53245a = imageView;
        addView(imageView, ma.d(32, 32.0f, 19, 16.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f53246b = textView;
        u6.U(textView, n6.G6, null);
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, ma.d(-1, -2.0f, 55, 68.0f, 7.0f, 54.0f, 0.0f));
        o2 o2Var = new o2(11, context, this);
        this.f53247c = o2Var;
        u6.U(o2Var, n6.f29788y6, null);
        o2Var.setTextSize(1, 13.0f);
        o2Var.setMaxLines(1);
        o2Var.setEllipsize(truncateAt);
        o2Var.setPivotX(0.0f);
        addView(o2Var, ma.d(-1, -2.0f, 55, 68.0f, 30.0f, 54.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(2131231244);
        u6.s(imageView2, n6.A6, null, PorterDuff.Mode.SRC_IN);
        addView(imageView2, ma.d(32, 32.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f53249f) {
            canvas.drawRect(org.telegram.messenger.g0.L(64.0f), getHeight() - 1, getWidth(), getHeight(), n6.f29519k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            ShapeDrawable shapeDrawable = this.h;
            if (shapeDrawable != null) {
                n6.C1(n6.r1(0.1f, n6.x0(null, n6.G6, false)), shapeDrawable);
                ImageView imageView = this.f53245a;
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
