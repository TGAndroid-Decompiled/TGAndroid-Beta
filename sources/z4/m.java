package z4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class m extends Drawable.ConstantState {
    public int f59747a;
    public l f59748b;
    public ColorStateList f59749c;
    public PorterDuff.Mode d;
    public boolean f59750e;
    public Bitmap f59751f;
    public ColorStateList f59752g;
    public PorterDuff.Mode h;
    public int f59753i;
    public boolean f59754j;
    public boolean f59755k;
    public Paint f59756l;

    @Override
    public int getChangingConfigurations() {
        return this.f59747a;
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
