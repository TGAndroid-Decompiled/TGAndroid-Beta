package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.b6;
public final class n0 extends View {
    public final m0 f51430a;

    public n0(Context context) {
        super(context);
        m0 m0Var = new m0();
        this.f51430a = m0Var;
        m0Var.f51408r = this;
        m0Var.d.setParentView(this);
    }

    public m0 getDrawable() {
        return this.f51430a;
    }

    public TextPaint getTextPaint() {
        return this.f51430a.f51395c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f51430a.d.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m0 m0Var = this.f51430a;
        m0Var.d.onDetachedFromWindow();
        b6.release((View) null, m0Var.f51407q);
        m0Var.f51407q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        m0 m0Var = this.f51430a;
        m0Var.setBounds(paddingLeft, paddingTop, width, height);
        m0Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
        m0 m0Var = this.f51430a;
        m0Var.b(size);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + m0Var.f51410t, getPaddingBottom() + getPaddingTop() + m0Var.f51411u);
    }

    public void setMessage(CharSequence charSequence) {
        m0 m0Var = this.f51430a;
        m0Var.f51403m = charSequence;
        m0Var.f51409s = -1;
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.f51430a.c(tLObject);
        invalidate();
    }
}
