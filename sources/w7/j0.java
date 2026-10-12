package w7;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.d50;
public abstract class j0 {
    public static void a() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        for (d50 d50Var : d50.values()) {
            edit.remove(d50Var.f25248a);
        }
        edit.apply();
    }
}
