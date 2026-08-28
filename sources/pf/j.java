package pf;

import org.telegram.ui.Components.yn;
public final class j extends yn {
    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        setPivotX(getMeasuredWidth() / 2.0f);
        setPivotY(getMeasuredHeight());
    }
}
