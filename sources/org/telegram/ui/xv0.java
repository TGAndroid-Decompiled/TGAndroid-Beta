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
public final class xv0 extends org.telegram.ui.ActionBar.n2 {
    public final long f43279a;
    public org.telegram.ui.Cells.y7 f43280b;
    public org.telegram.ui.Components.q90 f43281c;
    public org.telegram.ui.Components.c71 d;
    public org.telegram.ui.Components.as e;
    public org.telegram.ui.ActionBar.u0 f43282f;
    public final boolean h;
    public final long f43283n;
    public boolean f43284r;
    public long f43285s;
    public ao v;
    public boolean f43286w;

    public xv0(long j10) {
        super(null);
        TLRPC.Chat chat = null;
        boolean z10 = true;
        this.f43286w = true;
        this.f43279a = j10;
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(j10));
        if (chat2 != null && chat2.linked_monoforum_id != 0) {
            chat = getMessagesController().getChat(Long.valueOf(chat2.linked_monoforum_id));
        }
        long j11 = chat != null ? chat.send_paid_messages_stars : 0L;
        z10 = (chat2 == null || !chat2.broadcast_messages_allowed) ? false : false;
        this.h = z10;
        long clamp = Utilities.clamp(z10 ? j11 : getMessagesController().config.starsPaidMessagesChannelAmountDefault.get(), getMessagesController().starsPaidMessageAmountMax, 0L);
        this.f43283n = clamp;
        this.f43284r = z10;
        this.f43285s = clamp;
    }

    public static void U(xv0 xv0Var, TLRPC.TL_error tL_error, TLObject tLObject, TL_stars.updatePaidMessagesPrice updatepaidmessagesprice) {
        long j10;
        if (tL_error != null) {
            xv0Var.e.a(0.0f);
            org.telegram.ui.Components.xc.d0(tL_error);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        xv0Var.getMessagesController().putChats(updates.chats, false);
        xv0Var.getMessagesController().lambda$processUpdates$377(updates, false);
        if (!xv0Var.isFinished && !xv0Var.finishing) {
            ao aoVar = xv0Var.v;
            if (aoVar != null) {
                if (updatepaidmessagesprice.suggestions_allowed) {
                    j10 = updatepaidmessagesprice.send_paid_messages_stars;
                } else {
                    j10 = -1;
                }
                aoVar.run(j10);
            }
            xv0Var.finishFragment();
        }
    }

    public final void V(boolean z10) {
        boolean X;
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.f43282f == null || this.f43286w == (X = X())) {
            return;
        }
        this.f43286w = X;
        this.f43282f.setEnabled(X);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f43282f.animate();
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
        org.telegram.ui.ActionBar.u0 u0Var = this.f43282f;
        if (X) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        u0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f43282f;
        if (X) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        u0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.u0 u0Var3 = this.f43282f;
        if (X) {
            f13 = 1.0f;
        }
        u0Var3.setScaleY(f13);
    }

    public final String W() {
        int i10 = getMessagesController().starsPaidMessageCommissionPermille;
        return LocaleController.formatString(R.string.PostSuggestionsPriceInfo2, gi.l.H0(i10), String.valueOf(((int) (((((float) this.f43285s) * (i10 / 1000.0f)) / 1000.0d) * getMessagesController().starsUsdWithdrawRate1000)) / 100.0d));
    }

    public final boolean X() {
        if (this.f43285s == this.f43283n && this.f43284r == this.h) {
            return false;
        }
        return true;
    }

    public final void Y() {
        long j10;
        long j11;
        if (this.e.f24707c <= 0.0f) {
            if (!X()) {
                finishFragment();
                return;
            }
            this.e.a(1.0f);
            TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
            MessagesController messagesController = getMessagesController();
            long j12 = this.f43279a;
            updatepaidmessagesprice.channel = messagesController.getInputChannel(j12);
            boolean z10 = this.f43284r;
            if (z10) {
                j10 = this.f43285s;
            } else {
                j10 = 0;
            }
            updatepaidmessagesprice.send_paid_messages_stars = j10;
            updatepaidmessagesprice.suggestions_allowed = z10;
            getConnectionsManager().sendRequest(updatepaidmessagesprice, new x40(19, this, updatepaidmessagesprice));
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j12));
            if (chat != null) {
                if (this.f43284r) {
                    chat.flags2 |= 65536;
                    chat.broadcast_messages_allowed = true;
                } else {
                    chat.flags2 &= -65537;
                    chat.broadcast_messages_allowed = false;
                }
                getMessagesController().putChat(chat, true);
                TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(chat.linked_monoforum_id));
                if (chat2 != null) {
                    if (this.f43284r) {
                        chat2.flags2 |= 16384;
                        chat2.send_paid_messages_stars = this.f43285s;
                    } else {
                        chat2.flags2 &= -16385;
                        chat2.send_paid_messages_stars = 0L;
                    }
                    getMessagesController().putChat(chat2, true);
                }
            }
            ao aoVar = this.v;
            if (aoVar != null) {
                if (this.f43284r) {
                    j11 = this.f43285s;
                } else {
                    j11 = -1;
                }
                aoVar.run(j11);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PostSuggestions));
        this.actionBar.setActionBarMenuOnItemClick(new o60(this, 21));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = org.telegram.ui.ActionBar.h6.f21325v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.e = new org.telegram.ui.Components.as(mutate, new org.telegram.ui.Components.dq(org.telegram.ui.ActionBar.h6.x0(null, i10, false)));
        this.f43282f = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.e);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20932a7, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Cells.y7 y7Var = new org.telegram.ui.Cells.y7(context, this.resourceProvider);
        this.f43280b = y7Var;
        int i11 = org.telegram.ui.ActionBar.h6.f20990d6;
        y7Var.setBackgroundColor(getThemedColor(i11));
        org.telegram.ui.Components.q90 q90Var = new org.telegram.ui.Components.q90(context, this, null, true, true);
        this.f43281c = q90Var;
        q90Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), 0);
        this.f43281c.setBackgroundColor(getThemedColor(i11));
        this.f43281c.b(true);
        this.f43281c.d(0, null, false);
        org.telegram.ui.Components.c71 c71Var = new org.telegram.ui.Components.c71(context, this.currentAccount, this.classGuid, false, new g5(this, 16), new wv0(this, 2), null, this.resourceProvider);
        this.d = c71Var;
        c71Var.p1();
        frameLayout2.addView(this.d, w7.z5.e(-1, -1, 51));
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
                alertDialog$Builder.f20605a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f20605a.T = LocaleController.getString(R.string.MessageSuggestionsUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new wv0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.Discard), new wv0(this, 1));
                showDialog(alertDialog$Builder.f20605a);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.ui.Components.u61 u61Var;
        super.onFragmentCreate();
        org.telegram.ui.Components.c71 c71Var = this.d;
        if (c71Var != null && (u61Var = c71Var.W2) != null) {
            u61Var.N(false);
            return true;
        }
        return true;
    }
}
