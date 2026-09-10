package x4;

import android.animation.TypeEvaluator;
import com.google.android.gms.internal.vision.e2;
public final class f implements TypeEvaluator {
    public static final f f44616a = new Object();

    @Override
    public final Object evaluate(float f7, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f10 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float z10 = e2.z(((intValue2 >> 24) & 255) / 255.0f, f10, f7, f10);
        float z11 = e2.z(pow4, pow, f7, pow);
        float z12 = e2.z((float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d), pow2, f7, pow2);
        float z13 = e2.z((float) Math.pow((intValue2 & 255) / 255.0f, 2.2d), pow3, f7, pow3);
        int round = Math.round(((float) Math.pow(z11, 0.45454545454545453d)) * 255.0f) << 16;
        return Integer.valueOf(Math.round(((float) Math.pow(z13, 0.45454545454545453d)) * 255.0f) | round | (Math.round(z10 * 255.0f) << 24) | (Math.round(((float) Math.pow(z12, 0.45454545454545453d)) * 255.0f) << 8));
    }
}
