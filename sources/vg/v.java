package vg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.pw0;
import org.telegram.ui.Components.qw0;
import w7.z5;
public final class v extends FrameLayout {
    public final qw0 f48347a;

    public v(Context context, d6 d6Var) {
        super(context);
        View view = new View(context);
        addView(view, z5.n(-1, -1));
        view.setBackgroundColor(i6.v0(i6.f20899h5, d6Var));
        qw0 qw0Var = new qw0(context, d6Var);
        this.f48347a = qw0Var;
        addView(qw0Var, z5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        setBackground(i6.V0(getContext(), R.drawable.greydivider_top, i6.f20791b7));
    }

    public void setCallBack(pw0 pw0Var) {
        this.f48347a.setCallback(pw0Var);
    }
}
