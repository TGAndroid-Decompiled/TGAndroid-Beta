package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.ActionBar.g6;
public final class i1 extends View {
    public final m1 f46324a;

    public i1(m1 m1Var, Context context) {
        super(context);
        this.f46324a = m1Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawColor(this.f46324a.getThemedColor(g6.e7));
    }
}
