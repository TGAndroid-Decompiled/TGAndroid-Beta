package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class n extends Drawable.ConstantState {
    public int f45574a;
    public m f45575b;
    public ColorStateList f45576c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f45577f;
    public ColorStateList f45578g;
    public PorterDuff.Mode h;
    public int f45579i;
    public boolean f45580j;
    public boolean f45581k;
    public Paint f45582l;

    @Override
    public int getChangingConfigurations() {
        return this.f45574a;
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
