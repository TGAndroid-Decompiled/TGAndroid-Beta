package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class n extends Drawable.ConstantState {
    public int f49351a;
    public m f49352b;
    public ColorStateList f49353c;
    public PorterDuff.Mode d;
    public boolean f49354e;
    public Bitmap f49355f;
    public ColorStateList f49356g;
    public PorterDuff.Mode h;
    public int f49357i;
    public boolean f49358j;
    public boolean f49359k;
    public Paint f49360l;

    @Override
    public int getChangingConfigurations() {
        return this.f49351a;
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
