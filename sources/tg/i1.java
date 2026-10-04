package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.ActionBar.i6;
public final class i1 extends View {
    public final m1 f47020a;

    public i1(m1 m1Var, Context context) {
        super(context);
        this.f47020a = m1Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawColor(this.f47020a.getThemedColor(i6.e7));
    }
}
