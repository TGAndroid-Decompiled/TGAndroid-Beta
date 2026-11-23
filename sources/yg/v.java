package yg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.na;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.gu0;
import org.telegram.ui.Components.hu0;
public final class v extends FrameLayout {
    public final hu0 f61281a;
    public final View f61282b;

    public v(Context context, h6 h6Var) {
        super(context);
        View view = new View(context);
        this.f61282b = view;
        addView(view, na.o(-1, -1));
        t6.h(m6.f29420h5, view, h6Var);
        hu0 hu0Var = new hu0(context, h6Var);
        this.f61281a = hu0Var;
        addView(hu0Var, na.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        t6.Z(this, getContext(), 2131231231, m6.f29311b7);
    }

    public void setCallBack(gu0 gu0Var) {
        this.f61281a.setCallback(gu0Var);
    }
}
