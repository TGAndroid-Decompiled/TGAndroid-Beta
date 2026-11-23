package vh;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import bg.d0;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import v4.o0;
public final class e extends o0 {
    public final d0 f59687a = new d0(2);
    public final i6 f59688b;
    public final g f59689c;

    public e(g gVar, i6 i6Var) {
        this.f59689c = gVar;
        this.f59688b = i6Var;
    }

    @Override
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        g gVar = this.f59689c;
        int max = Math.max(0, g0.L(80.0f) + ((int) gVar.f59694c2.getTranslationY()) + ((int) gVar.T1.f57785f));
        int w02 = n6.w0(n6.f29524h5, this.f59688b);
        d0 d0Var = this.f59687a;
        d0Var.b(w02);
        d0Var.setBounds(0, max, recyclerView.getWidth(), g0.L(8.0f) + max);
        d0Var.draw(canvas);
        gVar.f1();
        gVar.g1();
    }
}
