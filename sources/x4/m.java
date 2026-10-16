package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class m extends Drawable.ConstantState {
    public int f47881a;
    public l f47882b;
    public ColorStateList f47883c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f47884f;
    public ColorStateList f47885g;
    public PorterDuff.Mode h;
    public int f47886i;
    public boolean f47887j;
    public boolean f47888k;
    public Paint f47889l;

    @Override
    public int getChangingConfigurations() {
        return this.f47881a;
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
