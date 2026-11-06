package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;
public final class re implements ToIntFunction {
    public final int f49500a;
    public final Object f49501b;

    public re(Object obj, int i7) {
        this.f49500a = i7;
        this.f49501b = obj;
    }

    @Override
    public final int applyAsInt(Object obj) {
        int i7 = this.f49500a;
        Object obj2 = this.f49501b;
        switch (i7) {
            case 0:
                return ((Integer) ((HashMap) obj2).get((View) obj)).intValue();
            default:
                RectF rectF = ProfileActivity.S6;
                return ((Integer) ((ArrayList) obj2).get(((Integer) obj).intValue())).intValue();
        }
    }
}
