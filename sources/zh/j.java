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
import org.telegram.messenger.m10;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Cells.y9;
import org.telegram.ui.Components.gg0;
public final class j extends ViewGroup {
    public final GestureDetector f62122a;
    public final Path f62123b;
    public final RectF f62124c;
    public boolean d;
    public final k f62125e;

    public j(k kVar, Context context) {
        super(context);
        this.f62125e = kVar;
        this.f62122a = new GestureDetector(getContext(), new y9(2, this));
        this.f62123b = new Path();
        this.f62124c = new RectF();
        this.d = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f62123b);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.f62125e.f62128c.draw(canvas);
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int height = getHeight();
        k kVar = this.f62125e;
        int i13 = kVar.f62126a;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = kVar.f62130f;
        int i14 = kVar.f62127b;
        int d = (height - kVar.d()) / 2;
        int width = getWidth();
        gg0 gg0Var = kVar.h;
        int measuredWidth = (width - gg0Var.getMeasuredWidth()) / 2;
        gg0Var.layout(measuredWidth, d, gg0Var.getMeasuredWidth() + measuredWidth, gg0Var.getMeasuredHeight() + d);
        i iVar = kVar.f62131n;
        iVar.layout(gg0Var.getLeft(), gg0Var.getTop(), gg0Var.getRight(), iVar.getMeasuredHeight() + gg0Var.getTop());
        int C = f3.C(12.0f, gg0Var.getMeasuredHeight(), d);
        TextView textView = kVar.d;
        textView.layout(g0.L(16.0f) + gg0Var.getLeft(), C, gg0Var.getRight() - g0.L(16.0f), textView.getMeasuredHeight() + C);
        int measuredHeight = textView.getMeasuredHeight() + C;
        TextView textView2 = kVar.f62129e;
        int i15 = 8;
        if (textView2.getVisibility() != 8) {
            int L = g0.L(4.0f) + measuredHeight;
            textView2.layout(textView.getLeft(), L, textView.getRight(), textView2.getMeasuredHeight() + L);
            measuredHeight = textView2.getMeasuredHeight() + L;
        }
        int L2 = g0.L(12.0f) + measuredHeight;
        kVar.f62128c.setBounds(gg0Var.getLeft() - i14, gg0Var.getTop() - i13, gg0Var.getRight() + i14, i13 + L2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.layout((gg0Var.getRight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + i14, L2, gg0Var.getRight() + i14, actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() + L2);
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getBottom() < i12) {
            i15 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setVisibility(i15);
        int L3 = g0.L(6.0f);
        float top = (L3 * 2) + gg0Var.getTop();
        RectF rectF = this.f62124c;
        rectF.set(gg0Var.getLeft(), gg0Var.getTop(), gg0Var.getRight(), top);
        Path path = this.f62123b;
        path.reset();
        float f10 = L3;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f10, f10, direction);
        rectF.set(i7, gg0Var.getTop() + L3, i11, i12);
        path.addRect(rectF, direction);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setWillNotDraw(false);
        super.onMeasure(i7, i10);
        int B = m10.B(12.0f, 2, Math.min(Math.min(getMeasuredWidth(), getMeasuredHeight()), (int) (getMeasuredHeight() * 0.66d)));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(B, Integer.MIN_VALUE);
        k kVar = this.f62125e;
        gg0 gg0Var = kVar.h;
        gg0Var.measure(makeMeasureSpec, makeMeasureSpec);
        kVar.f62131n.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(B - (g0.L(16.0f) * 2), 1073741824);
        kVar.d.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        kVar.f62129e.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        kVar.f62130f.measure(View.MeasureSpec.makeMeasureSpec((kVar.f62127b * 2) + gg0Var.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        Point point = g0.f24226q;
        int i13 = point.x;
        int i14 = point.y;
        k kVar = this.f62125e;
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
        return this.f62122a.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f62125e.f62128c && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
