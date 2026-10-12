package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
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
public final class zw0 extends org.telegram.ui.ActionBar.m2 {
    public final long f42723a;
    public org.telegram.ui.Cells.z7 f42724b;
    public org.telegram.ui.Components.w90 f42725c;
    public org.telegram.ui.Components.h71 d;
    public org.telegram.ui.Components.ds e;
    public org.telegram.ui.ActionBar.u0 f42726f;
    public final boolean h;
    public final long f42727n;
    public boolean f42728r;
    public long f42729s;
    public qo v;
    public boolean f42730w;

    public zw0(long j10) {
        super(null);
        TLRPC.Chat chat = null;
        boolean z10 = true;
        this.f42730w = true;
        this.f42723a = j10;
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(j10));
        if (chat2 != null && chat2.linked_monoforum_id != 0) {
            chat = getMessagesController().getChat(Long.valueOf(chat2.linked_monoforum_id));
        }
        long j11 = chat != null ? chat.send_paid_messages_stars : 0L;
        z10 = (chat2 == null || !chat2.broadcast_messages_allowed) ? false : false;
        this.h = z10;
        long clamp = Utilities.clamp(z10 ? j11 : getMessagesController().config.starsPaidMessagesChannelAmountDefault.get(), getMessagesController().starsPaidMessageAmountMax, 0L);
        this.f42727n = clamp;
        this.f42728r = z10;
        this.f42729s = clamp;
    }

    public static void U(zw0 zw0Var, TLRPC.TL_error tL_error, TLObject tLObject, TL_stars.updatePaidMessagesPrice updatepaidmessagesprice) {
        long j10;
        if (tL_error != null) {
            zw0Var.e.a(0.0f);
            org.telegram.ui.Components.zc.d0(tL_error);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        zw0Var.getMessagesController().putChats(updates.chats, false);
        zw0Var.getMessagesController().lambda$processUpdates$377(updates, false);
        if (!zw0Var.isFinished && !zw0Var.finishing) {
            qo qoVar = zw0Var.v;
            if (qoVar != null) {
                if (updatepaidmessagesprice.suggestions_allowed) {
                    j10 = updatepaidmessagesprice.send_paid_messages_stars;
                } else {
                    j10 = -1;
                }
                qoVar.run(j10);
            }
            zw0Var.finishFragment();
        }
    }

    public final void V(boolean z10) {
        boolean X;
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.f42726f == null || this.f42730w == (X = X())) {
            return;
        }
        this.f42730w = X;
        this.f42726f.setEnabled(X);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f42726f.animate();
            if (X) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f11);
            if (X) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f12);
            if (X) {
                f13 = 1.0f;
            }
            scaleX.scaleY(f13).setDuration(180L).start();
            return;
        }
        org.telegram.ui.ActionBar.u0 u0Var = this.f42726f;
        if (X) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        u0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f42726f;
        if (X) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        u0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.u0 u0Var3 = this.f42726f;
        if (X) {
            f13 = 1.0f;
        }
        u0Var3.setScaleY(f13);
    }

    public final String W() {
        int i10 = getMessagesController().starsPaidMessageCommissionPermille;
        return LocaleController.formatString(R.string.PostSuggestionsPriceInfo2, fi.l.H0(i10), String.valueOf(((int) (((((float) this.f42729s) * (i10 / 1000.0f)) / 1000.0d) * getMessagesController().starsUsdWithdrawRate1000)) / 100.0d));
    }

    public final boolean X() {
        if (this.f42729s == this.f42727n && this.f42728r == this.h) {
            return false;
        }
        return true;
    }

    public final void Y() {
        long j10;
        long j11;
        if (this.e.f24480c <= 0.0f) {
            if (!X()) {
                finishFragment();
                return;
            }
            this.e.a(1.0f);
            TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
            MessagesController messagesController = getMessagesController();
            long j12 = this.f42723a;
            updatepaidmessagesprice.channel = messagesController.getInputChannel(j12);
            boolean z10 = this.f42728r;
            if (z10) {
                j10 = this.f42729s;
            } else {
                j10 = 0;
            }
            updatepaidmessagesprice.send_paid_messages_stars = j10;
            updatepaidmessagesprice.suggestions_allowed = z10;
            getConnectionsManager().sendRequest(updatepaidmessagesprice, new fc0(12, this, updatepaidmessagesprice));
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j12));
            if (chat != null) {
                if (this.f42728r) {
                    chat.flags2 |= 65536;
                    chat.broadcast_messages_allowed = true;
                } else {
                    chat.flags2 &= -65537;
                    chat.broadcast_messages_allowed = false;
                }
                getMessagesController().putChat(chat, true);
                TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(chat.linked_monoforum_id));
                if (chat2 != null) {
                    if (this.f42728r) {
                        chat2.flags2 |= 16384;
                        chat2.send_paid_messages_stars = this.f42729s;
                    } else {
                        chat2.flags2 &= -16385;
                        chat2.send_paid_messages_stars = 0L;
                    }
                    getMessagesController().putChat(chat2, true);
                }
            }
            qo qoVar = this.v;
            if (qoVar != null) {
                if (this.f42728r) {
                    j11 = this.f42729s;
                } else {
                    j11 = -1;
                }
                qoVar.run(j11);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PostSuggestions));
        this.actionBar.setActionBarMenuOnItemClick(new q70(this, 20));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = org.telegram.ui.ActionBar.g6.f20235v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.e = new org.telegram.ui.Components.ds(mutate, new org.telegram.ui.Components.gq(org.telegram.ui.ActionBar.g6.x0(null, i10, false)));
        this.f42726f = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.e);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19843a7, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Cells.z7 z7Var = new org.telegram.ui.Cells.z7(context, this.resourceProvider);
        this.f42724b = z7Var;
        int i11 = org.telegram.ui.ActionBar.g6.f19901d6;
        z7Var.setBackgroundColor(getThemedColor(i11));
        org.telegram.ui.Components.w90 w90Var = new org.telegram.ui.Components.w90(context, this, null, true, true);
        this.f42725c = w90Var;
        w90Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), 0);
        this.f42725c.setBackgroundColor(getThemedColor(i11));
        this.f42725c.b(true);
        this.f42725c.d(0, null, false);
        org.telegram.ui.Components.h71 h71Var = new org.telegram.ui.Components.h71(context, this.currentAccount, this.classGuid, false, new f5(this, 16), new yw0(this, 2), null, this.resourceProvider);
        this.d = h71Var;
        h71Var.p1();
        frameLayout2.addView(this.d, w7.a6.e(-1, -1, 51));
        this.actionBar.setAdaptiveBackground(this.d);
        return this.fragmentView;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !X();
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (X()) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.MessageSuggestionsUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new yw0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.Discard), new yw0(this, 1));
                showDialog(alertDialog$Builder.f19548a);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.ui.Components.z61 z61Var;
        super.onFragmentCreate();
        org.telegram.ui.Components.h71 h71Var = this.d;
        if (h71Var != null && (z61Var = h71Var.W2) != null) {
            z61Var.N(false);
            return true;
        }
        return true;
    }
}
