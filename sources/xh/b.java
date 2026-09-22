package xh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
public final class b extends FrameLayout {
    public static final int f45798c = 0;
    public final e6 f45799a;
    public final int f45800b;

    public b(Context context, int i10, e6 e6Var) {
        super(context);
        this.f45800b = i10;
        this.f45799a = e6Var;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f));
    }
}
