package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;
public final class x70 extends org.telegram.ui.ActionBar.j {
    public final int f39406a;
    public final Object f39407b;

    public x70(Object obj, int i10) {
        this.f39406a = i10;
        this.f39407b = obj;
    }

    @Override
    public final void b(int i10) {
        Bitmap bitmap;
        int i11 = this.f39406a;
        Object obj = this.f39407b;
        switch (i11) {
            case 0:
                if (i10 == -1) {
                    ((y70) obj).finishFragment();
                    return;
                }
                return;
            case 1:
                if (i10 == -1) {
                    ((n80) obj).finishFragment();
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
                zb0 zb0Var = (zb0) obj;
                if (i10 == -1) {
                    zb0Var.finishFragment();
                    AndroidUtilities.hideKeyboard(zb0Var.F);
                    return;
                }
                return;
            case 4:
                if (i10 == -1) {
                    ((pc0) obj).finishFragment();
                    return;
                }
                return;
            case 5:
                yg0 yg0Var = (yg0) obj;
                if (i10 == 1) {
                    yg0Var.p1();
                    return;
                } else if (i10 == -1 && yg0Var.onBackPressed(true)) {
                    yg0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 6:
                if (i10 == -1) {
                    ((ah0) obj).finishFragment();
                    return;
                }
                return;
            case 7:
                if (i10 == -1) {
                    ((ai0) obj).finishFragment();
                    return;
                }
                return;
            case 8:
                if (i10 == -1) {
                    ((bi0) obj).finishFragment();
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
                    bundle.putLong("chat_id", lj0Var.f35568b);
                    lj0Var.presentFragment(new ab1(bundle));
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
                oq0 oq0Var = (oq0) obj;
                if (i10 == -1) {
                    oq0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    if (oq0Var.f36406c != null && !oq0Var.f36407f) {
                        mq0 mq0Var = oq0Var.d;
                        float f7 = mq0Var.f35870f - mq0Var.f35875x;
                        float f10 = mq0Var.v;
                        float f11 = (mq0Var.h - mq0Var.f35876y) / mq0Var.f35874w;
                        float f12 = mq0Var.d / f10;
                        float f13 = mq0Var.e / f10;
                        oq0 oq0Var2 = mq0Var.H;
                        int width = (int) ((f7 / f10) * oq0Var2.f36404a.getWidth());
                        int height = (int) (f11 * oq0Var2.f36404a.getHeight());
                        int width2 = (int) (f12 * oq0Var2.f36404a.getWidth());
                        int width3 = (int) (f13 * oq0Var2.f36404a.getWidth());
                        if (width < 0) {
                            width = 0;
                        }
                        if (height < 0) {
                            height = 0;
                        }
                        if (width + width2 > oq0Var2.f36404a.getWidth()) {
                            width2 = oq0Var2.f36404a.getWidth() - width;
                        }
                        if (height + width3 > oq0Var2.f36404a.getHeight()) {
                            width3 = oq0Var2.f36404a.getHeight() - height;
                        }
                        try {
                            bitmap = Bitmaps.createBitmap(oq0Var2.f36404a, width, height, width2, width3);
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                            System.gc();
                            try {
                                bitmap = Bitmaps.createBitmap(oq0Var2.f36404a, width, height, width2, width3);
                            } catch (Throwable th3) {
                                FileLog.e(th3);
                                bitmap = null;
                            }
                        }
                        if (bitmap == oq0Var.f36404a) {
                            oq0Var.e = true;
                        }
                        ((org.telegram.ui.Components.u40) oq0Var.f36406c).s(false, bitmap, null);
                        oq0Var.f36407f = true;
                    }
                    oq0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 15:
                cr0 cr0Var = (cr0) obj;
                if (i10 == -1) {
                    cr0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    boolean z10 = cr0Var.Y;
                    cr0Var.Y = !z10;
                    if (!z10) {
                        cr0Var.K.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
                    } else {
                        cr0Var.K.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
                    }
                    cr0Var.K.C0();
                    cr0Var.M.h1(0, 0);
                    cr0Var.L.l();
                    return;
                } else if (i10 == 2) {
                    br0 br0Var = cr0Var.f32899s0;
                    if (br0Var != null) {
                        br0Var.g();
                    }
                    cr0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 16:
                if (i10 == -1) {
                    ((ir0) obj).finishFragment();
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
                    int i12 = PopupNotificationActivity.f31160b0;
                    popupNotificationActivity.k();
                    return;
                } else if (i10 == 2) {
                    int i13 = PopupNotificationActivity.f31160b0;
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
                    ((iy0) obj).finishFragment();
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
                    ((i31) obj).finishFragment();
                    return;
                }
                return;
            case 25:
                if (i10 == -1) {
                    ((n31) obj).finishFragment();
                    return;
                }
                return;
            case 26:
                if (i10 == -1) {
                    ((g41) obj).finishFragment();
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
