package yh;

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
import org.telegram.messenger.t;
import org.telegram.messenger.wh;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.oi0;
public final class i extends ViewGroup {
    public final GestureDetector f52655a;
    public final Path f52656b;
    public final RectF f52657c;
    public boolean d;
    public final j e;

    public i(j jVar, Context context) {
        super(context);
        this.e = jVar;
        this.f52655a = new GestureDetector(getContext(), new ug.e(1, this));
        this.f52656b = new Path();
        this.f52657c = new RectF();
        this.d = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f52656b);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.e.f52660c.draw(canvas);
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int height = getHeight();
        j jVar = this.e;
        int i14 = jVar.f52658a;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = jVar.f52661f;
        int i15 = jVar.f52659b;
        int d = (height - jVar.d()) / 2;
        int width = getWidth();
        oi0 oi0Var = jVar.h;
        int measuredWidth = (width - oi0Var.getMeasuredWidth()) / 2;
        oi0Var.layout(measuredWidth, d, oi0Var.getMeasuredWidth() + measuredWidth, oi0Var.getMeasuredHeight() + d);
        h hVar = jVar.f52662n;
        hVar.layout(oi0Var.getLeft(), oi0Var.getTop(), oi0Var.getRight(), hVar.getMeasuredHeight() + oi0Var.getTop());
        int D = t.D(12.0f, oi0Var.getMeasuredHeight(), d);
        TextView textView = jVar.d;
        textView.layout(AndroidUtilities.dp(16.0f) + oi0Var.getLeft(), D, oi0Var.getRight() - AndroidUtilities.dp(16.0f), textView.getMeasuredHeight() + D);
        int measuredHeight = textView.getMeasuredHeight() + D;
        TextView textView2 = jVar.e;
        int i16 = 8;
        if (textView2.getVisibility() != 8) {
            int dp = AndroidUtilities.dp(4.0f) + measuredHeight;
            textView2.layout(textView.getLeft(), dp, textView.getRight(), textView2.getMeasuredHeight() + dp);
            measuredHeight = textView2.getMeasuredHeight() + dp;
        }
        int dp2 = AndroidUtilities.dp(12.0f) + measuredHeight;
        jVar.f52660c.setBounds(oi0Var.getLeft() - i15, oi0Var.getTop() - i14, oi0Var.getRight() + i15, i14 + dp2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.layout((oi0Var.getRight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + i15, dp2, oi0Var.getRight() + i15, actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() + dp2);
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getBottom() < i13) {
            i16 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setVisibility(i16);
        int dp3 = AndroidUtilities.dp(6.0f);
        float top = (dp3 * 2) + oi0Var.getTop();
        RectF rectF = this.f52657c;
        rectF.set(oi0Var.getLeft(), oi0Var.getTop(), oi0Var.getRight(), top);
        Path path = this.f52656b;
        path.reset();
        float f7 = dp3;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f7, f7, direction);
        rectF.set(i10, oi0Var.getTop() + dp3, i12, i13);
        path.addRect(rectF, direction);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setWillNotDraw(false);
        super.onMeasure(i10, i11);
        int C = wh.C(12.0f, 2, Math.min(Math.min(getMeasuredWidth(), getMeasuredHeight()), (int) (getMeasuredHeight() * 0.66d)));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(C, Integer.MIN_VALUE);
        j jVar = this.e;
        oi0 oi0Var = jVar.h;
        oi0Var.measure(makeMeasureSpec, makeMeasureSpec);
        jVar.f52662n.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(C - (AndroidUtilities.dp(16.0f) * 2), 1073741824);
        jVar.d.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        jVar.e.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        jVar.f52661f.measure(View.MeasureSpec.makeMeasureSpec((jVar.f52659b * 2) + oi0Var.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Point point = AndroidUtilities.displaySize;
        int i14 = point.x;
        int i15 = point.y;
        j jVar = this.e;
        if (i14 > i15) {
            super/*android.app.Dialog*/.dismiss();
        }
        if (i10 != i12 && i11 != i13) {
            if (!this.d) {
                jVar.f();
            }
            this.d = false;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f52655a.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.e.f52660c && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
