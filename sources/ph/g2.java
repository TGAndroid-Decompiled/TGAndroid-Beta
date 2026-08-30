package ph;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class g2 extends f2.u0 {
    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.i1 i1Var) {
        int dp = AndroidUtilities.dp(4.0f);
        rect.top = 0;
        rect.bottom = dp;
        rect.right = dp;
        rect.left = dp;
        recyclerView.getClass();
        if (RecyclerView.R(view) % 3 != 2) {
            rect.right = 0;
        }
    }
}
