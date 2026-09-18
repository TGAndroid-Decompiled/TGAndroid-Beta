package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class n extends Drawable.ConstantState {
    public int f45561a;
    public m f45562b;
    public ColorStateList f45563c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f45564f;
    public ColorStateList f45565g;
    public PorterDuff.Mode h;
    public int f45566i;
    public boolean f45567j;
    public boolean f45568k;
    public Paint f45569l;

    @Override
    public int getChangingConfigurations() {
        return this.f45561a;
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
