package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class u70 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final Paint f42291a;
    public final Path f42292b;
    public final ImageView f42293c;
    public final ei.e2 d;
    public GradientDrawable e;
    public final x70 f42294f;

    public u70(x70 x70Var, Context context, org.telegram.ui.ActionBar.u1 u1Var) {
        super(context);
        int i10;
        this.f42294f = x70Var;
        this.f42291a = new Paint(1);
        this.f42292b = new Path();
        setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f));
        setClipChildren(false);
        setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        this.f42293c = imageView;
        imageView.setImageResource(R.drawable.outline_search_1_24);
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.u(imageView, org.telegram.ui.ActionBar.r6.M(0.6f, i11), x70Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
        addView(imageView, w7.z5.d(24, 24.0f, 51, 11.0f, 8.0f, 11.0f, 8.0f));
        u1Var.setClipChildren(true);
        addView(u1Var, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 40.0f));
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
        e2Var.addTextChangedListener(new t70(this));
        if (Build.VERSION.SDK_INT >= 35) {
            e2Var.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        org.telegram.ui.ActionBar.r6.W(e2Var, i11, x70Var.getResourceProvider());
        org.telegram.ui.ActionBar.r6.F(e2Var, org.telegram.ui.ActionBar.k6.H6, x70Var.getResourceProvider());
        addView(e2Var, w7.z5.d(-1, 40.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21125a7));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33f);
        Paint paint = this.f42291a;
        paint.setShadowLayer(dpf2, 0.0f, dpf22, 285212672);
        int i10 = org.telegram.ui.ActionBar.k6.f21183d6;
        x70 x70Var = this.f42294f;
        paint.setColor(x70Var.getThemedColor(i10));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f), getWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f) + x70Var.f43522b.e + AndroidUtilities.dp(3.0f));
        Path path = this.f42292b;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), Path.Direction.CW);
        GradientDrawable gradientDrawable = this.e;
        if (gradientDrawable != null) {
            gradientDrawable.setBounds(0, 0, getWidth(), Math.min(getHeight(), AndroidUtilities.dp(24.0f) + ((int) x70Var.f43522b.e)));
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
        if (view == this.f42294f.e) {
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

    @Override
    public final void updateColors() {
        int themedColor = this.f42294f.getThemedColor(org.telegram.ui.ActionBar.k6.f21125a7);
        this.e = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.o1(1.0f, themedColor), org.telegram.ui.ActionBar.k6.o1(0.0f, themedColor)});
    }
}
