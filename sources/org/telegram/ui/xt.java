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
public final class xt implements org.telegram.ui.Components.rw0, org.telegram.ui.ActionBar.z1, MessagesController.ErrorDelegate, org.telegram.ui.Components.rh0, Utilities.Callback5, org.telegram.ui.Components.ne0, org.telegram.ui.ActionBar.k1, org.telegram.ui.Components.xl0, hg.z1, org.telegram.ui.Components.cm0, r0.n, org.telegram.ui.Components.bm0, qt, ne.d, hj0 {
    public final int f43641a;
    public final Object f43642b;

    public xt(Object obj, int i10) {
        this.f43641a = i10;
        this.f43642b = obj;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        ga0 ga0Var = (ga0) this.f43642b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        if (!ga0Var.f37547a.equals(defaultWindowInsets)) {
            ga0Var.f37547a = defaultWindowInsets;
            ga0Var.requestLayout();
        }
        int childCount = ga0Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r0.i0.b(ga0Var.getChildAt(i10), k1Var);
        }
        return k1Var;
    }

    @Override
    public a0.h G() {
        switch (this.f43641a) {
            case 11:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void L0(lt ltVar) {
        hg0 hg0Var = (hg0) this.f43642b;
        hg0Var.K = true;
        String str = ltVar.f39324c;
        hg0Var.f37845a.setText(str);
        hg0Var.s(str, ltVar);
        hg0Var.F = ltVar;
        hg0Var.E = 0;
        hg0Var.K = false;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putString("phone_code_last_matched_" + ltVar.f39324c, ltVar.d).apply();
        AndroidUtilities.runOnUIThread(new xf0(hg0Var, 4), 300L);
        eg0 eg0Var = hg0Var.f37847b;
        eg0Var.requestFocus();
        eg0Var.setSelection(eg0Var.length());
    }

    @Override
    public boolean O(int i10) {
        switch (this.f43641a) {
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
        int i10 = this.f43641a;
    }

    @Override
    public void a(Canvas canvas) {
        ((Layout) this.f43642b).draw(canvas);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        int U;
        boolean[] zArr;
        wb0 wb0Var = (wb0) this.f43642b;
        ArrayList arrayList = wb0Var.f42999s;
        if (view != null && i10 >= 0 && i10 < arrayList.size()) {
            qb0 qb0Var = (qb0) arrayList.get(i10);
            int i11 = qb0Var.f44713a;
            int i12 = qb0Var.e;
            if (i11 != 3 && i11 != 4) {
                if (i11 == 5 && qb0Var.f40690f == 1) {
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    boolean z10 = globalMainSettings.getBoolean("view_animations", true);
                    SharedPreferences.Editor edit = globalMainSettings.edit();
                    boolean z11 = !z10;
                    edit.putBoolean("view_animations", z11);
                    SharedConfig.setAnimationsEnabled(z11);
                    edit.commit();
                    ((org.telegram.ui.Cells.r8) view).setChecked(z11);
                }
            } else if (LiteMode.isPowerSaverApplied()) {
                wb0Var.e = org.telegram.ui.Components.xc.a0(wb0Var).L(new org.telegram.ui.Components.y9(0.1f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
            } else if (qb0Var.f44713a == 3 && Integer.bitCount(i12) > 1 && (!LocaleController.isRTL ? f7 < view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f7 > AndroidUtilities.dp(75.0f)) && (U = wb0Var.U(i12)) != -1) {
                wb0Var.f42997n[U] = !zArr[U];
                wb0Var.Y();
                wb0Var.X();
            } else {
                LiteMode.toggleFlag(i12, !LiteMode.isEnabledSetting(i12));
                wb0Var.Y();
            }
        }
    }

    @Override
    public boolean d(int i10, View view) {
        int i11;
        int i12;
        switch (this.f43641a) {
            case 13:
                return LanguageSelectActivity.V((LanguageSelectActivity) this.f43642b, view, i10);
            case 22:
                final yi0 yi0Var = (yi0) this.f43642b;
                if (i10 >= yi0Var.I && i10 < yi0Var.J) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) yi0Var.f43886x.get(i10 - yi0Var.I);
                    final long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
                    final boolean isUserDialog = DialogObject.isUserDialog(dialogId);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yi0Var.getParentActivity(), 0, yi0Var.getResourceProvider());
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
                            org.telegram.ui.ActionBar.o2 W9;
                            org.telegram.ui.ActionBar.o2 o2Var = yi0.this;
                            o2Var.getClass();
                            MessageObject messageObject2 = messageObject;
                            boolean isStory = messageObject2.isStory();
                            boolean z10 = isUserDialog;
                            long j10 = dialogId;
                            if (isStory) {
                                if (z10) {
                                    W9 = ProfileActivity.o4(j10);
                                } else {
                                    W9 = sn.W9(j10);
                                }
                                o2Var.presentFragment(W9);
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
                                o2Var.presentFragment(new sn(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                    c2Var.P = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    c2Var.Q = intArray;
                    c2Var.M = onClickListener;
                    yi0Var.showDialog(c2Var);
                }
                return false;
            default:
                nk0 nk0Var = (nk0) this.f43642b;
                nk0Var.getClass();
                if (view instanceof mk0) {
                    mk0 mk0Var = (mk0) view;
                    nk0Var.Z(mk0Var.e);
                    mk0Var.performHapticFeedback(0);
                }
                return false;
        }
    }

    @Override
    public void f(int i10) {
        switch (this.f43641a) {
            case 11:
                n60 n60Var = (n60) this.f43642b;
                p60 p60Var = n60Var.I;
                p60Var.q0(n60Var.H);
                if (n60Var.h == null && !n60Var.f39788f.e() && n60Var.h() == 0) {
                    p60Var.f40379s.e(false, true);
                }
                n60Var.l();
                return;
            default:
                fk0 fk0Var = (fk0) this.f43642b;
                if (fk0Var.f37367f == null && !fk0Var.h.e()) {
                    fk0Var.f37368n.f33509c.c();
                }
                fk0Var.l();
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11;
        wf.d dVar;
        int i12 = this.f43641a;
        Object obj = this.f43642b;
        switch (i12) {
            case 1:
                ((a3.i0) obj).run();
                return;
            case 12:
                ((y60) obj).U(true);
                return;
            case 14:
                Pattern pattern = LaunchActivity.E1;
                AndroidUtilities.addToClipboard((StringBuilder) obj);
                return;
            case 17:
                rd0 rd0Var = (rd0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", rd0Var.I);
                bundle.putString("ephone", rd0Var.J);
                bundle.putString("phoneFormated", rd0Var.L);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = rd0Var.L;
                tL_auth_resetLoginEmail.phone_code_hash = rd0Var.M;
                rd0Var.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new id0(rd0Var, bundle, tL_auth_resetLoginEmail, 1), 10);
                return;
            case 18:
                be0 be0Var = (be0) obj;
                ig0.n0(be0Var.f36068y, be0Var.f36065s, be0Var.v, be0Var.f36066w);
                return;
            case 19:
                ve0 ve0Var = (ve0) obj;
                ig0 ig0Var = ve0Var.G;
                ig0Var.r1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i11 = ((org.telegram.ui.ActionBar.o2) ig0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(deleteaccount, new l(ve0Var, 13), 10);
                return;
            case 25:
                ((org.telegram.messenger.yi) obj).run();
                return;
            case 27:
                nk0 nk0Var = ((jk0) obj).f38597b;
                SparseArray sparseArray = nk0Var.J;
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    lk0 lk0Var = (lk0) sparseArray.valueAt(i13);
                    TLRPC.Document document = lk0Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        wf.c cVar = nk0Var.getMediaDataController().ringtoneDataStore;
                        TLRPC.Document document2 = lk0Var.e;
                        ArrayList arrayList2 = cVar.e;
                        if (document2 != null) {
                            if (!cVar.f49385f) {
                                cVar.f(true);
                                cVar.f49385f = true;
                            }
                            int i14 = 0;
                            while (true) {
                                if (i14 < arrayList2.size()) {
                                    if (((wf.b) arrayList2.get(i14)).f49377a != null && ((wf.b) arrayList2.get(i14)).f49377a.f20349id == document2.f20349id) {
                                        arrayList2.remove(i14);
                                    } else {
                                        i14++;
                                    }
                                }
                            }
                        }
                    }
                    if (lk0Var.f39270g != null && (dVar = nk0Var.getMediaDataController().ringtoneUploaderHashMap.get(lk0Var.f39270g)) != null) {
                        dVar.f49388c = true;
                        dVar.a();
                        int i15 = dVar.f49386a;
                        FileLoader fileLoader = FileLoader.getInstance(i15);
                        String str = dVar.f49387b;
                        fileLoader.cancelFileUpload(str, false);
                        MediaDataController.getInstance(i15).onRingtoneUploaded(str, null, true);
                    }
                    if (lk0Var == nk0Var.H) {
                        nk0Var.N = null;
                        nk0Var.H = (lk0) nk0Var.f39913b.get(0);
                        nk0Var.I = true;
                    }
                    nk0Var.f39912a.remove(lk0Var);
                    nk0Var.f39914c.remove(lk0Var);
                }
                nk0Var.getMediaDataController().ringtoneDataStore.h();
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i16);
                    TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    saveringtone.f20550id = tL_inputDocument;
                    tL_inputDocument.f20355id = document3.f20349id;
                    tL_inputDocument.access_hash = document3.access_hash;
                    byte[] bArr = document3.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    saveringtone.unsave = true;
                    nk0Var.getConnectionsManager().sendRequest(saveringtone, new ci.d6(8));
                }
                nk0.W(nk0Var);
                nk0Var.d0();
                nk0Var.f39915f.l();
                c2Var.dismiss();
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                passcodeActivity.getClass();
                SharedConfig.passcodeHash = "";
                SharedConfig.appLocked = false;
                SharedConfig.saveConfig();
                passcodeActivity.getMediaDataController().buildShortcuts();
                int childCount = passcodeActivity.f33529c.getChildCount();
                int i17 = 0;
                while (true) {
                    if (i17 < childCount) {
                        View childAt = passcodeActivity.f33529c.getChildAt(i17);
                        if (childAt instanceof org.telegram.ui.Cells.ca) {
                            org.telegram.ui.ActionBar.r6.W(((org.telegram.ui.Cells.ca) childAt).getTextView(), org.telegram.ui.ActionBar.k6.E6, null);
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
    public void h(org.telegram.ui.Components.pe0 pe0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f43642b;
        ArrayList arrayList = ExternalActionActivity.f33432x;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.f33438n, externalActionActivity.v, true, externalActionActivity.f33439r, externalActionActivity.f33440s);
            externalActionActivity.h = null;
        }
        externalActionActivity.f33436c.d0();
        if (AndroidUtilities.isTablet()) {
            externalActionActivity.d.d0();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, pe0Var);
    }

    @Override
    public void i(int i10) {
        DataAutoDownloadActivity dataAutoDownloadActivity = ((yt) this.f43642b).d;
        DownloadController.Preset preset = (DownloadController.Preset) dataAutoDownloadActivity.f33414c.get(i10);
        if (preset == dataAutoDownloadActivity.f33421y) {
            dataAutoDownloadActivity.e = 0;
        } else if (preset == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.e = 1;
        } else if (preset == dataAutoDownloadActivity.F) {
            dataAutoDownloadActivity.e = 2;
        } else {
            dataAutoDownloadActivity.e = 3;
        }
        int i11 = dataAutoDownloadActivity.f33415f;
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
            s4.b1 K = dataAutoDownloadActivity.f33413b.K(DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            if (K != null) {
                dataAutoDownloadActivity.f33412a.v(K, DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            }
        }
        dataAutoDownloadActivity.I = true;
    }

    @Override
    public void j(KeyEvent keyEvent) {
        mz mzVar = (mz) this.f43642b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && mzVar.f37995x.isShowing()) {
            mzVar.f37995x.d(true);
        }
    }

    @Override
    public void o(int i10, float f7, float f10, ne.e eVar) {
        tg0 tg0Var = (tg0) this.f43642b;
        tg0Var.getClass();
        tg0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f7));
        tg0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f7));
    }

    @Override
    public int run() {
        return ((FiltersSetupActivity) this.f43642b).f33449w;
    }

    @Override
    public a0.h x() {
        switch (this.f43641a) {
            case 11:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f43641a) {
            case 6:
                wy wyVar = (wy) this.f43642b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                if (((org.telegram.ui.Components.m61) obj).d != 1 || wyVar.f43454b == null) {
                    return;
                }
                boolean z10 = !wyVar.f43455c;
                wyVar.f43455c = z10;
                ai.r5 r5Var = wyVar.f43456f;
                if (r5Var != null) {
                    r5Var.run(Boolean.valueOf(z10), Boolean.valueOf(wyVar.d));
                }
                ((org.telegram.ui.Cells.w8) view).setChecked(wyVar.f43455c);
                wyVar.e.Z2.N(true);
                return;
            case 10:
                org.telegram.ui.Components.mm0.P0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((org.telegram.ui.Components.mm0) this.f43642b).f28705n2);
                return;
            default:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.W((PasskeysActivity) this.f43642b, (org.telegram.ui.Components.m61) obj, (View) obj2);
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        ((a3.h0) this.f43642b).run();
        return true;
    }

    private final void b(ArrayList arrayList) {
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
