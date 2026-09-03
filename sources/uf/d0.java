package uf;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pq;
public final class d0 extends FrameLayout {
    public static final int f48569f = 0;
    public final g6 f48570a;
    public final p9 f48571b;
    public final TextView f48572c;
    public pq d;
    public e0 f48573e;

    public d0(Context context, g6 g6Var) {
        super(context);
        this.f48570a = g6Var;
        p9 p9Var = new p9(context);
        this.f48571b = p9Var;
        addView(p9Var, c6.c(30.0f, 30));
        TextView textView = new TextView(context);
        this.f48572c = textView;
        textView.setTextSize(1, 14.0f);
        addView(textView, c6.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        a();
    }

    public final void a() {
        int dp = AndroidUtilities.dp(28.0f);
        int i10 = k6.ci;
        g6 g6Var = this.f48570a;
        setBackground(k6.b0(dp, k6.v0(i10, g6Var)));
        this.f48572c.setTextColor(k6.v0(k6.G6, g6Var));
        pq pqVar = this.d;
        if (pqVar != null) {
            if (this.f48573e.d == 7) {
                k6.v1(pqVar, k6.v0(k6.Oh, g6Var), false);
                k6.v1(this.d, k6.v0(k6.Sh, g6Var), true);
                return;
            }
            k6.v1(pqVar, k6.v0(k6.Oh, g6Var), false);
            k6.v1(this.d, k6.v0(k6.Sh, g6Var), true);
        }
    }

    public void setData(e0 e0Var) {
        float f10;
        this.f48573e = e0Var;
        p9 p9Var = this.f48571b;
        p9Var.getImageReceiver().clearImage();
        int i10 = e0Var.d;
        String str = e0Var.f48584c;
        TextView textView = this.f48572c;
        g6 g6Var = this.f48570a;
        if (i10 == 7) {
            pq L = k6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            this.d = L;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            L.f30161e = dp;
            L.f30162f = dp2;
            k6.v1(this.d, k6.v0(k6.Oh, g6Var), false);
            k6.v1(this.d, k6.v0(k6.Sh, g6Var), true);
            p9Var.setImageDrawable(this.d);
            textView.setText(str);
            return;
        }
        pq L2 = k6.L(AndroidUtilities.dp(32.0f), e0Var.f48582a);
        this.d = L2;
        int i11 = k6.Oh;
        k6.v1(L2, k6.v0(i11, g6Var), false);
        pq pqVar = this.d;
        int i12 = k6.Sh;
        k6.v1(pqVar, k6.v0(i12, g6Var), true);
        if (e0Var.d == 4) {
            TLObject tLObject = e0Var.f48586f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().f20992id == user.f20992id) {
                    pq L3 = k6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
                    int dp3 = AndroidUtilities.dp(16.0f);
                    int dp4 = AndroidUtilities.dp(16.0f);
                    L3.f30161e = dp3;
                    L3.f30162f = dp4;
                    k6.v1(L3, k6.v0(i11, g6Var), false);
                    k6.v1(L3, k6.v0(i12, g6Var), true);
                    p9Var.setImageDrawable(L3);
                } else {
                    p9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(16.0f));
                    p9Var.getImageReceiver().setForUserOrChat(user, this.d);
                }
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                ImageReceiver imageReceiver = p9Var.getImageReceiver();
                if (ChatObject.isCommunity(chat)) {
                    f10 = 10.0f;
                } else {
                    f10 = 16.0f;
                }
                imageReceiver.setRoundRadius(AndroidUtilities.dp(f10));
                p9Var.getImageReceiver().setForUserOrChat(chat, this.d);
            }
        } else {
            p9Var.setImageDrawable(this.d);
        }
        textView.setText(str);
    }
}
