package vh;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import bg.d0;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import v4.o0;
public final class e extends o0 {
    public final d0 f59560a = new d0(2);
    public final i6 f59561b;
    public final g f59562c;

    public e(g gVar, i6 i6Var) {
        this.f59562c = gVar;
        this.f59561b = i6Var;
    }

    @Override
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        g gVar = this.f59562c;
        int max = Math.max(0, g0.L(80.0f) + ((int) gVar.f59567c2.getTranslationY()) + ((int) gVar.T1.f57663f));
        int w02 = n6.w0(n6.f29467h5, this.f59561b);
        d0 d0Var = this.f59560a;
        d0Var.b(w02);
        d0Var.setBounds(0, max, recyclerView.getWidth(), g0.L(8.0f) + max);
        d0Var.draw(canvas);
        gVar.f1();
        gVar.g1();
    }
}
