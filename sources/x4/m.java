package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class m extends Drawable.ConstantState {
    public int f49719a;
    public l f49720b;
    public ColorStateList f49721c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f49722f;
    public ColorStateList f49723g;
    public PorterDuff.Mode h;
    public int f49724i;
    public boolean f49725j;
    public boolean f49726k;
    public Paint f49727l;

    @Override
    public int getChangingConfigurations() {
        return this.f49719a;
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
