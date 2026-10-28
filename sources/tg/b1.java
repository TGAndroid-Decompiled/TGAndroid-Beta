package tg;

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
import org.telegram.ui.ActionBar.y6;
public final class b1 {
    public static b1 f48857j;
    public final a1 f48858a;
    public final Paint f48859b;
    public Paint f48860c;
    public final Drawable d;
    public final Drawable e;
    public z0 f48861f;
    public z0 f48862g;
    public final z0 h;
    public int f48863i;

    public b1() {
        a1 a1Var = new a1(y6.Lj, y6.Mj, y6.Nj, y6.Oj, null);
        this.f48858a = a1Var;
        a1 a1Var2 = new a1(y6.fk, y6.gk, -1, -1, null);
        this.f48859b = a1Var.f48832f;
        this.e = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
        this.f48861f = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), a1Var);
        this.h = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), a1Var2);
        this.f48862g = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_normal), a1Var);
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
        a1Var.f48832f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        a1Var.d(0, -intrinsicWidth, 0, intrinsicWidth, 0.0f, minimumHeight);
        canvas.drawRect(0.0f, 0.0f, intrinsicWidth, minimumHeight, a1Var.f48832f);
        a1Var.f48832f.setXfermode(null);
        int[] iArr = a1Var.f48837l;
        ?? bitmapDrawable = new BitmapDrawable(ApplicationLoader.applicationContext.getResources(), createBitmap);
        bitmapDrawable.f49173b = drawable;
        int[] iArr2 = new int[iArr.length];
        bitmapDrawable.f49172a = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return bitmapDrawable;
    }

    public static b1 d() {
        if (f48857j == null) {
            f48857j = new b1();
        }
        return f48857j;
    }

    public final z0 a(z0 z0Var) {
        a1 a1Var = this.f48858a;
        int[] iArr = a1Var.f48837l;
        int i10 = iArr[0];
        int[] iArr2 = z0Var.f49172a;
        if (i10 == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) {
            return z0Var;
        }
        return c(z0Var.f49173b, a1Var);
    }

    public final void b() {
        int i10 = y6.f23771z9;
        if (y6.x0(null, i10, false) != this.f48863i) {
            this.f48863i = y6.x0(null, i10, false);
            this.e.setColorFilter(new PorterDuffColorFilter(this.f48863i, PorterDuff.Mode.MULTIPLY));
        }
        this.f48861f = a(this.f48861f);
        this.f48862g = a(this.f48862g);
    }

    public final Paint e() {
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            if (this.f48860c == null) {
                this.f48860c = new Paint(1);
            }
            this.f48860c.setColor(y6.x0(null, y6.Oh, false));
            return this.f48860c;
        }
        return this.f48859b;
    }

    public final void f(float f7, float f10, int i10, int i11) {
        this.f48858a.d(0, f7, 0, i10, f10, i11);
    }
}
