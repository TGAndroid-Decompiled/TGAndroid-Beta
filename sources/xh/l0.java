package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.z5;
public final class l0 extends View {
    public final k0 f50066a;

    public l0(Context context) {
        super(context);
        k0 k0Var = new k0();
        this.f50066a = k0Var;
        k0Var.f50057r = this;
        k0Var.d.setParentView(this);
    }

    public k0 getDrawable() {
        return this.f50066a;
    }

    public TextPaint getTextPaint() {
        return this.f50066a.f50044c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f50066a.d.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k0 k0Var = this.f50066a;
        k0Var.d.onDetachedFromWindow();
        z5.release((View) null, k0Var.f50056q);
        k0Var.f50056q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        k0 k0Var = this.f50066a;
        k0Var.setBounds(paddingLeft, paddingTop, width, height);
        k0Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
        k0 k0Var = this.f50066a;
        k0Var.b(size);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + k0Var.f50059t, getPaddingBottom() + getPaddingTop() + k0Var.f50060u);
    }

    public void setMessage(CharSequence charSequence) {
        k0 k0Var = this.f50066a;
        k0Var.f50052m = charSequence;
        k0Var.f50058s = -1;
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.f50066a.c(tLObject);
        invalidate();
    }
}
