package w7;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.t40;
public abstract class z5 {
    public static void a() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        for (t40 t40Var : t40.values()) {
            edit.remove(t40Var.f27312a);
        }
        edit.apply();
    }
}
