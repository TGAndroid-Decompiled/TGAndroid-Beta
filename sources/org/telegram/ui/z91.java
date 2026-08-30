package org.telegram.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class z91 {
    public TLRPC.User f40742a;
    public String f40743b;

    public static TLRPC.User a(long j10, ArrayList arrayList) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TLRPC.User user = (TLRPC.User) obj;
            if (user.f19331id == j10) {
                return user;
            }
        }
        return null;
    }

    public final void b(org.telegram.ui.ActionBar.p2 p2Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.f40742a.f19331id);
        MessagesController.getInstance(UserConfig.selectedAccount).putUser(this.f40742a, false);
        p2Var.presentFragment(new ProfileActivity(bundle, null));
    }

    public final void c(final TLRPC.ChatFull chatFull, final ga1 ga1Var, final org.telegram.ui.ActionBar.d2[] d2VarArr, boolean z4) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant2;
        boolean z10;
        String str;
        int i10;
        int i11;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        boolean z11 = false;
        MessagesController.getInstance(UserConfig.selectedAccount).putUser(this.f40742a, false);
        ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        if (z4 && (arrayList = chatFull.participants.participants) != null) {
            int size = arrayList.size();
            tL_chatChannelParticipant = null;
            tL_chatChannelParticipant2 = null;
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i12);
                long j10 = chatParticipant.user_id;
                if (j10 == this.f40742a.f19331id && (chatParticipant instanceof TLRPC.TL_chatChannelParticipant)) {
                    tL_chatChannelParticipant = (TLRPC.TL_chatChannelParticipant) chatParticipant;
                }
                if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && (chatParticipant instanceof TLRPC.TL_chatChannelParticipant)) {
                    tL_chatChannelParticipant2 = (TLRPC.TL_chatChannelParticipant) chatParticipant;
                }
            }
        } else {
            tL_chatChannelParticipant = null;
            tL_chatChannelParticipant2 = null;
        }
        arrayList2.add(LocaleController.getString("StatisticOpenProfile", R.string.StatisticOpenProfile));
        b.h(R.drawable.msg_openprofile, 2, arrayList4, arrayList3);
        arrayList2.add(LocaleController.getString("StatisticSearchUserHistory", R.string.StatisticSearchUserHistory));
        boolean z12 = true;
        b.h(R.drawable.msg_msgbubble3, 1, arrayList4, arrayList3);
        if (z4 && tL_chatChannelParticipant == null) {
            if (d2VarArr[0] == null) {
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(ga1Var.getFragmentView().getContext(), 3, null);
                d2VarArr[0] = d2Var;
                d2Var.q(300L);
            }
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant.channel = MessagesController.getInstance(UserConfig.selectedAccount).getInputChannel(chatFull.f19185id);
            tL_channels_getParticipant.participant = MessagesController.getInputPeer(this.f40742a);
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_channels_getParticipant, new RequestDelegate(this) {
                public final z91 f38889b;

                {
                    this.f38889b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r5) {
                        case 0:
                            final z91 z91Var = this.f38889b;
                            final ga1 ga1Var2 = ga1Var;
                            final org.telegram.ui.ActionBar.d2[] d2VarArr2 = d2VarArr;
                            final TLRPC.ChatFull chatFull2 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            ga1 ga1Var3 = ga1Var2;
                                            if (!ga1Var3.isFinishing() && ga1Var3.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.d2[] d2VarArr3 = d2VarArr2;
                                                if (d2VarArr3[0] != null) {
                                                    z91 z91Var2 = z91Var;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull3 = chatFull2;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = z91Var2.f40742a.f19331id;
                                                        chatFull3.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        z91Var2.c(chatFull3, ga1Var3, d2VarArr3, true);
                                                        return;
                                                    }
                                                    z91Var2.c(chatFull3, ga1Var3, d2VarArr3, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            ga1 ga1Var4 = ga1Var2;
                                            if (!ga1Var4.isFinishing() && ga1Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.d2[] d2VarArr4 = d2VarArr2;
                                                if (d2VarArr4[0] != null) {
                                                    z91 z91Var3 = z91Var;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        z91Var3.c(chatFull4, ga1Var4, d2VarArr4, true);
                                                        return;
                                                    }
                                                    z91Var3.c(chatFull4, ga1Var4, d2VarArr4, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final z91 z91Var2 = this.f38889b;
                            final ga1 ga1Var3 = ga1Var;
                            final org.telegram.ui.ActionBar.d2[] d2VarArr3 = d2VarArr;
                            final TLRPC.ChatFull chatFull3 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            ga1 ga1Var32 = ga1Var3;
                                            if (!ga1Var32.isFinishing() && ga1Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.d2[] d2VarArr32 = d2VarArr3;
                                                if (d2VarArr32[0] != null) {
                                                    z91 z91Var22 = z91Var2;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull3;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = z91Var22.f40742a.f19331id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        z91Var22.c(chatFull32, ga1Var32, d2VarArr32, true);
                                                        return;
                                                    }
                                                    z91Var22.c(chatFull32, ga1Var32, d2VarArr32, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            ga1 ga1Var4 = ga1Var3;
                                            if (!ga1Var4.isFinishing() && ga1Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.d2[] d2VarArr4 = d2VarArr3;
                                                if (d2VarArr4[0] != null) {
                                                    z91 z91Var3 = z91Var2;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull3;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        z91Var3.c(chatFull4, ga1Var4, d2VarArr4, true);
                                                        return;
                                                    }
                                                    z91Var3.c(chatFull4, ga1Var4, d2VarArr4, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                    }
                }
            });
        } else if (z4 && tL_chatChannelParticipant2 == null) {
            if (d2VarArr[0] == null) {
                org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(ga1Var.getFragmentView().getContext(), 3, null);
                d2VarArr[0] = d2Var2;
                d2Var2.q(300L);
            }
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant2.channel = MessagesController.getInstance(UserConfig.selectedAccount).getInputChannel(chatFull.f19185id);
            tL_channels_getParticipant2.participant = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(UserConfig.getInstance(UserConfig.selectedAccount).clientUserId);
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_channels_getParticipant2, new RequestDelegate(this) {
                public final z91 f38889b;

                {
                    this.f38889b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r5) {
                        case 0:
                            final z91 z91Var = this.f38889b;
                            final ga1 ga1Var2 = ga1Var;
                            final org.telegram.ui.ActionBar.d2[] d2VarArr2 = d2VarArr;
                            final TLRPC.ChatFull chatFull2 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            ga1 ga1Var32 = ga1Var2;
                                            if (!ga1Var32.isFinishing() && ga1Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.d2[] d2VarArr32 = d2VarArr2;
                                                if (d2VarArr32[0] != null) {
                                                    z91 z91Var22 = z91Var;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull2;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = z91Var22.f40742a.f19331id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        z91Var22.c(chatFull32, ga1Var32, d2VarArr32, true);
                                                        return;
                                                    }
                                                    z91Var22.c(chatFull32, ga1Var32, d2VarArr32, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            ga1 ga1Var4 = ga1Var2;
                                            if (!ga1Var4.isFinishing() && ga1Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.d2[] d2VarArr4 = d2VarArr2;
                                                if (d2VarArr4[0] != null) {
                                                    z91 z91Var3 = z91Var;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        z91Var3.c(chatFull4, ga1Var4, d2VarArr4, true);
                                                        return;
                                                    }
                                                    z91Var3.c(chatFull4, ga1Var4, d2VarArr4, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final z91 z91Var2 = this.f38889b;
                            final ga1 ga1Var3 = ga1Var;
                            final org.telegram.ui.ActionBar.d2[] d2VarArr3 = d2VarArr;
                            final TLRPC.ChatFull chatFull3 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            ga1 ga1Var32 = ga1Var3;
                                            if (!ga1Var32.isFinishing() && ga1Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.d2[] d2VarArr32 = d2VarArr3;
                                                if (d2VarArr32[0] != null) {
                                                    z91 z91Var22 = z91Var2;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull3;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = z91Var22.f40742a.f19331id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        z91Var22.c(chatFull32, ga1Var32, d2VarArr32, true);
                                                        return;
                                                    }
                                                    z91Var22.c(chatFull32, ga1Var32, d2VarArr32, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            ga1 ga1Var4 = ga1Var3;
                                            if (!ga1Var4.isFinishing() && ga1Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.d2[] d2VarArr4 = d2VarArr3;
                                                if (d2VarArr4[0] != null) {
                                                    z91 z91Var3 = z91Var2;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull3;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        z91Var3.c(chatFull4, ga1Var4, d2VarArr4, true);
                                                        return;
                                                    }
                                                    z91Var3.c(chatFull4, ga1Var4, d2VarArr4, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                    }
                }
            });
        } else {
            org.telegram.ui.ActionBar.d2 d2Var3 = d2VarArr[0];
            if (d2Var3 != null) {
                d2Var3.dismiss();
                d2VarArr[0] = null;
            }
            if (tL_chatChannelParticipant2 != null && tL_chatChannelParticipant != null && tL_chatChannelParticipant2.user_id != tL_chatChannelParticipant.user_id) {
                TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = tL_chatChannelParticipant2.channelParticipant.admin_rights;
                if (tL_chatAdminRights != null && tL_chatAdminRights.add_admins) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && ((channelParticipant instanceof TLRPC.TL_channelParticipantCreator) || ((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !channelParticipant.can_edit))) {
                    z10 = false;
                }
                if (z10) {
                    if (channelParticipant.admin_rights != null) {
                        z12 = false;
                    }
                    if (z12) {
                        str = "SetAsAdmin";
                        i10 = R.string.SetAsAdmin;
                    } else {
                        str = "EditAdminRights";
                        i10 = R.string.EditAdminRights;
                    }
                    arrayList2.add(LocaleController.getString(str, i10));
                    if (z12) {
                        i11 = R.drawable.msg_admins;
                    } else {
                        i11 = R.drawable.msg_permissions;
                    }
                    b.h(i11, 0, arrayList4, arrayList3);
                    z11 = z12;
                }
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ga1Var.getParentActivity());
            CharSequence[] charSequenceArr = (CharSequence[]) arrayList2.toArray(new CharSequence[arrayList3.size()]);
            int[] intArray = AndroidUtilities.toIntArray(arrayList4);
            final boolean z13 = z11;
            final TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = tL_chatChannelParticipant;
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i13) {
                    ArrayList arrayList5 = arrayList3;
                    int intValue = ((Integer) arrayList5.get(i13)).intValue();
                    z91 z91Var = z91.this;
                    TLRPC.ChatFull chatFull2 = chatFull;
                    ga1 ga1Var2 = ga1Var;
                    if (intValue == 0) {
                        boolean[] zArr = new boolean[1];
                        long j11 = z91Var.f40742a.f19331id;
                        long j12 = chatFull2.f19185id;
                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = tL_chatChannelParticipant3;
                        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant4.channelParticipant;
                        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = channelParticipant2.admin_rights;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = channelParticipant2.banned_rights;
                        String str2 = channelParticipant2.rank;
                        boolean z14 = z13;
                        x91 x91Var = new x91(z91Var, j11, j12, tL_chatAdminRights2, tL_chatBannedRights, str2, z14, zArr, ga1Var2);
                        x91Var.U0 = new y91(tL_chatChannelParticipant4, z14, zArr);
                        ga1Var2.presentFragment(x91Var);
                    } else if (((Integer) arrayList5.get(i13)).intValue() == 2) {
                        z91Var.b(ga1Var2);
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", chatFull2.f19185id);
                        bundle.putLong("search_from_user_id", z91Var.f40742a.f19331id);
                        ga1Var2.presentFragment(new xn(bundle));
                    }
                }
            };
            org.telegram.ui.ActionBar.d2 d2Var4 = alertDialog$Builder.f19503a;
            d2Var4.M = charSequenceArr;
            d2Var4.N = intArray;
            d2Var4.J = onClickListener;
            ga1Var.showDialog(d2Var4);
        }
    }
}
