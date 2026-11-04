package u4;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Wallet.s5;
public final class g1 extends c0 {
    public final s5 f55574r;

    public g1(s5 s5Var, Context context) {
        super(context);
        this.f55574r = s5Var;
    }

    @Override
    public final void g(View view, y0 y0Var) {
        RecyclerView recyclerView = this.f55574r.f43153a;
        if (recyclerView != null) {
            o0 layoutManager = recyclerView.getLayoutManager();
            layoutManager.getClass();
            int[] iArr = {0, o0.z(view) - layoutManager.F()};
            int i3 = iArr[0];
            int i10 = iArr[1];
            int m10 = m(Math.max(Math.abs(i3), Math.abs(i10)));
            if (m10 > 0) {
                y0Var.b(i3, i10, m10, this.f55525j);
            }
        }
    }

    @Override
    public final float l(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
