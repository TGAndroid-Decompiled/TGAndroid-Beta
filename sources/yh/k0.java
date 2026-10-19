package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.a6;
public final class k0 extends View {
    public final j0 f50331a;

    public k0(Context context) {
        super(context);
        j0 j0Var = new j0();
        this.f50331a = j0Var;
        j0Var.f50314r = this;
        j0Var.d.setParentView(this);
    }

    public j0 getDrawable() {
        return this.f50331a;
    }

    public TextPaint getTextPaint() {
        return this.f50331a.f50302c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f50331a.d.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j0 j0Var = this.f50331a;
        j0Var.d.onDetachedFromWindow();
        a6.release((View) null, j0Var.f50313q);
        j0Var.f50313q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        j0 j0Var = this.f50331a;
        j0Var.setBounds(paddingLeft, paddingTop, width, height);
        j0Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
        j0 j0Var = this.f50331a;
        j0Var.b(size);
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + j0Var.f50316t, getPaddingBottom() + getPaddingTop() + j0Var.f50317u);
    }

    public void setMessage(CharSequence charSequence) {
        j0 j0Var = this.f50331a;
        j0Var.f50309m = charSequence;
        j0Var.f50315s = -1;
        requestLayout();
    }

    public void setUser(TLObject tLObject) {
        this.f50331a.c(tLObject);
        invalidate();
    }
}
