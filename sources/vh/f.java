package vh;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import bg.c0;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import v4.n0;
public final class f extends n0 {
    public final c0 f58994a = new c0(2);
    public final e6 f58995b;
    public final h f58996c;

    public f(h hVar, e6 e6Var) {
        this.f58996c = hVar;
        this.f58995b = e6Var;
    }

    @Override
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        h hVar = this.f58996c;
        int max = Math.max(0, g0.L(80.0f) + ((int) hVar.f59001c2.getTranslationY()) + ((int) hVar.T1.f57087f));
        int w02 = j6.w0(j6.f28922h5, this.f58995b);
        c0 c0Var = this.f58994a;
        c0Var.b(w02);
        c0Var.setBounds(0, max, recyclerView.getWidth(), g0.L(8.0f) + max);
        c0Var.draw(canvas);
        hVar.e1();
        hVar.f1();
    }
}
