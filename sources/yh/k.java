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
import org.telegram.ui.Components.tf0;
public final class k extends ViewGroup {
    public final GestureDetector f59537a;
    public final Path f59538b;
    public final RectF f59539c;
    public boolean d;
    public final l f59540e;

    public k(l lVar, Context context) {
        super(context);
        this.f59540e = lVar;
        this.f59537a = new GestureDetector(getContext(), new x9(2, this));
        this.f59538b = new Path();
        this.f59539c = new RectF();
        this.d = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f59538b);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.f59540e.f59543c.draw(canvas);
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int height = getHeight();
        l lVar = this.f59540e;
        int i13 = lVar.f59541a;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = lVar.f59545f;
        int i14 = lVar.f59542b;
        int d = (height - lVar.d()) / 2;
        int width = getWidth();
        tf0 tf0Var = lVar.h;
        int measuredWidth = (width - tf0Var.getMeasuredWidth()) / 2;
        tf0Var.layout(measuredWidth, d, tf0Var.getMeasuredWidth() + measuredWidth, tf0Var.getMeasuredHeight() + d);
        j jVar = lVar.f59546n;
        jVar.layout(tf0Var.getLeft(), tf0Var.getTop(), tf0Var.getRight(), jVar.getMeasuredHeight() + tf0Var.getTop());
        int C = k5.C(12.0f, tf0Var.getMeasuredHeight(), d);
        TextView textView = lVar.d;
        textView.layout(g0.L(16.0f) + tf0Var.getLeft(), C, tf0Var.getRight() - g0.L(16.0f), textView.getMeasuredHeight() + C);
        int measuredHeight = textView.getMeasuredHeight() + C;
        TextView textView2 = lVar.f59544e;
        int i15 = 8;
        if (textView2.getVisibility() != 8) {
            int L = g0.L(4.0f) + measuredHeight;
            textView2.layout(textView.getLeft(), L, textView.getRight(), textView2.getMeasuredHeight() + L);
            measuredHeight = textView2.getMeasuredHeight() + L;
        }
        int L2 = g0.L(12.0f) + measuredHeight;
        lVar.f59543c.setBounds(tf0Var.getLeft() - i14, tf0Var.getTop() - i13, tf0Var.getRight() + i14, i13 + L2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.layout((tf0Var.getRight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + i14, L2, tf0Var.getRight() + i14, actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() + L2);
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getBottom() < i12) {
            i15 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setVisibility(i15);
        int L3 = g0.L(6.0f);
        float top = (L3 * 2) + tf0Var.getTop();
        RectF rectF = this.f59539c;
        rectF.set(tf0Var.getLeft(), tf0Var.getTop(), tf0Var.getRight(), top);
        Path path = this.f59538b;
        path.reset();
        float f10 = L3;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f10, f10, direction);
        rectF.set(i7, tf0Var.getTop() + L3, i11, i12);
        path.addRect(rectF, direction);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setWillNotDraw(false);
        super.onMeasure(i7, i10);
        int A = q.A(12.0f, 2, Math.min(Math.min(getMeasuredWidth(), getMeasuredHeight()), (int) (getMeasuredHeight() * 0.66d)));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(A, Integer.MIN_VALUE);
        l lVar = this.f59540e;
        tf0 tf0Var = lVar.h;
        tf0Var.measure(makeMeasureSpec, makeMeasureSpec);
        lVar.f59546n.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(A - (g0.L(16.0f) * 2), 1073741824);
        lVar.d.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        lVar.f59544e.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        lVar.f59545f.measure(View.MeasureSpec.makeMeasureSpec((lVar.f59542b * 2) + tf0Var.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        Point point = g0.f22563q;
        int i13 = point.x;
        int i14 = point.y;
        l lVar = this.f59540e;
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
        return this.f59537a.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f59540e.f59543c && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
