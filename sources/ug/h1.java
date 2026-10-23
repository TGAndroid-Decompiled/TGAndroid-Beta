package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.ActionBar.h6;
public final class h1 extends View {
    public final m1 f47693a;

    public h1(m1 m1Var, Context context) {
        super(context);
        this.f47693a = m1Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawColor(this.f47693a.getThemedColor(h6.e7));
    }
}
