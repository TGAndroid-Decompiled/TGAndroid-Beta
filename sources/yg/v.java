package yg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.ut0;
import org.telegram.ui.Components.vt0;
public final class v extends FrameLayout {
    public final vt0 f59394a;
    public final View f59395b;

    public v(Context context, f6 f6Var) {
        super(context);
        View view = new View(context);
        this.f59395b = view;
        addView(view, ha.o(-1, -1));
        r6.i(k6.f27921h5, view, f6Var);
        vt0 vt0Var = new vt0(context, f6Var);
        this.f59394a = vt0Var;
        addView(vt0Var, ha.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        r6.a0(this, getContext(), 2131231231, k6.f27812b7);
    }

    public void setCallBack(ut0 ut0Var) {
        this.f59394a.setCallback(ut0Var);
    }
}
