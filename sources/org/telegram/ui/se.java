package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;
public final class se implements ToIntFunction {
    public final int f51987a;
    public final Object f51988b;

    public se(Object obj, int i7) {
        this.f51987a = i7;
        this.f51988b = obj;
    }

    @Override
    public final int applyAsInt(Object obj) {
        int i7 = this.f51987a;
        Object obj2 = this.f51988b;
        switch (i7) {
            case 0:
                return ((Integer) ((HashMap) obj2).get((View) obj)).intValue();
            default:
                RectF rectF = ProfileActivity.Z6;
                return ((Integer) ((ArrayList) obj2).get(((Integer) obj).intValue())).intValue();
        }
    }
}
