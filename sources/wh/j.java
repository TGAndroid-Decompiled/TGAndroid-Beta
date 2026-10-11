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
import org.telegram.messenger.ai;
import org.telegram.messenger.q;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.vi0;
public final class j extends ViewGroup {
    public final GestureDetector f50501a;
    public final Path f50502b;
    public final RectF f50503c;
    public boolean d;
    public final k f50504e;

    public j(k kVar, Context context) {
        super(context);
        this.f50504e = kVar;
        this.f50501a = new GestureDetector(getContext(), new sg.e(1, this));
        this.f50502b = new Path();
        this.f50503c = new RectF();
        this.d = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f50502b);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.f50504e.f50507c.draw(canvas);
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int height = getHeight();
        k kVar = this.f50504e;
        int i14 = kVar.f50505a;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = kVar.f50509f;
        int i15 = kVar.f50506b;
        int d = (height - kVar.d()) / 2;
        int width = getWidth();
        vi0 vi0Var = kVar.h;
        int measuredWidth = (width - vi0Var.getMeasuredWidth()) / 2;
        vi0Var.layout(measuredWidth, d, vi0Var.getMeasuredWidth() + measuredWidth, vi0Var.getMeasuredHeight() + d);
        i iVar = kVar.f50510n;
        iVar.layout(vi0Var.getLeft(), vi0Var.getTop(), vi0Var.getRight(), iVar.getMeasuredHeight() + vi0Var.getTop());
        int C = q.C(12.0f, vi0Var.getMeasuredHeight(), d);
        TextView textView = kVar.d;
        textView.layout(AndroidUtilities.dp(16.0f) + vi0Var.getLeft(), C, vi0Var.getRight() - AndroidUtilities.dp(16.0f), textView.getMeasuredHeight() + C);
        int measuredHeight = textView.getMeasuredHeight() + C;
        TextView textView2 = kVar.f50508e;
        int i16 = 8;
        if (textView2.getVisibility() != 8) {
            int dp = AndroidUtilities.dp(4.0f) + measuredHeight;
            textView2.layout(textView.getLeft(), dp, textView.getRight(), textView2.getMeasuredHeight() + dp);
            measuredHeight = textView2.getMeasuredHeight() + dp;
        }
        int dp2 = AndroidUtilities.dp(12.0f) + measuredHeight;
        kVar.f50507c.setBounds(vi0Var.getLeft() - i15, vi0Var.getTop() - i14, vi0Var.getRight() + i15, i14 + dp2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.layout((vi0Var.getRight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + i15, dp2, vi0Var.getRight() + i15, actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() + dp2);
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getBottom() < i13) {
            i16 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setVisibility(i16);
        int dp3 = AndroidUtilities.dp(6.0f);
        float top = (dp3 * 2) + vi0Var.getTop();
        RectF rectF = this.f50503c;
        rectF.set(vi0Var.getLeft(), vi0Var.getTop(), vi0Var.getRight(), top);
        Path path = this.f50502b;
        path.reset();
        float f7 = dp3;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f7, f7, direction);
        rectF.set(i10, vi0Var.getTop() + dp3, i12, i13);
        path.addRect(rectF, direction);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setWillNotDraw(false);
        super.onMeasure(i10, i11);
        int B = ai.B(12.0f, 2, Math.min(Math.min(getMeasuredWidth(), getMeasuredHeight()), (int) (getMeasuredHeight() * 0.66d)));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(B, Integer.MIN_VALUE);
        k kVar = this.f50504e;
        vi0 vi0Var = kVar.h;
        vi0Var.measure(makeMeasureSpec, makeMeasureSpec);
        kVar.f50510n.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(B - (AndroidUtilities.dp(16.0f) * 2), 1073741824);
        kVar.d.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        kVar.f50508e.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        kVar.f50509f.measure(View.MeasureSpec.makeMeasureSpec((kVar.f50506b * 2) + vi0Var.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Point point = AndroidUtilities.displaySize;
        int i14 = point.x;
        int i15 = point.y;
        k kVar = this.f50504e;
        if (i14 > i15) {
            super/*android.app.Dialog*/.dismiss();
        }
        if (i10 != i12 && i11 != i13) {
            if (!this.d) {
                kVar.f();
            }
            this.d = false;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f50501a.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f50504e.f50507c && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
