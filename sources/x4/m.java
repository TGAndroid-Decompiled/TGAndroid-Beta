package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class m extends Drawable.ConstantState {
    public int f50642a;
    public l f50643b;
    public ColorStateList f50644c;
    public PorterDuff.Mode d;
    public boolean f50645e;
    public Bitmap f50646f;
    public ColorStateList f50647g;
    public PorterDuff.Mode h;
    public int f50648i;
    public boolean f50649j;
    public boolean f50650k;
    public Paint f50651l;

    @Override
    public int getChangingConfigurations() {
        return this.f50642a;
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
