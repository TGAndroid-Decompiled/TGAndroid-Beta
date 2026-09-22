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
public final class xe implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.nl0 {
    public final int f39563a;
    public final long f39564b;
    public final NotificationCenter.NotificationCenterDelegate f39565c;
    public final Object d;
    public final Object e;
    public final Object f39566f;

    public xe(Object obj, KeyEvent.Callback callback, Object obj2, long j3, Object obj3, int i10) {
        this.f39563a = i10;
        this.f39565c = (NotificationCenter.NotificationCenterDelegate) obj;
        this.d = callback;
        this.e = obj2;
        this.f39564b = j3;
        this.f39566f = obj3;
    }

    @Override
    public void c(final float f7, final float f10, int i10, View view) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i11;
        long j3;
        int i12 = i10;
        final org.telegram.ui.Components.lv0 lv0Var = (org.telegram.ui.Components.lv0) this.f39565c;
        org.telegram.ui.Components.hs0 hs0Var = (org.telegram.ui.Components.hs0) this.d;
        final Context context = (Context) this.e;
        org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f39566f;
        org.telegram.ui.Components.ut0 ut0Var = lv0Var.Q;
        org.telegram.ui.Components.vu0 vu0Var = lv0Var.R;
        org.telegram.ui.Components.vt0 vt0Var = lv0Var.f26185a0;
        org.telegram.ui.Components.wu0 wu0Var = lv0Var.S;
        org.telegram.ui.ActionBar.n2 n2Var = lv0Var.f26234v1;
        int i13 = hs0Var.F;
        if (i13 == 7) {
            if (view instanceof org.telegram.ui.Cells.ab) {
                if (!vt0Var.e.isEmpty()) {
                    i12 = ((Integer) vt0Var.e.get(i12)).intValue();
                }
                TLRPC.ChatParticipant chatParticipant = vt0Var.d.participants.participants.get(i12);
                if (i12 >= 0 && i12 < vt0Var.d.participants.participants.size()) {
                    lv0Var.I0(chatParticipant, false, view);
                    return;
                }
                return;
            }
            s4.h0 adapter = hs0Var.h.getAdapter();
            org.telegram.ui.Components.cu0 cu0Var = lv0Var.f26208j0;
            if (adapter == cu0Var) {
                TLObject E = cu0Var.E(i12);
                if (E instanceof TLRPC.ChannelParticipant) {
                    j3 = MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer);
                } else if (E instanceof TLRPC.ChatParticipant) {
                    j3 = ((TLRPC.ChatParticipant) E).user_id;
                } else {
                    return;
                }
                if (j3 != 0 && j3 != n2Var.getUserConfig().getClientUserId()) {
                    n2Var.presentFragment(new ProfileActivity(v7.j0.e(j3, "user_id"), null));
                }
            }
        } else if (i13 == 6 && (view instanceof org.telegram.ui.Cells.j6)) {
            TLRPC.Chat chat = ((org.telegram.ui.Cells.j6) view).getChat();
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f18343id);
            if (n2Var.getMessagesController().checkCanOpenChat(bundle, n2Var)) {
                if (chat.forum) {
                    HashSet hashSet = fg1.f33620n1;
                    n2Var.presentFragment(fg1.E0(n2Var.getMessagesController(), n2Var.getMessagesStorage(), bundle));
                    return;
                }
                n2Var.presentFragment(new zn(bundle));
            }
        } else if (i13 == 1 && (view instanceof org.telegram.ui.Cells.l7)) {
            lv0Var.G0(i12, view, ((org.telegram.ui.Cells.l7) view).getMessage(), hs0Var.F);
        } else {
            int i14 = 3;
            if (i13 == 3 && (view instanceof org.telegram.ui.Cells.o7)) {
                lv0Var.G0(i12, view, ((org.telegram.ui.Cells.o7) view).getMessage(), hs0Var.F);
            } else if ((i13 == 2 || i13 == 4) && (view instanceof org.telegram.ui.Cells.k7)) {
                lv0Var.G0(i12, view, ((org.telegram.ui.Cells.k7) view).getMessage(), hs0Var.F);
            } else if (i13 == 5 && (view instanceof org.telegram.ui.Cells.f2)) {
                lv0Var.G0(i12, view, (MessageObject) ((org.telegram.ui.Cells.f2) view).getParentObject(), hs0Var.F);
            } else if (i13 == 0 && (view instanceof org.telegram.ui.Cells.u7)) {
                final org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
                MessageObject messageObject = u7Var.getMessageObject();
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
                                org.telegram.ui.ActionBar.f6 resourceProvider;
                                int dp;
                                int dp2;
                                org.telegram.ui.ActionBar.f6 resourceProvider2;
                                int i15;
                                int i16;
                                final TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                                org.telegram.ui.ActionBar.n2 n2Var2 = lv0.this.f26234v1;
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
                                    a2Var.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
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
                                    frameLayout.addView(a2Var, w7.y5.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                                    a2Var.setOnClickListener(new t0(6, zArr));
                                }
                                if (n2Var2 == null) {
                                    resourceProvider2 = null;
                                } else {
                                    resourceProvider2 = n2Var2.getResourceProvider();
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, resourceProvider2);
                                alertDialog$Builder.f18669a.R = LocaleController.getString(R.string.MessageShowSensitiveContentMediaTitle);
                                if (z11) {
                                    i15 = R.string.MessageShowSensitiveContentMediaTextClosed;
                                } else {
                                    i15 = R.string.MessageShowSensitiveContentMediaText;
                                }
                                alertDialog$Builder.f18669a.T = LocaleController.getString(i15);
                                alertDialog$Builder.n(frameLayout);
                                alertDialog$Builder.f18669a.G = 9;
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
                                    alertDialog$Builder.k(string, new org.telegram.ui.ActionBar.a2() {
                                        @Override
                                        public final void k(org.telegram.ui.ActionBar.b2 b2Var2, int i18) {
                                            org.telegram.ui.ActionBar.f6 resourceProvider3;
                                            TL_account.contentSettings contentsettings2;
                                            tr0 tr0Var = new tr0(org.telegram.ui.Cells.u7.this, f11, f12);
                                            if (zArr[0]) {
                                                if (!z10 && ((contentsettings2 = contentsettings) == null || !contentsettings2.sensitive_can_change)) {
                                                    tr0Var.run(Boolean.TRUE);
                                                    return;
                                                }
                                                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                                org.telegram.ui.of ofVar = new org.telegram.ui.of(21, messagesController2, tr0Var);
                                                if (U == null) {
                                                    resourceProvider3 = null;
                                                } else {
                                                    resourceProvider3 = U.getResourceProvider();
                                                }
                                                ThemeActivity.C0(i17, context2, ofVar, resourceProvider3);
                                                return;
                                            }
                                            tr0Var.run(Boolean.FALSE);
                                        }
                                    });
                                }
                                if (n2Var2 != null && n2Var2.getContext() != null) {
                                    n2Var2.showDialog(alertDialog$Builder.f18669a);
                                } else {
                                    alertDialog$Builder.o();
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
                MessageObject messageObject2 = u7Var.f21650n;
                if (messageObject2 != null && messageObject2.hasMediaSpoilers() && u7Var.f21646i0 == 0.0f && !u7Var.f21650n.isMediaSpoilersRevealedInSharedMedia) {
                    u7Var.n(f7, f10);
                } else if (messageObject != null) {
                    lv0Var.G0(i12, view, messageObject, hs0Var.F);
                }
            } else if (org.telegram.ui.Components.lv0.p0(i13) && (view instanceof org.telegram.ui.Cells.u7)) {
                MessageObject messageObject3 = ((org.telegram.ui.Cells.u7) view).getMessageObject();
                if (messageObject3 != null) {
                    lv0Var.G0(i12, view, messageObject3, hs0Var.F);
                }
            } else {
                int i15 = hs0Var.F;
                if (i15 == 10) {
                    if (((view instanceof org.telegram.ui.Cells.j6) || f10 < AndroidUtilities.dp(60.0f)) && i12 >= 0 && i12 < ut0Var.d.size()) {
                        Bundle bundle2 = new Bundle();
                        TLObject tLObject = (TLObject) ut0Var.d.get(i12);
                        if (tLObject instanceof TLRPC.Chat) {
                            bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).f18343id);
                        } else if (tLObject instanceof TLRPC.User) {
                            bundle2.putLong("user_id", ((TLRPC.User) tLObject).f18490id);
                        } else {
                            return;
                        }
                        n2Var.presentFragment(new zn(bundle2));
                    }
                } else if (i15 == 11) {
                    if (hs0Var.h.getAdapter() == wu0Var) {
                        if (i12 >= 0) {
                            ArrayList arrayList = wu0Var.e;
                            ArrayList arrayList2 = wu0Var.f30154f;
                            if (i12 < arrayList.size()) {
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("user_id", n2Var.getUserConfig().getClientUserId());
                                bundle3.putInt("chatMode", 3);
                                zn znVar = new zn(bundle3);
                                znVar.f40306d4 = ((SavedMessagesController.SavedDialog) arrayList.get(i12)).dialogId;
                                n2Var.presentFragment(znVar);
                                return;
                            }
                            int size = i12 - arrayList.size();
                            if (size < arrayList2.size()) {
                                MessageObject messageObject4 = (MessageObject) arrayList2.get(size);
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("user_id", n2Var.getUserConfig().getClientUserId());
                                bundle4.putInt("message_id", messageObject4.getId());
                                org.telegram.ui.Components.ps0 ps0Var = new org.telegram.ui.Components.ps0(lv0Var, bundle4, size);
                                ps0Var.L7 = messageObject4.getId();
                                n2Var.presentFragment(ps0Var);
                            }
                        }
                    } else if (lv0Var.C1) {
                        if (vu0Var.v.f43144y == 0) {
                            vu0Var.E(view);
                        }
                    } else {
                        Bundle bundle5 = new Bundle();
                        if (i12 >= 0 && i12 < vu0Var.f29807f.size()) {
                            bundle5.putLong("user_id", n2Var.getUserConfig().getClientUserId());
                            bundle5.putInt("chatMode", 3);
                            zn znVar2 = new zn(bundle5);
                            znVar2.f40306d4 = ((SavedMessagesController.SavedDialog) vu0Var.f29807f.get(i12)).dialogId;
                            n2Var.presentFragment(znVar2);
                        }
                    }
                } else if (i15 == 15 && (view instanceof org.telegram.ui.Cells.u1)) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
                    MessageObject messageObject5 = u1Var.getMessageObject();
                    hs0Var.h.C0();
                    int currentAccount2 = n2Var.getCurrentAccount();
                    MessagesController messagesController2 = n2Var.getMessagesController();
                    long j10 = this.f39564b;
                    TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j10));
                    org.telegram.ui.Components.y70 F = org.telegram.ui.Components.y70.F(hs0Var, f6Var, u1Var);
                    F.f30542c0 = true;
                    if (messageObject5.isOutOwner()) {
                        i14 = 5;
                    }
                    F.V(i14);
                    F.c(R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), new a3.h0(lv0Var, j10, messageObject5, 22), false);
                    if (!messageObject5.isPollClosed()) {
                        if (messageObject5.canUnvote()) {
                            F.c(R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), new org.telegram.ui.Components.lr0(lv0Var, f6Var, currentAccount2, messageObject5), false);
                        }
                        if (!messageObject5.isForwarded() && ((messageObject5.isOut() && (!ChatObject.isChannel(chat2) || chat2.megagroup)) || (ChatObject.isChannel(chat2) && !chat2.megagroup && (chat2.creator || ((tL_chatAdminRights = chat2.admin_rights) != null && tL_chatAdminRights.edit_messages))))) {
                            int i16 = R.drawable.msg_pollstop;
                            if (messageObject5.isQuiz()) {
                                i11 = R.string.StopQuiz;
                            } else {
                                i11 = R.string.StopPoll;
                            }
                            F.c(i16, LocaleController.getString(i11), new org.telegram.ui.Components.lr0(lv0Var, f6Var, messageObject5, currentAccount2), false);
                        }
                    }
                    F.Z();
                }
            }
        }
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f39563a) {
            case 0:
                zn.T0((zn) this.f39565c, (TLRPC.TL_game) this.d, (MessageObject) this.e, (String) this.f39566f, this.f39564b);
                return;
            default:
                org.telegram.ui.Components.n31 n31Var = (org.telegram.ui.Components.n31) this.f39565c;
                ArrayList arrayList = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.e;
                org.telegram.ui.Components.sh shVar = (org.telegram.ui.Components.sh) this.f39566f;
                int size = arrayList.size();
                int i11 = 0;
                while (true) {
                    long j3 = this.f39564b;
                    if (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        if (j3 == ((Integer) obj).intValue()) {
                            n31Var.m(0L, false);
                        }
                    } else {
                        n31Var.f26615e0.addAll(hashSet);
                        n31Var.o();
                        org.telegram.ui.Components.xc.a0(n31Var.h).U(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new org.telegram.ui.Components.z21(n31Var, hashSet, arrayList, j3, 0), new org.telegram.ui.Components.yn0(n31Var, arrayList, shVar, 13)).j();
                        b2Var.dismiss();
                        return;
                    }
                }
        }
    }

    public xe(zn znVar, TLRPC.TL_game tL_game, MessageObject messageObject, String str, long j3) {
        this.f39563a = 0;
        this.f39565c = znVar;
        this.d = tL_game;
        this.e = messageObject;
        this.f39566f = str;
        this.f39564b = j3;
    }

    public xe(org.telegram.ui.Components.n31 n31Var, ArrayList arrayList, long j3, HashSet hashSet, org.telegram.ui.Components.sh shVar) {
        this.f39563a = 2;
        this.f39565c = n31Var;
        this.d = arrayList;
        this.f39564b = j3;
        this.e = hashSet;
        this.f39566f = shVar;
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
