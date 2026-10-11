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
public final class tz implements Runnable {
    public final int f42296a;
    public final Object f42297b;

    public tz(Object obj, int i10) {
        this.f42296a = i10;
        this.f42297b = obj;
    }

    @Override
    public final void run() {
        int i10;
        a80 a80Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i11 = this.f42296a;
        Object obj = this.f42297b;
        switch (i11) {
            case 0:
                ((zz) obj).f42798a.getBackground().setState(new int[0]);
                return;
            case 1:
                v10 v10Var = (v10) obj;
                AndroidUtilities.cancelRunOnUIThread(v10Var.f42846n0);
                v10Var.f42828a.a(false, true);
                return;
            case 2:
                v10 v10Var2 = ((k10) obj).f39162a;
                v10Var2.h(v10Var2.E, v10Var2.F, v10Var2.H, v10Var2.G, v10Var2.f42855y, v10Var2.J, v10Var2.f42853w, false);
                return;
            case 3:
                ((FiltersSetupActivity) ((ai.w0) obj).W2).getMessagesController().lockFiltersInternal();
                return;
            case 4:
                x10 x10Var = (x10) obj;
                x10Var.f43935s.a();
                x10Var.f43933n.invalidate();
                x10Var.E.Z(true);
                return;
            case 5:
                FiltersSetupActivity filtersSetupActivity = ((e20) obj).d;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = filtersSetupActivity.getMessagesController().getDialogFilters();
                    for (int i12 = 0; i12 < dialogFilters.size(); i12++) {
                        if (dialogFilters.get(i12).isDefault() && i12 != 0) {
                            FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.f33789b.f36245e;
                            ArrayList<MessagesController.DialogFilter> arrayList = filtersSetupActivity2.getMessagesController().dialogFilters;
                            if (i12 < 0 || i12 >= arrayList.size()) {
                                i10 = 1;
                            } else {
                                arrayList.add(0, arrayList.remove(i12));
                                for (int i13 = 0; i13 <= i12; i13++) {
                                    arrayList.get(i13).order = i13;
                                }
                                i10 = 1;
                                filtersSetupActivity2.f33791e = true;
                                filtersSetupActivity2.Z(true);
                            }
                            filtersSetupActivity.f33788a.u0(0);
                            try {
                                filtersSetupActivity.fragmentView.performHapticFeedback(3, i10);
                            } catch (Exception unused) {
                            }
                            org.telegram.ui.Components.ad a02 = org.telegram.ui.Components.ad.a0(filtersSetupActivity);
                            int i14 = R.raw.filter_reorder;
                            int i15 = R.string.LimitReachedReorderFolder;
                            Object[] objArr = new Object[i10];
                            objArr[0] = LocaleController.getString(R.string.FilterAllChats);
                            a02.I(i14, AndroidUtilities.replaceTags(LocaleController.formatString("LimitReachedReorderFolder", i15, objArr)), LocaleController.getString(R.string.PremiumMore), 5000, false, new w10(filtersSetupActivity, 2)).j();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 6:
                g60 g60Var = ((o30) obj).f40408b;
                g60Var.f37909j2 = null;
                g60Var.K1(g60Var.F1, true);
                return;
            case 7:
                n50 n50Var = (n50) obj;
                g60 g60Var2 = n50Var.f40131f;
                a40 a40Var = g60Var2.f37871b;
                ImageLocation imageLocation = n50Var.d;
                if (imageLocation != null) {
                    a40Var.K0 = imageLocation;
                    a40Var.f31818q1 = null;
                    a40Var.f31819r1 = null;
                    n50Var.d = null;
                }
                TLRPC.Chat chat = g60Var2.d.getMessagesController().getChat(Long.valueOf(-n50Var.f40130e));
                ImageLocation forChat = ImageLocation.getForChat(chat, 0);
                ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
                if (ImageLocation.getForLocal(n50Var.f40128b) == null) {
                    forChat2 = ImageLocation.getForLocal(n50Var.f40129c);
                }
                a40Var.setCreateThumbFromParent(false);
                a40Var.H(null, forChat, forChat2, true);
                n50Var.f40129c = null;
                n50Var.f40128b = null;
                AndroidUtilities.updateVisibleRows(g60Var2.Q);
                n50Var.a(1.0f);
                return;
            case 8:
                q50 q50Var = ((r50) obj).f41326g;
                if (q50Var != null) {
                    q50Var.invalidate();
                    return;
                }
                return;
            case 9:
                j70 j70Var = (j70) obj;
                j70Var.f38872y = null;
                j70Var.E = null;
                j70Var.F = null;
                j70Var.G = null;
                j70Var.I = null;
                j70Var.H = null;
                j70Var.J = 0.0d;
                j70Var.Z(false, true);
                j70Var.d.h(null, null, j70Var.f38868r, null);
                j70Var.f38866f.setAnimation(j70Var.R);
                j70Var.R.M(0);
                return;
            case 10:
                org.telegram.messenger.q.q(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.ad.a0(((m70) obj).f39828c), R.raw.done, 36);
                return;
            case 11:
                c80 c80Var = (c80) obj;
                a80 a80Var2 = c80Var.I;
                int i16 = R.drawable.intro_powerful_mask;
                int i17 = org.telegram.ui.ActionBar.h6.f20786d6;
                int x02 = org.telegram.ui.ActionBar.h6.x0(null, i17, false);
                int i18 = a80.f35917y;
                a80Var2.b(i16, 17, x02, true);
                int[] iArr = c80Var.I.f35923n;
                Intro.setPowerfulTextures(iArr[17], iArr[18], iArr[16], iArr[15]);
                a80 a80Var3 = c80Var.I;
                a80Var3.c(a80Var3.v, 23, true);
                int[] iArr2 = c80Var.I.f35923n;
                Intro.setTelegramTextures(iArr2[22], iArr2[21], iArr2[23]);
                Intro.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i17, false));
                return;
            case 12:
                y70 y70Var = (y70) obj;
                y70Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                c80 c80Var2 = (c80) y70Var.f44276b;
                Intro.setPage(c80Var2.H);
                Intro.setDate(((float) (currentTimeMillis - c80Var2.J)) / 1000.0f);
                Intro.onDrawFrame(0);
                a80 a80Var4 = c80Var2.I;
                if (a80Var4 != null && a80Var4.isAlive() && (eGLDisplay = (a80Var = c80Var2.I).f35920c) != null && (eGLSurface = a80Var.f35922f) != null) {
                    try {
                        a80Var.f35919b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 13:
                c80 c80Var3 = ((z70) obj).f44600b;
                c80Var3.presentFragment(new vg0(), true);
                c80Var3.M = true;
                return;
            case 14:
                ((a80) obj).finish();
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
                ((ua0) obj).f42464a.C0.setVisibility(8);
                return;
            case 17:
                ((bc0) obj).f0();
                return;
            case 18:
                try {
                    org.telegram.ui.Components.sm0 currentListView = ((gd0) ((ed0) obj).f37270z0).K0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 19:
                EditTextBoldCursor[] editTextBoldCursorArr = ((ke0) obj).f39311b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 20:
                ne0 ne0Var = (ne0) obj;
                org.telegram.ui.Components.hk0 hk0Var = ne0Var.f40228e;
                EditTextBoldCursor editTextBoldCursor2 = ne0Var.f40225a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    vg0.T0(ne0Var.f40235y, editTextBoldCursor2);
                    hk0Var.getAnimatedDrawable().N(0, false, false);
                    hk0Var.d();
                    return;
                }
                return;
            case 21:
                ((org.telegram.ui.Components.hk0) obj).d();
                return;
            case 22:
                ((ve0) ((ci.g2) obj).f5115c).getClass();
                return;
            case 23:
                double currentTimeMillis2 = System.currentTimeMillis();
                ve0 ve0Var = ((ue0) obj).f42538a;
                double d = ve0Var.Q;
                wf0 wf0Var = ve0Var.v;
                ve0Var.Q = currentTimeMillis2;
                int i19 = (int) (ve0Var.P - (currentTimeMillis2 - d));
                ve0Var.P = i19;
                if (i19 >= 1000) {
                    int i20 = i19 / 1000;
                    int i21 = i20 / 60;
                    int i22 = i20 - (i21 * 60);
                    wf0Var.setTextSize(1, 13.0f);
                    int i23 = ve0Var.E;
                    if (i23 != 4 && i23 != 3 && i23 != 11) {
                        if (i23 == 2) {
                            wf0Var.setText(LocaleController.formatString(R.string.SmsAvailableIn2, Integer.valueOf(i21), Integer.valueOf(i22)));
                            return;
                        }
                        return;
                    }
                    wf0Var.setText(LocaleController.formatString(R.string.CallAvailableIn2, Integer.valueOf(i21), Integer.valueOf(i22)));
                    return;
                }
                ve0Var.r();
                int i24 = ve0Var.E;
                if (i24 == 3 || i24 == 4 || i24 == 2 || i24 == 11) {
                    wf0Var.setTextSize(1, 15.0f);
                    int i25 = ve0Var.E;
                    if (i25 == 4) {
                        wf0Var.setText(LocaleController.getString(R.string.RequestCallButton));
                    } else if (i25 == 15) {
                        wf0Var.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                    } else if (i25 != 11 && i25 != 3) {
                        wf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.RequestAnotherSMS), true, 0.0f, 0.0f));
                    } else {
                        wf0Var.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i26 = org.telegram.ui.ActionBar.h6.P9;
                    wf0Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i26, false));
                    wf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i26));
                    return;
                }
                return;
            case 24:
                double currentTimeMillis3 = System.currentTimeMillis();
                yf0 yf0Var = (yf0) ((ci.n2) obj).f5630b;
                double d10 = currentTimeMillis3 - yf0Var.f44360b0;
                yf0Var.f44360b0 = currentTimeMillis3;
                int i27 = (int) (yf0Var.W - d10);
                yf0Var.W = i27;
                if (i27 <= 1000) {
                    yf0.p(yf0Var);
                    yf0Var.v.setVisibility(8);
                    wf0 wf0Var2 = yf0Var.f44384x;
                    if (wf0Var2 != null) {
                        wf0Var2.setVisibility(0);
                    }
                    yf0Var.v();
                    return;
                }
                return;
            case 25:
                double currentTimeMillis4 = System.currentTimeMillis();
                yf0 yf0Var2 = ((xf0) obj).f44062a;
                double d11 = yf0Var2.f44358a0;
                wf0 wf0Var3 = yf0Var2.v;
                yf0Var2.f44358a0 = currentTimeMillis4;
                int i28 = (int) (yf0Var2.V - (currentTimeMillis4 - d11));
                yf0Var2.V = i28;
                if (i28 >= 1000) {
                    int i29 = i28 / 1000;
                    int i30 = i29 / 60;
                    int i31 = i29 - (i30 * 60);
                    int i32 = yf0Var2.f44368g0;
                    if (i32 != 4 && i32 != 3 && i32 != 11) {
                        if (yf0Var2.f44367f0 == 2 && (i32 == 2 || i32 == 17 || i32 == 16)) {
                            wf0Var3.setText(LocaleController.formatString("ResendSmsAvailableIn", R.string.ResendSmsAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                            return;
                        } else if (i32 == 2 || i32 == 17 || i32 == 16) {
                            wf0Var3.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                            return;
                        } else {
                            return;
                        }
                    }
                    wf0Var3.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, Integer.valueOf(i30), Integer.valueOf(i31)));
                    return;
                }
                yf0Var2.w();
                int i33 = yf0Var2.f44368g0;
                if (i33 == 3 || i33 == 4 || i33 == 2 || i33 == 17 || i33 == 16 || i33 == 11) {
                    if (i33 == 4) {
                        wf0Var3.setText(LocaleController.getString("RequestCallButton", R.string.RequestCallButton));
                    } else if (i33 != 11 && i33 != 3) {
                        wf0Var3.setText(LocaleController.getString("RequestSmsButton", R.string.RequestSmsButton));
                    } else {
                        wf0Var3.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i34 = org.telegram.ui.ActionBar.h6.P9;
                    wf0Var3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i34, false));
                    wf0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i34));
                    return;
                }
                return;
            case 26:
                ((org.telegram.ui.Components.qo0) obj).run();
                return;
            case 27:
                gh0.j((gh0) obj);
                return;
            case 28:
                ((org.telegram.ui.Components.xi) obj).setVisibility(8);
                return;
            default:
                AndroidUtilities.showKeyboard(((ck0) ((g) obj).f37816b).Q);
                return;
        }
    }
}
