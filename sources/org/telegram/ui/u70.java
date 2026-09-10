package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;
public final class u70 extends org.telegram.ui.ActionBar.k {
    public final int f37140a;
    public final Object f37141b;

    public u70(Object obj, int i10) {
        this.f37140a = i10;
        this.f37141b = obj;
    }

    @Override
    public final void b(int i10) {
        Bitmap bitmap;
        int i11 = this.f37140a;
        Object obj = this.f37141b;
        switch (i11) {
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
                xb0 xb0Var = (xb0) obj;
                if (i10 == -1) {
                    xb0Var.finishFragment();
                    AndroidUtilities.hideKeyboard(xb0Var.F);
                    return;
                }
                return;
            case 4:
                if (i10 == -1) {
                    ((nc0) obj).finishFragment();
                    return;
                }
                return;
            case 5:
                xg0 xg0Var = (xg0) obj;
                if (i10 == 1) {
                    xg0Var.p1();
                    return;
                } else if (i10 == -1 && xg0Var.onBackPressed(true)) {
                    xg0Var.finishFragment();
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
                kj0 kj0Var = (kj0) obj;
                if (i10 == -1) {
                    kj0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", kj0Var.f34386b);
                    kj0Var.presentFragment(new fb1(bundle));
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
                    if (nq0Var.f35325c != null && !nq0Var.f35326f) {
                        lq0 lq0Var = nq0Var.d;
                        float f7 = lq0Var.f34753f - lq0Var.f34758x;
                        float f10 = lq0Var.v;
                        float f11 = (lq0Var.h - lq0Var.f34759y) / lq0Var.f34757w;
                        float f12 = lq0Var.d / f10;
                        float f13 = lq0Var.e / f10;
                        nq0 nq0Var2 = lq0Var.H;
                        int width = (int) ((f7 / f10) * nq0Var2.f35323a.getWidth());
                        int height = (int) (f11 * nq0Var2.f35323a.getHeight());
                        int width2 = (int) (f12 * nq0Var2.f35323a.getWidth());
                        int width3 = (int) (f13 * nq0Var2.f35323a.getWidth());
                        if (width < 0) {
                            width = 0;
                        }
                        if (height < 0) {
                            height = 0;
                        }
                        if (width + width2 > nq0Var2.f35323a.getWidth()) {
                            width2 = nq0Var2.f35323a.getWidth() - width;
                        }
                        if (height + width3 > nq0Var2.f35323a.getHeight()) {
                            width3 = nq0Var2.f35323a.getHeight() - height;
                        }
                        try {
                            bitmap = Bitmaps.createBitmap(nq0Var2.f35323a, width, height, width2, width3);
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                            System.gc();
                            try {
                                bitmap = Bitmaps.createBitmap(nq0Var2.f35323a, width, height, width2, width3);
                            } catch (Throwable th3) {
                                FileLog.e(th3);
                                bitmap = null;
                            }
                        }
                        if (bitmap == nq0Var.f35323a) {
                            nq0Var.e = true;
                        }
                        ((org.telegram.ui.Components.e50) nq0Var.f35325c).s(false, bitmap, null);
                        nq0Var.f35326f = true;
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
                    ar0 ar0Var = br0Var.f31387s0;
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
                    int i12 = PopupNotificationActivity.f30255b0;
                    popupNotificationActivity.k();
                    return;
                } else if (i10 == 2) {
                    int i13 = PopupNotificationActivity.f30255b0;
                    popupNotificationActivity.p();
                    return;
                } else {
                    return;
                }
            case 18:
                vw0 vw0Var = (vw0) obj;
                if (i10 == -1) {
                    if (vw0Var.onBackPressed(true)) {
                        vw0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    vw0Var.Y();
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
                    ((ky0) obj).finishFragment();
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
                    ((m31) obj).finishFragment();
                    return;
                }
                return;
            case 25:
                if (i10 == -1) {
                    ((r31) obj).finishFragment();
                    return;
                }
                return;
            case 26:
                if (i10 == -1) {
                    ((k41) obj).finishFragment();
                    return;
                }
                return;
            case 27:
                if (i10 == -1) {
                    ((SaveToGallerySettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 28:
                if (i10 == -1) {
                    ((SecretMediaViewer) obj).e(true, false);
                    return;
                }
                return;
            default:
                if (i10 == -1) {
                    ((SessionsActivity) obj).finishFragment();
                    return;
                }
                return;
        }
    }
}
