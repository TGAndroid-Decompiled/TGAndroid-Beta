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
public final class wt implements org.telegram.ui.Components.mw0, org.telegram.ui.ActionBar.a2, MessagesController.ErrorDelegate, org.telegram.ui.Components.nh0, Utilities.Callback5, org.telegram.ui.Components.ke0, org.telegram.ui.ActionBar.k1, org.telegram.ui.Components.tl0, hg.z1, org.telegram.ui.Components.yl0, r0.n, org.telegram.ui.Components.xl0, pt, ne.d, fj0 {
    public final int f42920a;
    public final Object f42921b;

    public wt(Object obj, int i10) {
        this.f42920a = i10;
        this.f42921b = obj;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        ba0 ba0Var = (ba0) this.f42921b;
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        if (!ba0Var.f35613a.equals(defaultWindowInsets)) {
            ba0Var.f35613a = defaultWindowInsets;
            ba0Var.requestLayout();
        }
        int childCount = ba0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r0.i0.b(ba0Var.getChildAt(i10), k1Var);
        }
        return k1Var;
    }

    @Override
    public a0.h J() {
        switch (this.f42920a) {
            case 11:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void L0(kt ktVar) {
        eg0 eg0Var = (eg0) this.f42921b;
        eg0Var.I = true;
        String str = ktVar.f38679c;
        eg0Var.f36521a.setText(str);
        eg0Var.t(str, ktVar);
        eg0Var.f36530y = ktVar;
        eg0Var.f36529x = 0;
        eg0Var.I = false;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putString("phone_code_last_matched_" + ktVar.f38679c, ktVar.d).apply();
        AndroidUtilities.runOnUIThread(new uf0(eg0Var, 4), 300L);
        bg0 bg0Var = eg0Var.f36522b;
        bg0Var.requestFocus();
        bg0Var.setSelection(bg0Var.length());
    }

    @Override
    public boolean O(int i10) {
        switch (this.f42920a) {
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
    public void Y(ArrayList arrayList) {
        int i10 = this.f42920a;
    }

    @Override
    public boolean a(int i10, View view) {
        int i11;
        int i12;
        switch (this.f42920a) {
            case 13:
                return LanguageSelectActivity.V((LanguageSelectActivity) this.f42921b, view, i10);
            case 22:
                final wi0 wi0Var = (wi0) this.f42921b;
                if (i10 >= wi0Var.I && i10 < wi0Var.J) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) wi0Var.f42876x.get(i10 - wi0Var.I);
                    final long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
                    final boolean isUserDialog = DialogObject.isUserDialog(dialogId);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wi0Var.getParentActivity(), 0, wi0Var.getResourceProvider());
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
                            org.telegram.ui.ActionBar.n2 n2Var = wi0.this;
                            n2Var.getClass();
                            MessageObject messageObject2 = messageObject;
                            boolean isStory = messageObject2.isStory();
                            boolean z10 = isUserDialog;
                            long j10 = dialogId;
                            if (isStory) {
                                if (z10) {
                                    W9 = ProfileActivity.m4(j10);
                                } else {
                                    W9 = sn.W9(j10);
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
                                n2Var.presentFragment(new sn(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
                    b2Var.P = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    b2Var.Q = intArray;
                    b2Var.M = onClickListener;
                    wi0Var.showDialog(b2Var);
                }
                return false;
            default:
                mk0 mk0Var = (mk0) this.f42921b;
                mk0Var.getClass();
                if (view instanceof lk0) {
                    lk0 lk0Var = (lk0) view;
                    mk0Var.Z(lk0Var.e);
                    lk0Var.performHapticFeedback(0);
                }
                return false;
        }
    }

    @Override
    public void b(Canvas canvas) {
        ((Layout) this.f42921b).draw(canvas);
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        int U;
        boolean[] zArr;
        sb0 sb0Var = (sb0) this.f42921b;
        ArrayList arrayList = sb0Var.f41061s;
        if (view != null && i10 >= 0 && i10 < arrayList.size()) {
            mb0 mb0Var = (mb0) arrayList.get(i10);
            int i11 = mb0Var.f44314a;
            int i12 = mb0Var.e;
            if (i11 != 3 && i11 != 4) {
                if (i11 == 5 && mb0Var.f39085f == 1) {
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
                sb0Var.e = org.telegram.ui.Components.xc.a0(sb0Var).L(new org.telegram.ui.Components.y9(0.1f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
            } else if (mb0Var.f44314a == 3 && Integer.bitCount(i12) > 1 && (!LocaleController.isRTL ? f7 < view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f7 > AndroidUtilities.dp(75.0f)) && (U = sb0Var.U(i12)) != -1) {
                sb0Var.f41059n[U] = !zArr[U];
                sb0Var.Y();
                sb0Var.X();
            } else {
                LiteMode.toggleFlag(i12, !LiteMode.isEnabledSetting(i12));
                sb0Var.Y();
            }
        }
    }

    @Override
    public void f(int i10) {
        switch (this.f42920a) {
            case 11:
                l60 l60Var = (l60) this.f42921b;
                n60 n60Var = l60Var.I;
                n60Var.q0(l60Var.H);
                if (l60Var.h == null && !l60Var.f38798f.e() && l60Var.h() == 0) {
                    n60Var.f39351s.e(false, true);
                }
                l60Var.l();
                return;
            default:
                ck0 ck0Var = (ck0) this.f42921b;
                if (ck0Var.f35952f == null && !ck0Var.h.e()) {
                    ck0Var.f35953n.f33195c.c();
                }
                ck0Var.l();
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        wf.d dVar;
        int i12 = this.f42920a;
        Object obj = this.f42921b;
        switch (i12) {
            case 1:
                ((a3.i0) obj).run();
                return;
            case 12:
                ((w60) obj).U(true);
                return;
            case 14:
                Pattern pattern = LaunchActivity.C1;
                AndroidUtilities.addToClipboard((StringBuilder) obj);
                return;
            case 17:
                od0 od0Var = (od0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", od0Var.I);
                bundle.putString("ephone", od0Var.J);
                bundle.putString("phoneFormated", od0Var.L);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = od0Var.L;
                tL_auth_resetLoginEmail.phone_code_hash = od0Var.M;
                od0Var.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new ed0(od0Var, bundle, tL_auth_resetLoginEmail, 1), 10);
                return;
            case 18:
                xd0 xd0Var = (xd0) obj;
                fg0.n0(xd0Var.f43099y, xd0Var.f43096s, xd0Var.v, xd0Var.f43097w);
                return;
            case 19:
                qe0 qe0Var = (qe0) obj;
                fg0 fg0Var = qe0Var.E;
                fg0Var.n1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i11 = ((org.telegram.ui.ActionBar.n2) fg0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(deleteaccount, new m(qe0Var, 12), 10);
                return;
            case 25:
                ((org.telegram.messenger.xi) obj).run();
                return;
            case 27:
                mk0 mk0Var = ((ik0) obj).f37914b;
                SparseArray sparseArray = mk0Var.J;
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    kk0 kk0Var = (kk0) sparseArray.valueAt(i13);
                    TLRPC.Document document = kk0Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        wf.c cVar = mk0Var.getMediaDataController().ringtoneDataStore;
                        TLRPC.Document document2 = kk0Var.e;
                        ArrayList arrayList2 = cVar.e;
                        if (document2 != null) {
                            if (!cVar.f48959f) {
                                cVar.f(true);
                                cVar.f48959f = true;
                            }
                            int i14 = 0;
                            while (true) {
                                if (i14 < arrayList2.size()) {
                                    if (((wf.b) arrayList2.get(i14)).f48951a != null && ((wf.b) arrayList2.get(i14)).f48951a.f20278id == document2.f20278id) {
                                        arrayList2.remove(i14);
                                    } else {
                                        i14++;
                                    }
                                }
                            }
                        }
                    }
                    if (kk0Var.f38573g != null && (dVar = mk0Var.getMediaDataController().ringtoneUploaderHashMap.get(kk0Var.f38573g)) != null) {
                        dVar.f48962c = true;
                        dVar.a();
                        int i15 = dVar.f48960a;
                        FileLoader fileLoader = FileLoader.getInstance(i15);
                        String str = dVar.f48961b;
                        fileLoader.cancelFileUpload(str, false);
                        MediaDataController.getInstance(i15).onRingtoneUploaded(str, null, true);
                    }
                    if (kk0Var == mk0Var.H) {
                        mk0Var.N = null;
                        mk0Var.H = (kk0) mk0Var.f39207b.get(0);
                        mk0Var.I = true;
                    }
                    mk0Var.f39206a.remove(kk0Var);
                    mk0Var.f39208c.remove(kk0Var);
                }
                mk0Var.getMediaDataController().ringtoneDataStore.h();
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i16);
                    TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    saveringtone.f20479id = tL_inputDocument;
                    tL_inputDocument.f20284id = document3.f20278id;
                    tL_inputDocument.access_hash = document3.access_hash;
                    byte[] bArr = document3.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    saveringtone.unsave = true;
                    mk0Var.getConnectionsManager().sendRequest(saveringtone, new ci.e6(8));
                }
                mk0.W(mk0Var);
                mk0Var.c0();
                mk0Var.f39209f.l();
                b2Var.dismiss();
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                passcodeActivity.getClass();
                SharedConfig.passcodeHash = "";
                SharedConfig.appLocked = false;
                SharedConfig.saveConfig();
                passcodeActivity.getMediaDataController().buildShortcuts();
                int childCount = passcodeActivity.f33215c.getChildCount();
                int i17 = 0;
                while (true) {
                    if (i17 < childCount) {
                        View childAt = passcodeActivity.f33215c.getChildAt(i17);
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
        DataAutoDownloadActivity dataAutoDownloadActivity = ((xt) this.f42921b).d;
        DownloadController.Preset preset = (DownloadController.Preset) dataAutoDownloadActivity.f33100c.get(i10);
        if (preset == dataAutoDownloadActivity.f33107y) {
            dataAutoDownloadActivity.e = 0;
        } else if (preset == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.e = 1;
        } else if (preset == dataAutoDownloadActivity.F) {
            dataAutoDownloadActivity.e = 2;
        } else {
            dataAutoDownloadActivity.e = 3;
        }
        int i11 = dataAutoDownloadActivity.f33101f;
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
            s4.b1 K = dataAutoDownloadActivity.f33099b.K(DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            if (K != null) {
                dataAutoDownloadActivity.f33098a.v(K, DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            }
        }
        dataAutoDownloadActivity.I = true;
    }

    @Override
    public void j(org.telegram.ui.Components.le0 le0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f42921b;
        ArrayList arrayList = ExternalActionActivity.f33118x;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.f33124n, externalActionActivity.v, true, externalActionActivity.f33125r, externalActionActivity.f33126s);
            externalActionActivity.h = null;
        }
        externalActionActivity.f33122c.c0();
        if (AndroidUtilities.isTablet()) {
            externalActionActivity.d.c0();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, le0Var);
    }

    @Override
    public void n(KeyEvent keyEvent) {
        lz lzVar = (lz) this.f42921b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && lzVar.f37375x.isShowing()) {
            lzVar.f37375x.d(true);
        }
    }

    @Override
    public int run() {
        return ((FiltersSetupActivity) this.f42921b).f33135w;
    }

    @Override
    public void u(int i10, float f7, float f10, ne.e eVar) {
        rg0 rg0Var = (rg0) this.f42921b;
        rg0Var.getClass();
        rg0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f7));
        rg0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f7));
    }

    @Override
    public a0.h y() {
        switch (this.f42920a) {
            case 11:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f42920a) {
            case 6:
                wy wyVar = (wy) this.f42921b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                if (((org.telegram.ui.Components.f61) obj).d != 1 || wyVar.f42953b == null) {
                    return;
                }
                boolean z10 = !wyVar.f42954c;
                wyVar.f42954c = z10;
                ai.q5 q5Var = wyVar.f42955f;
                if (q5Var != null) {
                    q5Var.run(Boolean.valueOf(z10), Boolean.valueOf(wyVar.d));
                }
                ((org.telegram.ui.Cells.v8) view).setChecked(wyVar.f42954c);
                wyVar.e.W2.N(true);
                return;
            case 10:
                org.telegram.ui.Components.im0.O0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((org.telegram.ui.Components.im0) this.f42921b).f27284n2);
                return;
            default:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.W((PasskeysActivity) this.f42921b, (org.telegram.ui.Components.f61) obj, (View) obj2);
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        ((a3.h0) this.f42921b).run();
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
    public void E(float f7, int i10) {
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
