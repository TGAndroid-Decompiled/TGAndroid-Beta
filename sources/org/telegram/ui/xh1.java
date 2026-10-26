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
public final class xh1 implements org.telegram.ui.ActionBar.b2, ux {
    public final yh1 f45777a;

    public xh1(yh1 yh1Var) {
        this.f45777a = yh1Var;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean K(cy cyVar) {
        return false;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        org.telegram.ui.ActionBar.r5 r5Var;
        org.telegram.ui.ActionBar.r5 r5Var2;
        int i11;
        String str;
        yh1 yh1Var = this.f45777a;
        WallpapersListActivity wallpapersListActivity = yh1Var.f46071a;
        Activity parentActivity = wallpapersListActivity.getParentActivity();
        LongSparseArray longSparseArray = wallpapersListActivity.f37594e0;
        org.telegram.ui.ActionBar.e2 e2Var2 = new org.telegram.ui.ActionBar.e2(parentActivity, 3, null);
        wallpapersListActivity.L = e2Var2;
        e2Var2.f22575i0 = false;
        e2Var2.show();
        new ArrayList();
        int[] iArr = {0};
        for (int i12 = 0; i12 < longSparseArray.size(); i12++) {
            Object valueAt = longSparseArray.valueAt(i12);
            if (valueAt instanceof bi1) {
                bi1 bi1Var = (bi1) valueAt;
                TLRPC.WallPaper wallPaper = bi1Var.f38111l;
                if (wallPaper != null && wallPaper.f22181id < 0) {
                    wallpapersListActivity.getMessagesStorage().deleteWallpaper(bi1Var.f38111l.f22181id);
                    wallpapersListActivity.f37590b0.remove(bi1Var);
                    wallpapersListActivity.Z.remove(bi1Var.a());
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
                    tL_inputWallPaperNoFile.f22100id = wallPaper2.f22181id;
                    savewallpaper.wallpaper = tL_inputWallPaperNoFile;
                } else {
                    TLRPC.TL_inputWallPaper tL_inputWallPaper = new TLRPC.TL_inputWallPaper();
                    tL_inputWallPaper.f22099id = wallPaper2.f22181id;
                    tL_inputWallPaper.access_hash = wallPaper2.access_hash;
                    savewallpaper.wallpaper = tL_inputWallPaper;
                }
                String str2 = wallPaper2.slug;
                if (str2 != null && str2.equals(wallpapersListActivity.O)) {
                    if (org.telegram.ui.ActionBar.y6.f1()) {
                        str = "t";
                    } else {
                        str = "d";
                    }
                    wallpapersListActivity.O = str;
                    org.telegram.ui.ActionBar.y6.I.v(null);
                    org.telegram.ui.ActionBar.y6.r1(true);
                }
                i11 = ((org.telegram.ui.ActionBar.r2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(savewallpaper, new l71(9, yh1Var, iArr));
            }
        }
        if (iArr[0] == 0) {
            wallpapersListActivity.C0(true);
        }
        longSparseArray.clear();
        r5Var = ((org.telegram.ui.ActionBar.r2) wallpapersListActivity).simpleActionBar;
        r5Var.n();
        r5Var2 = ((org.telegram.ui.ActionBar.r2) wallpapersListActivity).simpleActionBar;
        r5Var2.f(true);
    }

    @Override
    public boolean v(cy cyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, af1 af1Var) {
        LongSparseArray longSparseArray;
        org.telegram.ui.ActionBar.r5 r5Var;
        org.telegram.ui.ActionBar.r5 r5Var2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        String b10;
        WallpapersListActivity wallpapersListActivity = this.f45777a.f46071a;
        StringBuilder sb2 = new StringBuilder();
        int i18 = 0;
        while (true) {
            longSparseArray = wallpapersListActivity.f37594e0;
            if (i18 >= longSparseArray.size()) {
                break;
            }
            Object valueAt = longSparseArray.valueAt(i18);
            if (valueAt instanceof TLRPC.TL_wallPaper) {
                b10 = AndroidUtilities.getWallPaperUrl(valueAt);
            } else if (valueAt instanceof bi1) {
                b10 = ((bi1) valueAt).b();
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
        r5Var = ((org.telegram.ui.ActionBar.r2) wallpapersListActivity).simpleActionBar;
        r5Var.n();
        r5Var2 = ((org.telegram.ui.ActionBar.r2) wallpapersListActivity).simpleActionBar;
        r5Var2.f(true);
        if (arrayList.size() <= 1) {
            long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            i14 = ((org.telegram.ui.ActionBar.r2) wallpapersListActivity).currentAccount;
            if (j10 != UserConfig.getInstance(i14).getClientUserId() && charSequence == null) {
                long j11 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle i19 = a1.g.i("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j11)) {
                    i19.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
                } else {
                    if (DialogObject.isUserDialog(j11)) {
                        i19.putLong("user_id", j11);
                    } else if (DialogObject.isChatDialog(j11)) {
                        i19.putLong("chat_id", -j11);
                    }
                    i15 = ((org.telegram.ui.ActionBar.r2) wallpapersListActivity).currentAccount;
                    if (!MessagesController.getInstance(i15).checkCanOpenChat(i19, cyVar)) {
                        return true;
                    }
                }
                i16 = ((org.telegram.ui.ActionBar.r2) wallpapersListActivity).currentAccount;
                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                wallpapersListActivity.presentFragment(new un(i19), true);
                i17 = ((org.telegram.ui.ActionBar.r2) wallpapersListActivity).currentAccount;
                SendMessagesHelper.getInstance(i17).sendMessage(SendMessagesHelper.SendMessageParams.of(sb2.toString(), j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
                return true;
            }
        }
        wallpapersListActivity.E0();
        for (int i20 = 0; i20 < arrayList.size(); i20++) {
            long j12 = ((MessagesStorage.TopicKey) arrayList.get(i20)).dialogId;
            if (charSequence != null) {
                i13 = ((org.telegram.ui.ActionBar.r2) wallpapersListActivity).currentAccount;
                SendMessagesHelper.getInstance(i13).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j12, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            if (!TextUtils.isEmpty(sb2)) {
                i12 = ((org.telegram.ui.ActionBar.r2) wallpapersListActivity).currentAccount;
                SendMessagesHelper.getInstance(i12).sendMessage(SendMessagesHelper.SendMessageParams.of(sb2.toString(), j12, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
        }
        cyVar.finishFragment();
        return true;
    }
}
