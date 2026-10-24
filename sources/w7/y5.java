package w7;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.q40;
public abstract class y5 {
    public static void a() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        for (q40 q40Var : q40.values()) {
            edit.remove(q40Var.f29799a);
        }
        edit.apply();
    }
}
