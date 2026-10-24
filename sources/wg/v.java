package wg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Components.rw0;
import w7.z5;
public final class v extends FrameLayout {
    public final rw0 f49450a;
    public final View f49451b;

    public v(Context context, g6 g6Var) {
        super(context);
        View view = new View(context);
        this.f49451b = view;
        addView(view, z5.n(-1, -1));
        r6.i(k6.f21255h5, view, g6Var);
        rw0 rw0Var = new rw0(context, g6Var);
        this.f49450a = rw0Var;
        addView(rw0Var, z5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        r6.b0(R.drawable.greydivider_top, k6.f21146b7, getContext(), this, null);
    }

    public void setCallBack(qw0 qw0Var) {
        this.f49450a.setCallback(qw0Var);
    }
}
