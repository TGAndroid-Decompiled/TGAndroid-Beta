package s4;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Wallet.w4;
public final class h1 extends e0 {
    public final w4 f47751r;

    public h1(w4 w4Var, Context context) {
        super(context);
        this.f47751r = w4Var;
    }

    @Override
    public final void g(View view, y0 y0Var) {
        RecyclerView recyclerView = this.f47751r.f35660a;
        if (recyclerView != null) {
            p0 layoutManager = recyclerView.getLayoutManager();
            layoutManager.getClass();
            int[] iArr = {0, p0.z(view) - layoutManager.F()};
            int i10 = iArr[0];
            int i11 = iArr[1];
            int m10 = m(Math.max(Math.abs(i10), Math.abs(i11)));
            if (m10 > 0) {
                y0Var.b(i10, i11, m10, this.f47725j);
            }
        }
    }

    @Override
    public final float l(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
