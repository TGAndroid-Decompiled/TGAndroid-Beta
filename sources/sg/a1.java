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
public final class a1 {
    public static a1 f46231j;
    public final z0 f46232a;
    public final Paint f46233b;
    public Paint f46234c;
    public final Drawable d;
    public final Drawable e;
    public y0 f46235f;
    public y0 f46236g;
    public final y0 h;
    public int f46237i;

    public a1() {
        z0 z0Var = new z0(h6.Lj, h6.Mj, h6.Nj, h6.Oj, null);
        this.f46232a = z0Var;
        z0 z0Var2 = new z0(h6.fk, h6.gk, -1, -1, null);
        this.f46233b = z0Var.f46544f;
        this.e = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
        this.f46235f = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), z0Var);
        this.h = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), z0Var2);
        this.f46236g = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_normal), z0Var);
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
        z0Var.f46544f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        z0Var.d(0, -intrinsicWidth, 0, intrinsicWidth, 0.0f, minimumHeight);
        canvas.drawRect(0.0f, 0.0f, intrinsicWidth, minimumHeight, z0Var.f46544f);
        z0Var.f46544f.setXfermode(null);
        int[] iArr = z0Var.f46549l;
        ?? bitmapDrawable = new BitmapDrawable(ApplicationLoader.applicationContext.getResources(), createBitmap);
        bitmapDrawable.f46539b = drawable;
        int[] iArr2 = new int[iArr.length];
        bitmapDrawable.f46538a = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return bitmapDrawable;
    }

    public static a1 d() {
        if (f46231j == null) {
            f46231j = new a1();
        }
        return f46231j;
    }

    public final y0 a(y0 y0Var) {
        z0 z0Var = this.f46232a;
        int[] iArr = z0Var.f46549l;
        int i10 = iArr[0];
        int[] iArr2 = y0Var.f46538a;
        if (i10 == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) {
            return y0Var;
        }
        return c(y0Var.f46539b, z0Var);
    }

    public final void b() {
        int i10 = h6.f21401z9;
        if (h6.x0(null, i10, false) != this.f46237i) {
            this.f46237i = h6.x0(null, i10, false);
            this.e.setColorFilter(new PorterDuffColorFilter(this.f46237i, PorterDuff.Mode.MULTIPLY));
        }
        this.f46235f = a(this.f46235f);
        this.f46236g = a(this.f46236g);
    }

    public final Paint e() {
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            if (this.f46234c == null) {
                this.f46234c = new Paint(1);
            }
            this.f46234c.setColor(h6.x0(null, h6.Oh, false));
            return this.f46234c;
        }
        return this.f46233b;
    }

    public final void f(float f7, float f10, int i10, int i11) {
        this.f46232a.d(0, f7, 0, i10, f10, i11);
    }
}
