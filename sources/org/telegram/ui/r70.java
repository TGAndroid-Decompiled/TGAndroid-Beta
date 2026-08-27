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

public final class r70 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {

    public final Paint f41827a;

    public final Path f41828b;

    public final ImageView f41829c;
    public final gg.g d;

    public GradientDrawable f41830e;

    public final t70 f41831f;

    public r70(t70 t70Var, Context context, org.telegram.ui.ActionBar.v1 v1Var) {
        super(context);
        this.f41831f = t70Var;
        this.f41827a = new Paint(1);
        this.f41828b = new Path();
        setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f));
        setClipChildren(false);
        setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        this.f41829c = imageView;
        imageView.setImageResource(R.drawable.outline_search_1_24);
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.l1(0.6f, t70Var.getThemedColor(i10)), PorterDuff.Mode.SRC_IN));
        addView(imageView, h7.z5.d(24, 24.0f, 51, 11.0f, 8.0f, 11.0f, 8.0f));
        v1Var.setClipChildren(true);
        addView(v1Var, h7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 40.0f));
        gg.g gVar = new gg.g(this, context, 8);
        this.d = gVar;
        gVar.setHint(LocaleController.getString(R.string.Search));
        gVar.setTextSize(1, 15.0f);
        gVar.setCursorWidth(1.5f);
        gVar.setInputType(gVar.getInputType() | 176);
        gVar.setSingleLine(true);
        gVar.setBackground(null);
        gVar.setVerticalScrollBarEnabled(false);
        gVar.setHorizontalScrollBarEnabled(false);
        gVar.setClipToPadding(true);
        gVar.setPadding(AndroidUtilities.dp(46.0f), 0, AndroidUtilities.dp(46.0f), 0);
        gVar.setEllipsizeByGradient(true);
        gVar.setImeOptions(268435462);
        gVar.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        gVar.addTextChangedListener(new q70(this));
        if (Build.VERSION.SDK_INT >= 35) {
            gVar.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        gVar.setTextColor(t70Var.getThemedColor(i10));
        gVar.setHintTextColor(t70Var.getThemedColor(org.telegram.ui.ActionBar.g6.H6));
        addView(gVar, h7.z5.d(-1, 40.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        d();
    }

    @Override
    public final void d() {
        int themedColor = this.f41831f.getThemedColor(org.telegram.ui.ActionBar.g6.f22999a7);
        this.f41830e = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.g6.l1(1.0f, themedColor), org.telegram.ui.ActionBar.g6.l1(0.0f, themedColor)});
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float fDpf2 = AndroidUtilities.dpf2(2.0f);
        float fDpf3 = AndroidUtilities.dpf2(0.33f);
        Paint paint = this.f41827a;
        paint.setShadowLayer(fDpf2, 0.0f, fDpf3, 285212672);
        int i10 = org.telegram.ui.ActionBar.g6.f23053d6;
        t70 t70Var = this.f41831f;
        paint.setColor(t70Var.getThemedColor(i10));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f), getWidth() - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.0f) + t70Var.f42795b.f48502e + AndroidUtilities.dp(3.0f));
        Path path = this.f41828b;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), Path.Direction.CW);
        GradientDrawable gradientDrawable = this.f41830e;
        if (gradientDrawable != null) {
            gradientDrawable.setBounds(0, 0, getWidth(), Math.min(getHeight(), AndroidUtilities.dp(24.0f) + ((int) t70Var.f42795b.f48502e)));
            this.f41830e.draw(canvas);
        }
        canvas.save();
        canvas.drawPath(path, paint);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.f41831f.f42797e) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.clipRect(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return zDrawChild;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(144.0f), 1073741824));
    }
}
