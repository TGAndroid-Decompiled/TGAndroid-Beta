package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.r5;
public final class j0 extends View {
    public final i0 f60399a;

    public j0(Context context) {
        super(context);
        i0 i0Var = new i0();
        this.f60399a = i0Var;
        i0Var.f60385r = this;
        i0Var.d.H0(this);
    }

    public i0 getDrawable() {
        return this.f60399a;
    }

    public TextPaint getTextPaint() {
        return this.f60399a.f60372c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f60399a.d.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i0 i0Var = this.f60399a;
        i0Var.d.R();
        r5.release((View) null, i0Var.f60384q);
        i0Var.f60384q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        i0 i0Var = this.f60399a;
        i0Var.setBounds(paddingLeft, paddingTop, width, height);
        i0Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = (View.MeasureSpec.getSize(i7) - getPaddingLeft()) - getPaddingRight();
        i0 i0Var = this.f60399a;
        i0Var.b(size);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + i0Var.f60387t, getPaddingBottom() + getPaddingTop() + i0Var.f60388u);
    }

    public void setMessage(CharSequence charSequence) {
        i0 i0Var = this.f60399a;
        i0Var.f60380m = charSequence;
        i0Var.f60386s = -1;
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.f60399a.c(tLObject);
        invalidate();
    }
}
