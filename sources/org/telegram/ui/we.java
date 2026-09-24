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
public final class we implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.ll0 {
    public final int f38952a;
    public final long f38953b;
    public final NotificationCenter.NotificationCenterDelegate f38954c;
    public final Object d;
    public final Object e;
    public final Object f38955f;

    public we(Object obj, KeyEvent.Callback callback, Object obj2, long j3, Object obj3, int i10) {
        this.f38952a = i10;
        this.f38954c = (NotificationCenter.NotificationCenterDelegate) obj;
        this.d = callback;
        this.e = obj2;
        this.f38953b = j3;
        this.f38955f = obj3;
    }

    @Override
    public void c(final float f7, final float f10, int i10, View view) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i11;
        long j3;
        int i12 = i10;
        final org.telegram.ui.Components.jv0 jv0Var = (org.telegram.ui.Components.jv0) this.f38954c;
        org.telegram.ui.Components.fs0 fs0Var = (org.telegram.ui.Components.fs0) this.d;
        final Context context = (Context) this.e;
        org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f38955f;
        org.telegram.ui.Components.st0 st0Var = jv0Var.Q;
        org.telegram.ui.Components.tu0 tu0Var = jv0Var.R;
        org.telegram.ui.Components.tt0 tt0Var = jv0Var.f25494a0;
        org.telegram.ui.Components.uu0 uu0Var = jv0Var.S;
        org.telegram.ui.ActionBar.m2 m2Var = jv0Var.f25543v1;
        int i13 = fs0Var.F;
        if (i13 == 7) {
            if (view instanceof org.telegram.ui.Cells.za) {
                if (!tt0Var.e.isEmpty()) {
                    i12 = ((Integer) tt0Var.e.get(i12)).intValue();
                }
                TLRPC.ChatParticipant chatParticipant = tt0Var.d.participants.participants.get(i12);
                if (i12 >= 0 && i12 < tt0Var.d.participants.participants.size()) {
                    jv0Var.I0(chatParticipant, false, view);
                    return;
                }
                return;
            }
            s4.h0 adapter = fs0Var.h.getAdapter();
            org.telegram.ui.Components.au0 au0Var = jv0Var.f25517j0;
            if (adapter == au0Var) {
                TLObject E = au0Var.E(i12);
                if (E instanceof TLRPC.ChannelParticipant) {
                    j3 = MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer);
                } else if (E instanceof TLRPC.ChatParticipant) {
                    j3 = ((TLRPC.ChatParticipant) E).user_id;
                } else {
                    return;
                }
                if (j3 != 0 && j3 != m2Var.getUserConfig().getClientUserId()) {
                    m2Var.presentFragment(new ProfileActivity(v7.j.e(j3, "user_id"), null));
                }
            }
        } else if (i13 == 6 && (view instanceof org.telegram.ui.Cells.i6)) {
            TLRPC.Chat chat = ((org.telegram.ui.Cells.i6) view).getChat();
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f18321id);
            if (m2Var.getMessagesController().checkCanOpenChat(bundle, m2Var)) {
                if (chat.forum) {
                    HashSet hashSet = wf1.f39292n1;
                    m2Var.presentFragment(wf1.E0(m2Var.getMessagesController(), m2Var.getMessagesStorage(), bundle));
                    return;
                }
                m2Var.presentFragment(new wn(bundle));
            }
        } else if (i13 == 1 && (view instanceof org.telegram.ui.Cells.k7)) {
            jv0Var.G0(i12, view, ((org.telegram.ui.Cells.k7) view).getMessage(), fs0Var.F);
        } else {
            int i14 = 3;
            if (i13 == 3 && (view instanceof org.telegram.ui.Cells.n7)) {
                jv0Var.G0(i12, view, ((org.telegram.ui.Cells.n7) view).getMessage(), fs0Var.F);
            } else if ((i13 == 2 || i13 == 4) && (view instanceof org.telegram.ui.Cells.j7)) {
                jv0Var.G0(i12, view, ((org.telegram.ui.Cells.j7) view).getMessage(), fs0Var.F);
            } else if (i13 == 5 && (view instanceof org.telegram.ui.Cells.f2)) {
                jv0Var.G0(i12, view, (MessageObject) ((org.telegram.ui.Cells.f2) view).getParentObject(), fs0Var.F);
            } else if (i13 == 0 && (view instanceof org.telegram.ui.Cells.t7)) {
                final org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                MessageObject messageObject = t7Var.getMessageObject();
                if (messageObject != null && messageObject.isSensitive()) {
                    if (m2Var != null) {
                        final int currentAccount = m2Var.getCurrentAccount();
                        final MessagesController messagesController = MessagesController.getInstance(currentAccount);
                        final org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(context, 3, null);
                        a2Var.q(200L);
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
                                org.telegram.ui.ActionBar.m2 m2Var2 = jv0.this.f25543v1;
                                a2Var.c(200L);
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
                                    if (m2Var2 == null) {
                                        resourceProvider = null;
                                    } else {
                                        resourceProvider = m2Var2.getResourceProvider();
                                    }
                                    org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(context2, 1, resourceProvider);
                                    a2Var2.setBackground(org.telegram.ui.ActionBar.h6.K0(false));
                                    a2Var2.e(LocaleController.getString(R.string.MessageShowSensitiveContentAlways), "", zArr[0], false, false);
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
                                    a2Var2.setPadding(dp, 0, dp2, 0);
                                    frameLayout.addView(a2Var2, w7.y5.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                                    a2Var2.setOnClickListener(new t0(6, zArr));
                                }
                                if (m2Var2 == null) {
                                    resourceProvider2 = null;
                                } else {
                                    resourceProvider2 = m2Var2.getResourceProvider();
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, resourceProvider2);
                                alertDialog$Builder.f18647a.R = LocaleController.getString(R.string.MessageShowSensitiveContentMediaTitle);
                                if (z11) {
                                    i15 = R.string.MessageShowSensitiveContentMediaTextClosed;
                                } else {
                                    i15 = R.string.MessageShowSensitiveContentMediaText;
                                }
                                alertDialog$Builder.f18647a.T = LocaleController.getString(i15);
                                alertDialog$Builder.n(frameLayout);
                                alertDialog$Builder.f18647a.G = 9;
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
                                    alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.z1() {
                                        @Override
                                        public final void f(org.telegram.ui.ActionBar.a2 a2Var3, int i18) {
                                            org.telegram.ui.ActionBar.d6 resourceProvider3;
                                            TL_account.contentSettings contentsettings2;
                                            rr0 rr0Var = new rr0(org.telegram.ui.Cells.t7.this, f11, f12);
                                            if (zArr[0]) {
                                                if (!z10 && ((contentsettings2 = contentsettings) == null || !contentsettings2.sensitive_can_change)) {
                                                    rr0Var.run(Boolean.TRUE);
                                                    return;
                                                }
                                                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                                                org.telegram.ui.oc ocVar = new org.telegram.ui.oc(28, messagesController2, rr0Var);
                                                if (U == null) {
                                                    resourceProvider3 = null;
                                                } else {
                                                    resourceProvider3 = U.getResourceProvider();
                                                }
                                                ThemeActivity.C0(i17, context2, ocVar, resourceProvider3);
                                                return;
                                            }
                                            rr0Var.run(Boolean.FALSE);
                                        }
                                    });
                                }
                                if (m2Var2 != null && m2Var2.getContext() != null) {
                                    m2Var2.showDialog(alertDialog$Builder.f18647a);
                                } else {
                                    alertDialog$Builder.o();
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
                MessageObject messageObject2 = t7Var.f21212n;
                if (messageObject2 != null && messageObject2.hasMediaSpoilers() && t7Var.f21208i0 == 0.0f && !t7Var.f21212n.isMediaSpoilersRevealedInSharedMedia) {
                    t7Var.n(f7, f10);
                } else if (messageObject != null) {
                    jv0Var.G0(i12, view, messageObject, fs0Var.F);
                }
            } else if (org.telegram.ui.Components.jv0.p0(i13) && (view instanceof org.telegram.ui.Cells.t7)) {
                MessageObject messageObject3 = ((org.telegram.ui.Cells.t7) view).getMessageObject();
                if (messageObject3 != null) {
                    jv0Var.G0(i12, view, messageObject3, fs0Var.F);
                }
            } else {
                int i15 = fs0Var.F;
                if (i15 == 10) {
                    if (((view instanceof org.telegram.ui.Cells.i6) || f10 < AndroidUtilities.dp(60.0f)) && i12 >= 0 && i12 < st0Var.d.size()) {
                        Bundle bundle2 = new Bundle();
                        TLObject tLObject = (TLObject) st0Var.d.get(i12);
                        if (tLObject instanceof TLRPC.Chat) {
                            bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).f18321id);
                        } else if (tLObject instanceof TLRPC.User) {
                            bundle2.putLong("user_id", ((TLRPC.User) tLObject).f18468id);
                        } else {
                            return;
                        }
                        m2Var.presentFragment(new wn(bundle2));
                    }
                } else if (i15 == 11) {
                    if (fs0Var.h.getAdapter() == uu0Var) {
                        if (i12 >= 0) {
                            ArrayList arrayList = uu0Var.e;
                            ArrayList arrayList2 = uu0Var.f28910f;
                            if (i12 < arrayList.size()) {
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("user_id", m2Var.getUserConfig().getClientUserId());
                                bundle3.putInt("chatMode", 3);
                                wn wnVar = new wn(bundle3);
                                wnVar.f39436d4 = ((SavedMessagesController.SavedDialog) arrayList.get(i12)).dialogId;
                                m2Var.presentFragment(wnVar);
                                return;
                            }
                            int size = i12 - arrayList.size();
                            if (size < arrayList2.size()) {
                                MessageObject messageObject4 = (MessageObject) arrayList2.get(size);
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("user_id", m2Var.getUserConfig().getClientUserId());
                                bundle4.putInt("message_id", messageObject4.getId());
                                org.telegram.ui.Components.ns0 ns0Var = new org.telegram.ui.Components.ns0(jv0Var, bundle4, size);
                                ns0Var.L7 = messageObject4.getId();
                                m2Var.presentFragment(ns0Var);
                            }
                        }
                    } else if (jv0Var.C1) {
                        if (tu0Var.v.f43095y == 0) {
                            tu0Var.E(view);
                        }
                    } else {
                        Bundle bundle5 = new Bundle();
                        if (i12 >= 0 && i12 < tu0Var.f28611f.size()) {
                            bundle5.putLong("user_id", m2Var.getUserConfig().getClientUserId());
                            bundle5.putInt("chatMode", 3);
                            wn wnVar2 = new wn(bundle5);
                            wnVar2.f39436d4 = ((SavedMessagesController.SavedDialog) tu0Var.f28611f.get(i12)).dialogId;
                            m2Var.presentFragment(wnVar2);
                        }
                    }
                } else if (i15 == 15 && (view instanceof org.telegram.ui.Cells.u1)) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
                    MessageObject messageObject5 = u1Var.getMessageObject();
                    fs0Var.h.B0();
                    int currentAccount2 = m2Var.getCurrentAccount();
                    MessagesController messagesController2 = m2Var.getMessagesController();
                    long j10 = this.f38953b;
                    TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j10));
                    org.telegram.ui.Components.y70 F = org.telegram.ui.Components.y70.F(fs0Var, d6Var, u1Var);
                    F.f30521c0 = true;
                    if (messageObject5.isOutOwner()) {
                        i14 = 5;
                    }
                    F.V(i14);
                    F.c(R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), new a3.h0(jv0Var, j10, messageObject5, 22), false);
                    if (!messageObject5.isPollClosed()) {
                        if (messageObject5.canUnvote()) {
                            F.c(R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), new org.telegram.ui.Components.jr0(jv0Var, d6Var, currentAccount2, messageObject5), false);
                        }
                        if (!messageObject5.isForwarded() && ((messageObject5.isOut() && (!ChatObject.isChannel(chat2) || chat2.megagroup)) || (ChatObject.isChannel(chat2) && !chat2.megagroup && (chat2.creator || ((tL_chatAdminRights = chat2.admin_rights) != null && tL_chatAdminRights.edit_messages))))) {
                            int i16 = R.drawable.msg_pollstop;
                            if (messageObject5.isQuiz()) {
                                i11 = R.string.StopQuiz;
                            } else {
                                i11 = R.string.StopPoll;
                            }
                            F.c(i16, LocaleController.getString(i11), new org.telegram.ui.Components.jr0(jv0Var, d6Var, messageObject5, currentAccount2), false);
                        }
                    }
                    F.Z();
                }
            }
        }
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f38952a) {
            case 0:
                wn.S0((wn) this.f38954c, (TLRPC.TL_game) this.d, (MessageObject) this.e, (String) this.f38955f, this.f38953b);
                return;
            default:
                org.telegram.ui.Components.k31 k31Var = (org.telegram.ui.Components.k31) this.f38954c;
                ArrayList arrayList = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.e;
                org.telegram.ui.Components.th thVar = (org.telegram.ui.Components.th) this.f38955f;
                int size = arrayList.size();
                int i11 = 0;
                while (true) {
                    long j3 = this.f38953b;
                    if (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        if (j3 == ((Integer) obj).intValue()) {
                            k31Var.m(0L, false);
                        }
                    } else {
                        k31Var.f25621e0.addAll(hashSet);
                        k31Var.o();
                        org.telegram.ui.Components.yc.a0(k31Var.h).U(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new org.telegram.ui.Components.w21(k31Var, hashSet, arrayList, j3, 0), new org.telegram.ui.Components.wn0(k31Var, arrayList, thVar, 13)).j();
                        a2Var.dismiss();
                        return;
                    }
                }
        }
    }

    public we(wn wnVar, TLRPC.TL_game tL_game, MessageObject messageObject, String str, long j3) {
        this.f38952a = 0;
        this.f38954c = wnVar;
        this.d = tL_game;
        this.e = messageObject;
        this.f38955f = str;
        this.f38953b = j3;
    }

    public we(org.telegram.ui.Components.k31 k31Var, ArrayList arrayList, long j3, HashSet hashSet, org.telegram.ui.Components.th thVar) {
        this.f38952a = 2;
        this.f38954c = k31Var;
        this.d = arrayList;
        this.f38953b = j3;
        this.e = hashSet;
        this.f38955f = thVar;
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
