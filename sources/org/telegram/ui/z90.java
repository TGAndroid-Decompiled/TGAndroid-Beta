package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class z90 implements Runnable {
    public final int f40098a;
    public final bo f40099b;
    public final long f40100c;
    public final TLRPC.Chat d;

    public z90(bo boVar, long j3, TLRPC.Chat chat, int i10) {
        this.f40098a = i10;
        this.f40099b = boVar;
        this.f40100c = j3;
        this.d = chat;
    }

    @Override
    public final void run() {
        int i10 = this.f40098a;
        TLRPC.Chat chat = this.d;
        long j3 = this.f40100c;
        bo boVar = this.f40099b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                org.telegram.ui.Components.vc.a0(boVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j3, chat.title)), R.raw.stars_send).k(true);
                return;
            default:
                org.telegram.ui.Components.vc.a0(boVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j3, chat.title)), R.raw.stars_send).k(true);
                return;
        }
    }
}
