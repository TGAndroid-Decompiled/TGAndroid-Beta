package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.b6;
public final class n0 extends View {
    public final m0 f51473a;

    public n0(Context context) {
        super(context);
        m0 m0Var = new m0();
        this.f51473a = m0Var;
        m0Var.f51451r = this;
        m0Var.d.setParentView(this);
    }

    public m0 getDrawable() {
        return this.f51473a;
    }

    public TextPaint getTextPaint() {
        return this.f51473a.f51438c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f51473a.d.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m0 m0Var = this.f51473a;
        m0Var.d.onDetachedFromWindow();
        b6.release((View) null, m0Var.f51450q);
        m0Var.f51450q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        m0 m0Var = this.f51473a;
        m0Var.setBounds(paddingLeft, paddingTop, width, height);
        m0Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
        m0 m0Var = this.f51473a;
        m0Var.b(size);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + m0Var.f51453t, getPaddingBottom() + getPaddingTop() + m0Var.f51454u);
    }

    public void setMessage(CharSequence charSequence) {
        m0 m0Var = this.f51473a;
        m0Var.f51446m = charSequence;
        m0Var.f51452s = -1;
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.f51473a.c(tLObject);
        invalidate();
    }
}
