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
public final class th1 implements org.telegram.ui.ActionBar.b2, wx {
    public final uh1 f43008a;

    public th1(uh1 uh1Var) {
        this.f43008a = uh1Var;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean I(dy dyVar) {
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int i10;
        String str;
        uh1 uh1Var = this.f43008a;
        WallpapersListActivity wallpapersListActivity = uh1Var.f43260a;
        Activity parentActivity = wallpapersListActivity.getParentActivity();
        LongSparseArray longSparseArray = wallpapersListActivity.f36309e0;
        org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(parentActivity, 3, null);
        wallpapersListActivity.L = c2Var2;
        c2Var2.f22766c0 = false;
        c2Var2.show();
        new ArrayList();
        int[] iArr = {0};
        for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
            Object valueAt = longSparseArray.valueAt(i11);
            if (valueAt instanceof xh1) {
                xh1 xh1Var = (xh1) valueAt;
                TLRPC.WallPaper wallPaper = xh1Var.f44529l;
                if (wallPaper != null && wallPaper.f22532id < 0) {
                    wallpapersListActivity.getMessagesStorage().deleteWallpaper(xh1Var.f44529l.f22532id);
                    wallpapersListActivity.f36304b0.remove(xh1Var);
                    wallpapersListActivity.Z.remove(xh1Var.a());
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
                    tL_inputWallPaperNoFile.f22453id = wallPaper2.f22532id;
                    savewallpaper.wallpaper = tL_inputWallPaperNoFile;
                } else {
                    TLRPC.TL_inputWallPaper tL_inputWallPaper = new TLRPC.TL_inputWallPaper();
                    tL_inputWallPaper.f22452id = wallPaper2.f22532id;
                    tL_inputWallPaper.access_hash = wallPaper2.access_hash;
                    savewallpaper.wallpaper = tL_inputWallPaper;
                }
                String str2 = wallPaper2.slug;
                if (str2 != null && str2.equals(wallpapersListActivity.O)) {
                    if (org.telegram.ui.ActionBar.f6.d1()) {
                        str = "t";
                    } else {
                        str = "d";
                    }
                    wallpapersListActivity.O = str;
                    org.telegram.ui.ActionBar.f6.I.v(null);
                    org.telegram.ui.ActionBar.f6.o1(true);
                }
                i10 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i10).sendRequest(savewallpaper, new o71(7, uh1Var, iArr));
            }
        }
        if (iArr[0] == 0) {
            wallpapersListActivity.A0(true);
        }
        longSparseArray.clear();
        kVar = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).actionBar;
        kVar.r();
        kVar2 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).actionBar;
        kVar2.h(true);
    }

    @Override
    public boolean v(dy dyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i9, int i10, we1 we1Var) {
        LongSparseArray longSparseArray;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        String b10;
        WallpapersListActivity wallpapersListActivity = this.f43008a.f43260a;
        StringBuilder sb2 = new StringBuilder();
        int i17 = 0;
        while (true) {
            longSparseArray = wallpapersListActivity.f36309e0;
            if (i17 >= longSparseArray.size()) {
                break;
            }
            Object valueAt = longSparseArray.valueAt(i17);
            if (valueAt instanceof TLRPC.TL_wallPaper) {
                b10 = AndroidUtilities.getWallPaperUrl(valueAt);
            } else if (valueAt instanceof xh1) {
                b10 = ((xh1) valueAt).b();
            } else {
                i17++;
            }
            if (!TextUtils.isEmpty(b10)) {
                if (sb2.length() > 0) {
                    sb2.append('\n');
                }
                sb2.append(b10);
            }
            i17++;
        }
        longSparseArray.clear();
        kVar = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).actionBar;
        kVar.r();
        kVar2 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).actionBar;
        kVar2.h(true);
        if (arrayList.size() <= 1) {
            long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            i13 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
            if (j10 != UserConfig.getInstance(i13).getClientUserId() && charSequence == null) {
                long j11 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle i18 = aa.d.i("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j11)) {
                    i18.putInt("enc_id", DialogObject.getEncryptedChatId(j11));
                } else {
                    if (DialogObject.isUserDialog(j11)) {
                        i18.putLong("user_id", j11);
                    } else if (DialogObject.isChatDialog(j11)) {
                        i18.putLong("chat_id", -j11);
                    }
                    i14 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
                    if (!MessagesController.getInstance(i14).checkCanOpenChat(i18, dyVar)) {
                        return true;
                    }
                }
                i15 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
                NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                wallpapersListActivity.presentFragment(new qn(i18), true);
                i16 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
                SendMessagesHelper.getInstance(i16).sendMessage(SendMessagesHelper.SendMessageParams.of(sb2.toString(), j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
                return true;
            }
        }
        wallpapersListActivity.C0();
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            long j12 = ((MessagesStorage.TopicKey) arrayList.get(i19)).dialogId;
            if (charSequence != null) {
                i12 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
                SendMessagesHelper.getInstance(i12).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j12, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            if (!TextUtils.isEmpty(sb2)) {
                i11 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
                SendMessagesHelper.getInstance(i11).sendMessage(SendMessagesHelper.SendMessageParams.of(sb2.toString(), j12, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
        }
        dyVar.finishFragment();
        return true;
    }
}
