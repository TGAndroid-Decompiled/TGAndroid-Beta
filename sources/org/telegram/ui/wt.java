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
public final class wt implements org.telegram.ui.Components.av0, org.telegram.ui.ActionBar.b2, MessagesController.ErrorDelegate, org.telegram.ui.Components.dg0, Utilities.Callback5, org.telegram.ui.Components.xc0, org.telegram.ui.ActionBar.m1, org.telegram.ui.Components.jk0, of.u1, org.telegram.ui.Components.ok0, r0.o, org.telegram.ui.Components.nk0, pt, td.b, dj0 {
    public final int f44256a;
    public final Object f44257b;

    public wt(Object obj, int i9) {
        this.f44256a = i9;
        this.f44257b = obj;
    }

    @Override
    public void H0(ArrayList arrayList) {
        int i9 = this.f44256a;
    }

    @Override
    public void J0(int i9, float f10, float f11, td.c cVar) {
        pg0 pg0Var = (pg0) this.f44257b;
        pg0Var.getClass();
        pg0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f10));
        pg0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f10));
    }

    @Override
    public r0.m1 L0(View view, r0.m1 m1Var) {
        ba0 ba0Var = (ba0) this.f44257b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        if (!ba0Var.f36799a.equals(defaultWindowInsets)) {
            ba0Var.f36799a = defaultWindowInsets;
            ba0Var.requestLayout();
        }
        int childCount = ba0Var.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            r0.j0.b(ba0Var.getChildAt(i9), m1Var);
        }
        return m1Var;
    }

    @Override
    public a0.h O() {
        switch (this.f44256a) {
            case 11:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean a(int i9, View view) {
        int i10;
        int i11;
        switch (this.f44256a) {
            case 13:
                return LanguageSelectActivity.U((LanguageSelectActivity) this.f44257b, view, i9);
            case 23:
                final ti0 ti0Var = (ti0) this.f44257b;
                if (i9 >= ti0Var.E && i9 < ti0Var.F) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) ti0Var.f43020x.get(i9 - ti0Var.E);
                    final long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
                    final boolean isUserDialog = DialogObject.isUserDialog(dialogId);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ti0Var.getParentActivity(), 0, ti0Var.getResourceProvider());
                    if (messageObject.isStory()) {
                        if (isUserDialog) {
                            i10 = R.string.OpenProfile;
                        } else {
                            i10 = R.string.OpenChannel2;
                        }
                        arrayList.add(LocaleController.getString(i10));
                        if (isUserDialog) {
                            i11 = R.drawable.msg_openprofile;
                        } else {
                            i11 = R.drawable.msg_channel;
                        }
                        arrayList3.add(Integer.valueOf(i11));
                    } else {
                        arrayList.add(LocaleController.getString(R.string.ViewMessage));
                        arrayList3.add(Integer.valueOf(R.drawable.msg_msgbubble3));
                    }
                    arrayList2.add(0);
                    int[] intArray = AndroidUtilities.toIntArray(arrayList3);
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i12) {
                            org.telegram.ui.ActionBar.o2 R9;
                            org.telegram.ui.ActionBar.o2 o2Var = ti0.this;
                            o2Var.getClass();
                            MessageObject messageObject2 = messageObject;
                            boolean isStory = messageObject2.isStory();
                            boolean z10 = isUserDialog;
                            long j10 = dialogId;
                            if (isStory) {
                                if (z10) {
                                    R9 = ProfileActivity.m4(j10);
                                } else {
                                    R9 = qn.R9(j10);
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
                                o2Var.presentFragment(new qn(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                    c2Var.L = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    c2Var.M = intArray;
                    c2Var.I = onClickListener;
                    ti0Var.showDialog(c2Var);
                }
                return false;
            default:
                kk0 kk0Var = (kk0) this.f44257b;
                kk0Var.getClass();
                if (view instanceof jk0) {
                    jk0 jk0Var = (jk0) view;
                    kk0Var.Y(jk0Var.f39522e);
                    jk0Var.performHapticFeedback(0);
                }
                return false;
        }
    }

    @Override
    public void a1(lt ltVar) {
        eg0 eg0Var = (eg0) this.f44257b;
        eg0Var.E = true;
        String str = ltVar.f40227c;
        eg0Var.f37932a.setText(str);
        eg0Var.v(str, ltVar);
        eg0Var.f37942y = ltVar;
        eg0Var.f37941x = 0;
        eg0Var.E = false;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putString("phone_code_last_matched_" + ltVar.f40227c, ltVar.d).apply();
        AndroidUtilities.runOnUIThread(new uf0(eg0Var, 4), 300L);
        bg0 bg0Var = eg0Var.f37933b;
        bg0Var.requestFocus();
        bg0Var.setSelection(bg0Var.length());
    }

    @Override
    public void b(Canvas canvas) {
        ((Layout) this.f44257b).draw(canvas);
    }

    @Override
    public void c(float f10, float f11, int i9, View view) {
        int T;
        boolean[] zArr;
        switch (this.f44256a) {
            case 16:
                sb0 sb0Var = (sb0) this.f44257b;
                ArrayList arrayList = sb0Var.f42656s;
                if (view != null && i9 >= 0 && i9 < arrayList.size()) {
                    mb0 mb0Var = (mb0) arrayList.get(i9);
                    int i10 = mb0Var.f48814a;
                    int i11 = mb0Var.f40376e;
                    if (i10 != 3 && i10 != 4) {
                        if (i10 == 5 && mb0Var.f40377f == 1) {
                            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                            boolean z10 = globalMainSettings.getBoolean("view_animations", true);
                            SharedPreferences.Editor edit = globalMainSettings.edit();
                            boolean z11 = !z10;
                            edit.putBoolean("view_animations", z11);
                            SharedConfig.setAnimationsEnabled(z11);
                            edit.commit();
                            ((org.telegram.ui.Cells.p8) view).setChecked(z11);
                            return;
                        }
                        return;
                    } else if (LiteMode.isPowerSaverApplied()) {
                        sb0Var.f42652e = org.telegram.ui.Components.oc.a0(sb0Var).L(new org.telegram.ui.Components.q9(0.1f, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
                        return;
                    } else if (mb0Var.f48814a == 3 && Integer.bitCount(i11) > 1 && (!LocaleController.isRTL ? f10 < view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f10 > AndroidUtilities.dp(75.0f)) && (T = sb0Var.T(i11)) != -1) {
                        sb0Var.f42654n[T] = !zArr[T];
                        sb0Var.X();
                        sb0Var.W();
                        return;
                    } else {
                        LiteMode.toggleFlag(i11, !LiteMode.isEnabledSetting(i11));
                        sb0Var.X();
                        return;
                    }
                }
                return;
            default:
                hg0.T((hg0) this.f44257b, i9);
                return;
        }
    }

    @Override
    public void e(int i9) {
        switch (this.f44256a) {
            case 11:
                i60 i60Var = (i60) this.f44257b;
                k60 k60Var = i60Var.E;
                k60Var.p0(i60Var.D);
                if (i60Var.h == null && !i60Var.f39034f.e() && i60Var.h() == 0) {
                    k60Var.f39748s.e(false, true);
                }
                i60Var.l();
                return;
            default:
                bk0 bk0Var = (bk0) this.f44257b;
                if (bk0Var.f36898f == null && !bk0Var.h.e()) {
                    bk0Var.f36899n.f35545c.c();
                }
                bk0Var.l();
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        int i10;
        bf.e eVar;
        int i11 = this.f44256a;
        Object obj = this.f44257b;
        switch (i11) {
            case 1:
                ((e5.w) obj).run();
                return;
            case 12:
                ((t60) obj).T(true);
                return;
            case 14:
                Pattern pattern = LaunchActivity.f35493x1;
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
                pd0Var.S.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new fd0(pd0Var, bundle, tL_auth_resetLoginEmail, 1), 10);
                return;
            case 18:
                yd0 yd0Var = (yd0) obj;
                fg0.m0(yd0Var.f44841y, yd0Var.f44838s, yd0Var.v, yd0Var.f44839w);
                return;
            case 19:
                re0 re0Var = (re0) obj;
                fg0 fg0Var = re0Var.A;
                fg0Var.n1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i10 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
                ConnectionsManager.getInstance(i10).sendRequest(deleteaccount, new m(re0Var, 12), 10);
                return;
            case 26:
                ((org.telegram.messenger.jj) obj).run();
                return;
            case 28:
                kk0 kk0Var = ((gk0) obj).f38562b;
                SparseArray sparseArray = kk0Var.F;
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                    ik0 ik0Var = (ik0) sparseArray.valueAt(i12);
                    TLRPC.Document document = ik0Var.f39202e;
                    if (document != null) {
                        arrayList.add(document);
                        bf.d dVar = kk0Var.getMediaDataController().ringtoneDataStore;
                        TLRPC.Document document2 = ik0Var.f39202e;
                        ArrayList arrayList2 = dVar.f1680e;
                        if (document2 != null) {
                            if (!dVar.f1681f) {
                                dVar.f(true);
                                dVar.f1681f = true;
                            }
                            int i13 = 0;
                            while (true) {
                                if (i13 < arrayList2.size()) {
                                    if (((bf.c) arrayList2.get(i13)).f1672a != null && ((bf.c) arrayList2.get(i13)).f1672a.f22386id == document2.f22386id) {
                                        arrayList2.remove(i13);
                                    } else {
                                        i13++;
                                    }
                                }
                            }
                        }
                    }
                    if (ik0Var.f39204g != null && (eVar = kk0Var.getMediaDataController().ringtoneUploaderHashMap.get(ik0Var.f39204g)) != null) {
                        eVar.f1684c = true;
                        eVar.a();
                        int i14 = eVar.f1682a;
                        FileLoader fileLoader = FileLoader.getInstance(i14);
                        String str = eVar.f1683b;
                        fileLoader.cancelFileUpload(str, false);
                        MediaDataController.getInstance(i14).onRingtoneUploaded(str, null, true);
                    }
                    if (ik0Var == kk0Var.D) {
                        kk0Var.J = null;
                        kk0Var.D = (ik0) kk0Var.f39855b.get(0);
                        kk0Var.E = true;
                    }
                    kk0Var.f39854a.remove(ik0Var);
                    kk0Var.f39856c.remove(ik0Var);
                }
                kk0Var.getMediaDataController().ringtoneDataStore.h();
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i15);
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
                    kk0Var.getConnectionsManager().sendRequest(saveringtone, new ih.q5(5));
                }
                kk0.V(kk0Var);
                kk0Var.b0();
                kk0Var.f39858f.l();
                c2Var.dismiss();
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                passcodeActivity.getClass();
                SharedConfig.passcodeHash = "";
                SharedConfig.appLocked = false;
                SharedConfig.saveConfig();
                passcodeActivity.getMediaDataController().buildShortcuts();
                int childCount = passcodeActivity.f35567c.getChildCount();
                int i16 = 0;
                while (true) {
                    if (i16 < childCount) {
                        View childAt = passcodeActivity.f35567c.getChildAt(i16);
                        if (childAt instanceof org.telegram.ui.Cells.ba) {
                            ((org.telegram.ui.Cells.ba) childAt).setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E6, false));
                        } else {
                            i16++;
                        }
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                passcodeActivity.finishFragment();
                return;
        }
    }

    @Override
    public boolean f1(View view) {
        switch (this.f44256a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void g0(View view, float f10, float f11) {
        int i9 = this.f44256a;
    }

    @Override
    public void h(int i9) {
        DataAutoDownloadActivity dataAutoDownloadActivity = ((xt) this.f44257b).d;
        DownloadController.Preset preset = (DownloadController.Preset) dataAutoDownloadActivity.f35445c.get(i9);
        if (preset == dataAutoDownloadActivity.f35453y) {
            dataAutoDownloadActivity.f35446e = 0;
        } else if (preset == dataAutoDownloadActivity.A) {
            dataAutoDownloadActivity.f35446e = 1;
        } else if (preset == dataAutoDownloadActivity.B) {
            dataAutoDownloadActivity.f35446e = 2;
        } else {
            dataAutoDownloadActivity.f35446e = 3;
        }
        int i10 = dataAutoDownloadActivity.f35447f;
        if (i10 == 0) {
            DownloadController.getInstance(DataAutoDownloadActivity.c0(dataAutoDownloadActivity)).currentMobilePreset = dataAutoDownloadActivity.f35446e;
        } else if (i10 == 1) {
            DownloadController.getInstance(DataAutoDownloadActivity.d0(dataAutoDownloadActivity)).currentWifiPreset = dataAutoDownloadActivity.f35446e;
        } else {
            DownloadController.getInstance(DataAutoDownloadActivity.e0(dataAutoDownloadActivity)).currentRoamingPreset = dataAutoDownloadActivity.f35446e;
        }
        SharedPreferences.Editor edit = MessagesController.getMainSettings(DataAutoDownloadActivity.f0(dataAutoDownloadActivity)).edit();
        edit.putInt(dataAutoDownloadActivity.G, dataAutoDownloadActivity.f35446e);
        edit.commit();
        DownloadController.getInstance(DataAutoDownloadActivity.g0(dataAutoDownloadActivity)).checkAutodownloadSettings();
        for (int i11 = 0; i11 < 4; i11++) {
            f2.q1 K = dataAutoDownloadActivity.f35444b.K(DataAutoDownloadActivity.h0(dataAutoDownloadActivity) + i11);
            if (K != null) {
                dataAutoDownloadActivity.f35443a.v(K, DataAutoDownloadActivity.h0(dataAutoDownloadActivity) + i11);
            }
        }
        dataAutoDownloadActivity.E = true;
    }

    @Override
    public void i(org.telegram.ui.Components.yc0 yc0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f44257b;
        ArrayList arrayList = ExternalActionActivity.f35465x;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.f35472n, externalActionActivity.v, true, externalActionActivity.f35473r, externalActionActivity.f35474s);
            externalActionActivity.h = null;
        }
        externalActionActivity.f35469c.c0();
        if (AndroidUtilities.isTablet()) {
            externalActionActivity.d.c0();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, yc0Var);
    }

    @Override
    public void k(KeyEvent keyEvent) {
        jz jzVar = (jz) this.f44257b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && jzVar.f38054x.isShowing()) {
            jzVar.f38054x.d(true);
        }
    }

    @Override
    public boolean p0(int i9) {
        switch (this.f44256a) {
            case 11:
                return true;
            default:
                return true;
        }
    }

    @Override
    public int run() {
        return ((FiltersSetupActivity) this.f44257b).f35484w;
    }

    @Override
    public a0.h y() {
        switch (this.f44256a) {
            case 11:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f44256a) {
            case 6:
                vy vyVar = (vy) this.f44257b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                if (((org.telegram.ui.Components.l41) obj).d != 1 || vyVar.f43608b == null) {
                    return;
                }
                boolean z10 = !vyVar.f43609c;
                vyVar.f43609c = z10;
                bg.y0 y0Var = vyVar.f43611f;
                if (y0Var != null) {
                    y0Var.run(Boolean.valueOf(z10), Boolean.valueOf(vyVar.d));
                }
                ((org.telegram.ui.Cells.t8) view).setChecked(vyVar.f43609c);
                vyVar.f43610e.U2.N(true);
                return;
            default:
                org.telegram.ui.Components.wk0.N0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((org.telegram.ui.Components.wk0) this.f44257b).f34260l2);
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        ((e5.y) this.f44257b).run();
        return true;
    }

    private final void j(ArrayList arrayList) {
    }

    private final void l(ArrayList arrayList) {
    }

    @Override
    public void m() {
    }

    @Override
    public void B(float f10, int i9) {
    }

    private final void d(View view, float f10, float f11) {
    }

    private final void g(View view, float f10, float f11) {
    }
}
