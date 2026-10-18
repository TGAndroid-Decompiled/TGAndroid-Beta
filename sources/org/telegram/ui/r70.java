package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class r70 extends FrameLayout implements org.telegram.ui.ActionBar.y5 {
    public final Paint f40583a;
    public final Path f40584b;
    public final ImageView f40585c;
    public final ei.e2 d;
    public GradientDrawable e;
    public final t70 f40586f;

    public r70(t70 t70Var, Context context, org.telegram.ui.ActionBar.v1 v1Var) {
        super(context);
        int i10;
        this.f40586f = t70Var;
        this.f40583a = new Paint(1);
        this.f40584b = new Path();
        setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f));
        setClipChildren(false);
        setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        this.f40585c = imageView;
        imageView.setImageResource(R.drawable.outline_search_1_24);
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.m1(0.6f, t70Var.getThemedColor(i11)), PorterDuff.Mode.SRC_IN));
        addView(imageView, w7.z5.d(24, 24.0f, 51, 11.0f, 8.0f, 11.0f, 8.0f));
        v1Var.setClipChildren(true);
        addView(v1Var, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 40.0f));
        ei.e2 e2Var = new ei.e2(this, context, 7);
        this.d = e2Var;
        e2Var.setHint(LocaleController.getString(R.string.Search));
        e2Var.setTextSize(1, 15.0f);
        e2Var.setCursorWidth(1.5f);
        e2Var.setInputType(e2Var.getInputType() | 176);
        e2Var.setSingleLine(true);
        e2Var.setBackground(null);
        e2Var.setVerticalScrollBarEnabled(false);
        e2Var.setHorizontalScrollBarEnabled(false);
        e2Var.setClipToPadding(true);
        e2Var.setPadding(AndroidUtilities.dp(46.0f), 0, AndroidUtilities.dp(46.0f), 0);
        e2Var.setEllipsizeByGradient(true);
        e2Var.setImeOptions(268435462);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        e2Var.setGravity(i10 | 16);
        e2Var.addTextChangedListener(new q70(this));
        if (Build.VERSION.SDK_INT >= 35) {
            e2Var.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        e2Var.setTextColor(t70Var.getThemedColor(i11));
        e2Var.setHintTextColor(t70Var.getThemedColor(org.telegram.ui.ActionBar.h6.H6));
        addView(e2Var, w7.z5.d(-1, 40.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        d();
    }

    @Override
    public final void d() {
        int themedColor = this.f40586f.getThemedColor(org.telegram.ui.ActionBar.h6.f20928a7);
        this.e = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.h6.m1(1.0f, themedColor), org.telegram.ui.ActionBar.h6.m1(0.0f, themedColor)});
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33f);
        Paint paint = this.f40583a;
        paint.setShadowLayer(dpf2, 0.0f, dpf22, 285212672);
        int i10 = org.telegram.ui.ActionBar.h6.f20986d6;
        t70 t70Var = this.f40586f;
        paint.setColor(t70Var.getThemedColor(i10));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f), getWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f) + t70Var.f41594b.e + AndroidUtilities.dp(3.0f));
        Path path = this.f40584b;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), Path.Direction.CW);
        GradientDrawable gradientDrawable = this.e;
        if (gradientDrawable != null) {
            gradientDrawable.setBounds(0, 0, getWidth(), Math.min(getHeight(), AndroidUtilities.dp(24.0f) + ((int) t70Var.f41594b.e)));
            this.e.draw(canvas);
        }
        canvas.save();
        canvas.drawPath(path, paint);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f40586f.e) {
            canvas.save();
            canvas.clipRect(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(144.0f), 1073741824));
    }
}
