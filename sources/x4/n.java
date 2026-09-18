package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class n extends Drawable.ConstantState {
    public int f45338a;
    public m f45339b;
    public ColorStateList f45340c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f45341f;
    public ColorStateList f45342g;
    public PorterDuff.Mode h;
    public int f45343i;
    public boolean f45344j;
    public boolean f45345k;
    public Paint f45346l;

    @Override
    public int getChangingConfigurations() {
        return this.f45338a;
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
