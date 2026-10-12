package sg;

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
import org.telegram.ui.ActionBar.g6;
public final class b1 {
    public static b1 f45142j;
    public final a1 f45143a;
    public final Paint f45144b;
    public Paint f45145c;
    public final Drawable d;
    public final Drawable e;
    public z0 f45146f;
    public z0 f45147g;
    public final z0 h;
    public int f45148i;

    public b1() {
        a1 a1Var = new a1(g6.Lj, g6.Mj, g6.Nj, g6.Oj, null);
        this.f45143a = a1Var;
        a1 a1Var2 = new a1(g6.fk, g6.gk, -1, -1, null);
        this.f45144b = a1Var.f45117f;
        this.e = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
        this.f45146f = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), a1Var);
        this.h = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), a1Var2);
        this.f45147g = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_normal), a1Var);
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
        a1Var.f45117f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        a1Var.d(0, -intrinsicWidth, 0, intrinsicWidth, 0.0f, minimumHeight);
        canvas.drawRect(0.0f, 0.0f, intrinsicWidth, minimumHeight, a1Var.f45117f);
        a1Var.f45117f.setXfermode(null);
        int[] iArr = a1Var.f45122l;
        ?? bitmapDrawable = new BitmapDrawable(ApplicationLoader.applicationContext.getResources(), createBitmap);
        bitmapDrawable.f45446b = drawable;
        int[] iArr2 = new int[iArr.length];
        bitmapDrawable.f45445a = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return bitmapDrawable;
    }

    public static b1 d() {
        if (f45142j == null) {
            f45142j = new b1();
        }
        return f45142j;
    }

    public final z0 a(z0 z0Var) {
        a1 a1Var = this.f45143a;
        int[] iArr = a1Var.f45122l;
        int i10 = iArr[0];
        int[] iArr2 = z0Var.f45445a;
        if (i10 == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) {
            return z0Var;
        }
        return c(z0Var.f45446b, a1Var);
    }

    public final void b() {
        int i10 = g6.f20308z9;
        if (g6.x0(null, i10, false) != this.f45148i) {
            this.f45148i = g6.x0(null, i10, false);
            this.e.setColorFilter(new PorterDuffColorFilter(this.f45148i, PorterDuff.Mode.MULTIPLY));
        }
        this.f45146f = a(this.f45146f);
        this.f45147g = a(this.f45147g);
    }

    public final Paint e() {
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            if (this.f45145c == null) {
                this.f45145c = new Paint(1);
            }
            this.f45145c.setColor(g6.x0(null, g6.Oh, false));
            return this.f45145c;
        }
        return this.f45144b;
    }

    public final void f(float f7, float f10, int i10, int i11) {
        this.f45143a.d(0, f7, 0, i10, f10, i11);
    }
}
