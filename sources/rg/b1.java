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
    public static b1 f47419j;
    public final a1 f47420a;
    public final Paint f47421b;
    public Paint f47422c;
    public final Drawable d;
    public final Drawable f47423e;
    public z0 f47424f;
    public z0 f47425g;
    public final z0 h;
    public int f47426i;

    public b1() {
        a1 a1Var = new a1(h6.Lj, h6.Mj, h6.Nj, h6.Oj, null);
        this.f47420a = a1Var;
        a1 a1Var2 = new a1(h6.fk, h6.gk, -1, -1, null);
        this.f47421b = a1Var.f47393f;
        this.f47423e = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
        this.f47424f = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), a1Var);
        this.h = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), a1Var2);
        this.f47425g = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_normal), a1Var);
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
        a1Var.f47393f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        a1Var.d(0, -intrinsicWidth, 0, intrinsicWidth, 0.0f, minimumHeight);
        canvas.drawRect(0.0f, 0.0f, intrinsicWidth, minimumHeight, a1Var.f47393f);
        a1Var.f47393f.setXfermode(null);
        int[] iArr = a1Var.f47398l;
        ?? bitmapDrawable = new BitmapDrawable(ApplicationLoader.applicationContext.getResources(), createBitmap);
        bitmapDrawable.f47747b = drawable;
        int[] iArr2 = new int[iArr.length];
        bitmapDrawable.f47746a = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return bitmapDrawable;
    }

    public static b1 d() {
        if (f47419j == null) {
            f47419j = new b1();
        }
        return f47419j;
    }

    public final z0 a(z0 z0Var) {
        a1 a1Var = this.f47420a;
        int[] iArr = a1Var.f47398l;
        int i10 = iArr[0];
        int[] iArr2 = z0Var.f47746a;
        if (i10 == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) {
            return z0Var;
        }
        return c(z0Var.f47747b, a1Var);
    }

    public final void b() {
        int i10 = h6.f20966z9;
        if (h6.x0(null, i10, false) != this.f47426i) {
            this.f47426i = h6.x0(null, i10, false);
            this.f47423e.setColorFilter(new PorterDuffColorFilter(this.f47426i, PorterDuff.Mode.MULTIPLY));
        }
        this.f47424f = a(this.f47424f);
        this.f47425g = a(this.f47425g);
    }

    public final Paint e() {
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            if (this.f47422c == null) {
                this.f47422c = new Paint(1);
            }
            this.f47422c.setColor(h6.x0(null, h6.Oh, false));
            return this.f47422c;
        }
        return this.f47421b;
    }

    public final void f(float f7, float f10, int i10, int i11) {
        this.f47420a.d(0, f7, 0, i10, f10, i11);
    }
}
