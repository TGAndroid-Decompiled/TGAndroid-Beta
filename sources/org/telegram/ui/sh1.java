package org.telegram.ui;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

public final class sh1 implements org.telegram.ui.ActionBar.a2, zx {

    public final th1 f42652a;

    public sh1(th1 th1Var) {
        this.f42652a = th1Var;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean K(gy gyVar) {
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        th1 th1Var = this.f42652a;
        WallpapersListActivity wallpapersListActivity = th1Var.f42949a;
        Activity parentActivity = wallpapersListActivity.getParentActivity();
        LongSparseArray longSparseArray = wallpapersListActivity.f36312e0;
        org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(parentActivity, 3, null);
        wallpapersListActivity.L = b2Var2;
        b2Var2.f22747c0 = false;
        b2Var2.show();
        new ArrayList();
        int[] iArr = {0};
        for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
            Object objValueAt = longSparseArray.valueAt(i11);
            if (objValueAt instanceof wh1) {
                wh1 wh1Var = (wh1) objValueAt;
                TLRPC.WallPaper wallPaper = wh1Var.f44129l;
                if (wallPaper == null || wallPaper.f22532id >= 0) {
                    objValueAt = wallPaper;
                } else {
                    wallpapersListActivity.getMessagesStorage().deleteWallpaper(wh1Var.f44129l.f22532id);
                    wallpapersListActivity.f36307b0.remove(wh1Var);
                    wallpapersListActivity.Z.remove(wh1Var.a());
                }
            }
            if (objValueAt instanceof TLRPC.WallPaper) {
                iArr[0] = iArr[0] + 1;
                TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) objValueAt;
                TL_account.saveWallPaper savewallpaper = new TL_account.saveWallPaper();
                savewallpaper.settings = new TLRPC.TL_wallPaperSettings();
                savewallpaper.unsave = true;
                if (objValueAt instanceof TLRPC.TL_wallPaperNoFile) {
                    TLRPC.TL_inputWallPaperNoFile tL_inputWallPaperNoFile = new TLRPC.TL_inputWallPaperNoFile();
                    tL_inputWallPaperNoFile.f22453id = wallPaper2.f22532id;
                    savewallpaper.wallpaper = tL_inputWallPaperNoFile;
                } else {
                    TLRPC.TL_inputWallPaper tL_inputWallPaper = new TLRPC.TL_inputWallPaper();
                    tL_inputWallPaper.f22452id = wallPaper2.f22532id;
                    tL_inputWallPaper.access_hash = wallPaper2.access_hash;
                    savewallpaper.wallpaper = tL_inputWallPaper;
                }
                String str = wallPaper2.slug;
                if (str != null && str.equals(wallpapersListActivity.O)) {
                    wallpapersListActivity.O = org.telegram.ui.ActionBar.g6.d1() ? "t" : "d";
                    org.telegram.ui.ActionBar.g6.I.v(null);
                    org.telegram.ui.ActionBar.g6.o1(true);
                }
                ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount).sendRequest(savewallpaper, new rc1(4, th1Var, iArr));
            }
        }
        if (iArr[0] == 0) {
            wallpapersListActivity.B0(true);
        }
        longSparseArray.clear();
        ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).actionBar.s();
        ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).actionBar.h(true);
    }

    @Override
    public boolean w(gy gyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, we1 we1Var) {
        LongSparseArray longSparseArray;
        String strB;
        WallpapersListActivity wallpapersListActivity = this.f42652a.f42949a;
        StringBuilder sb2 = new StringBuilder();
        int i12 = 0;
        while (true) {
            longSparseArray = wallpapersListActivity.f36312e0;
            if (i12 >= longSparseArray.size()) {
                break;
            }
            Object objValueAt = longSparseArray.valueAt(i12);
            if (objValueAt instanceof TLRPC.TL_wallPaper) {
                strB = AndroidUtilities.getWallPaperUrl(objValueAt);
            } else {
                if (objValueAt instanceof wh1) {
                    strB = ((wh1) objValueAt).b();
                }
                i12++;
            }
            if (!TextUtils.isEmpty(strB)) {
                if (sb2.length() > 0) {
                    sb2.append('\n');
                }
                sb2.append(strB);
            }
            i12++;
        }
        longSparseArray.clear();
        ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).actionBar.s();
        ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).actionBar.h(true);
        if (arrayList.size() > 1 || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId == UserConfig.getInstance(((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount).getClientUserId() || charSequence != null) {
            wallpapersListActivity.D0();
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                long j10 = ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId;
                if (charSequence != null) {
                    SendMessagesHelper.getInstance(((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                if (!TextUtils.isEmpty(sb2)) {
                    SendMessagesHelper.getInstance(((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(sb2.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
            }
            gyVar.finishFragment();
            return true;
        }
        long j11 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Bundle bundleH = a9.p.h("scrollToTopOnResume", true);
        if (DialogObject.isEncryptedDialog(j11)) {
            bundleH.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
        } else {
            if (DialogObject.isUserDialog(j11)) {
                bundleH.putLong("user_id", j11);
            } else if (DialogObject.isChatDialog(j11)) {
                bundleH.putLong("chat_id", -j11);
            }
            if (!MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount).checkCanOpenChat(bundleH, gyVar)) {
                return true;
            }
        }
        NotificationCenter.getInstance(((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        wallpapersListActivity.presentFragment(new rn(bundleH), true);
        SendMessagesHelper.getInstance(((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(sb2.toString(), j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
        return true;
    }
}
