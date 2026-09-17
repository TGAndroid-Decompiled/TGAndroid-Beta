package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class n extends Drawable.ConstantState {
    public int f48900a;
    public m f48901b;
    public ColorStateList f48902c;
    public PorterDuff.Mode d;
    public boolean f48903e;
    public Bitmap f48904f;
    public ColorStateList f48905g;
    public PorterDuff.Mode h;
    public int f48906i;
    public boolean f48907j;
    public boolean f48908k;
    public Paint f48909l;

    @Override
    public int getChangingConfigurations() {
        return this.f48900a;
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
