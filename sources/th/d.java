package th;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import s4.o0;
import yf.y;
public final class d extends o0 {
    public final y f48551a = new y(2);
    public final d6 f48552b;
    public final f f48553c;

    public d(f fVar, d6 d6Var) {
        this.f48553c = fVar;
        this.f48552b = d6Var;
    }

    @Override
    public final void d(Canvas canvas, RecyclerView recyclerView) {
        f fVar = this.f48553c;
        int max = Math.max(0, AndroidUtilities.dp(80.0f) + ((int) fVar.f48562g0.getTranslationY()) + ((int) fVar.X.f16373e));
        int w02 = h6.w0(h6.f20857h5, this.f48552b);
        y yVar = this.f48551a;
        yVar.b(w02);
        yVar.setBounds(0, max, recyclerView.getWidth(), AndroidUtilities.dp(8.0f) + max);
        yVar.draw(canvas);
        fVar.R();
        fVar.S();
    }
}
