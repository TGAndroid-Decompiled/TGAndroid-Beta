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
public final class ta1 {
    public TLRPC.User f37702a;
    public String f37703b;

    public static TLRPC.User a(long j3, ArrayList arrayList) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TLRPC.User user = (TLRPC.User) obj;
            if (user.f18268id == j3) {
                return user;
            }
        }
        return null;
    }

    public final void b(org.telegram.ui.ActionBar.o2 o2Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.f37702a.f18268id);
        MessagesController.getInstance(UserConfig.selectedAccount).putUser(this.f37702a, false);
        o2Var.presentFragment(new ProfileActivity(bundle, null));
    }

    public final void c(final TLRPC.ChatFull chatFull, final ab1 ab1Var, final org.telegram.ui.ActionBar.c2[] c2VarArr, boolean z10) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant2;
        boolean z11;
        String str;
        int i10;
        int i11;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        boolean z12 = false;
        MessagesController.getInstance(UserConfig.selectedAccount).putUser(this.f37702a, false);
        ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        if (z10 && (arrayList = chatFull.participants.participants) != null) {
            int size = arrayList.size();
            tL_chatChannelParticipant = null;
            tL_chatChannelParticipant2 = null;
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i12);
                long j3 = chatParticipant.user_id;
                if (j3 == this.f37702a.f18268id && (chatParticipant instanceof TLRPC.TL_chatChannelParticipant)) {
                    tL_chatChannelParticipant = (TLRPC.TL_chatChannelParticipant) chatParticipant;
                }
                if (j3 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && (chatParticipant instanceof TLRPC.TL_chatChannelParticipant)) {
                    tL_chatChannelParticipant2 = (TLRPC.TL_chatChannelParticipant) chatParticipant;
                }
            }
        } else {
            tL_chatChannelParticipant = null;
            tL_chatChannelParticipant2 = null;
        }
        arrayList2.add(LocaleController.getString("StatisticOpenProfile", R.string.StatisticOpenProfile));
        org.telegram.ui.Cells.p6.n(R.drawable.msg_openprofile, 2, arrayList4, arrayList3);
        arrayList2.add(LocaleController.getString("StatisticSearchUserHistory", R.string.StatisticSearchUserHistory));
        boolean z13 = true;
        org.telegram.ui.Cells.p6.n(R.drawable.msg_msgbubble3, 1, arrayList4, arrayList3);
        if (z10 && tL_chatChannelParticipant == null) {
            if (c2VarArr[0] == null) {
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(ab1Var.getFragmentView().getContext(), 3, null);
                c2VarArr[0] = c2Var;
                c2Var.q(300L);
            }
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant.channel = MessagesController.getInstance(UserConfig.selectedAccount).getInputChannel(chatFull.f18122id);
            tL_channels_getParticipant.participant = MessagesController.getInputPeer(this.f37702a);
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_channels_getParticipant, new RequestDelegate(this) {
                public final ta1 f36285b;

                {
                    this.f36285b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r5) {
                        case 0:
                            final ta1 ta1Var = this.f36285b;
                            final ab1 ab1Var2 = ab1Var;
                            final org.telegram.ui.ActionBar.c2[] c2VarArr2 = c2VarArr;
                            final TLRPC.ChatFull chatFull2 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            ab1 ab1Var3 = ab1Var2;
                                            if (!ab1Var3.isFinishing() && ab1Var3.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.c2[] c2VarArr3 = c2VarArr2;
                                                if (c2VarArr3[0] != null) {
                                                    ta1 ta1Var2 = ta1Var;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull3 = chatFull2;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = ta1Var2.f37702a.f18268id;
                                                        chatFull3.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        ta1Var2.c(chatFull3, ab1Var3, c2VarArr3, true);
                                                        return;
                                                    }
                                                    ta1Var2.c(chatFull3, ab1Var3, c2VarArr3, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            ab1 ab1Var4 = ab1Var2;
                                            if (!ab1Var4.isFinishing() && ab1Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.c2[] c2VarArr4 = c2VarArr2;
                                                if (c2VarArr4[0] != null) {
                                                    ta1 ta1Var3 = ta1Var;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        ta1Var3.c(chatFull4, ab1Var4, c2VarArr4, true);
                                                        return;
                                                    }
                                                    ta1Var3.c(chatFull4, ab1Var4, c2VarArr4, false);
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
                            final ta1 ta1Var2 = this.f36285b;
                            final ab1 ab1Var3 = ab1Var;
                            final org.telegram.ui.ActionBar.c2[] c2VarArr3 = c2VarArr;
                            final TLRPC.ChatFull chatFull3 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            ab1 ab1Var32 = ab1Var3;
                                            if (!ab1Var32.isFinishing() && ab1Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.c2[] c2VarArr32 = c2VarArr3;
                                                if (c2VarArr32[0] != null) {
                                                    ta1 ta1Var22 = ta1Var2;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull3;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = ta1Var22.f37702a.f18268id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        ta1Var22.c(chatFull32, ab1Var32, c2VarArr32, true);
                                                        return;
                                                    }
                                                    ta1Var22.c(chatFull32, ab1Var32, c2VarArr32, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            ab1 ab1Var4 = ab1Var3;
                                            if (!ab1Var4.isFinishing() && ab1Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.c2[] c2VarArr4 = c2VarArr3;
                                                if (c2VarArr4[0] != null) {
                                                    ta1 ta1Var3 = ta1Var2;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull3;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        ta1Var3.c(chatFull4, ab1Var4, c2VarArr4, true);
                                                        return;
                                                    }
                                                    ta1Var3.c(chatFull4, ab1Var4, c2VarArr4, false);
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
        } else if (z10 && tL_chatChannelParticipant2 == null) {
            if (c2VarArr[0] == null) {
                org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(ab1Var.getFragmentView().getContext(), 3, null);
                c2VarArr[0] = c2Var2;
                c2Var2.q(300L);
            }
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant2.channel = MessagesController.getInstance(UserConfig.selectedAccount).getInputChannel(chatFull.f18122id);
            tL_channels_getParticipant2.participant = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(UserConfig.getInstance(UserConfig.selectedAccount).clientUserId);
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_channels_getParticipant2, new RequestDelegate(this) {
                public final ta1 f36285b;

                {
                    this.f36285b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r5) {
                        case 0:
                            final ta1 ta1Var = this.f36285b;
                            final ab1 ab1Var2 = ab1Var;
                            final org.telegram.ui.ActionBar.c2[] c2VarArr2 = c2VarArr;
                            final TLRPC.ChatFull chatFull2 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            ab1 ab1Var32 = ab1Var2;
                                            if (!ab1Var32.isFinishing() && ab1Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.c2[] c2VarArr32 = c2VarArr2;
                                                if (c2VarArr32[0] != null) {
                                                    ta1 ta1Var22 = ta1Var;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull2;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = ta1Var22.f37702a.f18268id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        ta1Var22.c(chatFull32, ab1Var32, c2VarArr32, true);
                                                        return;
                                                    }
                                                    ta1Var22.c(chatFull32, ab1Var32, c2VarArr32, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            ab1 ab1Var4 = ab1Var2;
                                            if (!ab1Var4.isFinishing() && ab1Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.c2[] c2VarArr4 = c2VarArr2;
                                                if (c2VarArr4[0] != null) {
                                                    ta1 ta1Var3 = ta1Var;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        ta1Var3.c(chatFull4, ab1Var4, c2VarArr4, true);
                                                        return;
                                                    }
                                                    ta1Var3.c(chatFull4, ab1Var4, c2VarArr4, false);
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
                            final ta1 ta1Var2 = this.f36285b;
                            final ab1 ab1Var3 = ab1Var;
                            final org.telegram.ui.ActionBar.c2[] c2VarArr3 = c2VarArr;
                            final TLRPC.ChatFull chatFull3 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            ab1 ab1Var32 = ab1Var3;
                                            if (!ab1Var32.isFinishing() && ab1Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.c2[] c2VarArr32 = c2VarArr3;
                                                if (c2VarArr32[0] != null) {
                                                    ta1 ta1Var22 = ta1Var2;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull3;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = ta1Var22.f37702a.f18268id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        ta1Var22.c(chatFull32, ab1Var32, c2VarArr32, true);
                                                        return;
                                                    }
                                                    ta1Var22.c(chatFull32, ab1Var32, c2VarArr32, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            ab1 ab1Var4 = ab1Var3;
                                            if (!ab1Var4.isFinishing() && ab1Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.c2[] c2VarArr4 = c2VarArr3;
                                                if (c2VarArr4[0] != null) {
                                                    ta1 ta1Var3 = ta1Var2;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull3;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        ta1Var3.c(chatFull4, ab1Var4, c2VarArr4, true);
                                                        return;
                                                    }
                                                    ta1Var3.c(chatFull4, ab1Var4, c2VarArr4, false);
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
            org.telegram.ui.ActionBar.c2 c2Var3 = c2VarArr[0];
            if (c2Var3 != null) {
                c2Var3.dismiss();
                c2VarArr[0] = null;
            }
            if (tL_chatChannelParticipant2 != null && tL_chatChannelParticipant != null && tL_chatChannelParticipant2.user_id != tL_chatChannelParticipant.user_id) {
                TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = tL_chatChannelParticipant2.channelParticipant.admin_rights;
                if (tL_chatAdminRights != null && tL_chatAdminRights.add_admins) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11 && ((channelParticipant instanceof TLRPC.TL_channelParticipantCreator) || ((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) && !channelParticipant.can_edit))) {
                    z11 = false;
                }
                if (z11) {
                    if (channelParticipant.admin_rights != null) {
                        z13 = false;
                    }
                    if (z13) {
                        str = "SetAsAdmin";
                        i10 = R.string.SetAsAdmin;
                    } else {
                        str = "EditAdminRights";
                        i10 = R.string.EditAdminRights;
                    }
                    arrayList2.add(LocaleController.getString(str, i10));
                    if (z13) {
                        i11 = R.drawable.msg_admins;
                    } else {
                        i11 = R.drawable.msg_permissions;
                    }
                    org.telegram.ui.Cells.p6.n(i11, 0, arrayList4, arrayList3);
                    z12 = z13;
                }
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ab1Var.getParentActivity());
            CharSequence[] charSequenceArr = (CharSequence[]) arrayList2.toArray(new CharSequence[arrayList3.size()]);
            int[] intArray = AndroidUtilities.toIntArray(arrayList4);
            final boolean z14 = z12;
            final TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = tL_chatChannelParticipant;
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i13) {
                    ArrayList arrayList5 = arrayList3;
                    int intValue = ((Integer) arrayList5.get(i13)).intValue();
                    ta1 ta1Var = ta1.this;
                    TLRPC.ChatFull chatFull2 = chatFull;
                    ab1 ab1Var2 = ab1Var;
                    if (intValue == 0) {
                        boolean[] zArr = new boolean[1];
                        long j10 = ta1Var.f37702a.f18268id;
                        long j11 = chatFull2.f18122id;
                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = tL_chatChannelParticipant3;
                        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant4.channelParticipant;
                        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = channelParticipant2.admin_rights;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = channelParticipant2.banned_rights;
                        String str2 = channelParticipant2.rank;
                        boolean z15 = z14;
                        ra1 ra1Var = new ra1(ta1Var, j10, j11, tL_chatAdminRights2, tL_chatBannedRights, str2, z15, zArr, ab1Var2);
                        ra1Var.X0 = new sa1(tL_chatChannelParticipant4, z15, zArr);
                        ab1Var2.presentFragment(ra1Var);
                    } else if (((Integer) arrayList5.get(i13)).intValue() == 2) {
                        ta1Var.b(ab1Var2);
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", chatFull2.f18122id);
                        bundle.putLong("search_from_user_id", ta1Var.f37702a.f18268id);
                        ab1Var2.presentFragment(new bo(bundle));
                    }
                }
            };
            org.telegram.ui.ActionBar.c2 c2Var4 = alertDialog$Builder.f18446a;
            c2Var4.P = charSequenceArr;
            c2Var4.Q = intArray;
            c2Var4.M = onClickListener;
            ab1Var.showDialog(c2Var4);
        }
    }
}
