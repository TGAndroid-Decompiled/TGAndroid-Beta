package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
public final class wv implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.md0, org.telegram.ui.ActionBar.o6, org.telegram.ui.ActionBar.p6, GenericProvider, FlagSecureReason.FlagSecureCondition, Utilities.Callback2Return, org.telegram.ui.Components.rw0 {
    public final int f43441a;

    public wv(int i10) {
        this.f43441a = i10;
    }

    @Override
    public void d(int i10, View view) {
        switch (this.f43441a) {
            case 5:
                Drawable background = view.getBackground();
                if (background instanceof org.telegram.ui.Components.yq) {
                    Drawable drawable = ((org.telegram.ui.Components.yq) background).f33012a;
                    if (drawable instanceof ColorDrawable) {
                        ((ColorDrawable) drawable).setColor(i10);
                        view.invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.f3 f3Var = (org.telegram.ui.Wallet.f3) view;
                ShapeDrawable shapeDrawable = f3Var.f34489e0;
                if (shapeDrawable != null) {
                    shapeDrawable.getPaint().setColor(i10);
                    f3Var.f34489e0.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override
    public String e(int i10) {
        switch (this.f43441a) {
            case 2:
                return String.format("%02d", Integer.valueOf(i10));
            case 3:
                return String.format("%02d", Integer.valueOf(i10));
            default:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.AutoLockDisabled);
                }
                if (i10 == 1) {
                    return LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Minutes", 1, new Object[0]));
                }
                if (i10 == 2) {
                    return LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Minutes", 5, new Object[0]));
                }
                if (i10 == 3) {
                    return LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Hours", 1, new Object[0]));
                }
                if (i10 == 4) {
                    return LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Hours", 5, new Object[0]));
                }
                return "";
        }
    }

    @Override
    public int f(View view) {
        switch (this.f43441a) {
            case 4:
                Drawable background = view.getBackground();
                if (background instanceof org.telegram.ui.Components.yq) {
                    Drawable drawable = ((org.telegram.ui.Components.yq) background).f33012a;
                    if (drawable instanceof ColorDrawable) {
                        return ((ColorDrawable) drawable).getColor();
                    }
                }
                return 0;
            default:
                ShapeDrawable shapeDrawable = ((org.telegram.ui.Wallet.f3) view).f34489e0;
                if (shapeDrawable != null) {
                    return shapeDrawable.getPaint().getColor();
                }
                return 0;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f43441a) {
            case 0:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutMiuiLockscreen", true).commit();
                return;
            case 1:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutFSILockscreen", true).commit();
                return;
            case 10:
                c2Var.dismiss();
                return;
            case 12:
                Drawable[] drawableArr = PhotoViewer.U8;
                return;
            case 13:
                c2Var.dismiss();
                return;
            case 14:
                c2Var.dismiss();
                return;
            case 16:
                c2Var.dismiss();
                return;
            case 17:
                c2Var.dismiss();
                return;
            case 23:
                c2Var.dismiss();
                return;
            case 27:
                c2Var.dismiss();
                return;
            case 28:
                c2Var.dismiss();
                return;
            default:
                c2Var.dismiss();
                return;
        }
    }

    @Override
    public void i(int i10) {
        SharedConfig.proxyRotationTimeout = i10;
        SharedConfig.saveConfig();
    }

    @Override
    public Object provide(Object obj) {
        Void r82 = (Void) obj;
        switch (this.f43441a) {
            case 6:
                int dp = AndroidUtilities.dp(150.0f);
                Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(200.0f), dp, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21183d6, false));
                Paint paint = new Paint(1);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                canvas.drawCircle(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f, dp / 2.0f, paint);
                return createBitmap;
            case 7:
                Paint paint2 = new Paint(1);
                paint2.setColor(-14509328);
                int dp2 = AndroidUtilities.dp(150.0f);
                Bitmap createBitmap2 = Bitmap.createBitmap(dp2, dp2, Bitmap.Config.ARGB_8888);
                float f7 = dp2 / 2.0f;
                new Canvas(createBitmap2).drawCircle(f7, f7, f7, paint2);
                return createBitmap2;
            default:
                Pattern pattern = LaunchActivity.E1;
                return new rg0();
        }
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        if (((Integer) obj).intValue() == 0) {
            return ai.nd.Y0(false, LocaleController.formatPluralStringComma("Stars", num.intValue()), 0.66f, null);
        }
        return LocaleController.formatNumber(num.intValue(), ',');
    }

    @Override
    public boolean run() {
        Pattern pattern = LaunchActivity.E1;
        return SharedConfig.passcodeHash.length() > 0 && !SharedConfig.allowScreenCapture;
    }

    @Override
    public void m() {
    }
}
