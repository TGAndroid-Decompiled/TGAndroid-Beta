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
import org.telegram.ui.ActionBar.h6;
public final class b1 {
    public static b1 f46221j;
    public final a1 f46222a;
    public final Paint f46223b;
    public Paint f46224c;
    public final Drawable d;
    public final Drawable e;
    public z0 f46225f;
    public z0 f46226g;
    public final z0 h;
    public int f46227i;

    public b1() {
        a1 a1Var = new a1(h6.Lj, h6.Mj, h6.Nj, h6.Oj, null);
        this.f46222a = a1Var;
        a1 a1Var2 = new a1(h6.fk, h6.gk, -1, -1, null);
        this.f46223b = a1Var.f46195f;
        this.e = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
        this.f46225f = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), a1Var);
        this.h = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), a1Var2);
        this.f46226g = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_normal), a1Var);
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
        a1Var.f46195f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        a1Var.d(0, -intrinsicWidth, 0, intrinsicWidth, 0.0f, minimumHeight);
        canvas.drawRect(0.0f, 0.0f, intrinsicWidth, minimumHeight, a1Var.f46195f);
        a1Var.f46195f.setXfermode(null);
        int[] iArr = a1Var.f46200l;
        ?? bitmapDrawable = new BitmapDrawable(ApplicationLoader.applicationContext.getResources(), createBitmap);
        bitmapDrawable.f46527b = drawable;
        int[] iArr2 = new int[iArr.length];
        bitmapDrawable.f46526a = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return bitmapDrawable;
    }

    public static b1 d() {
        if (f46221j == null) {
            f46221j = new b1();
        }
        return f46221j;
    }

    public final z0 a(z0 z0Var) {
        a1 a1Var = this.f46222a;
        int[] iArr = a1Var.f46200l;
        int i10 = iArr[0];
        int[] iArr2 = z0Var.f46526a;
        if (i10 == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) {
            return z0Var;
        }
        return c(z0Var.f46527b, a1Var);
    }

    public final void b() {
        int i10 = h6.f21402z9;
        if (h6.x0(null, i10, false) != this.f46227i) {
            this.f46227i = h6.x0(null, i10, false);
            this.e.setColorFilter(new PorterDuffColorFilter(this.f46227i, PorterDuff.Mode.MULTIPLY));
        }
        this.f46225f = a(this.f46225f);
        this.f46226g = a(this.f46226g);
    }

    public final Paint e() {
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            if (this.f46224c == null) {
                this.f46224c = new Paint(1);
            }
            this.f46224c.setColor(h6.x0(null, h6.Oh, false));
            return this.f46224c;
        }
        return this.f46223b;
    }

    public final void f(float f7, float f10, int i10, int i11) {
        this.f46222a.d(0, f7, 0, i10, f10, i11);
    }
}
