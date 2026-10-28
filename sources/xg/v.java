package xg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ax0;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.zw0;
public final class v extends FrameLayout {
    public final ax0 f51871a;
    public final View f51872b;

    public v(Context context, u6 u6Var) {
        super(context);
        View view = new View(context);
        this.f51872b = view;
        addView(view, kb1.r(-1, -1));
        f7.i(y6.f23428h5, view, u6Var);
        ax0 ax0Var = new ax0(context, u6Var);
        this.f51871a = ax0Var;
        addView(ax0Var, kb1.h(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        f7.a0(R.drawable.greydivider_top, y6.f23319b7, getContext(), this, null);
    }

    public void setCallBack(zw0 zw0Var) {
        this.f51871a.setCallback(zw0Var);
    }
}
