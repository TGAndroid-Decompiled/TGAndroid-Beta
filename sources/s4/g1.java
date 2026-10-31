package s4;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Wallet.x5;
public final class g1 extends b0 {
    public final x5 f47934r;

    public g1(x5 x5Var, Context context) {
        super(context);
        this.f47934r = x5Var;
    }

    @Override
    public final void g(View view, x0 x0Var) {
        RecyclerView recyclerView = this.f47934r.f35382a;
        if (recyclerView != null) {
            n0 layoutManager = recyclerView.getLayoutManager();
            layoutManager.getClass();
            int[] iArr = {0, n0.z(view) - layoutManager.F()};
            int i10 = iArr[0];
            int i11 = iArr[1];
            int m10 = m(Math.max(Math.abs(i10), Math.abs(i11)));
            if (m10 > 0) {
                x0Var.b(i10, i11, m10, this.f47884j);
            }
        }
    }

    @Override
    public final float l(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
