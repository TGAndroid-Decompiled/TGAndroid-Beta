package rg;

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
import org.telegram.ui.ActionBar.i6;
public final class b1 {
    public static b1 f47203j;
    public final a1 f47204a;
    public final Paint f47205b;
    public Paint f47206c;
    public final Drawable d;
    public final Drawable f47207e;
    public z0 f47208f;
    public z0 f47209g;
    public final z0 h;
    public int f47210i;

    public b1() {
        a1 a1Var = new a1(i6.Lj, i6.Mj, i6.Nj, i6.Oj, null);
        this.f47204a = a1Var;
        a1 a1Var2 = new a1(i6.fk, i6.gk, -1, -1, null);
        this.f47205b = a1Var.f47177f;
        this.f47207e = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
        this.f47208f = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), a1Var);
        this.h = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), a1Var2);
        this.f47209g = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_normal), a1Var);
        this.d = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
        a1Var.a();
        b();
    }

    public static z0 c(Drawable drawable, a1 a1Var) {
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int minimumHeight = drawable.getMinimumHeight();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, minimumHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, minimumHeight);
        drawable.draw(canvas);
        a1Var.f47177f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        a1Var.d(0, -intrinsicWidth, 0, intrinsicWidth, 0.0f, minimumHeight);
        canvas.drawRect(0.0f, 0.0f, intrinsicWidth, minimumHeight, a1Var.f47177f);
        a1Var.f47177f.setXfermode(null);
        int[] iArr = a1Var.f47182l;
        ?? bitmapDrawable = new BitmapDrawable(ApplicationLoader.applicationContext.getResources(), createBitmap);
        bitmapDrawable.f47531b = drawable;
        int[] iArr2 = new int[iArr.length];
        bitmapDrawable.f47530a = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return bitmapDrawable;
    }

    public static b1 d() {
        if (f47203j == null) {
            f47203j = new b1();
        }
        return f47203j;
    }

    public final z0 a(z0 z0Var) {
        a1 a1Var = this.f47204a;
        int[] iArr = a1Var.f47182l;
        int i10 = iArr[0];
        int[] iArr2 = z0Var.f47530a;
        if (i10 == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) {
            return z0Var;
        }
        return c(z0Var.f47531b, a1Var);
    }

    public final void b() {
        int i10 = i6.f21202z9;
        if (i6.x0(null, i10, false) != this.f47210i) {
            this.f47210i = i6.x0(null, i10, false);
            this.f47207e.setColorFilter(new PorterDuffColorFilter(this.f47210i, PorterDuff.Mode.MULTIPLY));
        }
        this.f47208f = a(this.f47208f);
        this.f47209g = a(this.f47209g);
    }

    public final Paint e() {
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            if (this.f47206c == null) {
                this.f47206c = new Paint(1);
            }
            this.f47206c.setColor(i6.x0(null, i6.Oh, false));
            return this.f47206c;
        }
        return this.f47205b;
    }

    public final void f(float f7, float f10, int i10, int i11) {
        this.f47204a.d(0, f7, 0, i10, f10, i11);
    }
}
