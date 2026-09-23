package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class n extends Drawable.ConstantState {
    public int f45260a;
    public m f45261b;
    public ColorStateList f45262c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f45263f;
    public ColorStateList f45264g;
    public PorterDuff.Mode h;
    public int f45265i;
    public boolean f45266j;
    public boolean f45267k;
    public Paint f45268l;

    @Override
    public int getChangingConfigurations() {
        return this.f45260a;
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
