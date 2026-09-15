package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class n extends Drawable.ConstantState {
    public int f45310a;
    public m f45311b;
    public ColorStateList f45312c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f45313f;
    public ColorStateList f45314g;
    public PorterDuff.Mode h;
    public int f45315i;
    public boolean f45316j;
    public boolean f45317k;
    public Paint f45318l;

    @Override
    public int getChangingConfigurations() {
        return this.f45310a;
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
