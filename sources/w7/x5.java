package w7;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.l40;
public abstract class x5 {
    public static void a() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        for (l40 l40Var : l40.values()) {
            edit.remove(l40Var.f25961a);
        }
        edit.apply();
    }
}
