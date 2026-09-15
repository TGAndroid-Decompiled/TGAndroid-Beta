package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.ActionBar.i6;
public final class j1 extends View {
    public final n1 f43158a;

    public j1(n1 n1Var, Context context) {
        super(context);
        this.f43158a = n1Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawColor(this.f43158a.getThemedColor(i6.e7));
    }
}
