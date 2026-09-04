package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class n extends Drawable.ConstantState {
    public int f48870a;
    public m f48871b;
    public ColorStateList f48872c;
    public PorterDuff.Mode d;
    public boolean f48873e;
    public Bitmap f48874f;
    public ColorStateList f48875g;
    public PorterDuff.Mode h;
    public int f48876i;
    public boolean f48877j;
    public boolean f48878k;
    public Paint f48879l;

    @Override
    public int getChangingConfigurations() {
        return this.f48870a;
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
