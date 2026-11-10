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
import c8.ha;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.h5;
public final class n1 extends FrameLayout implements c6 {
    public final ImageView f51184a;
    public final TextView f51185b;
    public final n2 f51186c;
    public h5 d;
    public String f51187e;
    public boolean f51188f;
    public ShapeDrawable h;

    public n1(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.f51184a = imageView;
        addView(imageView, ha.d(32, 32.0f, 19, 16.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f51185b = textView;
        t6.U(textView, m6.G6, null);
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, ha.d(-1, -2.0f, 55, 68.0f, 7.0f, 54.0f, 0.0f));
        n2 n2Var = new n2(11, context, this);
        this.f51186c = n2Var;
        t6.U(n2Var, m6.f28282y6, null);
        n2Var.setTextSize(1, 13.0f);
        n2Var.setMaxLines(1);
        n2Var.setEllipsize(truncateAt);
        n2Var.setPivotX(0.0f);
        addView(n2Var, ha.d(-1, -2.0f, 55, 68.0f, 30.0f, 54.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(2131231244);
        t6.s(imageView2, m6.A6, null, PorterDuff.Mode.SRC_IN);
        addView(imageView2, ha.d(32, 32.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f51188f) {
            canvas.drawRect(org.telegram.messenger.g0.L(64.0f), getHeight() - 1, getWidth(), getHeight(), m6.f28013k0);
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
                m6.C1(m6.r1(0.1f, m6.x0(null, m6.G6, false)), shapeDrawable);
                ImageView imageView = this.f51184a;
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
