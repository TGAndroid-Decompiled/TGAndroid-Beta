package w7;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.b50;
public abstract class w5 {
    public static void a() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        for (b50 b50Var : b50.values()) {
            edit.remove(b50Var.f24858a);
        }
        edit.apply();
    }
}
