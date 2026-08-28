package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;
public final class xe implements ToIntFunction {
    public final int f44503a;
    public final Object f44504b;

    public xe(Object obj, int i9) {
        this.f44503a = i9;
        this.f44504b = obj;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f44503a) {
            case 0:
                return ((Integer) ((HashMap) this.f44504b).get((View) obj)).intValue();
            default:
                return ((Integer) ((ArrayList) this.f44504b).get(((Integer) obj).intValue())).intValue();
        }
    }
}
