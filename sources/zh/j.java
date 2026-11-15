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
import org.telegram.messenger.g0;
import org.telegram.messenger.i20;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Cells.x9;
import org.telegram.ui.Components.vf0;
public final class j extends ViewGroup {
    public final GestureDetector f61427a;
    public final Path f61428b;
    public final RectF f61429c;
    public boolean d;
    public final k f61430e;

    public j(k kVar, Context context) {
        super(context);
        this.f61430e = kVar;
        this.f61427a = new GestureDetector(getContext(), new x9(2, this));
        this.f61428b = new Path();
        this.f61429c = new RectF();
        this.d = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f61428b);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.f61430e.f61433c.draw(canvas);
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int height = getHeight();
        k kVar = this.f61430e;
        int i13 = kVar.f61431a;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = kVar.f61435f;
        int i14 = kVar.f61432b;
        int d = (height - kVar.d()) / 2;
        int width = getWidth();
        vf0 vf0Var = kVar.h;
        int measuredWidth = (width - vf0Var.getMeasuredWidth()) / 2;
        vf0Var.layout(measuredWidth, d, vf0Var.getMeasuredWidth() + measuredWidth, vf0Var.getMeasuredHeight() + d);
        i iVar = kVar.f61436n;
        iVar.layout(vf0Var.getLeft(), vf0Var.getTop(), vf0Var.getRight(), iVar.getMeasuredHeight() + vf0Var.getTop());
        int C = k5.C(12.0f, vf0Var.getMeasuredHeight(), d);
        TextView textView = kVar.d;
        textView.layout(g0.L(16.0f) + vf0Var.getLeft(), C, vf0Var.getRight() - g0.L(16.0f), textView.getMeasuredHeight() + C);
        int measuredHeight = textView.getMeasuredHeight() + C;
        TextView textView2 = kVar.f61434e;
        int i15 = 8;
        if (textView2.getVisibility() != 8) {
            int L = g0.L(4.0f) + measuredHeight;
            textView2.layout(textView.getLeft(), L, textView.getRight(), textView2.getMeasuredHeight() + L);
            measuredHeight = textView2.getMeasuredHeight() + L;
        }
        int L2 = g0.L(12.0f) + measuredHeight;
        kVar.f61433c.setBounds(vf0Var.getLeft() - i14, vf0Var.getTop() - i13, vf0Var.getRight() + i14, i13 + L2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.layout((vf0Var.getRight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + i14, L2, vf0Var.getRight() + i14, actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() + L2);
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getBottom() < i12) {
            i15 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setVisibility(i15);
        int L3 = g0.L(6.0f);
        float top = (L3 * 2) + vf0Var.getTop();
        RectF rectF = this.f61429c;
        rectF.set(vf0Var.getLeft(), vf0Var.getTop(), vf0Var.getRight(), top);
        Path path = this.f61428b;
        path.reset();
        float f10 = L3;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f10, f10, direction);
        rectF.set(i7, vf0Var.getTop() + L3, i11, i12);
        path.addRect(rectF, direction);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setWillNotDraw(false);
        super.onMeasure(i7, i10);
        int A = i20.A(12.0f, 2, Math.min(Math.min(getMeasuredWidth(), getMeasuredHeight()), (int) (getMeasuredHeight() * 0.66d)));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(A, Integer.MIN_VALUE);
        k kVar = this.f61430e;
        vf0 vf0Var = kVar.h;
        vf0Var.measure(makeMeasureSpec, makeMeasureSpec);
        kVar.f61436n.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(A - (g0.L(16.0f) * 2), 1073741824);
        kVar.d.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        kVar.f61434e.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        kVar.f61435f.measure(View.MeasureSpec.makeMeasureSpec((kVar.f61432b * 2) + vf0Var.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        Point point = g0.f23609q;
        int i13 = point.x;
        int i14 = point.y;
        k kVar = this.f61430e;
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
        return this.f61427a.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f61430e.f61433c && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
