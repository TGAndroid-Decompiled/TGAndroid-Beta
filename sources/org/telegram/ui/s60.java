package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class s60 extends org.telegram.ui.ActionBar.j {
    public final int f41305a;
    public final Object f41306b;

    public s60(Object obj, int i10) {
        this.f41305a = i10;
        this.f41306b = obj;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        Bitmap bitmap;
        int i13 = this.f41305a;
        Object obj = this.f41306b;
        switch (i13) {
            case 0:
                if (i10 == -1) {
                    ((w60) obj).finishFragment();
                    return;
                }
                return;
            case 1:
                if (i10 == -1) {
                    ((y60) obj).finishFragment();
                    return;
                }
                return;
            case 2:
                if (i10 == -1) {
                    ((e70) obj).finishFragment();
                    return;
                }
                return;
            case 3:
                if (i10 == -1) {
                    ((g70) obj).finishFragment();
                    return;
                }
                return;
            case 4:
                if (i10 == -1) {
                    ((x70) obj).finishFragment();
                    return;
                }
                return;
            case 5:
                if (i10 == -1) {
                    ((LanguageSelectActivity) obj).finishFragment();
                    return;
                }
                return;
            case 6:
                gb0 gb0Var = (gb0) obj;
                if (i10 == -1) {
                    gb0Var.finishFragment();
                    AndroidUtilities.hideKeyboard(gb0Var.F);
                    return;
                }
                return;
            case 7:
                if (i10 == -1) {
                    ((wb0) obj).finishFragment();
                    return;
                }
                return;
            case 8:
                hg0 hg0Var = (hg0) obj;
                if (i10 == 1) {
                    hg0Var.t1();
                    return;
                } else if (i10 == -1 && hg0Var.onBackPressed(true)) {
                    hg0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 9:
                if (i10 == -1) {
                    ((kg0) obj).finishFragment();
                    return;
                }
                return;
            case 10:
                if (i10 == -1) {
                    ((lh0) obj).finishFragment();
                    return;
                }
                return;
            case 11:
                if (i10 == -1) {
                    ((mh0) obj).finishFragment();
                    return;
                }
                return;
            case 12:
                xi0 xi0Var = (xi0) obj;
                if (i10 == -1) {
                    xi0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", xi0Var.f43616b);
                    xi0Var.presentFragment(new t91(bundle));
                    return;
                } else {
                    return;
                }
            case 13:
                if (i10 == -1) {
                    ((NotificationsCustomSettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 14:
                if (i10 == -1) {
                    ((NotificationsSettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 15:
                if (i10 == -1) {
                    ((PasscodeActivity) obj).finishFragment();
                    return;
                }
                return;
            case 16:
                if (i10 == -1) {
                    ((PasskeysActivity) obj).finishFragment();
                    return;
                }
                return;
            case 17:
                xp0 xp0Var = (xp0) obj;
                if (i10 == -1) {
                    xp0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    if (xp0Var.f43657c != null && !xp0Var.f43658f) {
                        vp0 vp0Var = xp0Var.d;
                        float f7 = vp0Var.f42787f - vp0Var.f42792x;
                        float f10 = vp0Var.v;
                        float f11 = (vp0Var.h - vp0Var.f42793y) / vp0Var.f42791w;
                        float f12 = vp0Var.d / f10;
                        float f13 = vp0Var.e / f10;
                        xp0 xp0Var2 = vp0Var.H;
                        int width = (int) ((f7 / f10) * xp0Var2.f43655a.getWidth());
                        int height = (int) (f11 * xp0Var2.f43655a.getHeight());
                        int width2 = (int) (f12 * xp0Var2.f43655a.getWidth());
                        int width3 = (int) (f13 * xp0Var2.f43655a.getWidth());
                        if (width < 0) {
                            i11 = 0;
                        } else {
                            i11 = width;
                        }
                        if (height < 0) {
                            i12 = 0;
                        } else {
                            i12 = height;
                        }
                        if (i11 + width2 > xp0Var2.f43655a.getWidth()) {
                            width2 = xp0Var2.f43655a.getWidth() - i11;
                        }
                        int i14 = width2;
                        if (i12 + width3 > xp0Var2.f43655a.getHeight()) {
                            width3 = xp0Var2.f43655a.getHeight() - i12;
                        }
                        int i15 = width3;
                        try {
                            bitmap = Bitmap.createBitmap(xp0Var2.f43655a, i11, i12, i14, i15, (Matrix) null, false);
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                            System.gc();
                            try {
                                bitmap = Bitmap.createBitmap(xp0Var2.f43655a, i11, i12, i14, i15, (Matrix) null, false);
                            } catch (Throwable th3) {
                                FileLog.e(th3);
                                bitmap = null;
                            }
                        }
                        if (bitmap == xp0Var.f43655a) {
                            xp0Var.e = true;
                        }
                        ((org.telegram.ui.Components.c50) xp0Var.f43657c).r(false, bitmap, null);
                        xp0Var.f43658f = true;
                    }
                    xp0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 18:
                lq0 lq0Var = (lq0) obj;
                if (i10 == -1) {
                    lq0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    boolean z10 = lq0Var.Y;
                    lq0Var.Y = !z10;
                    if (!z10) {
                        lq0Var.K.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
                    } else {
                        lq0Var.K.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
                    }
                    lq0Var.K.B0();
                    lq0Var.M.h1(0, 0);
                    lq0Var.L.l();
                    return;
                } else if (i10 == 2) {
                    kq0 kq0Var = lq0Var.f39357s0;
                    if (kq0Var != null) {
                        kq0Var.g();
                    }
                    lq0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 19:
                if (i10 == -1) {
                    ((qq0) obj).finishFragment();
                    return;
                }
                return;
            case 20:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                if (i10 == -1) {
                    popupNotificationActivity.i();
                    popupNotificationActivity.finish();
                    return;
                } else if (i10 == 1) {
                    int i16 = PopupNotificationActivity.f33789b0;
                    popupNotificationActivity.k();
                    return;
                } else if (i10 == 2) {
                    int i17 = PopupNotificationActivity.f33789b0;
                    popupNotificationActivity.p();
                    return;
                } else {
                    return;
                }
            case 21:
                aw0 aw0Var = (aw0) obj;
                if (i10 == -1) {
                    if (aw0Var.onBackPressed(true)) {
                        aw0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    aw0Var.Y();
                    return;
                } else {
                    return;
                }
            case 22:
                if (i10 == -1) {
                    ((PremiumPreviewFragment) obj).finishFragment();
                    return;
                }
                return;
            case 23:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                if (i10 == -1) {
                    if (privacyControlActivity.v0(true)) {
                        privacyControlActivity.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    privacyControlActivity.z0();
                    return;
                } else {
                    return;
                }
            case 24:
                if (i10 == -1) {
                    ((PrivacySettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 25:
                if (i10 == -1) {
                    ((nx0) obj).finishFragment();
                    return;
                }
                return;
            case 26:
                if (i10 == -1) {
                    ((ProxyListActivity) obj).finishFragment();
                    return;
                }
                return;
            case 27:
                if (i10 == -1) {
                    ((x11) obj).finishFragment();
                    return;
                }
                return;
            case 28:
                if (i10 == -1) {
                    ((c21) obj).finishFragment();
                    return;
                }
                return;
            default:
                if (i10 == -1) {
                    ((u21) obj).finishFragment();
                    return;
                }
                return;
        }
    }
}
