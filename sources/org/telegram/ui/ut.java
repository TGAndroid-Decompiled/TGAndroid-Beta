package org.telegram.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.Layout;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ut implements org.telegram.ui.Components.ow0, org.telegram.ui.ActionBar.a2, MessagesController.ErrorDelegate, org.telegram.ui.Components.oh0, Utilities.Callback5, org.telegram.ui.Components.ke0, org.telegram.ui.ActionBar.k1, org.telegram.ui.Components.ul0, hg.z1, org.telegram.ui.Components.zl0, r0.n, org.telegram.ui.Components.yl0, nt, ne.d, dj0 {
    public final int f42041a;
    public final Object f42042b;

    public ut(Object obj, int i10) {
        this.f42041a = i10;
        this.f42042b = obj;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        z90 z90Var = (z90) this.f42042b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        if (!z90Var.f43682a.equals(defaultWindowInsets)) {
            z90Var.f43682a = defaultWindowInsets;
            z90Var.requestLayout();
        }
        int childCount = z90Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r0.i0.b(z90Var.getChildAt(i10), k1Var);
        }
        return k1Var;
    }

    @Override
    public a0.h G() {
        switch (this.f42041a) {
            case 11:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void L0(ht htVar) {
        cg0 cg0Var = (cg0) this.f42042b;
        cg0Var.I = true;
        String str = htVar.f37789c;
        cg0Var.f35966a.setText(str);
        cg0Var.t(str, htVar);
        cg0Var.f35975y = htVar;
        cg0Var.f35974x = 0;
        cg0Var.I = false;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putString("phone_code_last_matched_" + htVar.f37789c, htVar.d).apply();
        AndroidUtilities.runOnUIThread(new sf0(cg0Var, 4), 300L);
        zf0 zf0Var = cg0Var.f35967b;
        zf0Var.requestFocus();
        zf0Var.setSelection(zf0Var.length());
    }

    @Override
    public boolean O(int i10) {
        switch (this.f42041a) {
            case 11:
                return true;
            default:
                return true;
        }
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public void S(ArrayList arrayList) {
        int i10 = this.f42041a;
    }

    @Override
    public boolean a(int i10, View view) {
        int i11;
        int i12;
        switch (this.f42041a) {
            case 13:
                return LanguageSelectActivity.V((LanguageSelectActivity) this.f42042b, view, i10);
            case 22:
                final ui0 ui0Var = (ui0) this.f42042b;
                if (i10 >= ui0Var.I && i10 < ui0Var.J) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) ui0Var.f42001x.get(i10 - ui0Var.I);
                    final long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
                    final boolean isUserDialog = DialogObject.isUserDialog(dialogId);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ui0Var.getParentActivity(), 0, ui0Var.getResourceProvider());
                    if (messageObject.isStory()) {
                        if (isUserDialog) {
                            i11 = R.string.OpenProfile;
                        } else {
                            i11 = R.string.OpenChannel2;
                        }
                        arrayList.add(LocaleController.getString(i11));
                        if (isUserDialog) {
                            i12 = R.drawable.msg_openprofile;
                        } else {
                            i12 = R.drawable.msg_channel;
                        }
                        arrayList3.add(Integer.valueOf(i12));
                    } else {
                        arrayList.add(LocaleController.getString(R.string.ViewMessage));
                        arrayList3.add(Integer.valueOf(R.drawable.msg_msgbubble3));
                    }
                    arrayList2.add(0);
                    int[] intArray = AndroidUtilities.toIntArray(arrayList3);
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i13) {
                            org.telegram.ui.ActionBar.n2 W9;
                            org.telegram.ui.ActionBar.n2 n2Var = ui0.this;
                            n2Var.getClass();
                            MessageObject messageObject2 = messageObject;
                            boolean isStory = messageObject2.isStory();
                            boolean z10 = isUserDialog;
                            long j10 = dialogId;
                            if (isStory) {
                                if (z10) {
                                    W9 = ProfileActivity.m4(j10);
                                } else {
                                    W9 = qn.W9(j10);
                                }
                                n2Var.presentFragment(W9);
                                return;
                            }
                            Bundle bundle = new Bundle();
                            if (z10) {
                                bundle.putLong("user_id", j10);
                            } else {
                                bundle.putLong("chat_id", -j10);
                            }
                            bundle.putInt("message_id", messageObject2.getId());
                            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                            if (n2Var.getMessagesController().checkCanOpenChat(bundle, n2Var)) {
                                n2Var.presentFragment(new qn(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20608a;
                    b2Var.P = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    b2Var.Q = intArray;
                    b2Var.M = onClickListener;
                    ui0Var.showDialog(b2Var);
                }
                return false;
            default:
                kk0 kk0Var = (kk0) this.f42042b;
                kk0Var.getClass();
                if (view instanceof jk0) {
                    jk0 jk0Var = (jk0) view;
                    kk0Var.Z(jk0Var.e);
                    jk0Var.performHapticFeedback(0);
                }
                return false;
        }
    }

    @Override
    public void b(Canvas canvas) {
        ((Layout) this.f42042b).draw(canvas);
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        int U;
        boolean[] zArr;
        qb0 qb0Var = (qb0) this.f42042b;
        ArrayList arrayList = qb0Var.f40532s;
        if (view != null && i10 >= 0 && i10 < arrayList.size()) {
            kb0 kb0Var = (kb0) arrayList.get(i10);
            int i11 = kb0Var.f44299a;
            int i12 = kb0Var.e;
            if (i11 != 3 && i11 != 4) {
                if (i11 == 5 && kb0Var.f38508f == 1) {
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    boolean z10 = globalMainSettings.getBoolean("view_animations", true);
                    SharedPreferences.Editor edit = globalMainSettings.edit();
                    boolean z11 = !z10;
                    edit.putBoolean("view_animations", z11);
                    SharedConfig.setAnimationsEnabled(z11);
                    edit.commit();
                    ((org.telegram.ui.Cells.q8) view).setChecked(z11);
                }
            } else if (LiteMode.isPowerSaverApplied()) {
                qb0Var.e = org.telegram.ui.Components.xc.a0(qb0Var).L(new org.telegram.ui.Components.y9(0.1f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
            } else if (kb0Var.f44299a == 3 && Integer.bitCount(i12) > 1 && (!LocaleController.isRTL ? f7 < view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f7 > AndroidUtilities.dp(75.0f)) && (U = qb0Var.U(i12)) != -1) {
                qb0Var.f40530n[U] = !zArr[U];
                qb0Var.Y();
                qb0Var.X();
            } else {
                LiteMode.toggleFlag(i12, !LiteMode.isEnabledSetting(i12));
                qb0Var.Y();
            }
        }
    }

    @Override
    public void f(int i10) {
        switch (this.f42041a) {
            case 11:
                j60 j60Var = (j60) this.f42042b;
                l60 l60Var = j60Var.I;
                l60Var.q0(j60Var.H);
                if (j60Var.h == null && !j60Var.f38181f.e() && j60Var.h() == 0) {
                    l60Var.f38827s.e(false, true);
                }
                j60Var.l();
                return;
            default:
                ak0 ak0Var = (ak0) this.f42042b;
                if (ak0Var.f35386f == null && !ak0Var.h.e()) {
                    ak0Var.f35387n.f33211c.c();
                }
                ak0Var.l();
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        wf.d dVar;
        int i12 = this.f42041a;
        Object obj = this.f42042b;
        switch (i12) {
            case 1:
                ((a3.i0) obj).run();
                return;
            case 12:
                ((u60) obj).U(true);
                return;
            case 14:
                Pattern pattern = LaunchActivity.C1;
                AndroidUtilities.addToClipboard((StringBuilder) obj);
                return;
            case 17:
                md0 md0Var = (md0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", md0Var.I);
                bundle.putString("ephone", md0Var.J);
                bundle.putString("phoneFormated", md0Var.L);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = md0Var.L;
                tL_auth_resetLoginEmail.phone_code_hash = md0Var.M;
                md0Var.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new cd0(md0Var, bundle, tL_auth_resetLoginEmail, 1), 10);
                return;
            case 18:
                vd0 vd0Var = (vd0) obj;
                dg0.n0(vd0Var.f42220y, vd0Var.f42217s, vd0Var.v, vd0Var.f42218w);
                return;
            case 19:
                oe0 oe0Var = (oe0) obj;
                dg0 dg0Var = oe0Var.E;
                dg0Var.n1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i11 = ((org.telegram.ui.ActionBar.n2) dg0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(deleteaccount, new m(oe0Var, 12), 10);
                return;
            case 25:
                ((org.telegram.messenger.zi) obj).run();
                return;
            case 27:
                kk0 kk0Var = ((gk0) obj).f37352b;
                SparseArray sparseArray = kk0Var.J;
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    ik0 ik0Var = (ik0) sparseArray.valueAt(i13);
                    TLRPC.Document document = ik0Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        wf.c cVar = kk0Var.getMediaDataController().ringtoneDataStore;
                        TLRPC.Document document2 = ik0Var.e;
                        ArrayList arrayList2 = cVar.e;
                        if (document2 != null) {
                            if (!cVar.f48946f) {
                                cVar.f(true);
                                cVar.f48946f = true;
                            }
                            int i14 = 0;
                            while (true) {
                                if (i14 < arrayList2.size()) {
                                    if (((wf.b) arrayList2.get(i14)).f48938a != null && ((wf.b) arrayList2.get(i14)).f48938a.f20285id == document2.f20285id) {
                                        arrayList2.remove(i14);
                                    } else {
                                        i14++;
                                    }
                                }
                            }
                        }
                    }
                    if (ik0Var.f38027g != null && (dVar = kk0Var.getMediaDataController().ringtoneUploaderHashMap.get(ik0Var.f38027g)) != null) {
                        dVar.f48949c = true;
                        dVar.a();
                        int i15 = dVar.f48947a;
                        FileLoader fileLoader = FileLoader.getInstance(i15);
                        String str = dVar.f48948b;
                        fileLoader.cancelFileUpload(str, false);
                        MediaDataController.getInstance(i15).onRingtoneUploaded(str, null, true);
                    }
                    if (ik0Var == kk0Var.H) {
                        kk0Var.N = null;
                        kk0Var.H = (ik0) kk0Var.f38630b.get(0);
                        kk0Var.I = true;
                    }
                    kk0Var.f38629a.remove(ik0Var);
                    kk0Var.f38631c.remove(ik0Var);
                }
                kk0Var.getMediaDataController().ringtoneDataStore.h();
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i16);
                    TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    saveringtone.f20486id = tL_inputDocument;
                    tL_inputDocument.f20291id = document3.f20285id;
                    tL_inputDocument.access_hash = document3.access_hash;
                    byte[] bArr = document3.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    saveringtone.unsave = true;
                    kk0Var.getConnectionsManager().sendRequest(saveringtone, new ci.e6(8));
                }
                kk0.W(kk0Var);
                kk0Var.c0();
                kk0Var.f38632f.l();
                b2Var.dismiss();
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                passcodeActivity.getClass();
                SharedConfig.passcodeHash = "";
                SharedConfig.appLocked = false;
                SharedConfig.saveConfig();
                passcodeActivity.getMediaDataController().buildShortcuts();
                int childCount = passcodeActivity.f33231c.getChildCount();
                int i17 = 0;
                while (true) {
                    if (i17 < childCount) {
                        View childAt = passcodeActivity.f33231c.getChildAt(i17);
                        if (childAt instanceof org.telegram.ui.Cells.ba) {
                            ((org.telegram.ui.Cells.ba) childAt).setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.E6, false));
                        } else {
                            i17++;
                        }
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                passcodeActivity.finishFragment();
                return;
        }
    }

    @Override
    public void h(int i10) {
        DataAutoDownloadActivity dataAutoDownloadActivity = ((vt) this.f42042b).d;
        DownloadController.Preset preset = (DownloadController.Preset) dataAutoDownloadActivity.f33116c.get(i10);
        if (preset == dataAutoDownloadActivity.f33123y) {
            dataAutoDownloadActivity.e = 0;
        } else if (preset == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.e = 1;
        } else if (preset == dataAutoDownloadActivity.F) {
            dataAutoDownloadActivity.e = 2;
        } else {
            dataAutoDownloadActivity.e = 3;
        }
        int i11 = dataAutoDownloadActivity.f33117f;
        if (i11 == 0) {
            DownloadController.getInstance(DataAutoDownloadActivity.d0(dataAutoDownloadActivity)).currentMobilePreset = dataAutoDownloadActivity.e;
        } else if (i11 == 1) {
            DownloadController.getInstance(DataAutoDownloadActivity.e0(dataAutoDownloadActivity)).currentWifiPreset = dataAutoDownloadActivity.e;
        } else {
            DownloadController.getInstance(DataAutoDownloadActivity.f0(dataAutoDownloadActivity)).currentRoamingPreset = dataAutoDownloadActivity.e;
        }
        SharedPreferences.Editor edit = MessagesController.getMainSettings(DataAutoDownloadActivity.g0(dataAutoDownloadActivity)).edit();
        edit.putInt(dataAutoDownloadActivity.K, dataAutoDownloadActivity.e);
        edit.commit();
        DownloadController.getInstance(DataAutoDownloadActivity.h0(dataAutoDownloadActivity)).checkAutodownloadSettings();
        for (int i12 = 0; i12 < 4; i12++) {
            s4.b1 K = dataAutoDownloadActivity.f33115b.K(DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            if (K != null) {
                dataAutoDownloadActivity.f33114a.v(K, DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            }
        }
        dataAutoDownloadActivity.I = true;
    }

    @Override
    public void j(org.telegram.ui.Components.me0 me0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f42042b;
        ArrayList arrayList = ExternalActionActivity.f33134x;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.f33140n, externalActionActivity.v, true, externalActionActivity.f33141r, externalActionActivity.f33142s);
            externalActionActivity.h = null;
        }
        externalActionActivity.f33138c.c0();
        if (AndroidUtilities.isTablet()) {
            externalActionActivity.d.c0();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, me0Var);
    }

    @Override
    public void n(KeyEvent keyEvent) {
        jz jzVar = (jz) this.f42042b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && jzVar.f36842x.isShowing()) {
            jzVar.f36842x.d(true);
        }
    }

    @Override
    public void r(int i10, float f7, float f10, ne.e eVar) {
        pg0 pg0Var = (pg0) this.f42042b;
        pg0Var.getClass();
        pg0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f7));
        pg0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f7));
    }

    @Override
    public int run() {
        return ((FiltersSetupActivity) this.f42042b).f33151w;
    }

    @Override
    public a0.h y() {
        switch (this.f42041a) {
            case 11:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f42041a) {
            case 6:
                uy uyVar = (uy) this.f42042b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                if (((org.telegram.ui.Components.h61) obj).d != 1 || uyVar.f42074b == null) {
                    return;
                }
                boolean z10 = !uyVar.f42075c;
                uyVar.f42075c = z10;
                ai.r5 r5Var = uyVar.f42076f;
                if (r5Var != null) {
                    r5Var.run(Boolean.valueOf(z10), Boolean.valueOf(uyVar.d));
                }
                ((org.telegram.ui.Cells.v8) view).setChecked(uyVar.f42075c);
                uyVar.e.W2.N(true);
                return;
            case 10:
                org.telegram.ui.Components.jm0.O0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((org.telegram.ui.Components.jm0) this.f42042b).f27582n2);
                return;
            default:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.W((PasskeysActivity) this.f42042b, (org.telegram.ui.Components.h61) obj, (View) obj2);
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        ((a3.h0) this.f42042b).run();
        return true;
    }

    private final void c(ArrayList arrayList) {
    }

    private final void e(ArrayList arrayList) {
    }

    @Override
    public void m() {
    }

    @Override
    public void H(float f7, int i10) {
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
