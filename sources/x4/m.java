package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class m extends Drawable.ConstantState {
    public int f50732a;
    public l f50733b;
    public ColorStateList f50734c;
    public PorterDuff.Mode d;
    public boolean f50735e;
    public Bitmap f50736f;
    public ColorStateList f50737g;
    public PorterDuff.Mode h;
    public int f50738i;
    public boolean f50739j;
    public boolean f50740k;
    public Paint f50741l;

    @Override
    public int getChangingConfigurations() {
        return this.f50732a;
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
