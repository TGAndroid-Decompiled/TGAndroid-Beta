package th;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import s4.n0;
import yf.y;
public final class d extends n0 {
    public final y f47162a = new y(2);
    public final d6 f47163b;
    public final f f47164c;

    public d(f fVar, d6 d6Var) {
        this.f47164c = fVar;
        this.f47163b = d6Var;
    }

    @Override
    public final void d(Canvas canvas, RecyclerView recyclerView) {
        f fVar = this.f47164c;
        int max = Math.max(0, AndroidUtilities.dp(80.0f) + ((int) fVar.f47173g0.getTranslationY()) + ((int) fVar.X.f15444e));
        int v02 = i6.v0(i6.f20899h5, this.f47163b);
        y yVar = this.f47162a;
        yVar.b(v02);
        yVar.setBounds(0, max, recyclerView.getWidth(), AndroidUtilities.dp(8.0f) + max);
        yVar.draw(canvas);
        fVar.O();
        fVar.P();
    }
}
