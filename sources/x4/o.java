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
import org.telegram.ui.Components.yq;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import v7.j8;
import v7.x7;
public final class o extends yq {
    public static final PorterDuff.Mode v = PorterDuff.Mode.SRC_IN;
    public m f49729c;
    public PorterDuffColorFilter d;
    public ColorFilter e;
    public boolean f49730f;
    public boolean h;
    public final float[] f49731n;
    public final Matrix f49732r;
    public final Rect f49733s;

    public o() {
        this.h = true;
        this.f49731n = new float[9];
        this.f49732r = new Matrix();
        this.f49733s = new Rect();
        ?? constantState = new Drawable.ConstantState();
        constantState.f49721c = null;
        constantState.d = v;
        constantState.f49720b = new l();
        this.f49729c = constantState;
    }

    public static o c(Resources resources, int i10, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            o oVar = new o();
            ThreadLocal threadLocal = h0.j.f11632a;
            oVar.f33024b = resources.getDrawable(i10, theme);
            new n(((Drawable) oVar.f33024b).getConstantState());
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
        Drawable drawable = (Drawable) this.f33024b;
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
        Drawable drawable = (Drawable) this.f33024b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f49733s;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.e;
            if (colorFilter == null) {
                colorFilter = this.d;
            }
            Matrix matrix = this.f49732r;
            canvas.getMatrix(matrix);
            float[] fArr = this.f49731n;
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
                m mVar = this.f49729c;
                Bitmap bitmap = mVar.f49722f;
                if (bitmap == null || min != bitmap.getWidth() || min2 != mVar.f49722f.getHeight()) {
                    mVar.f49722f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    mVar.f49726k = true;
                }
                if (!this.h) {
                    m mVar2 = this.f49729c;
                    mVar2.f49722f.eraseColor(0);
                    Canvas canvas2 = new Canvas(mVar2.f49722f);
                    l lVar = mVar2.f49720b;
                    lVar.a(lVar.f49711g, l.f49706p, canvas2, min, min2);
                } else {
                    m mVar3 = this.f49729c;
                    if (mVar3.f49726k || mVar3.f49723g != mVar3.f49721c || mVar3.h != mVar3.d || mVar3.f49725j != mVar3.e || mVar3.f49724i != mVar3.f49720b.getRootAlpha()) {
                        m mVar4 = this.f49729c;
                        mVar4.f49722f.eraseColor(0);
                        Canvas canvas3 = new Canvas(mVar4.f49722f);
                        l lVar2 = mVar4.f49720b;
                        lVar2.a(lVar2.f49711g, l.f49706p, canvas3, min, min2);
                        m mVar5 = this.f49729c;
                        mVar5.f49723g = mVar5.f49721c;
                        mVar5.h = mVar5.d;
                        mVar5.f49724i = mVar5.f49720b.getRootAlpha();
                        mVar5.f49725j = mVar5.e;
                        mVar5.f49726k = false;
                    }
                }
                m mVar6 = this.f49729c;
                if (mVar6.f49720b.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (mVar6.f49727l == null) {
                        Paint paint2 = new Paint();
                        mVar6.f49727l = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    mVar6.f49727l.setAlpha(mVar6.f49720b.getRootAlpha());
                    mVar6.f49727l.setColorFilter(colorFilter);
                    paint = mVar6.f49727l;
                }
                canvas.drawBitmap(mVar6.f49722f, (Rect) null, rect, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override
    public final int getAlpha() {
        Drawable drawable = (Drawable) this.f33024b;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f49729c.f49720b.getRootAlpha();
    }

    @Override
    public final int getChangingConfigurations() {
        Drawable drawable = (Drawable) this.f33024b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f49729c.getChangingConfigurations();
    }

    @Override
    public final ColorFilter getColorFilter() {
        Drawable drawable = (Drawable) this.f33024b;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.e;
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        if (((Drawable) this.f33024b) != null && Build.VERSION.SDK_INT >= 24) {
            return new n(((Drawable) this.f33024b).getConstantState());
        }
        this.f49729c.f49719a = getChangingConfigurations();
        return this.f49729c;
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = (Drawable) this.f33024b;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f49729c.f49720b.f49712i;
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = (Drawable) this.f33024b;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f49729c.f49720b.h;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = (Drawable) this.f33024b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = (Drawable) this.f33024b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override
    public final void invalidateSelf() {
        Drawable drawable = (Drawable) this.f33024b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override
    public final boolean isAutoMirrored() {
        Drawable drawable = (Drawable) this.f33024b;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f49729c.e;
    }

    @Override
    public final boolean isStateful() {
        Drawable drawable = (Drawable) this.f33024b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            m mVar = this.f49729c;
            if (mVar != null) {
                l lVar = mVar.f49720b;
                if (lVar.f49717n == null) {
                    lVar.f49717n = Boolean.valueOf(lVar.f49711g.a());
                }
                if (!lVar.f49717n.booleanValue()) {
                    ColorStateList colorStateList = this.f49729c.f49721c;
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
        Drawable drawable = (Drawable) this.f33024b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f49730f && super.mutate() == this) {
            m mVar = this.f49729c;
            ?? constantState = new Drawable.ConstantState();
            constantState.f49721c = null;
            constantState.d = v;
            if (mVar != null) {
                constantState.f49719a = mVar.f49719a;
                l lVar = new l(mVar.f49720b);
                constantState.f49720b = lVar;
                if (mVar.f49720b.e != null) {
                    lVar.e = new Paint(mVar.f49720b.e);
                }
                if (mVar.f49720b.d != null) {
                    constantState.f49720b.d = new Paint(mVar.f49720b.d);
                }
                constantState.f49721c = mVar.f49721c;
                constantState.d = mVar.d;
                constantState.e = mVar.e;
            }
            this.f49729c = constantState;
            this.f49730f = true;
        }
        return this;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = (Drawable) this.f33024b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = (Drawable) this.f33024b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        m mVar = this.f49729c;
        ColorStateList colorStateList = mVar.f49721c;
        if (colorStateList != null && (mode = mVar.d) != null) {
            this.d = d(colorStateList, mode);
            invalidateSelf();
            z10 = true;
        } else {
            z10 = false;
        }
        l lVar = mVar.f49720b;
        if (lVar.f49717n == null) {
            lVar.f49717n = Boolean.valueOf(lVar.f49711g.a());
        }
        if (lVar.f49717n.booleanValue()) {
            boolean b10 = mVar.f49720b.f49711g.b(iArr);
            mVar.f49726k |= b10;
            if (b10) {
                invalidateSelf();
                return true;
            }
        }
        return z10;
    }

    @Override
    public final void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = (Drawable) this.f33024b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        Drawable drawable = (Drawable) this.f33024b;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f49729c.f49720b.getRootAlpha() != i10) {
            this.f49729c.f49720b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = (Drawable) this.f33024b;
        if (drawable != null) {
            drawable.setAutoMirrored(z10);
        } else {
            this.f49729c.e = z10;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = (Drawable) this.f33024b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.e = colorFilter;
        invalidateSelf();
    }

    @Override
    public final void setTint(int i10) {
        Drawable drawable = (Drawable) this.f33024b;
        if (drawable != null) {
            j8.a(i10, drawable);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = (Drawable) this.f33024b;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        m mVar = this.f49729c;
        if (mVar.f49721c != colorStateList) {
            mVar.f49721c = colorStateList;
            this.d = d(colorStateList, mVar.d);
            invalidateSelf();
        }
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = (Drawable) this.f33024b;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        m mVar = this.f49729c;
        if (mVar.d != mode) {
            mVar.d = mode;
            this.d = d(mVar.f49721c, mode);
            invalidateSelf();
        }
    }

    @Override
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = (Drawable) this.f33024b;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        return super.setVisible(z10, z11);
    }

    @Override
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = (Drawable) this.f33024b;
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
        Drawable drawable = (Drawable) this.f33024b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        m mVar = this.f49729c;
        mVar.f49720b = new l();
        TypedArray f7 = h0.b.f(resources, theme, attributeSet, a.f49672a);
        m mVar2 = this.f49729c;
        l lVar = mVar2.f49720b;
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
            mVar2.f49721c = colorStateList2;
        }
        boolean z10 = mVar2.e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z10 = f7.getBoolean(5, z10);
        }
        mVar2.e = z10;
        float f10 = lVar.f49713j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f10 = f7.getFloat(7, f10);
        }
        lVar.f49713j = f10;
        float f11 = lVar.f49714k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f11 = f7.getFloat(8, f11);
        }
        lVar.f49714k = f11;
        if (lVar.f49713j <= 0.0f) {
            throw new XmlPullParserException(f7.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f11 > 0.0f) {
            lVar.h = f7.getDimension(3, lVar.h);
            float dimension = f7.getDimension(2, lVar.f49712i);
            lVar.f49712i = dimension;
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
                    lVar.f49716m = string;
                    lVar.f49718o.put(string, lVar);
                }
                f7.recycle();
                mVar.f49719a = getChangingConfigurations();
                mVar.f49726k = true;
                m mVar3 = this.f49729c;
                l lVar2 = mVar3.f49720b;
                ArrayDeque arrayDeque = new ArrayDeque();
                i iVar = lVar2.f49711g;
                a0.f fVar = lVar2.f49718o;
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
                            kVar.f49688g = 1.0f;
                            kVar.h = 1.0f;
                            kVar.f49689i = 0.0f;
                            kVar.f49690j = 1.0f;
                            kVar.f49691k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            kVar.f49692l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            kVar.f49693m = join2;
                            kVar.f49694n = 4.0f;
                            TypedArray f12 = h0.b.f(resources, theme, attributeSet, a.f49674c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = f12.getString(0);
                                if (string2 != null) {
                                    kVar.f49704b = string2;
                                }
                                String string3 = f12.getString(2);
                                if (string3 != null) {
                                    kVar.f49703a = x7.c(string3);
                                }
                                kVar.f49687f = h0.b.a(f12, xmlPullParser, theme, "fillColor", 1);
                                float f13 = kVar.h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f13 = f12.getFloat(12, f13);
                                }
                                kVar.h = f13;
                                int i15 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? f12.getInt(8, -1) : -1;
                                Paint.Cap cap3 = kVar.f49692l;
                                if (i15 == 0) {
                                    cap = cap2;
                                } else if (i15 != 1) {
                                    cap = i15 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                kVar.f49692l = cap;
                                int i16 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? f12.getInt(9, -1) : -1;
                                Paint.Join join3 = kVar.f49693m;
                                if (i16 == 0) {
                                    join = join2;
                                } else if (i16 != 1) {
                                    join = i16 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                kVar.f49693m = join;
                                float f14 = kVar.f49694n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f14 = f12.getFloat(10, f14);
                                }
                                kVar.f49694n = f14;
                                kVar.d = h0.b.a(f12, xmlPullParser, theme, "strokeColor", 3);
                                float f15 = kVar.f49688g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f15 = f12.getFloat(11, f15);
                                }
                                kVar.f49688g = f15;
                                float f16 = kVar.e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f16 = f12.getFloat(4, f16);
                                }
                                kVar.e = f16;
                                float f17 = kVar.f49690j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f17 = f12.getFloat(6, f17);
                                }
                                kVar.f49690j = f17;
                                float f18 = kVar.f49691k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f18 = f12.getFloat(7, f18);
                                }
                                kVar.f49691k = f18;
                                float f19 = kVar.f49689i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f19 = f12.getFloat(5, f19);
                                }
                                kVar.f49689i = f19;
                                int i17 = kVar.f49705c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i17 = f12.getInt(13, i17);
                                }
                                kVar.f49705c = i17;
                            }
                            f12.recycle();
                            iVar2.f49696b.add(kVar);
                            if (kVar.getPathName() != null) {
                                fVar.put(kVar.getPathName(), kVar);
                            }
                            mVar3.f49719a = mVar3.f49719a;
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
                                        kVar2.f49704b = string4;
                                    }
                                    String string5 = f20.getString(1);
                                    if (string5 != null) {
                                        kVar2.f49703a = x7.c(string5);
                                    }
                                    kVar2.f49705c = !h0.b.c(xmlPullParser, "fillType") ? 0 : f20.getInt(2, 0);
                                    f20.recycle();
                                }
                                iVar2.f49696b.add(kVar2);
                                if (kVar2.getPathName() != null) {
                                    fVar.put(kVar2.getPathName(), kVar2);
                                }
                                mVar3.f49719a = mVar3.f49719a;
                            } else if ("group".equals(name)) {
                                i iVar3 = new i();
                                TypedArray f21 = h0.b.f(resources, theme, attributeSet, a.f49673b);
                                float f22 = iVar3.f49697c;
                                if (h0.b.c(xmlPullParser, "rotation")) {
                                    f22 = f21.getFloat(5, f22);
                                }
                                iVar3.f49697c = f22;
                                iVar3.d = f21.getFloat(1, iVar3.d);
                                iVar3.e = f21.getFloat(2, iVar3.e);
                                float f23 = iVar3.f49698f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f23 = f21.getFloat(3, f23);
                                }
                                iVar3.f49698f = f23;
                                float f24 = iVar3.f49699g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f24 = f21.getFloat(4, f24);
                                }
                                iVar3.f49699g = f24;
                                float f25 = iVar3.h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f25 = f21.getFloat(6, f25);
                                }
                                iVar3.h = f25;
                                float f26 = iVar3.f49700i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f26 = f21.getFloat(7, f26);
                                }
                                iVar3.f49700i = f26;
                                String string6 = f21.getString(0);
                                if (string6 != null) {
                                    iVar3.f49702k = string6;
                                }
                                iVar3.c();
                                f21.recycle();
                                iVar2.f49696b.add(iVar3);
                                arrayDeque.push(iVar3);
                                if (iVar3.getGroupName() != null) {
                                    fVar.put(iVar3.getGroupName(), iVar3);
                                }
                                mVar3.f49719a = mVar3.f49719a;
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
                    this.d = d(mVar.f49721c, mVar.d);
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
        this.f49731n = new float[9];
        this.f49732r = new Matrix();
        this.f49733s = new Rect();
        this.f49729c = mVar;
        this.d = d(mVar.f49721c, mVar.d);
    }
}
