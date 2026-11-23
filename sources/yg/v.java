package yg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ma;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.gu0;
import org.telegram.ui.Components.hu0;
public final class v extends FrameLayout {
    public final hu0 f61316a;
    public final View f61317b;

    public v(Context context, h6 h6Var) {
        super(context);
        View view = new View(context);
        this.f61317b = view;
        addView(view, ma.o(-1, -1));
        t6.h(m6.f29454h5, view, h6Var);
        hu0 hu0Var = new hu0(context, h6Var);
        this.f61316a = hu0Var;
        addView(hu0Var, ma.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        t6.Z(this, getContext(), 2131231231, m6.f29345b7);
    }

    public void setCallBack(gu0 gu0Var) {
        this.f61316a.setCallback(gu0Var);
    }
}
