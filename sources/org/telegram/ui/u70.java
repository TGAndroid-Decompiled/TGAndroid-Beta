package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class u70 extends org.telegram.ui.ActionBar.j {
    public final int f42348a;
    public final Object f42349b;

    public u70(Object obj, int i10) {
        this.f42348a = i10;
        this.f42349b = obj;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        Bitmap bitmap;
        int i13 = this.f42348a;
        Object obj = this.f42349b;
        switch (i13) {
            case 0:
                if (i10 == -1) {
                    ((v70) obj).finishFragment();
                    return;
                }
                return;
            case 1:
                if (i10 == -1) {
                    ((l80) obj).finishFragment();
                    return;
                }
                return;
            case 2:
                if (i10 == -1) {
                    ((LanguageSelectActivity) obj).finishFragment();
                    return;
                }
                return;
            case 3:
                vb0 vb0Var = (vb0) obj;
                if (i10 == -1) {
                    vb0Var.finishFragment();
                    AndroidUtilities.hideKeyboard(vb0Var.F);
                    return;
                }
                return;
            case 4:
                if (i10 == -1) {
                    ((mc0) obj).finishFragment();
                    return;
                }
                return;
            case 5:
                wg0 wg0Var = (wg0) obj;
                if (i10 == 1) {
                    wg0Var.p1();
                    return;
                } else if (i10 == -1 && wg0Var.onBackPressed(true)) {
                    wg0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 6:
                if (i10 == -1) {
                    ((zg0) obj).finishFragment();
                    return;
                }
                return;
            case 7:
                if (i10 == -1) {
                    ((zh0) obj).finishFragment();
                    return;
                }
                return;
            case 8:
                if (i10 == -1) {
                    ((ai0) obj).finishFragment();
                    return;
                }
                return;
            case 9:
                lj0 lj0Var = (lj0) obj;
                if (i10 == -1) {
                    lj0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", lj0Var.f39595b);
                    lj0Var.presentFragment(new bb1(bundle));
                    return;
                } else {
                    return;
                }
            case 10:
                if (i10 == -1) {
                    ((NotificationsCustomSettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 11:
                if (i10 == -1) {
                    ((NotificationsSettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 12:
                if (i10 == -1) {
                    ((PasscodeActivity) obj).finishFragment();
                    return;
                }
                return;
            case 13:
                if (i10 == -1) {
                    ((PasskeysActivity) obj).finishFragment();
                    return;
                }
                return;
            case 14:
                nq0 nq0Var = (nq0) obj;
                if (i10 == -1) {
                    nq0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    if (nq0Var.f40350c != null && !nq0Var.f40352f) {
                        lq0 lq0Var = nq0Var.d;
                        float f7 = lq0Var.f39655f - lq0Var.f39660x;
                        float f10 = lq0Var.v;
                        float f11 = (lq0Var.h - lq0Var.f39661y) / lq0Var.f39659w;
                        float f12 = lq0Var.d / f10;
                        float f13 = lq0Var.f39654e / f10;
                        nq0 nq0Var2 = lq0Var.H;
                        int width = (int) ((f7 / f10) * nq0Var2.f40348a.getWidth());
                        int height = (int) (f11 * nq0Var2.f40348a.getHeight());
                        int width2 = (int) (f12 * nq0Var2.f40348a.getWidth());
                        int width3 = (int) (f13 * nq0Var2.f40348a.getWidth());
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
                        if (i11 + width2 > nq0Var2.f40348a.getWidth()) {
                            width2 = nq0Var2.f40348a.getWidth() - i11;
                        }
                        int i14 = width2;
                        if (i12 + width3 > nq0Var2.f40348a.getHeight()) {
                            width3 = nq0Var2.f40348a.getHeight() - i12;
                        }
                        int i15 = width3;
                        try {
                            bitmap = Bitmap.createBitmap(nq0Var2.f40348a, i11, i12, i14, i15, (Matrix) null, false);
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                            System.gc();
                            try {
                                bitmap = Bitmap.createBitmap(nq0Var2.f40348a, i11, i12, i14, i15, (Matrix) null, false);
                            } catch (Throwable th3) {
                                FileLog.e(th3);
                                bitmap = null;
                            }
                        }
                        if (bitmap == nq0Var.f40348a) {
                            nq0Var.f40351e = true;
                        }
                        ((org.telegram.ui.Components.m50) nq0Var.f40350c).r(false, bitmap, null);
                        nq0Var.f40352f = true;
                    }
                    nq0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 15:
                br0 br0Var = (br0) obj;
                if (i10 == -1) {
                    br0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    boolean z10 = br0Var.Y;
                    br0Var.Y = !z10;
                    if (!z10) {
                        br0Var.K.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
                    } else {
                        br0Var.K.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
                    }
                    br0Var.K.B0();
                    br0Var.M.h1(0, 0);
                    br0Var.L.l();
                    return;
                } else if (i10 == 2) {
                    ar0 ar0Var = br0Var.f36412s0;
                    if (ar0Var != null) {
                        ar0Var.g();
                    }
                    br0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 16:
                if (i10 == -1) {
                    ((gr0) obj).finishFragment();
                    return;
                }
                return;
            case 17:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                if (i10 == -1) {
                    popupNotificationActivity.i();
                    popupNotificationActivity.finish();
                    return;
                } else if (i10 == 1) {
                    int i16 = PopupNotificationActivity.f34112b0;
                    popupNotificationActivity.k();
                    return;
                } else if (i10 == 2) {
                    int i17 = PopupNotificationActivity.f34112b0;
                    popupNotificationActivity.p();
                    return;
                } else {
                    return;
                }
            case 18:
                tw0 tw0Var = (tw0) obj;
                if (i10 == -1) {
                    if (tw0Var.onBackPressed(true)) {
                        tw0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    tw0Var.Y();
                    return;
                } else {
                    return;
                }
            case 19:
                if (i10 == -1) {
                    ((PremiumPreviewFragment) obj).finishFragment();
                    return;
                }
                return;
            case 20:
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
            case 21:
                if (i10 == -1) {
                    ((PrivacySettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 22:
                if (i10 == -1) {
                    ((gy0) obj).finishFragment();
                    return;
                }
                return;
            case 23:
                if (i10 == -1) {
                    ((ProxyListActivity) obj).finishFragment();
                    return;
                }
                return;
            case 24:
                if (i10 == -1) {
                    ((g31) obj).finishFragment();
                    return;
                }
                return;
            case 25:
                if (i10 == -1) {
                    ((l31) obj).finishFragment();
                    return;
                }
                return;
            case 26:
                if (i10 == -1) {
                    ((f41) obj).finishFragment();
                    return;
                }
                return;
            case 27:
                if (i10 == -1) {
                    ((n41) obj).finishFragment();
                    return;
                }
                return;
            case 28:
                if (i10 == -1) {
                    ((SaveToGallerySettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            default:
                if (i10 == -1) {
                    ((SecretMediaViewer) obj).e(true, false);
                    return;
                }
                return;
        }
    }
}
