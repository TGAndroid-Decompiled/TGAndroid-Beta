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
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.tl0;
public final class k7 extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public final int f45592b;
    public ArrayList f45593c;
    public final TLRPC.InputPeer d;
    public final Utilities.Callback f45594e;
    public final tl0 f45595f;
    public final j7 h;
    public final TextView f45596n;

    public k7(Context context, final int i10, boolean z4, TLRPC.InputPeer inputPeer, final Utilities.Callback callback, final org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, false, false);
        int i11;
        fixNavigationBar();
        MessagesController.getInstance(i10).getStoriesController().R();
        this.f45592b = i10;
        this.f45593c = MessagesController.getInstance(i10).getStoriesController().T;
        this.d = inputPeer;
        this.f45594e = callback;
        this.containerView = new h7(this, context, g6Var);
        tl0 tl0Var = new tl0(context, g6Var);
        this.f45595f = tl0Var;
        int i12 = this.backgroundPaddingLeft;
        tl0Var.setPadding(i12, 0, i12, 0);
        j7 j7Var = new j7(this);
        this.h = j7Var;
        tl0Var.setAdapter(j7Var);
        tl0Var.setLayoutManager(new f2.j0());
        this.containerView.addView(tl0Var, k7.c6.e(-1, -1, 119));
        tl0Var.setOnItemClickListener(new jl0() {
            @Override
            public final void f(int i13, View view) {
                if (i13 <= 1) {
                    return;
                }
                k7 k7Var = k7.this;
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) k7Var.f45593c.get(i13 - 2);
                long j10 = inputPeer2.channel_id;
                Utilities.Callback callback2 = callback;
                if (j10 == 0 && inputPeer2.chat_id == 0) {
                    callback2.run(inputPeer2);
                    k7Var.dismiss();
                    return;
                }
                Context context2 = k7Var.getContext();
                org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(context2, 3, g6Var2);
                d2Var.q(200L);
                MessagesController.getInstance(i10).getStoriesController().k(DialogObject.getPeerDialogId(inputPeer2), new fg.f0(d2Var, callback2, inputPeer2, 2), true, g6Var2);
                k7Var.dismiss();
            }
        });
        tl0Var.setOnScrollListener(new i7(this));
        TextView textView = new TextView(getContext());
        this.f45596n = textView;
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.k6.G6, g6Var, textView, 1, 20.0f);
        textView.setPadding(AndroidUtilities.dp(22.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(22.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f));
        textView.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21731h5, g6Var));
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
            this.f45593c = MessagesController.getInstance(this.f45592b).getStoriesController().T;
            this.h.l();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f45592b).addObserver(this, NotificationCenter.storiesSendAsUpdate);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f45592b).removeObserver(this, NotificationCenter.storiesSendAsUpdate);
    }

    public final float s() {
        int R;
        float measuredHeight = this.containerView.getMeasuredHeight();
        int i10 = 0;
        while (true) {
            tl0 tl0Var = this.f45595f;
            if (i10 < tl0Var.getChildCount()) {
                View childAt = tl0Var.getChildAt(i10);
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
