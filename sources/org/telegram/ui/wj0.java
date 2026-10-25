package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class wj0 extends FrameLayout {
    public final Paint f45500a;
    public final RectF f45501b;
    public final TextView[] f45502c;
    public final xj0 d;

    public wj0(xj0 xj0Var, Context context) {
        super(context);
        int i10;
        this.d = xj0Var;
        this.f45500a = new Paint(1);
        this.f45501b = new RectF();
        this.f45502c = new TextView[2];
        setWillNotDraw(false);
        for (int i11 = 0; i11 < 2; i11++) {
            TextView[] textViewArr = this.f45502c;
            TextView textView = new TextView(context);
            textViewArr[i11] = textView;
            if (i11 == 0) {
                i10 = R.string.NewsForYou;
            } else {
                i10 = R.string.Added;
            }
            textView.setText(LocaleController.getString(i10));
            textView.setTextSize(14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            textView.setIncludeFontPadding(false);
            textView.setOnClickListener(new ai.w(this, i11, 26));
            addView(textView);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f45500a;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dpf2(0.6f));
        int i10 = org.telegram.ui.ActionBar.y6.f23355d7;
        xj0 xj0Var = this.d;
        paint.setColor(xj0Var.getThemedColor(i10));
        float height = getHeight() - AndroidUtilities.dp(0.5f);
        RectF rectF = this.f45501b;
        rectF.set(AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f), getWidth() - AndroidUtilities.dp(0.5f), height);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(xj0Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23297a7));
        float width = (getWidth() - AndroidUtilities.dp(6.0f)) / 2.0f;
        float positionAnimated = (xj0Var.v.getPositionAnimated() * width) + AndroidUtilities.dp(3.0f);
        rectF.set(positionAnimated, AndroidUtilities.dp(3.0f), width + positionAnimated, AndroidUtilities.dp(33.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), paint);
        for (int i11 = 0; i11 < 2; i11++) {
            TextView[] textViewArr = this.f45502c;
            TextView textView = textViewArr[i11];
            if (xj0Var.v.getCurrentPosition() == i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            textView.setSelected(z10);
            textViewArr[i11].setTextColor(i0.a.f(Math.max(0.0f, 1.0f - Math.abs(xj0Var.v.getPositionAnimated() - i11)), xj0Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23746y6), xj0Var.getThemedColor(org.telegram.ui.ActionBar.y6.G6)));
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        for (int i14 = 0; i14 < 2; i14++) {
            int width = (((getWidth() - AndroidUtilities.dp(6.0f)) * i14) / 2) + AndroidUtilities.dp(3.0f);
            TextView[] textViewArr = this.f45502c;
            textViewArr[i14].layout(width, AndroidUtilities.dp(3.0f), textViewArr[i14].getMeasuredWidth() + width, AndroidUtilities.dp(33.0f));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        for (TextView textView : this.f45502c) {
            textView.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - AndroidUtilities.dp(6.0f)) / 2, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
        }
    }
}
