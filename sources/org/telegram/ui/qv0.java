package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class qv0 extends org.telegram.ui.ActionBar.n2 {

    public final long f41750a;

    public org.telegram.ui.Cells.u7 f41751b;

    public org.telegram.ui.Components.i80 f41752c;
    public org.telegram.ui.Components.k51 d;

    public org.telegram.ui.Components.dr f41753e;

    public org.telegram.ui.ActionBar.v0 f41754f;
    public final boolean h;

    public final long f41755n;

    public boolean f41756r;

    public long f41757s;
    public bo v;

    public boolean f41758w;

    public qv0(long j10) {
        super(null);
        TLRPC.Chat chat = null;
        this.f41758w = true;
        this.f41750a = j10;
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(j10));
        if (chat2 != null && chat2.linked_monoforum_id != 0) {
            chat = getMessagesController().getChat(Long.valueOf(chat2.linked_monoforum_id));
        }
        long j11 = chat != null ? chat.send_paid_messages_stars : 0L;
        boolean z10 = chat2 != null && chat2.broadcast_messages_allowed;
        this.h = z10;
        long jClamp = Utilities.clamp(z10 ? j11 : getMessagesController().config.starsPaidMessagesChannelAmountDefault.get(), getMessagesController().starsPaidMessageAmountMax, 0L);
        this.f41755n = jClamp;
        this.f41756r = z10;
        this.f41757s = jClamp;
    }

    public static void U(qv0 qv0Var, TLRPC.TL_error tL_error, TLObject tLObject, TL_stars.updatePaidMessagesPrice updatepaidmessagesprice) {
        if (tL_error != null) {
            qv0Var.f41753e.a(0.0f);
            org.telegram.ui.Components.mc.b0(tL_error);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        qv0Var.getMessagesController().putChats(updates.chats, false);
        qv0Var.getMessagesController().processUpdates(updates, false);
        if (qv0Var.isFinished || qv0Var.finishing) {
            return;
        }
        bo boVar = qv0Var.v;
        if (boVar != null) {
            boVar.run(updatepaidmessagesprice.suggestions_allowed ? updatepaidmessagesprice.send_paid_messages_stars : -1L);
        }
        qv0Var.finishFragment();
    }

    public final void V(boolean z10) {
        boolean zX;
        if (this.f41754f == null || this.f41758w == (zX = X())) {
            return;
        }
        this.f41758w = zX;
        this.f41754f.setEnabled(zX);
        if (z10) {
            this.f41754f.animate().alpha(zX ? 1.0f : 0.0f).scaleX(zX ? 1.0f : 0.0f).scaleY(zX ? 1.0f : 0.0f).setDuration(180L).start();
            return;
        }
        this.f41754f.setAlpha(zX ? 1.0f : 0.0f);
        this.f41754f.setScaleX(zX ? 1.0f : 0.0f);
        this.f41754f.setScaleY(zX ? 1.0f : 0.0f);
    }

    public final String W() {
        int i10 = getMessagesController().starsPaidMessageCommissionPermille;
        return LocaleController.formatString(R.string.PostSuggestionsPriceInfo2, nh.k.G0(i10), String.valueOf(((double) ((int) ((((double) (this.f41757s * (i10 / 1000.0f))) / 1000.0d) * ((double) getMessagesController().starsUsdWithdrawRate1000)))) / 100.0d));
    }

    public final boolean X() {
        return (this.f41757s == this.f41755n && this.f41756r == this.h) ? false : true;
    }

    public final void Y() {
        if (this.f41753e.f27834c > 0.0f) {
            return;
        }
        if (!X()) {
            finishFragment();
            return;
        }
        this.f41753e.a(1.0f);
        TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
        MessagesController messagesController = getMessagesController();
        long j10 = this.f41750a;
        updatepaidmessagesprice.channel = messagesController.getInputChannel(j10);
        boolean z10 = this.f41756r;
        updatepaidmessagesprice.send_paid_messages_stars = z10 ? this.f41757s : 0L;
        updatepaidmessagesprice.suggestions_allowed = z10;
        getConnectionsManager().sendRequest(updatepaidmessagesprice, new v80(16, this, updatepaidmessagesprice));
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j10));
        if (chat != null) {
            if (this.f41756r) {
                chat.flags2 |= 65536;
                chat.broadcast_messages_allowed = true;
            } else {
                chat.flags2 &= -65537;
                chat.broadcast_messages_allowed = false;
            }
            getMessagesController().putChat(chat, true);
            TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(chat.linked_monoforum_id));
            if (chat2 != null) {
                if (this.f41756r) {
                    chat2.flags2 |= 16384;
                    chat2.send_paid_messages_stars = this.f41757s;
                } else {
                    chat2.flags2 &= -16385;
                    chat2.send_paid_messages_stars = 0L;
                }
                getMessagesController().putChat(chat2, true);
            }
        }
        bo boVar = this.v;
        if (boVar != null) {
            boVar.run(this.f41756r ? this.f41757s : -1L);
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PostSuggestions));
        this.actionBar.setActionBarMenuOnItemClick(new pb0(this, 14));
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = org.telegram.ui.ActionBar.g6.f23375v8;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f41753e = new org.telegram.ui.Components.dr(drawableMutate, new org.telegram.ui.Components.hp(org.telegram.ui.ActionBar.g6.w0(null, i10, false)));
        this.f41754f = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f41753e);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Cells.u7 u7Var = new org.telegram.ui.Cells.u7(context, this.resourceProvider);
        this.f41751b = u7Var;
        int i11 = org.telegram.ui.ActionBar.g6.f23053d6;
        u7Var.setBackgroundColor(getThemedColor(i11));
        org.telegram.ui.Components.i80 i80Var = new org.telegram.ui.Components.i80(context, this, null, true, true);
        this.f41752c = i80Var;
        i80Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), 0);
        this.f41752c.setBackgroundColor(getThemedColor(i11));
        this.f41752c.b(true);
        this.f41752c.d(0, null, false);
        org.telegram.ui.Components.k51 k51Var = new org.telegram.ui.Components.k51(context, this.currentAccount, this.classGuid, false, new b5(this, 16), new pv0(this, 2), null, this.resourceProvider);
        this.d = k51Var;
        k51Var.p1();
        frameLayout2.addView(this.d, h7.z5.e(-1, -1, 51));
        this.actionBar.setAdaptiveBackground(this.d);
        return this.fragmentView;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !X();
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (!X()) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.UnsavedChanges);
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.MessageSuggestionsUnsavedChanges);
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new pv0(this, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.Discard), new pv0(this, 1));
        showDialog(alertDialog$Builder.f22702a);
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.ui.Components.b51 b51Var;
        super.onFragmentCreate();
        org.telegram.ui.Components.k51 k51Var = this.d;
        if (k51Var == null || (b51Var = k51Var.U2) == null) {
            return true;
        }
        b51Var.N(false);
        return true;
    }
}
