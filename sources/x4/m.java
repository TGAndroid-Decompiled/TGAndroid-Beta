package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class m extends Drawable.ConstantState {
    public int f49267a;
    public l f49268b;
    public ColorStateList f49269c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f49270f;
    public ColorStateList f49271g;
    public PorterDuff.Mode h;
    public int f49272i;
    public boolean f49273j;
    public boolean f49274k;
    public Paint f49275l;

    @Override
    public int getChangingConfigurations() {
        return this.f49267a;
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
