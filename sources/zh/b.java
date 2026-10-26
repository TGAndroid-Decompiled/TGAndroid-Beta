package zh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.u6;
public final class b extends FrameLayout {
    public static final int f52903c = 0;
    public final u6 f52904a;
    public final int f52905b;

    public b(Context context, int i10, u6 u6Var) {
        super(context);
        this.f52905b = i10;
        this.f52904a = u6Var;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f));
    }
}
