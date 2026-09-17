package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class n extends Drawable.ConstantState {
    public int f45333a;
    public m f45334b;
    public ColorStateList f45335c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f45336f;
    public ColorStateList f45337g;
    public PorterDuff.Mode h;
    public int f45338i;
    public boolean f45339j;
    public boolean f45340k;
    public Paint f45341l;

    @Override
    public int getChangingConfigurations() {
        return this.f45333a;
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
