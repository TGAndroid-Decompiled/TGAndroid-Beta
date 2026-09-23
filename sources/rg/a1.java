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
public final class a1 {
    public static a1 f42196j;
    public final z0 f42197a;
    public final Paint f42198b;
    public Paint f42199c;
    public final Drawable d;
    public final Drawable e;
    public y0 f42200f;
    public y0 f42201g;
    public final y0 h;
    public int f42202i;

    public a1() {
        z0 z0Var = new z0(h6.Lj, h6.Mj, h6.Nj, h6.Oj, null);
        this.f42197a = z0Var;
        z0 z0Var2 = new z0(h6.fk, h6.gk, -1, -1, null);
        this.f42198b = z0Var.f42507f;
        this.e = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
        this.f42200f = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), z0Var);
        this.h = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), z0Var2);
        this.f42201g = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_normal), z0Var);
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
        z0Var.f42507f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        z0Var.d(0, -intrinsicWidth, 0, intrinsicWidth, 0.0f, minimumHeight);
        canvas.drawRect(0.0f, 0.0f, intrinsicWidth, minimumHeight, z0Var.f42507f);
        z0Var.f42507f.setXfermode(null);
        int[] iArr = z0Var.f42512l;
        ?? bitmapDrawable = new BitmapDrawable(ApplicationLoader.applicationContext.getResources(), createBitmap);
        bitmapDrawable.f42502b = drawable;
        int[] iArr2 = new int[iArr.length];
        bitmapDrawable.f42501a = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return bitmapDrawable;
    }

    public static a1 d() {
        if (f42196j == null) {
            f42196j = new a1();
        }
        return f42196j;
    }

    public final y0 a(y0 y0Var) {
        z0 z0Var = this.f42197a;
        int[] iArr = z0Var.f42512l;
        int i10 = iArr[0];
        int[] iArr2 = y0Var.f42501a;
        if (i10 == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) {
            return y0Var;
        }
        return c(y0Var.f42502b, z0Var);
    }

    public final void b() {
        int i10 = h6.f19192z9;
        if (h6.w0(null, i10, false) != this.f42202i) {
            this.f42202i = h6.w0(null, i10, false);
            this.e.setColorFilter(new PorterDuffColorFilter(this.f42202i, PorterDuff.Mode.MULTIPLY));
        }
        this.f42200f = a(this.f42200f);
        this.f42201g = a(this.f42201g);
    }

    public final Paint e() {
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            if (this.f42199c == null) {
                this.f42199c = new Paint(1);
            }
            this.f42199c.setColor(h6.w0(null, h6.Oh, false));
            return this.f42199c;
        }
        return this.f42198b;
    }

    public final void f(float f7, float f10, int i10, int i11) {
        this.f42197a.d(0, f7, 0, i10, f10, i11);
    }
}
