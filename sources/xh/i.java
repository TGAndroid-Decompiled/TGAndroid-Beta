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
import org.telegram.messenger.g0;
import org.telegram.messenger.lk;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ki0;
public final class i extends ViewGroup {
    public final GestureDetector f49844a;
    public final Path f49845b;
    public final RectF f49846c;
    public boolean d;
    public final j e;

    public i(j jVar, Context context) {
        super(context);
        this.e = jVar;
        this.f49844a = new GestureDetector(getContext(), new tg.e(1, this));
        this.f49845b = new Path();
        this.f49846c = new RectF();
        this.d = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f49845b);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.e.f49849c.draw(canvas);
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int height = getHeight();
        j jVar = this.e;
        int i14 = jVar.f49847a;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = jVar.f49850f;
        int i15 = jVar.f49848b;
        int d = (height - jVar.d()) / 2;
        int width = getWidth();
        ki0 ki0Var = jVar.h;
        int measuredWidth = (width - ki0Var.getMeasuredWidth()) / 2;
        ki0Var.layout(measuredWidth, d, ki0Var.getMeasuredWidth() + measuredWidth, ki0Var.getMeasuredHeight() + d);
        h hVar = jVar.f49851n;
        hVar.layout(ki0Var.getLeft(), ki0Var.getTop(), ki0Var.getRight(), hVar.getMeasuredHeight() + ki0Var.getTop());
        int C = g0.C(12.0f, ki0Var.getMeasuredHeight(), d);
        TextView textView = jVar.d;
        textView.layout(AndroidUtilities.dp(16.0f) + ki0Var.getLeft(), C, ki0Var.getRight() - AndroidUtilities.dp(16.0f), textView.getMeasuredHeight() + C);
        int measuredHeight = textView.getMeasuredHeight() + C;
        TextView textView2 = jVar.e;
        int i16 = 8;
        if (textView2.getVisibility() != 8) {
            int dp = AndroidUtilities.dp(4.0f) + measuredHeight;
            textView2.layout(textView.getLeft(), dp, textView.getRight(), textView2.getMeasuredHeight() + dp);
            measuredHeight = textView2.getMeasuredHeight() + dp;
        }
        int dp2 = AndroidUtilities.dp(12.0f) + measuredHeight;
        jVar.f49849c.setBounds(ki0Var.getLeft() - i15, ki0Var.getTop() - i14, ki0Var.getRight() + i15, i14 + dp2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.layout((ki0Var.getRight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + i15, dp2, ki0Var.getRight() + i15, actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() + dp2);
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getBottom() < i13) {
            i16 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setVisibility(i16);
        int dp3 = AndroidUtilities.dp(6.0f);
        float top = (dp3 * 2) + ki0Var.getTop();
        RectF rectF = this.f49846c;
        rectF.set(ki0Var.getLeft(), ki0Var.getTop(), ki0Var.getRight(), top);
        Path path = this.f49845b;
        path.reset();
        float f7 = dp3;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f7, f7, direction);
        rectF.set(i10, ki0Var.getTop() + dp3, i12, i13);
        path.addRect(rectF, direction);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setWillNotDraw(false);
        super.onMeasure(i10, i11);
        int B = lk.B(12.0f, 2, Math.min(Math.min(getMeasuredWidth(), getMeasuredHeight()), (int) (getMeasuredHeight() * 0.66d)));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(B, Integer.MIN_VALUE);
        j jVar = this.e;
        ki0 ki0Var = jVar.h;
        ki0Var.measure(makeMeasureSpec, makeMeasureSpec);
        jVar.f49851n.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(B - (AndroidUtilities.dp(16.0f) * 2), 1073741824);
        jVar.d.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        jVar.e.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        jVar.f49850f.measure(View.MeasureSpec.makeMeasureSpec((jVar.f49848b * 2) + ki0Var.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
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
        return this.f49844a.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.e.f49849c && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
