package xh;

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
import org.telegram.messenger.tl;
import org.telegram.messenger.v0;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ni0;
public final class i extends ViewGroup {
    public final GestureDetector f50293a;
    public final Path f50294b;
    public final RectF f50295c;
    public boolean d;
    public final j e;

    public i(j jVar, Context context) {
        super(context);
        this.e = jVar;
        this.f50293a = new GestureDetector(getContext(), new tg.e(1, this));
        this.f50294b = new Path();
        this.f50295c = new RectF();
        this.d = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f50294b);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.e.f50298c.draw(canvas);
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int height = getHeight();
        j jVar = this.e;
        int i14 = jVar.f50296a;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = jVar.f50299f;
        int i15 = jVar.f50297b;
        int d = (height - jVar.d()) / 2;
        int width = getWidth();
        ni0 ni0Var = jVar.h;
        int measuredWidth = (width - ni0Var.getMeasuredWidth()) / 2;
        ni0Var.layout(measuredWidth, d, ni0Var.getMeasuredWidth() + measuredWidth, ni0Var.getMeasuredHeight() + d);
        h hVar = jVar.f50300n;
        hVar.layout(ni0Var.getLeft(), ni0Var.getTop(), ni0Var.getRight(), hVar.getMeasuredHeight() + ni0Var.getTop());
        int C = v0.C(12.0f, ni0Var.getMeasuredHeight(), d);
        TextView textView = jVar.d;
        textView.layout(AndroidUtilities.dp(16.0f) + ni0Var.getLeft(), C, ni0Var.getRight() - AndroidUtilities.dp(16.0f), textView.getMeasuredHeight() + C);
        int measuredHeight = textView.getMeasuredHeight() + C;
        TextView textView2 = jVar.e;
        int i16 = 8;
        if (textView2.getVisibility() != 8) {
            int dp = AndroidUtilities.dp(4.0f) + measuredHeight;
            textView2.layout(textView.getLeft(), dp, textView.getRight(), textView2.getMeasuredHeight() + dp);
            measuredHeight = textView2.getMeasuredHeight() + dp;
        }
        int dp2 = AndroidUtilities.dp(12.0f) + measuredHeight;
        jVar.f50298c.setBounds(ni0Var.getLeft() - i15, ni0Var.getTop() - i14, ni0Var.getRight() + i15, i14 + dp2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.layout((ni0Var.getRight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + i15, dp2, ni0Var.getRight() + i15, actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() + dp2);
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getBottom() < i13) {
            i16 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setVisibility(i16);
        int dp3 = AndroidUtilities.dp(6.0f);
        float top = (dp3 * 2) + ni0Var.getTop();
        RectF rectF = this.f50295c;
        rectF.set(ni0Var.getLeft(), ni0Var.getTop(), ni0Var.getRight(), top);
        Path path = this.f50294b;
        path.reset();
        float f7 = dp3;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f7, f7, direction);
        rectF.set(i10, ni0Var.getTop() + dp3, i12, i13);
        path.addRect(rectF, direction);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setWillNotDraw(false);
        super.onMeasure(i10, i11);
        int B = tl.B(12.0f, 2, Math.min(Math.min(getMeasuredWidth(), getMeasuredHeight()), (int) (getMeasuredHeight() * 0.66d)));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(B, Integer.MIN_VALUE);
        j jVar = this.e;
        ni0 ni0Var = jVar.h;
        ni0Var.measure(makeMeasureSpec, makeMeasureSpec);
        jVar.f50300n.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(B - (AndroidUtilities.dp(16.0f) * 2), 1073741824);
        jVar.d.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        jVar.e.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        jVar.f50299f.measure(View.MeasureSpec.makeMeasureSpec((jVar.f50297b * 2) + ni0Var.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
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
        return this.f50293a.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.e.f50298c && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
