package w7;

import android.content.SharedPreferences;
import org.telegram.messenger.wp;
import org.telegram.ui.Components.r30;
public abstract class a6 {
    public static void a() {
        SharedPreferences.Editor edit = wp.d1().edit();
        for (r30 r30Var : r30.values()) {
            edit.remove(r30Var.f29875a);
        }
        edit.apply();
    }
}
