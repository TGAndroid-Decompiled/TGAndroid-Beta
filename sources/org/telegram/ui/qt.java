package org.telegram.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.Layout;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
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
public final class qt implements org.telegram.ui.Components.am0, org.telegram.ui.Components.yw0, org.telegram.ui.ActionBar.b2, MessagesController.ErrorDelegate, org.telegram.ui.Components.qh0, Utilities.Callback5, org.telegram.ui.Components.je0, org.telegram.ui.ActionBar.m1, org.telegram.ui.Components.wl0, ig.z1, org.telegram.ui.Components.bm0, r0.n, nt, oe.d, ej0 {
    public final int f42911a;
    public final Object f42912b;

    public qt(Object obj, int i10) {
        this.f42911a = i10;
        this.f42912b = obj;
    }

    @Override
    public void E(int i10, float f7, float f10, oe.e eVar) {
        rg0 rg0Var = (rg0) this.f42912b;
        rg0Var.getClass();
        rg0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f7));
        rg0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f7));
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        switch (this.f42911a) {
            case 16:
                fa0 fa0Var = (fa0) this.f42912b;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                if (!fa0Var.f39320a.equals(defaultWindowInsets)) {
                    fa0Var.f39320a = defaultWindowInsets;
                    fa0Var.requestLayout();
                }
                int childCount = fa0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    r0.i0.b(fa0Var.getChildAt(i10), k1Var);
                }
                return k1Var;
            default:
                xj0 xj0Var = (xj0) this.f42912b;
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                xj0Var.f45788x = defaultWindowInsets2.d;
                xj0Var.K = k1Var.f47115a.f(8).d;
                view.setPadding(defaultWindowInsets2.f13450a, view.getPaddingTop(), defaultWindowInsets2.f13452c, 0);
                xj0Var.p0(false);
                view.post(new qj0(xj0Var, 0));
                return r0.k1.f47114b;
        }
    }

    @Override
    public a0.h U() {
        switch (this.f42911a) {
            case 12:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void Y0(jt jtVar) {
        fg0 fg0Var = (fg0) this.f42912b;
        fg0Var.K = true;
        String str = jtVar.f40742c;
        fg0Var.f39358a.setText(str);
        fg0Var.s(str, jtVar);
        fg0Var.F = jtVar;
        fg0Var.E = 0;
        fg0Var.K = false;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putString("phone_code_last_matched_" + jtVar.f40742c, jtVar.d).apply();
        AndroidUtilities.runOnUIThread(new uf0(fg0Var, 4), 300L);
        cg0 cg0Var = fg0Var.f39360b;
        cg0Var.requestFocus();
        cg0Var.setSelection(cg0Var.length());
    }

    @Override
    public void a(Canvas canvas) {
        ((Layout) this.f42912b).draw(canvas);
    }

    @Override
    public boolean c(int i10, View view) {
        int i11;
        int i12;
        switch (this.f42911a) {
            case 14:
                return LanguageSelectActivity.W((LanguageSelectActivity) this.f42912b, view, i10);
            case 23:
                final vi0 vi0Var = (vi0) this.f42912b;
                if (i10 >= vi0Var.I && i10 < vi0Var.J) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) vi0Var.f44830x.get(i10 - vi0Var.I);
                    final long dialogId = MessageObject.getDialogId(messageObject.messageOwner);
                    final boolean isUserDialog = DialogObject.isUserDialog(dialogId);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vi0Var.getParentActivity(), 0, vi0Var.getResourceProvider());
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
                            org.telegram.ui.ActionBar.r2 ba2;
                            org.telegram.ui.ActionBar.r2 r2Var = vi0.this;
                            r2Var.getClass();
                            MessageObject messageObject2 = messageObject;
                            boolean isStory = messageObject2.isStory();
                            boolean z10 = isUserDialog;
                            long j10 = dialogId;
                            if (isStory) {
                                if (z10) {
                                    ba2 = ProfileActivity.t4(j10);
                                } else {
                                    ba2 = un.ba(j10);
                                }
                                r2Var.presentFragment(ba2);
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
                            if (r2Var.getMessagesController().checkCanOpenChat(bundle, r2Var)) {
                                r2Var.presentFragment(new un(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
                    e2Var.P = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    e2Var.Q = intArray;
                    e2Var.M = onClickListener;
                    vi0Var.showDialog(e2Var);
                }
                return false;
            default:
                tk0 tk0Var = (tk0) this.f42912b;
                tk0Var.getClass();
                if (view instanceof sk0) {
                    sk0 sk0Var = (sk0) view;
                    tk0Var.a0(sk0Var.e);
                    sk0Var.performHapticFeedback(0);
                }
                return false;
        }
    }

    @Override
    public boolean c1(View view) {
        switch (this.f42911a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void e(float f7, float f10, int i10, View view) {
        org.telegram.ui.Components.t61 G;
        Object obj;
        long j10;
        int V;
        boolean[] zArr;
        switch (this.f42911a) {
            case 0:
                rt rtVar = (rt) this.f42912b;
                HashSet hashSet = rtVar.f43279b0;
                if (!rtVar.f43280c0 && (G = rtVar.f43281d0.G(i10 - 1)) != null && (obj = G.G) != null) {
                    if (obj instanceof TLRPC.User) {
                        j10 = ((TLRPC.User) obj).f22174id;
                    } else if (obj instanceof TLRPC.Chat) {
                        j10 = ((TLRPC.Chat) obj).f22027id;
                    } else {
                        return;
                    }
                    if (hashSet.contains(Long.valueOf(j10))) {
                        hashSet.remove(Long.valueOf(j10));
                    } else {
                        hashSet.add(Long.valueOf(j10));
                    }
                    if (view instanceof zg.l) {
                        ((zg.l) view).c(hashSet.contains(Long.valueOf(j10)), true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                DataAutoDownloadActivity.X((DataAutoDownloadActivity) this.f42912b, view, i10, f7);
                return;
            default:
                tb0 tb0Var = (tb0) this.f42912b;
                ArrayList arrayList = tb0Var.f43726s;
                if (view != null && i10 >= 0 && i10 < arrayList.size()) {
                    nb0 nb0Var = (nb0) arrayList.get(i10);
                    int i11 = nb0Var.f47037a;
                    int i12 = nb0Var.e;
                    if (i11 != 3 && i11 != 4) {
                        if (i11 == 5 && nb0Var.f41830f == 1) {
                            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                            boolean z10 = globalMainSettings.getBoolean("view_animations", true);
                            SharedPreferences.Editor edit = globalMainSettings.edit();
                            boolean z11 = !z10;
                            edit.putBoolean("view_animations", z11);
                            SharedConfig.setAnimationsEnabled(z11);
                            edit.commit();
                            ((org.telegram.ui.Cells.v8) view).setChecked(z11);
                        }
                    } else if (LiteMode.isPowerSaverApplied()) {
                        tb0Var.e = org.telegram.ui.Components.wc.b0(tb0Var).L(new org.telegram.ui.Components.ba(0.1f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
                        return;
                    } else if (nb0Var.f47037a == 3 && Integer.bitCount(i12) > 1 && (!LocaleController.isRTL ? f7 < view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f7 > AndroidUtilities.dp(75.0f)) && (V = tb0Var.V(i12)) != -1) {
                        tb0Var.f43724n[V] = !zArr[V];
                        tb0Var.Z();
                        tb0Var.Y();
                        return;
                    } else {
                        LiteMode.toggleFlag(i12, !LiteMode.isEnabledSetting(i12));
                        tb0Var.Z();
                    }
                    oi.q.f();
                    return;
                }
                return;
        }
    }

    @Override
    public void f(int i10) {
        switch (this.f42911a) {
            case 12:
                p60 p60Var = (p60) this.f42912b;
                r60 r60Var = p60Var.I;
                r60Var.r0(p60Var.H);
                if (p60Var.h == null && !p60Var.f42366f.e() && p60Var.h() == 0) {
                    r60Var.f43032s.e(false, true);
                }
                p60Var.l();
                return;
            default:
                lk0 lk0Var = (lk0) this.f42912b;
                if (lk0Var.f41291f == null && !lk0Var.h.e()) {
                    lk0Var.f41292n.f35572c.c();
                }
                lk0Var.l();
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        int i11;
        xf.d dVar;
        int i12 = this.f42911a;
        Object obj = this.f42912b;
        switch (i12) {
            case 3:
                ((a3.i0) obj).run();
                return;
            case 13:
                ((z60) obj).V(true);
                return;
            case 15:
                Pattern pattern = LaunchActivity.D1;
                AndroidUtilities.addToClipboard((StringBuilder) obj);
                return;
            case 18:
                od0 od0Var = (od0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", od0Var.I);
                bundle.putString("ephone", od0Var.J);
                bundle.putString("phoneFormated", od0Var.L);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = od0Var.L;
                tL_auth_resetLoginEmail.phone_code_hash = od0Var.M;
                od0Var.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new fd0(od0Var, bundle, tL_auth_resetLoginEmail, 1), 10);
                return;
            case 19:
                yd0 yd0Var = (yd0) obj;
                gg0.o0(yd0Var.f46041y, yd0Var.f46038s, yd0Var.v, yd0Var.f46039w);
                return;
            case 20:
                se0 se0Var = (se0) obj;
                gg0 gg0Var = se0Var.G;
                gg0Var.s1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i11 = ((org.telegram.ui.ActionBar.r2) gg0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(deleteaccount, new l(se0Var, 13), 10);
                return;
            case 27:
                ((org.telegram.messenger.bj) obj).run();
                return;
            default:
                tk0 tk0Var = ((pk0) obj).f42565b;
                SparseArray sparseArray = tk0Var.I;
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    rk0 rk0Var = (rk0) sparseArray.valueAt(i13);
                    TLRPC.Document document = rk0Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        xf.c cVar = tk0Var.getMediaDataController().ringtoneDataStore;
                        TLRPC.Document document2 = rk0Var.e;
                        ArrayList arrayList2 = cVar.e;
                        if (document2 != null) {
                            if (!cVar.f51744f) {
                                cVar.f(true);
                                cVar.f51744f = true;
                            }
                            int i14 = 0;
                            while (true) {
                                if (i14 < arrayList2.size()) {
                                    if (((xf.b) arrayList2.get(i14)).f51736a != null && ((xf.b) arrayList2.get(i14)).f51736a.f22033id == document2.f22033id) {
                                        arrayList2.remove(i14);
                                    } else {
                                        i14++;
                                    }
                                }
                            }
                        }
                    }
                    if (rk0Var.f43178g != null && (dVar = tk0Var.getMediaDataController().ringtoneUploaderHashMap.get(rk0Var.f43178g)) != null) {
                        dVar.f51747c = true;
                        dVar.a();
                        int i15 = dVar.f51745a;
                        FileLoader fileLoader = FileLoader.getInstance(i15);
                        String str = dVar.f51746b;
                        fileLoader.cancelFileUpload(str, false);
                        MediaDataController.getInstance(i15).onRingtoneUploaded(str, null, true);
                    }
                    if (rk0Var == tk0Var.G) {
                        tk0Var.M = null;
                        tk0Var.G = (rk0) tk0Var.f43854b.get(0);
                        tk0Var.H = true;
                    }
                    tk0Var.f43853a.remove(rk0Var);
                    tk0Var.f43855c.remove(rk0Var);
                }
                tk0Var.getMediaDataController().ringtoneDataStore.h();
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i16);
                    TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    saveringtone.f22234id = tL_inputDocument;
                    tL_inputDocument.f22039id = document3.f22033id;
                    tL_inputDocument.access_hash = document3.access_hash;
                    byte[] bArr = document3.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    saveringtone.unsave = true;
                    tk0Var.getConnectionsManager().sendRequest(saveringtone, new di.d6(8));
                }
                tk0.X(tk0Var);
                tk0Var.e0();
                tk0Var.e.l();
                e2Var.dismiss();
                return;
        }
    }

    @Override
    public void j(int i10) {
        DataAutoDownloadActivity dataAutoDownloadActivity = ((vt) this.f42912b).d;
        DownloadController.Preset preset = (DownloadController.Preset) dataAutoDownloadActivity.f35477c.get(i10);
        if (preset == dataAutoDownloadActivity.f35484y) {
            dataAutoDownloadActivity.e = 0;
        } else if (preset == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.e = 1;
        } else if (preset == dataAutoDownloadActivity.F) {
            dataAutoDownloadActivity.e = 2;
        } else {
            dataAutoDownloadActivity.e = 3;
        }
        int i11 = dataAutoDownloadActivity.f35478f;
        if (i11 == 0) {
            DownloadController.getInstance(DataAutoDownloadActivity.e0(dataAutoDownloadActivity)).currentMobilePreset = dataAutoDownloadActivity.e;
        } else if (i11 == 1) {
            DownloadController.getInstance(DataAutoDownloadActivity.f0(dataAutoDownloadActivity)).currentWifiPreset = dataAutoDownloadActivity.e;
        } else {
            DownloadController.getInstance(DataAutoDownloadActivity.g0(dataAutoDownloadActivity)).currentRoamingPreset = dataAutoDownloadActivity.e;
        }
        SharedPreferences.Editor edit = MessagesController.getMainSettings(DataAutoDownloadActivity.h0(dataAutoDownloadActivity)).edit();
        edit.putInt(dataAutoDownloadActivity.K, dataAutoDownloadActivity.e);
        edit.commit();
        DownloadController.getInstance(DataAutoDownloadActivity.i0(dataAutoDownloadActivity)).checkAutodownloadSettings();
        for (int i12 = 0; i12 < 4; i12++) {
            s4.e1 K = dataAutoDownloadActivity.f35476b.K(DataAutoDownloadActivity.j0(dataAutoDownloadActivity) + i12);
            if (K != null) {
                dataAutoDownloadActivity.f35475a.v(K, DataAutoDownloadActivity.j0(dataAutoDownloadActivity) + i12);
            }
        }
        dataAutoDownloadActivity.I = true;
    }

    @Override
    public boolean k0(int i10) {
        switch (this.f42911a) {
            case 12:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void l(org.telegram.ui.Components.le0 le0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f42912b;
        ArrayList arrayList = ExternalActionActivity.f35495x;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.f35501n, externalActionActivity.v, true, externalActionActivity.f35502r, externalActionActivity.f35503s);
            externalActionActivity.h = null;
        }
        externalActionActivity.f35499c.e0();
        if (AndroidUtilities.isTablet()) {
            externalActionActivity.d.e0();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, le0Var);
    }

    @Override
    public void l0(View view, float f7, float f10) {
        int i10 = this.f42911a;
    }

    @Override
    public void n(KeyEvent keyEvent) {
        jz jzVar = (jz) this.f42912b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && jzVar.f39216x.isShowing()) {
            jzVar.f39216x.d(true);
        }
    }

    @Override
    public void p0(ArrayList arrayList) {
        int i10 = this.f42911a;
    }

    @Override
    public void mo5run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        uy uyVar = (uy) this.f42912b;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        if (((org.telegram.ui.Components.t61) obj).d != 1 || uyVar.f44546b == null) {
            return;
        }
        boolean z10 = !uyVar.f44547c;
        uyVar.f44547c = z10;
        bi.m5 m5Var = uyVar.f44548f;
        if (m5Var != null) {
            m5Var.run(Boolean.valueOf(z10), Boolean.valueOf(uyVar.d));
        }
        ((org.telegram.ui.Cells.a9) view).setChecked(uyVar.f44547c);
        uyVar.e.f32150g3.O(true);
    }

    @Override
    public a0.h y() {
        switch (this.f42911a) {
            case 12:
                return null;
            default:
                return null;
        }
    }

    @Override
    public int run() {
        return ((FiltersSetupActivity) this.f42912b).f35512w;
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        ((a3.h0) this.f42912b).run();
        return true;
    }

    @Override
    public void m() {
    }

    private final void i(ArrayList arrayList) {
    }

    private final void k(ArrayList arrayList) {
    }

    @Override
    public void z(float f7, int i10) {
    }

    private final void b(View view, float f7, float f10) {
    }

    private final void d(View view, float f7, float f10) {
    }

    private final void g(View view, float f7, float f10) {
    }
}
