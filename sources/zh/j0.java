package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.r5;
public final class j0 extends View {
    public final i0 f60400a;

    public j0(Context context) {
        super(context);
        i0 i0Var = new i0();
        this.f60400a = i0Var;
        i0Var.f60386r = this;
        i0Var.d.H0(this);
    }

    public i0 getDrawable() {
        return this.f60400a;
    }

    public TextPaint getTextPaint() {
        return this.f60400a.f60373c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f60400a.d.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i0 i0Var = this.f60400a;
        i0Var.d.R();
        r5.release((View) null, i0Var.f60385q);
        i0Var.f60385q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        i0 i0Var = this.f60400a;
        i0Var.setBounds(paddingLeft, paddingTop, width, height);
        i0Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = (View.MeasureSpec.getSize(i7) - getPaddingLeft()) - getPaddingRight();
        i0 i0Var = this.f60400a;
        i0Var.b(size);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + i0Var.f60388t, getPaddingBottom() + getPaddingTop() + i0Var.f60389u);
    }

    public void setMessage(CharSequence charSequence) {
        i0 i0Var = this.f60400a;
        i0Var.f60381m = charSequence;
        i0Var.f60387s = -1;
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.f60400a.c(tLObject);
        invalidate();
    }
}
