package wh;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import cg.b0;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import u4.n0;
public final class f extends n0 {
    public final b0 f57765a = new b0(2);
    public final e6 f57766b;
    public final h f57767c;

    public f(h hVar, e6 e6Var) {
        this.f57767c = hVar;
        this.f57766b = e6Var;
    }

    @Override
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        h hVar = this.f57767c;
        int max = Math.max(0, g0.L(80.0f) + ((int) hVar.Z1.getTranslationY()) + ((int) hVar.Q1.f53846f));
        int w02 = k6.w0(k6.f27954h5, this.f57766b);
        b0 b0Var = this.f57765a;
        b0Var.b(w02);
        b0Var.setBounds(0, max, recyclerView.getWidth(), g0.L(8.0f) + max);
        b0Var.draw(canvas);
        hVar.e1();
        hVar.f1();
    }
}
