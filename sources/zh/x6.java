package zh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.tl.TL_stories;
public final class x6 extends FrameLayout {
    public final TL_stories.MediaArea f49070a;
    public final pg.s0 f49071b;

    public x6(Context context, pg.s0 s0Var, TL_stories.MediaArea mediaArea) {
        super(context);
        this.f49070a = mediaArea;
        this.f49071b = s0Var;
        addView(s0Var);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        pg.s0 s0Var = this.f49071b;
        s0Var.measure(i10, i11);
        int measuredWidth = (s0Var.getMeasuredWidth() - s0Var.getPaddingLeft()) - s0Var.getPaddingRight();
        int measuredHeight = (s0Var.getMeasuredHeight() - s0Var.getPaddingTop()) - s0Var.getPaddingBottom();
        float f7 = measuredWidth;
        float f10 = f7 / 2.0f;
        s0Var.setPivotX(s0Var.getPaddingLeft() + f10);
        float f11 = measuredHeight;
        float f12 = f11 / 2.0f;
        s0Var.setPivotY(s0Var.getPaddingTop() + f12);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        float f13 = size;
        float f14 = size2;
        float min = Math.min(f13 / f7, f14 / f11);
        s0Var.setTranslationX((f13 / 2.0f) - (f10 + s0Var.getPaddingLeft()));
        s0Var.setTranslationY((f14 / 2.0f) - (f12 + s0Var.getPaddingTop()));
        s0Var.setScaleX(min);
        s0Var.setScaleY(min);
    }
}
