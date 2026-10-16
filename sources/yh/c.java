package yh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
public final class c extends FrameLayout {
    public static final int f48800c = 0;
    public final c6 f48801a;
    public final int f48802b;

    public c(Context context, int i10, c6 c6Var) {
        super(context);
        this.f48802b = i10;
        this.f48801a = c6Var;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f));
    }
}
