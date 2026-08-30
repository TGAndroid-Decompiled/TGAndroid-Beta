package ph;

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
public final class m7 extends org.telegram.ui.ActionBar.g3 implements NotificationCenter.NotificationCenterDelegate {
    public final int f41964b;
    public ArrayList f41965c;
    public final TLRPC.InputPeer d;
    public final Utilities.Callback e;
    public final sl0 f41966f;
    public final l7 h;
    public final TextView f41967n;

    public m7(Context context, final int i10, boolean z4, TLRPC.InputPeer inputPeer, final Utilities.Callback callback, final org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, false, false);
        int i11;
        fixNavigationBar();
        MessagesController.getInstance(i10).getStoriesController().R();
        this.f41964b = i10;
        this.f41965c = MessagesController.getInstance(i10).getStoriesController().T;
        this.d = inputPeer;
        this.e = callback;
        this.containerView = new j7(this, context, f6Var);
        sl0 sl0Var = new sl0(context, f6Var);
        this.f41966f = sl0Var;
        int i12 = this.backgroundPaddingLeft;
        sl0Var.setPadding(i12, 0, i12, 0);
        l7 l7Var = new l7(this);
        this.h = l7Var;
        sl0Var.setAdapter(l7Var);
        sl0Var.setLayoutManager(new f2.i0());
        this.containerView.addView(sl0Var, k7.b6.e(-1, -1, 119));
        sl0Var.setOnItemClickListener(new il0() {
            @Override
            public final void f(int i13, View view) {
                if (i13 <= 1) {
                    return;
                }
                m7 m7Var = m7.this;
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) m7Var.f41965c.get(i13 - 2);
                long j10 = inputPeer2.channel_id;
                Utilities.Callback callback2 = callback;
                if (j10 == 0 && inputPeer2.chat_id == 0) {
                    callback2.run(inputPeer2);
                    m7Var.dismiss();
                    return;
                }
                Context context2 = m7Var.getContext();
                org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(context2, 3, f6Var2);
                d2Var.q(200L);
                MessagesController.getInstance(i10).getStoriesController().k(DialogObject.getPeerDialogId(inputPeer2), new eg.f0(d2Var, callback2, inputPeer2, 2), true, f6Var2);
                m7Var.dismiss();
            }
        });
        sl0Var.setOnScrollListener(new k7(this));
        TextView textView = new TextView(getContext());
        this.f41967n = textView;
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.j6.G6, f6Var, textView, 1, 20.0f);
        textView.setPadding(AndroidUtilities.dp(22.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(22.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f));
        textView.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19977h5, f6Var));
        textView.setTypeface(AndroidUtilities.bold());
        if (z4) {
            i11 = R.string.StoryPrivacyPublishLiveAs;
        } else {
            i11 = R.string.StoryPrivacyPublishAs;
        }
        textView.setText(LocaleController.getString(i11));
        this.containerView.addView(textView, k7.b6.c(-2.0f, -1));
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
            this.f41965c = MessagesController.getInstance(this.f41964b).getStoriesController().T;
            this.h.l();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f41964b).addObserver(this, NotificationCenter.storiesSendAsUpdate);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f41964b).removeObserver(this, NotificationCenter.storiesSendAsUpdate);
    }

    public final float s() {
        int R;
        float measuredHeight = this.containerView.getMeasuredHeight();
        int i10 = 0;
        while (true) {
            sl0 sl0Var = this.f41966f;
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
