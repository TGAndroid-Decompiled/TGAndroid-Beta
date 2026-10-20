package w7;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.s40;
public abstract class y5 {
    public static void a() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        for (s40 s40Var : s40.values()) {
            edit.remove(s40Var.f30198a);
        }
        edit.apply();
    }
}
