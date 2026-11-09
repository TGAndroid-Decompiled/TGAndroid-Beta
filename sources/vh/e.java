package vh;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import bg.c0;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import v4.m0;
public final class e extends m0 {
    public final c0 f57520a = new c0(2);
    public final g6 f57521b;
    public final g f57522c;

    public e(g gVar, g6 g6Var) {
        this.f57522c = gVar;
        this.f57521b = g6Var;
    }

    @Override
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        g gVar = this.f57522c;
        int max = Math.max(0, g0.L(80.0f) + ((int) gVar.Y1.getTranslationY()) + ((int) gVar.P1.f55505f));
        int w02 = l6.w0(l6.f27938h5, this.f57521b);
        c0 c0Var = this.f57520a;
        c0Var.b(w02);
        c0Var.setBounds(0, max, recyclerView.getWidth(), g0.L(8.0f) + max);
        c0Var.draw(canvas);
        gVar.e1();
        gVar.f1();
    }
}
