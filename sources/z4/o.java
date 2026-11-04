package z4;

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
import b8.dd;
import b8.rc;
import java.io.IOException;
import java.util.ArrayDeque;
import org.telegram.ui.Components.yp;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
public final class o extends yp {
    public static final PorterDuff.Mode f59758w = PorterDuff.Mode.SRC_IN;
    public m f59759c;
    public PorterDuffColorFilter d;
    public ColorFilter f59760e;
    public boolean f59761f;
    public boolean h;
    public final float[] f59762n;
    public final Matrix f59763r;
    public final Rect f59764s;

    public o() {
        this.h = true;
        this.f59762n = new float[9];
        this.f59763r = new Matrix();
        this.f59764s = new Rect();
        ?? constantState = new Drawable.ConstantState();
        constantState.f59749c = null;
        constantState.d = f59758w;
        constantState.f59748b = new l();
        this.f59759c = constantState;
    }

    public static o c(Resources resources, int i3, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            o oVar = new o();
            ThreadLocal threadLocal = h0.j.f14082a;
            oVar.f40801b = resources.getDrawable(i3, theme);
            new n(((Drawable) oVar.f40801b).getConstantState());
            return oVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i3);
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
        } catch (IOException e10) {
            Log.e("VectorDrawableCompat", "parser error", e10);
            return null;
        } catch (XmlPullParserException e11) {
            Log.e("VectorDrawableCompat", "parser error", e11);
            return null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        Drawable drawable = (Drawable) this.f40801b;
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
        Drawable drawable = (Drawable) this.f40801b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f59764s;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.f59760e;
            if (colorFilter == null) {
                colorFilter = this.d;
            }
            Matrix matrix = this.f59763r;
            canvas.getMatrix(matrix);
            float[] fArr = this.f59762n;
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
                m mVar = this.f59759c;
                Bitmap bitmap = mVar.f59751f;
                if (bitmap == null || min != bitmap.getWidth() || min2 != mVar.f59751f.getHeight()) {
                    mVar.f59751f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    mVar.f59755k = true;
                }
                if (!this.h) {
                    m mVar2 = this.f59759c;
                    mVar2.f59751f.eraseColor(0);
                    Canvas canvas2 = new Canvas(mVar2.f59751f);
                    l lVar = mVar2.f59748b;
                    lVar.a(lVar.f59739g, l.f59733p, canvas2, min, min2);
                } else {
                    m mVar3 = this.f59759c;
                    if (mVar3.f59755k || mVar3.f59752g != mVar3.f59749c || mVar3.h != mVar3.d || mVar3.f59754j != mVar3.f59750e || mVar3.f59753i != mVar3.f59748b.getRootAlpha()) {
                        m mVar4 = this.f59759c;
                        mVar4.f59751f.eraseColor(0);
                        Canvas canvas3 = new Canvas(mVar4.f59751f);
                        l lVar2 = mVar4.f59748b;
                        lVar2.a(lVar2.f59739g, l.f59733p, canvas3, min, min2);
                        m mVar5 = this.f59759c;
                        mVar5.f59752g = mVar5.f59749c;
                        mVar5.h = mVar5.d;
                        mVar5.f59753i = mVar5.f59748b.getRootAlpha();
                        mVar5.f59754j = mVar5.f59750e;
                        mVar5.f59755k = false;
                    }
                }
                m mVar6 = this.f59759c;
                if (mVar6.f59748b.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (mVar6.f59756l == null) {
                        Paint paint2 = new Paint();
                        mVar6.f59756l = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    mVar6.f59756l.setAlpha(mVar6.f59748b.getRootAlpha());
                    mVar6.f59756l.setColorFilter(colorFilter);
                    paint = mVar6.f59756l;
                }
                canvas.drawBitmap(mVar6.f59751f, (Rect) null, rect, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override
    public final int getAlpha() {
        Drawable drawable = (Drawable) this.f40801b;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f59759c.f59748b.getRootAlpha();
    }

    @Override
    public final int getChangingConfigurations() {
        Drawable drawable = (Drawable) this.f40801b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f59759c.getChangingConfigurations();
    }

    @Override
    public final ColorFilter getColorFilter() {
        Drawable drawable = (Drawable) this.f40801b;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.f59760e;
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        if (((Drawable) this.f40801b) != null && Build.VERSION.SDK_INT >= 24) {
            return new n(((Drawable) this.f40801b).getConstantState());
        }
        this.f59759c.f59747a = getChangingConfigurations();
        return this.f59759c;
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = (Drawable) this.f40801b;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f59759c.f59748b.f59740i;
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = (Drawable) this.f40801b;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f59759c.f59748b.h;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = (Drawable) this.f40801b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = (Drawable) this.f40801b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override
    public final void invalidateSelf() {
        Drawable drawable = (Drawable) this.f40801b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override
    public final boolean isAutoMirrored() {
        Drawable drawable = (Drawable) this.f40801b;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f59759c.f59750e;
    }

    @Override
    public final boolean isStateful() {
        Drawable drawable = (Drawable) this.f40801b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            m mVar = this.f59759c;
            if (mVar != null) {
                l lVar = mVar.f59748b;
                if (lVar.f59745n == null) {
                    lVar.f59745n = Boolean.valueOf(lVar.f59739g.a());
                }
                if (!lVar.f59745n.booleanValue()) {
                    ColorStateList colorStateList = this.f59759c.f59749c;
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
        Drawable drawable = (Drawable) this.f40801b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f59761f && super.mutate() == this) {
            m mVar = this.f59759c;
            ?? constantState = new Drawable.ConstantState();
            constantState.f59749c = null;
            constantState.d = f59758w;
            if (mVar != null) {
                constantState.f59747a = mVar.f59747a;
                l lVar = new l(mVar.f59748b);
                constantState.f59748b = lVar;
                if (mVar.f59748b.f59737e != null) {
                    lVar.f59737e = new Paint(mVar.f59748b.f59737e);
                }
                if (mVar.f59748b.d != null) {
                    constantState.f59748b.d = new Paint(mVar.f59748b.d);
                }
                constantState.f59749c = mVar.f59749c;
                constantState.d = mVar.d;
                constantState.f59750e = mVar.f59750e;
            }
            this.f59759c = constantState;
            this.f59761f = true;
        }
        return this;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = (Drawable) this.f40801b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = (Drawable) this.f40801b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        m mVar = this.f59759c;
        ColorStateList colorStateList = mVar.f59749c;
        if (colorStateList != null && (mode = mVar.d) != null) {
            this.d = d(colorStateList, mode);
            invalidateSelf();
            z10 = true;
        } else {
            z10 = false;
        }
        l lVar = mVar.f59748b;
        if (lVar.f59745n == null) {
            lVar.f59745n = Boolean.valueOf(lVar.f59739g.a());
        }
        if (lVar.f59745n.booleanValue()) {
            boolean b10 = mVar.f59748b.f59739g.b(iArr);
            mVar.f59755k |= b10;
            if (b10) {
                invalidateSelf();
                return true;
            }
        }
        return z10;
    }

    @Override
    public final void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = (Drawable) this.f40801b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override
    public final void setAlpha(int i3) {
        Drawable drawable = (Drawable) this.f40801b;
        if (drawable != null) {
            drawable.setAlpha(i3);
        } else if (this.f59759c.f59748b.getRootAlpha() != i3) {
            this.f59759c.f59748b.setRootAlpha(i3);
            invalidateSelf();
        }
    }

    @Override
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = (Drawable) this.f40801b;
        if (drawable != null) {
            drawable.setAutoMirrored(z10);
        } else {
            this.f59759c.f59750e = z10;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = (Drawable) this.f40801b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f59760e = colorFilter;
        invalidateSelf();
    }

    @Override
    public final void setTint(int i3) {
        Drawable drawable = (Drawable) this.f40801b;
        if (drawable != null) {
            dd.a(i3, drawable);
        } else {
            setTintList(ColorStateList.valueOf(i3));
        }
    }

    @Override
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = (Drawable) this.f40801b;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        m mVar = this.f59759c;
        if (mVar.f59749c != colorStateList) {
            mVar.f59749c = colorStateList;
            this.d = d(colorStateList, mVar.d);
            invalidateSelf();
        }
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = (Drawable) this.f40801b;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        m mVar = this.f59759c;
        if (mVar.d != mode) {
            mVar.d = mode;
            this.d = d(mVar.f59749c, mode);
            invalidateSelf();
        }
    }

    @Override
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = (Drawable) this.f40801b;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        return super.setVisible(z10, z11);
    }

    @Override
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = (Drawable) this.f40801b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i3;
        char c2;
        int i10;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = (Drawable) this.f40801b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        m mVar = this.f59759c;
        mVar.f59748b = new l();
        TypedArray f10 = h0.b.f(resources, theme, attributeSet, a.f59695a);
        m mVar2 = this.f59759c;
        l lVar = mVar2.f59748b;
        int i11 = !h0.b.c(xmlPullParser, "tintMode") ? -1 : f10.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i11 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i11 != 5) {
            if (i11 != 9) {
                switch (i11) {
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
        int i12 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            f10.getValue(1, typedValue);
            int i13 = typedValue.type;
            if (i13 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            } else if (i13 >= 28 && i13 <= 31) {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = f10.getResources();
                int resourceId = f10.getResourceId(1, 0);
                ThreadLocal threadLocal = h0.c.f14066a;
                try {
                    colorStateList = h0.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e10) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e10);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            mVar2.f59749c = colorStateList2;
        }
        boolean z10 = mVar2.f59750e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z10 = f10.getBoolean(5, z10);
        }
        mVar2.f59750e = z10;
        float f11 = lVar.f59741j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f11 = f10.getFloat(7, f11);
        }
        lVar.f59741j = f11;
        float f12 = lVar.f59742k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f12 = f10.getFloat(8, f12);
        }
        lVar.f59742k = f12;
        if (lVar.f59741j <= 0.0f) {
            throw new XmlPullParserException(f10.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f12 > 0.0f) {
            lVar.h = f10.getDimension(3, lVar.h);
            float dimension = f10.getDimension(2, lVar.f59740i);
            lVar.f59740i = dimension;
            if (lVar.h <= 0.0f) {
                throw new XmlPullParserException(f10.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                float alpha = lVar.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = f10.getFloat(4, alpha);
                }
                lVar.setAlpha(alpha);
                String string = f10.getString(0);
                if (string != null) {
                    lVar.f59744m = string;
                    lVar.f59746o.put(string, lVar);
                }
                f10.recycle();
                mVar.f59747a = getChangingConfigurations();
                mVar.f59755k = true;
                m mVar3 = this.f59759c;
                l lVar2 = mVar3.f59748b;
                ArrayDeque arrayDeque = new ArrayDeque();
                i iVar = lVar2.f59739g;
                a0.f fVar = lVar2.f59746o;
                arrayDeque.push(iVar);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z11 = true;
                while (eventType != i12 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        i iVar2 = (i) arrayDeque.peek();
                        i3 = depth;
                        if ("path".equals(name)) {
                            ?? kVar = new k();
                            kVar.f59712e = 0.0f;
                            kVar.f59714g = 1.0f;
                            kVar.h = 1.0f;
                            kVar.f59715i = 0.0f;
                            kVar.f59716j = 1.0f;
                            kVar.f59717k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            kVar.f59718l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            kVar.f59719m = join2;
                            kVar.f59720n = 4.0f;
                            TypedArray f13 = h0.b.f(resources, theme, attributeSet, a.f59697c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = f13.getString(0);
                                if (string2 != null) {
                                    kVar.f59731b = string2;
                                }
                                String string3 = f13.getString(2);
                                if (string3 != null) {
                                    kVar.f59730a = rc.c(string3);
                                }
                                kVar.f59713f = h0.b.a(f13, xmlPullParser, theme, "fillColor", 1);
                                float f14 = kVar.h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f14 = f13.getFloat(12, f14);
                                }
                                kVar.h = f14;
                                int i14 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? f13.getInt(8, -1) : -1;
                                Paint.Cap cap3 = kVar.f59718l;
                                if (i14 == 0) {
                                    cap = cap2;
                                } else if (i14 != 1) {
                                    cap = i14 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                kVar.f59718l = cap;
                                int i15 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? f13.getInt(9, -1) : -1;
                                Paint.Join join3 = kVar.f59719m;
                                if (i15 == 0) {
                                    join = join2;
                                } else if (i15 != 1) {
                                    join = i15 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                kVar.f59719m = join;
                                float f15 = kVar.f59720n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f15 = f13.getFloat(10, f15);
                                }
                                kVar.f59720n = f15;
                                kVar.d = h0.b.a(f13, xmlPullParser, theme, "strokeColor", 3);
                                float f16 = kVar.f59714g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f16 = f13.getFloat(11, f16);
                                }
                                kVar.f59714g = f16;
                                float f17 = kVar.f59712e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f17 = f13.getFloat(4, f17);
                                }
                                kVar.f59712e = f17;
                                float f18 = kVar.f59716j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f18 = f13.getFloat(6, f18);
                                }
                                kVar.f59716j = f18;
                                float f19 = kVar.f59717k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f19 = f13.getFloat(7, f19);
                                }
                                kVar.f59717k = f19;
                                float f20 = kVar.f59715i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f20 = f13.getFloat(5, f20);
                                }
                                kVar.f59715i = f20;
                                int i16 = kVar.f59732c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i16 = f13.getInt(13, i16);
                                }
                                kVar.f59732c = i16;
                            }
                            f13.recycle();
                            iVar2.f59722b.add(kVar);
                            if (kVar.getPathName() != null) {
                                fVar.put(kVar.getPathName(), kVar);
                            }
                            mVar3.f59747a = mVar3.f59747a;
                            z11 = false;
                            c2 = '\b';
                        } else {
                            c2 = '\b';
                            if ("clip-path".equals(name)) {
                                k kVar2 = new k();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray f21 = h0.b.f(resources, theme, attributeSet, a.d);
                                    String string4 = f21.getString(0);
                                    if (string4 != null) {
                                        kVar2.f59731b = string4;
                                    }
                                    String string5 = f21.getString(1);
                                    if (string5 != null) {
                                        kVar2.f59730a = rc.c(string5);
                                    }
                                    kVar2.f59732c = !h0.b.c(xmlPullParser, "fillType") ? 0 : f21.getInt(2, 0);
                                    f21.recycle();
                                }
                                iVar2.f59722b.add(kVar2);
                                if (kVar2.getPathName() != null) {
                                    fVar.put(kVar2.getPathName(), kVar2);
                                }
                                mVar3.f59747a = mVar3.f59747a;
                            } else if ("group".equals(name)) {
                                i iVar3 = new i();
                                TypedArray f22 = h0.b.f(resources, theme, attributeSet, a.f59696b);
                                float f23 = iVar3.f59723c;
                                if (h0.b.c(xmlPullParser, "rotation")) {
                                    f23 = f22.getFloat(5, f23);
                                }
                                iVar3.f59723c = f23;
                                iVar3.d = f22.getFloat(1, iVar3.d);
                                iVar3.f59724e = f22.getFloat(2, iVar3.f59724e);
                                float f24 = iVar3.f59725f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f24 = f22.getFloat(3, f24);
                                }
                                iVar3.f59725f = f24;
                                float f25 = iVar3.f59726g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f25 = f22.getFloat(4, f25);
                                }
                                iVar3.f59726g = f25;
                                float f26 = iVar3.h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f26 = f22.getFloat(6, f26);
                                }
                                iVar3.h = f26;
                                float f27 = iVar3.f59727i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f27 = f22.getFloat(7, f27);
                                }
                                iVar3.f59727i = f27;
                                String string6 = f22.getString(0);
                                if (string6 != null) {
                                    iVar3.f59729k = string6;
                                }
                                iVar3.c();
                                f22.recycle();
                                iVar2.f59722b.add(iVar3);
                                arrayDeque.push(iVar3);
                                if (iVar3.getGroupName() != null) {
                                    fVar.put(iVar3.getGroupName(), iVar3);
                                }
                                mVar3.f59747a = mVar3.f59747a;
                            }
                        }
                        i10 = 1;
                    } else {
                        i3 = depth;
                        c2 = '\b';
                        i10 = 1;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i12 = i10;
                    depth = i3;
                }
                if (!z11) {
                    this.d = d(mVar.f59749c, mVar.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            } else {
                throw new XmlPullParserException(f10.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(f10.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public o(m mVar) {
        this.h = true;
        this.f59762n = new float[9];
        this.f59763r = new Matrix();
        this.f59764s = new Rect();
        this.f59759c = mVar;
        this.d = d(mVar.f59749c, mVar.d);
    }
}
