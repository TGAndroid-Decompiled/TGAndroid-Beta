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
import org.telegram.messenger.camera.q;
import org.telegram.messenger.g0;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Cells.x9;
import org.telegram.ui.Components.sf0;
public final class k extends ViewGroup {
    public final GestureDetector f59429a;
    public final Path f59430b;
    public final RectF f59431c;
    public boolean d;
    public final l f59432e;

    public k(l lVar, Context context) {
        super(context);
        this.f59432e = lVar;
        this.f59429a = new GestureDetector(getContext(), new x9(2, this));
        this.f59430b = new Path();
        this.f59431c = new RectF();
        this.d = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f59430b);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.f59432e.f59435c.draw(canvas);
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int height = getHeight();
        l lVar = this.f59432e;
        int i13 = lVar.f59433a;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = lVar.f59437f;
        int i14 = lVar.f59434b;
        int d = (height - lVar.d()) / 2;
        int width = getWidth();
        sf0 sf0Var = lVar.h;
        int measuredWidth = (width - sf0Var.getMeasuredWidth()) / 2;
        sf0Var.layout(measuredWidth, d, sf0Var.getMeasuredWidth() + measuredWidth, sf0Var.getMeasuredHeight() + d);
        j jVar = lVar.f59438n;
        jVar.layout(sf0Var.getLeft(), sf0Var.getTop(), sf0Var.getRight(), jVar.getMeasuredHeight() + sf0Var.getTop());
        int C = k5.C(12.0f, sf0Var.getMeasuredHeight(), d);
        TextView textView = lVar.d;
        textView.layout(g0.L(16.0f) + sf0Var.getLeft(), C, sf0Var.getRight() - g0.L(16.0f), textView.getMeasuredHeight() + C);
        int measuredHeight = textView.getMeasuredHeight() + C;
        TextView textView2 = lVar.f59436e;
        int i15 = 8;
        if (textView2.getVisibility() != 8) {
            int L = g0.L(4.0f) + measuredHeight;
            textView2.layout(textView.getLeft(), L, textView.getRight(), textView2.getMeasuredHeight() + L);
            measuredHeight = textView2.getMeasuredHeight() + L;
        }
        int L2 = g0.L(12.0f) + measuredHeight;
        lVar.f59435c.setBounds(sf0Var.getLeft() - i14, sf0Var.getTop() - i13, sf0Var.getRight() + i14, i13 + L2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.layout((sf0Var.getRight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + i14, L2, sf0Var.getRight() + i14, actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() + L2);
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getBottom() < i12) {
            i15 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setVisibility(i15);
        int L3 = g0.L(6.0f);
        float top = (L3 * 2) + sf0Var.getTop();
        RectF rectF = this.f59431c;
        rectF.set(sf0Var.getLeft(), sf0Var.getTop(), sf0Var.getRight(), top);
        Path path = this.f59430b;
        path.reset();
        float f10 = L3;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f10, f10, direction);
        rectF.set(i7, sf0Var.getTop() + L3, i11, i12);
        path.addRect(rectF, direction);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setWillNotDraw(false);
        super.onMeasure(i7, i10);
        int A = q.A(12.0f, 2, Math.min(Math.min(getMeasuredWidth(), getMeasuredHeight()), (int) (getMeasuredHeight() * 0.66d)));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(A, Integer.MIN_VALUE);
        l lVar = this.f59432e;
        sf0 sf0Var = lVar.h;
        sf0Var.measure(makeMeasureSpec, makeMeasureSpec);
        lVar.f59438n.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(A - (g0.L(16.0f) * 2), 1073741824);
        lVar.d.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        lVar.f59436e.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        lVar.f59437f.measure(View.MeasureSpec.makeMeasureSpec((lVar.f59434b * 2) + sf0Var.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        Point point = g0.f22544q;
        int i13 = point.x;
        int i14 = point.y;
        l lVar = this.f59432e;
        if (i13 > i14) {
            super/*android.app.Dialog*/.dismiss();
        }
        if (i7 != i11 && i10 != i12) {
            if (!this.d) {
                lVar.f();
            }
            this.d = false;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f59429a.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f59432e.f59435c && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
