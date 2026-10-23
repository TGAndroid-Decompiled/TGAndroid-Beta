package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class m extends Drawable.ConstantState {
    public int f49720a;
    public l f49721b;
    public ColorStateList f49722c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f49723f;
    public ColorStateList f49724g;
    public PorterDuff.Mode h;
    public int f49725i;
    public boolean f49726j;
    public boolean f49727k;
    public Paint f49728l;

    @Override
    public int getChangingConfigurations() {
        return this.f49720a;
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
