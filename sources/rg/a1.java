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
import org.telegram.ui.ActionBar.i6;
public final class a1 {
    public static a1 f42574j;
    public final z0 f42575a;
    public final Paint f42576b;
    public Paint f42577c;
    public final Drawable d;
    public final Drawable e;
    public y0 f42578f;
    public y0 f42579g;
    public final y0 h;
    public int f42580i;

    public a1() {
        z0 z0Var = new z0(i6.Lj, i6.Mj, i6.Nj, i6.Oj, null);
        this.f42575a = z0Var;
        z0 z0Var2 = new z0(i6.fk, i6.gk, -1, -1, null);
        this.f42576b = z0Var.f42885f;
        this.e = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
        this.f42578f = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), z0Var);
        this.h = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), z0Var2);
        this.f42579g = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_normal), z0Var);
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
        z0Var.f42885f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        z0Var.d(0, -intrinsicWidth, 0, intrinsicWidth, 0.0f, minimumHeight);
        canvas.drawRect(0.0f, 0.0f, intrinsicWidth, minimumHeight, z0Var.f42885f);
        z0Var.f42885f.setXfermode(null);
        int[] iArr = z0Var.f42890l;
        ?? bitmapDrawable = new BitmapDrawable(ApplicationLoader.applicationContext.getResources(), createBitmap);
        bitmapDrawable.f42880b = drawable;
        int[] iArr2 = new int[iArr.length];
        bitmapDrawable.f42879a = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return bitmapDrawable;
    }

    public static a1 d() {
        if (f42574j == null) {
            f42574j = new a1();
        }
        return f42574j;
    }

    public final y0 a(y0 y0Var) {
        z0 z0Var = this.f42575a;
        int[] iArr = z0Var.f42890l;
        int i10 = iArr[0];
        int[] iArr2 = y0Var.f42879a;
        if (i10 == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) {
            return y0Var;
        }
        return c(y0Var.f42880b, z0Var);
    }

    public final void b() {
        int i10 = i6.f19464z9;
        if (i6.w0(null, i10, false) != this.f42580i) {
            this.f42580i = i6.w0(null, i10, false);
            this.e.setColorFilter(new PorterDuffColorFilter(this.f42580i, PorterDuff.Mode.MULTIPLY));
        }
        this.f42578f = a(this.f42578f);
        this.f42579g = a(this.f42579g);
    }

    public final Paint e() {
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            if (this.f42577c == null) {
                this.f42577c = new Paint(1);
            }
            this.f42577c.setColor(i6.w0(null, i6.Oh, false));
            return this.f42577c;
        }
        return this.f42576b;
    }

    public final void f(float f7, float f10, int i10, int i11) {
        this.f42575a.d(0, f7, 0, i10, f10, i11);
    }
}
