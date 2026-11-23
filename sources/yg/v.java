package yg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.na;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.fu0;
import org.telegram.ui.Components.gu0;
public final class v extends FrameLayout {
    public final gu0 f61400a;
    public final View f61401b;

    public v(Context context, i6 i6Var) {
        super(context);
        View view = new View(context);
        this.f61401b = view;
        addView(view, na.o(-1, -1));
        u6.h(n6.f29524h5, view, i6Var);
        gu0 gu0Var = new gu0(context, i6Var);
        this.f61400a = gu0Var;
        addView(gu0Var, na.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        u6.Z(this, getContext(), 2131231234, n6.f29415b7);
    }

    public void setCallBack(fu0 fu0Var) {
        this.f61400a.setCallback(fu0Var);
    }
}
