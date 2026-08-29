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
public final class xt implements org.telegram.ui.Components.kv0, org.telegram.ui.ActionBar.b2, MessagesController.ErrorDelegate, org.telegram.ui.Components.og0, Utilities.Callback5, org.telegram.ui.Components.md0, org.telegram.ui.ActionBar.m1, org.telegram.ui.Components.wk0, rf.j1, org.telegram.ui.Components.bl0, r0.o, org.telegram.ui.Components.al0, qt, vd.b, bj0 {
    public final int f44652a;
    public final Object f44653b;

    public xt(Object obj, int i10) {
        this.f44652a = i10;
        this.f44653b = obj;
    }

    @Override
    public boolean A(int i10) {
        switch (this.f44652a) {
            case 11:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void E(ArrayList arrayList) {
        int i10 = this.f44652a;
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        ea0 ea0Var = (ea0) this.f44653b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        if (!ea0Var.f37768a.equals(defaultWindowInsets)) {
            ea0Var.f37768a = defaultWindowInsets;
            ea0Var.requestLayout();
        }
        int childCount = ea0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r0.j0.b(ea0Var.getChildAt(i10), m1Var);
        }
        return m1Var;
    }

    @Override
    public void N(int i10, float f9, float f10, vd.c cVar) {
        pg0 pg0Var = (pg0) this.f44653b;
        pg0Var.getClass();
        pg0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f9));
        pg0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f9));
    }

    @Override
    public void Z0(lt ltVar) {
        eg0 eg0Var = (eg0) this.f44653b;
        eg0Var.E = true;
        String str = ltVar.f40274c;
        eg0Var.f37810a.setText(str);
        eg0Var.v(str, ltVar);
        eg0Var.f37820y = ltVar;
        eg0Var.f37819x = 0;
        eg0Var.E = false;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putString("phone_code_last_matched_" + ltVar.f40274c, ltVar.d).apply();
        AndroidUtilities.runOnUIThread(new uf0(eg0Var, 4), 300L);
        bg0 bg0Var = eg0Var.f37811b;
        bg0Var.requestFocus();
        bg0Var.setSelection(bg0Var.length());
    }

    @Override
    public void a(Canvas canvas) {
        ((Layout) this.f44653b).draw(canvas);
    }

    @Override
    public void b(float f9, float f10, int i10, View view) {
        int U;
        boolean[] zArr;
        switch (this.f44652a) {
            case 16:
                ub0 ub0Var = (ub0) this.f44653b;
                ArrayList arrayList = ub0Var.f43221s;
                if (view != null && i10 >= 0 && i10 < arrayList.size()) {
                    ob0 ob0Var = (ob0) arrayList.get(i10);
                    int i11 = ob0Var.f50845a;
                    int i12 = ob0Var.f41079e;
                    if (i11 != 3 && i11 != 4) {
                        if (i11 == 5 && ob0Var.f41080f == 1) {
                            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                            boolean z10 = globalMainSettings.getBoolean("view_animations", true);
                            SharedPreferences.Editor edit = globalMainSettings.edit();
                            boolean z11 = !z10;
                            edit.putBoolean("view_animations", z11);
                            SharedConfig.setAnimationsEnabled(z11);
                            edit.commit();
                            ((org.telegram.ui.Cells.m8) view).setChecked(z11);
                            return;
                        }
                        return;
                    } else if (LiteMode.isPowerSaverApplied()) {
                        ub0Var.f43217e = org.telegram.ui.Components.tc.a0(ub0Var).L(new org.telegram.ui.Components.v9(0.1f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
                        return;
                    } else if (ob0Var.f50845a == 3 && Integer.bitCount(i12) > 1 && (!LocaleController.isRTL ? f9 < view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f9 > AndroidUtilities.dp(75.0f)) && (U = ub0Var.U(i12)) != -1) {
                        ub0Var.f43219n[U] = !zArr[U];
                        ub0Var.Y();
                        ub0Var.X();
                        return;
                    } else {
                        LiteMode.toggleFlag(i12, !LiteMode.isEnabledSetting(i12));
                        ub0Var.Y();
                        return;
                    }
                }
                return;
            default:
                hg0.U((hg0) this.f44653b, i10);
                return;
        }
    }

    @Override
    public boolean b1(View view) {
        switch (this.f44652a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean c(int i10, View view) {
        int i11;
        int i12;
        switch (this.f44652a) {
            case 13:
                return LanguageSelectActivity.V((LanguageSelectActivity) this.f44653b, view, i10);
            case 23:
                final si0 si0Var = (si0) this.f44653b;
                if (i10 >= si0Var.E && i10 < si0Var.F) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) si0Var.f42411x.get(i10 - si0Var.E);
                    final long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
                    final boolean isUserDialog = DialogObject.isUserDialog(dialogId);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(si0Var.getParentActivity(), 0, si0Var.getResourceProvider());
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
                            org.telegram.ui.ActionBar.o2 R9;
                            org.telegram.ui.ActionBar.o2 o2Var = si0.this;
                            o2Var.getClass();
                            MessageObject messageObject2 = messageObject;
                            boolean isStory = messageObject2.isStory();
                            boolean z10 = isUserDialog;
                            long j10 = dialogId;
                            if (isStory) {
                                if (z10) {
                                    R9 = ProfileActivity.m4(j10);
                                } else {
                                    R9 = tn.R9(j10);
                                }
                                o2Var.presentFragment(R9);
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
                            if (o2Var.getMessagesController().checkCanOpenChat(bundle, o2Var)) {
                                o2Var.presentFragment(new tn(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                    c2Var.L = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    c2Var.M = intArray;
                    c2Var.I = onClickListener;
                    si0Var.showDialog(c2Var);
                }
                return false;
            default:
                gk0 gk0Var = (gk0) this.f44653b;
                gk0Var.getClass();
                if (view instanceof fk0) {
                    fk0 fk0Var = (fk0) view;
                    gk0Var.Z(fk0Var.f38206e);
                    fk0Var.performHapticFeedback(0);
                }
                return false;
        }
    }

    @Override
    public void f(int i10) {
        switch (this.f44652a) {
            case 11:
                k60 k60Var = (k60) this.f44653b;
                m60 m60Var = k60Var.E;
                m60Var.q0(k60Var.D);
                if (k60Var.h == null && !k60Var.f39763f.e() && k60Var.h() == 0) {
                    m60Var.f40464s.e(false, true);
                }
                k60Var.l();
                return;
            default:
                yj0 yj0Var = (yj0) this.f44653b;
                if (yj0Var.f44898f == null && !yj0Var.h.e()) {
                    yj0Var.f44899n.f35612c.c();
                }
                yj0Var.l();
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11;
        ef.f fVar;
        int i12 = this.f44652a;
        Object obj = this.f44653b;
        switch (i12) {
            case 1:
                ((g5.v) obj).run();
                return;
            case 12:
                ((v60) obj).U(true);
                return;
            case 14:
                Pattern pattern = LaunchActivity.f35560x1;
                AndroidUtilities.addToClipboard((StringBuilder) obj);
                return;
            case 17:
                pd0 pd0Var = (pd0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", pd0Var.E);
                bundle.putString("ephone", pd0Var.F);
                bundle.putString("phoneFormated", pd0Var.H);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = pd0Var.H;
                tL_auth_resetLoginEmail.phone_code_hash = pd0Var.I;
                pd0Var.S.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new gd0(pd0Var, bundle, tL_auth_resetLoginEmail, 1), 10);
                return;
            case 18:
                xd0 xd0Var = (xd0) obj;
                fg0.n0(xd0Var.f44568y, xd0Var.f44565s, xd0Var.v, xd0Var.f44566w);
                return;
            case 19:
                qe0 qe0Var = (qe0) obj;
                fg0 fg0Var = qe0Var.A;
                fg0Var.n1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i11 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(deleteaccount, new o(qe0Var, 12), 10);
                return;
            case 26:
                ((org.telegram.messenger.qj) obj).run();
                return;
            case 28:
                gk0 gk0Var = ((ck0) obj).f37169b;
                SparseArray sparseArray = gk0Var.F;
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    ek0 ek0Var = (ek0) sparseArray.valueAt(i13);
                    TLRPC.Document document = ek0Var.f37856e;
                    if (document != null) {
                        arrayList.add(document);
                        ef.e eVar = gk0Var.getMediaDataController().ringtoneDataStore;
                        TLRPC.Document document2 = ek0Var.f37856e;
                        ArrayList arrayList2 = eVar.f5901e;
                        if (document2 != null) {
                            if (!eVar.f5902f) {
                                eVar.f(true);
                                eVar.f5902f = true;
                            }
                            int i14 = 0;
                            while (true) {
                                if (i14 < arrayList2.size()) {
                                    if (((ef.d) arrayList2.get(i14)).f5893a != null && ((ef.d) arrayList2.get(i14)).f5893a.f22398id == document2.f22398id) {
                                        arrayList2.remove(i14);
                                    } else {
                                        i14++;
                                    }
                                }
                            }
                        }
                    }
                    if (ek0Var.f37858g != null && (fVar = gk0Var.getMediaDataController().ringtoneUploaderHashMap.get(ek0Var.f37858g)) != null) {
                        fVar.f5905c = true;
                        fVar.a();
                        int i15 = fVar.f5903a;
                        FileLoader fileLoader = FileLoader.getInstance(i15);
                        String str = fVar.f5904b;
                        fileLoader.cancelFileUpload(str, false);
                        MediaDataController.getInstance(i15).onRingtoneUploaded(str, null, true);
                    }
                    if (ek0Var == gk0Var.D) {
                        gk0Var.J = null;
                        gk0Var.D = (ek0) gk0Var.f38607b.get(0);
                        gk0Var.E = true;
                    }
                    gk0Var.f38606a.remove(ek0Var);
                    gk0Var.f38608c.remove(ek0Var);
                }
                gk0Var.getMediaDataController().ringtoneDataStore.h();
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i16);
                    TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    saveringtone.f22602id = tL_inputDocument;
                    tL_inputDocument.f22404id = document3.f22398id;
                    tL_inputDocument.access_hash = document3.access_hash;
                    byte[] bArr = document3.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    saveringtone.unsave = true;
                    gk0Var.getConnectionsManager().sendRequest(saveringtone, new lh.o5(5));
                }
                gk0.W(gk0Var);
                gk0Var.c0();
                gk0Var.f38610f.l();
                c2Var.dismiss();
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                passcodeActivity.getClass();
                SharedConfig.passcodeHash = "";
                SharedConfig.appLocked = false;
                SharedConfig.saveConfig();
                passcodeActivity.getMediaDataController().buildShortcuts();
                int childCount = passcodeActivity.f35634c.getChildCount();
                int i17 = 0;
                while (true) {
                    if (i17 < childCount) {
                        View childAt = passcodeActivity.f35634c.getChildAt(i17);
                        if (childAt instanceof org.telegram.ui.Cells.y9) {
                            ((org.telegram.ui.Cells.y9) childAt).setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E6, false));
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
        DataAutoDownloadActivity dataAutoDownloadActivity = ((yt) this.f44653b).d;
        DownloadController.Preset preset = (DownloadController.Preset) dataAutoDownloadActivity.f35512c.get(i10);
        if (preset == dataAutoDownloadActivity.f35520y) {
            dataAutoDownloadActivity.f35513e = 0;
        } else if (preset == dataAutoDownloadActivity.A) {
            dataAutoDownloadActivity.f35513e = 1;
        } else if (preset == dataAutoDownloadActivity.B) {
            dataAutoDownloadActivity.f35513e = 2;
        } else {
            dataAutoDownloadActivity.f35513e = 3;
        }
        int i11 = dataAutoDownloadActivity.f35514f;
        if (i11 == 0) {
            DownloadController.getInstance(DataAutoDownloadActivity.d0(dataAutoDownloadActivity)).currentMobilePreset = dataAutoDownloadActivity.f35513e;
        } else if (i11 == 1) {
            DownloadController.getInstance(DataAutoDownloadActivity.e0(dataAutoDownloadActivity)).currentWifiPreset = dataAutoDownloadActivity.f35513e;
        } else {
            DownloadController.getInstance(DataAutoDownloadActivity.f0(dataAutoDownloadActivity)).currentRoamingPreset = dataAutoDownloadActivity.f35513e;
        }
        SharedPreferences.Editor edit = MessagesController.getMainSettings(DataAutoDownloadActivity.g0(dataAutoDownloadActivity)).edit();
        edit.putInt(dataAutoDownloadActivity.G, dataAutoDownloadActivity.f35513e);
        edit.commit();
        DownloadController.getInstance(DataAutoDownloadActivity.h0(dataAutoDownloadActivity)).checkAutodownloadSettings();
        for (int i12 = 0; i12 < 4; i12++) {
            f2.n1 K = dataAutoDownloadActivity.f35511b.K(DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            if (K != null) {
                dataAutoDownloadActivity.f35510a.v(K, DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            }
        }
        dataAutoDownloadActivity.E = true;
    }

    @Override
    public void i(org.telegram.ui.Components.nd0 nd0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f44653b;
        ArrayList arrayList = ExternalActionActivity.f35532x;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.f35539n, externalActionActivity.v, true, externalActionActivity.f35540r, externalActionActivity.f35541s);
            externalActionActivity.h = null;
        }
        externalActionActivity.f35536c.c0();
        if (AndroidUtilities.isTablet()) {
            externalActionActivity.d.c0();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, nd0Var);
    }

    @Override
    public void o(KeyEvent keyEvent) {
        lz lzVar = (lz) this.f44653b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && lzVar.f38702x.isShowing()) {
            lzVar.f38702x.d(true);
        }
    }

    @Override
    public void o0(View view, float f9, float f10) {
        int i10 = this.f44652a;
    }

    @Override
    public a0.h q() {
        switch (this.f44652a) {
            case 11:
                return null;
            default:
                return null;
        }
    }

    @Override
    public int run() {
        return ((FiltersSetupActivity) this.f44653b).f35551w;
    }

    @Override
    public a0.h t() {
        switch (this.f44652a) {
            case 11:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void mo19run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f44652a) {
            case 6:
                xy xyVar = (xy) this.f44653b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                if (((org.telegram.ui.Components.w41) obj).d != 1 || xyVar.f44672b == null) {
                    return;
                }
                boolean z10 = !xyVar.f44673c;
                xyVar.f44673c = z10;
                bh.v vVar = xyVar.f44675f;
                if (vVar != null) {
                    vVar.run(Boolean.valueOf(z10), Boolean.valueOf(xyVar.d));
                }
                ((org.telegram.ui.Cells.q8) view).setChecked(xyVar.f44673c);
                xyVar.f44674e.U2.N(true);
                return;
            default:
                org.telegram.ui.Components.jl0.N0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((org.telegram.ui.Components.jl0) this.f44653b).f29709l2);
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        ((g5.x) this.f44653b).run();
        return true;
    }

    private final void j(ArrayList arrayList) {
    }

    private final void k(ArrayList arrayList) {
    }

    @Override
    public void m() {
    }

    @Override
    public void z(float f9, int i10) {
    }

    private final void d(View view, float f9, float f10) {
    }

    private final void e(View view, float f9, float f10) {
    }
}
