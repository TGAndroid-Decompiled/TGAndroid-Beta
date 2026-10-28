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
public final class r00 implements Runnable {
    public final int f42822a;
    public final Object f42823b;

    public r00(Object obj, int i10) {
        this.f42822a = i10;
        this.f42823b = obj;
    }

    @Override
    public final void run() {
        int i10;
        p70 p70Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i11 = this.f42822a;
        Object obj = this.f42823b;
        switch (i11) {
            case 0:
                j10 j10Var = (j10) obj;
                AndroidUtilities.cancelRunOnUIThread(j10Var.f40337n0);
                j10Var.f40320a.a(false, true);
                return;
            case 1:
                j10 j10Var2 = ((x00) obj).f45438a;
                j10Var2.h(j10Var2.E, j10Var2.F, j10Var2.H, j10Var2.G, j10Var2.f40346y, j10Var2.J, j10Var2.f40344w, false);
                return;
            case 2:
                ((FiltersSetupActivity) ((m10) obj).f41300g3).getMessagesController().lockFiltersInternal();
                return;
            case 3:
                n10 n10Var = (n10) obj;
                n10Var.f41604s.a();
                n10Var.f41602n.invalidate();
                n10Var.H.c0(true);
                return;
            case 4:
                FiltersSetupActivity filtersSetupActivity = ((u10) obj).e;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = filtersSetupActivity.getMessagesController().getDialogFilters();
                    int i12 = 0;
                    while (true) {
                        if (i12 < dialogFilters.size()) {
                            if (dialogFilters.get(i12).isDefault() && i12 != 0) {
                                FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.f35533b.e;
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
                                    filtersSetupActivity2.c0(true);
                                }
                                filtersSetupActivity.f35532a.v0(0);
                                try {
                                    filtersSetupActivity.fragmentView.performHapticFeedback(3, i10);
                                } catch (Exception unused) {
                                }
                                org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(filtersSetupActivity);
                                int i14 = R.raw.filter_reorder;
                                int i15 = R.string.LimitReachedReorderFolder;
                                Object[] objArr = new Object[i10];
                                objArr[0] = LocaleController.getString(R.string.FilterAllChats);
                                b02.I(i14, AndroidUtilities.replaceTags(LocaleController.formatString("LimitReachedReorderFolder", i15, objArr)), LocaleController.getString(R.string.PremiumMore), 5000, false, new k10(filtersSetupActivity, 2)).j();
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                filtersSetupActivity.b0(null);
                return;
            case 5:
                x50 x50Var = ((e30) obj).f38745b;
                x50Var.f45530j2 = null;
                x50Var.K1(x50Var.F1, true);
                return;
            case 6:
                e50 e50Var = (e50) obj;
                x50 x50Var2 = e50Var.f38760f;
                q30 q30Var = x50Var2.f45493b;
                ImageLocation imageLocation = e50Var.d;
                if (imageLocation != null) {
                    q30Var.K0 = imageLocation;
                    q30Var.f31310q1 = null;
                    q30Var.f31311r1 = null;
                    e50Var.d = null;
                }
                TLRPC.Chat chat = x50Var2.d.getMessagesController().getChat(Long.valueOf(-e50Var.e));
                ImageLocation forChat = ImageLocation.getForChat(chat, 0);
                ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
                if (ImageLocation.getForLocal(e50Var.f38758b) == null) {
                    forChat2 = ImageLocation.getForLocal(e50Var.f38759c);
                }
                q30Var.setCreateThumbFromParent(false);
                q30Var.H(null, forChat, forChat2, true);
                e50Var.f38759c = null;
                e50Var.f38758b = null;
                AndroidUtilities.updateVisibleRows(x50Var2.Q);
                e50Var.a(1.0f);
                return;
            case 7:
                b20 b20Var = ((h50) obj).f39779g;
                if (b20Var != null) {
                    b20Var.invalidate();
                    return;
                }
                return;
            case 8:
                z60 z60Var = (z60) obj;
                z60Var.f46181y = null;
                z60Var.E = null;
                z60Var.F = null;
                z60Var.G = null;
                z60Var.I = null;
                z60Var.H = null;
                z60Var.J = 0.0d;
                z60Var.a0(false, true);
                z60Var.d.h(null, null, z60Var.f46177r, null);
                z60Var.f46175f.setAnimation(z60Var.R);
                z60Var.R.M(0);
                return;
            case 9:
                org.telegram.messenger.t.q(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.wc.b0(((c70) obj).f38208c), R.raw.done, 36);
                return;
            case 10:
                r70 r70Var = (r70) obj;
                p70 p70Var2 = r70Var.I;
                int i16 = R.drawable.intro_powerful_mask;
                int i17 = org.telegram.ui.ActionBar.y6.f23357d6;
                int x02 = org.telegram.ui.ActionBar.y6.x0(null, i17, false);
                int i18 = p70.f42328y;
                p70Var2.b(i16, 17, x02, true);
                r70Var.I.d();
                p70 p70Var3 = r70Var.I;
                p70Var3.c(p70Var3.v, 23, true);
                r70Var.I.f();
                Intro.setBackgroundColor(org.telegram.ui.ActionBar.y6.x0(null, i17, false));
                return;
            case 11:
                n70 n70Var = (n70) obj;
                n70Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                r70 r70Var2 = (r70) n70Var.f41645b;
                Intro.setPage(r70Var2.H);
                Intro.setDate(((float) (currentTimeMillis - r70Var2.J)) / 1000.0f);
                Intro.onDrawFrame(0);
                p70 p70Var4 = r70Var2.I;
                if (p70Var4 != null && p70Var4.isAlive() && (eGLDisplay = (p70Var = r70Var2.I).f42331c) != null && (eGLSurface = p70Var.f42332f) != null) {
                    try {
                        p70Var.f42330b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 12:
                r70 r70Var3 = ((o70) obj).f42006b;
                r70Var3.presentFragment(new ig0(), true);
                r70Var3.M = true;
                return;
            case 13:
                ((p70) obj).finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 14:
                x70 x70Var = (x70) obj;
                x70Var.f45621f.e.smoothScrollTo(0, x70Var.getHeight());
                return;
            case 15:
                ((qf.c) obj).b();
                return;
            case 16:
                ha0 ha0Var = (ha0) obj;
                LaunchActivity launchActivity = ha0Var.f39840c;
                launchActivity.P0 = false;
                boolean z10 = launchActivity.O0;
                launchActivity.F();
                if (z10 != launchActivity.O0) {
                    ha0Var.requestLayout();
                    return;
                }
                return;
            case 17:
                ((ia0) obj).f40079a.C0.setVisibility(8);
                return;
            case 18:
                mb0 mb0Var = (mb0) obj;
                ai.t1 t1Var = mb0Var.d;
                if (t1Var != null) {
                    mb0Var.e0(t1Var.getCurrentLink());
                    return;
                }
                return;
            case 19:
                try {
                    org.telegram.ui.Components.nm0 currentListView = ((rc0) ((pc0) obj).f42377o0).J0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 20:
                EditTextBoldCursor[] editTextBoldCursorArr = ((wd0) obj).f44638b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 21:
                ae0 ae0Var = (ae0) obj;
                org.telegram.ui.Components.bk0 bk0Var = ae0Var.e;
                EditTextBoldCursor editTextBoldCursor2 = ae0Var.f37748a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    ig0.W0(ae0Var.f37757y, editTextBoldCursor2);
                    bk0Var.getAnimatedDrawable().N(0, false, false);
                    bk0Var.d();
                    return;
                }
                return;
            case 22:
                ((org.telegram.ui.Components.bk0) obj).d();
                return;
            case 23:
                ((ie0) ((fi.c2) obj).f10604c).getClass();
                return;
            case 24:
                double currentTimeMillis2 = System.currentTimeMillis();
                ie0 ie0Var = ((he0) obj).f39868a;
                double d = ie0Var.Q;
                jf0 jf0Var = ie0Var.v;
                ie0Var.Q = currentTimeMillis2;
                int i19 = (int) (ie0Var.P - (currentTimeMillis2 - d));
                ie0Var.P = i19;
                if (i19 >= 1000) {
                    int i20 = i19 / 1000;
                    int i21 = i20 / 60;
                    int i22 = i20 - (i21 * 60);
                    jf0Var.setTextSize(1, 13.0f);
                    int i23 = ie0Var.E;
                    if (i23 != 4 && i23 != 3 && i23 != 11) {
                        if (i23 == 2) {
                            jf0Var.setText(LocaleController.formatString(R.string.SmsAvailableIn2, Integer.valueOf(i21), Integer.valueOf(i22)));
                            return;
                        }
                        return;
                    }
                    jf0Var.setText(LocaleController.formatString(R.string.CallAvailableIn2, Integer.valueOf(i21), Integer.valueOf(i22)));
                    return;
                }
                ie0Var.q();
                int i24 = ie0Var.E;
                if (i24 == 3 || i24 == 4 || i24 == 2 || i24 == 11) {
                    jf0Var.setTextSize(1, 15.0f);
                    int i25 = ie0Var.E;
                    if (i25 == 4) {
                        jf0Var.setText(LocaleController.getString(R.string.RequestCallButton));
                    } else if (i25 == 15) {
                        jf0Var.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                    } else if (i25 != 11 && i25 != 3) {
                        jf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.RequestAnotherSMS), true, 0.0f, 0.0f));
                    } else {
                        jf0Var.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i26 = org.telegram.ui.ActionBar.y6.P9;
                    org.telegram.ui.ActionBar.f7.V(jf0Var, i26, null);
                    jf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i26));
                    return;
                }
                return;
            case 25:
                double currentTimeMillis3 = System.currentTimeMillis();
                lf0 lf0Var = (lf0) ((f6.r) obj).f10237b;
                double d10 = currentTimeMillis3 - lf0Var.f41114d0;
                lf0Var.f41114d0 = currentTimeMillis3;
                int i27 = (int) (lf0Var.f41111b0 - d10);
                lf0Var.f41111b0 = i27;
                if (i27 <= 1000) {
                    lf0.o(lf0Var);
                    lf0Var.v.setVisibility(8);
                    jf0 jf0Var2 = lf0Var.f41136x;
                    if (jf0Var2 != null) {
                        jf0Var2.setVisibility(0);
                    }
                    lf0Var.t();
                    return;
                }
                return;
            case 26:
                double currentTimeMillis4 = System.currentTimeMillis();
                lf0 lf0Var2 = ((kf0) obj).f40791a;
                double d11 = lf0Var2.f41113c0;
                jf0 jf0Var3 = lf0Var2.v;
                lf0Var2.f41113c0 = currentTimeMillis4;
                int i28 = (int) (lf0Var2.f41109a0 - (currentTimeMillis4 - d11));
                lf0Var2.f41109a0 = i28;
                if (i28 >= 1000) {
                    int i29 = i28 / 1000;
                    int i30 = i29 / 60;
                    int i31 = i29 - (i30 * 60);
                    int i32 = lf0Var2.f41120i0;
                    if (i32 != 4 && i32 != 3 && i32 != 11) {
                        if (lf0Var2.f41119h0 == 2 && (i32 == 2 || i32 == 17 || i32 == 16)) {
                            jf0Var3.setText(LocaleController.formatString("ResendSmsAvailableIn", R.string.ResendSmsAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                            return;
                        } else if (i32 == 2 || i32 == 17 || i32 == 16) {
                            jf0Var3.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                            return;
                        } else {
                            return;
                        }
                    }
                    jf0Var3.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                    return;
                }
                lf0Var2.v();
                int i33 = lf0Var2.f41120i0;
                if (i33 == 3 || i33 == 4 || i33 == 2 || i33 == 17 || i33 == 16 || i33 == 11) {
                    if (i33 == 4) {
                        jf0Var3.setText(LocaleController.getString("RequestCallButton", R.string.RequestCallButton));
                    } else if (i33 != 11 && i33 != 3) {
                        jf0Var3.setText(LocaleController.getString("RequestSmsButton", R.string.RequestSmsButton));
                    } else {
                        jf0Var3.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i34 = org.telegram.ui.ActionBar.y6.P9;
                    org.telegram.ui.ActionBar.f7.V(jf0Var3, i34, null);
                    jf0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i34));
                    return;
                }
                return;
            case 27:
                ((org.telegram.ui.Components.e10) obj).run();
                return;
            case 28:
                tg0.j((tg0) obj);
                return;
            default:
                ((org.telegram.ui.Components.si) obj).setVisibility(8);
                return;
        }
    }
}
