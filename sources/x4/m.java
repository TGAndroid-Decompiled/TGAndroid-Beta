package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class m extends Drawable.ConstantState {
    public int f49278a;
    public l f49279b;
    public ColorStateList f49280c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f49281f;
    public ColorStateList f49282g;
    public PorterDuff.Mode h;
    public int f49283i;
    public boolean f49284j;
    public boolean f49285k;
    public Paint f49286l;

    @Override
    public int getChangingConfigurations() {
        return this.f49278a;
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
