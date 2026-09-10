package zh;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.w9;
public final class j0 extends FrameLayout {
    public final g0 f48526a;
    public final w9 f48527b;
    public final g9 f48528c;
    public final ImageView d;
    public final h0 e;
    public l0 f48529f;

    public j0(Context context) {
        super(context);
        w7.c6.a(this);
        g0 g0Var = new g0(this, context);
        this.f48526a = g0Var;
        g0Var.setOrientation(0);
        addView(g0Var, w7.a6.d(-2, -2.0f, 119, 0.0f, 0.0f, 6.0f, 0.0f));
        this.f48528c = new g9((org.telegram.ui.ActionBar.f6) null);
        w9 w9Var = new w9(context);
        this.f48527b = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        g0Var.addView(w9Var, w7.a6.p(22, 22, 0.0f, 51, 3, 2, 7, 2));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setVisibility(8);
        g0Var.addView(imageView, w7.a6.t(18, 18, 19, 0, 0, 3, 0));
        h0 h0Var = new h0(context);
        this.e = h0Var;
        h0Var.setLines(1);
        h0Var.setSingleLine();
        h0Var.setTextColor(-1);
        h0Var.setTextSize(1, 14.0f);
        h0Var.setTypeface(AndroidUtilities.bold());
        g0Var.addView(h0Var, w7.a6.t(-2, -2, 16, 0, 0, 7, 0));
    }

    public void set(l0 l0Var) {
        this.f48529f = l0Var;
        long j3 = l0Var.f48632b;
        w9 w9Var = this.f48527b;
        g9 g9Var = this.f48528c;
        if (j3 >= 0) {
            TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(l0Var.f48632b));
            g9Var.r(user);
            w9Var.e(user, g9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-l0Var.f48632b));
            g9Var.q(chat);
            w9Var.e(chat, g9Var);
        }
        int i10 = l0Var.e;
        ImageView imageView = this.d;
        if (i10 > 0) {
            imageView.setImageDrawable(new b0(getContext(), l0Var.e));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        this.e.setText(DialogObject.getName(l0Var.f48632b));
        this.f48526a.invalidate();
    }
}
