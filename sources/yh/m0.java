package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.b6;
public final class m0 extends View {
    public final l0 f48987a;

    public m0(Context context) {
        super(context);
        l0 l0Var = new l0();
        this.f48987a = l0Var;
        l0Var.f48968r = this;
        l0Var.d.setParentView(this);
    }

    public l0 getDrawable() {
        return this.f48987a;
    }

    public TextPaint getTextPaint() {
        return this.f48987a.f48956c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f48987a.d.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l0 l0Var = this.f48987a;
        l0Var.d.onDetachedFromWindow();
        b6.release((View) null, l0Var.f48967q);
        l0Var.f48967q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        l0 l0Var = this.f48987a;
        l0Var.setBounds(paddingLeft, paddingTop, width, height);
        l0Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
        l0 l0Var = this.f48987a;
        l0Var.b(size);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + l0Var.f48970t, getPaddingBottom() + getPaddingTop() + l0Var.f48971u);
    }

    public void setMessage(CharSequence charSequence) {
        l0 l0Var = this.f48987a;
        l0Var.f48963m = charSequence;
        l0Var.f48969s = -1;
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.f48987a.c(tLObject);
        invalidate();
    }
}
