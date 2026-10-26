package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class wu0 extends org.telegram.ui.Components.mm0 {
    public final Drawable f45557f3;
    public final Paint f45558g3;
    public final RectF f45559h3;

    public wu0(Context context) {
        super(context, null);
        Paint paint = new Paint(1);
        this.f45558g3 = paint;
        this.f45559h3 = new RectF();
        setWillNotDraw(false);
        setClipToPadding(false);
        setTranslationY(-AndroidUtilities.dp(10.0f));
        vu0 vu0Var = new vu0(this);
        setItemAnimator(vu0Var);
        vu0Var.C = false;
        vu0Var.f47763m = false;
        setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
        paint.setColor(2130706432);
        this.f45557f3 = context.getResources().getDrawable(R.drawable.photo_tooltip2).mutate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int childCount = getChildCount();
        if (childCount > 0) {
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(87.0f);
            Drawable drawable = this.f45557f3;
            drawable.setBounds(measuredWidth, 0, drawable.getIntrinsicWidth() + measuredWidth, AndroidUtilities.dp(6.0f));
            drawable.draw(canvas);
            int i10 = Integer.MIN_VALUE;
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                i11 = (int) Math.min(i11, Math.floor(childAt.getX()));
                i10 = (int) Math.max(i10, Math.ceil(childAt.getX() + childAt.getMeasuredWidth()));
            }
            if (i11 != Integer.MAX_VALUE && i10 != Integer.MIN_VALUE) {
                RectF rectF = this.f45559h3;
                rectF.set(i11 - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f) + i10, AndroidUtilities.dp(103.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f45558g3);
            }
        }
    }
}
