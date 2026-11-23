package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;
public final class se implements ToIntFunction {
    public final int f52070a;
    public final Object f52071b;

    public se(Object obj, int i7) {
        this.f52070a = i7;
        this.f52071b = obj;
    }

    @Override
    public final int applyAsInt(Object obj) {
        int i7 = this.f52070a;
        Object obj2 = this.f52071b;
        switch (i7) {
            case 0:
                return ((Integer) ((HashMap) obj2).get((View) obj)).intValue();
            default:
                RectF rectF = ProfileActivity.Z6;
                return ((Integer) ((ArrayList) obj2).get(((Integer) obj).intValue())).intValue();
        }
    }
}
