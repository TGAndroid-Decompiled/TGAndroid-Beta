package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class n extends Drawable.ConstantState {
    public int f45589a;
    public m f45590b;
    public ColorStateList f45591c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f45592f;
    public ColorStateList f45593g;
    public PorterDuff.Mode h;
    public int f45594i;
    public boolean f45595j;
    public boolean f45596k;
    public Paint f45597l;

    @Override
    public int getChangingConfigurations() {
        return this.f45589a;
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
