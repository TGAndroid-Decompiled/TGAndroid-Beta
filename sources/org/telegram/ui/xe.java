package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;

public final class xe implements ToIntFunction {

    public final int f44423a;

    public final Object f44424b;

    public xe(Object obj, int i10) {
        this.f44423a = i10;
        this.f44424b = obj;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f44423a) {
            case 0:
                return ((Integer) ((HashMap) this.f44424b).get((View) obj)).intValue();
            default:
                return ((Integer) ((ArrayList) this.f44424b).get(((Integer) obj).intValue())).intValue();
        }
    }
}
