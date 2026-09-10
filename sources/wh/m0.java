package wh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.y5;
public final class m0 extends View {
    public final l0 f44239a;

    public m0(Context context) {
        super(context);
        l0 l0Var = new l0();
        this.f44239a = l0Var;
        l0Var.f44194r = this;
        l0Var.d.setParentView(this);
    }

    public l0 getDrawable() {
        return this.f44239a;
    }

    public TextPaint getTextPaint() {
        return this.f44239a.f44182c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f44239a.d.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l0 l0Var = this.f44239a;
        l0Var.d.onDetachedFromWindow();
        y5.release((View) null, l0Var.f44193q);
        l0Var.f44193q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        l0 l0Var = this.f44239a;
        l0Var.setBounds(paddingLeft, paddingTop, width, height);
        l0Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
        l0 l0Var = this.f44239a;
        l0Var.b(size);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + l0Var.f44196t, getPaddingBottom() + getPaddingTop() + l0Var.f44197u);
    }

    public void setMessage(CharSequence charSequence) {
        l0 l0Var = this.f44239a;
        l0Var.f44189m = charSequence;
        l0Var.f44195s = -1;
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.f44239a.c(tLObject);
        invalidate();
    }
}
