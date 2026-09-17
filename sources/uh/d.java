package uh;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import s4.n0;
import yf.z;
public final class d extends n0 {
    public final z f47271a = new z(2);
    public final f6 f47272b;
    public final f f47273c;

    public d(f fVar, f6 f6Var) {
        this.f47273c = fVar;
        this.f47272b = f6Var;
    }

    @Override
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        f fVar = this.f47273c;
        int max = Math.max(0, AndroidUtilities.dp(80.0f) + ((int) fVar.f47282g0.getTranslationY()) + ((int) fVar.X.f15403e));
        int v02 = j6.v0(j6.f20762h5, this.f47272b);
        z zVar = this.f47271a;
        zVar.b(v02);
        zVar.setBounds(0, max, recyclerView.getWidth(), AndroidUtilities.dp(8.0f) + max);
        zVar.draw(canvas);
        fVar.Q();
        fVar.R();
    }
}
