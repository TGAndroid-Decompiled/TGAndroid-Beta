package v4;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Wallet.u5;
public final class g1 extends c0 {
    public final u5 f56986r;

    public g1(u5 u5Var, Context context) {
        super(context);
        this.f56986r = u5Var;
    }

    @Override
    public final void g(View view, y0 y0Var) {
        RecyclerView recyclerView = this.f56986r.f43203a;
        if (recyclerView != null) {
            n0 layoutManager = recyclerView.getLayoutManager();
            layoutManager.getClass();
            int[] iArr = {0, n0.z(view) - layoutManager.F()};
            int i7 = iArr[0];
            int i10 = iArr[1];
            int m10 = m(Math.max(Math.abs(i7), Math.abs(i10)));
            if (m10 > 0) {
                y0Var.b(i7, i10, m10, this.f56935j);
            }
        }
    }

    @Override
    public final float l(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
