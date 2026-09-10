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
public final class ze implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.kl0 {
    public final int f39266a;
    public final long f39267b;
    public final NotificationCenter.NotificationCenterDelegate f39268c;
    public final Object d;
    public final Object e;
    public final Object f39269f;

    public ze(Object obj, KeyEvent.Callback callback, Object obj2, long j3, Object obj3, int i10) {
        this.f39266a = i10;
        this.f39268c = (NotificationCenter.NotificationCenterDelegate) obj;
        this.d = callback;
        this.e = obj2;
        this.f39267b = j3;
        this.f39269f = obj3;
    }

    @Override
    public void c(final float f7, final float f10, int i10, View view) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i11;
        long j3;
        int i12 = i10;
        final org.telegram.ui.Components.iv0 iv0Var = (org.telegram.ui.Components.iv0) this.f39268c;
        org.telegram.ui.Components.ds0 ds0Var = (org.telegram.ui.Components.ds0) this.d;
        final Context context = (Context) this.e;
        org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f39269f;
        org.telegram.ui.Components.qt0 qt0Var = iv0Var.Q;
        org.telegram.ui.Components.ru0 ru0Var = iv0Var.R;
        org.telegram.ui.Components.rt0 rt0Var = iv0Var.f24082a0;
        org.telegram.ui.Components.tu0 tu0Var = iv0Var.S;
        org.telegram.ui.ActionBar.p2 p2Var = iv0Var.f24131v1;
        int i13 = ds0Var.F;
        if (i13 == 7) {
            if (view instanceof org.telegram.ui.Cells.bb) {
                if (!rt0Var.e.isEmpty()) {
                    i12 = ((Integer) rt0Var.e.get(i12)).intValue();
                }
                TLRPC.ChatParticipant chatParticipant = rt0Var.d.participants.participants.get(i12);
                if (i12 >= 0 && i12 < rt0Var.d.participants.participants.size()) {
                    iv0Var.I0(chatParticipant, false, view);
                    return;
                }
                return;
            }
            s4.h0 adapter = ds0Var.h.getAdapter();
            org.telegram.ui.Components.yt0 yt0Var = iv0Var.f24105j0;
            if (adapter == yt0Var) {
                TLObject E = yt0Var.E(i12);
                if (E instanceof TLRPC.ChannelParticipant) {
                    j3 = MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer);
                } else if (E instanceof TLRPC.ChatParticipant) {
                    j3 = ((TLRPC.ChatParticipant) E).user_id;
                } else {
                    return;
                }
                if (j3 != 0 && j3 != p2Var.getUserConfig().getClientUserId()) {
                    p2Var.presentFragment(new ProfileActivity(w.f.e(j3, "user_id"), null));
                }
            }
        } else if (i13 == 6 && (view instanceof org.telegram.ui.Cells.j6)) {
            TLRPC.Chat chat = ((org.telegram.ui.Cells.j6) view).getChat();
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f17195id);
            if (p2Var.getMessagesController().checkCanOpenChat(bundle, p2Var)) {
                if (chat.forum) {
                    HashSet hashSet = ig1.f33680n1;
                    p2Var.presentFragment(ig1.E0(p2Var.getMessagesController(), p2Var.getMessagesStorage(), bundle));
                    return;
                }
                p2Var.presentFragment(new eo(bundle));
            }
        } else if (i13 == 1 && (view instanceof org.telegram.ui.Cells.l7)) {
            iv0Var.G0(i12, view, ((org.telegram.ui.Cells.l7) view).getMessage(), ds0Var.F);
        } else {
            int i14 = 3;
            if (i13 == 3 && (view instanceof org.telegram.ui.Cells.o7)) {
                iv0Var.G0(i12, view, ((org.telegram.ui.Cells.o7) view).getMessage(), ds0Var.F);
            } else if ((i13 == 2 || i13 == 4) && (view instanceof org.telegram.ui.Cells.k7)) {
                iv0Var.G0(i12, view, ((org.telegram.ui.Cells.k7) view).getMessage(), ds0Var.F);
            } else if (i13 == 5 && (view instanceof org.telegram.ui.Cells.e2)) {
                iv0Var.G0(i12, view, (MessageObject) ((org.telegram.ui.Cells.e2) view).getParentObject(), ds0Var.F);
            } else if (i13 == 0 && (view instanceof org.telegram.ui.Cells.u7)) {
                final org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
                MessageObject messageObject = u7Var.getMessageObject();
                if (messageObject != null && messageObject.isSensitive()) {
                    if (p2Var != null) {
                        final int currentAccount = p2Var.getCurrentAccount();
                        final MessagesController messagesController = MessagesController.getInstance(currentAccount);
                        final org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(context, 3, null);
                        d2Var.q(200L);
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
                                org.telegram.ui.ActionBar.p2 p2Var2 = iv0.this.f24131v1;
                                d2Var.c(200L);
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
                                    if (p2Var2 == null) {
                                        resourceProvider = null;
                                    } else {
                                        resourceProvider = p2Var2.getResourceProvider();
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
                                    frameLayout.addView(z1Var, w7.a6.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                                    z1Var.setOnClickListener(new v0(6, zArr));
                                }
                                if (p2Var2 == null) {
                                    resourceProvider2 = null;
                                } else {
                                    resourceProvider2 = p2Var2.getResourceProvider();
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, resourceProvider2);
                                alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.MessageShowSensitiveContentMediaTitle);
                                if (z11) {
                                    i15 = R.string.MessageShowSensitiveContentMediaTextClosed;
                                } else {
                                    i15 = R.string.MessageShowSensitiveContentMediaText;
                                }
                                alertDialog$Builder.f17528a.T = LocaleController.getString(i15);
                                alertDialog$Builder.n(frameLayout);
                                alertDialog$Builder.f17528a.G = 9;
                                if (z11) {
                                    i16 = R.string.MessageShowSensitiveContentMediaTextClosedButton;
                                } else {
                                    i16 = R.string.Cancel;
                                }
                                alertDialog$Builder.h(LocaleController.getString(i16), null);
                                if (!z11) {
                                    String string = LocaleController.getString(R.string.MessageShowSensitiveContentButton);
                                    final org.telegram.ui.Cells.u7 u7Var2 = u7Var;
                                    final float f11 = f7;
                                    final float f12 = f10;
                                    final int i17 = currentAccount;
                                    alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.c2() {
                                        @Override
                                        public final void f(org.telegram.ui.ActionBar.d2 d2Var2, int i18) {
                                            org.telegram.ui.ActionBar.f6 resourceProvider3;
                                            TL_account.contentSettings contentsettings2;
                                            pr0 pr0Var = new pr0(org.telegram.ui.Cells.u7.this, f11, f12);
                                            if (zArr[0]) {
                                                if (!z10 && ((contentsettings2 = contentsettings) == null || !contentsettings2.sensitive_can_change)) {
                                                    pr0Var.run(Boolean.TRUE);
                                                    return;
                                                }
                                                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                                org.telegram.ui.pf pfVar = new org.telegram.ui.pf(21, messagesController2, pr0Var);
                                                if (U == null) {
                                                    resourceProvider3 = null;
                                                } else {
                                                    resourceProvider3 = U.getResourceProvider();
                                                }
                                                ThemeActivity.C0(i17, context2, pfVar, resourceProvider3);
                                                return;
                                            }
                                            pr0Var.run(Boolean.FALSE);
                                        }
                                    });
                                }
                                if (p2Var2 != null && p2Var2.getContext() != null) {
                                    p2Var2.showDialog(alertDialog$Builder.f17528a);
                                } else {
                                    alertDialog$Builder.o();
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
                MessageObject messageObject2 = u7Var.f20509n;
                if (messageObject2 != null && messageObject2.hasMediaSpoilers() && u7Var.f20505i0 == 0.0f && !u7Var.f20509n.isMediaSpoilersRevealedInSharedMedia) {
                    u7Var.n(f7, f10);
                } else if (messageObject != null) {
                    iv0Var.G0(i12, view, messageObject, ds0Var.F);
                }
            } else if (org.telegram.ui.Components.iv0.p0(i13) && (view instanceof org.telegram.ui.Cells.u7)) {
                MessageObject messageObject3 = ((org.telegram.ui.Cells.u7) view).getMessageObject();
                if (messageObject3 != null) {
                    iv0Var.G0(i12, view, messageObject3, ds0Var.F);
                }
            } else {
                int i15 = ds0Var.F;
                if (i15 == 10) {
                    if (((view instanceof org.telegram.ui.Cells.j6) || f10 < AndroidUtilities.dp(60.0f)) && i12 >= 0 && i12 < qt0Var.d.size()) {
                        Bundle bundle2 = new Bundle();
                        TLObject tLObject = (TLObject) qt0Var.d.get(i12);
                        if (tLObject instanceof TLRPC.Chat) {
                            bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).f17195id);
                        } else if (tLObject instanceof TLRPC.User) {
                            bundle2.putLong("user_id", ((TLRPC.User) tLObject).f17342id);
                        } else {
                            return;
                        }
                        p2Var.presentFragment(new eo(bundle2));
                    }
                } else if (i15 == 11) {
                    if (ds0Var.h.getAdapter() == tu0Var) {
                        if (i12 >= 0) {
                            ArrayList arrayList = tu0Var.e;
                            ArrayList arrayList2 = tu0Var.f27488f;
                            if (i12 < arrayList.size()) {
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("user_id", p2Var.getUserConfig().getClientUserId());
                                bundle3.putInt("chatMode", 3);
                                eo eoVar = new eo(bundle3);
                                eoVar.f32298d4 = ((SavedMessagesController.SavedDialog) arrayList.get(i12)).dialogId;
                                p2Var.presentFragment(eoVar);
                                return;
                            }
                            int size = i12 - arrayList.size();
                            if (size < arrayList2.size()) {
                                MessageObject messageObject4 = (MessageObject) arrayList2.get(size);
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("user_id", p2Var.getUserConfig().getClientUserId());
                                bundle4.putInt("message_id", messageObject4.getId());
                                org.telegram.ui.Components.ls0 ls0Var = new org.telegram.ui.Components.ls0(iv0Var, bundle4, size);
                                ls0Var.L7 = messageObject4.getId();
                                p2Var.presentFragment(ls0Var);
                            }
                        }
                    } else if (iv0Var.C1) {
                        if (ru0Var.v.f41759y == 0) {
                            ru0Var.E(view);
                        }
                    } else {
                        Bundle bundle5 = new Bundle();
                        if (i12 >= 0 && i12 < ru0Var.f26756f.size()) {
                            bundle5.putLong("user_id", p2Var.getUserConfig().getClientUserId());
                            bundle5.putInt("chatMode", 3);
                            eo eoVar2 = new eo(bundle5);
                            eoVar2.f32298d4 = ((SavedMessagesController.SavedDialog) ru0Var.f26756f.get(i12)).dialogId;
                            p2Var.presentFragment(eoVar2);
                        }
                    }
                } else if (i15 == 15 && (view instanceof org.telegram.ui.Cells.t1)) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
                    MessageObject messageObject5 = t1Var.getMessageObject();
                    ds0Var.h.B0();
                    int currentAccount2 = p2Var.getCurrentAccount();
                    MessagesController messagesController2 = p2Var.getMessagesController();
                    long j10 = this.f39267b;
                    TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j10));
                    org.telegram.ui.Components.w70 F = org.telegram.ui.Components.w70.F(ds0Var, f6Var, t1Var);
                    F.f28675c0 = true;
                    if (messageObject5.isOutOwner()) {
                        i14 = 5;
                    }
                    F.V(i14);
                    F.c(R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), new a3.h0(iv0Var, j10, messageObject5, 16), false);
                    if (!messageObject5.isPollClosed()) {
                        if (messageObject5.canUnvote()) {
                            F.c(R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), new org.telegram.ui.Components.hr0(iv0Var, f6Var, currentAccount2, messageObject5), false);
                        }
                        if (!messageObject5.isForwarded() && ((messageObject5.isOut() && (!ChatObject.isChannel(chat2) || chat2.megagroup)) || (ChatObject.isChannel(chat2) && !chat2.megagroup && (chat2.creator || ((tL_chatAdminRights = chat2.admin_rights) != null && tL_chatAdminRights.edit_messages))))) {
                            int i16 = R.drawable.msg_pollstop;
                            if (messageObject5.isQuiz()) {
                                i11 = R.string.StopQuiz;
                            } else {
                                i11 = R.string.StopPoll;
                            }
                            F.c(i16, LocaleController.getString(i11), new org.telegram.ui.Components.hr0(iv0Var, f6Var, messageObject5, currentAccount2), false);
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
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f39266a) {
            case 0:
                eo.X0((eo) this.f39268c, (TLRPC.TL_game) this.d, (MessageObject) this.e, (String) this.f39269f, this.f39267b);
                return;
            default:
                org.telegram.ui.Components.k31 k31Var = (org.telegram.ui.Components.k31) this.f39268c;
                ArrayList arrayList = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.e;
                org.telegram.ui.Components.c30 c30Var = (org.telegram.ui.Components.c30) this.f39269f;
                int size = arrayList.size();
                int i11 = 0;
                while (true) {
                    long j3 = this.f39267b;
                    if (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        if (j3 == ((Integer) obj).intValue()) {
                            k31Var.m(0L, false);
                        }
                    } else {
                        k31Var.f24593e0.addAll(hashSet);
                        k31Var.o();
                        org.telegram.ui.Components.wc.a0(k31Var.h).U(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new bi.ua(k31Var, hashSet, arrayList, j3, 26), new org.telegram.ui.Components.yo0(k31Var, arrayList, c30Var, 10)).j();
                        d2Var.dismiss();
                        return;
                    }
                }
        }
    }

    public ze(eo eoVar, TLRPC.TL_game tL_game, MessageObject messageObject, String str, long j3) {
        this.f39266a = 0;
        this.f39268c = eoVar;
        this.d = tL_game;
        this.e = messageObject;
        this.f39269f = str;
        this.f39267b = j3;
    }

    public ze(org.telegram.ui.Components.k31 k31Var, ArrayList arrayList, long j3, HashSet hashSet, org.telegram.ui.Components.c30 c30Var) {
        this.f39266a = 2;
        this.f39268c = k31Var;
        this.d = arrayList;
        this.f39267b = j3;
        this.e = hashSet;
        this.f39269f = c30Var;
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }
}
