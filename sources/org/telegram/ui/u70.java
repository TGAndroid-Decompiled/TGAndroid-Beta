package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;
public final class u70 extends org.telegram.ui.ActionBar.j {
    public final int f41081a;
    public final Object f41082b;

    public u70(Object obj, int i10) {
        this.f41081a = i10;
        this.f41082b = obj;
    }

    @Override
    public final void b(int i10) {
        Bitmap bitmap;
        int i11 = this.f41081a;
        Object obj = this.f41082b;
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
                vb0 vb0Var = (vb0) obj;
                if (i10 == -1) {
                    vb0Var.finishFragment();
                    AndroidUtilities.hideKeyboard(vb0Var.F);
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
                ug0 ug0Var = (ug0) obj;
                if (i10 == 1) {
                    ug0Var.p1();
                    return;
                } else if (i10 == -1 && ug0Var.onBackPressed(true)) {
                    ug0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 6:
                if (i10 == -1) {
                    ((wg0) obj).finishFragment();
                    return;
                }
                return;
            case 7:
                if (i10 == -1) {
                    ((wh0) obj).finishFragment();
                    return;
                }
                return;
            case 8:
                if (i10 == -1) {
                    ((xh0) obj).finishFragment();
                    return;
                }
                return;
            case 9:
                hj0 hj0Var = (hj0) obj;
                if (i10 == -1) {
                    hj0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", hj0Var.f37095b);
                    hj0Var.presentFragment(new va1(bundle));
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
                    if (iq0Var.f37490c != null && !iq0Var.f37492f) {
                        gq0 gq0Var = iq0Var.d;
                        float f7 = gq0Var.f36708f - gq0Var.f36713x;
                        float f10 = gq0Var.v;
                        float f11 = (gq0Var.h - gq0Var.f36714y) / gq0Var.f36712w;
                        float f12 = gq0Var.d / f10;
                        float f13 = gq0Var.f36707e / f10;
                        iq0 iq0Var2 = gq0Var.H;
                        int width = (int) ((f7 / f10) * iq0Var2.f37488a.getWidth());
                        int height = (int) (f11 * iq0Var2.f37488a.getHeight());
                        int width2 = (int) (f12 * iq0Var2.f37488a.getWidth());
                        int width3 = (int) (f13 * iq0Var2.f37488a.getWidth());
                        if (width < 0) {
                            width = 0;
                        }
                        if (height < 0) {
                            height = 0;
                        }
                        if (width + width2 > iq0Var2.f37488a.getWidth()) {
                            width2 = iq0Var2.f37488a.getWidth() - width;
                        }
                        if (height + width3 > iq0Var2.f37488a.getHeight()) {
                            width3 = iq0Var2.f37488a.getHeight() - height;
                        }
                        try {
                            bitmap = Bitmaps.createBitmap(iq0Var2.f37488a, width, height, width2, width3);
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                            System.gc();
                            try {
                                bitmap = Bitmaps.createBitmap(iq0Var2.f37488a, width, height, width2, width3);
                            } catch (Throwable th3) {
                                FileLog.e(th3);
                                bitmap = null;
                            }
                        }
                        if (bitmap == iq0Var.f37488a) {
                            iq0Var.f37491e = true;
                        }
                        ((org.telegram.ui.Components.y40) iq0Var.f37490c).s(false, bitmap, null);
                        iq0Var.f37492f = true;
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
                    vq0 vq0Var = wq0Var.f42625s0;
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
                    int i12 = PopupNotificationActivity.f34109b0;
                    popupNotificationActivity.k();
                    return;
                } else if (i10 == 2) {
                    int i13 = PopupNotificationActivity.f34109b0;
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
                    nw0Var.X();
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
                    ((by0) obj).finishFragment();
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
