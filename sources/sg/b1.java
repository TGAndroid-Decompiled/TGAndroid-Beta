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
    public static b1 f46217j;
    public final a1 f46218a;
    public final Paint f46219b;
    public Paint f46220c;
    public final Drawable d;
    public final Drawable e;
    public z0 f46221f;
    public z0 f46222g;
    public final z0 h;
    public int f46223i;

    public b1() {
        a1 a1Var = new a1(h6.Lj, h6.Mj, h6.Nj, h6.Oj, null);
        this.f46218a = a1Var;
        a1 a1Var2 = new a1(h6.fk, h6.gk, -1, -1, null);
        this.f46219b = a1Var.f46191f;
        this.e = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
        this.f46221f = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), a1Var);
        this.h = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), a1Var2);
        this.f46222g = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_normal), a1Var);
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
        a1Var.f46191f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        a1Var.d(0, -intrinsicWidth, 0, intrinsicWidth, 0.0f, minimumHeight);
        canvas.drawRect(0.0f, 0.0f, intrinsicWidth, minimumHeight, a1Var.f46191f);
        a1Var.f46191f.setXfermode(null);
        int[] iArr = a1Var.f46196l;
        ?? bitmapDrawable = new BitmapDrawable(ApplicationLoader.applicationContext.getResources(), createBitmap);
        bitmapDrawable.f46523b = drawable;
        int[] iArr2 = new int[iArr.length];
        bitmapDrawable.f46522a = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return bitmapDrawable;
    }

    public static b1 d() {
        if (f46217j == null) {
            f46217j = new b1();
        }
        return f46217j;
    }

    public final z0 a(z0 z0Var) {
        a1 a1Var = this.f46218a;
        int[] iArr = a1Var.f46196l;
        int i10 = iArr[0];
        int[] iArr2 = z0Var.f46522a;
        if (i10 == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) {
            return z0Var;
        }
        return c(z0Var.f46523b, a1Var);
    }

    public final void b() {
        int i10 = h6.f21398z9;
        if (h6.x0(null, i10, false) != this.f46223i) {
            this.f46223i = h6.x0(null, i10, false);
            this.e.setColorFilter(new PorterDuffColorFilter(this.f46223i, PorterDuff.Mode.MULTIPLY));
        }
        this.f46221f = a(this.f46221f);
        this.f46222g = a(this.f46222g);
    }

    public final Paint e() {
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            if (this.f46220c == null) {
                this.f46220c = new Paint(1);
            }
            this.f46220c.setColor(h6.x0(null, h6.Oh, false));
            return this.f46220c;
        }
        return this.f46219b;
    }

    public final void f(float f7, float f10, int i10, int i11) {
        this.f46218a.d(0, f7, 0, i10, f10, i11);
    }
}
