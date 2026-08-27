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

public final class zt implements org.telegram.ui.Components.cv0, org.telegram.ui.ActionBar.a2, MessagesController.ErrorDelegate, org.telegram.ui.Components.fg0, Utilities.Callback5, org.telegram.ui.Components.cd0, org.telegram.ui.ActionBar.l1, org.telegram.ui.Components.mk0, pf.i1, org.telegram.ui.Components.rk0, r0.o, org.telegram.ui.Components.qk0, st, ud.b, fj0 {

    public final int f45250a;

    public final Object f45251b;

    public zt(Object obj, int i10) {
        this.f45250a = i10;
        this.f45251b = obj;
    }

    @Override
    public boolean D0(int i10) {
        switch (this.f45250a) {
        }
        return true;
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        fa0 fa0Var = (fa0) this.f45251b;
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        if (!fa0Var.f38044a.equals(defaultWindowInsets)) {
            fa0Var.f38044a = defaultWindowInsets;
            fa0Var.requestLayout();
        }
        int childCount = fa0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r0.j0.b(fa0Var.getChildAt(i10), m1Var);
        }
        return m1Var;
    }

    @Override
    public a0.h J() {
        switch (this.f45250a) {
        }
        return null;
    }

    @Override
    public void V0(ArrayList arrayList) {
        int i10 = this.f45250a;
    }

    @Override
    public void Z0(nt ntVar) {
        hg0 hg0Var = (hg0) this.f45251b;
        hg0Var.E = true;
        String str = ntVar.f40917c;
        hg0Var.f38804a.setText(str);
        hg0Var.u(str, ntVar);
        hg0Var.f38814y = ntVar;
        hg0Var.f38813x = 0;
        hg0Var.E = false;
        MessagesController.getGlobalMainSettings().edit().putString("phone_code_last_matched_" + ntVar.f40917c, ntVar.d).apply();
        AndroidUtilities.runOnUIThread(new xf0(hg0Var, 4), 300L);
        eg0 eg0Var = hg0Var.f38805b;
        eg0Var.requestFocus();
        eg0Var.setSelection(eg0Var.length());
    }

    @Override
    public boolean a(int i10, View view) {
        switch (this.f45250a) {
            case 13:
                return LanguageSelectActivity.V((LanguageSelectActivity) this.f45251b, view, i10);
            case 23:
                final vi0 vi0Var = (vi0) this.f45251b;
                if (i10 >= vi0Var.E && i10 < vi0Var.F) {
                    try {
                        view.performHapticFeedback(0, 2);
                        break;
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) vi0Var.f43477x.get(i10 - vi0Var.E);
                    final long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
                    final boolean zIsUserDialog = DialogObject.isUserDialog(dialogId);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vi0Var.getParentActivity(), 0, vi0Var.getResourceProvider());
                    if (messageObject.isStory()) {
                        arrayList.add(LocaleController.getString(zIsUserDialog ? R.string.OpenProfile : R.string.OpenChannel2));
                        arrayList3.add(Integer.valueOf(zIsUserDialog ? R.drawable.msg_openprofile : R.drawable.msg_channel));
                    } else {
                        arrayList.add(LocaleController.getString(R.string.ViewMessage));
                        arrayList3.add(Integer.valueOf(R.drawable.msg_msgbubble3));
                    }
                    arrayList2.add(0);
                    CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    int[] intArray = AndroidUtilities.toIntArray(arrayList3);
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i11) {
                            org.telegram.ui.ActionBar.n2 n2Var = vi0Var;
                            n2Var.getClass();
                            MessageObject messageObject2 = messageObject;
                            boolean zIsStory = messageObject2.isStory();
                            boolean z10 = zIsUserDialog;
                            long j10 = dialogId;
                            if (zIsStory) {
                                n2Var.presentFragment(z10 ? ProfileActivity.m4(j10) : rn.R9(j10));
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
                                n2Var.presentFragment(new rn(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                    b2Var.L = charSequenceArr;
                    b2Var.M = intArray;
                    b2Var.I = onClickListener;
                    vi0Var.showDialog(b2Var);
                }
                return false;
            default:
                kk0 kk0Var = (kk0) this.f45251b;
                kk0Var.getClass();
                if (view instanceof jk0) {
                    jk0 jk0Var = (jk0) view;
                    kk0Var.Z(jk0Var.f39386e);
                    jk0Var.performHapticFeedback(0);
                }
                return false;
        }
    }

    @Override
    public void b(Canvas canvas) {
        ((Layout) this.f45251b).draw(canvas);
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        int iU;
        switch (this.f45250a) {
            case 16:
                xb0 xb0Var = (xb0) this.f45251b;
                ArrayList arrayList = xb0Var.f44379s;
                if (view != null && i10 >= 0 && i10 < arrayList.size()) {
                    rb0 rb0Var = (rb0) arrayList.get(i10);
                    int i11 = rb0Var.f49413a;
                    int i12 = rb0Var.f41894e;
                    if (i11 == 3 || i11 == 4) {
                        if (LiteMode.isPowerSaverApplied()) {
                            xb0Var.f44375e = org.telegram.ui.Components.mc.a0(xb0Var).L(new org.telegram.ui.Components.p9(0.1f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
                        } else if (rb0Var.f49413a == 3 && Integer.bitCount(i12) > 1 && (!LocaleController.isRTL ? f10 < view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f10 > AndroidUtilities.dp(75.0f)) && (iU = xb0Var.U(i12)) != -1) {
                            boolean[] zArr = xb0Var.f44377n;
                            zArr[iU] = !zArr[iU];
                            xb0Var.Y();
                            xb0Var.X();
                        } else {
                            LiteMode.toggleFlag(i12, !LiteMode.isEnabledSetting(i12));
                            xb0Var.Y();
                        }
                        break;
                    } else if (i11 == 5 && rb0Var.f41895f == 1) {
                        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                        boolean z10 = globalMainSettings.getBoolean("view_animations", true);
                        SharedPreferences.Editor editorEdit = globalMainSettings.edit();
                        boolean z11 = !z10;
                        editorEdit.putBoolean("view_animations", z11);
                        SharedConfig.setAnimationsEnabled(z11);
                        editorEdit.commit();
                        ((org.telegram.ui.Cells.l8) view).setChecked(z11);
                        break;
                    }
                }
                break;
            default:
                kg0.U((kg0) this.f45251b, i10);
                break;
        }
    }

    @Override
    public void c0(View view, float f10, float f11) {
        int i10 = this.f45250a;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        cf.e eVar;
        int i11 = this.f45250a;
        int i12 = 1;
        Object obj = this.f45251b;
        switch (i11) {
            case 1:
                ((e5.u) obj).run();
                break;
            case 12:
                ((w60) obj).U(true);
                break;
            case 14:
                Pattern pattern = LaunchActivity.f35496x1;
                AndroidUtilities.addToClipboard((StringBuilder) obj);
                break;
            case 17:
                sd0 sd0Var = (sd0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", sd0Var.E);
                bundle.putString("ephone", sd0Var.F);
                bundle.putString("phoneFormated", sd0Var.H);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = sd0Var.H;
                tL_auth_resetLoginEmail.phone_code_hash = sd0Var.I;
                sd0Var.S.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new id0(sd0Var, bundle, tL_auth_resetLoginEmail, i12), 10);
                break;
            case 18:
                be0 be0Var = (be0) obj;
                ig0.n0(be0Var.f36803y, be0Var.f36800s, be0Var.v, be0Var.f36801w);
                break;
            case 19:
                ue0 ue0Var = (ue0) obj;
                ig0 ig0Var = ue0Var.A;
                ig0Var.n1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) ig0Var).currentAccount).sendRequest(deleteaccount, new n(ue0Var, 12), 10);
                break;
            case 26:
                ((org.telegram.messenger.nj) obj).run();
                break;
            case 28:
                kk0 kk0Var = ((gk0) obj).f38439b;
                SparseArray sparseArray = kk0Var.F;
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    ik0 ik0Var = (ik0) sparseArray.valueAt(i13);
                    TLRPC.Document document = ik0Var.f39124e;
                    if (document != null) {
                        arrayList.add(document);
                        cf.d dVar = kk0Var.getMediaDataController().ringtoneDataStore;
                        TLRPC.Document document2 = ik0Var.f39124e;
                        ArrayList arrayList2 = dVar.f2584e;
                        if (document2 != null) {
                            if (!dVar.f2585f) {
                                dVar.f(true);
                                dVar.f2585f = true;
                            }
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (((cf.c) arrayList2.get(i14)).f2576a != null && ((cf.c) arrayList2.get(i14)).f2576a.f22386id == document2.f22386id) {
                                    arrayList2.remove(i14);
                                }
                            }
                        }
                    }
                    if (ik0Var.f39126g != null && (eVar = kk0Var.getMediaDataController().ringtoneUploaderHashMap.get(ik0Var.f39126g)) != null) {
                        eVar.f2588c = true;
                        eVar.a();
                        int i15 = eVar.f2586a;
                        FileLoader fileLoader = FileLoader.getInstance(i15);
                        String str = eVar.f2587b;
                        fileLoader.cancelFileUpload(str, false);
                        MediaDataController.getInstance(i15).onRingtoneUploaded(str, null, true);
                    }
                    if (ik0Var == kk0Var.D) {
                        kk0Var.J = null;
                        kk0Var.D = (ik0) kk0Var.f39792b.get(0);
                        kk0Var.E = true;
                    }
                    kk0Var.f39791a.remove(ik0Var);
                    kk0Var.f39793c.remove(ik0Var);
                }
                kk0Var.getMediaDataController().ringtoneDataStore.h();
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i16);
                    TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    saveringtone.f22590id = tL_inputDocument;
                    tL_inputDocument.f22392id = document3.f22386id;
                    tL_inputDocument.access_hash = document3.access_hash;
                    byte[] bArr = document3.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    saveringtone.unsave = true;
                    kk0Var.getConnectionsManager().sendRequest(saveringtone, new jh.m5(5));
                }
                kk0.W(kk0Var);
                kk0Var.c0();
                kk0Var.f39795f.l();
                b2Var.dismiss();
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                passcodeActivity.getClass();
                SharedConfig.passcodeHash = "";
                SharedConfig.appLocked = false;
                SharedConfig.saveConfig();
                passcodeActivity.getMediaDataController().buildShortcuts();
                int childCount = passcodeActivity.f35570c.getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    View childAt = passcodeActivity.f35570c.getChildAt(i17);
                    if (childAt instanceof org.telegram.ui.Cells.x9) {
                        ((org.telegram.ui.Cells.x9) childAt).setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E6, false));
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                        passcodeActivity.finishFragment();
                    }
                    break;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                passcodeActivity.finishFragment();
                break;
        }
    }

    @Override
    public boolean f1(View view) {
        switch (this.f45250a) {
        }
        return false;
    }

    @Override
    public void h(org.telegram.ui.Components.dd0 dd0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f45251b;
        ArrayList arrayList = ExternalActionActivity.f35468x;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.f35475n, externalActionActivity.v, true, externalActionActivity.f35476r, externalActionActivity.f35477s);
            externalActionActivity.h = null;
        }
        externalActionActivity.f35472c.c0();
        if (AndroidUtilities.isTablet()) {
            externalActionActivity.d.c0();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, dd0Var);
    }

    @Override
    public a0.h h0() {
        switch (this.f45250a) {
        }
        return null;
    }

    @Override
    public void i(int i10) {
        switch (this.f45250a) {
            case 11:
                m60 m60Var = (m60) this.f45251b;
                o60 o60Var = m60Var.E;
                o60Var.q0(m60Var.D);
                if (m60Var.h == null && !m60Var.f40376f.e() && m60Var.h() == 0) {
                    o60Var.f41016s.e(false, true);
                }
                m60Var.l();
                break;
            default:
                ck0 ck0Var = (ck0) this.f45251b;
                if (ck0Var.f37110f == null && !ck0Var.h.e()) {
                    ck0Var.f37111n.f35548c.c();
                }
                ck0Var.l();
                break;
        }
    }

    @Override
    public void j(int i10) {
        DataAutoDownloadActivity dataAutoDownloadActivity = ((au) this.f45251b).d;
        DownloadController.Preset preset = (DownloadController.Preset) dataAutoDownloadActivity.f35448c.get(i10);
        if (preset == dataAutoDownloadActivity.f35456y) {
            dataAutoDownloadActivity.f35449e = 0;
        } else if (preset == dataAutoDownloadActivity.A) {
            dataAutoDownloadActivity.f35449e = 1;
        } else if (preset == dataAutoDownloadActivity.B) {
            dataAutoDownloadActivity.f35449e = 2;
        } else {
            dataAutoDownloadActivity.f35449e = 3;
        }
        int i11 = dataAutoDownloadActivity.f35450f;
        if (i11 == 0) {
            DownloadController.getInstance(((org.telegram.ui.ActionBar.n2) dataAutoDownloadActivity).currentAccount).currentMobilePreset = dataAutoDownloadActivity.f35449e;
        } else if (i11 == 1) {
            DownloadController.getInstance(((org.telegram.ui.ActionBar.n2) dataAutoDownloadActivity).currentAccount).currentWifiPreset = dataAutoDownloadActivity.f35449e;
        } else {
            DownloadController.getInstance(((org.telegram.ui.ActionBar.n2) dataAutoDownloadActivity).currentAccount).currentRoamingPreset = dataAutoDownloadActivity.f35449e;
        }
        SharedPreferences.Editor editorEdit = MessagesController.getMainSettings(((org.telegram.ui.ActionBar.n2) dataAutoDownloadActivity).currentAccount).edit();
        editorEdit.putInt(dataAutoDownloadActivity.G, dataAutoDownloadActivity.f35449e);
        editorEdit.commit();
        DownloadController.getInstance(((org.telegram.ui.ActionBar.n2) dataAutoDownloadActivity).currentAccount).checkAutodownloadSettings();
        for (int i12 = 0; i12 < 4; i12++) {
            f2.o1 o1VarK = dataAutoDownloadActivity.f35447b.K(dataAutoDownloadActivity.photosRow + i12);
            if (o1VarK != null) {
                dataAutoDownloadActivity.f35446a.v(o1VarK, dataAutoDownloadActivity.photosRow + i12);
            }
        }
        dataAutoDownloadActivity.E = true;
    }

    @Override
    public void k(KeyEvent keyEvent) {
        mz mzVar = (mz) this.f45251b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && mzVar.f38921x.isShowing()) {
            mzVar.f38921x.d(true);
        }
    }

    @Override
    public void o(int i10, float f10, float f11, ud.c cVar) {
        sg0 sg0Var = (sg0) this.f45251b;
        sg0Var.getClass();
        sg0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f10));
        sg0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f10));
    }

    @Override
    public int run() {
        return ((FiltersSetupActivity) this.f45251b).f35487w;
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f45250a) {
            case 6:
                yy yyVar = (yy) this.f45251b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                if (((org.telegram.ui.Components.n41) obj).d == 1 && yyVar.f44965b != null) {
                    boolean z10 = !yyVar.f44966c;
                    yyVar.f44966c = z10;
                    cg.u0 u0Var = yyVar.f44968f;
                    if (u0Var != null) {
                        u0Var.run(Boolean.valueOf(z10), Boolean.valueOf(yyVar.d));
                    }
                    ((org.telegram.ui.Cells.p8) view).setChecked(yyVar.f44966c);
                    yyVar.f44967e.U2.N(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.zk0.N0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((org.telegram.ui.Components.zk0) this.f45251b).f35277l2);
                break;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        ((e5.w) this.f45251b).run();
        return true;
    }

    private final void g(ArrayList arrayList) {
    }

    private final void l(ArrayList arrayList) {
    }

    @Override
    public void m() {
    }

    @Override
    public void A(float f10, int i10) {
    }

    private final void d(View view, float f10, float f11) {
    }

    private final void e(View view, float f10, float f11) {
    }
}
