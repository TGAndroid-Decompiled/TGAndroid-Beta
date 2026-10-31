package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class m extends Drawable.ConstantState {
    public int f53047a;
    public l f53048b;
    public ColorStateList f53049c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f53050f;
    public ColorStateList f53051g;
    public PorterDuff.Mode h;
    public int f53052i;
    public boolean f53053j;
    public boolean f53054k;
    public Paint f53055l;

    @Override
    public int getChangingConfigurations() {
        return this.f53047a;
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
