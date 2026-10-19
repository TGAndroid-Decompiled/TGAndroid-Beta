package x4;

import ah.f1;
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
import org.telegram.ui.Components.br;
import org.xmlpull.v1.XmlPullParser;
import v7.j8;
public final class d extends br implements Animatable {
    public final Context d;
    public final f1 e = new f1(this, 8);
    public final b f49234c = new Drawable.ConstantState();

    public d(Context context) {
        this.d = context;
    }

    @Override
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = (Drawable) this.f25009b;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override
    public final boolean canApplyTheme() {
        Drawable drawable = (Drawable) this.f25009b;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = (Drawable) this.f25009b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        b bVar = this.f49234c;
        bVar.f49230a.draw(canvas);
        if (bVar.f49231b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override
    public final int getAlpha() {
        Drawable drawable = (Drawable) this.f25009b;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f49234c.f49230a.getAlpha();
    }

    @Override
    public final int getChangingConfigurations() {
        Drawable drawable = (Drawable) this.f25009b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f49234c.getClass();
        return changingConfigurations;
    }

    @Override
    public final ColorFilter getColorFilter() {
        Drawable drawable = (Drawable) this.f25009b;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.f49234c.f49230a.getColorFilter();
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        if (((Drawable) this.f25009b) != null && Build.VERSION.SDK_INT >= 24) {
            return new c(((Drawable) this.f25009b).getConstantState());
        }
        return null;
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = (Drawable) this.f25009b;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f49234c.f49230a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = (Drawable) this.f25009b;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f49234c.f49230a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = (Drawable) this.f25009b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f49234c.f49230a.getOpacity();
    }

    @Override
    public final void inflate(android.content.res.Resources r21, org.xmlpull.v1.XmlPullParser r22, android.util.AttributeSet r23, android.content.res.Resources.Theme r24) {
        throw new UnsupportedOperationException("Method not decompiled: x4.d.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override
    public final boolean isAutoMirrored() {
        Drawable drawable = (Drawable) this.f25009b;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f49234c.f49230a.isAutoMirrored();
    }

    @Override
    public final boolean isRunning() {
        Drawable drawable = (Drawable) this.f25009b;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f49234c.f49231b.isRunning();
    }

    @Override
    public final boolean isStateful() {
        Drawable drawable = (Drawable) this.f25009b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f49234c.f49230a.isStateful();
    }

    @Override
    public final Drawable mutate() {
        Drawable drawable = (Drawable) this.f25009b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = (Drawable) this.f25009b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f49234c.f49230a.setBounds(rect);
        }
    }

    @Override
    public final boolean onLevelChange(int i10) {
        Drawable drawable = (Drawable) this.f25009b;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        return this.f49234c.f49230a.setLevel(i10);
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = (Drawable) this.f25009b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f49234c.f49230a.setState(iArr);
    }

    @Override
    public final void setAlpha(int i10) {
        Drawable drawable = (Drawable) this.f25009b;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f49234c.f49230a.setAlpha(i10);
        }
    }

    @Override
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = (Drawable) this.f25009b;
        if (drawable != null) {
            drawable.setAutoMirrored(z10);
        } else {
            this.f49234c.f49230a.setAutoMirrored(z10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = (Drawable) this.f25009b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f49234c.f49230a.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setTint(int i10) {
        Drawable drawable = (Drawable) this.f25009b;
        if (drawable != null) {
            j8.a(i10, drawable);
        } else {
            this.f49234c.f49230a.setTint(i10);
        }
    }

    @Override
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = (Drawable) this.f25009b;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f49234c.f49230a.setTintList(colorStateList);
        }
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = (Drawable) this.f25009b;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f49234c.f49230a.setTintMode(mode);
        }
    }

    @Override
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = (Drawable) this.f25009b;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f49234c.f49230a.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override
    public final void start() {
        Drawable drawable = (Drawable) this.f25009b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        b bVar = this.f49234c;
        if (bVar.f49231b.isStarted()) {
            return;
        }
        bVar.f49231b.start();
        invalidateSelf();
    }

    @Override
    public final void stop() {
        Drawable drawable = (Drawable) this.f25009b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f49234c.f49231b.end();
        }
    }

    @Override
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
