package z4;

import android.animation.TypeEvaluator;
public final class f implements TypeEvaluator {
    public static final f f59711a = new Object();

    @Override
    public final Object evaluate(float f10, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f11 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float y9 = com.google.android.recaptcha.internal.a.y(((intValue2 >> 24) & 255) / 255.0f, f11, f10, f11);
        float y10 = com.google.android.recaptcha.internal.a.y(pow4, pow, f10, pow);
        float y11 = com.google.android.recaptcha.internal.a.y((float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d), pow2, f10, pow2);
        float y12 = com.google.android.recaptcha.internal.a.y((float) Math.pow((intValue2 & 255) / 255.0f, 2.2d), pow3, f10, pow3);
        int round = Math.round(((float) Math.pow(y10, 0.45454545454545453d)) * 255.0f) << 16;
        return Integer.valueOf(Math.round(((float) Math.pow(y12, 0.45454545454545453d)) * 255.0f) | round | (Math.round(y9 * 255.0f) << 24) | (Math.round(((float) Math.pow(y11, 0.45454545454545453d)) * 255.0f) << 8));
    }
}
