package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class n extends Drawable.ConstantState {
    public int f48899a;
    public m f48900b;
    public ColorStateList f48901c;
    public PorterDuff.Mode d;
    public boolean f48902e;
    public Bitmap f48903f;
    public ColorStateList f48904g;
    public PorterDuff.Mode h;
    public int f48905i;
    public boolean f48906j;
    public boolean f48907k;
    public Paint f48908l;

    @Override
    public int getChangingConfigurations() {
        return this.f48899a;
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
