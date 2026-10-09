package s4;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Wallet.u4;
public final class h1 extends e0 {
    public final u4 f47705r;

    public h1(u4 u4Var, Context context) {
        super(context);
        this.f47705r = u4Var;
    }

    @Override
    public final void g(View view, y0 y0Var) {
        RecyclerView recyclerView = this.f47705r.f35498a;
        if (recyclerView != null) {
            p0 layoutManager = recyclerView.getLayoutManager();
            layoutManager.getClass();
            int[] iArr = {0, p0.z(view) - layoutManager.F()};
            int i10 = iArr[0];
            int i11 = iArr[1];
            int m10 = m(Math.max(Math.abs(i10), Math.abs(i11)));
            if (m10 > 0) {
                y0Var.b(i10, i11, m10, this.f47679j);
            }
        }
    }

    @Override
    public final float l(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
