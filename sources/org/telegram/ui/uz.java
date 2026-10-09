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
public final class uz implements Runnable {
    public final int f42584a;
    public final Object f42585b;

    public uz(Object obj, int i10) {
        this.f42584a = i10;
        this.f42585b = obj;
    }

    @Override
    public final void run() {
        int i10;
        b80 b80Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i11 = this.f42584a;
        Object obj = this.f42585b;
        switch (i11) {
            case 0:
                ((a00) obj).f43010a.getBackground().setState(new int[0]);
                return;
            case 1:
                w10 w10Var = (w10) obj;
                AndroidUtilities.cancelRunOnUIThread(w10Var.f43058n0);
                w10Var.f43040a.a(false, true);
                return;
            case 2:
                w10 w10Var2 = ((l10) obj).f39393a;
                w10Var2.h(w10Var2.E, w10Var2.F, w10Var2.H, w10Var2.G, w10Var2.f43067y, w10Var2.J, w10Var2.f43065w, false);
                return;
            case 3:
                ((FiltersSetupActivity) ((ai.w0) obj).W2).getMessagesController().lockFiltersInternal();
                return;
            case 4:
                y10 y10Var = (y10) obj;
                y10Var.f44208s.a();
                y10Var.f44206n.invalidate();
                y10Var.E.Z(true);
                return;
            case 5:
                FiltersSetupActivity filtersSetupActivity = ((f20) obj).d;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = filtersSetupActivity.getMessagesController().getDialogFilters();
                    for (int i12 = 0; i12 < dialogFilters.size(); i12++) {
                        if (dialogFilters.get(i12).isDefault() && i12 != 0) {
                            FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.f33761b.f36499e;
                            ArrayList<MessagesController.DialogFilter> arrayList = filtersSetupActivity2.getMessagesController().dialogFilters;
                            if (i12 < 0 || i12 >= arrayList.size()) {
                                i10 = 1;
                            } else {
                                arrayList.add(0, arrayList.remove(i12));
                                for (int i13 = 0; i13 <= i12; i13++) {
                                    arrayList.get(i13).order = i13;
                                }
                                i10 = 1;
                                filtersSetupActivity2.f33763e = true;
                                filtersSetupActivity2.Z(true);
                            }
                            filtersSetupActivity.f33760a.u0(0);
                            try {
                                filtersSetupActivity.fragmentView.performHapticFeedback(3, i10);
                            } catch (Exception unused) {
                            }
                            org.telegram.ui.Components.ad a02 = org.telegram.ui.Components.ad.a0(filtersSetupActivity);
                            int i14 = R.raw.filter_reorder;
                            int i15 = R.string.LimitReachedReorderFolder;
                            Object[] objArr = new Object[i10];
                            objArr[0] = LocaleController.getString(R.string.FilterAllChats);
                            a02.I(i14, AndroidUtilities.replaceTags(LocaleController.formatString("LimitReachedReorderFolder", i15, objArr)), LocaleController.getString(R.string.PremiumMore), 5000, false, new x10(filtersSetupActivity, 2)).j();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 6:
                g60 g60Var = ((o30) obj).f40405b;
                g60Var.f37827j2 = null;
                g60Var.K1(g60Var.F1, true);
                return;
            case 7:
                n50 n50Var = (n50) obj;
                g60 g60Var2 = n50Var.f40078f;
                a40 a40Var = g60Var2.f37789b;
                ImageLocation imageLocation = n50Var.d;
                if (imageLocation != null) {
                    a40Var.K0 = imageLocation;
                    a40Var.f31205q1 = null;
                    a40Var.f31206r1 = null;
                    n50Var.d = null;
                }
                TLRPC.Chat chat = g60Var2.d.getMessagesController().getChat(Long.valueOf(-n50Var.f40077e));
                ImageLocation forChat = ImageLocation.getForChat(chat, 0);
                ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
                if (ImageLocation.getForLocal(n50Var.f40075b) == null) {
                    forChat2 = ImageLocation.getForLocal(n50Var.f40076c);
                }
                a40Var.setCreateThumbFromParent(false);
                a40Var.H(null, forChat, forChat2, true);
                n50Var.f40076c = null;
                n50Var.f40075b = null;
                AndroidUtilities.updateVisibleRows(g60Var2.Q);
                n50Var.a(1.0f);
                return;
            case 8:
                q50 q50Var = ((r50) obj).f41270g;
                if (q50Var != null) {
                    q50Var.invalidate();
                    return;
                }
                return;
            case 9:
                j70 j70Var = (j70) obj;
                j70Var.f38853y = null;
                j70Var.E = null;
                j70Var.F = null;
                j70Var.G = null;
                j70Var.I = null;
                j70Var.H = null;
                j70Var.J = 0.0d;
                j70Var.Z(false, true);
                j70Var.d.h(null, null, j70Var.f38849r, null);
                j70Var.f38847f.setAnimation(j70Var.R);
                j70Var.R.M(0);
                return;
            case 10:
                org.telegram.messenger.q.q(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.ad.a0(((n70) obj).f40093c), R.raw.done, 36);
                return;
            case 11:
                d80 d80Var = (d80) obj;
                b80 b80Var2 = d80Var.I;
                int i16 = R.drawable.intro_powerful_mask;
                int i17 = org.telegram.ui.ActionBar.i6.f20797d6;
                int x02 = org.telegram.ui.ActionBar.i6.x0(null, i17, false);
                int i18 = b80.f36158y;
                b80Var2.b(i16, 17, x02, true);
                int[] iArr = d80Var.I.f36164n;
                Intro.setPowerfulTextures(iArr[17], iArr[18], iArr[16], iArr[15]);
                b80 b80Var3 = d80Var.I;
                b80Var3.c(b80Var3.v, 23, true);
                int[] iArr2 = d80Var.I.f36164n;
                Intro.setTelegramTextures(iArr2[22], iArr2[21], iArr2[23]);
                Intro.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, i17, false));
                return;
            case 12:
                y70 y70Var = (y70) obj;
                y70Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                d80 d80Var2 = (d80) y70Var.f44271b;
                Intro.setPage(d80Var2.H);
                Intro.setDate(((float) (currentTimeMillis - d80Var2.J)) / 1000.0f);
                Intro.onDrawFrame(0);
                b80 b80Var4 = d80Var2.I;
                if (b80Var4 != null && b80Var4.isAlive() && (eGLDisplay = (b80Var = d80Var2.I).f36161c) != null && (eGLSurface = b80Var.f36163f) != null) {
                    try {
                        b80Var.f36160b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                return;
            case 13:
                d80 d80Var3 = ((z70) obj).f44504b;
                d80Var3.presentFragment(new wg0(), true);
                d80Var3.M = true;
                return;
            case 14:
                ((b80) obj).finish();
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
                ((va0) obj).f42762a.C0.setVisibility(8);
                return;
            case 17:
                ((cc0) obj).f0();
                return;
            case 18:
                try {
                    org.telegram.ui.Components.qm0 currentListView = ((hd0) ((fd0) obj).f37515z0).K0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        return;
                    }
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 19:
                EditTextBoldCursor[] editTextBoldCursorArr = ((le0) obj).f39549b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 20:
                oe0 oe0Var = (oe0) obj;
                org.telegram.ui.Components.fk0 fk0Var = oe0Var.f40507e;
                EditTextBoldCursor editTextBoldCursor2 = oe0Var.f40504a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    wg0.T0(oe0Var.f40514y, editTextBoldCursor2);
                    fk0Var.getAnimatedDrawable().N(0, false, false);
                    fk0Var.d();
                    return;
                }
                return;
            case 21:
                ((org.telegram.ui.Components.fk0) obj).d();
                return;
            case 22:
                ((we0) ((ci.g2) obj).f5116c).getClass();
                return;
            case 23:
                double currentTimeMillis2 = System.currentTimeMillis();
                we0 we0Var = ((ve0) obj).f42836a;
                double d = we0Var.Q;
                xf0 xf0Var = we0Var.v;
                we0Var.Q = currentTimeMillis2;
                int i19 = (int) (we0Var.P - (currentTimeMillis2 - d));
                we0Var.P = i19;
                if (i19 >= 1000) {
                    int i20 = i19 / 1000;
                    int i21 = i20 / 60;
                    int i22 = i20 - (i21 * 60);
                    xf0Var.setTextSize(1, 13.0f);
                    int i23 = we0Var.E;
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
                we0Var.r();
                int i24 = we0Var.E;
                if (i24 == 3 || i24 == 4 || i24 == 2 || i24 == 11) {
                    xf0Var.setTextSize(1, 15.0f);
                    int i25 = we0Var.E;
                    if (i25 == 4) {
                        xf0Var.setText(LocaleController.getString(R.string.RequestCallButton));
                    } else if (i25 == 15) {
                        xf0Var.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                    } else if (i25 != 11 && i25 != 3) {
                        xf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.RequestAnotherSMS), true, 0.0f, 0.0f));
                    } else {
                        xf0Var.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i26 = org.telegram.ui.ActionBar.i6.P9;
                    xf0Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i26, false));
                    xf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i26));
                    return;
                }
                return;
            case 24:
                double currentTimeMillis3 = System.currentTimeMillis();
                zf0 zf0Var = (zf0) ((ci.n2) obj).f5631b;
                double d10 = currentTimeMillis3 - zf0Var.f44588b0;
                zf0Var.f44588b0 = currentTimeMillis3;
                int i27 = (int) (zf0Var.W - d10);
                zf0Var.W = i27;
                if (i27 <= 1000) {
                    zf0.p(zf0Var);
                    zf0Var.v.setVisibility(8);
                    xf0 xf0Var2 = zf0Var.f44612x;
                    if (xf0Var2 != null) {
                        xf0Var2.setVisibility(0);
                    }
                    zf0Var.v();
                    return;
                }
                return;
            case 25:
                double currentTimeMillis4 = System.currentTimeMillis();
                zf0 zf0Var2 = ((yf0) obj).f44334a;
                double d11 = zf0Var2.f44586a0;
                xf0 xf0Var3 = zf0Var2.v;
                zf0Var2.f44586a0 = currentTimeMillis4;
                int i28 = (int) (zf0Var2.V - (currentTimeMillis4 - d11));
                zf0Var2.V = i28;
                if (i28 >= 1000) {
                    int i29 = i28 / 1000;
                    int i30 = i29 / 60;
                    int i31 = i29 - (i30 * 60);
                    int i32 = zf0Var2.f44596g0;
                    if (i32 != 4 && i32 != 3 && i32 != 11) {
                        if (zf0Var2.f44595f0 == 2 && (i32 == 2 || i32 == 17 || i32 == 16)) {
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
                int i33 = zf0Var2.f44596g0;
                if (i33 == 3 || i33 == 4 || i33 == 2 || i33 == 17 || i33 == 16 || i33 == 11) {
                    if (i33 == 4) {
                        xf0Var3.setText(LocaleController.getString("RequestCallButton", R.string.RequestCallButton));
                    } else if (i33 != 11 && i33 != 3) {
                        xf0Var3.setText(LocaleController.getString("RequestSmsButton", R.string.RequestSmsButton));
                    } else {
                        xf0Var3.setText(LocaleController.getString(R.string.RequestMissedCall));
                    }
                    int i34 = org.telegram.ui.ActionBar.i6.P9;
                    xf0Var3.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i34, false));
                    xf0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i34));
                    return;
                }
                return;
            case 26:
                ((org.telegram.ui.Components.oo0) obj).run();
                return;
            case 27:
                hh0.j((hh0) obj);
                return;
            case 28:
                ((org.telegram.ui.Components.xi) obj).setVisibility(8);
                return;
            default:
                AndroidUtilities.showKeyboard(((dk0) ((g) obj).f37729b).Q);
                return;
        }
    }
}
