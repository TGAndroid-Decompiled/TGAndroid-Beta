package xh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
public final class c extends FrameLayout {
    public static final int f51276c = 0;
    public final d6 f51277a;
    public final int f51278b;

    public c(Context context, int i10, d6 d6Var) {
        super(context);
        this.f51278b = i10;
        this.f51277a = d6Var;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f));
    }
}
