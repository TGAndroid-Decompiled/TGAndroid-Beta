package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.x5;
public final class l0 extends View {
    public final k0 f45968a;

    public l0(Context context) {
        super(context);
        k0 k0Var = new k0();
        this.f45968a = k0Var;
        k0Var.f45958r = this;
        k0Var.d.setParentView(this);
    }

    public k0 getDrawable() {
        return this.f45968a;
    }

    public TextPaint getTextPaint() {
        return this.f45968a.f45946c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f45968a.d.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k0 k0Var = this.f45968a;
        k0Var.d.onDetachedFromWindow();
        x5.release((View) null, k0Var.f45957q);
        k0Var.f45957q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        k0 k0Var = this.f45968a;
        k0Var.setBounds(paddingLeft, paddingTop, width, height);
        k0Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
        k0 k0Var = this.f45968a;
        k0Var.b(size);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + k0Var.f45960t, getPaddingBottom() + getPaddingTop() + k0Var.f45961u);
    }

    public void setMessage(CharSequence charSequence) {
        k0 k0Var = this.f45968a;
        k0Var.f45953m = charSequence;
        k0Var.f45959s = -1;
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.f45968a.c(tLObject);
        invalidate();
    }
}
