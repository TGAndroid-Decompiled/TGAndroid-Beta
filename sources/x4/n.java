package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class n extends Drawable.ConstantState {
    public int f49367a;
    public m f49368b;
    public ColorStateList f49369c;
    public PorterDuff.Mode d;
    public boolean f49370e;
    public Bitmap f49371f;
    public ColorStateList f49372g;
    public PorterDuff.Mode h;
    public int f49373i;
    public boolean f49374j;
    public boolean f49375k;
    public Paint f49376l;

    @Override
    public int getChangingConfigurations() {
        return this.f49367a;
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
