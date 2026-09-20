package w7;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
public abstract class a6 {
    public static boolean a() {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.contains("round_video_composition")) {
            return globalMainSettings.getBoolean("round_video_composition", true);
        }
        if (globalMainSettings.getBoolean("round_video_outside_effect", true) && globalMainSettings.getBoolean("round_video_watermark", true)) {
            return true;
        }
        return false;
    }

    public static void b(String str, Enum r22) {
        MessagesController.getGlobalMainSettings().edit().putString(str, r22.name()).apply();
    }

    public static Enum c(String str, Enum r32, Class cls) {
        try {
            return Enum.valueOf(cls, MessagesController.getGlobalMainSettings().getString(str, r32.name()));
        } catch (IllegalArgumentException | NullPointerException unused) {
            return r32;
        }
    }
}
