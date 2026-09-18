package th;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import s4.n0;
import yf.z;
public final class d extends n0 {
    public final z f43509a = new z(2);
    public final e6 f43510b;
    public final f f43511c;

    public d(f fVar, e6 e6Var) {
        this.f43511c = fVar;
        this.f43510b = e6Var;
    }

    @Override
    public final void d(Canvas canvas, RecyclerView recyclerView) {
        f fVar = this.f43511c;
        int max = Math.max(0, AndroidUtilities.dp(80.0f) + ((int) fVar.f43520g0.getTranslationY()) + ((int) fVar.X.e));
        int v02 = j6.v0(j6.f19133h5, this.f43510b);
        z zVar = this.f43509a;
        zVar.b(v02);
        zVar.setBounds(0, max, recyclerView.getWidth(), AndroidUtilities.dp(8.0f) + max);
        zVar.draw(canvas);
        fVar.Q();
        fVar.R();
    }
}
