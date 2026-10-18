package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class m extends Drawable.ConstantState {
    public int f49268a;
    public l f49269b;
    public ColorStateList f49270c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f49271f;
    public ColorStateList f49272g;
    public PorterDuff.Mode h;
    public int f49273i;
    public boolean f49274j;
    public boolean f49275k;
    public Paint f49276l;

    @Override
    public int getChangingConfigurations() {
        return this.f49268a;
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
