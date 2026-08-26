package org.telegram.ui.web;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;

public final class WebInstantView$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final boolean[] f$0;

    public WebInstantView$$ExternalSyntheticLambda1(int i, boolean[] zArr) {
        this.$r8$classId = i;
        this.f$0 = zArr;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0[0] = true;
                break;
            default:
                boolean[] zArr = this.f$0;
                if (!zArr[0]) {
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    globalMainSettings.edit().putInt("showchattagsinfo", globalMainSettings.getInt("showchattagsinfo", 3) - 1).apply();
                    zArr[0] = true;
                }
                break;
        }
    }
}
