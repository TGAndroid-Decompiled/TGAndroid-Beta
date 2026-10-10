package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class m extends Drawable.ConstantState {
    public int f50688a;
    public l f50689b;
    public ColorStateList f50690c;
    public PorterDuff.Mode d;
    public boolean f50691e;
    public Bitmap f50692f;
    public ColorStateList f50693g;
    public PorterDuff.Mode h;
    public int f50694i;
    public boolean f50695j;
    public boolean f50696k;
    public Paint f50697l;

    @Override
    public int getChangingConfigurations() {
        return this.f50688a;
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
