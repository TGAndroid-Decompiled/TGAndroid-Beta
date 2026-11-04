package zg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.tt0;
import org.telegram.ui.Components.ut0;
public final class v extends FrameLayout {
    public final ut0 f60532a;
    public final View f60533b;

    public v(Context context, e6 e6Var) {
        super(context);
        View view = new View(context);
        this.f60533b = view;
        addView(view, mf.o(-1, -1));
        r6.i(k6.f27954h5, view, e6Var);
        ut0 ut0Var = new ut0(context, e6Var);
        this.f60532a = ut0Var;
        addView(ut0Var, mf.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        r6.a0(this, getContext(), 2131231231, k6.f27843b7);
    }

    public void setCallBack(tt0 tt0Var) {
        this.f60532a.setCallback(tt0Var);
    }
}
