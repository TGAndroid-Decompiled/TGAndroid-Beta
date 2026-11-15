package yg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ja;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.vt0;
import org.telegram.ui.Components.wt0;
public final class v extends FrameLayout {
    public final wt0 f60703a;
    public final View f60704b;

    public v(Context context, e6 e6Var) {
        super(context);
        View view = new View(context);
        this.f60704b = view;
        addView(view, ja.o(-1, -1));
        q6.h(j6.f28922h5, view, e6Var);
        wt0 wt0Var = new wt0(context, e6Var);
        this.f60703a = wt0Var;
        addView(wt0Var, ja.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        q6.Z(this, getContext(), 2131231231, j6.f28813b7);
    }

    public void setCallBack(vt0 vt0Var) {
        this.f60703a.setCallback(vt0Var);
    }
}
