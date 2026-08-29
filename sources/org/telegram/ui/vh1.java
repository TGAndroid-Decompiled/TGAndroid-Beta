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
public final class vh1 implements org.telegram.ui.ActionBar.b2, yx {
    public final wh1 f43604a;

    public vh1(wh1 wh1Var) {
        this.f43604a = wh1Var;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean J(fy fyVar) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        int i11;
        String str;
        wh1 wh1Var = this.f43604a;
        WallpapersListActivity wallpapersListActivity = wh1Var.f44310a;
        Activity parentActivity = wallpapersListActivity.getParentActivity();
        LongSparseArray longSparseArray = wallpapersListActivity.f36374e0;
        org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(parentActivity, 3, null);
        wallpapersListActivity.L = c2Var2;
        c2Var2.f22783c0 = false;
        c2Var2.show();
        new ArrayList();
        int[] iArr = {0};
        for (int i12 = 0; i12 < longSparseArray.size(); i12++) {
            Object valueAt = longSparseArray.valueAt(i12);
            if (valueAt instanceof zh1) {
                zh1 zh1Var = (zh1) valueAt;
                TLRPC.WallPaper wallPaper = zh1Var.f45234l;
                if (wallPaper != null && wallPaper.f22544id < 0) {
                    wallpapersListActivity.getMessagesStorage().deleteWallpaper(zh1Var.f45234l.f22544id);
                    wallpapersListActivity.f36369b0.remove(zh1Var);
                    wallpapersListActivity.Z.remove(zh1Var.a());
                } else {
                    valueAt = wallPaper;
                }
            }
            if (valueAt instanceof TLRPC.WallPaper) {
                iArr[0] = iArr[0] + 1;
                TLRPC.WallPaper wallPaper2 = (TLRPC.WallPaper) valueAt;
                TL_account.saveWallPaper savewallpaper = new TL_account.saveWallPaper();
                savewallpaper.settings = new TLRPC.TL_wallPaperSettings();
                savewallpaper.unsave = true;
                if (valueAt instanceof TLRPC.TL_wallPaperNoFile) {
                    TLRPC.TL_inputWallPaperNoFile tL_inputWallPaperNoFile = new TLRPC.TL_inputWallPaperNoFile();
                    tL_inputWallPaperNoFile.f22465id = wallPaper2.f22544id;
                    savewallpaper.wallpaper = tL_inputWallPaperNoFile;
                } else {
                    TLRPC.TL_inputWallPaper tL_inputWallPaper = new TLRPC.TL_inputWallPaper();
                    tL_inputWallPaper.f22464id = wallPaper2.f22544id;
                    tL_inputWallPaper.access_hash = wallPaper2.access_hash;
                    savewallpaper.wallpaper = tL_inputWallPaper;
                }
                String str2 = wallPaper2.slug;
                if (str2 != null && str2.equals(wallpapersListActivity.O)) {
                    if (org.telegram.ui.ActionBar.g6.d1()) {
                        str = "t";
                    } else {
                        str = "d";
                    }
                    wallpapersListActivity.O = str;
                    org.telegram.ui.ActionBar.g6.I.v(null);
                    org.telegram.ui.ActionBar.g6.o1(true);
                }
                i11 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(savewallpaper, new qe1(3, wh1Var, iArr));
            }
        }
        if (iArr[0] == 0) {
            wallpapersListActivity.B0(true);
        }
        longSparseArray.clear();
        lVar = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).actionBar;
        lVar.r();
        lVar2 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).actionBar;
        lVar2.h(true);
    }

    @Override
    public boolean v(fy fyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ze1 ze1Var) {
        LongSparseArray longSparseArray;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        String b10;
        WallpapersListActivity wallpapersListActivity = this.f43604a.f44310a;
        StringBuilder sb2 = new StringBuilder();
        int i18 = 0;
        while (true) {
            longSparseArray = wallpapersListActivity.f36374e0;
            if (i18 >= longSparseArray.size()) {
                break;
            }
            Object valueAt = longSparseArray.valueAt(i18);
            if (valueAt instanceof TLRPC.TL_wallPaper) {
                b10 = AndroidUtilities.getWallPaperUrl(valueAt);
            } else if (valueAt instanceof zh1) {
                b10 = ((zh1) valueAt).b();
            } else {
                i18++;
            }
            if (!TextUtils.isEmpty(b10)) {
                if (sb2.length() > 0) {
                    sb2.append('\n');
                }
                sb2.append(b10);
            }
            i18++;
        }
        longSparseArray.clear();
        lVar = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).actionBar;
        lVar.r();
        lVar2 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).actionBar;
        lVar2.h(true);
        if (arrayList.size() <= 1) {
            long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            i14 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
            if (j10 != UserConfig.getInstance(i14).getClientUserId() && charSequence == null) {
                long j11 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle i19 = a4.w.i("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j11)) {
                    i19.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
                } else {
                    if (DialogObject.isUserDialog(j11)) {
                        i19.putLong("user_id", j11);
                    } else if (DialogObject.isChatDialog(j11)) {
                        i19.putLong("chat_id", -j11);
                    }
                    i15 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
                    if (!MessagesController.getInstance(i15).checkCanOpenChat(i19, fyVar)) {
                        return true;
                    }
                }
                i16 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                wallpapersListActivity.presentFragment(new tn(i19), true);
                i17 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
                SendMessagesHelper.getInstance(i17).sendMessage(SendMessagesHelper.SendMessageParams.of(sb2.toString(), j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
                return true;
            }
        }
        wallpapersListActivity.D0();
        for (int i20 = 0; i20 < arrayList.size(); i20++) {
            long j12 = ((MessagesStorage.TopicKey) arrayList.get(i20)).dialogId;
            if (charSequence != null) {
                i13 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
                SendMessagesHelper.getInstance(i13).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j12, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            if (!TextUtils.isEmpty(sb2)) {
                i12 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
                SendMessagesHelper.getInstance(i12).sendMessage(SendMessagesHelper.SendMessageParams.of(sb2.toString(), j12, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
        }
        fyVar.finishFragment();
        return true;
    }
}
