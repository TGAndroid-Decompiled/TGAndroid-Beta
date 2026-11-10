package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;
public final class se implements ToIntFunction {
    public final int f49844a;
    public final Object f49845b;

    public se(Object obj, int i7) {
        this.f49844a = i7;
        this.f49845b = obj;
    }

    @Override
    public final int applyAsInt(Object obj) {
        int i7 = this.f49844a;
        Object obj2 = this.f49845b;
        switch (i7) {
            case 0:
                return ((Integer) ((HashMap) obj2).get((View) obj)).intValue();
            default:
                RectF rectF = ProfileActivity.V6;
                return ((Integer) ((ArrayList) obj2).get(((Integer) obj).intValue())).intValue();
        }
    }
}
