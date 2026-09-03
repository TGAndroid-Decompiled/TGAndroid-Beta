package ph;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import fg.s0;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
public final class i extends LinearLayout {
    public final TextView f44413a;
    public final mh.n f44414b;
    public final s0 f44415c;
    public final qh.d d;

    public i(Context context, g6 g6Var) {
        super(context);
        setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(21.0f));
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f44413a = textView;
        int i10 = k6.f22038y6;
        org.telegram.ui.b.l(i10, g6Var, textView, 1, 14.0f);
        textView.setGravity(17);
        textView.setTextAlignment(4);
        addView(textView, c6.k(0.0f, 0.0f, 0.0f, 19.0f, -1, -2));
        mh.n nVar = new mh.n(1, context, g6Var, true);
        this.f44414b = nVar;
        nVar.setMinWidth(AndroidUtilities.dp(200.0f));
        nVar.g(LocaleController.getString(R.string.ProfileBotAddPreview), false, true);
        addView(nVar, c6.q(-2, 44, 17));
        s0 s0Var = new s0(context, g6Var);
        this.f44415c = s0Var;
        s0Var.setTextColor(k6.v0(i10, g6Var));
        s0Var.setText(LocaleController.getString(R.string.ProfileBotOr));
        s0Var.setTextSize(1, 14.0f);
        s0Var.setTextAlignment(4);
        s0Var.setGravity(17);
        s0Var.setTypeface(AndroidUtilities.bold());
        addView(s0Var, c6.t(165, -2, 17, 0, 17, 0, 12));
        qh.d dVar = new qh.d(context, g6Var, false);
        this.d = dVar;
        dVar.setMinWidth(AndroidUtilities.dp(200.0f));
        addView(dVar, c6.q(-2, 44, 17));
    }
}
