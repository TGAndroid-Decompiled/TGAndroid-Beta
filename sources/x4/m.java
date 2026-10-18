package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class m extends Drawable.ConstantState {
    public int f49315a;
    public l f49316b;
    public ColorStateList f49317c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f49318f;
    public ColorStateList f49319g;
    public PorterDuff.Mode h;
    public int f49320i;
    public boolean f49321j;
    public boolean f49322k;
    public Paint f49323l;

    @Override
    public int getChangingConfigurations() {
        return this.f49315a;
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
