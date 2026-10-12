package s4;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Wallet.v4;
public final class f1 extends c0 {
    public final v4 f44879r;

    public f1(v4 v4Var, Context context) {
        super(context);
        this.f44879r = v4Var;
    }

    @Override
    public final void g(View view, w0 w0Var) {
        RecyclerView recyclerView = this.f44879r.f33772a;
        if (recyclerView != null) {
            n0 layoutManager = recyclerView.getLayoutManager();
            layoutManager.getClass();
            int[] iArr = {0, n0.z(view) - layoutManager.F()};
            int i10 = iArr[0];
            int i11 = iArr[1];
            int m10 = m(Math.max(Math.abs(i10), Math.abs(i11)));
            if (m10 > 0) {
                w0Var.b(i10, i11, m10, this.f44860j);
            }
        }
    }

    @Override
    public final float l(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
