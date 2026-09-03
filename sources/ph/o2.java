package ph;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class o2 extends f2.u0 {
    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.i1 i1Var) {
        int dp = AndroidUtilities.dp(5.0f);
        rect.right = dp;
        rect.bottom = dp;
    }
}
