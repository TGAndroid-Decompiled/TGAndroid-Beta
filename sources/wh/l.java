package wh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.f0;
import org.telegram.messenger.ok;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ci0;
public final class l extends ViewGroup {
    public final GestureDetector f45484a;
    public final Path f45485b;
    public final RectF f45486c;
    public boolean d;
    public final m e;

    public l(m mVar, Context context) {
        super(context);
        this.e = mVar;
        this.f45484a = new GestureDetector(getContext(), new k(this));
        this.f45485b = new Path();
        this.f45486c = new RectF();
        this.d = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f45485b);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.e.f45489c.draw(canvas);
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int height = getHeight();
        m mVar = this.e;
        int i14 = mVar.f45487a;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = mVar.f45490f;
        int i15 = mVar.f45488b;
        int d = (height - mVar.d()) / 2;
        int width = getWidth();
        ci0 ci0Var = mVar.h;
        int measuredWidth = (width - ci0Var.getMeasuredWidth()) / 2;
        ci0Var.layout(measuredWidth, d, ci0Var.getMeasuredWidth() + measuredWidth, ci0Var.getMeasuredHeight() + d);
        j jVar = mVar.f45491n;
        jVar.layout(ci0Var.getLeft(), ci0Var.getTop(), ci0Var.getRight(), jVar.getMeasuredHeight() + ci0Var.getTop());
        int C = f0.C(12.0f, ci0Var.getMeasuredHeight(), d);
        TextView textView = mVar.d;
        textView.layout(AndroidUtilities.dp(16.0f) + ci0Var.getLeft(), C, ci0Var.getRight() - AndroidUtilities.dp(16.0f), textView.getMeasuredHeight() + C);
        int measuredHeight = textView.getMeasuredHeight() + C;
        TextView textView2 = mVar.e;
        int i16 = 8;
        if (textView2.getVisibility() != 8) {
            int dp = AndroidUtilities.dp(4.0f) + measuredHeight;
            textView2.layout(textView.getLeft(), dp, textView.getRight(), textView2.getMeasuredHeight() + dp);
            measuredHeight = textView2.getMeasuredHeight() + dp;
        }
        int dp2 = AndroidUtilities.dp(12.0f) + measuredHeight;
        mVar.f45489c.setBounds(ci0Var.getLeft() - i15, ci0Var.getTop() - i14, ci0Var.getRight() + i15, i14 + dp2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.layout((ci0Var.getRight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + i15, dp2, ci0Var.getRight() + i15, actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() + dp2);
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getBottom() < i13) {
            i16 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setVisibility(i16);
        int dp3 = AndroidUtilities.dp(6.0f);
        float top = (dp3 * 2) + ci0Var.getTop();
        RectF rectF = this.f45486c;
        rectF.set(ci0Var.getLeft(), ci0Var.getTop(), ci0Var.getRight(), top);
        Path path = this.f45485b;
        path.reset();
        float f7 = dp3;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f7, f7, direction);
        rectF.set(i10, ci0Var.getTop() + dp3, i12, i13);
        path.addRect(rectF, direction);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setWillNotDraw(false);
        super.onMeasure(i10, i11);
        int B = ok.B(12.0f, 2, Math.min(Math.min(getMeasuredWidth(), getMeasuredHeight()), (int) (getMeasuredHeight() * 0.66d)));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(B, Integer.MIN_VALUE);
        m mVar = this.e;
        ci0 ci0Var = mVar.h;
        ci0Var.measure(makeMeasureSpec, makeMeasureSpec);
        mVar.f45491n.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(B - (AndroidUtilities.dp(16.0f) * 2), 1073741824);
        mVar.d.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        mVar.e.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        mVar.f45490f.measure(View.MeasureSpec.makeMeasureSpec((mVar.f45488b * 2) + ci0Var.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Point point = AndroidUtilities.displaySize;
        int i14 = point.x;
        int i15 = point.y;
        m mVar = this.e;
        if (i14 > i15) {
            super/*android.app.Dialog*/.dismiss();
        }
        if (i10 != i12 && i11 != i13) {
            if (!this.d) {
                mVar.f();
            }
            this.d = false;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f45484a.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.e.f45489c && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
