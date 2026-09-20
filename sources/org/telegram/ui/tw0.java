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
public final class tw0 extends org.telegram.ui.ActionBar.n2 {
    public final long f37890a;
    public org.telegram.ui.Cells.a8 f37891b;
    public org.telegram.ui.Components.d90 f37892c;
    public org.telegram.ui.Components.s61 d;
    public org.telegram.ui.Components.pr e;
    public org.telegram.ui.ActionBar.v0 f37893f;
    public final boolean h;
    public final long f37894n;
    public boolean f37895r;
    public long f37896s;
    public lo v;
    public boolean f37897w;

    public tw0(long j3) {
        super(null);
        TLRPC.Chat chat = null;
        boolean z10 = true;
        this.f37897w = true;
        this.f37890a = j3;
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(j3));
        if (chat2 != null && chat2.linked_monoforum_id != 0) {
            chat = getMessagesController().getChat(Long.valueOf(chat2.linked_monoforum_id));
        }
        long j10 = chat != null ? chat.send_paid_messages_stars : 0L;
        z10 = (chat2 == null || !chat2.broadcast_messages_allowed) ? false : false;
        this.h = z10;
        long clamp = Utilities.clamp(z10 ? j10 : getMessagesController().config.starsPaidMessagesChannelAmountDefault.get(), getMessagesController().starsPaidMessageAmountMax, 0L);
        this.f37894n = clamp;
        this.f37895r = z10;
        this.f37896s = clamp;
    }

    public static void U(tw0 tw0Var, TLRPC.TL_error tL_error, TLObject tLObject, TL_stars.updatePaidMessagesPrice updatepaidmessagesprice) {
        long j3;
        if (tL_error != null) {
            tw0Var.e.a(0.0f);
            org.telegram.ui.Components.xc.b0(tL_error);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        tw0Var.getMessagesController().putChats(updates.chats, false);
        tw0Var.getMessagesController().processUpdates(updates, false);
        if (!tw0Var.isFinished && !tw0Var.finishing) {
            lo loVar = tw0Var.v;
            if (loVar != null) {
                if (updatepaidmessagesprice.suggestions_allowed) {
                    j3 = updatepaidmessagesprice.send_paid_messages_stars;
                } else {
                    j3 = -1;
                }
                loVar.run(j3);
            }
            tw0Var.finishFragment();
        }
    }

    public final void V(boolean z10) {
        boolean X;
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.f37893f == null || this.f37897w == (X = X())) {
            return;
        }
        this.f37897w = X;
        this.f37893f.setEnabled(X);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f37893f.animate();
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
        org.telegram.ui.ActionBar.v0 v0Var = this.f37893f;
        if (X) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        v0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.v0 v0Var2 = this.f37893f;
        if (X) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        v0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.v0 v0Var3 = this.f37893f;
        if (X) {
            f13 = 1.0f;
        }
        v0Var3.setScaleY(f13);
    }

    public final String W() {
        int i10 = getMessagesController().starsPaidMessageCommissionPermille;
        return LocaleController.formatString(R.string.PostSuggestionsPriceInfo2, ei.l.G0(i10), String.valueOf(((int) (((((float) this.f37896s) * (i10 / 1000.0f)) / 1000.0d) * getMessagesController().starsUsdWithdrawRate1000)) / 100.0d));
    }

    public final boolean X() {
        if (this.f37896s == this.f37894n && this.f37895r == this.h) {
            return false;
        }
        return true;
    }

    public final void Y() {
        long j3;
        long j10;
        if (this.e.f27431c <= 0.0f) {
            if (!X()) {
                finishFragment();
                return;
            }
            this.e.a(1.0f);
            TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
            MessagesController messagesController = getMessagesController();
            long j11 = this.f37890a;
            updatepaidmessagesprice.channel = messagesController.getInputChannel(j11);
            boolean z10 = this.f37895r;
            if (z10) {
                j3 = this.f37896s;
            } else {
                j3 = 0;
            }
            updatepaidmessagesprice.send_paid_messages_stars = j3;
            updatepaidmessagesprice.suggestions_allowed = z10;
            getConnectionsManager().sendRequest(updatepaidmessagesprice, new dc0(12, this, updatepaidmessagesprice));
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j11));
            if (chat != null) {
                if (this.f37895r) {
                    chat.flags2 |= 65536;
                    chat.broadcast_messages_allowed = true;
                } else {
                    chat.flags2 &= -65537;
                    chat.broadcast_messages_allowed = false;
                }
                getMessagesController().putChat(chat, true);
                TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(chat.linked_monoforum_id));
                if (chat2 != null) {
                    if (this.f37895r) {
                        chat2.flags2 |= 16384;
                        chat2.send_paid_messages_stars = this.f37896s;
                    } else {
                        chat2.flags2 &= -16385;
                        chat2.send_paid_messages_stars = 0L;
                    }
                    getMessagesController().putChat(chat2, true);
                }
            }
            lo loVar = this.v;
            if (loVar != null) {
                if (this.f37895r) {
                    j10 = this.f37896s;
                } else {
                    j10 = -1;
                }
                loVar.run(j10);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PostSuggestions));
        this.actionBar.setActionBarMenuOnItemClick(new v70(this, 18));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = org.telegram.ui.ActionBar.j6.f19427v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.e = new org.telegram.ui.Components.pr(mutate, new org.telegram.ui.Components.tp(org.telegram.ui.ActionBar.j6.w0(null, i10, false)));
        this.f37893f = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.e);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19038a7, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Cells.a8 a8Var = new org.telegram.ui.Cells.a8(context, this.resourceProvider);
        this.f37891b = a8Var;
        int i11 = org.telegram.ui.ActionBar.j6.f19094d6;
        a8Var.setBackgroundColor(getThemedColor(i11));
        org.telegram.ui.Components.d90 d90Var = new org.telegram.ui.Components.d90(context, this, null, true, true);
        this.f37892c = d90Var;
        d90Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), 0);
        this.f37892c.setBackgroundColor(getThemedColor(i11));
        this.f37892c.b(true);
        this.f37892c.d(0, null, false);
        org.telegram.ui.Components.s61 s61Var = new org.telegram.ui.Components.s61(context, this.currentAccount, this.classGuid, false, new b5(this, 16), new sw0(this, 2), null, this.resourceProvider);
        this.d = s61Var;
        s61Var.q1();
        frameLayout2.addView(this.d, w7.y5.e(-1, -1, 51));
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.vl0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
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
                alertDialog$Builder.f18654a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f18654a.T = LocaleController.getString(R.string.MessageSuggestionsUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new sw0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.Discard), new sw0(this, 1));
                showDialog(alertDialog$Builder.f18654a);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.ui.Components.k61 k61Var;
        super.onFragmentCreate();
        org.telegram.ui.Components.s61 s61Var = this.d;
        if (s61Var != null && (k61Var = s61Var.Y2) != null) {
            k61Var.N(false);
            return true;
        }
        return true;
    }
}
