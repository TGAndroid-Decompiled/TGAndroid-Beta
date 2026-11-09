package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.r5;
public final class j0 extends View {
    public final i0 f60409a;

    public j0(Context context) {
        super(context);
        i0 i0Var = new i0();
        this.f60409a = i0Var;
        i0Var.f60394r = this;
        i0Var.d.H0(this);
    }

    public i0 getDrawable() {
        return this.f60409a;
    }

    public TextPaint getTextPaint() {
        return this.f60409a.f60381c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f60409a.d.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i0 i0Var = this.f60409a;
        i0Var.d.R();
        r5.release((View) null, i0Var.f60393q);
        i0Var.f60393q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        i0 i0Var = this.f60409a;
        i0Var.setBounds(paddingLeft, paddingTop, width, height);
        i0Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = (View.MeasureSpec.getSize(i7) - getPaddingLeft()) - getPaddingRight();
        i0 i0Var = this.f60409a;
        i0Var.b(size);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + i0Var.f60396t, getPaddingBottom() + getPaddingTop() + i0Var.f60397u);
    }

    public void setMessage(CharSequence charSequence) {
        i0 i0Var = this.f60409a;
        i0Var.f60389m = charSequence;
        i0Var.f60395s = -1;
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.f60409a.c(tLObject);
        invalidate();
    }
}
