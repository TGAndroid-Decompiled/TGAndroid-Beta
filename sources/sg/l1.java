package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.ActionBar.j6;
public final class l1 extends View {
    public final p1 f41952a;

    public l1(p1 p1Var, Context context) {
        super(context);
        this.f41952a = p1Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawColor(this.f41952a.getThemedColor(j6.e7));
    }
}
