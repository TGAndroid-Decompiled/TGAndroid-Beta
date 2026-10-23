package yh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
public final class b extends FrameLayout {
    public static final int f50620c = 0;
    public final g6 f50621a;
    public final int f50622b;

    public b(Context context, int i10, g6 g6Var) {
        super(context);
        this.f50622b = i10;
        this.f50621a = g6Var;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f));
    }
}
