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
public final class r90 implements Runnable {
    public final LaunchActivity f37947a;
    public final org.telegram.ui.ActionBar.p2 f37948b;
    public final int f37949c;
    public final TLRPC.User d;
    public final TLRPC.TL_messages_botApp e;
    public final AtomicBoolean f37950f;
    public final String h;
    public final boolean f37951n;
    public final boolean f37952r;
    public final boolean f37953s;
    public final boolean v;

    public r90(LaunchActivity launchActivity, org.telegram.ui.ActionBar.p2 p2Var, int i10, TLRPC.User user, TLRPC.TL_messages_botApp tL_messages_botApp, AtomicBoolean atomicBoolean, String str, boolean z4, boolean z10, boolean z11, boolean z12) {
        this.f37947a = launchActivity;
        this.f37948b = p2Var;
        this.f37949c = i10;
        this.d = user;
        this.e = tL_messages_botApp;
        this.f37950f = atomicBoolean;
        this.h = str;
        this.f37951n = z4;
        this.f37952r = z10;
        this.f37953s = z11;
        this.v = z12;
    }

    @Override
    public final void run() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        String formatString;
        Pattern pattern = LaunchActivity.f31612y1;
        org.telegram.ui.ActionBar.p2 p2Var = this.f37948b;
        if (p2Var != null && LaunchActivity.f31613z1) {
            LaunchActivity launchActivity = this.f37947a;
            if (!launchActivity.isFinishing() && !launchActivity.isDestroyed()) {
                TLRPC.User user = this.d;
                long j10 = user.f19331id;
                TLRPC.TL_messages_botApp tL_messages_botApp = this.e;
                TLRPC.BotApp botApp = tL_messages_botApp.app;
                boolean z4 = this.f37950f.get();
                int i10 = this.f37949c;
                String str = this.h;
                boolean z10 = this.f37951n;
                boolean z11 = this.f37952r;
                rh.z3 b10 = rh.z3.b(i10, j10, j10, null, null, 3, 0, 0L, botApp, z4, str, user, 0, z10, z11);
                if (launchActivity.P() == null || launchActivity.P().m(b10) == null) {
                    SharedPrefsHelper.setWebViewConfirmShown(launchActivity.L, user.f19331id, true);
                    rh.q2 q2Var = new rh.q2(launchActivity, p2Var.getResourceProvider());
                    rh.i2 i2Var = q2Var.f43708x;
                    if (i2Var != null) {
                        i2Var.setWasOpenedByLinkIntent(this.f37953s);
                    }
                    q2Var.w(!z10);
                    if (z11) {
                        q2Var.x(true, false, q2Var.f43681b0);
                    }
                    q2Var.f43709x0 = false;
                    q2Var.f43689h0 = launchActivity;
                    q2Var.s(p2Var, b10);
                    q2Var.show();
                    if (tL_messages_botApp.inactive || this.v) {
                        TLRPC.User user2 = MessagesController.getInstance(q2Var.D).getUser(Long.valueOf(q2Var.E));
                        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(q2Var.D).getAttachMenuBots().bots;
                        int size = arrayList.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i11);
                                i11++;
                                tL_attachMenuBot = tL_attachMenuBot2;
                                if (tL_attachMenuBot.bot_id == q2Var.E) {
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
                            AndroidUtilities.runOnUIThread(new ph.f6(13, q2Var, formatString), 200L);
                        }
                    }
                }
            }
        }
    }
}
