package vh;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import bg.c0;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import v4.m0;
public final class e extends m0 {
    public final c0 f57516a = new c0(2);
    public final h6 f57517b;
    public final g f57518c;

    public e(g gVar, h6 h6Var) {
        this.f57518c = gVar;
        this.f57517b = h6Var;
    }

    @Override
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        g gVar = this.f57518c;
        int max = Math.max(0, g0.L(80.0f) + ((int) gVar.f57522b2.getTranslationY()) + ((int) gVar.S1.f55504f));
        int w02 = m6.w0(m6.f27963h5, this.f57517b);
        c0 c0Var = this.f57516a;
        c0Var.b(w02);
        c0Var.setBounds(0, max, recyclerView.getWidth(), g0.L(8.0f) + max);
        c0Var.draw(canvas);
        gVar.e1();
        gVar.f1();
    }
}
