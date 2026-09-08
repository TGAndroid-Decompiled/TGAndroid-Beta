package uh;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import s4.n0;
import yf.z;
public final class d extends n0 {
    public final z f47270a = new z(2);
    public final f6 f47271b;
    public final f f47272c;

    public d(f fVar, f6 f6Var) {
        this.f47272c = fVar;
        this.f47271b = f6Var;
    }

    @Override
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        f fVar = this.f47272c;
        int max = Math.max(0, AndroidUtilities.dp(80.0f) + ((int) fVar.f47281g0.getTranslationY()) + ((int) fVar.X.f15403e));
        int v02 = j6.v0(j6.f20761h5, this.f47271b);
        z zVar = this.f47270a;
        zVar.b(v02);
        zVar.setBounds(0, max, recyclerView.getWidth(), AndroidUtilities.dp(8.0f) + max);
        zVar.draw(canvas);
        fVar.Q();
        fVar.R();
    }
}
