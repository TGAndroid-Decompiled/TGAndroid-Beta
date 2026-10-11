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
public final class we implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.hm0 {
    public final int f43395a;
    public final long f43396b;
    public final NotificationCenter.NotificationCenterDelegate f43397c;
    public final Object d;
    public final Object f43398e;
    public final Object f43399f;

    public we(Object obj, KeyEvent.Callback callback, Object obj2, long j3, Object obj3, int i10) {
        this.f43395a = i10;
        this.f43397c = (NotificationCenter.NotificationCenterDelegate) obj;
        this.d = callback;
        this.f43398e = obj2;
        this.f43396b = j3;
        this.f43399f = obj3;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void c(final float f7, final float f10, int i10, View view) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i11;
        long j3;
        int i12 = i10;
        final org.telegram.ui.Components.dw0 dw0Var = (org.telegram.ui.Components.dw0) this.f43397c;
        org.telegram.ui.Components.zs0 zs0Var = (org.telegram.ui.Components.zs0) this.d;
        final Context context = (Context) this.f43398e;
        org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f43399f;
        org.telegram.ui.Components.mu0 mu0Var = dw0Var.Q;
        org.telegram.ui.Components.nv0 nv0Var = dw0Var.R;
        org.telegram.ui.Components.nu0 nu0Var = dw0Var.f25685a0;
        org.telegram.ui.Components.ov0 ov0Var = dw0Var.S;
        org.telegram.ui.ActionBar.m2 m2Var = dw0Var.f25735v1;
        int i13 = zs0Var.F;
        if (i13 == 7) {
            if (view instanceof org.telegram.ui.Cells.xa) {
                if (!nu0Var.f29142e.isEmpty()) {
                    i12 = ((Integer) nu0Var.f29142e.get(i12)).intValue();
                }
                TLRPC.ChatParticipant chatParticipant = nu0Var.d.participants.participants.get(i12);
                if (i12 >= 0 && i12 < nu0Var.d.participants.participants.size()) {
                    dw0Var.I0(chatParticipant, false, view);
                    return;
                }
                return;
            }
            s4.i0 adapter = zs0Var.h.getAdapter();
            org.telegram.ui.Components.uu0 uu0Var = dw0Var.f25709j0;
            if (adapter == uu0Var) {
                TLObject E = uu0Var.E(i12);
                if (E instanceof TLRPC.ChannelParticipant) {
                    j3 = MessageObject.getPeerId(((TLRPC.ChannelParticipant) E).peer);
                } else if (E instanceof TLRPC.ChatParticipant) {
                    j3 = ((TLRPC.ChatParticipant) E).user_id;
                } else {
                    return;
                }
                if (j3 != 0 && j3 != m2Var.getUserConfig().getClientUserId()) {
                    m2Var.presentFragment(new ProfileActivity(sc.v.f(j3, "user_id"), null));
                }
            }
        } else if (i13 == 6 && (view instanceof org.telegram.ui.Cells.i6)) {
            TLRPC.Chat chat = ((org.telegram.ui.Cells.i6) view).getChat();
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f20032id);
            if (m2Var.getMessagesController().checkCanOpenChat(bundle, m2Var)) {
                if (chat.forum) {
                    HashSet hashSet = eg1.f37310n1;
                    m2Var.presentFragment(eg1.E0(m2Var.getMessagesController(), m2Var.getMessagesStorage(), bundle));
                    return;
                }
                m2Var.presentFragment(new zn(bundle));
            }
        } else if (i13 == 1 && (view instanceof org.telegram.ui.Cells.k7)) {
            dw0Var.G0(i12, view, ((org.telegram.ui.Cells.k7) view).getMessage(), zs0Var.F);
        } else {
            int i14 = 3;
            if (i13 == 3 && (view instanceof org.telegram.ui.Cells.n7)) {
                dw0Var.G0(i12, view, ((org.telegram.ui.Cells.n7) view).getMessage(), zs0Var.F);
            } else if ((i13 == 2 || i13 == 4) && (view instanceof org.telegram.ui.Cells.j7)) {
                dw0Var.G0(i12, view, ((org.telegram.ui.Cells.j7) view).getMessage(), zs0Var.F);
            } else if (i13 == 5 && (view instanceof org.telegram.ui.Cells.f2)) {
                dw0Var.G0(i12, view, (MessageObject) ((org.telegram.ui.Cells.f2) view).getParentObject(), zs0Var.F);
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
                                org.telegram.ui.ActionBar.m2 m2Var2 = dw0.this.f25735v1;
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
                                    a2Var2.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
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
                                    frameLayout.addView(a2Var2, w7.x5.a(48.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
                                    a2Var2.setOnClickListener(new t0(6, zArr));
                                }
                                if (m2Var2 == null) {
                                    resourceProvider2 = null;
                                } else {
                                    resourceProvider2 = m2Var2.getResourceProvider();
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, resourceProvider2);
                                alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.MessageShowSensitiveContentMediaTitle);
                                if (z11) {
                                    i15 = R.string.MessageShowSensitiveContentMediaTextClosed;
                                } else {
                                    i15 = R.string.MessageShowSensitiveContentMediaText;
                                }
                                alertDialog$Builder.f20368a.T = LocaleController.getString(i15);
                                alertDialog$Builder.n(frameLayout);
                                alertDialog$Builder.f20368a.G = 9;
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
                                            ms0 ms0Var = new ms0(org.telegram.ui.Cells.t7.this, f11, f12);
                                            if (zArr[0]) {
                                                if (!z10 && ((contentsettings2 = contentsettings) == null || !contentsettings2.sensitive_can_change)) {
                                                    ms0Var.run(Boolean.TRUE);
                                                    return;
                                                }
                                                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                                                org.telegram.ui.oc ocVar = new org.telegram.ui.oc(28, messagesController2, ms0Var);
                                                if (U == null) {
                                                    resourceProvider3 = null;
                                                } else {
                                                    resourceProvider3 = U.getResourceProvider();
                                                }
                                                ThemeActivity.C0(i17, context2, ocVar, resourceProvider3);
                                                return;
                                            }
                                            ms0Var.run(Boolean.FALSE);
                                        }
                                    });
                                }
                                if (m2Var2 != null && m2Var2.getContext() != null) {
                                    m2Var2.showDialog(alertDialog$Builder.f20368a);
                                } else {
                                    alertDialog$Builder.o();
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
                MessageObject messageObject2 = t7Var.f23070n;
                if (messageObject2 != null && messageObject2.hasMediaSpoilers() && t7Var.f23066i0 == 0.0f && !t7Var.f23070n.isMediaSpoilersRevealedInSharedMedia) {
                    t7Var.n(f7, f10);
                } else if (messageObject != null) {
                    dw0Var.G0(i12, view, messageObject, zs0Var.F);
                }
            } else if (org.telegram.ui.Components.dw0.p0(i13) && (view instanceof org.telegram.ui.Cells.t7)) {
                MessageObject messageObject3 = ((org.telegram.ui.Cells.t7) view).getMessageObject();
                if (messageObject3 != null) {
                    dw0Var.G0(i12, view, messageObject3, zs0Var.F);
                }
            } else {
                int i15 = zs0Var.F;
                if (i15 == 10) {
                    if (((view instanceof org.telegram.ui.Cells.i6) || f10 < AndroidUtilities.dp(60.0f)) && i12 >= 0 && i12 < mu0Var.d.size()) {
                        Bundle bundle2 = new Bundle();
                        TLObject tLObject = (TLObject) mu0Var.d.get(i12);
                        if (tLObject instanceof TLRPC.Chat) {
                            bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).f20032id);
                        } else if (tLObject instanceof TLRPC.User) {
                            bundle2.putLong("user_id", ((TLRPC.User) tLObject).f20179id);
                        } else {
                            return;
                        }
                        m2Var.presentFragment(new zn(bundle2));
                    }
                } else if (i15 == 11) {
                    if (zs0Var.h.getAdapter() == ov0Var) {
                        if (i12 >= 0) {
                            ArrayList arrayList = ov0Var.f29533e;
                            ArrayList arrayList2 = ov0Var.f29534f;
                            if (i12 < arrayList.size()) {
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("user_id", m2Var.getUserConfig().getClientUserId());
                                bundle3.putInt("chatMode", 3);
                                zn znVar = new zn(bundle3);
                                znVar.f44743d4 = ((SavedMessagesController.SavedDialog) arrayList.get(i12)).dialogId;
                                m2Var.presentFragment(znVar);
                                return;
                            }
                            int size = i12 - arrayList.size();
                            if (size < arrayList2.size()) {
                                MessageObject messageObject4 = (MessageObject) arrayList2.get(size);
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("user_id", m2Var.getUserConfig().getClientUserId());
                                bundle4.putInt("message_id", messageObject4.getId());
                                org.telegram.ui.Components.ht0 ht0Var = new org.telegram.ui.Components.ht0(dw0Var, bundle4, size);
                                ht0Var.L7 = messageObject4.getId();
                                m2Var.presentFragment(ht0Var);
                            }
                        }
                    } else if (dw0Var.C1) {
                        if (nv0Var.v.f47916y == 0) {
                            nv0Var.E(view);
                        }
                    } else {
                        Bundle bundle5 = new Bundle();
                        if (i12 >= 0 && i12 < nv0Var.f29157f.size()) {
                            bundle5.putLong("user_id", m2Var.getUserConfig().getClientUserId());
                            bundle5.putInt("chatMode", 3);
                            zn znVar2 = new zn(bundle5);
                            znVar2.f44743d4 = ((SavedMessagesController.SavedDialog) nv0Var.f29157f.get(i12)).dialogId;
                            m2Var.presentFragment(znVar2);
                        }
                    }
                } else if (i15 == 15 && (view instanceof org.telegram.ui.Cells.u1)) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
                    MessageObject messageObject5 = u1Var.getMessageObject();
                    zs0Var.h.B0();
                    int currentAccount2 = m2Var.getCurrentAccount();
                    MessagesController messagesController2 = m2Var.getMessagesController();
                    long j10 = this.f43396b;
                    TLRPC.Chat chat2 = messagesController2.getChat(Long.valueOf(j10));
                    org.telegram.ui.Components.q80 F = org.telegram.ui.Components.q80.F(zs0Var, d6Var, u1Var);
                    F.f30056c0 = true;
                    if (messageObject5.isOutOwner()) {
                        i14 = 5;
                    }
                    F.V(i14);
                    F.c(R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), new a3.h0(dw0Var, j10, messageObject5, 21), false);
                    if (!messageObject5.isPollClosed()) {
                        if (messageObject5.canUnvote()) {
                            F.c(R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), new org.telegram.ui.Components.ds0(dw0Var, d6Var, currentAccount2, messageObject5), false);
                        }
                        if (!messageObject5.isForwarded() && ((messageObject5.isOut() && (!ChatObject.isChannel(chat2) || chat2.megagroup)) || (ChatObject.isChannel(chat2) && !chat2.megagroup && (chat2.creator || ((tL_chatAdminRights = chat2.admin_rights) != null && tL_chatAdminRights.edit_messages))))) {
                            int i16 = R.drawable.msg_pollstop;
                            if (messageObject5.isQuiz()) {
                                i11 = R.string.StopQuiz;
                            } else {
                                i11 = R.string.StopPoll;
                            }
                            F.c(i16, LocaleController.getString(i11), new org.telegram.ui.Components.ds0(dw0Var, d6Var, messageObject5, currentAccount2), false);
                        }
                    }
                    F.Z();
                }
            }
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f43395a) {
            case 0:
                zn.K0((zn) this.f43397c, (TLRPC.TL_game) this.d, (MessageObject) this.f43398e, (String) this.f43399f, this.f43396b);
                return;
            default:
                org.telegram.ui.Components.e41 e41Var = (org.telegram.ui.Components.e41) this.f43397c;
                ArrayList arrayList = (ArrayList) this.d;
                HashSet hashSet = (HashSet) this.f43398e;
                org.telegram.ui.Components.vh vhVar = (org.telegram.ui.Components.vh) this.f43399f;
                int size = arrayList.size();
                int i11 = 0;
                while (true) {
                    long j3 = this.f43396b;
                    if (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        if (j3 == ((Integer) obj).intValue()) {
                            e41Var.m(0L, false);
                        }
                    } else {
                        e41Var.f25848e0.addAll(hashSet);
                        e41Var.p();
                        org.telegram.ui.Components.ad.a0(e41Var.h).U(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), false, new org.telegram.ui.Components.q31(e41Var, hashSet, arrayList, j3, 0), new org.telegram.ui.Components.fi0(e41Var, arrayList, vhVar, 18)).j();
                        a2Var.dismiss();
                        return;
                    }
                }
        }
    }

    public we(zn znVar, TLRPC.TL_game tL_game, MessageObject messageObject, String str, long j3) {
        this.f43395a = 0;
        this.f43397c = znVar;
        this.d = tL_game;
        this.f43398e = messageObject;
        this.f43399f = str;
        this.f43396b = j3;
    }

    public we(org.telegram.ui.Components.e41 e41Var, ArrayList arrayList, long j3, HashSet hashSet, org.telegram.ui.Components.vh vhVar) {
        this.f43395a = 2;
        this.f43397c = e41Var;
        this.d = arrayList;
        this.f43396b = j3;
        this.f43398e = hashSet;
        this.f43399f = vhVar;
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
