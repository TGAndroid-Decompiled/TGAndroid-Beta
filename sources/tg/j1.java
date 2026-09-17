package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.ActionBar.j6;
public final class j1 extends View {
    public final n1 f43180a;

    public j1(n1 n1Var, Context context) {
        super(context);
        this.f43180a = n1Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawColor(this.f43180a.getThemedColor(j6.e7));
    }
}
