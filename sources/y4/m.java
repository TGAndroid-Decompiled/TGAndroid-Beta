package y4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class m extends Drawable.ConstantState {
    public int f52027a;
    public l f52028b;
    public ColorStateList f52029c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f52030f;
    public ColorStateList f52031g;
    public PorterDuff.Mode h;
    public int f52032i;
    public boolean f52033j;
    public boolean f52034k;
    public Paint f52035l;

    @Override
    public int getChangingConfigurations() {
        return this.f52027a;
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
