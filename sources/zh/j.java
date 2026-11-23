package zh;

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
import org.telegram.messenger.f3;
import org.telegram.messenger.g0;
import org.telegram.messenger.o10;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Cells.z9;
import org.telegram.ui.Components.hg0;
public final class j extends ViewGroup {
    public final GestureDetector f62039a;
    public final Path f62040b;
    public final RectF f62041c;
    public boolean d;
    public final k f62042e;

    public j(k kVar, Context context) {
        super(context);
        this.f62042e = kVar;
        this.f62039a = new GestureDetector(getContext(), new z9(2, this));
        this.f62040b = new Path();
        this.f62041c = new RectF();
        this.d = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f62040b);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.f62042e.f62045c.draw(canvas);
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int height = getHeight();
        k kVar = this.f62042e;
        int i13 = kVar.f62043a;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = kVar.f62047f;
        int i14 = kVar.f62044b;
        int d = (height - kVar.d()) / 2;
        int width = getWidth();
        hg0 hg0Var = kVar.h;
        int measuredWidth = (width - hg0Var.getMeasuredWidth()) / 2;
        hg0Var.layout(measuredWidth, d, hg0Var.getMeasuredWidth() + measuredWidth, hg0Var.getMeasuredHeight() + d);
        i iVar = kVar.f62048n;
        iVar.layout(hg0Var.getLeft(), hg0Var.getTop(), hg0Var.getRight(), iVar.getMeasuredHeight() + hg0Var.getTop());
        int C = f3.C(12.0f, hg0Var.getMeasuredHeight(), d);
        TextView textView = kVar.d;
        textView.layout(g0.L(16.0f) + hg0Var.getLeft(), C, hg0Var.getRight() - g0.L(16.0f), textView.getMeasuredHeight() + C);
        int measuredHeight = textView.getMeasuredHeight() + C;
        TextView textView2 = kVar.f62046e;
        int i15 = 8;
        if (textView2.getVisibility() != 8) {
            int L = g0.L(4.0f) + measuredHeight;
            textView2.layout(textView.getLeft(), L, textView.getRight(), textView2.getMeasuredHeight() + L);
            measuredHeight = textView2.getMeasuredHeight() + L;
        }
        int L2 = g0.L(12.0f) + measuredHeight;
        kVar.f62045c.setBounds(hg0Var.getLeft() - i14, hg0Var.getTop() - i13, hg0Var.getRight() + i14, i13 + L2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.layout((hg0Var.getRight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + i14, L2, hg0Var.getRight() + i14, actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() + L2);
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getBottom() < i12) {
            i15 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setVisibility(i15);
        int L3 = g0.L(6.0f);
        float top = (L3 * 2) + hg0Var.getTop();
        RectF rectF = this.f62041c;
        rectF.set(hg0Var.getLeft(), hg0Var.getTop(), hg0Var.getRight(), top);
        Path path = this.f62040b;
        path.reset();
        float f10 = L3;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f10, f10, direction);
        rectF.set(i7, hg0Var.getTop() + L3, i11, i12);
        path.addRect(rectF, direction);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setWillNotDraw(false);
        super.onMeasure(i7, i10);
        int B = o10.B(12.0f, 2, Math.min(Math.min(getMeasuredWidth(), getMeasuredHeight()), (int) (getMeasuredHeight() * 0.66d)));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(B, Integer.MIN_VALUE);
        k kVar = this.f62042e;
        hg0 hg0Var = kVar.h;
        hg0Var.measure(makeMeasureSpec, makeMeasureSpec);
        kVar.f62048n.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(B - (g0.L(16.0f) * 2), 1073741824);
        kVar.d.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        kVar.f62046e.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        kVar.f62047f.measure(View.MeasureSpec.makeMeasureSpec((kVar.f62044b * 2) + hg0Var.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        Point point = g0.f24046q;
        int i13 = point.x;
        int i14 = point.y;
        k kVar = this.f62042e;
        if (i13 > i14) {
            k.c(kVar);
        }
        if (i7 != i11 && i10 != i12) {
            if (!this.d) {
                kVar.f();
            }
            this.d = false;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f62039a.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f62042e.f62045c && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
