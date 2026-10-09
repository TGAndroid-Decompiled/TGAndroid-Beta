package th;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import s4.o0;
import yf.y;
public final class d extends o0 {
    public final y f48459a = new y(2);
    public final e6 f48460b;
    public final f f48461c;

    public d(f fVar, e6 e6Var) {
        this.f48461c = fVar;
        this.f48460b = e6Var;
    }

    @Override
    public final void d(Canvas canvas, RecyclerView recyclerView) {
        f fVar = this.f48461c;
        int max = Math.max(0, AndroidUtilities.dp(80.0f) + ((int) fVar.f48470g0.getTranslationY()) + ((int) fVar.X.f16345e));
        int w02 = i6.w0(i6.f20868h5, this.f48460b);
        y yVar = this.f48459a;
        yVar.b(w02);
        yVar.setBounds(0, max, recyclerView.getWidth(), AndroidUtilities.dp(8.0f) + max);
        yVar.draw(canvas);
        fVar.R();
        fVar.S();
    }
}
