package x4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayDeque;
import org.telegram.ui.Components.ar;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import v7.j8;
import v7.x7;
public final class o extends ar {
    public static final PorterDuff.Mode v = PorterDuff.Mode.SRC_IN;
    public m f49730c;
    public PorterDuffColorFilter d;
    public ColorFilter e;
    public boolean f49731f;
    public boolean h;
    public final float[] f49732n;
    public final Matrix f49733r;
    public final Rect f49734s;

    public o() {
        this.h = true;
        this.f49732n = new float[9];
        this.f49733r = new Matrix();
        this.f49734s = new Rect();
        ?? constantState = new Drawable.ConstantState();
        constantState.f49722c = null;
        constantState.d = v;
        constantState.f49721b = new l();
        this.f49730c = constantState;
    }

    public static o c(Resources resources, int i10, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            o oVar = new o();
            ThreadLocal threadLocal = h0.j.f11632a;
            oVar.f24829b = resources.getDrawable(i10, theme);
            new n(((Drawable) oVar.f24829b).getConstantState());
            return oVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i10);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                next = xml.next();
                if (next == 2 || next == 1) {
                    break;
                }
            }
            if (next == 2) {
                o oVar2 = new o();
                oVar2.inflate(resources, xml, asAttributeSet, theme);
                return oVar2;
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e) {
            Log.e("VectorDrawableCompat", "parser error", e);
            return null;
        } catch (XmlPullParserException e7) {
            Log.e("VectorDrawableCompat", "parser error", e7);
            return null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        Drawable drawable = (Drawable) this.f24829b;
        if (drawable != null) {
            drawable.canApplyTheme();
            return false;
        }
        return false;
    }

    public final PorterDuffColorFilter d(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = (Drawable) this.f24829b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f49734s;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.e;
            if (colorFilter == null) {
                colorFilter = this.d;
            }
            Matrix matrix = this.f49733r;
            canvas.getMatrix(matrix);
            float[] fArr = this.f49732n;
            matrix.getValues(fArr);
            float abs = Math.abs(fArr[0]);
            float abs2 = Math.abs(fArr[4]);
            float abs3 = Math.abs(fArr[1]);
            float abs4 = Math.abs(fArr[3]);
            if (abs3 != 0.0f || abs4 != 0.0f) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (rect.width() * abs));
            int min2 = Math.min(2048, (int) (rect.height() * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate(rect.left, rect.top);
                if (isAutoMirrored() && getLayoutDirection() == 1) {
                    canvas.translate(rect.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                rect.offsetTo(0, 0);
                m mVar = this.f49730c;
                Bitmap bitmap = mVar.f49723f;
                if (bitmap == null || min != bitmap.getWidth() || min2 != mVar.f49723f.getHeight()) {
                    mVar.f49723f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    mVar.f49727k = true;
                }
                if (!this.h) {
                    m mVar2 = this.f49730c;
                    mVar2.f49723f.eraseColor(0);
                    Canvas canvas2 = new Canvas(mVar2.f49723f);
                    l lVar = mVar2.f49721b;
                    lVar.a(lVar.f49712g, l.f49707p, canvas2, min, min2);
                } else {
                    m mVar3 = this.f49730c;
                    if (mVar3.f49727k || mVar3.f49724g != mVar3.f49722c || mVar3.h != mVar3.d || mVar3.f49726j != mVar3.e || mVar3.f49725i != mVar3.f49721b.getRootAlpha()) {
                        m mVar4 = this.f49730c;
                        mVar4.f49723f.eraseColor(0);
                        Canvas canvas3 = new Canvas(mVar4.f49723f);
                        l lVar2 = mVar4.f49721b;
                        lVar2.a(lVar2.f49712g, l.f49707p, canvas3, min, min2);
                        m mVar5 = this.f49730c;
                        mVar5.f49724g = mVar5.f49722c;
                        mVar5.h = mVar5.d;
                        mVar5.f49725i = mVar5.f49721b.getRootAlpha();
                        mVar5.f49726j = mVar5.e;
                        mVar5.f49727k = false;
                    }
                }
                m mVar6 = this.f49730c;
                if (mVar6.f49721b.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (mVar6.f49728l == null) {
                        Paint paint2 = new Paint();
                        mVar6.f49728l = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    mVar6.f49728l.setAlpha(mVar6.f49721b.getRootAlpha());
                    mVar6.f49728l.setColorFilter(colorFilter);
                    paint = mVar6.f49728l;
                }
                canvas.drawBitmap(mVar6.f49723f, (Rect) null, rect, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override
    public final int getAlpha() {
        Drawable drawable = (Drawable) this.f24829b;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f49730c.f49721b.getRootAlpha();
    }

    @Override
    public final int getChangingConfigurations() {
        Drawable drawable = (Drawable) this.f24829b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f49730c.getChangingConfigurations();
    }

    @Override
    public final ColorFilter getColorFilter() {
        Drawable drawable = (Drawable) this.f24829b;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.e;
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        if (((Drawable) this.f24829b) != null && Build.VERSION.SDK_INT >= 24) {
            return new n(((Drawable) this.f24829b).getConstantState());
        }
        this.f49730c.f49720a = getChangingConfigurations();
        return this.f49730c;
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = (Drawable) this.f24829b;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f49730c.f49721b.f49713i;
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = (Drawable) this.f24829b;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f49730c.f49721b.h;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = (Drawable) this.f24829b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = (Drawable) this.f24829b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override
    public final void invalidateSelf() {
        Drawable drawable = (Drawable) this.f24829b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override
    public final boolean isAutoMirrored() {
        Drawable drawable = (Drawable) this.f24829b;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f49730c.e;
    }

    @Override
    public final boolean isStateful() {
        Drawable drawable = (Drawable) this.f24829b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            m mVar = this.f49730c;
            if (mVar != null) {
                l lVar = mVar.f49721b;
                if (lVar.f49718n == null) {
                    lVar.f49718n = Boolean.valueOf(lVar.f49712g.a());
                }
                if (!lVar.f49718n.booleanValue()) {
                    ColorStateList colorStateList = this.f49730c.f49722c;
                    if (colorStateList == null || !colorStateList.isStateful()) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final Drawable mutate() {
        Drawable drawable = (Drawable) this.f24829b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f49731f && super.mutate() == this) {
            m mVar = this.f49730c;
            ?? constantState = new Drawable.ConstantState();
            constantState.f49722c = null;
            constantState.d = v;
            if (mVar != null) {
                constantState.f49720a = mVar.f49720a;
                l lVar = new l(mVar.f49721b);
                constantState.f49721b = lVar;
                if (mVar.f49721b.e != null) {
                    lVar.e = new Paint(mVar.f49721b.e);
                }
                if (mVar.f49721b.d != null) {
                    constantState.f49721b.d = new Paint(mVar.f49721b.d);
                }
                constantState.f49722c = mVar.f49722c;
                constantState.d = mVar.d;
                constantState.e = mVar.e;
            }
            this.f49730c = constantState;
            this.f49731f = true;
        }
        return this;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = (Drawable) this.f24829b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = (Drawable) this.f24829b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        m mVar = this.f49730c;
        ColorStateList colorStateList = mVar.f49722c;
        if (colorStateList != null && (mode = mVar.d) != null) {
            this.d = d(colorStateList, mode);
            invalidateSelf();
            z10 = true;
        } else {
            z10 = false;
        }
        l lVar = mVar.f49721b;
        if (lVar.f49718n == null) {
            lVar.f49718n = Boolean.valueOf(lVar.f49712g.a());
        }
        if (lVar.f49718n.booleanValue()) {
            boolean b10 = mVar.f49721b.f49712g.b(iArr);
            mVar.f49727k |= b10;
            if (b10) {
                invalidateSelf();
                return true;
            }
        }
        return z10;
    }

    @Override
    public final void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = (Drawable) this.f24829b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        Drawable drawable = (Drawable) this.f24829b;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f49730c.f49721b.getRootAlpha() != i10) {
            this.f49730c.f49721b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = (Drawable) this.f24829b;
        if (drawable != null) {
            drawable.setAutoMirrored(z10);
        } else {
            this.f49730c.e = z10;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = (Drawable) this.f24829b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.e = colorFilter;
        invalidateSelf();
    }

    @Override
    public final void setTint(int i10) {
        Drawable drawable = (Drawable) this.f24829b;
        if (drawable != null) {
            j8.a(i10, drawable);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = (Drawable) this.f24829b;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        m mVar = this.f49730c;
        if (mVar.f49722c != colorStateList) {
            mVar.f49722c = colorStateList;
            this.d = d(colorStateList, mVar.d);
            invalidateSelf();
        }
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = (Drawable) this.f24829b;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        m mVar = this.f49730c;
        if (mVar.d != mode) {
            mVar.d = mode;
            this.d = d(mVar.f49722c, mode);
            invalidateSelf();
        }
    }

    @Override
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = (Drawable) this.f24829b;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        return super.setVisible(z10, z11);
    }

    @Override
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = (Drawable) this.f24829b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i10;
        char c10;
        int i11;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = (Drawable) this.f24829b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        m mVar = this.f49730c;
        mVar.f49721b = new l();
        TypedArray f7 = h0.b.f(resources, theme, attributeSet, a.f49673a);
        m mVar2 = this.f49730c;
        l lVar = mVar2.f49721b;
        int i12 = !h0.b.c(xmlPullParser, "tintMode") ? -1 : f7.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i12 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i12 != 5) {
            if (i12 != 9) {
                switch (i12) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        mVar2.d = mode;
        ColorStateList colorStateList = null;
        int i13 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            f7.getValue(1, typedValue);
            int i14 = typedValue.type;
            if (i14 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            } else if (i14 >= 28 && i14 <= 31) {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = f7.getResources();
                int resourceId = f7.getResourceId(1, 0);
                ThreadLocal threadLocal = h0.c.f11618a;
                try {
                    colorStateList = h0.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            mVar2.f49722c = colorStateList2;
        }
        boolean z10 = mVar2.e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z10 = f7.getBoolean(5, z10);
        }
        mVar2.e = z10;
        float f10 = lVar.f49714j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f10 = f7.getFloat(7, f10);
        }
        lVar.f49714j = f10;
        float f11 = lVar.f49715k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f11 = f7.getFloat(8, f11);
        }
        lVar.f49715k = f11;
        if (lVar.f49714j <= 0.0f) {
            throw new XmlPullParserException(f7.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f11 > 0.0f) {
            lVar.h = f7.getDimension(3, lVar.h);
            float dimension = f7.getDimension(2, lVar.f49713i);
            lVar.f49713i = dimension;
            if (lVar.h <= 0.0f) {
                throw new XmlPullParserException(f7.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                float alpha = lVar.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = f7.getFloat(4, alpha);
                }
                lVar.setAlpha(alpha);
                String string = f7.getString(0);
                if (string != null) {
                    lVar.f49717m = string;
                    lVar.f49719o.put(string, lVar);
                }
                f7.recycle();
                mVar.f49720a = getChangingConfigurations();
                mVar.f49727k = true;
                m mVar3 = this.f49730c;
                l lVar2 = mVar3.f49721b;
                ArrayDeque arrayDeque = new ArrayDeque();
                i iVar = lVar2.f49712g;
                a0.f fVar = lVar2.f49719o;
                arrayDeque.push(iVar);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z11 = true;
                while (eventType != i13 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        i iVar2 = (i) arrayDeque.peek();
                        i10 = depth;
                        if ("path".equals(name)) {
                            ?? kVar = new k();
                            kVar.e = 0.0f;
                            kVar.f49689g = 1.0f;
                            kVar.h = 1.0f;
                            kVar.f49690i = 0.0f;
                            kVar.f49691j = 1.0f;
                            kVar.f49692k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            kVar.f49693l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            kVar.f49694m = join2;
                            kVar.f49695n = 4.0f;
                            TypedArray f12 = h0.b.f(resources, theme, attributeSet, a.f49675c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = f12.getString(0);
                                if (string2 != null) {
                                    kVar.f49705b = string2;
                                }
                                String string3 = f12.getString(2);
                                if (string3 != null) {
                                    kVar.f49704a = x7.c(string3);
                                }
                                kVar.f49688f = h0.b.a(f12, xmlPullParser, theme, "fillColor", 1);
                                float f13 = kVar.h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f13 = f12.getFloat(12, f13);
                                }
                                kVar.h = f13;
                                int i15 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? f12.getInt(8, -1) : -1;
                                Paint.Cap cap3 = kVar.f49693l;
                                if (i15 == 0) {
                                    cap = cap2;
                                } else if (i15 != 1) {
                                    cap = i15 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                kVar.f49693l = cap;
                                int i16 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? f12.getInt(9, -1) : -1;
                                Paint.Join join3 = kVar.f49694m;
                                if (i16 == 0) {
                                    join = join2;
                                } else if (i16 != 1) {
                                    join = i16 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                kVar.f49694m = join;
                                float f14 = kVar.f49695n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f14 = f12.getFloat(10, f14);
                                }
                                kVar.f49695n = f14;
                                kVar.d = h0.b.a(f12, xmlPullParser, theme, "strokeColor", 3);
                                float f15 = kVar.f49689g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f15 = f12.getFloat(11, f15);
                                }
                                kVar.f49689g = f15;
                                float f16 = kVar.e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f16 = f12.getFloat(4, f16);
                                }
                                kVar.e = f16;
                                float f17 = kVar.f49691j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f17 = f12.getFloat(6, f17);
                                }
                                kVar.f49691j = f17;
                                float f18 = kVar.f49692k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f18 = f12.getFloat(7, f18);
                                }
                                kVar.f49692k = f18;
                                float f19 = kVar.f49690i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f19 = f12.getFloat(5, f19);
                                }
                                kVar.f49690i = f19;
                                int i17 = kVar.f49706c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i17 = f12.getInt(13, i17);
                                }
                                kVar.f49706c = i17;
                            }
                            f12.recycle();
                            iVar2.f49697b.add(kVar);
                            if (kVar.getPathName() != null) {
                                fVar.put(kVar.getPathName(), kVar);
                            }
                            mVar3.f49720a = mVar3.f49720a;
                            z11 = false;
                            c10 = '\b';
                        } else {
                            c10 = '\b';
                            if ("clip-path".equals(name)) {
                                k kVar2 = new k();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray f20 = h0.b.f(resources, theme, attributeSet, a.d);
                                    String string4 = f20.getString(0);
                                    if (string4 != null) {
                                        kVar2.f49705b = string4;
                                    }
                                    String string5 = f20.getString(1);
                                    if (string5 != null) {
                                        kVar2.f49704a = x7.c(string5);
                                    }
                                    kVar2.f49706c = !h0.b.c(xmlPullParser, "fillType") ? 0 : f20.getInt(2, 0);
                                    f20.recycle();
                                }
                                iVar2.f49697b.add(kVar2);
                                if (kVar2.getPathName() != null) {
                                    fVar.put(kVar2.getPathName(), kVar2);
                                }
                                mVar3.f49720a = mVar3.f49720a;
                            } else if ("group".equals(name)) {
                                i iVar3 = new i();
                                TypedArray f21 = h0.b.f(resources, theme, attributeSet, a.f49674b);
                                float f22 = iVar3.f49698c;
                                if (h0.b.c(xmlPullParser, "rotation")) {
                                    f22 = f21.getFloat(5, f22);
                                }
                                iVar3.f49698c = f22;
                                iVar3.d = f21.getFloat(1, iVar3.d);
                                iVar3.e = f21.getFloat(2, iVar3.e);
                                float f23 = iVar3.f49699f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f23 = f21.getFloat(3, f23);
                                }
                                iVar3.f49699f = f23;
                                float f24 = iVar3.f49700g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f24 = f21.getFloat(4, f24);
                                }
                                iVar3.f49700g = f24;
                                float f25 = iVar3.h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f25 = f21.getFloat(6, f25);
                                }
                                iVar3.h = f25;
                                float f26 = iVar3.f49701i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f26 = f21.getFloat(7, f26);
                                }
                                iVar3.f49701i = f26;
                                String string6 = f21.getString(0);
                                if (string6 != null) {
                                    iVar3.f49703k = string6;
                                }
                                iVar3.c();
                                f21.recycle();
                                iVar2.f49697b.add(iVar3);
                                arrayDeque.push(iVar3);
                                if (iVar3.getGroupName() != null) {
                                    fVar.put(iVar3.getGroupName(), iVar3);
                                }
                                mVar3.f49720a = mVar3.f49720a;
                            }
                        }
                        i11 = 1;
                    } else {
                        i10 = depth;
                        c10 = '\b';
                        i11 = 1;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i13 = i11;
                    depth = i10;
                }
                if (!z11) {
                    this.d = d(mVar.f49722c, mVar.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            } else {
                throw new XmlPullParserException(f7.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(f7.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public o(m mVar) {
        this.h = true;
        this.f49732n = new float[9];
        this.f49733r = new Matrix();
        this.f49734s = new Rect();
        this.f49730c = mVar;
        this.d = d(mVar.f49722c, mVar.d);
    }
}
