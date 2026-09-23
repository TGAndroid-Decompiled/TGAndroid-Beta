package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class w90 implements Runnable {
    public final int f38564a;
    public final xn f38565b;
    public final long f38566c;
    public final TLRPC.Chat d;

    public w90(xn xnVar, long j3, TLRPC.Chat chat, int i10) {
        this.f38564a = i10;
        this.f38565b = xnVar;
        this.f38566c = j3;
        this.d = chat;
    }

    @Override
    public final void run() {
        int i10 = this.f38564a;
        TLRPC.Chat chat = this.d;
        long j3 = this.f38566c;
        xn xnVar = this.f38565b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                org.telegram.ui.Components.xc.a0(xnVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j3, chat.title)), R.raw.stars_send).k(true);
                return;
            default:
                org.telegram.ui.Components.xc.a0(xnVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j3, chat.title)), R.raw.stars_send).k(true);
                return;
        }
    }
}
