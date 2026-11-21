package v4;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Wallet.j6;
public final class i1 extends d0 {
    public final j6 f59199r;

    public i1(j6 j6Var, Context context) {
        super(context);
        this.f59199r = j6Var;
    }

    @Override
    public final void g(View view, a1 a1Var) {
        RecyclerView recyclerView = this.f59199r.f44442a;
        if (recyclerView != null) {
            p0 layoutManager = recyclerView.getLayoutManager();
            layoutManager.getClass();
            int[] iArr = {0, p0.z(view) - layoutManager.F()};
            int i7 = iArr[0];
            int i10 = iArr[1];
            int m10 = m(Math.max(Math.abs(i7), Math.abs(i10)));
            if (m10 > 0) {
                a1Var.b(i7, i10, m10, this.f59141j);
            }
        }
    }

    @Override
    public final float l(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
