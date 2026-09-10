package qg;

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
import org.telegram.ui.ActionBar.j6;
public final class d1 {
    public static d1 f40707j;
    public final c1 f40708a;
    public final Paint f40709b;
    public Paint f40710c;
    public final Drawable d;
    public final Drawable e;
    public b1 f40711f;
    public b1 f40712g;
    public final b1 h;
    public int f40713i;

    public d1() {
        c1 c1Var = new c1(j6.Lj, j6.Mj, j6.Nj, j6.Oj, null);
        this.f40708a = c1Var;
        c1 c1Var2 = new c1(j6.fk, j6.gk, -1, -1, null);
        this.f40709b = c1Var.f40690f;
        this.e = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
        this.f40711f = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), c1Var);
        this.h = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), c1Var2);
        this.f40712g = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_normal), c1Var);
        this.d = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
        c1Var.a();
        b();
    }

    public static b1 c(Drawable drawable, c1 c1Var) {
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int minimumHeight = drawable.getMinimumHeight();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, minimumHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, minimumHeight);
        drawable.draw(canvas);
        c1Var.f40690f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        c1Var.d(0, -intrinsicWidth, 0, intrinsicWidth, 0.0f, minimumHeight);
        canvas.drawRect(0.0f, 0.0f, intrinsicWidth, minimumHeight, c1Var.f40690f);
        c1Var.f40690f.setXfermode(null);
        int[] iArr = c1Var.f40695l;
        ?? bitmapDrawable = new BitmapDrawable(ApplicationLoader.applicationContext.getResources(), createBitmap);
        bitmapDrawable.f40685b = drawable;
        int[] iArr2 = new int[iArr.length];
        bitmapDrawable.f40684a = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return bitmapDrawable;
    }

    public static d1 d() {
        if (f40707j == null) {
            f40707j = new d1();
        }
        return f40707j;
    }

    public final b1 a(b1 b1Var) {
        c1 c1Var = this.f40708a;
        int[] iArr = c1Var.f40695l;
        int i10 = iArr[0];
        int[] iArr2 = b1Var.f40684a;
        if (i10 == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) {
            return b1Var;
        }
        return c(b1Var.f40685b, c1Var);
    }

    public final void b() {
        int i10 = j6.f18328z9;
        if (j6.w0(null, i10, false) != this.f40713i) {
            this.f40713i = j6.w0(null, i10, false);
            this.e.setColorFilter(new PorterDuffColorFilter(this.f40713i, PorterDuff.Mode.MULTIPLY));
        }
        this.f40711f = a(this.f40711f);
        this.f40712g = a(this.f40712g);
    }

    public final Paint e() {
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            if (this.f40710c == null) {
                this.f40710c = new Paint(1);
            }
            this.f40710c.setColor(j6.w0(null, j6.Oh, false));
            return this.f40710c;
        }
        return this.f40709b;
    }

    public final void f(float f7, float f10, int i10, int i11) {
        this.f40708a.d(0, f7, 0, i10, f10, i11);
    }
}
