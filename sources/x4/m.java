package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class m extends Drawable.ConstantState {
    public int f47882a;
    public l f47883b;
    public ColorStateList f47884c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f47885f;
    public ColorStateList f47886g;
    public PorterDuff.Mode h;
    public int f47887i;
    public boolean f47888j;
    public boolean f47889k;
    public Paint f47890l;

    @Override
    public int getChangingConfigurations() {
        return this.f47882a;
    }

    @Override
    public final Drawable newDrawable() {
        return new o(this);
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        return new o(this);
    }
}
