package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class yz extends org.telegram.ui.ActionBar.m2 {
    public boolean E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public org.telegram.ui.Components.a10 P;
    public pz Q;
    public final aj R;
    public ValueAnimator S;
    public float T;
    public wb1 f40285a;
    public xz f40286b;
    public final MessagesController.DialogFilter f40287c;
    public final TL_chatlists.TL_exportedChatlistInvite d;
    public final ArrayList e;
    public final ArrayList f40288f;
    public final ArrayList h;
    public org.telegram.ui.Components.qr f40289n;
    public org.telegram.ui.ActionBar.u0 f40290r;
    public int f40291s;
    public long v;
    public long f40292w;
    public Utilities.Callback f40293x;
    public Utilities.Callback f40294y;

    public yz(MessagesController.DialogFilter dialogFilter, TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        super(null);
        this.e = new ArrayList();
        this.f40288f = new ArrayList();
        this.h = new ArrayList();
        this.f40291s = -5;
        this.E = false;
        this.H = 0;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.R = new aj(this, 28);
        this.T = 1.0f;
        this.f40287c = dialogFilter;
        this.d = tL_exportedChatlistInvite;
    }

    public static void U(yz yzVar, TLRPC.TL_error tL_error) {
        yzVar.e0(false);
        yzVar.E = false;
        if (tL_error != null && "INVITES_TOO_MUCH".equals(tL_error.text)) {
            yzVar.showDialog(new rg.j0(12, yzVar.currentAccount, yzVar.getParentActivity(), yzVar, null));
        } else if (tL_error != null && "INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            yzVar.showDialog(new rg.j0(4, yzVar.currentAccount, yzVar.getParentActivity(), yzVar, null));
        } else if (tL_error != null && "CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            yzVar.showDialog(new rg.j0(13, yzVar.currentAccount, yzVar.getParentActivity(), yzVar, null));
        } else {
            yzVar.finishFragment();
        }
    }

    public static void V(yz yzVar, View view, int i10) {
        String string;
        String str;
        yz yzVar2;
        ArrayList arrayList = yzVar.e;
        if (yzVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.g4)) {
            Long l4 = (Long) yzVar.h.get(i10 - yzVar.M);
            long longValue = l4.longValue();
            if (arrayList.contains(l4)) {
                arrayList.remove(l4);
                yzVar.G = true;
                yzVar.X();
                ((org.telegram.ui.Cells.g4) view).c(false, true);
                yzVar2 = yzVar;
            } else if (yzVar.f40288f.contains(l4)) {
                if (arrayList.size() + 1 > yzVar.a0()) {
                    yzVar.showDialog(new rg.j0(4, yzVar.currentAccount, yzVar.getParentActivity(), yzVar, null));
                    return;
                }
                yzVar2 = yzVar;
                arrayList.add(l4);
                yzVar2.G = true;
                yzVar2.X();
                ((org.telegram.ui.Cells.g4) view).c(true, true);
            } else {
                int i11 = -yzVar.f40291s;
                yzVar.f40291s = i11;
                AndroidUtilities.shakeViewSpring(view, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                ArrayList arrayList2 = new ArrayList();
                if (longValue >= 0) {
                    arrayList2.add(yzVar.getMessagesController().getUser(l4));
                    TLRPC.User user = yzVar.getMessagesController().getUser(l4);
                    if (user != null && user.bot) {
                        str = LocaleController.getString(R.string.FilterInviteBotToast);
                    } else {
                        str = LocaleController.getString(R.string.FilterInviteUserToast);
                    }
                } else {
                    TLRPC.Chat chat = yzVar.getMessagesController().getChat(Long.valueOf(-longValue));
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        if (ChatObject.isPublic(chat)) {
                            string = LocaleController.getString(R.string.FilterInviteChannelToast);
                        } else {
                            string = LocaleController.getString(R.string.FilterInvitePrivateChannelToast);
                        }
                    } else if (ChatObject.isPublic(chat)) {
                        string = LocaleController.getString(R.string.FilterInviteGroupToast);
                    } else {
                        string = LocaleController.getString(R.string.FilterInvitePrivateGroupToast);
                    }
                    arrayList2.add(chat);
                    str = string;
                }
                if (yzVar.v != longValue || System.currentTimeMillis() - yzVar.f40292w > 1500) {
                    yzVar.v = longValue;
                    yzVar.f40292w = System.currentTimeMillis();
                    org.telegram.ui.Components.xc.a0(yzVar).g(str, arrayList2).j();
                    return;
                }
                return;
            }
            yzVar2.Y();
            yzVar2.f0(true);
            yzVar2.g0();
        }
    }

    public final boolean W(boolean z10) {
        if (!this.e.isEmpty() && this.G) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f18662a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f18662a.T = LocaleController.getString(R.string.UnsavedChangesMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.z1(this) {
                    public final yz f36367b;

                    {
                        this.f36367b = this;
                    }

                    @Override
                    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f36367b.c0();
                                return;
                            default:
                                this.f36367b.finishFragment();
                                return;
                        }
                    }
                });
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new org.telegram.ui.ActionBar.z1(this) {
                    public final yz f36367b;

                    {
                        this.f36367b = this;
                    }

                    @Override
                    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f36367b.c0();
                                return;
                            default:
                                this.f36367b.finishFragment();
                                return;
                        }
                    }
                });
                showDialog(alertDialog$Builder.f18662a);
                return false;
            }
            return false;
        }
        return true;
    }

    public final void X() {
        float f7;
        boolean z10 = this.G;
        boolean isEmpty = this.e.isEmpty();
        if (z10) {
            if (!isEmpty) {
                f7 = 1.0f;
            } else {
                f7 = 0.5f;
            }
        } else {
            f7 = 0.0f;
        }
        if (Math.abs(this.T - f7) > 0.1f) {
            this.f40290r.clearAnimation();
            ViewPropertyAnimator animate = this.f40290r.animate();
            this.T = f7;
            animate.alpha(f7).setDuration(320L).setInterpolator(org.telegram.ui.Components.rr.h).start();
        }
    }

    public final void Y() {
        boolean z10;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null && this.G) {
            ArrayList arrayList = this.e;
            boolean z11 = true;
            if (arrayList.size() != tL_exportedChatlistInvite.peers.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                for (int i10 = 0; i10 < tL_exportedChatlistInvite.peers.size(); i10++) {
                    if (!arrayList.contains(Long.valueOf(DialogObject.getPeerDialogId(tL_exportedChatlistInvite.peers.get(i10))))) {
                        break;
                    }
                }
            }
            z11 = z10;
            if (!z11) {
                this.G = false;
                X();
            }
        }
    }

    public final void Z(org.telegram.ui.Components.a10 a10Var, boolean z10) {
        int i10;
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.f40288f;
        if (!z10) {
            arrayList.addAll(arrayList2.subList(0, Math.min(a0(), arrayList2.size())));
        }
        if (arrayList.size() >= Math.min(a0(), arrayList2.size())) {
            i10 = R.string.DeselectAll;
        } else {
            i10 = R.string.SelectAll;
        }
        a10Var.a(LocaleController.getString(i10), new ci.y0(this, a10Var, z10, 27));
        this.G = true;
        Y();
        X();
        f0(true);
        g0();
        for (int i11 = 0; i11 < this.f40285a.getChildCount(); i11++) {
            View childAt = this.f40285a.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.g4) {
                Object tag = childAt.getTag();
                if (tag instanceof Long) {
                    ((org.telegram.ui.Cells.g4) childAt).c(arrayList.contains((Long) tag), true);
                }
            }
        }
    }

    public final int a0() {
        if (getUserConfig().isPremium()) {
            return getMessagesController().dialogFiltersChatsLimitPremium;
        }
        return getMessagesController().dialogFiltersChatsLimitDefault;
    }

    public final String b0() {
        String str;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null && (str = tL_exportedChatlistInvite.url) != null) {
            return str.substring(str.lastIndexOf(47) + 1);
        }
        return null;
    }

    public final void c0() {
        ArrayList arrayList;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null && !this.E && this.G) {
            e0(true);
            this.E = true;
            tL_exportedChatlistInvite.peers.clear();
            int i10 = 0;
            while (true) {
                arrayList = this.e;
                if (i10 >= arrayList.size()) {
                    break;
                }
                tL_exportedChatlistInvite.peers.add(getMessagesController().getPeer(((Long) arrayList.get(i10)).longValue()));
                i10++;
            }
            TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = this.f40287c.f15832id;
            tL_chatlists_editExportedInvite.slug = b0();
            tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
            tL_chatlists_editExportedInvite.flags |= 4;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                tL_chatlists_editExportedInvite.peers.add(getMessagesController().getInputPeer(((Long) arrayList.get(i11)).longValue()));
            }
            getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new nz(this, 1));
            Utilities.Callback callback = this.f40294y;
            if (callback != null) {
                callback.run(tL_exportedChatlistInvite);
            }
        }
    }

    @Override
    public final boolean canBeginSlide() {
        return W(true);
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        d0(false);
        this.actionBar.setActionBarMenuOnItemClick(new oo(this, 22));
        org.telegram.ui.ActionBar.y n10 = this.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = org.telegram.ui.ActionBar.h6.f19393v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.qr qrVar = new org.telegram.ui.Components.qr(mutate, new org.telegram.ui.Components.up(org.telegram.ui.ActionBar.h6.w0(null, i10, false)));
        this.f40289n = qrVar;
        this.f40290r = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), qrVar);
        X();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19004a7, false));
        wb1 wb1Var = new wb1(context, 9, null);
        this.f40285a = wb1Var;
        wb1Var.setLayoutManager(new s4.c0(1, false));
        this.f40285a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f40285a, w7.y5.c(-1.0f, -1));
        wb1 wb1Var2 = this.f40285a;
        xz xzVar = new xz(this);
        this.f40286b = xzVar;
        wb1Var2.setAdapter(xzVar);
        this.f40285a.setOnItemClickListener(new i(this, 8));
        MessagesController messagesController = getMessagesController();
        MessagesController.DialogFilter dialogFilter = this.f40287c;
        messagesController.updateFilterDialogs(dialogFilter);
        ArrayList arrayList = this.h;
        arrayList.clear();
        ArrayList arrayList2 = this.f40288f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null) {
            for (int i11 = 0; i11 < tL_exportedChatlistInvite.peers.size(); i11++) {
                long peerDialogId = DialogObject.getPeerDialogId(tL_exportedChatlistInvite.peers.get(i11));
                arrayList.add(Long.valueOf(peerDialogId));
                this.e.add(Long.valueOf(peerDialogId));
                arrayList2.add(Long.valueOf(peerDialogId));
            }
        }
        for (int i12 = 0; i12 < dialogFilter.dialogs.size(); i12++) {
            TLRPC.Dialog dialog = dialogFilter.dialogs.get(i12);
            if (dialog != null && !DialogObject.isEncryptedDialog(dialog.f18340id) && !arrayList.contains(Long.valueOf(dialog.f18340id))) {
                int i13 = (dialog.f18340id > 0L ? 1 : (dialog.f18340id == 0L ? 0 : -1));
                if (i13 < 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i13 < 0) {
                    z10 = b10.g0(getMessagesController().getChat(Long.valueOf(-dialog.f18340id)));
                }
                if (z10) {
                    arrayList.add(Long.valueOf(dialog.f18340id));
                    arrayList2.add(Long.valueOf(dialog.f18340id));
                }
            }
        }
        for (int i14 = 0; i14 < dialogFilter.dialogs.size(); i14++) {
            TLRPC.Dialog dialog2 = dialogFilter.dialogs.get(i14);
            if (dialog2 != null && !DialogObject.isEncryptedDialog(dialog2.f18340id) && !arrayList.contains(Long.valueOf(dialog2.f18340id)) && !arrayList2.contains(Long.valueOf(dialog2.f18340id))) {
                arrayList.add(Long.valueOf(dialog2.f18340id));
            }
        }
        this.H = 1;
        if (tL_exportedChatlistInvite != null) {
            this.J = 1;
            this.I = 2;
            this.H = 4;
            this.K = 3;
        } else {
            this.J = -1;
            this.I = -1;
            this.K = -1;
        }
        if (tL_exportedChatlistInvite == null && arrayList.isEmpty()) {
            this.L = -1;
            this.M = -1;
            this.N = -1;
            this.O = -1;
        } else {
            int i15 = this.H;
            int i16 = i15 + 1;
            this.L = i15;
            int i17 = i15 + 2;
            this.H = i17;
            this.M = i16;
            int size = (arrayList.size() - 1) + i17;
            this.N = size;
            this.H = size + 1;
            this.O = size;
        }
        xz xzVar2 = this.f40286b;
        if (xzVar2 != null) {
            xzVar2.l();
        }
        return this.fragmentView;
    }

    public final void d0(boolean z10) {
        String str;
        String str2;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite == null) {
            str = null;
        } else {
            str = tL_exportedChatlistInvite.title;
        }
        if (TextUtils.isEmpty(str)) {
            str2 = LocaleController.getString(R.string.FilterShare);
        } else {
            str2 = tL_exportedChatlistInvite.title;
        }
        String str3 = str2;
        if (z10) {
            this.actionBar.J(str3, false, 220L, null);
        } else {
            this.actionBar.setTitle(str3);
        }
    }

    public final void e0(boolean z10) {
        float f7;
        if (!z10) {
            AndroidUtilities.cancelRunOnUIThread(this.R);
        }
        if (this.f40289n != null) {
            ValueAnimator valueAnimator = this.S;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = this.f40289n.f27752c;
            float f11 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.S = ofFloat;
            ofFloat.addUpdateListener(new c3(this, 12));
            ValueAnimator valueAnimator2 = this.S;
            float f12 = this.f40289n.f27752c;
            if (z10) {
                f11 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f12 - f11) * 200.0f);
            this.S.setInterpolator(org.telegram.ui.Components.rr.f28031f);
            this.S.start();
        }
    }

    public final void f0(boolean z10) {
        String formatPluralString;
        int i10;
        org.telegram.ui.Components.a10 a10Var = this.P;
        if (a10Var != null) {
            ArrayList arrayList = this.e;
            boolean z11 = false;
            if (arrayList.size() <= 0) {
                formatPluralString = LocaleController.getString("FilterInviteHeaderChatsEmpty");
            } else {
                formatPluralString = LocaleController.formatPluralString("FilterInviteHeaderChats", arrayList.size(), new Object[0]);
            }
            a10Var.b(formatPluralString, z10);
            ArrayList arrayList2 = this.f40288f;
            if (arrayList2.size() > 1) {
                if (arrayList.size() >= Math.min(a0(), arrayList2.size())) {
                    z11 = true;
                }
                org.telegram.ui.Components.a10 a10Var2 = this.P;
                if (!z11) {
                    i10 = R.string.SelectAll;
                } else {
                    i10 = R.string.DeselectAll;
                }
                a10Var2.a(LocaleController.getString(i10), new org.telegram.ui.Components.yr0(6, this, z11));
            } else {
                this.P.a("", null);
            }
            if (z10) {
                AndroidUtilities.makeAccessibilityAnnouncement(((Object) this.P.f22548a.getText()) + ", " + ((Object) this.P.f22549b.getText()));
            }
        }
    }

    public final void g0() {
        pz pzVar = this.Q;
        if (pzVar == null) {
            return;
        }
        int i10 = 0;
        if (this.d == null) {
            String string = LocaleController.getString(R.string.FilterInviteHeaderNo);
            vh.n nVar = pzVar.f36708a;
            nVar.setText(string);
            nVar.h = 0;
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = pzVar.getSubtitleTextView().getPaint().getFontMetricsInt();
        MessagesController.DialogFilter dialogFilter = this.f40287c;
        Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, fontMetricsInt, false), dialogFilter.entities, fontMetricsInt);
        pz pzVar2 = this.Q;
        CharSequence replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralSpannable("FilterInviteHeader", this.e.size(), replaceAnimatedEmoji));
        boolean z10 = dialogFilter.title_noanimate;
        vh.n nVar2 = pzVar2.f36708a;
        nVar2.setText(replaceTags);
        if (z10) {
            i10 = 26;
        }
        nVar2.h = i10;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        return W(z10);
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.F != 0) {
            getConnectionsManager().cancelRequest(this.F, true);
            this.F = 0;
        }
    }
}
