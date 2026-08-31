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
public final class zz extends org.telegram.ui.ActionBar.p2 {
    public boolean B;
    public int C;
    public boolean D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public org.telegram.ui.Components.a10 M;
    public pz N;
    public final zi O;
    public ValueAnimator P;
    public float Q;
    public kb1 f44019a;
    public yz f44020b;
    public final MessagesController.DialogFilter f44021c;
    public final TL_chatlists.TL_exportedChatlistInvite d;
    public final ArrayList f44022e;
    public final ArrayList f44023f;
    public final ArrayList h;
    public org.telegram.ui.Components.or f44024n;
    public org.telegram.ui.ActionBar.w0 f44025r;
    public int f44026s;
    public long v;
    public long f44027w;
    public Utilities.Callback f44028x;
    public Utilities.Callback f44029y;

    public zz(MessagesController.DialogFilter dialogFilter, TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        super(null);
        this.f44022e = new ArrayList();
        this.f44023f = new ArrayList();
        this.h = new ArrayList();
        this.f44026s = -5;
        this.B = false;
        this.E = 0;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.O = new zi(this, 28);
        this.Q = 1.0f;
        this.f44021c = dialogFilter;
        this.d = tL_exportedChatlistInvite;
    }

    public static void U(zz zzVar, TLRPC.TL_error tL_error) {
        zzVar.e0(false);
        zzVar.B = false;
        if (tL_error != null && "INVITES_TOO_MUCH".equals(tL_error.text)) {
            zzVar.showDialog(new fg.v0(12, zzVar.currentAccount, zzVar.getParentActivity(), zzVar, null));
        } else if (tL_error != null && "INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            zzVar.showDialog(new fg.v0(4, zzVar.currentAccount, zzVar.getParentActivity(), zzVar, null));
        } else if (tL_error != null && "CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            zzVar.showDialog(new fg.v0(13, zzVar.currentAccount, zzVar.getParentActivity(), zzVar, null));
        } else {
            zzVar.finishFragment();
        }
    }

    public static void V(zz zzVar, View view, int i10) {
        String string;
        String str;
        zz zzVar2;
        ArrayList arrayList = zzVar.f44022e;
        if (zzVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.g4)) {
            Long l10 = (Long) zzVar.h.get(i10 - zzVar.J);
            long longValue = l10.longValue();
            if (arrayList.contains(l10)) {
                arrayList.remove(l10);
                zzVar.D = true;
                zzVar.X();
                ((org.telegram.ui.Cells.g4) view).c(false, true);
                zzVar2 = zzVar;
            } else if (zzVar.f44023f.contains(l10)) {
                if (arrayList.size() + 1 > zzVar.a0()) {
                    zzVar.showDialog(new fg.v0(4, zzVar.currentAccount, zzVar.getParentActivity(), zzVar, null));
                    return;
                }
                zzVar2 = zzVar;
                arrayList.add(l10);
                zzVar2.D = true;
                zzVar2.X();
                ((org.telegram.ui.Cells.g4) view).c(true, true);
            } else {
                int i11 = -zzVar.f44026s;
                zzVar.f44026s = i11;
                AndroidUtilities.shakeViewSpring(view, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                ArrayList arrayList2 = new ArrayList();
                if (longValue >= 0) {
                    arrayList2.add(zzVar.getMessagesController().getUser(l10));
                    TLRPC.User user = zzVar.getMessagesController().getUser(l10);
                    if (user != null && user.bot) {
                        str = LocaleController.getString(R.string.FilterInviteBotToast);
                    } else {
                        str = LocaleController.getString(R.string.FilterInviteUserToast);
                    }
                } else {
                    TLRPC.Chat chat = zzVar.getMessagesController().getChat(Long.valueOf(-longValue));
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
                if (zzVar.v != longValue || System.currentTimeMillis() - zzVar.f44027w > 1500) {
                    zzVar.v = longValue;
                    zzVar.f44027w = System.currentTimeMillis();
                    org.telegram.ui.Components.qc.a0(zzVar).g(str, arrayList2).j();
                    return;
                }
                return;
            }
            zzVar2.Y();
            zzVar2.f0(true);
            zzVar2.g0();
        }
    }

    public final boolean W(boolean z4) {
        if (!this.f44022e.isEmpty() && this.D) {
            if (z4) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.UnsavedChangesMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.c2(this) {
                    public final zz f39878b;

                    {
                        this.f39878b = this;
                    }

                    @Override
                    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f39878b.c0();
                                return;
                            default:
                                this.f39878b.finishFragment();
                                return;
                        }
                    }
                });
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new org.telegram.ui.ActionBar.c2(this) {
                    public final zz f39878b;

                    {
                        this.f39878b = this;
                    }

                    @Override
                    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
                        switch (r2) {
                            case 0:
                                this.f39878b.c0();
                                return;
                            default:
                                this.f39878b.finishFragment();
                                return;
                        }
                    }
                });
                showDialog(alertDialog$Builder.f21166a);
                return false;
            }
            return false;
        }
        return true;
    }

    public final void X() {
        float f10;
        boolean z4 = this.D;
        boolean isEmpty = this.f44022e.isEmpty();
        if (z4) {
            if (!isEmpty) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
        } else {
            f10 = 0.0f;
        }
        if (Math.abs(this.Q - f10) > 0.1f) {
            this.f44025r.clearAnimation();
            ViewPropertyAnimator animate = this.f44025r.animate();
            this.Q = f10;
            animate.alpha(f10).setDuration(320L).setInterpolator(org.telegram.ui.Components.pr.h).start();
        }
    }

    public final void Y() {
        boolean z4;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null && this.D) {
            ArrayList arrayList = this.f44022e;
            boolean z10 = true;
            if (arrayList.size() != tL_exportedChatlistInvite.peers.size()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                for (int i10 = 0; i10 < tL_exportedChatlistInvite.peers.size(); i10++) {
                    if (!arrayList.contains(Long.valueOf(DialogObject.getPeerDialogId(tL_exportedChatlistInvite.peers.get(i10))))) {
                        break;
                    }
                }
            }
            z10 = z4;
            if (!z10) {
                this.D = false;
                X();
            }
        }
    }

    public final void Z(org.telegram.ui.Components.a10 a10Var, boolean z4) {
        int i10;
        ArrayList arrayList = this.f44022e;
        arrayList.clear();
        ArrayList arrayList2 = this.f44023f;
        if (!z4) {
            arrayList.addAll(arrayList2.subList(0, Math.min(a0(), arrayList2.size())));
        }
        if (arrayList.size() >= Math.min(a0(), arrayList2.size())) {
            i10 = R.string.DeselectAll;
        } else {
            i10 = R.string.SelectAll;
        }
        a10Var.a(LocaleController.getString(i10), new mh.r5(this, a10Var, z4, 22));
        this.D = true;
        Y();
        X();
        f0(true);
        g0();
        for (int i11 = 0; i11 < this.f44019a.getChildCount(); i11++) {
            View childAt = this.f44019a.getChildAt(i11);
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
        if (tL_exportedChatlistInvite != null && !this.B && this.D) {
            e0(true);
            this.B = true;
            tL_exportedChatlistInvite.peers.clear();
            int i10 = 0;
            while (true) {
                arrayList = this.f44022e;
                if (i10 >= arrayList.size()) {
                    break;
                }
                tL_exportedChatlistInvite.peers.add(getMessagesController().getPeer(((Long) arrayList.get(i10)).longValue()));
                i10++;
            }
            TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = this.f44021c.f18055id;
            tL_chatlists_editExportedInvite.slug = b0();
            tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
            tL_chatlists_editExportedInvite.flags |= 4;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                tL_chatlists_editExportedInvite.peers.add(getMessagesController().getInputPeer(((Long) arrayList.get(i11)).longValue()));
            }
            getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new nz(this, 1));
            Utilities.Callback callback = this.f44029y;
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
        boolean z4;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        d0(false);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.z51(this, 9));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = org.telegram.ui.ActionBar.k6.f21981v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.or orVar = new org.telegram.ui.Components.or(mutate, new org.telegram.ui.Components.tp(org.telegram.ui.ActionBar.k6.w0(null, i10, false)));
        this.f44024n = orVar;
        this.f44025r = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), orVar);
        X();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21605a7, false));
        kb1 kb1Var = new kb1(context, 8, null);
        this.f44019a = kb1Var;
        kb1Var.setLayoutManager(new f2.j0(1, false));
        this.f44019a.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f44019a, k7.c6.c(-1.0f, -1));
        kb1 kb1Var2 = this.f44019a;
        yz yzVar = new yz(this);
        this.f44020b = yzVar;
        kb1Var2.setAdapter(yzVar);
        this.f44019a.setOnItemClickListener(new j(this, 8));
        MessagesController messagesController = getMessagesController();
        MessagesController.DialogFilter dialogFilter = this.f44021c;
        messagesController.updateFilterDialogs(dialogFilter);
        ArrayList arrayList = this.h;
        arrayList.clear();
        ArrayList arrayList2 = this.f44023f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null) {
            for (int i11 = 0; i11 < tL_exportedChatlistInvite.peers.size(); i11++) {
                long peerDialogId = DialogObject.getPeerDialogId(tL_exportedChatlistInvite.peers.get(i11));
                arrayList.add(Long.valueOf(peerDialogId));
                this.f44022e.add(Long.valueOf(peerDialogId));
                arrayList2.add(Long.valueOf(peerDialogId));
            }
        }
        for (int i12 = 0; i12 < dialogFilter.dialogs.size(); i12++) {
            TLRPC.Dialog dialog = dialogFilter.dialogs.get(i12);
            if (dialog != null && !DialogObject.isEncryptedDialog(dialog.f20847id) && !arrayList.contains(Long.valueOf(dialog.f20847id))) {
                int i13 = (dialog.f20847id > 0L ? 1 : (dialog.f20847id == 0L ? 0 : -1));
                if (i13 < 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (i13 < 0) {
                    z4 = b10.g0(getMessagesController().getChat(Long.valueOf(-dialog.f20847id)));
                }
                if (z4) {
                    arrayList.add(Long.valueOf(dialog.f20847id));
                    arrayList2.add(Long.valueOf(dialog.f20847id));
                }
            }
        }
        for (int i14 = 0; i14 < dialogFilter.dialogs.size(); i14++) {
            TLRPC.Dialog dialog2 = dialogFilter.dialogs.get(i14);
            if (dialog2 != null && !DialogObject.isEncryptedDialog(dialog2.f20847id) && !arrayList.contains(Long.valueOf(dialog2.f20847id)) && !arrayList2.contains(Long.valueOf(dialog2.f20847id))) {
                arrayList.add(Long.valueOf(dialog2.f20847id));
            }
        }
        this.E = 1;
        if (tL_exportedChatlistInvite != null) {
            this.G = 1;
            this.F = 2;
            this.E = 4;
            this.H = 3;
        } else {
            this.G = -1;
            this.F = -1;
            this.H = -1;
        }
        if (tL_exportedChatlistInvite == null && arrayList.isEmpty()) {
            this.I = -1;
            this.J = -1;
            this.K = -1;
            this.L = -1;
        } else {
            int i15 = this.E;
            int i16 = i15 + 1;
            this.I = i15;
            int i17 = i15 + 2;
            this.E = i17;
            this.J = i16;
            int size = (arrayList.size() - 1) + i17;
            this.K = size;
            this.E = size + 1;
            this.L = size;
        }
        yz yzVar2 = this.f44020b;
        if (yzVar2 != null) {
            yzVar2.l();
        }
        return this.fragmentView;
    }

    public final void d0(boolean z4) {
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
        if (z4) {
            this.actionBar.I(str3, false, 220L, null);
        } else {
            this.actionBar.setTitle(str3);
        }
    }

    public final void e0(boolean z4) {
        float f10;
        if (!z4) {
            AndroidUtilities.cancelRunOnUIThread(this.O);
        }
        if (this.f44024n != null) {
            ValueAnimator valueAnimator = this.P;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = this.f44024n.f29840c;
            float f12 = 0.0f;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.P = ofFloat;
            ofFloat.addUpdateListener(new e3(this, 12));
            ValueAnimator valueAnimator2 = this.P;
            float f13 = this.f44024n.f29840c;
            if (z4) {
                f12 = 1.0f;
            }
            valueAnimator2.setDuration(Math.abs(f13 - f12) * 200.0f);
            this.P.setInterpolator(org.telegram.ui.Components.pr.f30183f);
            this.P.start();
        }
    }

    public final void f0(boolean z4) {
        String formatPluralString;
        int i10;
        org.telegram.ui.Components.a10 a10Var = this.M;
        if (a10Var != null) {
            ArrayList arrayList = this.f44022e;
            boolean z10 = false;
            if (arrayList.size() <= 0) {
                formatPluralString = LocaleController.getString("FilterInviteHeaderChatsEmpty");
            } else {
                formatPluralString = LocaleController.formatPluralString("FilterInviteHeaderChats", arrayList.size(), new Object[0]);
            }
            a10Var.b(formatPluralString, z4);
            ArrayList arrayList2 = this.f44023f;
            if (arrayList2.size() > 1) {
                if (arrayList.size() >= Math.min(a0(), arrayList2.size())) {
                    z10 = true;
                }
                org.telegram.ui.Components.a10 a10Var2 = this.M;
                if (!z10) {
                    i10 = R.string.SelectAll;
                } else {
                    i10 = R.string.DeselectAll;
                }
                a10Var2.a(LocaleController.getString(i10), new org.telegram.ui.Components.rv0(3, this, z10));
            } else {
                this.M.a("", null);
            }
            if (z4) {
                AndroidUtilities.makeAccessibilityAnnouncement(((Object) this.M.f25111a.getText()) + ", " + ((Object) this.M.f25112b.getText()));
            }
        }
    }

    public final void g0() {
        pz pzVar = this.N;
        if (pzVar == null) {
            return;
        }
        int i10 = 0;
        if (this.d == null) {
            String string = LocaleController.getString(R.string.FilterInviteHeaderNo);
            jh.s sVar = pzVar.f40310a;
            sVar.setText(string);
            sVar.h = 0;
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = pzVar.getSubtitleTextView().getPaint().getFontMetricsInt();
        MessagesController.DialogFilter dialogFilter = this.f44021c;
        Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, fontMetricsInt, false), dialogFilter.entities, fontMetricsInt);
        pz pzVar2 = this.N;
        CharSequence replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralSpannable("FilterInviteHeader", this.f44022e.size(), replaceAnimatedEmoji));
        boolean z4 = dialogFilter.title_noanimate;
        jh.s sVar2 = pzVar2.f40310a;
        sVar2.setText(replaceTags);
        if (z4) {
            i10 = 26;
        }
        sVar2.h = i10;
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        return W(z4);
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.C != 0) {
            getConnectionsManager().cancelRequest(this.C, true);
            this.C = 0;
        }
    }
}
