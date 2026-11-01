package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class m extends Drawable.ConstantState {
    public int f53065a;
    public l f53066b;
    public ColorStateList f53067c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f53068f;
    public ColorStateList f53069g;
    public PorterDuff.Mode h;
    public int f53070i;
    public boolean f53071j;
    public boolean f53072k;
    public Paint f53073l;

    @Override
    public int getChangingConfigurations() {
        return this.f53065a;
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
