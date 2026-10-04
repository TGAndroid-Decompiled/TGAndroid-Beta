package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ThemeActivity;
public final class ze implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.nl0 {
    public final int f43764a;
    public final long f43765b;
    public final NotificationCenter.NotificationCenterDelegate f43766c;
    public final Object d;
    public final Object f43767e;
    public final Object f43768f;

    public ze(Object obj, KeyEvent.Callback callback, Object obj2, long j3, Object obj3, int i10) {
        this.f43764a = i10;
        this.f43766c = (NotificationCenter.NotificationCenterDelegate) obj;
        this.d = callback;
        this.f43767e = obj2;
        this.f43765b = j3;
        this.f43768f = obj3;
    }

    @Override
    public void c(final float f7, final float f10, int i10, View view) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i11;
        long j3;
        int i12 = i10;
        final org.telegram.ui.Components.pv0 pv0Var = (org.telegram.ui.Components.pv0) this.f43766c;
        org.telegram.ui.Components.ls0 ls0Var = (org.telegram.ui.Components.ls0) this.d;
        final Context context = (Context) this.f43767e;
        org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f43768f;
        org.telegram.ui.Components.yt0 yt0Var = pv0Var.Q;
        org.telegram.ui.Components.zu0 zu0Var = pv0Var.R;
        org.telegram.ui.Components.zt0 zt0Var = pv0Var.f29756a0;
        org.telegram.ui.Components.av0 av0Var = pv0Var.S;
        org.telegram.ui.ActionBar.n2 n2Var = pv0Var.f29806v1;
        int i13 = ls0Var.F;
        if (i13 == 7) {
            if (view instanceof org.telegram.ui.Cells.za) {
                if (!zt0Var.f33649e.isEmpty()) {
                    i12 = ((Integer) zt0Var.f33649e.get(i12)).intValue();
                }
                TLRPC.ChatParticipant chatParticipant = zt0Var.d.participants.participants.get(i12);
                if (i12 >= 0 && i12 < zt0Var.d.participants.participants.size()) {
                    pv0Var.I0(chatParticipant, false, view);
                    return;
                }
                return;
            }
            s4.h0 adapter = ls0Var.h.getAdapter();
            org.telegram.ui.Components.gu0 gu0Var = pv0Var.f29780j0;
            if (adapter == gu0Var) {
                TLObject E = gu0Var.E(i12);
                if (E instanceof TLRPC.ChannelParticipant) {
                    j3 = MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer);
                } else if (E instanceof TLRPC.ChatParticipant) {
                    j3 = ((TLRPC.ChatParticipant) E).user_id;
                } else {
                    return;
                }
                if (j3 != 0 && j3 != n2Var.getUserConfig().getClientUserId()) {
                    n2Var.presentFragment(new ProfileActivity(sa.e.f(j3, "user_id"), null));
                }
            }
        } else if (i13 == 6 && (view instanceof org.telegram.ui.Cells.i6)) {
            TLRPC.Chat chat = ((org.telegram.ui.Cells.i6) view).getChat();
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f20042id);
            if (n2Var.getMessagesController().checkCanOpenChat(bundle, n2Var)) {
                if (chat.forum) {
                    HashSet hashSet = yf1.f43169n1;
                    n2Var.presentFragment(yf1.E0(n2Var.getMessagesController(), n2Var.getMessagesStorage(), bundle));
                    return;
                }
                n2Var.presentFragment(new yn(bundle));
            }
        } else if (i13 == 1 && (view instanceof org.telegram.ui.Cells.k7)) {
            pv0Var.G0(i12, view, ((org.telegram.ui.Cells.k7) view).getMessage(), ls0Var.F);
        } else {
            int i14 = 3;
            if (i13 == 3 && (view instanceof org.telegram.ui.Cells.n7)) {
                pv0Var.G0(i12, view, ((org.telegram.ui.Cells.n7) view).getMessage(), ls0Var.F);
            } else if ((i13 == 2 || i13 == 4) && (view instanceof org.telegram.ui.Cells.j7)) {
                pv0Var.G0(i12, view, ((org.telegram.ui.Cells.j7) view).getMessage(), ls0Var.F);
            } else if (i13 == 5 && (view instanceof org.telegram.ui.Cells.f2)) {
                pv0Var.G0(i12, view, (MessageObject) ((org.telegram.ui.Cells.f2) view).getParentObject(), ls0Var.F);
            } else if (i13 == 0 && (view instanceof org.telegram.ui.Cells.t7)) {
                final org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                MessageObject messageObject = t7Var.getMessageObject();
                if (messageObject != null && messageObject.isSensitive()) {
                    if (n2Var != null) {
                        final int currentAccount = n2Var.getCurrentAccount();
                        final MessagesController messagesController = MessagesController.getInstance(currentAccount);
                        final org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, null);
                        b2Var.q(200L);
                        messagesController.getContentSettings(new Utilities.Callback() {
                            @Override
                            public final void run(Object obj) {
                                final boolean z10;
                                boolean z11;
                                org.telegram.ui.ActionBar.d6 resourceProvider;
                                int dp;
                                int dp2;
                                org.telegram.ui.ActionBar.d6 resourceProvider2;
                                int i15;
                                int i16;
                                final TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                                org.telegram.ui.ActionBar.n2 n2Var2 = pv0.this.f29806v1;
                                b2Var.c(200L);
                                final MessagesController messagesController2 = messagesController;
                                if (messagesController2.config.needAgeVideoVerification.get() && !TextUtils.isEmpty(messagesController2.verifyAgeBotUsername)) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if ((contentsettings == null || !contentsettings.sensitive_can_change) && z10) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                final boolean[] zArr = new boolean[1];
                                final Context context2 = context;
                                FrameLayout frameLayout = new FrameLayout(context2);
                                if (z10) {
                                    zArr[0] = true;
                                } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                                    if (n2Var2 == null) {
                                        resourceProvider = null;
                                    } else {
                                        resourceProvider = n2Var2.getResourceProvider();
                                    }
                                    org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context2, 1, resourceProvider);
                                    a2Var.setBackground(org.telegram.ui.ActionBar.i6.K0(false));
                                    a2Var.e(LocaleController.getString(R.string.MessageShowSensitiveContentAlways), "", zArr[0], false, false);
                                    if (LocaleController.isRTL) {
                                        dp = AndroidUtilities.dp(16.0f);
                                    } else {
                                        dp = AndroidUtilities.dp(8.0f);
                                    }
                                    if (LocaleController.isRTL) {
                                        dp2 = AndroidUtilities.dp(8.0f);
                                    } else {
                                        dp2 = AndroidUtilities.dp(16.0f);
                                    }
                                    a2Var.setPadding(dp, 0, dp2, 0);
                                    frameLayout.addView(a2Var, w7.z5.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                                    a2Var.setOnClickListener(new t0(6, zArr));
                                }
                                if (n2Var2 == null) {
                                    resourceProvider2 = null;
                                } else {
                                    resourceProvider2 = n2Var2.getResourceProvider();
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, resourceProvider2);
                                alertDialog$Builder.f20372a.R = LocaleController.getString(R.string.MessageShowSensitiveContentMediaTitle);
                                if (z11) {
                                    i15 = R.string.MessageShowSensitiveContentMediaTextClosed;
                                } else {
                                    i15 = R.string.MessageShowSensitiveContentMediaText;
                                }
                                alertDialog$Builder.f20372a.T = LocaleController.getString(i15);
                                alertDialog$Builder.n(frameLayout);
                                alertDialog$Builder.f20372a.G = 9;
                                if (z11) {
                                    i16 = R.string.MessageShowSensitiveContentMediaTextClosedButton;
                                } else {
                                    i16 = R.string.Cancel;
                                }
                                alertDialog$Builder.h(LocaleController.getString(i16), null);
                                if (!z11) {
                                    String string = LocaleController.getString(R.string.MessageShowSensitiveContentButton);
                                    final org.telegram.ui.Cells.t7 t7Var2 = t7Var;
                                    final float f11 = f7;
                                    final float f12 = f10;
                                    final int i17 = currentAccount;
                                    alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.a2() {
                                        @Override
                                        public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i18) {
                                            org.telegram.ui.ActionBar.d6 resourceProvider3;
                                            TL_account.contentSettings contentsettings2;
                                            xr0 xr0Var = new xr0(org.telegram.ui.Cells.t7.this, f11, f12);
                                            if (zArr[0]) {
                                                if (!z10 && ((contentsettings2 = contentsettings) == null || !contentsettings2.sensitive_can_change)) {
                                                    xr0Var.run(Boolean.TRUE);
                                                    return;
                                                }
                                                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                                org.telegram.ui.qc qcVar = new org.telegram.ui.qc(28, messagesController2, xr0Var);
                                                if (U == null) {
                                                    resourceProvider3 = null;
                                                } else {
                                                    resourceProvider3 = U.getResourceProvider();
                                                }
                                                ThemeActivity.C0(i17, context2, qcVar, resourceProvider3);
                                                return;
                                            }
                                            xr0Var.run(Boolean.FALSE);
                                        }
                                    });
                                }
                                if (n2Var2 != null && n2Var2.getContext() != null) {
                                    n2Var2.showDialog(alertDialog$Builder.f20372a);
                                } else {
                                    alertDialog$Builder.o();
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
                MessageObject messageObject2 = t7Var.f23089n;
                if (messageObject2 != null && messageObject2.hasMediaSpoilers() && t7Var.f23085i0 == 0.0f && !t7Var.f23089n.isMediaSpoilersRevealedInSharedMedia) {
                    t7Var.n(f7, f10);
                } else if (messageObject != null) {
                    pv0Var.G0(i12, view, messageObject, ls0Var.F);
                }
            } else if (org.telegram.ui.Components.pv0.p0(i13) && (view instanceof org.telegram.ui.Cells.t7)) {
                MessageObject messageObject3 = ((org.telegram.ui.Cells.t7) view).getMessageObject();
                if (messageObject3 != null) {
                    pv0Var.G0(i12, view, messageObject3, ls0Var.F);
                }
            } else {
                int i15 = ls0Var.F;
                if (i15 == 10) {
                    if (((view instanceof org.telegram.ui.Cells.i6) || f10 < AndroidUtilities.dp(60.0f)) && i12 >= 0 && i12 < yt0Var.d.size()) {
                        Bundle bundle2 = new Bundle();
                        TLObject tLObject = (TLObject) yt0Var.d.get(i12);
                        if (tLObject instanceof TLRPC.Chat) {
                            bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).f20042id);
                        } else if (tLObject instanceof TLRPC.User) {
                            bundle2.putLong("user_id", ((TLRPC.User) tLObject).f20189id);
                        } else {
                            return;
                        }
                        n2Var.presentFragment(new yn(bundle2));
                    }
                } else if (i15 == 11) {
                    if (ls0Var.h.getAdapter() == av0Var) {
                        if (i12 >= 0) {
                            ArrayList arrayList = av0Var.f24681e;
                            ArrayList arrayList2 = av0Var.f24682f;
                            if (i12 < arrayList.size()) {
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("user_id", n2Var.getUserConfig().getClientUserId());
                                bundle3.putInt("chatMode", 3);
                                yn ynVar = new yn(bundle3);
                                ynVar.f43287b4 = ((SavedMessagesController.SavedDialog) arrayList.get(i12)).dialogId;
                                n2Var.presentFragment(ynVar);
                                return;
                            }
                            int size = i12 - arrayList.size();
                            if (size < arrayList2.size()) {
                                MessageObject messageObject4 = (MessageObject) arrayList2.get(size);
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("user_id", n2Var.getUserConfig().getClientUserId());
                                bundle4.putInt("message_id", messageObject4.getId());
                                org.telegram.ui.Components.ts0 ts0Var = new org.telegram.ui.Components.ts0(pv0Var, bundle4, size);
                                ts0Var.J7 = messageObject4.getId();
                                n2Var.presentFragment(ts0Var);
                            }
                        }
                    } else if (pv0Var.C1) {
                        if (zu0Var.v.f46698y == 0) {
                            zu0Var.E(view);
                        }
                    } else {
                        Bundle bundle5 = new Bundle();
                        if (i12 >= 0 && i12 < zu0Var.f33663f.size()) {
                            bundle5.putLong("user_id", n2Var.getUserConfig().getClientUserId());
                            bundle5.putInt("chatMode", 3);
                            yn ynVar2 = new yn(bundle5);
                            ynVar2.f43287b4 = ((SavedMessagesController.SavedDialog) zu0Var.f33663f.get(i12)).dialogId;
                            n2Var.presentFragment(ynVar2);
                        }
                    }
                } else if (i15 == 15 && (view instanceof org.telegram.ui.Cells.u1)) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
                    MessageObject messageObject5 = u1Var.getMessageObject();
                    ls0Var.h.C0();
                    int currentAccount2 = n2Var.getCurrentAccount();
                    MessagesController messagesController2 = n2Var.getMessagesController();
                    long j10 = this.f43765b;
                    TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j10));
                    org.telegram.ui.Components.b80 F = org.telegram.ui.Components.b80.F(ls0Var, d6Var, u1Var);
                    F.f24822c0 = true;
                    if (messageObject5.isOutOwner()) {
                        i14 = 5;
                    }
                    F.V(i14);
                    F.c(R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), new a3.h0(pv0Var, j10, messageObject5, 21), false);
                    if (!messageObject5.isPollClosed()) {
                        if (messageObject5.canUnvote()) {
                            F.c(R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), new org.telegram.ui.Components.or0(pv0Var, d6Var, currentAccount2, messageObject5), false);
                        }
                        if (!messageObject5.isForwarded() && ((messageObject5.isOut() && (!ChatObject.isChannel(chat2) || chat2.megagroup)) || (ChatObject.isChannel(chat2) && !chat2.megagroup && (chat2.creator || ((tL_chatAdminRights = chat2.admin_rights) != null && tL_chatAdminRights.edit_messages))))) {
                            int i16 = R.drawable.msg_pollstop;
                            if (messageObject5.isQuiz()) {
                                i11 = R.string.StopQuiz;
                            } else {
                                i11 = R.string.StopPoll;
                            }
                            F.c(i16, LocaleController.getString(i11), new org.telegram.ui.Components.or0(pv0Var, d6Var, messageObject5, currentAccount2), false);
                        }
                    }
                    F.Z();
                }
            }
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f43764a) {
            case 0:
                yn.W0((yn) this.f43766c, (TLRPC.TL_game) this.d, (MessageObject) this.f43767e, (String) this.f43768f, this.f43765b);
                return;
            default:
                org.telegram.ui.Components.v31 v31Var = (org.telegram.ui.Components.v31) this.f43766c;
                ArrayList arrayList = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.f43767e;
                org.telegram.ui.Components.uh uhVar = (org.telegram.ui.Components.uh) this.f43768f;
                int size = arrayList.size();
                int i11 = 0;
                while (true) {
                    long j3 = this.f43765b;
                    if (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        if (j3 == ((Integer) obj).intValue()) {
                            v31Var.m(0L, false);
                        }
                    } else {
                        v31Var.f31558e0.addAll(hashSet);
                        v31Var.o();
                        org.telegram.ui.Components.yc.a0(v31Var.h).U(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new org.telegram.ui.Components.h31(v31Var, hashSet, arrayList, j3, 0), new org.telegram.ui.Components.uo0(v31Var, arrayList, uhVar, 11)).j();
                        b2Var.dismiss();
                        return;
                    }
                }
        }
    }

    public ze(yn ynVar, TLRPC.TL_game tL_game, MessageObject messageObject, String str, long j3) {
        this.f43764a = 0;
        this.f43766c = ynVar;
        this.d = tL_game;
        this.f43767e = messageObject;
        this.f43768f = str;
        this.f43765b = j3;
    }

    public ze(org.telegram.ui.Components.v31 v31Var, ArrayList arrayList, long j3, HashSet hashSet, org.telegram.ui.Components.uh uhVar) {
        this.f43764a = 2;
        this.f43766c = v31Var;
        this.d = arrayList;
        this.f43765b = j3;
        this.f43767e = hashSet;
        this.f43768f = uhVar;
    }

    @Override
    public void s0(View view, float f7, float f10) {
    }
}
