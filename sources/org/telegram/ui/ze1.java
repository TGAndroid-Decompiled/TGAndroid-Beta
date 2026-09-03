package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class ze1 implements Utilities.Callback {
    public final int f43942a = 1;
    public final int f43943b;
    public final long f43944c;
    public final Object d;
    public final Object f43945e;
    public final Object f43946f;
    public final Object f43947g;

    public ze1(int i10, long j10, Context context, TL_payments.connectedBotStarRef connectedbotstarref, org.telegram.ui.ActionBar.h3 h3Var, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f43943b = i10;
        this.d = connectedbotstarref;
        this.f43945e = h3Var;
        this.f43946f = context;
        this.f43944c = j10;
        this.f43947g = g6Var;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        SpannableStringBuilder replaceTags;
        int i11 = this.f43942a;
        Object obj2 = this.f43947g;
        Object obj3 = this.f43946f;
        Object obj4 = this.f43945e;
        Object obj5 = this.d;
        switch (i11) {
            case 0:
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers2 = (TLRPC.TL_messages_invitedUsers) obj;
                sf1 sf1Var = ((cf1) obj5).f35788b;
                if (tL_messages_invitedUsers2 != null) {
                    tL_messages_invitedUsers.missing_invitees.addAll(tL_messages_invitedUsers2.missing_invitees);
                }
                int i12 = iArr[0] + 1;
                iArr[0] = i12;
                if (i12 == this.f43943b) {
                    boolean isEmpty = tL_messages_invitedUsers.missing_invitees.isEmpty();
                    long j10 = this.f43944c;
                    if (isEmpty) {
                        org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(sf1Var);
                        TLRPC.Chat chat = sf1Var.getMessagesController().getChat(Long.valueOf(j10));
                        a02.getClass();
                        if (arrayList.size() == 0) {
                            replaceTags = null;
                        } else if (arrayList.size() == 1) {
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("HasBeenAddedToChannel", R.string.HasBeenAddedToChannel, "**" + UserObject.getFirstName((TLRPC.User) arrayList.get(0)) + "**"));
                            } else {
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("HasBeenAddedToGroup", R.string.HasBeenAddedToGroup, "**" + UserObject.getFirstName((TLRPC.User) arrayList.get(0)) + "**"));
                            }
                        } else if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddedMembersToChannel", arrayList.size(), new Object[0]));
                        } else {
                            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddedSubscribersToChannel", arrayList.size(), new Object[0]));
                        }
                        a02.V(arrayList, replaceTags, null, null).j();
                        return;
                    }
                    TLRPC.Chat chat2 = sf1Var.getMessagesController().getChat(Long.valueOf(j10));
                    i10 = ((org.telegram.ui.ActionBar.p2) sf1Var).currentAccount;
                    org.telegram.ui.Components.z4.f(i10, chat2, tL_messages_invitedUsers);
                    return;
                }
                return;
            default:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj5;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj2;
                TL_payments.connectedBotStarRef connectedbotstarref2 = (TL_payments.connectedBotStarRef) obj;
                int i13 = this.f43943b;
                long j11 = this.f43944c;
                if (connectedbotstarref2 == null) {
                    TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(connectedbotstarref.bot_id));
                    if (user != null) {
                        MessagesController.getInstance(i13).loadFullUser(user, 0, true, new sh.s2(h3Var, context, i13, j11, g6Var, 1));
                        return;
                    }
                    return;
                }
                h3Var.dismiss();
                sh.d3.H0(context, i13, connectedbotstarref2, j11, g6Var);
                return;
        }
    }

    public ze1(cf1 cf1Var, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, ArrayList arrayList, long j10) {
        this.d = cf1Var;
        this.f43945e = tL_messages_invitedUsers;
        this.f43946f = iArr;
        this.f43943b = i10;
        this.f43947g = arrayList;
        this.f43944c = j10;
    }
}
