package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class n extends Drawable.ConstantState {
    public int f45696a;
    public m f45697b;
    public ColorStateList f45698c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f45699f;
    public ColorStateList f45700g;
    public PorterDuff.Mode h;
    public int f45701i;
    public boolean f45702j;
    public boolean f45703k;
    public Paint f45704l;

    @Override
    public int getChangingConfigurations() {
        return this.f45696a;
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
