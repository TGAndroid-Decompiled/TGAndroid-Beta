package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.y5;
public final class l0 extends View {
    public final k0 f46297a;

    public l0(Context context) {
        super(context);
        k0 k0Var = new k0();
        this.f46297a = k0Var;
        k0Var.f46287r = this;
        k0Var.d.setParentView(this);
    }

    public k0 getDrawable() {
        return this.f46297a;
    }

    public TextPaint getTextPaint() {
        return this.f46297a.f46275c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f46297a.d.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k0 k0Var = this.f46297a;
        k0Var.d.onDetachedFromWindow();
        y5.release((View) null, k0Var.f46286q);
        k0Var.f46286q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        k0 k0Var = this.f46297a;
        k0Var.setBounds(paddingLeft, paddingTop, width, height);
        k0Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
        k0 k0Var = this.f46297a;
        k0Var.b(size);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + k0Var.f46289t, getPaddingBottom() + getPaddingTop() + k0Var.f46290u);
    }

    public void setMessage(CharSequence charSequence) {
        k0 k0Var = this.f46297a;
        k0Var.f46282m = charSequence;
        k0Var.f46288s = -1;
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.f46297a.c(tLObject);
        invalidate();
    }
}
