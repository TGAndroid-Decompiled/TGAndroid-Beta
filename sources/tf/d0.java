package tf;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.p9;
public final class d0 extends FrameLayout {
    public static final int f44754f = 0;
    public final f6 f44755a;
    public final p9 f44756b;
    public final TextView f44757c;
    public mq d;
    public e0 e;

    public d0(Context context, f6 f6Var) {
        super(context);
        this.f44755a = f6Var;
        p9 p9Var = new p9(context);
        this.f44756b = p9Var;
        addView(p9Var, b6.c(30.0f, 30));
        TextView textView = new TextView(context);
        this.f44757c = textView;
        textView.setTextSize(1, 14.0f);
        addView(textView, b6.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        a();
    }

    public final void a() {
        int dp = AndroidUtilities.dp(28.0f);
        int i10 = j6.ci;
        f6 f6Var = this.f44755a;
        setBackground(j6.b0(dp, j6.v0(i10, f6Var)));
        this.f44757c.setTextColor(j6.v0(j6.G6, f6Var));
        mq mqVar = this.d;
        if (mqVar != null) {
            if (this.e.d == 7) {
                j6.v1(mqVar, j6.v0(j6.Oh, f6Var), false);
                j6.v1(this.d, j6.v0(j6.Sh, f6Var), true);
                return;
            }
            j6.v1(mqVar, j6.v0(j6.Oh, f6Var), false);
            j6.v1(this.d, j6.v0(j6.Sh, f6Var), true);
        }
    }

    public void setData(e0 e0Var) {
        float f10;
        this.e = e0Var;
        p9 p9Var = this.f44756b;
        p9Var.getImageReceiver().clearImage();
        int i10 = e0Var.d;
        String str = e0Var.f44767c;
        TextView textView = this.f44757c;
        f6 f6Var = this.f44755a;
        if (i10 == 7) {
            mq L = j6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            this.d = L;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            L.e = dp;
            L.f27112f = dp2;
            j6.v1(this.d, j6.v0(j6.Oh, f6Var), false);
            j6.v1(this.d, j6.v0(j6.Sh, f6Var), true);
            p9Var.setImageDrawable(this.d);
            textView.setText(str);
            return;
        }
        mq L2 = j6.L(AndroidUtilities.dp(32.0f), e0Var.f44765a);
        this.d = L2;
        int i11 = j6.Oh;
        j6.v1(L2, j6.v0(i11, f6Var), false);
        mq mqVar = this.d;
        int i12 = j6.Sh;
        j6.v1(mqVar, j6.v0(i12, f6Var), true);
        if (e0Var.d == 4) {
            TLObject tLObject = e0Var.f44768f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().f19306id == user.f19306id) {
                    mq L3 = j6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
                    int dp3 = AndroidUtilities.dp(16.0f);
                    int dp4 = AndroidUtilities.dp(16.0f);
                    L3.e = dp3;
                    L3.f27112f = dp4;
                    j6.v1(L3, j6.v0(i11, f6Var), false);
                    j6.v1(L3, j6.v0(i12, f6Var), true);
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
