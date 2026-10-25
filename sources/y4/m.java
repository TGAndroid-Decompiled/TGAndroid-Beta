package y4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class m extends Drawable.ConstantState {
    public int f52024a;
    public l f52025b;
    public ColorStateList f52026c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f52027f;
    public ColorStateList f52028g;
    public PorterDuff.Mode h;
    public int f52029i;
    public boolean f52030j;
    public boolean f52031k;
    public Paint f52032l;

    @Override
    public int getChangingConfigurations() {
        return this.f52024a;
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
