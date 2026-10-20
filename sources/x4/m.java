package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class m extends Drawable.ConstantState {
    public int f49274a;
    public l f49275b;
    public ColorStateList f49276c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f49277f;
    public ColorStateList f49278g;
    public PorterDuff.Mode h;
    public int f49279i;
    public boolean f49280j;
    public boolean f49281k;
    public Paint f49282l;

    @Override
    public int getChangingConfigurations() {
        return this.f49274a;
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
