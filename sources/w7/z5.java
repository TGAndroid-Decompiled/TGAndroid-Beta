package w7;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.w40;
public abstract class z5 {
    public static void a() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        for (w40 w40Var : w40.values()) {
            edit.remove(w40Var.f30794a);
        }
        edit.apply();
    }
}
