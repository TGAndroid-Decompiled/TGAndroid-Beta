package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class s60 extends org.telegram.ui.ActionBar.j {
    public final int f41310a;
    public final Object f41311b;

    public s60(Object obj, int i10) {
        this.f41310a = i10;
        this.f41311b = obj;
    }

    @Override
    public final void b(int i10) {
        int i11;
        int i12;
        Bitmap bitmap;
        int i13 = this.f41310a;
        Object obj = this.f41311b;
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
                ig0 ig0Var = (ig0) obj;
                if (i10 == 1) {
                    ig0Var.t1();
                    return;
                } else if (i10 == -1 && ig0Var.onBackPressed(true)) {
                    ig0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 9:
                if (i10 == -1) {
                    ((lg0) obj).finishFragment();
                    return;
                }
                return;
            case 10:
                if (i10 == -1) {
                    ((mh0) obj).finishFragment();
                    return;
                }
                return;
            case 11:
                if (i10 == -1) {
                    ((nh0) obj).finishFragment();
                    return;
                }
                return;
            case 12:
                yi0 yi0Var = (yi0) obj;
                if (i10 == -1) {
                    yi0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", yi0Var.f43875b);
                    yi0Var.presentFragment(new u91(bundle));
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
                yp0 yp0Var = (yp0) obj;
                if (i10 == -1) {
                    yp0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    if (yp0Var.f43947c != null && !yp0Var.f43948f) {
                        wp0 wp0Var = yp0Var.d;
                        float f7 = wp0Var.f43412f - wp0Var.f43417x;
                        float f10 = wp0Var.v;
                        float f11 = (wp0Var.h - wp0Var.f43418y) / wp0Var.f43416w;
                        float f12 = wp0Var.d / f10;
                        float f13 = wp0Var.e / f10;
                        yp0 yp0Var2 = wp0Var.H;
                        int width = (int) ((f7 / f10) * yp0Var2.f43945a.getWidth());
                        int height = (int) (f11 * yp0Var2.f43945a.getHeight());
                        int width2 = (int) (f12 * yp0Var2.f43945a.getWidth());
                        int width3 = (int) (f13 * yp0Var2.f43945a.getWidth());
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
                        if (i11 + width2 > yp0Var2.f43945a.getWidth()) {
                            width2 = yp0Var2.f43945a.getWidth() - i11;
                        }
                        int i14 = width2;
                        if (i12 + width3 > yp0Var2.f43945a.getHeight()) {
                            width3 = yp0Var2.f43945a.getHeight() - i12;
                        }
                        int i15 = width3;
                        try {
                            bitmap = Bitmap.createBitmap(yp0Var2.f43945a, i11, i12, i14, i15, (Matrix) null, false);
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                            System.gc();
                            try {
                                bitmap = Bitmap.createBitmap(yp0Var2.f43945a, i11, i12, i14, i15, (Matrix) null, false);
                            } catch (Throwable th3) {
                                FileLog.e(th3);
                                bitmap = null;
                            }
                        }
                        if (bitmap == yp0Var.f43945a) {
                            yp0Var.e = true;
                        }
                        ((org.telegram.ui.Components.e50) yp0Var.f43947c).r(false, bitmap, null);
                        yp0Var.f43948f = true;
                    }
                    yp0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 18:
                mq0 mq0Var = (mq0) obj;
                if (i10 == -1) {
                    mq0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    boolean z10 = mq0Var.Y;
                    mq0Var.Y = !z10;
                    if (!z10) {
                        mq0Var.K.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
                    } else {
                        mq0Var.K.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
                    }
                    mq0Var.K.B0();
                    mq0Var.M.h1(0, 0);
                    mq0Var.L.l();
                    return;
                } else if (i10 == 2) {
                    lq0 lq0Var = mq0Var.f39667s0;
                    if (lq0Var != null) {
                        lq0Var.g();
                    }
                    mq0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 19:
                if (i10 == -1) {
                    ((rq0) obj).finishFragment();
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
                    int i16 = PopupNotificationActivity.f33787b0;
                    popupNotificationActivity.k();
                    return;
                } else if (i10 == 2) {
                    int i17 = PopupNotificationActivity.f33787b0;
                    popupNotificationActivity.p();
                    return;
                } else {
                    return;
                }
            case 21:
                bw0 bw0Var = (bw0) obj;
                if (i10 == -1) {
                    if (bw0Var.onBackPressed(true)) {
                        bw0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    bw0Var.Y();
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
                    ((ox0) obj).finishFragment();
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
                    ((y11) obj).finishFragment();
                    return;
                }
                return;
            case 28:
                if (i10 == -1) {
                    ((d21) obj).finishFragment();
                    return;
                }
                return;
            default:
                if (i10 == -1) {
                    ((v21) obj).finishFragment();
                    return;
                }
                return;
        }
    }
}
