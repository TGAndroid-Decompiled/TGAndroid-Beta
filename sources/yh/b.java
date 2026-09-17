package yh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
public final class b extends FrameLayout {
    public static final int f50236c = 0;
    public final f6 f50237a;
    public final int f50238b;

    public b(Context context, int i10, f6 f6Var) {
        super(context);
        this.f50238b = i10;
        this.f50237a = f6Var;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f));
    }
}
