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
public final class ya1 {
    public TLRPC.User f38957a;
    public String f38958b;

    public static TLRPC.User a(long j3, ArrayList arrayList) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TLRPC.User user = (TLRPC.User) obj;
            if (user.f17342id == j3) {
                return user;
            }
        }
        return null;
    }

    public final void b(org.telegram.ui.ActionBar.p2 p2Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.f38957a.f17342id);
        MessagesController.getInstance(UserConfig.selectedAccount).putUser(this.f38957a, false);
        p2Var.presentFragment(new ProfileActivity(bundle, null));
    }

    public final void c(final TLRPC.ChatFull chatFull, final fb1 fb1Var, final org.telegram.ui.ActionBar.d2[] d2VarArr, boolean z10) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant2;
        boolean z11;
        String str;
        int i10;
        int i11;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        boolean z12 = false;
        MessagesController.getInstance(UserConfig.selectedAccount).putUser(this.f38957a, false);
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
                if (j3 == this.f38957a.f17342id && (chatParticipant instanceof TLRPC.TL_chatChannelParticipant)) {
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
        org.telegram.ui.Cells.r6.n(R.drawable.msg_openprofile, 2, arrayList4, arrayList3);
        arrayList2.add(LocaleController.getString("StatisticSearchUserHistory", R.string.StatisticSearchUserHistory));
        boolean z13 = true;
        org.telegram.ui.Cells.r6.n(R.drawable.msg_msgbubble3, 1, arrayList4, arrayList3);
        if (z10 && tL_chatChannelParticipant == null) {
            if (d2VarArr[0] == null) {
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(fb1Var.getFragmentView().getContext(), 3, null);
                d2VarArr[0] = d2Var;
                d2Var.q(300L);
            }
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant.channel = MessagesController.getInstance(UserConfig.selectedAccount).getInputChannel(chatFull.f17196id);
            tL_channels_getParticipant.participant = MessagesController.getInputPeer(this.f38957a);
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_channels_getParticipant, new RequestDelegate(this) {
                public final ya1 f36893b;

                {
                    this.f36893b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r5) {
                        case 0:
                            final ya1 ya1Var = this.f36893b;
                            final fb1 fb1Var2 = fb1Var;
                            final org.telegram.ui.ActionBar.d2[] d2VarArr2 = d2VarArr;
                            final TLRPC.ChatFull chatFull2 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            fb1 fb1Var3 = fb1Var2;
                                            if (!fb1Var3.isFinishing() && fb1Var3.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.d2[] d2VarArr3 = d2VarArr2;
                                                if (d2VarArr3[0] != null) {
                                                    ya1 ya1Var2 = ya1Var;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull3 = chatFull2;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = ya1Var2.f38957a.f17342id;
                                                        chatFull3.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        ya1Var2.c(chatFull3, fb1Var3, d2VarArr3, true);
                                                        return;
                                                    }
                                                    ya1Var2.c(chatFull3, fb1Var3, d2VarArr3, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            fb1 fb1Var4 = fb1Var2;
                                            if (!fb1Var4.isFinishing() && fb1Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.d2[] d2VarArr4 = d2VarArr2;
                                                if (d2VarArr4[0] != null) {
                                                    ya1 ya1Var3 = ya1Var;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        ya1Var3.c(chatFull4, fb1Var4, d2VarArr4, true);
                                                        return;
                                                    }
                                                    ya1Var3.c(chatFull4, fb1Var4, d2VarArr4, false);
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
                            final ya1 ya1Var2 = this.f36893b;
                            final fb1 fb1Var3 = fb1Var;
                            final org.telegram.ui.ActionBar.d2[] d2VarArr3 = d2VarArr;
                            final TLRPC.ChatFull chatFull3 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            fb1 fb1Var32 = fb1Var3;
                                            if (!fb1Var32.isFinishing() && fb1Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.d2[] d2VarArr32 = d2VarArr3;
                                                if (d2VarArr32[0] != null) {
                                                    ya1 ya1Var22 = ya1Var2;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull3;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = ya1Var22.f38957a.f17342id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        ya1Var22.c(chatFull32, fb1Var32, d2VarArr32, true);
                                                        return;
                                                    }
                                                    ya1Var22.c(chatFull32, fb1Var32, d2VarArr32, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            fb1 fb1Var4 = fb1Var3;
                                            if (!fb1Var4.isFinishing() && fb1Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.d2[] d2VarArr4 = d2VarArr3;
                                                if (d2VarArr4[0] != null) {
                                                    ya1 ya1Var3 = ya1Var2;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull3;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        ya1Var3.c(chatFull4, fb1Var4, d2VarArr4, true);
                                                        return;
                                                    }
                                                    ya1Var3.c(chatFull4, fb1Var4, d2VarArr4, false);
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
            if (d2VarArr[0] == null) {
                org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(fb1Var.getFragmentView().getContext(), 3, null);
                d2VarArr[0] = d2Var2;
                d2Var2.q(300L);
            }
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant2.channel = MessagesController.getInstance(UserConfig.selectedAccount).getInputChannel(chatFull.f17196id);
            tL_channels_getParticipant2.participant = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(UserConfig.getInstance(UserConfig.selectedAccount).clientUserId);
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_channels_getParticipant2, new RequestDelegate(this) {
                public final ya1 f36893b;

                {
                    this.f36893b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r5) {
                        case 0:
                            final ya1 ya1Var = this.f36893b;
                            final fb1 fb1Var2 = fb1Var;
                            final org.telegram.ui.ActionBar.d2[] d2VarArr2 = d2VarArr;
                            final TLRPC.ChatFull chatFull2 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            fb1 fb1Var32 = fb1Var2;
                                            if (!fb1Var32.isFinishing() && fb1Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.d2[] d2VarArr32 = d2VarArr2;
                                                if (d2VarArr32[0] != null) {
                                                    ya1 ya1Var22 = ya1Var;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull2;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = ya1Var22.f38957a.f17342id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        ya1Var22.c(chatFull32, fb1Var32, d2VarArr32, true);
                                                        return;
                                                    }
                                                    ya1Var22.c(chatFull32, fb1Var32, d2VarArr32, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            fb1 fb1Var4 = fb1Var2;
                                            if (!fb1Var4.isFinishing() && fb1Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.d2[] d2VarArr4 = d2VarArr2;
                                                if (d2VarArr4[0] != null) {
                                                    ya1 ya1Var3 = ya1Var;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        ya1Var3.c(chatFull4, fb1Var4, d2VarArr4, true);
                                                        return;
                                                    }
                                                    ya1Var3.c(chatFull4, fb1Var4, d2VarArr4, false);
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
                            final ya1 ya1Var2 = this.f36893b;
                            final fb1 fb1Var3 = fb1Var;
                            final org.telegram.ui.ActionBar.d2[] d2VarArr3 = d2VarArr;
                            final TLRPC.ChatFull chatFull3 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            fb1 fb1Var32 = fb1Var3;
                                            if (!fb1Var32.isFinishing() && fb1Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.d2[] d2VarArr32 = d2VarArr3;
                                                if (d2VarArr32[0] != null) {
                                                    ya1 ya1Var22 = ya1Var2;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull3;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = ya1Var22.f38957a.f17342id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        ya1Var22.c(chatFull32, fb1Var32, d2VarArr32, true);
                                                        return;
                                                    }
                                                    ya1Var22.c(chatFull32, fb1Var32, d2VarArr32, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            fb1 fb1Var4 = fb1Var3;
                                            if (!fb1Var4.isFinishing() && fb1Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.d2[] d2VarArr4 = d2VarArr3;
                                                if (d2VarArr4[0] != null) {
                                                    ya1 ya1Var3 = ya1Var2;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull3;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        ya1Var3.c(chatFull4, fb1Var4, d2VarArr4, true);
                                                        return;
                                                    }
                                                    ya1Var3.c(chatFull4, fb1Var4, d2VarArr4, false);
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
                    org.telegram.ui.Cells.r6.n(i11, 0, arrayList4, arrayList3);
                    z12 = z13;
                }
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fb1Var.getParentActivity());
            CharSequence[] charSequenceArr = (CharSequence[]) arrayList2.toArray(new CharSequence[arrayList3.size()]);
            int[] intArray = AndroidUtilities.toIntArray(arrayList4);
            final boolean z14 = z12;
            final TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = tL_chatChannelParticipant;
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i13) {
                    ArrayList arrayList5 = arrayList3;
                    int intValue = ((Integer) arrayList5.get(i13)).intValue();
                    ya1 ya1Var = ya1.this;
                    TLRPC.ChatFull chatFull2 = chatFull;
                    fb1 fb1Var2 = fb1Var;
                    if (intValue == 0) {
                        boolean[] zArr = new boolean[1];
                        long j10 = ya1Var.f38957a.f17342id;
                        long j11 = chatFull2.f17196id;
                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = tL_chatChannelParticipant3;
                        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant4.channelParticipant;
                        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = channelParticipant2.admin_rights;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = channelParticipant2.banned_rights;
                        String str2 = channelParticipant2.rank;
                        boolean z15 = z14;
                        wa1 wa1Var = new wa1(ya1Var, j10, j11, tL_chatAdminRights2, tL_chatBannedRights, str2, z15, zArr, fb1Var2);
                        wa1Var.X0 = new xa1(tL_chatChannelParticipant4, z15, zArr);
                        fb1Var2.presentFragment(wa1Var);
                    } else if (((Integer) arrayList5.get(i13)).intValue() == 2) {
                        ya1Var.b(fb1Var2);
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", chatFull2.f17196id);
                        bundle.putLong("search_from_user_id", ya1Var.f38957a.f17342id);
                        fb1Var2.presentFragment(new eo(bundle));
                    }
                }
            };
            org.telegram.ui.ActionBar.d2 d2Var4 = alertDialog$Builder.f17528a;
            d2Var4.P = charSequenceArr;
            d2Var4.Q = intArray;
            d2Var4.M = onClickListener;
            fb1Var.showDialog(d2Var4);
        }
    }
}
