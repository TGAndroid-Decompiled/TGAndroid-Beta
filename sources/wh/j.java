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
import org.telegram.messenger.am;
import org.telegram.messenger.v0;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.wi0;
public final class j extends ViewGroup {
    public final GestureDetector f50650a;
    public final Path f50651b;
    public final RectF f50652c;
    public boolean d;
    public final k f50653e;

    public j(k kVar, Context context) {
        super(context);
        this.f50653e = kVar;
        this.f50650a = new GestureDetector(getContext(), new sg.e(1, this));
        this.f50651b = new Path();
        this.f50652c = new RectF();
        this.d = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f50651b);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.f50653e.f50656c.draw(canvas);
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int height = getHeight();
        k kVar = this.f50653e;
        int i14 = kVar.f50654a;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = kVar.f50658f;
        int i15 = kVar.f50655b;
        int d = (height - kVar.d()) / 2;
        int width = getWidth();
        wi0 wi0Var = kVar.h;
        int measuredWidth = (width - wi0Var.getMeasuredWidth()) / 2;
        wi0Var.layout(measuredWidth, d, wi0Var.getMeasuredWidth() + measuredWidth, wi0Var.getMeasuredHeight() + d);
        i iVar = kVar.f50659n;
        iVar.layout(wi0Var.getLeft(), wi0Var.getTop(), wi0Var.getRight(), iVar.getMeasuredHeight() + wi0Var.getTop());
        int C = v0.C(12.0f, wi0Var.getMeasuredHeight(), d);
        TextView textView = kVar.d;
        textView.layout(AndroidUtilities.dp(16.0f) + wi0Var.getLeft(), C, wi0Var.getRight() - AndroidUtilities.dp(16.0f), textView.getMeasuredHeight() + C);
        int measuredHeight = textView.getMeasuredHeight() + C;
        TextView textView2 = kVar.f50657e;
        int i16 = 8;
        if (textView2.getVisibility() != 8) {
            int dp = AndroidUtilities.dp(4.0f) + measuredHeight;
            textView2.layout(textView.getLeft(), dp, textView.getRight(), textView2.getMeasuredHeight() + dp);
            measuredHeight = textView2.getMeasuredHeight() + dp;
        }
        int dp2 = AndroidUtilities.dp(12.0f) + measuredHeight;
        kVar.f50656c.setBounds(wi0Var.getLeft() - i15, wi0Var.getTop() - i14, wi0Var.getRight() + i15, i14 + dp2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.layout((wi0Var.getRight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + i15, dp2, wi0Var.getRight() + i15, actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() + dp2);
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getBottom() < i13) {
            i16 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setVisibility(i16);
        int dp3 = AndroidUtilities.dp(6.0f);
        float top = (dp3 * 2) + wi0Var.getTop();
        RectF rectF = this.f50652c;
        rectF.set(wi0Var.getLeft(), wi0Var.getTop(), wi0Var.getRight(), top);
        Path path = this.f50651b;
        path.reset();
        float f7 = dp3;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f7, f7, direction);
        rectF.set(i10, wi0Var.getTop() + dp3, i12, i13);
        path.addRect(rectF, direction);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setWillNotDraw(false);
        super.onMeasure(i10, i11);
        int B = am.B(12.0f, 2, Math.min(Math.min(getMeasuredWidth(), getMeasuredHeight()), (int) (getMeasuredHeight() * 0.66d)));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(B, Integer.MIN_VALUE);
        k kVar = this.f50653e;
        wi0 wi0Var = kVar.h;
        wi0Var.measure(makeMeasureSpec, makeMeasureSpec);
        kVar.f50659n.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(B - (AndroidUtilities.dp(16.0f) * 2), 1073741824);
        kVar.d.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        kVar.f50657e.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        kVar.f50658f.measure(View.MeasureSpec.makeMeasureSpec((kVar.f50655b * 2) + wi0Var.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Point point = AndroidUtilities.displaySize;
        int i14 = point.x;
        int i15 = point.y;
        k kVar = this.f50653e;
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
        return this.f50650a.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f50653e.f50656c && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
