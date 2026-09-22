package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class n extends Drawable.ConstantState {
    public int f45627a;
    public m f45628b;
    public ColorStateList f45629c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f45630f;
    public ColorStateList f45631g;
    public PorterDuff.Mode h;
    public int f45632i;
    public boolean f45633j;
    public boolean f45634k;
    public Paint f45635l;

    @Override
    public int getChangingConfigurations() {
        return this.f45627a;
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
