package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class m extends Drawable.ConstantState {
    public int f50881a;
    public l f50882b;
    public ColorStateList f50883c;
    public PorterDuff.Mode d;
    public boolean f50884e;
    public Bitmap f50885f;
    public ColorStateList f50886g;
    public PorterDuff.Mode h;
    public int f50887i;
    public boolean f50888j;
    public boolean f50889k;
    public Paint f50890l;

    @Override
    public int getChangingConfigurations() {
        return this.f50881a;
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
