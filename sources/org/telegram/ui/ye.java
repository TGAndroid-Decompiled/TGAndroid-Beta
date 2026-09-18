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
public final class ye implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.bl0 {
    public final int f39868a;
    public final long f39869b;
    public final NotificationCenter.NotificationCenterDelegate f39870c;
    public final Object d;
    public final Object e;
    public final Object f39871f;

    public ye(Object obj, KeyEvent.Callback callback, Object obj2, long j3, Object obj3, int i10) {
        this.f39868a = i10;
        this.f39870c = (NotificationCenter.NotificationCenterDelegate) obj;
        this.d = callback;
        this.e = obj2;
        this.f39869b = j3;
        this.f39871f = obj3;
    }

    @Override
    public void c(final float f7, final float f10, int i10, View view) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i11;
        long j3;
        int i12 = i10;
        final org.telegram.ui.Components.zu0 zu0Var = (org.telegram.ui.Components.zu0) this.f39870c;
        org.telegram.ui.Components.vr0 vr0Var = (org.telegram.ui.Components.vr0) this.d;
        final Context context = (Context) this.e;
        org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f39871f;
        org.telegram.ui.Components.it0 it0Var = zu0Var.Q;
        org.telegram.ui.Components.ju0 ju0Var = zu0Var.R;
        org.telegram.ui.Components.jt0 jt0Var = zu0Var.f30610a0;
        org.telegram.ui.Components.ku0 ku0Var = zu0Var.S;
        org.telegram.ui.ActionBar.o2 o2Var = zu0Var.f30659v1;
        int i13 = vr0Var.F;
        if (i13 == 7) {
            if (view instanceof org.telegram.ui.Cells.ab) {
                if (!jt0Var.e.isEmpty()) {
                    i12 = ((Integer) jt0Var.e.get(i12)).intValue();
                }
                TLRPC.ChatParticipant chatParticipant = jt0Var.d.participants.participants.get(i12);
                if (i12 >= 0 && i12 < jt0Var.d.participants.participants.size()) {
                    zu0Var.I0(chatParticipant, false, view);
                    return;
                }
                return;
            }
            s4.h0 adapter = vr0Var.h.getAdapter();
            org.telegram.ui.Components.qt0 qt0Var = zu0Var.f30633j0;
            if (adapter == qt0Var) {
                TLObject E = qt0Var.E(i12);
                if (E instanceof TLRPC.ChannelParticipant) {
                    j3 = MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer);
                } else if (E instanceof TLRPC.ChatParticipant) {
                    j3 = ((TLRPC.ChatParticipant) E).user_id;
                } else {
                    return;
                }
                if (j3 != 0 && j3 != o2Var.getUserConfig().getClientUserId()) {
                    o2Var.presentFragment(new ProfileActivity(w.f.e(j3, "user_id"), null));
                }
            }
        } else if (i13 == 6 && (view instanceof org.telegram.ui.Cells.h6)) {
            TLRPC.Chat chat = ((org.telegram.ui.Cells.h6) view).getChat();
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f18121id);
            if (o2Var.getMessagesController().checkCanOpenChat(bundle, o2Var)) {
                if (chat.forum) {
                    HashSet hashSet = fg1.f33639n1;
                    o2Var.presentFragment(fg1.E0(o2Var.getMessagesController(), o2Var.getMessagesStorage(), bundle));
                    return;
                }
                o2Var.presentFragment(new bo(bundle));
            }
        } else if (i13 == 1 && (view instanceof org.telegram.ui.Cells.j7)) {
            zu0Var.G0(i12, view, ((org.telegram.ui.Cells.j7) view).getMessage(), vr0Var.F);
        } else {
            int i14 = 3;
            if (i13 == 3 && (view instanceof org.telegram.ui.Cells.n7)) {
                zu0Var.G0(i12, view, ((org.telegram.ui.Cells.n7) view).getMessage(), vr0Var.F);
            } else if ((i13 == 2 || i13 == 4) && (view instanceof org.telegram.ui.Cells.i7)) {
                zu0Var.G0(i12, view, ((org.telegram.ui.Cells.i7) view).getMessage(), vr0Var.F);
            } else if (i13 == 5 && (view instanceof org.telegram.ui.Cells.e2)) {
                zu0Var.G0(i12, view, (MessageObject) ((org.telegram.ui.Cells.e2) view).getParentObject(), vr0Var.F);
            } else if (i13 == 0 && (view instanceof org.telegram.ui.Cells.t7)) {
                final org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
                MessageObject messageObject = t7Var.getMessageObject();
                if (messageObject != null && messageObject.isSensitive()) {
                    if (o2Var != null) {
                        final int currentAccount = o2Var.getCurrentAccount();
                        final MessagesController messagesController = MessagesController.getInstance(currentAccount);
                        final org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(context, 3, null);
                        c2Var.q(200L);
                        messagesController.getContentSettings(new Utilities.Callback() {
                            @Override
                            public final void run(Object obj) {
                                final boolean z10;
                                boolean z11;
                                org.telegram.ui.ActionBar.f6 resourceProvider;
                                int dp;
                                int dp2;
                                org.telegram.ui.ActionBar.f6 resourceProvider2;
                                int i15;
                                int i16;
                                final TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                                org.telegram.ui.ActionBar.o2 o2Var2 = zu0.this.f30659v1;
                                c2Var.c(200L);
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
                                    if (o2Var2 == null) {
                                        resourceProvider = null;
                                    } else {
                                        resourceProvider = o2Var2.getResourceProvider();
                                    }
                                    org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context2, 1, resourceProvider);
                                    z1Var.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                                    z1Var.e(LocaleController.getString(R.string.MessageShowSensitiveContentAlways), "", zArr[0], false, false);
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
                                    z1Var.setPadding(dp, 0, dp2, 0);
                                    frameLayout.addView(z1Var, w7.x5.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                                    z1Var.setOnClickListener(new t0(6, zArr));
                                }
                                if (o2Var2 == null) {
                                    resourceProvider2 = null;
                                } else {
                                    resourceProvider2 = o2Var2.getResourceProvider();
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, resourceProvider2);
                                alertDialog$Builder.f18447a.R = LocaleController.getString(R.string.MessageShowSensitiveContentMediaTitle);
                                if (z11) {
                                    i15 = R.string.MessageShowSensitiveContentMediaTextClosed;
                                } else {
                                    i15 = R.string.MessageShowSensitiveContentMediaText;
                                }
                                alertDialog$Builder.f18447a.T = LocaleController.getString(i15);
                                alertDialog$Builder.n(frameLayout);
                                alertDialog$Builder.f18447a.G = 9;
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
                                    alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.b2() {
                                        @Override
                                        public final void f(org.telegram.ui.ActionBar.c2 c2Var2, int i18) {
                                            org.telegram.ui.ActionBar.f6 resourceProvider3;
                                            TL_account.contentSettings contentsettings2;
                                            hr0 hr0Var = new hr0(org.telegram.ui.Cells.t7.this, f11, f12);
                                            if (zArr[0]) {
                                                if (!z10 && ((contentsettings2 = contentsettings) == null || !contentsettings2.sensitive_can_change)) {
                                                    hr0Var.run(Boolean.TRUE);
                                                    return;
                                                }
                                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                                org.telegram.ui.pf pfVar = new org.telegram.ui.pf(21, messagesController2, hr0Var);
                                                if (U == null) {
                                                    resourceProvider3 = null;
                                                } else {
                                                    resourceProvider3 = U.getResourceProvider();
                                                }
                                                ThemeActivity.C0(i17, context2, pfVar, resourceProvider3);
                                                return;
                                            }
                                            hr0Var.run(Boolean.FALSE);
                                        }
                                    });
                                }
                                if (o2Var2 != null && o2Var2.getContext() != null) {
                                    o2Var2.showDialog(alertDialog$Builder.f18447a);
                                } else {
                                    alertDialog$Builder.o();
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
                MessageObject messageObject2 = t7Var.f21398n;
                if (messageObject2 != null && messageObject2.hasMediaSpoilers() && t7Var.f21394i0 == 0.0f && !t7Var.f21398n.isMediaSpoilersRevealedInSharedMedia) {
                    t7Var.n(f7, f10);
                } else if (messageObject != null) {
                    zu0Var.G0(i12, view, messageObject, vr0Var.F);
                }
            } else if (org.telegram.ui.Components.zu0.p0(i13) && (view instanceof org.telegram.ui.Cells.t7)) {
                MessageObject messageObject3 = ((org.telegram.ui.Cells.t7) view).getMessageObject();
                if (messageObject3 != null) {
                    zu0Var.G0(i12, view, messageObject3, vr0Var.F);
                }
            } else {
                int i15 = vr0Var.F;
                if (i15 == 10) {
                    if (((view instanceof org.telegram.ui.Cells.h6) || f10 < AndroidUtilities.dp(60.0f)) && i12 >= 0 && i12 < it0Var.d.size()) {
                        Bundle bundle2 = new Bundle();
                        TLObject tLObject = (TLObject) it0Var.d.get(i12);
                        if (tLObject instanceof TLRPC.Chat) {
                            bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).f18121id);
                        } else if (tLObject instanceof TLRPC.User) {
                            bundle2.putLong("user_id", ((TLRPC.User) tLObject).f18268id);
                        } else {
                            return;
                        }
                        o2Var.presentFragment(new bo(bundle2));
                    }
                } else if (i15 == 11) {
                    if (vr0Var.h.getAdapter() == ku0Var) {
                        if (i12 >= 0) {
                            ArrayList arrayList = ku0Var.e;
                            ArrayList arrayList2 = ku0Var.f25689f;
                            if (i12 < arrayList.size()) {
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("user_id", o2Var.getUserConfig().getClientUserId());
                                bundle3.putInt("chatMode", 3);
                                bo boVar = new bo(bundle3);
                                boVar.f32261d4 = ((SavedMessagesController.SavedDialog) arrayList.get(i12)).dialogId;
                                o2Var.presentFragment(boVar);
                                return;
                            }
                            int size = i12 - arrayList.size();
                            if (size < arrayList2.size()) {
                                MessageObject messageObject4 = (MessageObject) arrayList2.get(size);
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("user_id", o2Var.getUserConfig().getClientUserId());
                                bundle4.putInt("message_id", messageObject4.getId());
                                org.telegram.ui.Components.ds0 ds0Var = new org.telegram.ui.Components.ds0(zu0Var, bundle4, size);
                                ds0Var.L7 = messageObject4.getId();
                                o2Var.presentFragment(ds0Var);
                            }
                        }
                    } else if (zu0Var.C1) {
                        if (ju0Var.v.f42851y == 0) {
                            ju0Var.E(view);
                        }
                    } else {
                        Bundle bundle5 = new Bundle();
                        if (i12 >= 0 && i12 < ju0Var.f25444f.size()) {
                            bundle5.putLong("user_id", o2Var.getUserConfig().getClientUserId());
                            bundle5.putInt("chatMode", 3);
                            bo boVar2 = new bo(bundle5);
                            boVar2.f32261d4 = ((SavedMessagesController.SavedDialog) ju0Var.f25444f.get(i12)).dialogId;
                            o2Var.presentFragment(boVar2);
                        }
                    }
                } else if (i15 == 15 && (view instanceof org.telegram.ui.Cells.t1)) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
                    MessageObject messageObject5 = t1Var.getMessageObject();
                    vr0Var.h.C0();
                    int currentAccount2 = o2Var.getCurrentAccount();
                    MessagesController messagesController2 = o2Var.getMessagesController();
                    long j10 = this.f39869b;
                    TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j10));
                    org.telegram.ui.Components.n70 F = org.telegram.ui.Components.n70.F(vr0Var, f6Var, t1Var);
                    F.f26361c0 = true;
                    if (messageObject5.isOutOwner()) {
                        i14 = 5;
                    }
                    F.V(i14);
                    F.c(R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), new a3.h0(zu0Var, j10, messageObject5, 22), false);
                    if (!messageObject5.isPollClosed()) {
                        if (messageObject5.canUnvote()) {
                            F.c(R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), new org.telegram.ui.Components.xq0(zu0Var, f6Var, currentAccount2, messageObject5), false);
                        }
                        if (!messageObject5.isForwarded() && ((messageObject5.isOut() && (!ChatObject.isChannel(chat2) || chat2.megagroup)) || (ChatObject.isChannel(chat2) && !chat2.megagroup && (chat2.creator || ((tL_chatAdminRights = chat2.admin_rights) != null && tL_chatAdminRights.edit_messages))))) {
                            int i16 = R.drawable.msg_pollstop;
                            if (messageObject5.isQuiz()) {
                                i11 = R.string.StopQuiz;
                            } else {
                                i11 = R.string.StopPoll;
                            }
                            F.c(i16, LocaleController.getString(i11), new org.telegram.ui.Components.xq0(zu0Var, f6Var, messageObject5, currentAccount2), false);
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
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f39868a) {
            case 0:
                bo.X0((bo) this.f39870c, (TLRPC.TL_game) this.d, (MessageObject) this.e, (String) this.f39871f, this.f39869b);
                return;
            default:
                org.telegram.ui.Components.y21 y21Var = (org.telegram.ui.Components.y21) this.f39870c;
                ArrayList arrayList = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.e;
                org.telegram.ui.Components.sh shVar = (org.telegram.ui.Components.sh) this.f39871f;
                int size = arrayList.size();
                int i11 = 0;
                while (true) {
                    long j3 = this.f39869b;
                    if (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        if (j3 == ((Integer) obj).intValue()) {
                            y21Var.m(0L, false);
                        }
                    } else {
                        y21Var.f30106e0.addAll(hashSet);
                        y21Var.o();
                        org.telegram.ui.Components.vc.a0(y21Var.h).U(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new org.telegram.ui.Components.k21(y21Var, hashSet, arrayList, j3, 0), new org.telegram.ui.Components.br0(y21Var, arrayList, shVar)).j();
                        c2Var.dismiss();
                        return;
                    }
                }
        }
    }

    public ye(bo boVar, TLRPC.TL_game tL_game, MessageObject messageObject, String str, long j3) {
        this.f39868a = 0;
        this.f39870c = boVar;
        this.d = tL_game;
        this.e = messageObject;
        this.f39871f = str;
        this.f39869b = j3;
    }

    public ye(org.telegram.ui.Components.y21 y21Var, ArrayList arrayList, long j3, HashSet hashSet, org.telegram.ui.Components.sh shVar) {
        this.f39868a = 2;
        this.f39870c = y21Var;
        this.d = arrayList;
        this.f39869b = j3;
        this.e = hashSet;
        this.f39871f = shVar;
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
