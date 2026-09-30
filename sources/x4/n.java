package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class n extends Drawable.ConstantState {
    public int f45590a;
    public m f45591b;
    public ColorStateList f45592c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f45593f;
    public ColorStateList f45594g;
    public PorterDuff.Mode h;
    public int f45595i;
    public boolean f45596j;
    public boolean f45597k;
    public Paint f45598l;

    @Override
    public int getChangingConfigurations() {
        return this.f45590a;
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
