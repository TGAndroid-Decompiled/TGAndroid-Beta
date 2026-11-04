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
import org.telegram.messenger.camera.q;
import org.telegram.messenger.g0;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Cells.x9;
import org.telegram.ui.Components.vf0;
public final class i extends ViewGroup {
    public final GestureDetector f60565a;
    public final Path f60566b;
    public final RectF f60567c;
    public boolean d;
    public final j f60568e;

    public i(j jVar, Context context) {
        super(context);
        this.f60568e = jVar;
        this.f60565a = new GestureDetector(getContext(), new x9(2, this));
        this.f60566b = new Path();
        this.f60567c = new RectF();
        this.d = true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f60566b);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.f60568e.f60571c.draw(canvas);
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int height = getHeight();
        j jVar = this.f60568e;
        int i13 = jVar.f60569a;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = jVar.f60573f;
        int i14 = jVar.f60570b;
        int d = (height - jVar.d()) / 2;
        int width = getWidth();
        vf0 vf0Var = jVar.h;
        int measuredWidth = (width - vf0Var.getMeasuredWidth()) / 2;
        vf0Var.layout(measuredWidth, d, vf0Var.getMeasuredWidth() + measuredWidth, vf0Var.getMeasuredHeight() + d);
        h hVar = jVar.f60574n;
        hVar.layout(vf0Var.getLeft(), vf0Var.getTop(), vf0Var.getRight(), hVar.getMeasuredHeight() + vf0Var.getTop());
        int C = k5.C(12.0f, vf0Var.getMeasuredHeight(), d);
        TextView textView = jVar.d;
        textView.layout(g0.L(16.0f) + vf0Var.getLeft(), C, vf0Var.getRight() - g0.L(16.0f), textView.getMeasuredHeight() + C);
        int measuredHeight = textView.getMeasuredHeight() + C;
        TextView textView2 = jVar.f60572e;
        int i15 = 8;
        if (textView2.getVisibility() != 8) {
            int L = g0.L(4.0f) + measuredHeight;
            textView2.layout(textView.getLeft(), L, textView.getRight(), textView2.getMeasuredHeight() + L);
            measuredHeight = textView2.getMeasuredHeight() + L;
        }
        int L2 = g0.L(12.0f) + measuredHeight;
        jVar.f60571c.setBounds(vf0Var.getLeft() - i14, vf0Var.getTop() - i13, vf0Var.getRight() + i14, i13 + L2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.layout((vf0Var.getRight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + i14, L2, vf0Var.getRight() + i14, actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() + L2);
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getBottom() < i12) {
            i15 = 0;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setVisibility(i15);
        int L3 = g0.L(6.0f);
        float top = (L3 * 2) + vf0Var.getTop();
        RectF rectF = this.f60567c;
        rectF.set(vf0Var.getLeft(), vf0Var.getTop(), vf0Var.getRight(), top);
        Path path = this.f60566b;
        path.reset();
        float f10 = L3;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f10, f10, direction);
        rectF.set(i3, vf0Var.getTop() + L3, i11, i12);
        path.addRect(rectF, direction);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        setWillNotDraw(false);
        super.onMeasure(i3, i10);
        int A = q.A(12.0f, 2, Math.min(Math.min(getMeasuredWidth(), getMeasuredHeight()), (int) (getMeasuredHeight() * 0.66d)));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(A, Integer.MIN_VALUE);
        j jVar = this.f60568e;
        vf0 vf0Var = jVar.h;
        vf0Var.measure(makeMeasureSpec, makeMeasureSpec);
        jVar.f60574n.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(A - (g0.L(16.0f) * 2), 1073741824);
        jVar.d.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        jVar.f60572e.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        jVar.f60573f.measure(View.MeasureSpec.makeMeasureSpec((jVar.f60570b * 2) + vf0Var.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        Point point = g0.f22608q;
        int i13 = point.x;
        int i14 = point.y;
        j jVar = this.f60568e;
        if (i13 > i14) {
            j.c(jVar);
        }
        if (i3 != i11 && i10 != i12) {
            if (!this.d) {
                jVar.f();
            }
            this.d = false;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f60565a.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f60568e.f60571c && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
