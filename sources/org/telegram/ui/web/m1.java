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
import c8.ja;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l2;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.g5;
public final class m1 extends FrameLayout implements z5 {
    public final ImageView f52716a;
    public final TextView f52717b;
    public final l2 f52718c;
    public g5 d;
    public String f52719e;
    public boolean f52720f;
    public ShapeDrawable h;

    public m1(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.f52716a = imageView;
        addView(imageView, ja.d(32, 32.0f, 19, 16.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f52717b = textView;
        q6.U(textView, j6.G6, null);
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, ja.d(-1, -2.0f, 55, 68.0f, 7.0f, 54.0f, 0.0f));
        l2 l2Var = new l2(11, context, this);
        this.f52718c = l2Var;
        q6.U(l2Var, j6.f29241y6, null);
        l2Var.setTextSize(1, 13.0f);
        l2Var.setMaxLines(1);
        l2Var.setEllipsize(truncateAt);
        l2Var.setPivotX(0.0f);
        addView(l2Var, ja.d(-1, -2.0f, 55, 68.0f, 30.0f, 54.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(2131231244);
        q6.s(imageView2, j6.A6, null, PorterDuff.Mode.SRC_IN);
        addView(imageView2, ja.d(32, 32.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f52720f) {
            canvas.drawRect(org.telegram.messenger.g0.L(64.0f), getHeight() - 1, getWidth(), getHeight(), j6.f28972k0);
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
                j6.C1(j6.r1(0.1f, j6.x0(null, j6.G6, false)), shapeDrawable);
                ImageView imageView = this.f52716a;
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
