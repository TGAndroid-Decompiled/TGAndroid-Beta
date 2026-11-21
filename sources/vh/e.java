package vh;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import bg.d0;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import v4.o0;
public final class e extends o0 {
    public final d0 f59598a = new d0(2);
    public final h6 f59599b;
    public final g f59600c;

    public e(g gVar, h6 h6Var) {
        this.f59600c = gVar;
        this.f59599b = h6Var;
    }

    @Override
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        g gVar = this.f59600c;
        int max = Math.max(0, g0.L(80.0f) + ((int) gVar.f59605c2.getTranslationY()) + ((int) gVar.T1.f57702f));
        int w02 = m6.w0(m6.f29451h5, this.f59599b);
        d0 d0Var = this.f59598a;
        d0Var.b(w02);
        d0Var.setBounds(0, max, recyclerView.getWidth(), g0.L(8.0f) + max);
        d0Var.draw(canvas);
        gVar.f1();
        gVar.g1();
    }
}
