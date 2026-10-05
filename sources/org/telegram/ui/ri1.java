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
public final class ri1 implements org.telegram.ui.ActionBar.a2, oy {
    public final ti1 f40118a;

    public ri1(ti1 ti1Var) {
        this.f40118a = ti1Var;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean H(uy uyVar) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int i11;
        String str;
        ti1 ti1Var = this.f40118a;
        WallpapersListActivity wallpapersListActivity = ti1Var.f40925a;
        Activity parentActivity = wallpapersListActivity.getParentActivity();
        LongSparseArray longSparseArray = wallpapersListActivity.f34628g0;
        org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(parentActivity, 3, null);
        wallpapersListActivity.N = b2Var2;
        b2Var2.f20432g0 = false;
        b2Var2.show();
        new ArrayList();
        int[] iArr = {0};
        for (int i12 = 0; i12 < longSparseArray.size(); i12++) {
            Object valueAt = longSparseArray.valueAt(i12);
            if (valueAt instanceof wi1) {
                wi1 wi1Var = (wi1) valueAt;
                TLRPC.WallPaper wallPaper = wi1Var.f42576l;
                if (wallPaper != null && wallPaper.f20199id < 0) {
                    wallpapersListActivity.getMessagesStorage().deleteWallpaper(wi1Var.f42576l.f20199id);
                    wallpapersListActivity.f34623d0.remove(wi1Var);
                    wallpapersListActivity.f34620b0.remove(wi1Var.a());
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
                    tL_inputWallPaperNoFile.f20120id = wallPaper2.f20199id;
                    savewallpaper.wallpaper = tL_inputWallPaperNoFile;
                } else {
                    TLRPC.TL_inputWallPaper tL_inputWallPaper = new TLRPC.TL_inputWallPaper();
                    tL_inputWallPaper.f20119id = wallPaper2.f20199id;
                    tL_inputWallPaper.access_hash = wallPaper2.access_hash;
                    savewallpaper.wallpaper = tL_inputWallPaper;
                }
                String str2 = wallPaper2.slug;
                if (str2 != null && str2.equals(wallpapersListActivity.Q)) {
                    if (org.telegram.ui.ActionBar.i6.d1()) {
                        str = "t";
                    } else {
                        str = "d";
                    }
                    wallpapersListActivity.Q = str;
                    org.telegram.ui.ActionBar.i6.I.v(null);
                    org.telegram.ui.ActionBar.i6.o1(true);
                }
                i11 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(savewallpaper, new si1(0, ti1Var, iArr));
            }
        }
        if (iArr[0] == 0) {
            wallpapersListActivity.B0(true);
        }
        longSparseArray.clear();
        kVar = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).actionBar;
        kVar.r();
        kVar2 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).actionBar;
        kVar2.h(true);
    }

    @Override
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        LongSparseArray longSparseArray;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        String b10;
        WallpapersListActivity wallpapersListActivity = this.f40118a.f40925a;
        StringBuilder sb2 = new StringBuilder();
        int i18 = 0;
        while (true) {
            longSparseArray = wallpapersListActivity.f34628g0;
            if (i18 >= longSparseArray.size()) {
                break;
            }
            Object valueAt = longSparseArray.valueAt(i18);
            if (valueAt instanceof TLRPC.TL_wallPaper) {
                b10 = AndroidUtilities.getWallPaperUrl(valueAt);
            } else if (valueAt instanceof wi1) {
                b10 = ((wi1) valueAt).b();
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
        kVar = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).actionBar;
        kVar.r();
        kVar2 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).actionBar;
        kVar2.h(true);
        if (arrayList.size() <= 1) {
            long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            i14 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount;
            if (j3 != UserConfig.getInstance(i14).getClientUserId() && charSequence == null) {
                long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                Bundle i19 = a4.a.i("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j10)) {
                    i19.putInt("enc_id", DialogObject.getEncryptedChatId(j10));
                } else {
                    if (DialogObject.isUserDialog(j10)) {
                        i19.putLong("user_id", j10);
                    } else if (DialogObject.isChatDialog(j10)) {
                        i19.putLong("chat_id", -j10);
                    }
                    i15 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount;
                    if (!MessagesController.getInstance(i15).checkCanOpenChat(i19, uyVar)) {
                        return true;
                    }
                }
                i16 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount;
                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                wallpapersListActivity.presentFragment(new yn(i19), true);
                i17 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount;
                SendMessagesHelper.getInstance(i17).sendMessage(SendMessagesHelper.SendMessageParams.of(sb2.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                return true;
            }
        }
        wallpapersListActivity.D0();
        for (int i20 = 0; i20 < arrayList.size(); i20++) {
            long j11 = ((MessagesStorage.TopicKey) arrayList.get(i20)).dialogId;
            if (charSequence != null) {
                i13 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount;
                SendMessagesHelper.getInstance(i13).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
            if (!TextUtils.isEmpty(sb2)) {
                i12 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount;
                SendMessagesHelper.getInstance(i12).sendMessage(SendMessagesHelper.SendMessageParams.of(sb2.toString(), j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
            }
        }
        uyVar.finishFragment();
        return true;
    }
}
