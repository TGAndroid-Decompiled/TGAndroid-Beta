package qh;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qv0;
public final class j6 extends FrameLayout {
    public final int f45535a;
    public final org.telegram.ui.Components.z8 f45536b;
    public final org.telegram.ui.Components.p9 f45537c;
    public final TextView d;
    public ViewPropertyAnimator f45538e;

    public j6(Activity activity, int i10) {
        super(activity);
        this.f45535a = i10;
        this.f45536b = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(activity);
        this.f45537c = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(15.0f));
        addView(p9Var, k7.c6.d(30, 30.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, k7.c6.d(-1, -2.0f, 51, 53.0f, 11.33f, 12.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 12.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.l1(0.85f, -1));
        addView(textView2, k7.c6.d(-1, -2.0f, 51, 53.0f, 29.33f, 12.0f, 0.0f));
        textView2.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.LiveStoryPeerChange), false, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.33f), 1.0f));
        set(null);
    }

    public final void a(boolean z4, boolean z10) {
        ViewPropertyAnimator viewPropertyAnimator = this.f45538e;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            this.f45538e = null;
        }
        float f10 = 0.0f;
        int i10 = 0;
        if (z10) {
            setVisibility(0);
            ViewPropertyAnimator animate = animate();
            if (z4) {
                f10 = 1.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f10).setInterpolator(pr.h).withEndAction(new qv0(14, this, z4)).setDuration(320L);
            this.f45538e = duration;
            duration.start();
            return;
        }
        if (!z4) {
            i10 = 8;
        }
        setVisibility(i10);
        if (z4) {
            f10 = 1.0f;
        }
        setAlpha(f10);
    }

    public void set(TLRPC.InputPeer inputPeer) {
        long peerDialogId;
        String str;
        int i10 = this.f45535a;
        if (inputPeer == null) {
            peerDialogId = UserConfig.getInstance(i10).getClientUserId();
        } else {
            peerDialogId = DialogObject.getPeerDialogId(inputPeer);
        }
        TextView textView = this.d;
        org.telegram.ui.Components.p9 p9Var = this.f45537c;
        org.telegram.ui.Components.z8 z8Var = this.f45536b;
        if (peerDialogId >= 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId));
            z8Var.r(user);
            p9Var.e(user, z8Var);
            textView.setText(UserObject.getUserName(user));
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
        z8Var.q(chat);
        p9Var.e(chat, z8Var);
        if (chat == null) {
            str = "";
        } else {
            str = chat.title;
        }
        textView.setText(str);
    }
}
