package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class m extends Drawable.ConstantState {
    public int f50644a;
    public l f50645b;
    public ColorStateList f50646c;
    public PorterDuff.Mode d;
    public boolean f50647e;
    public Bitmap f50648f;
    public ColorStateList f50649g;
    public PorterDuff.Mode h;
    public int f50650i;
    public boolean f50651j;
    public boolean f50652k;
    public Paint f50653l;

    @Override
    public int getChangingConfigurations() {
        return this.f50644a;
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
