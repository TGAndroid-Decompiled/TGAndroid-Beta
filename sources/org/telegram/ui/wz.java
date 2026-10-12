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
public final class wz implements Runnable {
    public final int f43697a;
    public final Object f43698b;

    public wz(Object obj, int i10) {
        this.f43697a = i10;
        this.f43698b = obj;
    }

    @Override
    public final void run() {
        int i10;
        d80 d80Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i11 = this.f43697a;
        Object obj = this.f43698b;
        switch (i11) {
            case 0:
                ((c00) obj).f44203a.getBackground().setState(new int[0]);
                return;
            case 1:
                y10 y10Var = (y10) obj;
                AndroidUtilities.cancelRunOnUIThread(y10Var.f44259n0);
                y10Var.f44241a.a(false, true);
                return;
            case 2:
                y10 y10Var2 = ((n10) obj).f40175a;
                y10Var2.h(y10Var2.E, y10Var2.F, y10Var2.H, y10Var2.G, y10Var2.f44268y, y10Var2.J, y10Var2.f44266w, false);
                return;
            case 3:
                ((FiltersSetupActivity) ((ai.w0) obj).W2).getMessagesController().lockFiltersInternal();
                return;
            case 4:
                a20 a20Var = (a20) obj;
                a20Var.f35675s.a();
                a20Var.f35673n.invalidate();
                a20Var.E.Z(true);
                return;
            case 5:
                FiltersSetupActivity filtersSetupActivity = ((h20) obj).d;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = filtersSetupActivity.getMessagesController().getDialogFilters();
                    for (int i12 = 0; i12 < dialogFilters.size(); i12++) {
                        if (dialogFilters.get(i12).isDefault() && i12 != 0) {
                            FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.f33598b.f36960e;
                            ArrayList<MessagesController.DialogFilter> arrayList = filtersSetupActivity2.getMessagesController().dialogFilters;
                            if (i12 < 0 || i12 >= arrayList.size()) {
                                i10 = 1;
                            } else {
                                arrayList.add(0, arrayList.remove(i12));
                                for (int i13 = 0; i13 <= i12; i13++) {
                                    arrayList.get(i13).order = i13;
                                }
                                i10 = 1;
                                filtersSetupActivity2.f33600e = true;
                                filtersSetupActivity2.Z(true);
                            }
                            filtersSetupActivity.f33597a.u0(0);
                            try {
                                filtersSetupActivity.fragmentView.performHapticFeedback(3, i10);
                            } catch (Exception unused) {
                            }
                            org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(filtersSetupActivity);
                            int i14 = R.raw.filter_reorder;
                            int i15 = R.string.LimitReachedReorderFolder;
                            Object[] objArr = new Object[i10];
                            objArr[0] = LocaleController.getString(R.string.FilterAllChats);
                            a02.I(i14, AndroidUtilities.replaceTags(LocaleController.formatString("LimitReachedReorderFolder", i15, objArr)), LocaleController.getString(R.string.PremiumMore), 5000, false, new z10(filtersSetupActivity, 2)).j();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 6:
                i60 i60Var = ((q30) obj).f41185b;
                i60Var.f38718j2 = null;
                i60Var.K1(i60Var.F1, true);
                return;
            case 7:
                p50 p50Var = (p50) obj;
                i60 i60Var2 = p50Var.f40854f;
                c40 c40Var = i60Var2.f38680b;
                ImageLocation imageLocation = p50Var.d;
                if (imageLocation != null) {
                    c40Var.K0 = imageLocation;
                    c40Var.f31540q1 = null;
                    c40Var.f31541r1 = null;
                    p50Var.d = null;
                }
                TLRPC.Chat chat = i60Var2.d.getMessagesController().getChat(Long.valueOf(-p50Var.f40853e));
                ImageLocation forChat = ImageLocation.getForChat(chat, 0);
                ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
                if (ImageLocation.getForLocal(p50Var.f40851b) == null) {
                    forChat2 = ImageLocation.getForLocal(p50Var.f40852c);
                }
                c40Var.setCreateThumbFromParent(false);
                c40Var.H(null, forChat, forChat2, true);
                p50Var.f40852c = null;
                p50Var.f40851b = null;
                AndroidUtilities.updateVisibleRows(i60Var2.Q);
                p50Var.a(1.0f);
                return;
            case 8:
                s50 s50Var = ((t50) obj).f42087g;
                if (s50Var != null) {
                    s50Var.invalidate();
                    return;
                }
                return;
            case 9:
                l70 l70Var = (l70) obj;
                l70Var.f39660y = null;
                l70Var.E = null;
                l70Var.F = null;
                l70Var.G = null;
                l70Var.I = null;
                l70Var.H = null;
                l70Var.J = 0.0d;
                l70Var.Z(false, true);
                l70Var.d.h(null, null, l70Var.f39656r, null);
                l70Var.f39654f.setAnimation(l70Var.R);
                l70Var.R.M(0);
                return;
            case 10:
                org.telegram.messenger.v0.q(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.zc.a0(((p70) obj).f40868c), R.raw.done, 36);
                return;
            case 11:
                f80 f80Var = (f80) obj;
                d80 d80Var2 = f80Var.I;
                int i16 = R.drawable.intro_powerful_mask;
                int i17 = org.telegram.ui.ActionBar.h6.f20559d6;
                int x02 = org.telegram.ui.ActionBar.h6.x0(null, i17, false);
                int i18 = d80.f36674y;
                d80Var2.b(i16, 17, x02, true);
                int[] iArr = f80Var.I.f36680n;
                Intro.setPowerfulTextures(iArr[17], iArr[18], iArr[16], iArr[15]);
                d80 d80Var3 = f80Var.I;
                d80Var3.c(d80Var3.v, 23, true);
                int[] iArr2 = f80Var.I.f36680n;
                Intro.setTelegramTextures(iArr2[22], iArr2[21], iArr2[23]);
                Intro.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i17, false));
                return;
            case 12:
                a80 a80Var = (a80) obj;
                a80Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                f80 f80Var2 = (f80) a80Var.f35723b;
                Intro.setPage(f80Var2.H);
                Intro.setDate(((float) (currentTimeMillis - f80Var2.J)) / 1000.0f);
                Intro.onDrawFrame(0);
                d80 d80Var4 = f80Var2.I;
                if (d80Var4 != null && d80Var4.isAlive() && (eGLDisplay = (d80Var = f80Var2.I).f36677c) != null && (eGLSurface = d80Var.f36679f) != null) {
                    try {
                        d80Var.f36676b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 13:
                f80 f80Var3 = ((b80) obj).f36106b;
                f80Var3.presentFragment(new xg0(), true);
                f80Var3.M = true;
                return;
            case 14:
                ((d80) obj).finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 15:
                ((of.e) obj).b();
                return;
            case 16:
                ((wa0) obj).f43114a.C0.setVisibility(8);
                return;
            case 17:
                ((dc0) obj).f0();
                return;
            case 18:
                try {
                    org.telegram.ui.Components.wm0 currentListView = ((id0) ((gd0) obj).f38009z0).K0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 19:
                EditTextBoldCursor[] editTextBoldCursorArr = ((me0) obj).f40018b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 20:
                pe0 pe0Var = (pe0) obj;
                org.telegram.ui.Components.ik0 ik0Var = pe0Var.f40937e;
                EditTextBoldCursor editTextBoldCursor2 = pe0Var.f40934a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    xg0.T0(pe0Var.f40944y, editTextBoldCursor2);
                    ik0Var.getAnimatedDrawable().N(0, false, false);
                    ik0Var.d();
                    return;
                }
                return;
            case 21:
                ((org.telegram.ui.Components.ik0) obj).d();
                return;
            case 22:
                ((xe0) ((ci.g2) obj).f5114c).getClass();
                return;
            case 23:
                double currentTimeMillis2 = System.currentTimeMillis();
                xe0 xe0Var = ((we0) obj).f43144a;
                double d = xe0Var.Q;
                xf0 xf0Var = xe0Var.v;
                xe0Var.Q = currentTimeMillis2;
                int i19 = (int) (xe0Var.P - (currentTimeMillis2 - d));
                xe0Var.P = i19;
                if (i19 >= 1000) {
                    int i20 = i19 / 1000;
                    int i21 = i20 / 60;
                    int i22 = i20 - (i21 * 60);
                    xf0Var.setTextSize(1, 13.0f);
                    int i23 = xe0Var.E;
                    if (i23 != 4 && i23 != 3 && i23 != 11) {
                        if (i23 == 2) {
                            xf0Var.setText(LocaleController.formatString(R.string.SmsAvailableIn2, Integer.valueOf(i21), Integer.valueOf(i22)));
                            return;
                        }
                        return;
                    }
                    xf0Var.setText(LocaleController.formatString(R.string.CallAvailableIn2, Integer.valueOf(i21), Integer.valueOf(i22)));
                    return;
                }
                xe0Var.r();
                int i24 = xe0Var.E;
                if (i24 == 3 || i24 == 4 || i24 == 2 || i24 == 11) {
                    xf0Var.setTextSize(1, 15.0f);
                    int i25 = xe0Var.E;
                    if (i25 == 4) {
                        xf0Var.setText(LocaleController.getString(R.string.RequestCallButton));
                    } else if (i25 == 15) {
                        xf0Var.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                    } else if (i25 != 11 && i25 != 3) {
                        xf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.RequestAnotherSMS), true, 0.0f, 0.0f));
                    } else {
                        xf0Var.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i26 = org.telegram.ui.ActionBar.h6.P9;
                    xf0Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i26, false));
                    xf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i26));
                    return;
                }
                return;
            case 24:
                double currentTimeMillis3 = System.currentTimeMillis();
                zf0 zf0Var = (zf0) ((ci.n2) obj).f5629b;
                double d10 = currentTimeMillis3 - zf0Var.f44811b0;
                zf0Var.f44811b0 = currentTimeMillis3;
                int i27 = (int) (zf0Var.W - d10);
                zf0Var.W = i27;
                if (i27 <= 1000) {
                    zf0.p(zf0Var);
                    zf0Var.v.setVisibility(8);
                    xf0 xf0Var2 = zf0Var.f44835x;
                    if (xf0Var2 != null) {
                        xf0Var2.setVisibility(0);
                    }
                    zf0Var.v();
                    return;
                }
                return;
            case 25:
                double currentTimeMillis4 = System.currentTimeMillis();
                zf0 zf0Var2 = ((yf0) obj).f44468a;
                double d11 = zf0Var2.f44809a0;
                xf0 xf0Var3 = zf0Var2.v;
                zf0Var2.f44809a0 = currentTimeMillis4;
                int i28 = (int) (zf0Var2.V - (currentTimeMillis4 - d11));
                zf0Var2.V = i28;
                if (i28 >= 1000) {
                    int i29 = i28 / 1000;
                    int i30 = i29 / 60;
                    int i31 = i29 - (i30 * 60);
                    int i32 = zf0Var2.f44819g0;
                    if (i32 != 4 && i32 != 3 && i32 != 11) {
                        if (zf0Var2.f44818f0 == 2 && (i32 == 2 || i32 == 17 || i32 == 16)) {
                            xf0Var3.setText(LocaleController.formatString("ResendSmsAvailableIn", R.string.ResendSmsAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                            return;
                        } else if (i32 == 2 || i32 == 17 || i32 == 16) {
                            xf0Var3.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                            return;
                        } else {
                            return;
                        }
                    }
                    xf0Var3.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                    return;
                }
                zf0Var2.w();
                int i33 = zf0Var2.f44819g0;
                if (i33 == 3 || i33 == 4 || i33 == 2 || i33 == 17 || i33 == 16 || i33 == 11) {
                    if (i33 == 4) {
                        xf0Var3.setText(LocaleController.getString("RequestCallButton", R.string.RequestCallButton));
                    } else if (i33 != 11 && i33 != 3) {
                        xf0Var3.setText(LocaleController.getString("RequestSmsButton", R.string.RequestSmsButton));
                    } else {
                        xf0Var3.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i34 = org.telegram.ui.ActionBar.h6.P9;
                    xf0Var3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i34, false));
                    xf0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i34));
                    return;
                }
                return;
            case 26:
                ((org.telegram.ui.Components.uo0) obj).run();
                return;
            case 27:
                ih0.j((ih0) obj);
                return;
            case 28:
                ((org.telegram.ui.Components.zi) obj).setVisibility(8);
                return;
            default:
                AndroidUtilities.showKeyboard(((ek0) ((g) obj).f37879b).Q);
                return;
        }
    }
}
