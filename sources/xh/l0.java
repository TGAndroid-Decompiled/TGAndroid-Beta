package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.z5;
public final class l0 extends View {
    public final k0 f50082a;

    public l0(Context context) {
        super(context);
        k0 k0Var = new k0();
        this.f50082a = k0Var;
        k0Var.f50073r = this;
        k0Var.d.setParentView(this);
    }

    public k0 getDrawable() {
        return this.f50082a;
    }

    public TextPaint getTextPaint() {
        return this.f50082a.f50060c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f50082a.d.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k0 k0Var = this.f50082a;
        k0Var.d.onDetachedFromWindow();
        z5.release((View) null, k0Var.f50072q);
        k0Var.f50072q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        k0 k0Var = this.f50082a;
        k0Var.setBounds(paddingLeft, paddingTop, width, height);
        k0Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
        k0 k0Var = this.f50082a;
        k0Var.b(size);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + k0Var.f50075t, getPaddingBottom() + getPaddingTop() + k0Var.f50076u);
    }

    public void setMessage(CharSequence charSequence) {
        k0 k0Var = this.f50082a;
        k0Var.f50068m = charSequence;
        k0Var.f50074s = -1;
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.f50082a.c(tLObject);
        invalidate();
    }
}
