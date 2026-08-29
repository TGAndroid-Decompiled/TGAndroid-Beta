package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;
public final class ve implements ToIntFunction {
    public final int f43555a;
    public final Object f43556b;

    public ve(Object obj, int i10) {
        this.f43555a = i10;
        this.f43556b = obj;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f43555a) {
            case 0:
                return ((Integer) ((HashMap) this.f43556b).get((View) obj)).intValue();
            default:
                return ((Integer) ((ArrayList) this.f43556b).get(((Integer) obj).intValue())).intValue();
        }
    }
}
