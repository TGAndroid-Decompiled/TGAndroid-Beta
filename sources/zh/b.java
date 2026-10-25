package zh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.u6;
public final class b extends FrameLayout {
    public static final int f52900c = 0;
    public final u6 f52901a;
    public final int f52902b;

    public b(Context context, int i10, u6 u6Var) {
        super(context);
        this.f52902b = i10;
        this.f52901a = u6Var;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f));
    }
}
