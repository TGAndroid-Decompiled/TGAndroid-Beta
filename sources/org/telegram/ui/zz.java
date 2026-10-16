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
    public final int f42440a;
    public final Object f42441b;

    public zz(Object obj, int i10) {
        this.f42440a = i10;
        this.f42441b = obj;
    }

    @Override
    public final void run() {
        int i10;
        f80 f80Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i11 = this.f42440a;
        Object obj = this.f42441b;
        switch (i11) {
            case 0:
                ((f00) obj).f33703a.getBackground().setState(new int[0]);
                return;
            case 1:
                b20 b20Var = (b20) obj;
                AndroidUtilities.cancelRunOnUIThread(b20Var.f34178n0);
                b20Var.f34161a.a(false, true);
                return;
            case 2:
                b20 b20Var2 = ((q10) obj).f39044a;
                b20Var2.h(b20Var2.E, b20Var2.F, b20Var2.H, b20Var2.G, b20Var2.f34187y, b20Var2.J, b20Var2.f34185w, false);
                return;
            case 3:
                ((FiltersSetupActivity) ((bi.o0) obj).W2).getMessagesController().lockFiltersInternal();
                return;
            case 4:
                e20 e20Var = (e20) obj;
                e20Var.f35183s.a();
                e20Var.f35181n.invalidate();
                e20Var.E.Z(true);
                return;
            case 5:
                FiltersSetupActivity filtersSetupActivity = ((l20) obj).d;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = filtersSetupActivity.getMessagesController().getDialogFilters();
                    for (int i12 = 0; i12 < dialogFilters.size(); i12++) {
                        if (dialogFilters.get(i12).isDefault() && i12 != 0) {
                            FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.f31791b.e;
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
                            filtersSetupActivity.f31790a.u0(0);
                            try {
                                filtersSetupActivity.fragmentView.performHapticFeedback(3, i10);
                            } catch (Exception unused) {
                            }
                            org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(filtersSetupActivity);
                            int i14 = R.raw.filter_reorder;
                            int i15 = R.string.LimitReachedReorderFolder;
                            Object[] objArr = new Object[i10];
                            objArr[0] = LocaleController.getString(R.string.FilterAllChats);
                            a02.I(i14, AndroidUtilities.replaceTags(LocaleController.formatString("LimitReachedReorderFolder", i15, objArr)), LocaleController.getString(R.string.PremiumMore), 5000, false, new c20(filtersSetupActivity, 2)).j();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 6:
                n60 n60Var = ((u30) obj).f40253b;
                n60Var.f38196j2 = null;
                n60Var.K1(n60Var.F1, true);
                return;
            case 7:
                u50 u50Var = (u50) obj;
                n60 n60Var2 = u50Var.f40269f;
                g40 g40Var = n60Var2.f38159b;
                ImageLocation imageLocation = u50Var.d;
                if (imageLocation != null) {
                    g40Var.K0 = imageLocation;
                    g40Var.f28022q1 = null;
                    g40Var.f28023r1 = null;
                    u50Var.d = null;
                }
                TLRPC.Chat chat = n60Var2.d.getMessagesController().getChat(Long.valueOf(-u50Var.e));
                ImageLocation forChat = ImageLocation.getForChat(chat, 0);
                ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
                if (ImageLocation.getForLocal(u50Var.f40267b) == null) {
                    forChat2 = ImageLocation.getForLocal(u50Var.f40268c);
                }
                g40Var.setCreateThumbFromParent(false);
                g40Var.H(null, forChat, forChat2, true);
                u50Var.f40268c = null;
                u50Var.f40267b = null;
                AndroidUtilities.updateVisibleRows(n60Var2.Q);
                u50Var.a(1.0f);
                return;
            case 8:
                x50 x50Var = ((y50) obj).f41739g;
                if (x50Var != null) {
                    x50Var.invalidate();
                    return;
                }
                return;
            case 9:
                p70 p70Var = (p70) obj;
                p70Var.f38833y = null;
                p70Var.E = null;
                p70Var.F = null;
                p70Var.G = null;
                p70Var.I = null;
                p70Var.H = null;
                p70Var.J = 0.0d;
                p70Var.Z(false, true);
                p70Var.d.h(null, null, p70Var.f38829r, null);
                p70Var.f38827f.setAnimation(p70Var.R);
                p70Var.R.M(0);
                return;
            case 10:
                org.telegram.messenger.g0.q(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.zc.a0(((t70) obj).f40018c), R.raw.done, 36);
                return;
            case 11:
                h80 h80Var = (h80) obj;
                f80 f80Var2 = h80Var.I;
                int i16 = R.drawable.intro_powerful_mask;
                int i17 = org.telegram.ui.ActionBar.g6.f19601d6;
                int x02 = org.telegram.ui.ActionBar.g6.x0(null, i17, false);
                int i18 = f80.f35473y;
                f80Var2.b(i16, 17, x02, true);
                int[] iArr = h80Var.I.f35478n;
                Intro.setPowerfulTextures(iArr[17], iArr[18], iArr[16], iArr[15]);
                f80 f80Var3 = h80Var.I;
                f80Var3.c(f80Var3.v, 23, true);
                int[] iArr2 = h80Var.I.f35478n;
                Intro.setTelegramTextures(iArr2[22], iArr2[21], iArr2[23]);
                Intro.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, i17, false));
                return;
            case 12:
                d80 d80Var = (d80) obj;
                d80Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                h80 h80Var2 = (h80) d80Var.f34916b;
                Intro.setPage(h80Var2.H);
                Intro.setDate(((float) (currentTimeMillis - h80Var2.J)) / 1000.0f);
                Intro.onDrawFrame(0);
                f80 f80Var4 = h80Var2.I;
                if (f80Var4 != null && f80Var4.isAlive() && (eGLDisplay = (f80Var = h80Var2.I).f35476c) != null && (eGLSurface = f80Var.f35477f) != null) {
                    try {
                        f80Var.f35475b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 13:
                h80 h80Var3 = ((e80) obj).f35218b;
                h80Var3.presentFragment(new ah0(), true);
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
                ((za0) obj).f42253a.C0.setVisibility(8);
                return;
            case 17:
                ((gc0) obj).f0();
                return;
            case 18:
                try {
                    org.telegram.ui.Components.mm0 currentListView = ((ld0) ((jd0) obj).f37022z0).K0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 19:
                EditTextBoldCursor[] editTextBoldCursorArr = ((pe0) obj).f38895b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 20:
                te0 te0Var = (te0) obj;
                org.telegram.ui.Components.bk0 bk0Var = te0Var.e;
                EditTextBoldCursor editTextBoldCursor2 = te0Var.f40086a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    ah0.T0(te0Var.f40095y, editTextBoldCursor2);
                    bk0Var.getAnimatedDrawable().N(0, false, false);
                    bk0Var.d();
                    return;
                }
                return;
            case 21:
                ((org.telegram.ui.Components.bk0) obj).d();
                return;
            case 22:
                ((bf0) ((di.g2) obj).f6970c).getClass();
                return;
            case 23:
                double currentTimeMillis2 = System.currentTimeMillis();
                bf0 bf0Var = ((af0) obj).f33893a;
                double d = bf0Var.Q;
                bg0 bg0Var = bf0Var.v;
                bf0Var.Q = currentTimeMillis2;
                int i19 = (int) (bf0Var.P - (currentTimeMillis2 - d));
                bf0Var.P = i19;
                if (i19 >= 1000) {
                    int i20 = i19 / 1000;
                    int i21 = i20 / 60;
                    int i22 = i20 - (i21 * 60);
                    bg0Var.setTextSize(1, 13.0f);
                    int i23 = bf0Var.E;
                    if (i23 != 4 && i23 != 3 && i23 != 11) {
                        if (i23 == 2) {
                            bg0Var.setText(LocaleController.formatString(R.string.SmsAvailableIn2, Integer.valueOf(i21), Integer.valueOf(i22)));
                            return;
                        }
                        return;
                    }
                    bg0Var.setText(LocaleController.formatString(R.string.CallAvailableIn2, Integer.valueOf(i21), Integer.valueOf(i22)));
                    return;
                }
                bf0Var.r();
                int i24 = bf0Var.E;
                if (i24 == 3 || i24 == 4 || i24 == 2 || i24 == 11) {
                    bg0Var.setTextSize(1, 15.0f);
                    int i25 = bf0Var.E;
                    if (i25 == 4) {
                        bg0Var.setText(LocaleController.getString(R.string.RequestCallButton));
                    } else if (i25 == 15) {
                        bg0Var.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                    } else if (i25 != 11 && i25 != 3) {
                        bg0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.RequestAnotherSMS), true, 0.0f, 0.0f));
                    } else {
                        bg0Var.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i26 = org.telegram.ui.ActionBar.g6.P9;
                    bg0Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i26, false));
                    bg0Var.setTag(R.id.color_key_tag, Integer.valueOf(i26));
                    return;
                }
                return;
            case 24:
                double currentTimeMillis3 = System.currentTimeMillis();
                dg0 dg0Var = (dg0) ((di.n2) obj).f7453b;
                double d10 = currentTimeMillis3 - dg0Var.f34989b0;
                dg0Var.f34989b0 = currentTimeMillis3;
                int i27 = (int) (dg0Var.W - d10);
                dg0Var.W = i27;
                if (i27 <= 1000) {
                    dg0.p(dg0Var);
                    dg0Var.v.setVisibility(8);
                    bg0 bg0Var2 = dg0Var.f35012x;
                    if (bg0Var2 != null) {
                        bg0Var2.setVisibility(0);
                    }
                    dg0Var.u();
                    return;
                }
                return;
            case 25:
                double currentTimeMillis4 = System.currentTimeMillis();
                dg0 dg0Var2 = ((cg0) obj).f34660a;
                double d11 = dg0Var2.f34987a0;
                bg0 bg0Var3 = dg0Var2.v;
                dg0Var2.f34987a0 = currentTimeMillis4;
                int i28 = (int) (dg0Var2.V - (currentTimeMillis4 - d11));
                dg0Var2.V = i28;
                if (i28 >= 1000) {
                    int i29 = i28 / 1000;
                    int i30 = i29 / 60;
                    int i31 = i29 - (i30 * 60);
                    int i32 = dg0Var2.f34996g0;
                    if (i32 != 4 && i32 != 3 && i32 != 11) {
                        if (dg0Var2.f34995f0 == 2 && (i32 == 2 || i32 == 17 || i32 == 16)) {
                            bg0Var3.setText(LocaleController.formatString("ResendSmsAvailableIn", R.string.ResendSmsAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                            return;
                        } else if (i32 == 2 || i32 == 17 || i32 == 16) {
                            bg0Var3.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                            return;
                        } else {
                            return;
                        }
                    }
                    bg0Var3.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                    return;
                }
                dg0Var2.w();
                int i33 = dg0Var2.f34996g0;
                if (i33 == 3 || i33 == 4 || i33 == 2 || i33 == 17 || i33 == 16 || i33 == 11) {
                    if (i33 == 4) {
                        bg0Var3.setText(LocaleController.getString("RequestCallButton", R.string.RequestCallButton));
                    } else if (i33 != 11 && i33 != 3) {
                        bg0Var3.setText(LocaleController.getString("RequestSmsButton", R.string.RequestSmsButton));
                    } else {
                        bg0Var3.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i34 = org.telegram.ui.ActionBar.g6.P9;
                    bg0Var3.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i34, false));
                    bg0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i34));
                    return;
                }
                return;
            case 26:
                ((org.telegram.ui.Components.ey0) obj).run();
                return;
            case 27:
                lh0.j((lh0) obj);
                return;
            case 28:
                ((org.telegram.ui.Components.ui) obj).setVisibility(8);
                return;
            default:
                AndroidUtilities.showKeyboard(((hk0) ((g) obj).f36029b).Q);
                return;
        }
    }
}
