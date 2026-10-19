package yh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
public final class b extends FrameLayout {
    public static final int f50169c = 0;
    public final d6 f50170a;
    public final int f50171b;

    public b(Context context, int i10, d6 d6Var) {
        super(context);
        this.f50171b = i10;
        this.f50170a = d6Var;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f));
    }
}
