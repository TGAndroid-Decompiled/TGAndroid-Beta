package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class m extends Drawable.ConstantState {
    public int f50766a;
    public l f50767b;
    public ColorStateList f50768c;
    public PorterDuff.Mode d;
    public boolean f50769e;
    public Bitmap f50770f;
    public ColorStateList f50771g;
    public PorterDuff.Mode h;
    public int f50772i;
    public boolean f50773j;
    public boolean f50774k;
    public Paint f50775l;

    @Override
    public int getChangingConfigurations() {
        return this.f50766a;
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
