package vh;

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
import org.telegram.messenger.a2;
import org.telegram.messenger.em;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.yh0;
public final class n extends ViewGroup {
    public final GestureDetector f43385a;
    public final Path f43386b;
    public final RectF f43387c;
    public boolean d;
    public final o e;

    public n(o oVar, Context context) {
        super(context);
        this.e = oVar;
        this.f43385a = new GestureDetector(getContext(), new m(this));
        this.f43386b = new Path();
        this.f43387c = new RectF();
        this.d = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f43386b);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.e.f43390c.draw(canvas);
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int height = getHeight();
        o oVar = this.e;
        int i14 = oVar.f43388a;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = oVar.f43391f;
        int i15 = oVar.f43389b;
        int d = (height - oVar.d()) / 2;
        int width = getWidth();
        yh0 yh0Var = oVar.h;
        int measuredWidth = (width - yh0Var.getMeasuredWidth()) / 2;
        yh0Var.layout(measuredWidth, d, yh0Var.getMeasuredWidth() + measuredWidth, yh0Var.getMeasuredHeight() + d);
        l lVar = oVar.f43392n;
        lVar.layout(yh0Var.getLeft(), yh0Var.getTop(), yh0Var.getRight(), lVar.getMeasuredHeight() + yh0Var.getTop());
        int C = a2.C(12.0f, yh0Var.getMeasuredHeight(), d);
        TextView textView = oVar.d;
        textView.layout(AndroidUtilities.dp(16.0f) + yh0Var.getLeft(), C, yh0Var.getRight() - AndroidUtilities.dp(16.0f), textView.getMeasuredHeight() + C);
        int measuredHeight = textView.getMeasuredHeight() + C;
        TextView textView2 = oVar.e;
        int i16 = 8;
        if (textView2.getVisibility() != 8) {
            int dp = AndroidUtilities.dp(4.0f) + measuredHeight;
            textView2.layout(textView.getLeft(), dp, textView.getRight(), textView2.getMeasuredHeight() + dp);
            measuredHeight = textView2.getMeasuredHeight() + dp;
        }
        int dp2 = AndroidUtilities.dp(12.0f) + measuredHeight;
        oVar.f43390c.setBounds(yh0Var.getLeft() - i15, yh0Var.getTop() - i14, yh0Var.getRight() + i15, i14 + dp2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.layout((yh0Var.getRight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + i15, dp2, yh0Var.getRight() + i15, actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() + dp2);
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getBottom() < i13) {
            i16 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setVisibility(i16);
        int dp3 = AndroidUtilities.dp(6.0f);
        float top = (dp3 * 2) + yh0Var.getTop();
        RectF rectF = this.f43387c;
        rectF.set(yh0Var.getLeft(), yh0Var.getTop(), yh0Var.getRight(), top);
        Path path = this.f43386b;
        path.reset();
        float f7 = dp3;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f7, f7, direction);
        rectF.set(i10, yh0Var.getTop() + dp3, i12, i13);
        path.addRect(rectF, direction);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setWillNotDraw(false);
        super.onMeasure(i10, i11);
        int A = em.A(12.0f, 2, Math.min(Math.min(getMeasuredWidth(), getMeasuredHeight()), (int) (getMeasuredHeight() * 0.66d)));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(A, Integer.MIN_VALUE);
        o oVar = this.e;
        yh0 yh0Var = oVar.h;
        yh0Var.measure(makeMeasureSpec, makeMeasureSpec);
        oVar.f43392n.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(A - (AndroidUtilities.dp(16.0f) * 2), 1073741824);
        oVar.d.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        oVar.e.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        oVar.f43391f.measure(View.MeasureSpec.makeMeasureSpec((oVar.f43389b * 2) + yh0Var.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Point point = AndroidUtilities.displaySize;
        int i14 = point.x;
        int i15 = point.y;
        o oVar = this.e;
        if (i14 > i15) {
            super/*android.app.Dialog*/.dismiss();
        }
        if (i10 != i12 && i11 != i13) {
            if (!this.d) {
                oVar.f();
            }
            this.d = false;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f43385a.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.e.f43390c && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
