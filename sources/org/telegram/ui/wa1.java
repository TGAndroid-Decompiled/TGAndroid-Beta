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
public final class wa1 {
    public TLRPC.User f43117a;
    public String f43118b;

    public static TLRPC.User a(long j3, ArrayList arrayList) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TLRPC.User user = (TLRPC.User) obj;
            if (user.f19950id == j3) {
                return user;
            }
        }
        return null;
    }

    public final void b(org.telegram.ui.ActionBar.m2 m2Var) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.f43117a.f19950id);
        MessagesController.getInstance(UserConfig.selectedAccount).putUser(this.f43117a, false);
        m2Var.presentFragment(new ProfileActivity(bundle, null));
    }

    public final void c(final TLRPC.ChatFull chatFull, final db1 db1Var, final org.telegram.ui.ActionBar.a2[] a2VarArr, boolean z10) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant2;
        boolean z11;
        String str;
        int i10;
        int i11;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        boolean z12 = false;
        MessagesController.getInstance(UserConfig.selectedAccount).putUser(this.f43117a, false);
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
                if (j3 == this.f43117a.f19950id && (chatParticipant instanceof TLRPC.TL_chatChannelParticipant)) {
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
        org.telegram.ui.Cells.c1.k(R.drawable.msg_openprofile, 2, arrayList4, arrayList3);
        arrayList2.add(LocaleController.getString("StatisticSearchUserHistory", R.string.StatisticSearchUserHistory));
        boolean z13 = true;
        org.telegram.ui.Cells.c1.k(R.drawable.msg_msgbubble3, 1, arrayList4, arrayList3);
        if (z10 && tL_chatChannelParticipant == null) {
            if (a2VarArr[0] == null) {
                org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(db1Var.getFragmentView().getContext(), 3, null);
                a2VarArr[0] = a2Var;
                a2Var.q(300L);
            }
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant.channel = MessagesController.getInstance(UserConfig.selectedAccount).getInputChannel(chatFull.f19804id);
            tL_channels_getParticipant.participant = MessagesController.getInputPeer(this.f43117a);
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_channels_getParticipant, new RequestDelegate(this) {
                public final wa1 f41593b;

                {
                    this.f41593b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r5) {
                        case 0:
                            final wa1 wa1Var = this.f41593b;
                            final db1 db1Var2 = db1Var;
                            final org.telegram.ui.ActionBar.a2[] a2VarArr2 = a2VarArr;
                            final TLRPC.ChatFull chatFull2 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            db1 db1Var3 = db1Var2;
                                            if (!db1Var3.isFinishing() && db1Var3.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.a2[] a2VarArr3 = a2VarArr2;
                                                if (a2VarArr3[0] != null) {
                                                    wa1 wa1Var2 = wa1Var;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull3 = chatFull2;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = wa1Var2.f43117a.f19950id;
                                                        chatFull3.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        wa1Var2.c(chatFull3, db1Var3, a2VarArr3, true);
                                                        return;
                                                    }
                                                    wa1Var2.c(chatFull3, db1Var3, a2VarArr3, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            db1 db1Var4 = db1Var2;
                                            if (!db1Var4.isFinishing() && db1Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.a2[] a2VarArr4 = a2VarArr2;
                                                if (a2VarArr4[0] != null) {
                                                    wa1 wa1Var3 = wa1Var;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        wa1Var3.c(chatFull4, db1Var4, a2VarArr4, true);
                                                        return;
                                                    }
                                                    wa1Var3.c(chatFull4, db1Var4, a2VarArr4, false);
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
                            final wa1 wa1Var2 = this.f41593b;
                            final db1 db1Var3 = db1Var;
                            final org.telegram.ui.ActionBar.a2[] a2VarArr3 = a2VarArr;
                            final TLRPC.ChatFull chatFull3 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            db1 db1Var32 = db1Var3;
                                            if (!db1Var32.isFinishing() && db1Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.a2[] a2VarArr32 = a2VarArr3;
                                                if (a2VarArr32[0] != null) {
                                                    wa1 wa1Var22 = wa1Var2;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull3;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = wa1Var22.f43117a.f19950id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        wa1Var22.c(chatFull32, db1Var32, a2VarArr32, true);
                                                        return;
                                                    }
                                                    wa1Var22.c(chatFull32, db1Var32, a2VarArr32, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            db1 db1Var4 = db1Var3;
                                            if (!db1Var4.isFinishing() && db1Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.a2[] a2VarArr4 = a2VarArr3;
                                                if (a2VarArr4[0] != null) {
                                                    wa1 wa1Var3 = wa1Var2;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull3;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        wa1Var3.c(chatFull4, db1Var4, a2VarArr4, true);
                                                        return;
                                                    }
                                                    wa1Var3.c(chatFull4, db1Var4, a2VarArr4, false);
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
            if (a2VarArr[0] == null) {
                org.telegram.ui.ActionBar.a2 a2Var2 = new org.telegram.ui.ActionBar.a2(db1Var.getFragmentView().getContext(), 3, null);
                a2VarArr[0] = a2Var2;
                a2Var2.q(300L);
            }
            TLRPC.TL_channels_getParticipant tL_channels_getParticipant2 = new TLRPC.TL_channels_getParticipant();
            tL_channels_getParticipant2.channel = MessagesController.getInstance(UserConfig.selectedAccount).getInputChannel(chatFull.f19804id);
            tL_channels_getParticipant2.participant = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(UserConfig.getInstance(UserConfig.selectedAccount).clientUserId);
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_channels_getParticipant2, new RequestDelegate(this) {
                public final wa1 f41593b;

                {
                    this.f41593b = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (r5) {
                        case 0:
                            final wa1 wa1Var = this.f41593b;
                            final db1 db1Var2 = db1Var;
                            final org.telegram.ui.ActionBar.a2[] a2VarArr2 = a2VarArr;
                            final TLRPC.ChatFull chatFull2 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            db1 db1Var32 = db1Var2;
                                            if (!db1Var32.isFinishing() && db1Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.a2[] a2VarArr32 = a2VarArr2;
                                                if (a2VarArr32[0] != null) {
                                                    wa1 wa1Var22 = wa1Var;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull2;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = wa1Var22.f43117a.f19950id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        wa1Var22.c(chatFull32, db1Var32, a2VarArr32, true);
                                                        return;
                                                    }
                                                    wa1Var22.c(chatFull32, db1Var32, a2VarArr32, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            db1 db1Var4 = db1Var2;
                                            if (!db1Var4.isFinishing() && db1Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.a2[] a2VarArr4 = a2VarArr2;
                                                if (a2VarArr4[0] != null) {
                                                    wa1 wa1Var3 = wa1Var;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull2;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        wa1Var3.c(chatFull4, db1Var4, a2VarArr4, true);
                                                        return;
                                                    }
                                                    wa1Var3.c(chatFull4, db1Var4, a2VarArr4, false);
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
                            final wa1 wa1Var2 = this.f41593b;
                            final db1 db1Var3 = db1Var;
                            final org.telegram.ui.ActionBar.a2[] a2VarArr3 = a2VarArr;
                            final TLRPC.ChatFull chatFull3 = chatFull;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r7) {
                                        case 0:
                                            db1 db1Var32 = db1Var3;
                                            if (!db1Var32.isFinishing() && db1Var32.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.a2[] a2VarArr32 = a2VarArr3;
                                                if (a2VarArr32[0] != null) {
                                                    wa1 wa1Var22 = wa1Var2;
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    TLRPC.ChatFull chatFull32 = chatFull3;
                                                    if (tL_error2 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant3.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant3.user_id = wa1Var22.f43117a.f19950id;
                                                        chatFull32.participants.participants.add(0, tL_chatChannelParticipant3);
                                                        wa1Var22.c(chatFull32, db1Var32, a2VarArr32, true);
                                                        return;
                                                    }
                                                    wa1Var22.c(chatFull32, db1Var32, a2VarArr32, false);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            db1 db1Var4 = db1Var3;
                                            if (!db1Var4.isFinishing() && db1Var4.getFragmentView() != null) {
                                                org.telegram.ui.ActionBar.a2[] a2VarArr4 = a2VarArr3;
                                                if (a2VarArr4[0] != null) {
                                                    wa1 wa1Var3 = wa1Var2;
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    TLRPC.ChatFull chatFull4 = chatFull3;
                                                    if (tL_error3 == null) {
                                                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = new TLRPC.TL_chatChannelParticipant();
                                                        tL_chatChannelParticipant4.channelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                                                        tL_chatChannelParticipant4.user_id = UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                                                        chatFull4.participants.participants.add(0, tL_chatChannelParticipant4);
                                                        wa1Var3.c(chatFull4, db1Var4, a2VarArr4, true);
                                                        return;
                                                    }
                                                    wa1Var3.c(chatFull4, db1Var4, a2VarArr4, false);
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
            org.telegram.ui.ActionBar.a2 a2Var3 = a2VarArr[0];
            if (a2Var3 != null) {
                a2Var3.dismiss();
                a2VarArr[0] = null;
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
                    org.telegram.ui.Cells.c1.k(i11, 0, arrayList4, arrayList3);
                    z12 = z13;
                }
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(db1Var.getParentActivity());
            CharSequence[] charSequenceArr = (CharSequence[]) arrayList2.toArray(new CharSequence[arrayList3.size()]);
            int[] intArray = AndroidUtilities.toIntArray(arrayList4);
            final boolean z14 = z12;
            final TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant3 = tL_chatChannelParticipant;
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i13) {
                    ArrayList arrayList5 = arrayList3;
                    int intValue = ((Integer) arrayList5.get(i13)).intValue();
                    wa1 wa1Var = wa1.this;
                    TLRPC.ChatFull chatFull2 = chatFull;
                    db1 db1Var2 = db1Var;
                    if (intValue == 0) {
                        boolean[] zArr = new boolean[1];
                        long j10 = wa1Var.f43117a.f19950id;
                        long j11 = chatFull2.f19804id;
                        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant4 = tL_chatChannelParticipant3;
                        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant4.channelParticipant;
                        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = channelParticipant2.admin_rights;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = channelParticipant2.banned_rights;
                        String str2 = channelParticipant2.rank;
                        boolean z15 = z14;
                        ua1 ua1Var = new ua1(wa1Var, j10, j11, tL_chatAdminRights2, tL_chatBannedRights, str2, z15, zArr, db1Var2);
                        ua1Var.X0 = new va1(tL_chatChannelParticipant4, z15, zArr);
                        db1Var2.presentFragment(ua1Var);
                    } else if (((Integer) arrayList5.get(i13)).intValue() == 2) {
                        wa1Var.b(db1Var2);
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", chatFull2.f19804id);
                        bundle.putLong("search_from_user_id", wa1Var.f43117a.f19950id);
                        db1Var2.presentFragment(new eo(bundle));
                    }
                }
            };
            org.telegram.ui.ActionBar.a2 a2Var4 = alertDialog$Builder.f20142a;
            a2Var4.P = charSequenceArr;
            a2Var4.Q = intArray;
            a2Var4.M = onClickListener;
            db1Var.showDialog(a2Var4);
        }
    }
}
