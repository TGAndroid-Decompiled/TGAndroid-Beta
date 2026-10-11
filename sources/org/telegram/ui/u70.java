package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class u70 extends org.telegram.ui.ActionBar.j {
    public final int f42372a;
    public final Object f42373b;

    public u70(Object obj, int i10) {
        this.f42372a = i10;
        this.f42373b = obj;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        Bitmap bitmap;
        int i13 = this.f42372a;
        Object obj = this.f42373b;
        switch (i13) {
            case 0:
                if (i10 == -1) {
                    ((v70) obj).finishFragment();
                    return;
                }
                return;
            case 1:
                if (i10 == -1) {
                    ((k80) obj).finishFragment();
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
                ub0 ub0Var = (ub0) obj;
                if (i10 == -1) {
                    ub0Var.finishFragment();
                    AndroidUtilities.hideKeyboard(ub0Var.F);
                    return;
                }
                return;
            case 4:
                if (i10 == -1) {
                    ((lc0) obj).finishFragment();
                    return;
                }
                return;
            case 5:
                vg0 vg0Var = (vg0) obj;
                if (i10 == 1) {
                    vg0Var.p1();
                    return;
                } else if (i10 == -1 && vg0Var.onBackPressed(true)) {
                    vg0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 6:
                if (i10 == -1) {
                    ((yg0) obj).finishFragment();
                    return;
                }
                return;
            case 7:
                if (i10 == -1) {
                    ((yh0) obj).finishFragment();
                    return;
                }
                return;
            case 8:
                if (i10 == -1) {
                    ((zh0) obj).finishFragment();
                    return;
                }
                return;
            case 9:
                kj0 kj0Var = (kj0) obj;
                if (i10 == -1) {
                    kj0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", kj0Var.f39351b);
                    kj0Var.presentFragment(new ab1(bundle));
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
                mq0 mq0Var = (mq0) obj;
                if (i10 == -1) {
                    mq0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    if (mq0Var.f40053c != null && !mq0Var.f40055f) {
                        kq0 kq0Var = mq0Var.d;
                        float f7 = kq0Var.f39398f - kq0Var.f39403x;
                        float f10 = kq0Var.v;
                        float f11 = (kq0Var.h - kq0Var.f39404y) / kq0Var.f39402w;
                        float f12 = kq0Var.d / f10;
                        float f13 = kq0Var.f39397e / f10;
                        mq0 mq0Var2 = kq0Var.H;
                        int width = (int) ((f7 / f10) * mq0Var2.f40051a.getWidth());
                        int height = (int) (f11 * mq0Var2.f40051a.getHeight());
                        int width2 = (int) (f12 * mq0Var2.f40051a.getWidth());
                        int width3 = (int) (f13 * mq0Var2.f40051a.getWidth());
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
                        if (i11 + width2 > mq0Var2.f40051a.getWidth()) {
                            width2 = mq0Var2.f40051a.getWidth() - i11;
                        }
                        int i14 = width2;
                        if (i12 + width3 > mq0Var2.f40051a.getHeight()) {
                            width3 = mq0Var2.f40051a.getHeight() - i12;
                        }
                        int i15 = width3;
                        try {
                            bitmap = Bitmap.createBitmap(mq0Var2.f40051a, i11, i12, i14, i15, (Matrix) null, false);
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                            System.gc();
                            try {
                                bitmap = Bitmap.createBitmap(mq0Var2.f40051a, i11, i12, i14, i15, (Matrix) null, false);
                            } catch (Throwable th3) {
                                FileLog.e(th3);
                                bitmap = null;
                            }
                        }
                        if (bitmap == mq0Var.f40051a) {
                            mq0Var.f40054e = true;
                        }
                        ((org.telegram.ui.Components.n50) mq0Var.f40053c).r(false, bitmap, null);
                        mq0Var.f40055f = true;
                    }
                    mq0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 15:
                ar0 ar0Var = (ar0) obj;
                if (i10 == -1) {
                    ar0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    boolean z10 = ar0Var.Y;
                    ar0Var.Y = !z10;
                    if (!z10) {
                        ar0Var.K.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
                    } else {
                        ar0Var.K.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
                    }
                    ar0Var.K.B0();
                    ar0Var.M.h1(0, 0);
                    ar0Var.L.l();
                    return;
                } else if (i10 == 2) {
                    zq0 zq0Var = ar0Var.f36158s0;
                    if (zq0Var != null) {
                        zq0Var.g();
                    }
                    ar0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 16:
                if (i10 == -1) {
                    ((fr0) obj).finishFragment();
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
                    int i16 = PopupNotificationActivity.f34140b0;
                    popupNotificationActivity.k();
                    return;
                } else if (i10 == 2) {
                    int i17 = PopupNotificationActivity.f34140b0;
                    popupNotificationActivity.p();
                    return;
                } else {
                    return;
                }
            case 18:
                sw0 sw0Var = (sw0) obj;
                if (i10 == -1) {
                    if (sw0Var.onBackPressed(true)) {
                        sw0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    sw0Var.Y();
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
                    ((fy0) obj).finishFragment();
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
                    ((f31) obj).finishFragment();
                    return;
                }
                return;
            case 25:
                if (i10 == -1) {
                    ((k31) obj).finishFragment();
                    return;
                }
                return;
            case 26:
                if (i10 == -1) {
                    ((e41) obj).finishFragment();
                    return;
                }
                return;
            case 27:
                if (i10 == -1) {
                    ((m41) obj).finishFragment();
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
