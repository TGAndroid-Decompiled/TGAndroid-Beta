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
public final class st implements org.telegram.ui.Components.bm0, org.telegram.ui.Components.zw0, org.telegram.ui.ActionBar.b2, MessagesController.ErrorDelegate, org.telegram.ui.Components.rh0, Utilities.Callback5, org.telegram.ui.Components.ke0, org.telegram.ui.ActionBar.m1, org.telegram.ui.Components.xl0, ig.z1, org.telegram.ui.Components.cm0, r0.n, pt, oe.d, gj0 {
    public final int f43401a;
    public final Object f43402b;

    public st(Object obj, int i10) {
        this.f43401a = i10;
        this.f43402b = obj;
    }

    @Override
    public void E(int i10, float f7, float f10, oe.e eVar) {
        tg0 tg0Var = (tg0) this.f43402b;
        tg0Var.getClass();
        tg0Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.019f, f7));
        tg0Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.019f, f7));
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        switch (this.f43401a) {
            case 16:
                ha0 ha0Var = (ha0) this.f43402b;
                i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                if (!ha0Var.f39838a.equals(defaultWindowInsets)) {
                    ha0Var.f39838a = defaultWindowInsets;
                    ha0Var.requestLayout();
                }
                int childCount = ha0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    r0.i0.b(ha0Var.getChildAt(i10), k1Var);
                }
                return k1Var;
            default:
                zj0 zj0Var = (zj0) this.f43402b;
                i0.b defaultWindowInsets2 = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
                zj0Var.f46295x = defaultWindowInsets2.d;
                zj0Var.K = k1Var.f47153a.f(8).d;
                view.setPadding(defaultWindowInsets2.f13449a, view.getPaddingTop(), defaultWindowInsets2.f13451c, 0);
                zj0Var.p0(false);
                view.post(new sj0(zj0Var, 0));
                return r0.k1.f47152b;
        }
    }

    @Override
    public a0.h U() {
        switch (this.f43401a) {
            case 12:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void Y0(lt ltVar) {
        hg0 hg0Var = (hg0) this.f43402b;
        hg0Var.K = true;
        String str = ltVar.f41260c;
        hg0Var.f39881a.setText(str);
        hg0Var.s(str, ltVar);
        hg0Var.F = ltVar;
        hg0Var.E = 0;
        hg0Var.K = false;
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putString("phone_code_last_matched_" + ltVar.f41260c, ltVar.d).apply();
        AndroidUtilities.runOnUIThread(new wf0(hg0Var, 4), 300L);
        eg0 eg0Var = hg0Var.f39883b;
        eg0Var.requestFocus();
        eg0Var.setSelection(eg0Var.length());
    }

    @Override
    public void a(Canvas canvas) {
        ((Layout) this.f43402b).draw(canvas);
    }

    @Override
    public boolean c(int i10, View view) {
        int i11;
        int i12;
        switch (this.f43401a) {
            case 14:
                return LanguageSelectActivity.W((LanguageSelectActivity) this.f43402b, view, i10);
            case 23:
                final xi0 xi0Var = (xi0) this.f43402b;
                if (i10 >= xi0Var.I && i10 < xi0Var.J) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final MessageObject messageObject = (MessageObject) xi0Var.f45708x.get(i10 - xi0Var.I);
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
                            org.telegram.ui.ActionBar.r2 ea2;
                            org.telegram.ui.ActionBar.r2 r2Var = xi0.this;
                            r2Var.getClass();
                            MessageObject messageObject2 = messageObject;
                            boolean isStory = messageObject2.isStory();
                            boolean z10 = isUserDialog;
                            long j10 = dialogId;
                            if (isStory) {
                                if (z10) {
                                    ea2 = ProfileActivity.t4(j10);
                                } else {
                                    ea2 = wn.ea(j10);
                                }
                                r2Var.presentFragment(ea2);
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
                                r2Var.presentFragment(new wn(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                    e2Var.P = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    e2Var.Q = intArray;
                    e2Var.M = onClickListener;
                    xi0Var.showDialog(e2Var);
                }
                return false;
            default:
                vk0 vk0Var = (vk0) this.f43402b;
                vk0Var.getClass();
                if (view instanceof uk0) {
                    uk0 uk0Var = (uk0) view;
                    vk0Var.a0(uk0Var.e);
                    uk0Var.performHapticFeedback(0);
                }
                return false;
        }
    }

    @Override
    public boolean c1(View view) {
        switch (this.f43401a) {
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
        org.telegram.ui.Components.u61 G;
        Object obj;
        long j10;
        int V;
        boolean[] zArr;
        switch (this.f43401a) {
            case 0:
                tt ttVar = (tt) this.f43402b;
                HashSet hashSet = ttVar.f43768b0;
                if (!ttVar.f43769c0 && (G = ttVar.f43770d0.G(i10 - 1)) != null && (obj = G.G) != null) {
                    if (obj instanceof TLRPC.User) {
                        j10 = ((TLRPC.User) obj).f22177id;
                    } else if (obj instanceof TLRPC.Chat) {
                        j10 = ((TLRPC.Chat) obj).f22028id;
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
                DataAutoDownloadActivity.X((DataAutoDownloadActivity) this.f43402b, view, i10, f7);
                return;
            default:
                wb0 wb0Var = (wb0) this.f43402b;
                ArrayList arrayList = wb0Var.f44627s;
                if (view != null && i10 >= 0 && i10 < arrayList.size()) {
                    qb0 qb0Var = (qb0) arrayList.get(i10);
                    int i11 = qb0Var.f47075a;
                    int i12 = qb0Var.e;
                    if (i11 != 3 && i11 != 4) {
                        if (i11 == 5 && qb0Var.f42663f == 1) {
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
                        wb0Var.e = org.telegram.ui.Components.wc.b0(wb0Var).L(new org.telegram.ui.Components.ba(0.1f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Y5, false)), LocaleController.getString(R.string.LiteBatteryRestricted)).j();
                        return;
                    } else if (qb0Var.f47075a == 3 && Integer.bitCount(i12) > 1 && (!LocaleController.isRTL ? f7 < view.getMeasuredWidth() - AndroidUtilities.dp(75.0f) : f7 > AndroidUtilities.dp(75.0f)) && (V = wb0Var.V(i12)) != -1) {
                        wb0Var.f44625n[V] = !zArr[V];
                        wb0Var.Z();
                        wb0Var.Y();
                        return;
                    } else {
                        LiteMode.toggleFlag(i12, !LiteMode.isEnabledSetting(i12));
                        wb0Var.Z();
                    }
                    oi.q.f();
                    return;
                }
                return;
        }
    }

    @Override
    public void f(int i10) {
        switch (this.f43401a) {
            case 12:
                r60 r60Var = (r60) this.f43402b;
                t60 t60Var = r60Var.I;
                t60Var.r0(r60Var.H);
                if (r60Var.h == null && !r60Var.f42862f.e() && r60Var.h() == 0) {
                    t60Var.f43520s.e(false, true);
                }
                r60Var.l();
                return;
            default:
                nk0 nk0Var = (nk0) this.f43402b;
                if (nk0Var.f41817f == null && !nk0Var.h.e()) {
                    nk0Var.f41818n.f35599c.c();
                }
                nk0Var.l();
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        int i11;
        xf.d dVar;
        int i12 = this.f43401a;
        Object obj = this.f43402b;
        switch (i12) {
            case 3:
                ((a3.i0) obj).run();
                return;
            case 13:
                ((b70) obj).V(true);
                return;
            case 15:
                Pattern pattern = LaunchActivity.D1;
                AndroidUtilities.addToClipboard((StringBuilder) obj);
                return;
            case 18:
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
            case 19:
                ae0 ae0Var = (ae0) obj;
                ig0.o0(ae0Var.f37757y, ae0Var.f37754s, ae0Var.v, ae0Var.f37755w);
                return;
            case 20:
                ue0 ue0Var = (ue0) obj;
                ig0 ig0Var = ue0Var.G;
                ig0Var.s1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i11 = ((org.telegram.ui.ActionBar.r2) ig0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(deleteaccount, new l(ue0Var, 13), 10);
                return;
            case 27:
                ((org.telegram.messenger.cj) obj).run();
                return;
            default:
                vk0 vk0Var = ((rk0) obj).f43079b;
                SparseArray sparseArray = vk0Var.I;
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    tk0 tk0Var = (tk0) sparseArray.valueAt(i13);
                    TLRPC.Document document = tk0Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        xf.c cVar = vk0Var.getMediaDataController().ringtoneDataStore;
                        TLRPC.Document document2 = tk0Var.e;
                        ArrayList arrayList2 = cVar.e;
                        if (document2 != null) {
                            if (!cVar.f51805f) {
                                cVar.f(true);
                                cVar.f51805f = true;
                            }
                            int i14 = 0;
                            while (true) {
                                if (i14 < arrayList2.size()) {
                                    if (((xf.b) arrayList2.get(i14)).f51797a != null && ((xf.b) arrayList2.get(i14)).f51797a.f22034id == document2.f22034id) {
                                        arrayList2.remove(i14);
                                    } else {
                                        i14++;
                                    }
                                }
                            }
                        }
                    }
                    if (tk0Var.f43667g != null && (dVar = vk0Var.getMediaDataController().ringtoneUploaderHashMap.get(tk0Var.f43667g)) != null) {
                        dVar.f51808c = true;
                        dVar.a();
                        int i15 = dVar.f51806a;
                        FileLoader fileLoader = FileLoader.getInstance(i15);
                        String str = dVar.f51807b;
                        fileLoader.cancelFileUpload(str, false);
                        MediaDataController.getInstance(i15).onRingtoneUploaded(str, null, true);
                    }
                    if (tk0Var == vk0Var.G) {
                        vk0Var.M = null;
                        vk0Var.G = (tk0) vk0Var.f44369b.get(0);
                        vk0Var.H = true;
                    }
                    vk0Var.f44368a.remove(tk0Var);
                    vk0Var.f44370c.remove(tk0Var);
                }
                vk0Var.getMediaDataController().ringtoneDataStore.h();
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i16);
                    TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    saveringtone.f22237id = tL_inputDocument;
                    tL_inputDocument.f22040id = document3.f22034id;
                    tL_inputDocument.access_hash = document3.access_hash;
                    byte[] bArr = document3.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    saveringtone.unsave = true;
                    vk0Var.getConnectionsManager().sendRequest(saveringtone, new di.d6(8));
                }
                vk0.X(vk0Var);
                vk0Var.e0();
                vk0Var.e.l();
                e2Var.dismiss();
                return;
        }
    }

    @Override
    public void j(int i10) {
        DataAutoDownloadActivity dataAutoDownloadActivity = ((xt) this.f43402b).d;
        DownloadController.Preset preset = (DownloadController.Preset) dataAutoDownloadActivity.f35504c.get(i10);
        if (preset == dataAutoDownloadActivity.f35511y) {
            dataAutoDownloadActivity.e = 0;
        } else if (preset == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.e = 1;
        } else if (preset == dataAutoDownloadActivity.F) {
            dataAutoDownloadActivity.e = 2;
        } else {
            dataAutoDownloadActivity.e = 3;
        }
        int i11 = dataAutoDownloadActivity.f35505f;
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
            s4.e1 K = dataAutoDownloadActivity.f35503b.K(DataAutoDownloadActivity.j0(dataAutoDownloadActivity) + i12);
            if (K != null) {
                dataAutoDownloadActivity.f35502a.v(K, DataAutoDownloadActivity.j0(dataAutoDownloadActivity) + i12);
            }
        }
        dataAutoDownloadActivity.I = true;
    }

    @Override
    public boolean k0(int i10) {
        switch (this.f43401a) {
            case 12:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void l(org.telegram.ui.Components.me0 me0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f43402b;
        ArrayList arrayList = ExternalActionActivity.f35522x;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.f35528n, externalActionActivity.v, true, externalActionActivity.f35529r, externalActionActivity.f35530s);
            externalActionActivity.h = null;
        }
        externalActionActivity.f35526c.e0();
        if (AndroidUtilities.isTablet()) {
            externalActionActivity.d.e0();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, me0Var);
    }

    @Override
    public void l0(View view, float f7, float f10) {
        int i10 = this.f43401a;
    }

    @Override
    public void n(KeyEvent keyEvent) {
        mz mzVar = (mz) this.f43402b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && mzVar.f39729x.isShowing()) {
            mzVar.f39729x.d(true);
        }
    }

    @Override
    public void p0(ArrayList arrayList) {
        int i10 = this.f43401a;
    }

    @Override
    public void mo5run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        wy wyVar = (wy) this.f43402b;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        if (((org.telegram.ui.Components.u61) obj).d != 1 || wyVar.f45425b == null) {
            return;
        }
        boolean z10 = !wyVar.f45426c;
        wyVar.f45426c = z10;
        bi.m5 m5Var = wyVar.f45427f;
        if (m5Var != null) {
            m5Var.run(Boolean.valueOf(z10), Boolean.valueOf(wyVar.d));
        }
        ((org.telegram.ui.Cells.a9) view).setChecked(wyVar.f45426c);
        wyVar.e.f32504g3.O(true);
    }

    @Override
    public a0.h y() {
        switch (this.f43401a) {
            case 12:
                return null;
            default:
                return null;
        }
    }

    @Override
    public int run() {
        return ((FiltersSetupActivity) this.f43402b).f35539w;
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        ((a3.h0) this.f43402b).run();
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
