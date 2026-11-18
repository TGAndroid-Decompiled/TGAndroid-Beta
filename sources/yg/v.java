package yg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ma;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.eu0;
public final class v extends FrameLayout {
    public final eu0 f61270a;
    public final View f61271b;

    public v(Context context, i6 i6Var) {
        super(context);
        View view = new View(context);
        this.f61271b = view;
        addView(view, ma.o(-1, -1));
        u6.h(n6.f29469h5, view, i6Var);
        eu0 eu0Var = new eu0(context, i6Var);
        this.f61270a = eu0Var;
        addView(eu0Var, ma.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        u6.Z(this, getContext(), 2131231231, n6.f29360b7);
    }

    public void setCallBack(du0 du0Var) {
        this.f61270a.setCallback(du0Var);
    }
}
