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
    public static b1 f48819j;
    public final a1 f48820a;
    public final Paint f48821b;
    public Paint f48822c;
    public final Drawable d;
    public final Drawable e;
    public z0 f48823f;
    public z0 f48824g;
    public final z0 h;
    public int f48825i;

    public b1() {
        a1 a1Var = new a1(y6.Lj, y6.Mj, y6.Nj, y6.Oj, null);
        this.f48820a = a1Var;
        a1 a1Var2 = new a1(y6.fk, y6.gk, -1, -1, null);
        this.f48821b = a1Var.f48794f;
        this.e = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
        this.f48823f = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), a1Var);
        this.h = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), a1Var2);
        this.f48824g = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_normal), a1Var);
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
        a1Var.f48794f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        a1Var.d(0, -intrinsicWidth, 0, intrinsicWidth, 0.0f, minimumHeight);
        canvas.drawRect(0.0f, 0.0f, intrinsicWidth, minimumHeight, a1Var.f48794f);
        a1Var.f48794f.setXfermode(null);
        int[] iArr = a1Var.f48799l;
        ?? bitmapDrawable = new BitmapDrawable(ApplicationLoader.applicationContext.getResources(), createBitmap);
        bitmapDrawable.f49135b = drawable;
        int[] iArr2 = new int[iArr.length];
        bitmapDrawable.f49134a = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return bitmapDrawable;
    }

    public static b1 d() {
        if (f48819j == null) {
            f48819j = new b1();
        }
        return f48819j;
    }

    public final z0 a(z0 z0Var) {
        a1 a1Var = this.f48820a;
        int[] iArr = a1Var.f48799l;
        int i10 = iArr[0];
        int[] iArr2 = z0Var.f49134a;
        if (i10 == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) {
            return z0Var;
        }
        return c(z0Var.f49135b, a1Var);
    }

    public final void b() {
        int i10 = y6.f23768z9;
        if (y6.x0(null, i10, false) != this.f48825i) {
            this.f48825i = y6.x0(null, i10, false);
            this.e.setColorFilter(new PorterDuffColorFilter(this.f48825i, PorterDuff.Mode.MULTIPLY));
        }
        this.f48823f = a(this.f48823f);
        this.f48824g = a(this.f48824g);
    }

    public final Paint e() {
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            if (this.f48822c == null) {
                this.f48822c = new Paint(1);
            }
            this.f48822c.setColor(y6.x0(null, y6.Oh, false));
            return this.f48822c;
        }
        return this.f48821b;
    }

    public final void f(float f7, float f10, int i10, int i11) {
        this.f48820a.d(0, f7, 0, i10, f10, i11);
    }
}
