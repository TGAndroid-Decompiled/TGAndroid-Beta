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
import org.telegram.ui.ActionBar.k6;
public final class b1 {
    public static b1 f46643j;
    public final a1 f46644a;
    public final Paint f46645b;
    public Paint f46646c;
    public final Drawable d;
    public final Drawable e;
    public z0 f46647f;
    public z0 f46648g;
    public final z0 h;
    public int f46649i;

    public b1() {
        a1 a1Var = new a1(k6.Lj, k6.Mj, k6.Nj, k6.Oj, null);
        this.f46644a = a1Var;
        a1 a1Var2 = new a1(k6.fk, k6.gk, -1, -1, null);
        this.f46645b = a1Var.f46618f;
        this.e = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
        this.f46647f = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), a1Var);
        this.h = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), a1Var2);
        this.f46648g = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_normal), a1Var);
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
        a1Var.f46618f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        a1Var.d(0, -intrinsicWidth, 0, intrinsicWidth, 0.0f, minimumHeight);
        canvas.drawRect(0.0f, 0.0f, intrinsicWidth, minimumHeight, a1Var.f46618f);
        a1Var.f46618f.setXfermode(null);
        int[] iArr = a1Var.f46623l;
        ?? bitmapDrawable = new BitmapDrawable(ApplicationLoader.applicationContext.getResources(), createBitmap);
        bitmapDrawable.f46957b = drawable;
        int[] iArr2 = new int[iArr.length];
        bitmapDrawable.f46956a = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return bitmapDrawable;
    }

    public static b1 d() {
        if (f46643j == null) {
            f46643j = new b1();
        }
        return f46643j;
    }

    public final z0 a(z0 z0Var) {
        a1 a1Var = this.f46644a;
        int[] iArr = a1Var.f46623l;
        int i10 = iArr[0];
        int[] iArr2 = z0Var.f46956a;
        if (i10 == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) {
            return z0Var;
        }
        return c(z0Var.f46957b, a1Var);
    }

    public final void b() {
        int i10 = k6.f21592z9;
        if (k6.x0(null, i10, false) != this.f46649i) {
            this.f46649i = k6.x0(null, i10, false);
            this.e.setColorFilter(new PorterDuffColorFilter(this.f46649i, PorterDuff.Mode.MULTIPLY));
        }
        this.f46647f = a(this.f46647f);
        this.f46648g = a(this.f46648g);
    }

    public final Paint e() {
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            if (this.f46646c == null) {
                this.f46646c = new Paint(1);
            }
            this.f46646c.setColor(k6.x0(null, k6.Oh, false));
            return this.f46646c;
        }
        return this.f46645b;
    }

    public final void f(float f7, float f10, int i10, int i11) {
        this.f46644a.d(0, f7, 0, i10, f10, i11);
    }
}
