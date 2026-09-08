package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.ActionBar.j6;
public final class j1 extends View {
    public final n1 f47166a;

    public j1(n1 n1Var, Context context) {
        super(context);
        this.f47166a = n1Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawColor(this.f47166a.getThemedColor(j6.e7));
    }
}
