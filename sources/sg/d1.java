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
import org.telegram.ui.ActionBar.j6;
public final class d1 {
    public static d1 f46065j;
    public final c1 f46066a;
    public final Paint f46067b;
    public Paint f46068c;
    public final Drawable d;
    public final Drawable f46069e;
    public b1 f46070f;
    public b1 f46071g;
    public final b1 h;
    public int f46072i;

    public d1() {
        c1 c1Var = new c1(j6.Lj, j6.Mj, j6.Nj, j6.Oj, null);
        this.f46066a = c1Var;
        c1 c1Var2 = new c1(j6.fk, j6.gk, -1, -1, null);
        this.f46067b = c1Var.f46036f;
        this.f46069e = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
        this.f46070f = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), c1Var);
        this.h = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), c1Var2);
        this.f46071g = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_normal), c1Var);
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
        c1Var.f46036f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        c1Var.d(0, -intrinsicWidth, 0, intrinsicWidth, 0.0f, minimumHeight);
        canvas.drawRect(0.0f, 0.0f, intrinsicWidth, minimumHeight, c1Var.f46036f);
        c1Var.f46036f.setXfermode(null);
        int[] iArr = c1Var.f46041l;
        ?? bitmapDrawable = new BitmapDrawable(ApplicationLoader.applicationContext.getResources(), createBitmap);
        bitmapDrawable.f46029b = drawable;
        int[] iArr2 = new int[iArr.length];
        bitmapDrawable.f46028a = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return bitmapDrawable;
    }

    public static d1 d() {
        if (f46065j == null) {
            f46065j = new d1();
        }
        return f46065j;
    }

    public final b1 a(b1 b1Var) {
        c1 c1Var = this.f46066a;
        int[] iArr = c1Var.f46041l;
        int i10 = iArr[0];
        int[] iArr2 = b1Var.f46028a;
        if (i10 == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) {
            return b1Var;
        }
        return c(b1Var.f46029b, c1Var);
    }

    public final void b() {
        int i10 = j6.f21065z9;
        if (j6.w0(null, i10, false) != this.f46072i) {
            this.f46072i = j6.w0(null, i10, false);
            this.f46069e.setColorFilter(new PorterDuffColorFilter(this.f46072i, PorterDuff.Mode.MULTIPLY));
        }
        this.f46070f = a(this.f46070f);
        this.f46071g = a(this.f46071g);
    }

    public final Paint e() {
        if (MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            if (this.f46068c == null) {
                this.f46068c = new Paint(1);
            }
            this.f46068c.setColor(j6.w0(null, j6.Oh, false));
            return this.f46068c;
        }
        return this.f46067b;
    }

    public final void f(float f7, float f10, int i10, int i11) {
        this.f46066a.d(0, f7, 0, i10, f10, i11);
    }
}
