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
public final class ua1 {
    public TLRPC.User f41013a;
    public String f41014b;

    public static TLRPC.User a(long j3, ArrayList arrayList) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TLRPC.User user = (TLRPC.User) obj;
            if (user.f20016id == j3) {
                return user;
            }
        }
        return null;
    }

    public final void b(org.telegram.ui.ActionBar.n2 n2Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.f41013a.f20016id);
        MessagesController.getInstance(UserConfig.selectedAccount).putUser(this.f41013a, false);
        n2Var.presentFragment(new ProfileActivity(bundle, null));
    }

    public final void c(final TLRPC.ChatFull chatFull, final bb1 bb1Var, final org.telegram.ui.ActionBar.b2[] b2VarArr, boolean z10) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant2;
        boolean z11;
        String str;
        int i10;
        int i11;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        boolean z12 = false;
        MessagesController.getInstance(UserConfig.selectedAccount).putUser(this.f41013a, false);
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
                if (j3 == this.f41013a.f20016id && (chatParticipant instanceof TLRPC.TL_chatChannelParticipant)) {
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
            if (b2VarArr[0] == null) {
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(bb1Var.getFragmentView().getContext(), 3, null);
                b2VarArr[0] = b2Var;
                b2Var.q(300L);
            }
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant.channel = MessagesController.getInstance(UserConfig.selectedAccount).getInputChannel(chatFull.f19870id);
            tL_channels_getParticipant.participant = MessagesController.getInputPeer(this.f41013a);
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_channels_getParticipant, new RequestDelegate(this) {
                public final ua1 f39457b;

                {
                    this.f39457b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r5) {
                        case 0:
                            final ua1 ua1Var = this.f39457b;
                            final bb1 bb1Var2 = bb1Var;
                            final org.telegram.ui.ActionBar.b2[] b2VarArr2 = b2VarArr;
                            final TLRPC.ChatFull chatFull2 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            bb1 bb1Var3 = bb1Var2;
                                            if (!bb1Var3.isFinishing() && bb1Var3.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.b2[] b2VarArr3 = b2VarArr2;
                                                if (b2VarArr3[0] != null) {
                                                    ua1 ua1Var2 = ua1Var;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull3 = chatFull2;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = ua1Var2.f41013a.f20016id;
                                                        chatFull3.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        ua1Var2.c(chatFull3, bb1Var3, b2VarArr3, true);
                                                        return;
                                                    }
                                                    ua1Var2.c(chatFull3, bb1Var3, b2VarArr3, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            bb1 bb1Var4 = bb1Var2;
                                            if (!bb1Var4.isFinishing() && bb1Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.b2[] b2VarArr4 = b2VarArr2;
                                                if (b2VarArr4[0] != null) {
                                                    ua1 ua1Var3 = ua1Var;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        ua1Var3.c(chatFull4, bb1Var4, b2VarArr4, true);
                                                        return;
                                                    }
                                                    ua1Var3.c(chatFull4, bb1Var4, b2VarArr4, false);
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
                            final ua1 ua1Var2 = this.f39457b;
                            final bb1 bb1Var3 = bb1Var;
                            final org.telegram.ui.ActionBar.b2[] b2VarArr3 = b2VarArr;
                            final TLRPC.ChatFull chatFull3 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            bb1 bb1Var32 = bb1Var3;
                                            if (!bb1Var32.isFinishing() && bb1Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.b2[] b2VarArr32 = b2VarArr3;
                                                if (b2VarArr32[0] != null) {
                                                    ua1 ua1Var22 = ua1Var2;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull3;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = ua1Var22.f41013a.f20016id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        ua1Var22.c(chatFull32, bb1Var32, b2VarArr32, true);
                                                        return;
                                                    }
                                                    ua1Var22.c(chatFull32, bb1Var32, b2VarArr32, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            bb1 bb1Var4 = bb1Var3;
                                            if (!bb1Var4.isFinishing() && bb1Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.b2[] b2VarArr4 = b2VarArr3;
                                                if (b2VarArr4[0] != null) {
                                                    ua1 ua1Var3 = ua1Var2;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull3;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        ua1Var3.c(chatFull4, bb1Var4, b2VarArr4, true);
                                                        return;
                                                    }
                                                    ua1Var3.c(chatFull4, bb1Var4, b2VarArr4, false);
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
            if (b2VarArr[0] == null) {
                org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(bb1Var.getFragmentView().getContext(), 3, null);
                b2VarArr[0] = b2Var2;
                b2Var2.q(300L);
            }
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant2.channel = MessagesController.getInstance(UserConfig.selectedAccount).getInputChannel(chatFull.f19870id);
            tL_channels_getParticipant2.participant = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(UserConfig.getInstance(UserConfig.selectedAccount).clientUserId);
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_channels_getParticipant2, new RequestDelegate(this) {
                public final ua1 f39457b;

                {
                    this.f39457b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r5) {
                        case 0:
                            final ua1 ua1Var = this.f39457b;
                            final bb1 bb1Var2 = bb1Var;
                            final org.telegram.ui.ActionBar.b2[] b2VarArr2 = b2VarArr;
                            final TLRPC.ChatFull chatFull2 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            bb1 bb1Var32 = bb1Var2;
                                            if (!bb1Var32.isFinishing() && bb1Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.b2[] b2VarArr32 = b2VarArr2;
                                                if (b2VarArr32[0] != null) {
                                                    ua1 ua1Var22 = ua1Var;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull2;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = ua1Var22.f41013a.f20016id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        ua1Var22.c(chatFull32, bb1Var32, b2VarArr32, true);
                                                        return;
                                                    }
                                                    ua1Var22.c(chatFull32, bb1Var32, b2VarArr32, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            bb1 bb1Var4 = bb1Var2;
                                            if (!bb1Var4.isFinishing() && bb1Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.b2[] b2VarArr4 = b2VarArr2;
                                                if (b2VarArr4[0] != null) {
                                                    ua1 ua1Var3 = ua1Var;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        ua1Var3.c(chatFull4, bb1Var4, b2VarArr4, true);
                                                        return;
                                                    }
                                                    ua1Var3.c(chatFull4, bb1Var4, b2VarArr4, false);
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
                            final ua1 ua1Var2 = this.f39457b;
                            final bb1 bb1Var3 = bb1Var;
                            final org.telegram.ui.ActionBar.b2[] b2VarArr3 = b2VarArr;
                            final TLRPC.ChatFull chatFull3 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            bb1 bb1Var32 = bb1Var3;
                                            if (!bb1Var32.isFinishing() && bb1Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.b2[] b2VarArr32 = b2VarArr3;
                                                if (b2VarArr32[0] != null) {
                                                    ua1 ua1Var22 = ua1Var2;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull3;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = ua1Var22.f41013a.f20016id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        ua1Var22.c(chatFull32, bb1Var32, b2VarArr32, true);
                                                        return;
                                                    }
                                                    ua1Var22.c(chatFull32, bb1Var32, b2VarArr32, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            bb1 bb1Var4 = bb1Var3;
                                            if (!bb1Var4.isFinishing() && bb1Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.b2[] b2VarArr4 = b2VarArr3;
                                                if (b2VarArr4[0] != null) {
                                                    ua1 ua1Var3 = ua1Var2;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull3;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        ua1Var3.c(chatFull4, bb1Var4, b2VarArr4, true);
                                                        return;
                                                    }
                                                    ua1Var3.c(chatFull4, bb1Var4, b2VarArr4, false);
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
            org.telegram.ui.ActionBar.b2 b2Var3 = b2VarArr[0];
            if (b2Var3 != null) {
                b2Var3.dismiss();
                b2VarArr[0] = null;
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
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bb1Var.getParentActivity());
            CharSequence[] charSequenceArr = (CharSequence[]) arrayList2.toArray(new CharSequence[arrayList3.size()]);
            int[] intArray = AndroidUtilities.toIntArray(arrayList4);
            final boolean z14 = z12;
            final TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = tL_chatChannelParticipant;
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i13) {
                    ArrayList arrayList5 = arrayList3;
                    int intValue = ((Integer) arrayList5.get(i13)).intValue();
                    ua1 ua1Var = ua1.this;
                    TLRPC.ChatFull chatFull2 = chatFull;
                    bb1 bb1Var2 = bb1Var;
                    if (intValue == 0) {
                        boolean[] zArr = new boolean[1];
                        long j10 = ua1Var.f41013a.f20016id;
                        long j11 = chatFull2.f19870id;
                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = tL_chatChannelParticipant3;
                        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant4.channelParticipant;
                        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = channelParticipant2.admin_rights;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = channelParticipant2.banned_rights;
                        String str2 = channelParticipant2.rank;
                        boolean z15 = z14;
                        sa1 sa1Var = new sa1(ua1Var, j10, j11, tL_chatAdminRights2, tL_chatBannedRights, str2, z15, zArr, bb1Var2);
                        sa1Var.X0 = new ta1(tL_chatChannelParticipant4, z15, zArr);
                        bb1Var2.presentFragment(sa1Var);
                    } else if (((Integer) arrayList5.get(i13)).intValue() == 2) {
                        ua1Var.b(bb1Var2);
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", chatFull2.f19870id);
                        bundle.putLong("search_from_user_id", ua1Var.f41013a.f20016id);
                        bb1Var2.presentFragment(new co(bundle));
                    }
                }
            };
            org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder.f20198a;
            b2Var4.P = charSequenceArr;
            b2Var4.Q = intArray;
            b2Var4.M = onClickListener;
            bb1Var.showDialog(b2Var4);
        }
    }
}
