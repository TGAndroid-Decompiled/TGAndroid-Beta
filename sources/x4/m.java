package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class m extends Drawable.ConstantState {
    public int f49277a;
    public l f49278b;
    public ColorStateList f49279c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f49280f;
    public ColorStateList f49281g;
    public PorterDuff.Mode h;
    public int f49282i;
    public boolean f49283j;
    public boolean f49284k;
    public Paint f49285l;

    @Override
    public int getChangingConfigurations() {
        return this.f49277a;
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
