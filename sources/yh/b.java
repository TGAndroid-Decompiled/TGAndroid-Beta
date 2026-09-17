package yh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
public final class b extends FrameLayout {
    public static final int f50207c = 0;
    public final f6 f50208a;
    public final int f50209b;

    public b(Context context, int i10, f6 f6Var) {
        super(context);
        this.f50209b = i10;
        this.f50208a = f6Var;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f));
    }
}
