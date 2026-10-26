package xg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.yw0;
import org.telegram.ui.Components.zw0;
public final class v extends FrameLayout {
    public final zw0 f51813a;
    public final View f51814b;

    public v(Context context, u6 u6Var) {
        super(context);
        View view = new View(context);
        this.f51814b = view;
        addView(view, gb1.r(-1, -1));
        f7.i(y6.f23427h5, view, u6Var);
        zw0 zw0Var = new zw0(context, u6Var);
        this.f51813a = zw0Var;
        addView(zw0Var, gb1.h(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        f7.a0(R.drawable.greydivider_top, y6.f23318b7, getContext(), this, null);
    }

    public void setCallBack(yw0 yw0Var) {
        this.f51813a.setCallback(yw0Var);
    }
}
