package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class n extends Drawable.ConstantState {
    public int f45587a;
    public m f45588b;
    public ColorStateList f45589c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f45590f;
    public ColorStateList f45591g;
    public PorterDuff.Mode h;
    public int f45592i;
    public boolean f45593j;
    public boolean f45594k;
    public Paint f45595l;

    @Override
    public int getChangingConfigurations() {
        return this.f45587a;
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
