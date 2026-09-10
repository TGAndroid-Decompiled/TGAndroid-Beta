package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class n extends Drawable.ConstantState {
    public int f44650a;
    public m f44651b;
    public ColorStateList f44652c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f44653f;
    public ColorStateList f44654g;
    public PorterDuff.Mode h;
    public int f44655i;
    public boolean f44656j;
    public boolean f44657k;
    public Paint f44658l;

    @Override
    public int getChangingConfigurations() {
        return this.f44650a;
    }

    @Override
    public final Drawable newDrawable() {
        return new p(this);
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        return new p(this);
    }
}
