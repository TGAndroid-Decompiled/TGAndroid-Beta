package w7;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.a50;
public abstract class w5 {
    public static void a() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        for (a50 a50Var : a50.values()) {
            edit.remove(a50Var.f24607a);
        }
        edit.apply();
    }
}
