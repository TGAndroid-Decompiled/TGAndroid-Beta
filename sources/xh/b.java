package xh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
public final class b extends FrameLayout {
    public static final int f46187c = 0;
    public final d6 f46188a;
    public final int f46189b;

    public b(Context context, int i10, d6 d6Var) {
        super(context);
        this.f46189b = i10;
        this.f46188a = d6Var;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f));
    }
}
