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
public final class vw0 extends org.telegram.ui.ActionBar.o2 {
    public final long f38517a;
    public org.telegram.ui.Cells.z7 f38518b;
    public org.telegram.ui.Components.v80 f38519c;
    public org.telegram.ui.Components.f61 d;
    public org.telegram.ui.Components.pr e;
    public org.telegram.ui.ActionBar.w0 f38520f;
    public final boolean h;
    public final long f38521n;
    public boolean f38522r;
    public long f38523s;
    public no v;
    public boolean f38524w;

    public vw0(long j3) {
        super(null);
        TLRPC.Chat chat = null;
        boolean z10 = true;
        this.f38524w = true;
        this.f38517a = j3;
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(j3));
        if (chat2 != null && chat2.linked_monoforum_id != 0) {
            chat = getMessagesController().getChat(Long.valueOf(chat2.linked_monoforum_id));
        }
        long j10 = chat != null ? chat.send_paid_messages_stars : 0L;
        z10 = (chat2 == null || !chat2.broadcast_messages_allowed) ? false : false;
        this.h = z10;
        long clamp = Utilities.clamp(z10 ? j10 : getMessagesController().config.starsPaidMessagesChannelAmountDefault.get(), getMessagesController().starsPaidMessageAmountMax, 0L);
        this.f38521n = clamp;
        this.f38522r = z10;
        this.f38523s = clamp;
    }

    public static void U(vw0 vw0Var, TLRPC.TL_error tL_error, TLObject tLObject, TL_stars.updatePaidMessagesPrice updatepaidmessagesprice) {
        long j3;
        if (tL_error != null) {
            vw0Var.e.a(0.0f);
            org.telegram.ui.Components.vc.b0(tL_error);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        vw0Var.getMessagesController().putChats(updates.chats, false);
        vw0Var.getMessagesController().processUpdates(updates, false);
        if (!vw0Var.isFinished && !vw0Var.finishing) {
            no noVar = vw0Var.v;
            if (noVar != null) {
                if (updatepaidmessagesprice.suggestions_allowed) {
                    j3 = updatepaidmessagesprice.send_paid_messages_stars;
                } else {
                    j3 = -1;
                }
                noVar.run(j3);
            }
            vw0Var.finishFragment();
        }
    }

    public final void V(boolean z10) {
        boolean X;
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.f38520f == null || this.f38524w == (X = X())) {
            return;
        }
        this.f38524w = X;
        this.f38520f.setEnabled(X);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f38520f.animate();
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
        org.telegram.ui.ActionBar.w0 w0Var = this.f38520f;
        if (X) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        w0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f38520f;
        if (X) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        w0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f38520f;
        if (X) {
            f13 = 1.0f;
        }
        w0Var3.setScaleY(f13);
    }

    public final String W() {
        int i10 = getMessagesController().starsPaidMessageCommissionPermille;
        return LocaleController.formatString(R.string.PostSuggestionsPriceInfo2, ei.l.G0(i10), String.valueOf(((int) (((((float) this.f38523s) * (i10 / 1000.0f)) / 1000.0d) * getMessagesController().starsUsdWithdrawRate1000)) / 100.0d));
    }

    public final boolean X() {
        if (this.f38523s == this.f38521n && this.f38522r == this.h) {
            return false;
        }
        return true;
    }

    public final void Y() {
        long j3;
        long j10;
        if (this.e.f27120c <= 0.0f) {
            if (!X()) {
                finishFragment();
                return;
            }
            this.e.a(1.0f);
            TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
            MessagesController messagesController = getMessagesController();
            long j11 = this.f38517a;
            updatepaidmessagesprice.channel = messagesController.getInputChannel(j11);
            boolean z10 = this.f38522r;
            if (z10) {
                j3 = this.f38523s;
            } else {
                j3 = 0;
            }
            updatepaidmessagesprice.send_paid_messages_stars = j3;
            updatepaidmessagesprice.suggestions_allowed = z10;
            getConnectionsManager().sendRequest(updatepaidmessagesprice, new dc0(12, this, updatepaidmessagesprice));
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j11));
            if (chat != null) {
                if (this.f38522r) {
                    chat.flags2 |= 65536;
                    chat.broadcast_messages_allowed = true;
                } else {
                    chat.flags2 &= -65537;
                    chat.broadcast_messages_allowed = false;
                }
                getMessagesController().putChat(chat, true);
                TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(chat.linked_monoforum_id));
                if (chat2 != null) {
                    if (this.f38522r) {
                        chat2.flags2 |= 16384;
                        chat2.send_paid_messages_stars = this.f38523s;
                    } else {
                        chat2.flags2 &= -16385;
                        chat2.send_paid_messages_stars = 0L;
                    }
                    getMessagesController().putChat(chat2, true);
                }
            }
            no noVar = this.v;
            if (noVar != null) {
                if (this.f38522r) {
                    j10 = this.f38523s;
                } else {
                    j10 = -1;
                }
                noVar.run(j10);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PostSuggestions));
        this.actionBar.setActionBarMenuOnItemClick(new x70(this, 18));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = org.telegram.ui.ActionBar.j6.f19195v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.e = new org.telegram.ui.Components.pr(mutate, new org.telegram.ui.Components.tp(org.telegram.ui.ActionBar.j6.w0(null, i10, false)));
        this.f38520f = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.e);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18807a7, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Cells.z7 z7Var = new org.telegram.ui.Cells.z7(context, this.resourceProvider);
        this.f38518b = z7Var;
        int i11 = org.telegram.ui.ActionBar.j6.f18863d6;
        z7Var.setBackgroundColor(getThemedColor(i11));
        org.telegram.ui.Components.v80 v80Var = new org.telegram.ui.Components.v80(context, this, null, true, true);
        this.f38519c = v80Var;
        v80Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), 0);
        this.f38519c.setBackgroundColor(getThemedColor(i11));
        this.f38519c.b(true);
        this.f38519c.d(0, null, false);
        org.telegram.ui.Components.f61 f61Var = new org.telegram.ui.Components.f61(context, this.currentAccount, this.classGuid, false, new b5(this, 16), new uw0(this, 2), null, this.resourceProvider);
        this.d = f61Var;
        f61Var.q1();
        frameLayout2.addView(this.d, w7.x5.e(-1, -1, 51));
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.ml0 getListViewForSimpleGlass() {
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
                alertDialog$Builder.f18447a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f18447a.T = LocaleController.getString(R.string.MessageSuggestionsUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new uw0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.Discard), new uw0(this, 1));
                showDialog(alertDialog$Builder.f18447a);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.ui.Components.x51 x51Var;
        super.onFragmentCreate();
        org.telegram.ui.Components.f61 f61Var = this.d;
        if (f61Var != null && (x51Var = f61Var.Y2) != null) {
            x51Var.N(false);
            return true;
        }
        return true;
    }
}
