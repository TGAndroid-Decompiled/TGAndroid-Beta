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
import org.telegram.ui.ActionBar.h6;
public final class b1 {
    public static b1 f47295j;
    public final a1 f47296a;
    public final Paint f47297b;
    public Paint f47298c;
    public final Drawable d;
    public final Drawable f47299e;
    public z0 f47300f;
    public z0 f47301g;
    public final z0 h;
    public int f47302i;

    public b1() {
        a1 a1Var = new a1(h6.Lj, h6.Mj, h6.Nj, h6.Oj, null);
        this.f47296a = a1Var;
        a1 a1Var2 = new a1(h6.fk, h6.gk, -1, -1, null);
        this.f47297b = a1Var.f47269f;
        this.f47299e = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
        this.f47300f = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), a1Var);
        this.h = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), a1Var2);
        this.f47301g = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_normal), a1Var);
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
        a1Var.f47269f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        a1Var.d(0, -intrinsicWidth, 0, intrinsicWidth, 0.0f, minimumHeight);
        canvas.drawRect(0.0f, 0.0f, intrinsicWidth, minimumHeight, a1Var.f47269f);
        a1Var.f47269f.setXfermode(null);
        int[] iArr = a1Var.f47274l;
        ?? bitmapDrawable = new BitmapDrawable(ApplicationLoader.applicationContext.getResources(), createBitmap);
        bitmapDrawable.f47623b = drawable;
        int[] iArr2 = new int[iArr.length];
        bitmapDrawable.f47622a = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return bitmapDrawable;
    }

    public static b1 d() {
        if (f47295j == null) {
            f47295j = new b1();
        }
        return f47295j;
    }

    public final z0 a(z0 z0Var) {
        a1 a1Var = this.f47296a;
        int[] iArr = a1Var.f47274l;
        int i10 = iArr[0];
        int[] iArr2 = z0Var.f47622a;
        if (i10 == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) {
            return z0Var;
        }
        return c(z0Var.f47623b, a1Var);
    }

    public final void b() {
        int i10 = h6.f21192z9;
        if (h6.x0(null, i10, false) != this.f47302i) {
            this.f47302i = h6.x0(null, i10, false);
            this.f47299e.setColorFilter(new PorterDuffColorFilter(this.f47302i, PorterDuff.Mode.MULTIPLY));
        }
        this.f47300f = a(this.f47300f);
        this.f47301g = a(this.f47301g);
    }

    public final Paint e() {
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            if (this.f47298c == null) {
                this.f47298c = new Paint(1);
            }
            this.f47298c.setColor(h6.x0(null, h6.Oh, false));
            return this.f47298c;
        }
        return this.f47297b;
    }

    public final void f(float f7, float f10, int i10, int i11) {
        this.f47296a.d(0, f7, 0, i10, f10, i11);
    }
}
