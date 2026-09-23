package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;
public final class s70 extends org.telegram.ui.ActionBar.j {
    public final int f37144a;
    public final Object f37145b;

    public s70(Object obj, int i10) {
        this.f37144a = i10;
        this.f37145b = obj;
    }

    @Override
    public final void b(int i10) {
        Bitmap bitmap;
        int i11 = this.f37144a;
        Object obj = this.f37145b;
        switch (i11) {
            case 0:
                if (i10 == -1) {
                    ((t70) obj).finishFragment();
                    return;
                }
                return;
            case 1:
                if (i10 == -1) {
                    ((i80) obj).finishFragment();
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
                sb0 sb0Var = (sb0) obj;
                if (i10 == -1) {
                    sb0Var.finishFragment();
                    AndroidUtilities.hideKeyboard(sb0Var.F);
                    return;
                }
                return;
            case 4:
                if (i10 == -1) {
                    ((ic0) obj).finishFragment();
                    return;
                }
                return;
            case 5:
                rg0 rg0Var = (rg0) obj;
                if (i10 == 1) {
                    rg0Var.p1();
                    return;
                } else if (i10 == -1 && rg0Var.onBackPressed(true)) {
                    rg0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 6:
                if (i10 == -1) {
                    ((tg0) obj).finishFragment();
                    return;
                }
                return;
            case 7:
                if (i10 == -1) {
                    ((th0) obj).finishFragment();
                    return;
                }
                return;
            case 8:
                if (i10 == -1) {
                    ((uh0) obj).finishFragment();
                    return;
                }
                return;
            case 9:
                ej0 ej0Var = (ej0) obj;
                if (i10 == -1) {
                    ej0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", ej0Var.f32946b);
                    ej0Var.presentFragment(new ra1(bundle));
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
                gq0 gq0Var = (gq0) obj;
                if (i10 == -1) {
                    gq0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    if (gq0Var.f33638c != null && !gq0Var.f33639f) {
                        eq0 eq0Var = gq0Var.d;
                        float f7 = eq0Var.f33001f - eq0Var.f33006x;
                        float f10 = eq0Var.v;
                        float f11 = (eq0Var.h - eq0Var.f33007y) / eq0Var.f33005w;
                        float f12 = eq0Var.d / f10;
                        float f13 = eq0Var.e / f10;
                        gq0 gq0Var2 = eq0Var.H;
                        int width = (int) ((f7 / f10) * gq0Var2.f33636a.getWidth());
                        int height = (int) (f11 * gq0Var2.f33636a.getHeight());
                        int width2 = (int) (f12 * gq0Var2.f33636a.getWidth());
                        int width3 = (int) (f13 * gq0Var2.f33636a.getWidth());
                        if (width < 0) {
                            width = 0;
                        }
                        if (height < 0) {
                            height = 0;
                        }
                        if (width + width2 > gq0Var2.f33636a.getWidth()) {
                            width2 = gq0Var2.f33636a.getWidth() - width;
                        }
                        if (height + width3 > gq0Var2.f33636a.getHeight()) {
                            width3 = gq0Var2.f33636a.getHeight() - height;
                        }
                        try {
                            bitmap = Bitmaps.createBitmap(gq0Var2.f33636a, width, height, width2, width3);
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                            System.gc();
                            try {
                                bitmap = Bitmaps.createBitmap(gq0Var2.f33636a, width, height, width2, width3);
                            } catch (Throwable th3) {
                                FileLog.e(th3);
                                bitmap = null;
                            }
                        }
                        if (bitmap == gq0Var.f33636a) {
                            gq0Var.e = true;
                        }
                        ((org.telegram.ui.Components.v40) gq0Var.f33638c).s(false, bitmap, null);
                        gq0Var.f33639f = true;
                    }
                    gq0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 15:
                uq0 uq0Var = (uq0) obj;
                if (i10 == -1) {
                    uq0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    boolean z10 = uq0Var.Y;
                    uq0Var.Y = !z10;
                    if (!z10) {
                        uq0Var.K.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
                    } else {
                        uq0Var.K.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
                    }
                    uq0Var.K.B0();
                    uq0Var.M.h1(0, 0);
                    uq0Var.L.l();
                    return;
                } else if (i10 == 2) {
                    tq0 tq0Var = uq0Var.f38191s0;
                    if (tq0Var != null) {
                        tq0Var.g();
                    }
                    uq0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 16:
                if (i10 == -1) {
                    ((ar0) obj).finishFragment();
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
                    int i12 = PopupNotificationActivity.f31114b0;
                    popupNotificationActivity.k();
                    return;
                } else if (i10 == 2) {
                    int i13 = PopupNotificationActivity.f31114b0;
                    popupNotificationActivity.p();
                    return;
                } else {
                    return;
                }
            case 18:
                mw0 mw0Var = (mw0) obj;
                if (i10 == -1) {
                    if (mw0Var.onBackPressed(true)) {
                        mw0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    mw0Var.Y();
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
                    ((zx0) obj).finishFragment();
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
                    ((z21) obj).finishFragment();
                    return;
                }
                return;
            case 25:
                if (i10 == -1) {
                    ((e31) obj).finishFragment();
                    return;
                }
                return;
            case 26:
                if (i10 == -1) {
                    ((x31) obj).finishFragment();
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
