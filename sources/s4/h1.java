package s4;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Wallet.i5;
public final class h1 extends d0 {
    public final i5 f47770r;

    public h1(i5 i5Var, Context context) {
        super(context);
        this.f47770r = i5Var;
    }

    @Override
    public final void g(View view, z0 z0Var) {
        RecyclerView recyclerView = this.f47770r.f36672a;
        if (recyclerView != null) {
            p0 layoutManager = recyclerView.getLayoutManager();
            layoutManager.getClass();
            int[] iArr = {0, p0.z(view) - layoutManager.F()};
            int i10 = iArr[0];
            int i11 = iArr[1];
            int m10 = m(Math.max(Math.abs(i10), Math.abs(i11)));
            if (m10 > 0) {
                z0Var.b(i10, i11, m10, this.f47724j);
            }
        }
    }

    @Override
    public final float l(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
