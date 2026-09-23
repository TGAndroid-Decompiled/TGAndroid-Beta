package w7;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.k40;
public abstract class w5 {
    public static void a() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        for (k40 k40Var : k40.values()) {
            edit.remove(k40Var.f25507a);
        }
        edit.apply();
    }
}
