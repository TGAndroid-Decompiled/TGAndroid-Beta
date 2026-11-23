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
import c8.na;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.o5;
public final class m1 extends FrameLayout implements c6 {
    public final ImageView f53478a;
    public final TextView f53479b;
    public final n2 f53480c;
    public o5 d;
    public String f53481e;
    public boolean f53482f;
    public ShapeDrawable h;

    public m1(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.f53478a = imageView;
        addView(imageView, na.d(32, 32.0f, 19, 16.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f53479b = textView;
        u6.U(textView, n6.G6, null);
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, na.d(-1, -2.0f, 55, 68.0f, 7.0f, 54.0f, 0.0f));
        n2 n2Var = new n2(11, context, this);
        this.f53480c = n2Var;
        u6.U(n2Var, n6.f29843y6, null);
        n2Var.setTextSize(1, 13.0f);
        n2Var.setMaxLines(1);
        n2Var.setEllipsize(truncateAt);
        n2Var.setPivotX(0.0f);
        addView(n2Var, na.d(-1, -2.0f, 55, 68.0f, 30.0f, 54.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(2131231247);
        u6.s(imageView2, n6.A6, null, PorterDuff.Mode.SRC_IN);
        addView(imageView2, na.d(32, 32.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f53482f) {
            canvas.drawRect(org.telegram.messenger.g0.L(64.0f), getHeight() - 1, getWidth(), getHeight(), n6.f29574k0);
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
                ImageView imageView = this.f53478a;
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
