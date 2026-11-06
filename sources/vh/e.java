package vh;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import bg.c0;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import v4.m0;
public final class e extends m0 {
    public final c0 f57416a = new c0(2);
    public final f6 f57417b;
    public final g f57418c;

    public e(g gVar, f6 f6Var) {
        this.f57418c = gVar;
        this.f57417b = f6Var;
    }

    @Override
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        g gVar = this.f57418c;
        int max = Math.max(0, g0.L(80.0f) + ((int) gVar.Y1.getTranslationY()) + ((int) gVar.P1.f55401f));
        int w02 = k6.w0(k6.f27921h5, this.f57417b);
        c0 c0Var = this.f57416a;
        c0Var.b(w02);
        c0Var.setBounds(0, max, recyclerView.getWidth(), g0.L(8.0f) + max);
        c0Var.draw(canvas);
        gVar.e1();
        gVar.f1();
    }
}
