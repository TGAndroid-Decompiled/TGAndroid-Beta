package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.r5;
public final class k0 extends View {
    public final j0 f60293a;

    public k0(Context context) {
        super(context);
        j0 j0Var = new j0();
        this.f60293a = j0Var;
        j0Var.f60277r = this;
        j0Var.d.H0(this);
    }

    public j0 getDrawable() {
        return this.f60293a;
    }

    public TextPaint getTextPaint() {
        return this.f60293a.f60264c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f60293a.d.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j0 j0Var = this.f60293a;
        j0Var.d.R();
        r5.release((View) null, j0Var.f60276q);
        j0Var.f60276q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        j0 j0Var = this.f60293a;
        j0Var.setBounds(paddingLeft, paddingTop, width, height);
        j0Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = (View.MeasureSpec.getSize(i7) - getPaddingLeft()) - getPaddingRight();
        j0 j0Var = this.f60293a;
        j0Var.b(size);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + j0Var.f60279t, getPaddingBottom() + getPaddingTop() + j0Var.f60280u);
    }

    public void setMessage(CharSequence charSequence) {
        j0 j0Var = this.f60293a;
        j0Var.f60272m = charSequence;
        j0Var.f60278s = -1;
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.f60293a.c(tLObject);
        invalidate();
    }
}
