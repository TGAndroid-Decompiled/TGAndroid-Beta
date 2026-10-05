package w7;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.n40;
public abstract class y5 {
    public static void a() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        for (n40 n40Var : n40.values()) {
            edit.remove(n40Var.f28968a);
        }
        edit.apply();
    }
}
