package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class m extends Drawable.ConstantState {
    public int f49290a;
    public l f49291b;
    public ColorStateList f49292c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f49293f;
    public ColorStateList f49294g;
    public PorterDuff.Mode h;
    public int f49295i;
    public boolean f49296j;
    public boolean f49297k;
    public Paint f49298l;

    @Override
    public int getChangingConfigurations() {
        return this.f49290a;
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
