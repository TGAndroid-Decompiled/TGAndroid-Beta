package vg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.ActionBar.y6;
public final class i1 extends View {
    public final n1 f50221a;

    public i1(n1 n1Var, Context context) {
        super(context);
        this.f50221a = n1Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawColor(this.f50221a.getThemedColor(y6.f23377e7));
    }
}
