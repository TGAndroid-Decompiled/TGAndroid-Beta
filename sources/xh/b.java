package xh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
public final class b extends FrameLayout {
    public static final int f45802c = 0;
    public final e6 f45803a;
    public final int f45804b;

    public b(Context context, int i10, e6 e6Var) {
        super(context);
        this.f45804b = i10;
        this.f45803a = e6Var;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f));
    }
}
