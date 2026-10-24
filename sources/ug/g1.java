package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.ActionBar.k6;
public final class g1 extends View {
    public final l1 f48125a;

    public g1(l1 l1Var, Context context) {
        super(context);
        this.f48125a = l1Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawColor(this.f48125a.getThemedColor(k6.e7));
    }
}
