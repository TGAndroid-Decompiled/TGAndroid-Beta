package qh;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class f2 extends f2.v0 {
    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.j1 j1Var) {
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
