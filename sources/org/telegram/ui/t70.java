package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;
public final class t70 extends org.telegram.ui.ActionBar.j {
    public final int f37668a;
    public final Object f37669b;

    public t70(Object obj, int i10) {
        this.f37668a = i10;
        this.f37669b = obj;
    }

    @Override
    public final void b(int i10) {
        Bitmap bitmap;
        int i11 = this.f37668a;
        Object obj = this.f37669b;
        switch (i11) {
            case 0:
                if (i10 == -1) {
                    ((u70) obj).finishFragment();
                    return;
                }
                return;
            case 1:
                if (i10 == -1) {
                    ((j80) obj).finishFragment();
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
                    ((kc0) obj).finishFragment();
                    return;
                }
                return;
            case 5:
                tg0 tg0Var = (tg0) obj;
                if (i10 == 1) {
                    tg0Var.p1();
                    return;
                } else if (i10 == -1 && tg0Var.onBackPressed(true)) {
                    tg0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 6:
                if (i10 == -1) {
                    ((vg0) obj).finishFragment();
                    return;
                }
                return;
            case 7:
                if (i10 == -1) {
                    ((vh0) obj).finishFragment();
                    return;
                }
                return;
            case 8:
                if (i10 == -1) {
                    ((wh0) obj).finishFragment();
                    return;
                }
                return;
            case 9:
                gj0 gj0Var = (gj0) obj;
                if (i10 == -1) {
                    gj0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", gj0Var.f33956b);
                    gj0Var.presentFragment(new ra1(bundle));
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
                iq0 iq0Var = (iq0) obj;
                if (i10 == -1) {
                    iq0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    if (iq0Var.f34519c != null && !iq0Var.f34520f) {
                        gq0 gq0Var = iq0Var.d;
                        float f7 = gq0Var.f34021f - gq0Var.f34026x;
                        float f10 = gq0Var.v;
                        float f11 = (gq0Var.h - gq0Var.f34027y) / gq0Var.f34025w;
                        float f12 = gq0Var.d / f10;
                        float f13 = gq0Var.e / f10;
                        iq0 iq0Var2 = gq0Var.H;
                        int width = (int) ((f7 / f10) * iq0Var2.f34517a.getWidth());
                        int height = (int) (f11 * iq0Var2.f34517a.getHeight());
                        int width2 = (int) (f12 * iq0Var2.f34517a.getWidth());
                        int width3 = (int) (f13 * iq0Var2.f34517a.getWidth());
                        if (width < 0) {
                            width = 0;
                        }
                        if (height < 0) {
                            height = 0;
                        }
                        if (width + width2 > iq0Var2.f34517a.getWidth()) {
                            width2 = iq0Var2.f34517a.getWidth() - width;
                        }
                        if (height + width3 > iq0Var2.f34517a.getHeight()) {
                            width3 = iq0Var2.f34517a.getHeight() - height;
                        }
                        try {
                            bitmap = Bitmaps.createBitmap(iq0Var2.f34517a, width, height, width2, width3);
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                            System.gc();
                            try {
                                bitmap = Bitmaps.createBitmap(iq0Var2.f34517a, width, height, width2, width3);
                            } catch (Throwable th3) {
                                FileLog.e(th3);
                                bitmap = null;
                            }
                        }
                        if (bitmap == iq0Var.f34517a) {
                            iq0Var.e = true;
                        }
                        ((org.telegram.ui.Components.x40) iq0Var.f34519c).s(false, bitmap, null);
                        iq0Var.f34520f = true;
                    }
                    iq0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 15:
                wq0 wq0Var = (wq0) obj;
                if (i10 == -1) {
                    wq0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    boolean z10 = wq0Var.Y;
                    wq0Var.Y = !z10;
                    if (!z10) {
                        wq0Var.K.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
                    } else {
                        wq0Var.K.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
                    }
                    wq0Var.K.C0();
                    wq0Var.M.h1(0, 0);
                    wq0Var.L.l();
                    return;
                } else if (i10 == 2) {
                    vq0 vq0Var = wq0Var.f39435s0;
                    if (vq0Var != null) {
                        vq0Var.g();
                    }
                    wq0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 16:
                if (i10 == -1) {
                    ((br0) obj).finishFragment();
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
                    int i12 = PopupNotificationActivity.f31431b0;
                    popupNotificationActivity.k();
                    return;
                } else if (i10 == 2) {
                    int i13 = PopupNotificationActivity.f31431b0;
                    popupNotificationActivity.p();
                    return;
                } else {
                    return;
                }
            case 18:
                nw0 nw0Var = (nw0) obj;
                if (i10 == -1) {
                    if (nw0Var.onBackPressed(true)) {
                        nw0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    nw0Var.Y();
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
                    ((ay0) obj).finishFragment();
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
                    ((a31) obj).finishFragment();
                    return;
                }
                return;
            case 25:
                if (i10 == -1) {
                    ((f31) obj).finishFragment();
                    return;
                }
                return;
            case 26:
                if (i10 == -1) {
                    ((y31) obj).finishFragment();
                    return;
                }
                return;
            case 27:
                if (i10 == -1) {
                    ((h41) obj).finishFragment();
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
