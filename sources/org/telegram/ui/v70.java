package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;
public final class v70 extends org.telegram.ui.ActionBar.j {
    public final int f38383a;
    public final Object f38384b;

    public v70(Object obj, int i10) {
        this.f38383a = i10;
        this.f38384b = obj;
    }

    @Override
    public final void b(int i10) {
        Bitmap bitmap;
        int i11 = this.f38383a;
        Object obj = this.f38384b;
        switch (i11) {
            case 0:
                if (i10 == -1) {
                    ((w70) obj).finishFragment();
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
                jj0 jj0Var = (jj0) obj;
                if (i10 == -1) {
                    jj0Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", jj0Var.f34917b);
                    jj0Var.presentFragment(new ya1(bundle));
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
                    if (mq0Var.f35792c != null && !mq0Var.f35793f) {
                        kq0 kq0Var = mq0Var.d;
                        float f7 = kq0Var.f35246f - kq0Var.f35251x;
                        float f10 = kq0Var.v;
                        float f11 = (kq0Var.h - kq0Var.f35252y) / kq0Var.f35250w;
                        float f12 = kq0Var.d / f10;
                        float f13 = kq0Var.e / f10;
                        mq0 mq0Var2 = kq0Var.H;
                        int width = (int) ((f7 / f10) * mq0Var2.f35790a.getWidth());
                        int height = (int) (f11 * mq0Var2.f35790a.getHeight());
                        int width2 = (int) (f12 * mq0Var2.f35790a.getWidth());
                        int width3 = (int) (f13 * mq0Var2.f35790a.getWidth());
                        if (width < 0) {
                            width = 0;
                        }
                        if (height < 0) {
                            height = 0;
                        }
                        if (width + width2 > mq0Var2.f35790a.getWidth()) {
                            width2 = mq0Var2.f35790a.getWidth() - width;
                        }
                        if (height + width3 > mq0Var2.f35790a.getHeight()) {
                            width3 = mq0Var2.f35790a.getHeight() - height;
                        }
                        try {
                            bitmap = Bitmaps.createBitmap(mq0Var2.f35790a, width, height, width2, width3);
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                            System.gc();
                            try {
                                bitmap = Bitmaps.createBitmap(mq0Var2.f35790a, width, height, width2, width3);
                            } catch (Throwable th3) {
                                FileLog.e(th3);
                                bitmap = null;
                            }
                        }
                        if (bitmap == mq0Var.f35790a) {
                            mq0Var.e = true;
                        }
                        ((org.telegram.ui.Components.u40) mq0Var.f35792c).s(false, bitmap, null);
                        mq0Var.f35793f = true;
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
                    zq0 zq0Var = ar0Var.f31932s0;
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
                    int i12 = PopupNotificationActivity.f31142b0;
                    popupNotificationActivity.k();
                    return;
                } else if (i10 == 2) {
                    int i13 = PopupNotificationActivity.f31142b0;
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
                    ((e41) obj).finishFragment();
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
