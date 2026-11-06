package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.r5;
public final class k0 extends View {
    public final j0 f60318a;

    public k0(Context context) {
        super(context);
        j0 j0Var = new j0();
        this.f60318a = j0Var;
        j0Var.f60302r = this;
        j0Var.d.H0(this);
    }

    public j0 getDrawable() {
        return this.f60318a;
    }

    public TextPaint getTextPaint() {
        return this.f60318a.f60289c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f60318a.d.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j0 j0Var = this.f60318a;
        j0Var.d.R();
        r5.release((View) null, j0Var.f60301q);
        j0Var.f60301q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        j0 j0Var = this.f60318a;
        j0Var.setBounds(paddingLeft, paddingTop, width, height);
        j0Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = (View.MeasureSpec.getSize(i7) - getPaddingLeft()) - getPaddingRight();
        j0 j0Var = this.f60318a;
        j0Var.b(size);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + j0Var.f60304t, getPaddingBottom() + getPaddingTop() + j0Var.f60305u);
    }

    public void setMessage(CharSequence charSequence) {
        j0 j0Var = this.f60318a;
        j0Var.f60297m = charSequence;
        j0Var.f60303s = -1;
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.f60318a.c(tLObject);
        invalidate();
    }
}
