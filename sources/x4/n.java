package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class n extends Drawable.ConstantState {
    public int f48871a;
    public m f48872b;
    public ColorStateList f48873c;
    public PorterDuff.Mode d;
    public boolean f48874e;
    public Bitmap f48875f;
    public ColorStateList f48876g;
    public PorterDuff.Mode h;
    public int f48877i;
    public boolean f48878j;
    public boolean f48879k;
    public Paint f48880l;

    @Override
    public int getChangingConfigurations() {
        return this.f48871a;
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
