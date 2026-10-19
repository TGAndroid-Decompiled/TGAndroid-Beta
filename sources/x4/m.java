package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class m extends Drawable.ConstantState {
    public int f49269a;
    public l f49270b;
    public ColorStateList f49271c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f49272f;
    public ColorStateList f49273g;
    public PorterDuff.Mode h;
    public int f49274i;
    public boolean f49275j;
    public boolean f49276k;
    public Paint f49277l;

    @Override
    public int getChangingConfigurations() {
        return this.f49269a;
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
