package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class n extends Drawable.ConstantState {
    public int f45306a;
    public m f45307b;
    public ColorStateList f45308c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f45309f;
    public ColorStateList f45310g;
    public PorterDuff.Mode h;
    public int f45311i;
    public boolean f45312j;
    public boolean f45313k;
    public Paint f45314l;

    @Override
    public int getChangingConfigurations() {
        return this.f45306a;
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
