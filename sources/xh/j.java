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
import org.telegram.messenger.sk;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.pi0;
public final class j extends ViewGroup {
    public final GestureDetector f48461a;
    public final Path f48462b;
    public final RectF f48463c;
    public boolean d;
    public final k e;

    public j(k kVar, Context context) {
        super(context);
        this.e = kVar;
        this.f48461a = new GestureDetector(getContext(), new tg.e(1, this));
        this.f48462b = new Path();
        this.f48463c = new RectF();
        this.d = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f48462b);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.e.f48466c.draw(canvas);
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int height = getHeight();
        k kVar = this.e;
        int i14 = kVar.f48464a;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = kVar.f48467f;
        int i15 = kVar.f48465b;
        int d = (height - kVar.d()) / 2;
        int width = getWidth();
        pi0 pi0Var = kVar.h;
        int measuredWidth = (width - pi0Var.getMeasuredWidth()) / 2;
        pi0Var.layout(measuredWidth, d, pi0Var.getMeasuredWidth() + measuredWidth, pi0Var.getMeasuredHeight() + d);
        i iVar = kVar.f48468n;
        iVar.layout(pi0Var.getLeft(), pi0Var.getTop(), pi0Var.getRight(), iVar.getMeasuredHeight() + pi0Var.getTop());
        int C = g0.C(12.0f, pi0Var.getMeasuredHeight(), d);
        TextView textView = kVar.d;
        textView.layout(AndroidUtilities.dp(16.0f) + pi0Var.getLeft(), C, pi0Var.getRight() - AndroidUtilities.dp(16.0f), textView.getMeasuredHeight() + C);
        int measuredHeight = textView.getMeasuredHeight() + C;
        TextView textView2 = kVar.e;
        int i16 = 8;
        if (textView2.getVisibility() != 8) {
            int dp = AndroidUtilities.dp(4.0f) + measuredHeight;
            textView2.layout(textView.getLeft(), dp, textView.getRight(), textView2.getMeasuredHeight() + dp);
            measuredHeight = textView2.getMeasuredHeight() + dp;
        }
        int dp2 = AndroidUtilities.dp(12.0f) + measuredHeight;
        kVar.f48466c.setBounds(pi0Var.getLeft() - i15, pi0Var.getTop() - i14, pi0Var.getRight() + i15, i14 + dp2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.layout((pi0Var.getRight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + i15, dp2, pi0Var.getRight() + i15, actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() + dp2);
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getBottom() < i13) {
            i16 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setVisibility(i16);
        int dp3 = AndroidUtilities.dp(6.0f);
        float top = (dp3 * 2) + pi0Var.getTop();
        RectF rectF = this.f48463c;
        rectF.set(pi0Var.getLeft(), pi0Var.getTop(), pi0Var.getRight(), top);
        Path path = this.f48462b;
        path.reset();
        float f7 = dp3;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f7, f7, direction);
        rectF.set(i10, pi0Var.getTop() + dp3, i12, i13);
        path.addRect(rectF, direction);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setWillNotDraw(false);
        super.onMeasure(i10, i11);
        int B = sk.B(12.0f, 2, Math.min(Math.min(getMeasuredWidth(), getMeasuredHeight()), (int) (getMeasuredHeight() * 0.66d)));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(B, Integer.MIN_VALUE);
        k kVar = this.e;
        pi0 pi0Var = kVar.h;
        pi0Var.measure(makeMeasureSpec, makeMeasureSpec);
        kVar.f48468n.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(B - (AndroidUtilities.dp(16.0f) * 2), 1073741824);
        kVar.d.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        kVar.e.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        kVar.f48467f.measure(View.MeasureSpec.makeMeasureSpec((kVar.f48465b * 2) + pi0Var.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Point point = AndroidUtilities.displaySize;
        int i14 = point.x;
        int i15 = point.y;
        k kVar = this.e;
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
        return this.f48461a.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.e.f48466c && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
