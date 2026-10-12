package xh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
public final class c extends FrameLayout {
    public static final int f51411c = 0;
    public final c6 f51412a;
    public final int f51413b;

    public c(Context context, int i10, c6 c6Var) {
        super(context);
        this.f51413b = i10;
        this.f51412a = c6Var;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f));
    }
}
