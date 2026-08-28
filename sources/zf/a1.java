package zf;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.f6;
public final class a1 {
    public static a1 f50455j;
    public final z0 f50456a;
    public final Paint f50457b;
    public Paint f50458c;
    public final Drawable d;
    public final Drawable f50459e;
    public y0 f50460f;
    public y0 f50461g;
    public final y0 h;
    public int f50462i;

    public a1() {
        z0 z0Var = new z0(f6.Lj, f6.Mj, f6.Nj, f6.Oj, null);
        this.f50456a = z0Var;
        z0 z0Var2 = new z0(f6.fk, f6.gk, -1, -1, null);
        this.f50457b = z0Var.f50792f;
        this.f50459e = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
        this.f50460f = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), z0Var);
        this.h = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), z0Var2);
        this.f50461g = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_normal), z0Var);
        this.d = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
        z0Var.a();
        b();
    }

    public static y0 c(Drawable drawable, z0 z0Var) {
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int minimumHeight = drawable.getMinimumHeight();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, minimumHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, minimumHeight);
        drawable.draw(canvas);
        z0Var.f50792f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        z0Var.d(0, -intrinsicWidth, 0, intrinsicWidth, 0.0f, minimumHeight);
        canvas.drawRect(0.0f, 0.0f, intrinsicWidth, minimumHeight, z0Var.f50792f);
        z0Var.f50792f.setXfermode(null);
        int[] iArr = z0Var.f50797l;
        ?? bitmapDrawable = new BitmapDrawable(ApplicationLoader.applicationContext.getResources(), createBitmap);
        bitmapDrawable.f50784b = drawable;
        int[] iArr2 = new int[iArr.length];
        bitmapDrawable.f50783a = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return bitmapDrawable;
    }

    public static a1 d() {
        if (f50455j == null) {
            f50455j = new a1();
        }
        return f50455j;
    }

    public final y0 a(y0 y0Var) {
        z0 z0Var = this.f50456a;
        int[] iArr = z0Var.f50797l;
        int i9 = iArr[0];
        int[] iArr2 = y0Var.f50783a;
        if (i9 == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) {
            return y0Var;
        }
        return c(y0Var.f50784b, z0Var);
    }

    public final void b() {
        int i9 = f6.f23389z9;
        if (f6.w0(null, i9, false) != this.f50462i) {
            this.f50462i = f6.w0(null, i9, false);
            this.f50459e.setColorFilter(new PorterDuffColorFilter(this.f50462i, PorterDuff.Mode.MULTIPLY));
        }
        this.f50460f = a(this.f50460f);
        this.f50461g = a(this.f50461g);
    }

    public final Paint e() {
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            if (this.f50458c == null) {
                this.f50458c = new Paint(1);
            }
            this.f50458c.setColor(f6.w0(null, f6.Oh, false));
            return this.f50458c;
        }
        return this.f50457b;
    }

    public final void f(float f10, float f11, int i9, int i10) {
        this.f50456a.d(0, f10, 0, i9, f11, i10);
    }
}
