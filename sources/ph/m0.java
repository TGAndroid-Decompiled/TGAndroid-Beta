package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.o5;
public final class m0 extends View {
    public final l0 f45231a;

    public m0(Context context) {
        super(context);
        l0 l0Var = new l0();
        this.f45231a = l0Var;
        l0Var.f45189r = this;
        l0Var.d.H0(this);
    }

    public l0 getDrawable() {
        return this.f45231a;
    }

    public TextPaint getTextPaint() {
        return this.f45231a.f45177c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f45231a.d.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l0 l0Var = this.f45231a;
        l0Var.d.R();
        o5.release((View) null, l0Var.f45188q);
        l0Var.f45188q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        l0 l0Var = this.f45231a;
        l0Var.setBounds(paddingLeft, paddingTop, width, height);
        l0Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
        l0 l0Var = this.f45231a;
        l0Var.b(size);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + l0Var.f45191t, getPaddingBottom() + getPaddingTop() + l0Var.f45192u);
    }

    public void setMessage(CharSequence charSequence) {
        l0 l0Var = this.f45231a;
        l0Var.f45184m = charSequence;
        l0Var.f45190s = -1;
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.f45231a.c(tLObject);
        invalidate();
    }
}
