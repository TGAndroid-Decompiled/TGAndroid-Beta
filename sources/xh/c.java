package xh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
public final class c extends FrameLayout {
    public static final int f51233c = 0;
    public final e6 f51234a;
    public final int f51235b;

    public c(Context context, int i10, e6 e6Var) {
        super(context);
        this.f51235b = i10;
        this.f51234a = e6Var;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f));
    }
}
