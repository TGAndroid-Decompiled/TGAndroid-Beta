package y4;

import a8.zc;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import bh.u0;
import org.telegram.ui.Components.cr;
import org.xmlpull.v1.XmlPullParser;
public final class d extends cr implements Animatable {
    public final Context d;
    public final u0 e = new u0(this, 9);
    public final b f52050c = new Drawable.ConstantState();

    public d(Context context) {
        this.d = context;
    }

    @Override
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = (Drawable) this.f27238b;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override
    public final boolean canApplyTheme() {
        Drawable drawable = (Drawable) this.f27238b;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = (Drawable) this.f27238b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        b bVar = this.f52050c;
        bVar.f52046a.draw(canvas);
        if (bVar.f52047b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override
    public final int getAlpha() {
        Drawable drawable = (Drawable) this.f27238b;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f52050c.f52046a.getAlpha();
    }

    @Override
    public final int getChangingConfigurations() {
        Drawable drawable = (Drawable) this.f27238b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f52050c.getClass();
        return changingConfigurations;
    }

    @Override
    public final ColorFilter getColorFilter() {
        Drawable drawable = (Drawable) this.f27238b;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.f52050c.f52046a.getColorFilter();
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        if (((Drawable) this.f27238b) != null && Build.VERSION.SDK_INT >= 24) {
            return new c(((Drawable) this.f27238b).getConstantState());
        }
        return null;
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = (Drawable) this.f27238b;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f52050c.f52046a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = (Drawable) this.f27238b;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f52050c.f52046a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = (Drawable) this.f27238b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f52050c.f52046a.getOpacity();
    }

    @Override
    public final void inflate(android.content.res.Resources r21, org.xmlpull.v1.XmlPullParser r22, android.util.AttributeSet r23, android.content.res.Resources.Theme r24) {
        throw new UnsupportedOperationException("Method not decompiled: y4.d.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override
    public final boolean isAutoMirrored() {
        Drawable drawable = (Drawable) this.f27238b;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f52050c.f52046a.isAutoMirrored();
    }

    @Override
    public final boolean isRunning() {
        Drawable drawable = (Drawable) this.f27238b;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f52050c.f52047b.isRunning();
    }

    @Override
    public final boolean isStateful() {
        Drawable drawable = (Drawable) this.f27238b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f52050c.f52046a.isStateful();
    }

    @Override
    public final Drawable mutate() {
        Drawable drawable = (Drawable) this.f27238b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = (Drawable) this.f27238b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f52050c.f52046a.setBounds(rect);
        }
    }

    @Override
    public final boolean onLevelChange(int i10) {
        Drawable drawable = (Drawable) this.f27238b;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        return this.f52050c.f52046a.setLevel(i10);
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = (Drawable) this.f27238b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f52050c.f52046a.setState(iArr);
    }

    @Override
    public final void setAlpha(int i10) {
        Drawable drawable = (Drawable) this.f27238b;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f52050c.f52046a.setAlpha(i10);
        }
    }

    @Override
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = (Drawable) this.f27238b;
        if (drawable != null) {
            drawable.setAutoMirrored(z10);
        } else {
            this.f52050c.f52046a.setAutoMirrored(z10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = (Drawable) this.f27238b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f52050c.f52046a.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setTint(int i10) {
        Drawable drawable = (Drawable) this.f27238b;
        if (drawable != null) {
            zc.a(i10, drawable);
        } else {
            this.f52050c.f52046a.setTint(i10);
        }
    }

    @Override
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = (Drawable) this.f27238b;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f52050c.f52046a.setTintList(colorStateList);
        }
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = (Drawable) this.f27238b;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f52050c.f52046a.setTintMode(mode);
        }
    }

    @Override
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = (Drawable) this.f27238b;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f52050c.f52046a.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override
    public final void start() {
        Drawable drawable = (Drawable) this.f27238b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        b bVar = this.f52050c;
        if (bVar.f52047b.isStarted()) {
            return;
        }
        bVar.f52047b.start();
        invalidateSelf();
    }

    @Override
    public final void stop() {
        Drawable drawable = (Drawable) this.f27238b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f52050c.f52047b.end();
        }
    }

    @Override
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
