package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class n extends Drawable.ConstantState {
    public int f45588a;
    public m f45589b;
    public ColorStateList f45590c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f45591f;
    public ColorStateList f45592g;
    public PorterDuff.Mode h;
    public int f45593i;
    public boolean f45594j;
    public boolean f45595k;
    public Paint f45596l;

    @Override
    public int getChangingConfigurations() {
        return this.f45588a;
    }

    @Override
    public final Drawable newDrawable() {
        return new p(this);
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        return new p(this);
    }
}
