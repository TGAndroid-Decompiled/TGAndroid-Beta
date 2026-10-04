package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class n extends Drawable.ConstantState {
    public int f49360a;
    public m f49361b;
    public ColorStateList f49362c;
    public PorterDuff.Mode d;
    public boolean f49363e;
    public Bitmap f49364f;
    public ColorStateList f49365g;
    public PorterDuff.Mode h;
    public int f49366i;
    public boolean f49367j;
    public boolean f49368k;
    public Paint f49369l;

    @Override
    public int getChangingConfigurations() {
        return this.f49360a;
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
