package org.telegram.ui;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.tgnet.TLRPC;
public final class t90 implements Runnable {
    public final LaunchActivity f38423a;
    public final org.telegram.ui.ActionBar.p2 f38424b;
    public final int f38425c;
    public final TLRPC.User d;
    public final TLRPC.TL_messages_botApp e;
    public final AtomicBoolean f38426f;
    public final String h;
    public final boolean f38427n;
    public final boolean f38428r;
    public final boolean f38429s;
    public final boolean v;

    public t90(LaunchActivity launchActivity, org.telegram.ui.ActionBar.p2 p2Var, int i10, TLRPC.User user, TLRPC.TL_messages_botApp tL_messages_botApp, AtomicBoolean atomicBoolean, String str, boolean z4, boolean z10, boolean z11, boolean z12) {
        this.f38423a = launchActivity;
        this.f38424b = p2Var;
        this.f38425c = i10;
        this.d = user;
        this.e = tL_messages_botApp;
        this.f38426f = atomicBoolean;
        this.h = str;
        this.f38427n = z4;
        this.f38428r = z10;
        this.f38429s = z11;
        this.v = z12;
    }

    @Override
    public final void run() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        String formatString;
        Pattern pattern = LaunchActivity.f31586y1;
        org.telegram.ui.ActionBar.p2 p2Var = this.f38424b;
        if (p2Var != null && LaunchActivity.f31587z1) {
            LaunchActivity launchActivity = this.f38423a;
            if (!launchActivity.isFinishing() && !launchActivity.isDestroyed()) {
                TLRPC.User user = this.d;
                long j10 = user.f19306id;
                TLRPC.TL_messages_botApp tL_messages_botApp = this.e;
                TLRPC.BotApp botApp = tL_messages_botApp.app;
                boolean z4 = this.f38426f.get();
                int i10 = this.f38425c;
                String str = this.h;
                boolean z10 = this.f38427n;
                boolean z11 = this.f38428r;
                rh.y3 b10 = rh.y3.b(i10, j10, j10, null, null, 3, 0, 0L, botApp, z4, str, user, 0, z10, z11);
                if (launchActivity.P() == null || launchActivity.P().m(b10) == null) {
                    SharedPrefsHelper.setWebViewConfirmShown(launchActivity.L, user.f19306id, true);
                    rh.p2 p2Var2 = new rh.p2(launchActivity, p2Var.getResourceProvider());
                    rh.h2 h2Var = p2Var2.f43760x;
                    if (h2Var != null) {
                        h2Var.setWasOpenedByLinkIntent(this.f38429s);
                    }
                    p2Var2.w(!z10);
                    if (z11) {
                        p2Var2.x(true, false, p2Var2.f43733b0);
                    }
                    p2Var2.f43761x0 = false;
                    p2Var2.f43741h0 = launchActivity;
                    p2Var2.s(p2Var, b10);
                    p2Var2.show();
                    if (tL_messages_botApp.inactive || this.v) {
                        TLRPC.User user2 = MessagesController.getInstance(p2Var2.D).getUser(Long.valueOf(p2Var2.E));
                        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(p2Var2.D).getAttachMenuBots().bots;
                        int size = arrayList.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i11);
                                i11++;
                                tL_attachMenuBot = tL_attachMenuBot2;
                                if (tL_attachMenuBot.bot_id == p2Var2.E) {
                                    break;
                                }
                            } else {
                                tL_attachMenuBot = null;
                                break;
                            }
                        }
                        if (tL_attachMenuBot != null) {
                            boolean z12 = tL_attachMenuBot.show_in_side_menu;
                            if (z12 && tL_attachMenuBot.show_in_attach_menu) {
                                formatString = LocaleController.formatString(R.string.BotAttachMenuShortcatAddedAttachAndSide, user2.first_name);
                            } else if (z12) {
                                formatString = LocaleController.formatString(R.string.BotAttachMenuShortcatAddedSide, user2.first_name);
                            } else {
                                formatString = LocaleController.formatString(R.string.BotAttachMenuShortcatAddedAttach, user2.first_name);
                            }
                            AndroidUtilities.runOnUIThread(new ph.e6(15, p2Var2, formatString), 200L);
                        }
                    }
                }
            }
        }
    }
}
