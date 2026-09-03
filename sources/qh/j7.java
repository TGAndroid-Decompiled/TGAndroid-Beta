package qh;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.sl0;
public final class j7 extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public final int f45539b;
    public ArrayList f45540c;
    public final TLRPC.InputPeer d;
    public final Utilities.Callback f45541e;
    public final sl0 f45542f;
    public final i7 h;
    public final TextView f45543n;

    public j7(Context context, final int i10, boolean z4, TLRPC.InputPeer inputPeer, final Utilities.Callback callback, final org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, false, false);
        int i11;
        fixNavigationBar();
        MessagesController.getInstance(i10).getStoriesController().R();
        this.f45539b = i10;
        this.f45540c = MessagesController.getInstance(i10).getStoriesController().T;
        this.d = inputPeer;
        this.f45541e = callback;
        this.containerView = new g7(this, context, g6Var);
        sl0 sl0Var = new sl0(context, g6Var);
        this.f45542f = sl0Var;
        int i12 = this.backgroundPaddingLeft;
        sl0Var.setPadding(i12, 0, i12, 0);
        i7 i7Var = new i7(this);
        this.h = i7Var;
        sl0Var.setAdapter(i7Var);
        sl0Var.setLayoutManager(new f2.j0());
        this.containerView.addView(sl0Var, k7.c6.e(-1, -1, 119));
        sl0Var.setOnItemClickListener(new il0() {
            @Override
            public final void f(int i13, View view) {
                if (i13 <= 1) {
                    return;
                }
                j7 j7Var = j7.this;
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) j7Var.f45540c.get(i13 - 2);
                long j10 = inputPeer2.channel_id;
                Utilities.Callback callback2 = callback;
                if (j10 == 0 && inputPeer2.chat_id == 0) {
                    callback2.run(inputPeer2);
                    j7Var.dismiss();
                    return;
                }
                Context context2 = j7Var.getContext();
                org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(context2, 3, g6Var2);
                d2Var.q(200L);
                MessagesController.getInstance(i10).getStoriesController().k(DialogObject.getPeerDialogId(inputPeer2), new fg.f0(d2Var, callback2, inputPeer2, 2), true, g6Var2);
                j7Var.dismiss();
            }
        });
        sl0Var.setOnScrollListener(new h7(this));
        TextView textView = new TextView(getContext());
        this.f45543n = textView;
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.k6.G6, g6Var, textView, 1, 20.0f);
        textView.setPadding(AndroidUtilities.dp(22.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(22.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f));
        textView.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21733h5, g6Var));
        textView.setTypeface(AndroidUtilities.bold());
        if (z4) {
            i11 = R.string.StoryPrivacyPublishLiveAs;
        } else {
            i11 = R.string.StoryPrivacyPublishAs;
        }
        textView.setText(LocaleController.getString(i11));
        this.containerView.addView(textView, k7.c6.c(-2.0f, -1));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (s() > ((int) (AndroidUtilities.displaySize.y * 0.5f))) {
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesSendAsUpdate) {
            this.f45540c = MessagesController.getInstance(this.f45539b).getStoriesController().T;
            this.h.l();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f45539b).addObserver(this, NotificationCenter.storiesSendAsUpdate);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f45539b).removeObserver(this, NotificationCenter.storiesSendAsUpdate);
    }

    public final float s() {
        int R;
        float measuredHeight = this.containerView.getMeasuredHeight();
        int i10 = 0;
        while (true) {
            sl0 sl0Var = this.f45542f;
            if (i10 < sl0Var.getChildCount()) {
                View childAt = sl0Var.getChildAt(i10);
                if (childAt != null && (R = RecyclerView.R(childAt)) != -1 && R > 0) {
                    measuredHeight = Math.min(AndroidUtilities.lerp(measuredHeight, childAt.getY(), childAt.getAlpha()), measuredHeight);
                }
                i10++;
            } else {
                return measuredHeight;
            }
        }
    }
}
