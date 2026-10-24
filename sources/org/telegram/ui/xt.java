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
public final class xt implements org.telegram.ui.Components.qw0, org.telegram.ui.ActionBar.z1, MessagesController.ErrorDelegate, org.telegram.ui.Components.qh0, Utilities.Callback5, org.telegram.ui.Components.le0, org.telegram.ui.ActionBar.k1, org.telegram.ui.Components.wl0, hg.z1, org.telegram.ui.Components.bm0, r0.n, org.telegram.ui.Components.am0, qt, ne.d, gj0 {
    public final int f43672a;
    public final Object f43673b;

    public xt(Object obj, int i10) {
        this.f43672a = i10;
        this.f43673b = obj;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        ga0 ga0Var = (ga0) this.f43673b;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        if (!ga0Var.f37516a.equals(defaultWindowInsets)) {
            ga0Var.f37516a = defaultWindowInsets;
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
        switch (this.f43672a) {
            case 11:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void L0(lt ltVar) {
        gg0 gg0Var = (gg0) this.f43673b;
        gg0Var.K = true;
        String str = ltVar.f39377c;
        gg0Var.f37561a.setText(str);
        gg0Var.s(str, ltVar);
        gg0Var.F = ltVar;
        gg0Var.E = 0;
        gg0Var.K = false;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putString("phone_code_last_matched_" + ltVar.f39377c, ltVar.d).apply();
        AndroidUtilities.runOnUIThread(new wf0(gg0Var, 4), 300L);
        dg0 dg0Var = gg0Var.f37563b;
        dg0Var.requestFocus();
        dg0Var.setSelection(dg0Var.length());
    }

    @Override
    public boolean O(int i10) {
        switch (this.f43672a) {
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
        int i10 = this.f43672a;
    }

    @Override
    public void a(Canvas canvas) {
        ((Layout) this.f43673b).draw(canvas);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        int U;
        boolean[] zArr;
        wb0 wb0Var = (wb0) this.f43673b;
        ArrayList arrayList = wb0Var.f42984s;
        if (view != null && i10 >= 0 && i10 < arrayList.size()) {
            qb0 qb0Var = (qb0) arrayList.get(i10);
            int i11 = qb0Var.f44712a;
            int i12 = qb0Var.e;
            if (i11 != 3 && i11 != 4) {
                if (i11 == 5 && qb0Var.f40763f == 1) {
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
                wb0Var.e = org.telegram.ui.Components.vc.a0(wb0Var).L(new org.telegram.ui.Components.w9(0.1f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
            } else if (qb0Var.f44712a == 3 && Integer.bitCount(i12) > 1 && (!LocaleController.isRTL ? f7 < view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f7 > AndroidUtilities.dp(75.0f)) && (U = wb0Var.U(i12)) != -1) {
                wb0Var.f42982n[U] = !zArr[U];
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
        switch (this.f43672a) {
            case 13:
                return LanguageSelectActivity.V((LanguageSelectActivity) this.f43673b, view, i10);
            case 22:
                final xi0 xi0Var = (xi0) this.f43673b;
                if (i10 >= xi0Var.I && i10 < xi0Var.J) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) xi0Var.f43627x.get(i10 - xi0Var.I);
                    final long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
                    final boolean isUserDialog = DialogObject.isUserDialog(dialogId);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xi0Var.getParentActivity(), 0, xi0Var.getResourceProvider());
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
                            org.telegram.ui.ActionBar.o2 o2Var = xi0.this;
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
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                    c2Var.P = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    c2Var.Q = intArray;
                    c2Var.M = onClickListener;
                    xi0Var.showDialog(c2Var);
                }
                return false;
            default:
                mk0 mk0Var = (mk0) this.f43673b;
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
    public void f(int i10) {
        switch (this.f43672a) {
            case 11:
                n60 n60Var = (n60) this.f43673b;
                p60 p60Var = n60Var.I;
                p60Var.q0(n60Var.H);
                if (n60Var.h == null && !n60Var.f39738f.e() && n60Var.h() == 0) {
                    p60Var.f40371s.e(false, true);
                }
                n60Var.l();
                return;
            default:
                ek0 ek0Var = (ek0) this.f43673b;
                if (ek0Var.f36943f == null && !ek0Var.h.e()) {
                    ek0Var.f36944n.f33511c.c();
                }
                ek0Var.l();
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11;
        wf.d dVar;
        int i12 = this.f43672a;
        Object obj = this.f43673b;
        switch (i12) {
            case 1:
                ((a3.i0) obj).run();
                return;
            case 12:
                ((y60) obj).U(true);
                return;
            case 14:
                Pattern pattern = LaunchActivity.D1;
                AndroidUtilities.addToClipboard((StringBuilder) obj);
                return;
            case 17:
                qd0 qd0Var = (qd0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", qd0Var.I);
                bundle.putString("ephone", qd0Var.J);
                bundle.putString("phoneFormated", qd0Var.L);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = qd0Var.L;
                tL_auth_resetLoginEmail.phone_code_hash = qd0Var.M;
                qd0Var.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new hd0(qd0Var, bundle, tL_auth_resetLoginEmail, 1), 10);
                return;
            case 18:
                ae0 ae0Var = (ae0) obj;
                hg0.n0(ae0Var.f35746y, ae0Var.f35743s, ae0Var.v, ae0Var.f35744w);
                return;
            case 19:
                ue0 ue0Var = (ue0) obj;
                hg0 hg0Var = ue0Var.G;
                hg0Var.r1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i11 = ((org.telegram.ui.ActionBar.o2) hg0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(deleteaccount, new l(ue0Var, 13), 10);
                return;
            case 25:
                ((org.telegram.messenger.zi) obj).run();
                return;
            case 27:
                mk0 mk0Var = ((ik0) obj).f38322b;
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
                            if (!cVar.f49384f) {
                                cVar.f(true);
                                cVar.f49384f = true;
                            }
                            int i14 = 0;
                            while (true) {
                                if (i14 < arrayList2.size()) {
                                    if (((wf.b) arrayList2.get(i14)).f49376a != null && ((wf.b) arrayList2.get(i14)).f49376a.f20350id == document2.f20350id) {
                                        arrayList2.remove(i14);
                                    } else {
                                        i14++;
                                    }
                                }
                            }
                        }
                    }
                    if (kk0Var.f38935g != null && (dVar = mk0Var.getMediaDataController().ringtoneUploaderHashMap.get(kk0Var.f38935g)) != null) {
                        dVar.f49387c = true;
                        dVar.a();
                        int i15 = dVar.f49385a;
                        FileLoader fileLoader = FileLoader.getInstance(i15);
                        String str = dVar.f49386b;
                        fileLoader.cancelFileUpload(str, false);
                        MediaDataController.getInstance(i15).onRingtoneUploaded(str, null, true);
                    }
                    if (kk0Var == mk0Var.H) {
                        mk0Var.N = null;
                        mk0Var.H = (kk0) mk0Var.f39607b.get(0);
                        mk0Var.I = true;
                    }
                    mk0Var.f39606a.remove(kk0Var);
                    mk0Var.f39608c.remove(kk0Var);
                }
                mk0Var.getMediaDataController().ringtoneDataStore.h();
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i16);
                    TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    saveringtone.f20551id = tL_inputDocument;
                    tL_inputDocument.f20356id = document3.f20350id;
                    tL_inputDocument.access_hash = document3.access_hash;
                    byte[] bArr = document3.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    saveringtone.unsave = true;
                    mk0Var.getConnectionsManager().sendRequest(saveringtone, new ci.d6(8));
                }
                mk0.W(mk0Var);
                mk0Var.d0();
                mk0Var.f39609f.l();
                c2Var.dismiss();
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                passcodeActivity.getClass();
                SharedConfig.passcodeHash = "";
                SharedConfig.appLocked = false;
                SharedConfig.saveConfig();
                passcodeActivity.getMediaDataController().buildShortcuts();
                int childCount = passcodeActivity.f33531c.getChildCount();
                int i17 = 0;
                while (true) {
                    if (i17 < childCount) {
                        View childAt = passcodeActivity.f33531c.getChildAt(i17);
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
    public void h(org.telegram.ui.Components.ne0 ne0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f43673b;
        ArrayList arrayList = ExternalActionActivity.f33434x;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.f33440n, externalActionActivity.v, true, externalActionActivity.f33441r, externalActionActivity.f33442s);
            externalActionActivity.h = null;
        }
        externalActionActivity.f33438c.d0();
        if (AndroidUtilities.isTablet()) {
            externalActionActivity.d.d0();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, ne0Var);
    }

    @Override
    public void i(int i10) {
        DataAutoDownloadActivity dataAutoDownloadActivity = ((yt) this.f43673b).d;
        DownloadController.Preset preset = (DownloadController.Preset) dataAutoDownloadActivity.f33416c.get(i10);
        if (preset == dataAutoDownloadActivity.f33423y) {
            dataAutoDownloadActivity.e = 0;
        } else if (preset == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.e = 1;
        } else if (preset == dataAutoDownloadActivity.F) {
            dataAutoDownloadActivity.e = 2;
        } else {
            dataAutoDownloadActivity.e = 3;
        }
        int i11 = dataAutoDownloadActivity.f33417f;
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
            s4.b1 K = dataAutoDownloadActivity.f33415b.K(DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            if (K != null) {
                dataAutoDownloadActivity.f33414a.v(K, DataAutoDownloadActivity.i0(dataAutoDownloadActivity) + i12);
            }
        }
        dataAutoDownloadActivity.I = true;
    }

    @Override
    public void j(KeyEvent keyEvent) {
        mz mzVar = (mz) this.f43673b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && mzVar.f38080x.isShowing()) {
            mzVar.f38080x.d(true);
        }
    }

    @Override
    public void o(int i10, float f7, float f10, ne.e eVar) {
        sg0 sg0Var = (sg0) this.f43673b;
        sg0Var.getClass();
        sg0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f7));
        sg0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f7));
    }

    @Override
    public int run() {
        return ((FiltersSetupActivity) this.f43673b).f33451w;
    }

    @Override
    public a0.h x() {
        switch (this.f43672a) {
            case 11:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f43672a) {
            case 6:
                wy wyVar = (wy) this.f43673b;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                if (((org.telegram.ui.Components.l61) obj).d != 1 || wyVar.f43429b == null) {
                    return;
                }
                boolean z10 = !wyVar.f43430c;
                wyVar.f43430c = z10;
                ai.r5 r5Var = wyVar.f43431f;
                if (r5Var != null) {
                    r5Var.run(Boolean.valueOf(z10), Boolean.valueOf(wyVar.d));
                }
                ((org.telegram.ui.Cells.w8) view).setChecked(wyVar.f43430c);
                wyVar.e.Z2.N(true);
                return;
            case 10:
                org.telegram.ui.Components.lm0.P0((Canvas) obj, (RectF) obj2, ((Float) obj3).floatValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue(), ((org.telegram.ui.Components.lm0) this.f43673b).f28396n2);
                return;
            default:
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                PasskeysActivity.W((PasskeysActivity) this.f43673b, (org.telegram.ui.Components.l61) obj, (View) obj2);
                return;
        }
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        ((a3.h0) this.f43673b).run();
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
