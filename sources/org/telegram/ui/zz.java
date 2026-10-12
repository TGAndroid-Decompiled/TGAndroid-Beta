package org.telegram.ui;

import android.os.Looper;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.Intro;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class zz implements Runnable {
    public final int f42736a;
    public final Object f42737b;

    public zz(Object obj, int i10) {
        this.f42736a = i10;
        this.f42737b = obj;
    }

    @Override
    public final void run() {
        int i10;
        f80 f80Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i11 = this.f42736a;
        Object obj = this.f42737b;
        switch (i11) {
            case 0:
                ((f00) obj).f34000a.getBackground().setState(new int[0]);
                return;
            case 1:
                c20 c20Var = (c20) obj;
                AndroidUtilities.cancelRunOnUIThread(c20Var.f34696n0);
                c20Var.f34679a.a(false, true);
                return;
            case 2:
                c20 c20Var2 = ((r10) obj).f39570a;
                c20Var2.h(c20Var2.E, c20Var2.F, c20Var2.H, c20Var2.G, c20Var2.f34705y, c20Var2.J, c20Var2.f34703w, false);
                return;
            case 3:
                ((FiltersSetupActivity) ((bi.o0) obj).W2).getMessagesController().lockFiltersInternal();
                return;
            case 4:
                e20 e20Var = (e20) obj;
                e20Var.f35445s.a();
                e20Var.f35443n.invalidate();
                e20Var.E.Z(true);
                return;
            case 5:
                FiltersSetupActivity filtersSetupActivity = ((l20) obj).d;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = filtersSetupActivity.getMessagesController().getDialogFilters();
                    for (int i12 = 0; i12 < dialogFilters.size(); i12++) {
                        if (dialogFilters.get(i12).isDefault() && i12 != 0) {
                            FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.f32089b.e;
                            ArrayList<MessagesController.DialogFilter> arrayList = filtersSetupActivity2.getMessagesController().dialogFilters;
                            if (i12 < 0 || i12 >= arrayList.size()) {
                                i10 = 1;
                            } else {
                                arrayList.add(0, arrayList.remove(i12));
                                for (int i13 = 0; i13 <= i12; i13++) {
                                    arrayList.get(i13).order = i13;
                                }
                                i10 = 1;
                                filtersSetupActivity2.e = true;
                                filtersSetupActivity2.Z(true);
                            }
                            filtersSetupActivity.f32088a.u0(0);
                            try {
                                filtersSetupActivity.fragmentView.performHapticFeedback(3, i10);
                            } catch (Exception unused) {
                            }
                            org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(filtersSetupActivity);
                            int i14 = R.raw.filter_reorder;
                            int i15 = R.string.LimitReachedReorderFolder;
                            Object[] objArr = new Object[i10];
                            objArr[0] = LocaleController.getString(R.string.FilterAllChats);
                            a02.I(i14, AndroidUtilities.replaceTags(LocaleController.formatString("LimitReachedReorderFolder", i15, objArr)), LocaleController.getString(R.string.PremiumMore), 5000, false, new d20(filtersSetupActivity, 2)).j();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 6:
                n60 n60Var = ((u30) obj).f40527b;
                n60Var.f38481j2 = null;
                n60Var.K1(n60Var.F1, true);
                return;
            case 7:
                u50 u50Var = (u50) obj;
                n60 n60Var2 = u50Var.f40543f;
                g40 g40Var = n60Var2.f38444b;
                ImageLocation imageLocation = u50Var.d;
                if (imageLocation != null) {
                    g40Var.K0 = imageLocation;
                    g40Var.f28334q1 = null;
                    g40Var.f28335r1 = null;
                    u50Var.d = null;
                }
                TLRPC.Chat chat = n60Var2.d.getMessagesController().getChat(Long.valueOf(-u50Var.e));
                ImageLocation forChat = ImageLocation.getForChat(chat, 0);
                ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
                if (ImageLocation.getForLocal(u50Var.f40541b) == null) {
                    forChat2 = ImageLocation.getForLocal(u50Var.f40542c);
                }
                g40Var.setCreateThumbFromParent(false);
                g40Var.H(null, forChat, forChat2, true);
                u50Var.f40542c = null;
                u50Var.f40541b = null;
                AndroidUtilities.updateVisibleRows(n60Var2.Q);
                u50Var.a(1.0f);
                return;
            case 8:
                x50 x50Var = ((y50) obj).f42036g;
                if (x50Var != null) {
                    x50Var.invalidate();
                    return;
                }
                return;
            case 9:
                p70 p70Var = (p70) obj;
                p70Var.f39139y = null;
                p70Var.E = null;
                p70Var.F = null;
                p70Var.G = null;
                p70Var.I = null;
                p70Var.H = null;
                p70Var.J = 0.0d;
                p70Var.Z(false, true);
                p70Var.d.h(null, null, p70Var.f39135r, null);
                p70Var.f39133f.setAnimation(p70Var.R);
                p70Var.R.M(0);
                return;
            case 10:
                org.telegram.messenger.q.r(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.zc.a0(((t70) obj).f40303c), R.raw.done, 36);
                return;
            case 11:
                h80 h80Var = (h80) obj;
                f80 f80Var2 = h80Var.I;
                int i16 = R.drawable.intro_powerful_mask;
                int i17 = org.telegram.ui.ActionBar.g6.f19901d6;
                int x02 = org.telegram.ui.ActionBar.g6.x0(null, i17, false);
                int i18 = f80.f35751y;
                f80Var2.b(i16, 17, x02, true);
                int[] iArr = h80Var.I.f35756n;
                Intro.setPowerfulTextures(iArr[17], iArr[18], iArr[16], iArr[15]);
                f80 f80Var3 = h80Var.I;
                f80Var3.c(f80Var3.v, 23, true);
                int[] iArr2 = h80Var.I.f35756n;
                Intro.setTelegramTextures(iArr2[22], iArr2[21], iArr2[23]);
                Intro.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, i17, false));
                return;
            case 12:
                d80 d80Var = (d80) obj;
                d80Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                h80 h80Var2 = (h80) d80Var.f35187b;
                Intro.setPage(h80Var2.H);
                Intro.setDate(((float) (currentTimeMillis - h80Var2.J)) / 1000.0f);
                Intro.onDrawFrame(0);
                f80 f80Var4 = h80Var2.I;
                if (f80Var4 != null && f80Var4.isAlive() && (eGLDisplay = (f80Var = h80Var2.I).f35754c) != null && (eGLSurface = f80Var.f35755f) != null) {
                    try {
                        f80Var.f35753b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 13:
                h80 h80Var3 = ((e80) obj).f35480b;
                h80Var3.presentFragment(new bh0(), true);
                h80Var3.M = true;
                return;
            case 14:
                ((f80) obj).finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 15:
                ((pf.c) obj).b();
                return;
            case 16:
                ((ab0) obj).f34127a.C0.setVisibility(8);
                return;
            case 17:
                ((hc0) obj).f0();
                return;
            case 18:
                try {
                    org.telegram.ui.Components.mm0 currentListView = ((nd0) ((ld0) obj).f37923z0).K0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 19:
                EditTextBoldCursor[] editTextBoldCursorArr = ((re0) obj).f39774b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 20:
                ue0 ue0Var = (ue0) obj;
                org.telegram.ui.Components.bk0 bk0Var = ue0Var.e;
                EditTextBoldCursor editTextBoldCursor2 = ue0Var.f40656a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    bh0.T0(ue0Var.f40665y, editTextBoldCursor2);
                    bk0Var.getAnimatedDrawable().N(0, false, false);
                    bk0Var.d();
                    return;
                }
                return;
            case 21:
                ((org.telegram.ui.Components.bk0) obj).d();
                return;
            case 22:
                ((cf0) ((di.g2) obj).f6967c).getClass();
                return;
            case 23:
                double currentTimeMillis2 = System.currentTimeMillis();
                cf0 cf0Var = ((bf0) obj).f34529a;
                double d = cf0Var.Q;
                cg0 cg0Var = cf0Var.v;
                cf0Var.Q = currentTimeMillis2;
                int i19 = (int) (cf0Var.P - (currentTimeMillis2 - d));
                cf0Var.P = i19;
                if (i19 >= 1000) {
                    int i20 = i19 / 1000;
                    int i21 = i20 / 60;
                    int i22 = i20 - (i21 * 60);
                    cg0Var.setTextSize(1, 13.0f);
                    int i23 = cf0Var.E;
                    if (i23 != 4 && i23 != 3 && i23 != 11) {
                        if (i23 == 2) {
                            cg0Var.setText(LocaleController.formatString(R.string.SmsAvailableIn2, Integer.valueOf(i21), Integer.valueOf(i22)));
                            return;
                        }
                        return;
                    }
                    cg0Var.setText(LocaleController.formatString(R.string.CallAvailableIn2, Integer.valueOf(i21), Integer.valueOf(i22)));
                    return;
                }
                cf0Var.r();
                int i24 = cf0Var.E;
                if (i24 == 3 || i24 == 4 || i24 == 2 || i24 == 11) {
                    cg0Var.setTextSize(1, 15.0f);
                    int i25 = cf0Var.E;
                    if (i25 == 4) {
                        cg0Var.setText(LocaleController.getString(R.string.RequestCallButton));
                    } else if (i25 == 15) {
                        cg0Var.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                    } else if (i25 != 11 && i25 != 3) {
                        cg0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.RequestAnotherSMS), true, 0.0f, 0.0f));
                    } else {
                        cg0Var.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i26 = org.telegram.ui.ActionBar.g6.P9;
                    cg0Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i26, false));
                    cg0Var.setTag(R.id.color_key_tag, Integer.valueOf(i26));
                    return;
                }
                return;
            case 24:
                double currentTimeMillis3 = System.currentTimeMillis();
                eg0 eg0Var = (eg0) ((di.n2) obj).f7450b;
                double d10 = currentTimeMillis3 - eg0Var.f35545b0;
                eg0Var.f35545b0 = currentTimeMillis3;
                int i27 = (int) (eg0Var.W - d10);
                eg0Var.W = i27;
                if (i27 <= 1000) {
                    eg0.p(eg0Var);
                    eg0Var.v.setVisibility(8);
                    cg0 cg0Var2 = eg0Var.f35568x;
                    if (cg0Var2 != null) {
                        cg0Var2.setVisibility(0);
                    }
                    eg0Var.u();
                    return;
                }
                return;
            case 25:
                double currentTimeMillis4 = System.currentTimeMillis();
                eg0 eg0Var2 = ((dg0) obj).f35255a;
                double d11 = eg0Var2.f35543a0;
                cg0 cg0Var3 = eg0Var2.v;
                eg0Var2.f35543a0 = currentTimeMillis4;
                int i28 = (int) (eg0Var2.V - (currentTimeMillis4 - d11));
                eg0Var2.V = i28;
                if (i28 >= 1000) {
                    int i29 = i28 / 1000;
                    int i30 = i29 / 60;
                    int i31 = i29 - (i30 * 60);
                    int i32 = eg0Var2.f35552g0;
                    if (i32 != 4 && i32 != 3 && i32 != 11) {
                        if (eg0Var2.f35551f0 == 2 && (i32 == 2 || i32 == 17 || i32 == 16)) {
                            cg0Var3.setText(LocaleController.formatString("ResendSmsAvailableIn", R.string.ResendSmsAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                            return;
                        } else if (i32 == 2 || i32 == 17 || i32 == 16) {
                            cg0Var3.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                            return;
                        } else {
                            return;
                        }
                    }
                    cg0Var3.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                    return;
                }
                eg0Var2.w();
                int i33 = eg0Var2.f35552g0;
                if (i33 == 3 || i33 == 4 || i33 == 2 || i33 == 17 || i33 == 16 || i33 == 11) {
                    if (i33 == 4) {
                        cg0Var3.setText(LocaleController.getString("RequestCallButton", R.string.RequestCallButton));
                    } else if (i33 != 11 && i33 != 3) {
                        cg0Var3.setText(LocaleController.getString("RequestSmsButton", R.string.RequestSmsButton));
                    } else {
                        cg0Var3.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i34 = org.telegram.ui.ActionBar.g6.P9;
                    cg0Var3.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i34, false));
                    cg0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i34));
                    return;
                }
                return;
            case 26:
                ((org.telegram.ui.Components.gq0) obj).run();
                return;
            case 27:
                mh0.j((mh0) obj);
                return;
            case 28:
                ((org.telegram.ui.Components.ui) obj).setVisibility(8);
                return;
            default:
                AndroidUtilities.showKeyboard(((ik0) ((g) obj).f36263b).Q);
                return;
        }
    }
}
