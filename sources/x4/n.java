package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class n extends Drawable.ConstantState {
    public int f45606a;
    public m f45607b;
    public ColorStateList f45608c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f45609f;
    public ColorStateList f45610g;
    public PorterDuff.Mode h;
    public int f45611i;
    public boolean f45612j;
    public boolean f45613k;
    public Paint f45614l;

    @Override
    public int getChangingConfigurations() {
        return this.f45606a;
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
