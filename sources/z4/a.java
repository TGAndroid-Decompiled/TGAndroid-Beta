package z4;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import b8.rc;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
public abstract class a {
    public static final int[] f59695a = {16842755, 16843041, 16843093, 16843097, 16843551, 16843754, 16843771, 16843778, 16843779};
    public static final int[] f59696b = {16842755, 16843189, 16843190, 16843556, 16843557, 16843558, 16843866, 16843867};
    public static final int[] f59697c = {16842755, 16843780, 16843781, 16843782, 16843783, 16843784, 16843785, 16843786, 16843787, 16843788, 16843789, 16843979, 16843980, 16844062};
    public static final int[] d = {16842755, 16843781, 16844062};
    public static final int[] f59698e = {16843161};
    public static final int[] f59699f = {16842755, 16843213};
    public static final int[] f59700g = {16843073, 16843160, 16843198, 16843199, 16843200, 16843486, 16843487, 16843488};
    public static final int[] h = {16843490};
    public static final int[] f59701i = {16843486, 16843487, 16843488, 16843489};
    public static final int[] f59702j = {16842788, 16843073, 16843488, 16843992};
    public static final int[] f59703k = {16843489, 16843781, 16843892, 16843893};

    public static android.animation.Animator a(android.content.Context r27, android.content.res.Resources r28, android.content.res.Resources.Theme r29, org.xmlpull.v1.XmlPullParser r30, android.util.AttributeSet r31, android.animation.AnimatorSet r32, int r33) {
        throw new UnsupportedOperationException("Method not decompiled: z4.a.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    public static PropertyValuesHolder b(TypedArray typedArray, int i3, int i10, int i11, String str) {
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        boolean z12;
        f fVar;
        int i14;
        int i15;
        int i16;
        float f10;
        PropertyValuesHolder ofFloat;
        float f11;
        float f12;
        TypedValue peekValue = typedArray.peekValue(i10);
        if (peekValue != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i12 = peekValue.type;
        } else {
            i12 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(i11);
        if (peekValue2 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            i13 = peekValue2.type;
        } else {
            i13 = 0;
        }
        if (i3 == 4) {
            if ((z10 && c(i12)) || (z11 && c(i13))) {
                i3 = 3;
            } else {
                i3 = 0;
            }
        }
        if (i3 == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        PropertyValuesHolder propertyValuesHolder = null;
        if (i3 == 2) {
            String string = typedArray.getString(i10);
            String string2 = typedArray.getString(i11);
            i0.d[] c2 = rc.c(string);
            i0.d[] c10 = rc.c(string2);
            if (c2 != null || c10 != null) {
                if (c2 != null) {
                    ?? obj = new Object();
                    if (c10 != null) {
                        if (rc.a(c2, c10)) {
                            return PropertyValuesHolder.ofObject(str, (TypeEvaluator) obj, c2, c10);
                        }
                        throw new InflateException(com.google.android.recaptcha.internal.a.k(" Can't morph from ", string, " to ", string2));
                    }
                    return PropertyValuesHolder.ofObject(str, (TypeEvaluator) obj, c2);
                } else if (c10 != null) {
                    return PropertyValuesHolder.ofObject(str, (TypeEvaluator) new Object(), c10);
                }
            }
            return null;
        }
        if (i3 == 3) {
            fVar = f.f59711a;
        } else {
            fVar = null;
        }
        if (z12) {
            if (z10) {
                if (i12 == 5) {
                    f11 = typedArray.getDimension(i10, 0.0f);
                } else {
                    f11 = typedArray.getFloat(i10, 0.0f);
                }
                if (z11) {
                    if (i13 == 5) {
                        f12 = typedArray.getDimension(i11, 0.0f);
                    } else {
                        f12 = typedArray.getFloat(i11, 0.0f);
                    }
                    ofFloat = PropertyValuesHolder.ofFloat(str, f11, f12);
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, f11);
                }
            } else {
                if (i13 == 5) {
                    f10 = typedArray.getDimension(i11, 0.0f);
                } else {
                    f10 = typedArray.getFloat(i11, 0.0f);
                }
                ofFloat = PropertyValuesHolder.ofFloat(str, f10);
            }
            propertyValuesHolder = ofFloat;
        } else if (z10) {
            if (i12 == 5) {
                i15 = (int) typedArray.getDimension(i10, 0.0f);
            } else if (c(i12)) {
                i15 = typedArray.getColor(i10, 0);
            } else {
                i15 = typedArray.getInt(i10, 0);
            }
            if (z11) {
                if (i13 == 5) {
                    i16 = (int) typedArray.getDimension(i11, 0.0f);
                } else if (c(i13)) {
                    i16 = typedArray.getColor(i11, 0);
                } else {
                    i16 = typedArray.getInt(i11, 0);
                }
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i15, i16);
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i15);
            }
        } else if (z11) {
            if (i13 == 5) {
                i14 = (int) typedArray.getDimension(i11, 0.0f);
            } else if (c(i13)) {
                i14 = typedArray.getColor(i11, 0);
            } else {
                i14 = typedArray.getInt(i11, 0);
            }
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i14);
        }
        if (propertyValuesHolder != null && fVar != null) {
            propertyValuesHolder.setEvaluator(fVar);
        }
        return propertyValuesHolder;
    }

    public static boolean c(int i3) {
        if (i3 >= 28 && i3 <= 31) {
            return true;
        }
        return false;
    }

    public static ValueAnimator d(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlPullParser xmlPullParser) {
        ValueAnimator valueAnimator;
        int i3;
        int i10;
        int i11;
        int i12;
        ValueAnimator valueAnimator2;
        int i13;
        int i14;
        ValueAnimator valueAnimator3;
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        boolean z10;
        int i15;
        boolean z11;
        int i16;
        TypedArray f10 = h0.b.f(resources, theme, attributeSet, f59700g);
        TypedArray f11 = h0.b.f(resources, theme, attributeSet, f59703k);
        if (objectAnimator == null) {
            valueAnimator = new ValueAnimator();
        } else {
            valueAnimator = objectAnimator;
        }
        int i17 = 300;
        if (h0.b.c(xmlPullParser, "duration")) {
            i17 = f10.getInt(1, 300);
        }
        long j10 = i17;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startOffset") != null) {
            i3 = f10.getInt(2, 0);
        } else {
            i3 = 0;
        }
        long j11 = i3;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null) {
            i10 = f10.getInt(7, 4);
        } else {
            i10 = 4;
        }
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueFrom") != null && xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueTo") != null) {
            if (i10 == 4) {
                TypedValue peekValue = f10.peekValue(5);
                if (peekValue != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i15 = peekValue.type;
                } else {
                    i15 = 0;
                }
                TypedValue peekValue2 = f10.peekValue(6);
                if (peekValue2 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    i16 = peekValue2.type;
                } else {
                    i16 = 0;
                }
                if ((z10 && c(i15)) || (z11 && c(i16))) {
                    i10 = 3;
                } else {
                    i10 = 0;
                }
            }
            PropertyValuesHolder b10 = b(f10, i10, 5, 6, "");
            if (b10 != null) {
                valueAnimator.setValues(b10);
            }
        }
        valueAnimator.setDuration(j10);
        valueAnimator.setStartDelay(j11);
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatCount") != null) {
            i11 = f10.getInt(3, 0);
        } else {
            i11 = 0;
        }
        valueAnimator.setRepeatCount(i11);
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatMode") != null) {
            i12 = f10.getInt(4, 1);
        } else {
            i12 = 1;
        }
        valueAnimator.setRepeatMode(i12);
        if (f11 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator;
            String b11 = h0.b.b(f11, xmlPullParser, "pathData", 1);
            if (b11 != null) {
                String b12 = h0.b.b(f11, xmlPullParser, "propertyXName", 2);
                String b13 = h0.b.b(f11, xmlPullParser, "propertyYName", 3);
                if (i10 != 2) {
                }
                if (b12 == null && b13 == null) {
                    throw new InflateException(f11.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path d10 = rc.d(b11);
                PathMeasure pathMeasure = new PathMeasure(d10, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f12 = 0.0f;
                while (true) {
                    f12 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f12));
                    if (!pathMeasure.nextContour()) {
                        break;
                    }
                }
                PathMeasure pathMeasure2 = new PathMeasure(d10, false);
                int min = Math.min(100, ((int) (f12 / 0.5f)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f13 = f12 / (min - 1);
                int i18 = 0;
                valueAnimator2 = valueAnimator;
                float f14 = 0.0f;
                int i19 = 0;
                while (true) {
                    propertyValuesHolder = null;
                    if (i18 >= min) {
                        break;
                    }
                    int i20 = min;
                    pathMeasure2.getPosTan(f14 - ((Float) arrayList.get(i19)).floatValue(), fArr3, null);
                    fArr[i18] = fArr3[0];
                    fArr2[i18] = fArr3[1];
                    int i21 = i19 + 1;
                    f14 += f13;
                    if (i21 < arrayList.size() && f14 > ((Float) arrayList.get(i21)).floatValue()) {
                        pathMeasure2.nextContour();
                        i19 = i21;
                    }
                    i18++;
                    min = i20;
                }
                if (b12 != null) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofFloat(b12, fArr);
                } else {
                    propertyValuesHolder2 = null;
                }
                if (b13 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(b13, fArr2);
                }
                if (propertyValuesHolder2 == null) {
                    objectAnimator2.setValues(propertyValuesHolder);
                } else if (propertyValuesHolder == null) {
                    objectAnimator2.setValues(propertyValuesHolder2);
                } else {
                    objectAnimator2.setValues(propertyValuesHolder2, propertyValuesHolder);
                }
                i13 = 0;
            } else {
                valueAnimator2 = valueAnimator;
                i13 = 0;
                objectAnimator2.setPropertyName(h0.b.b(f11, xmlPullParser, "propertyName", 0));
            }
        } else {
            valueAnimator2 = valueAnimator;
            i13 = 0;
        }
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null) {
            i14 = f10.getResourceId(i13, i13);
        } else {
            i14 = i13;
        }
        if (i14 > 0) {
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(AnimationUtils.loadInterpolator(context, i14));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        f10.recycle();
        if (f11 != null) {
            f11.recycle();
        }
        return valueAnimator3;
    }
}
