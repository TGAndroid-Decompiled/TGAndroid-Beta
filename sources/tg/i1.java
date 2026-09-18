package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.ActionBar.j6;
public final class i1 extends View {
    public final m1 f43388a;

    public i1(m1 m1Var, Context context) {
        super(context);
        this.f43388a = m1Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawColor(this.f43388a.getThemedColor(j6.e7));
    }
}
