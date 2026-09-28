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
public final class w90 implements Runnable {
    public final LaunchActivity f38938a;
    public final org.telegram.ui.ActionBar.m2 f38939b;
    public final int f38940c;
    public final TLRPC.User d;
    public final TLRPC.TL_messages_botApp e;
    public final AtomicBoolean f38941f;
    public final String h;
    public final boolean f38942n;
    public final boolean f38943r;
    public final boolean f38944s;
    public final boolean v;

    public w90(LaunchActivity launchActivity, org.telegram.ui.ActionBar.m2 m2Var, int i10, TLRPC.User user, TLRPC.TL_messages_botApp tL_messages_botApp, AtomicBoolean atomicBoolean, String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f38938a = launchActivity;
        this.f38939b = m2Var;
        this.f38940c = i10;
        this.d = user;
        this.e = tL_messages_botApp;
        this.f38941f = atomicBoolean;
        this.h = str;
        this.f38942n = z10;
        this.f38943r = z11;
        this.f38944s = z12;
        this.v = z13;
    }

    @Override
    public final void run() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        String formatString;
        Pattern pattern = LaunchActivity.B1;
        org.telegram.ui.ActionBar.m2 m2Var = this.f38939b;
        if (m2Var != null && LaunchActivity.C1) {
            LaunchActivity launchActivity = this.f38938a;
            if (!launchActivity.isFinishing() && !launchActivity.isDestroyed()) {
                TLRPC.User user = this.d;
                long j3 = user.f18483id;
                TLRPC.TL_messages_botApp tL_messages_botApp = this.e;
                TLRPC.BotApp botApp = tL_messages_botApp.app;
                boolean z10 = this.f38941f.get();
                int i10 = this.f38940c;
                String str = this.h;
                boolean z11 = this.f38942n;
                boolean z12 = this.f38943r;
                ei.f5 b10 = ei.f5.b(i10, j3, j3, null, null, 3, 0, 0L, botApp, z10, str, user, 0, z11, z12);
                if (launchActivity.P() == null || launchActivity.P().k(b10) == null) {
                    SharedPrefsHelper.setWebViewConfirmShown(launchActivity.O, user.f18483id, true);
                    ei.k3 k3Var = new ei.k3(launchActivity, m2Var.getResourceProvider());
                    ei.b3 b3Var = k3Var.f8438x;
                    if (b3Var != null) {
                        b3Var.setWasOpenedByLinkIntent(this.f38944s);
                    }
                    k3Var.w(!z11);
                    if (z12) {
                        k3Var.x(true, false, k3Var.f8415e0);
                    }
                    k3Var.A0 = false;
                    k3Var.f8422k0 = launchActivity;
                    k3Var.s(m2Var, b10);
                    k3Var.show();
                    if (tL_messages_botApp.inactive || this.v) {
                        TLRPC.User user2 = MessagesController.getInstance(k3Var.G).getUser(Long.valueOf(k3Var.H));
                        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(k3Var.G).getAttachMenuBots().bots;
                        int size = arrayList.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i11);
                                i11++;
                                tL_attachMenuBot = tL_attachMenuBot2;
                                if (tL_attachMenuBot.bot_id == k3Var.H) {
                                    break;
                                }
                            } else {
                                tL_attachMenuBot = null;
                                break;
                            }
                        }
                        if (tL_attachMenuBot != null) {
                            boolean z13 = tL_attachMenuBot.show_in_side_menu;
                            if (z13 && tL_attachMenuBot.show_in_attach_menu) {
                                formatString = LocaleController.formatString(R.string.BotAttachMenuShortcatAddedAttachAndSide, user2.first_name);
                            } else if (z13) {
                                formatString = LocaleController.formatString(R.string.BotAttachMenuShortcatAddedSide, user2.first_name);
                            } else {
                                formatString = LocaleController.formatString(R.string.BotAttachMenuShortcatAddedAttach, user2.first_name);
                            }
                            AndroidUtilities.runOnUIThread(new ci.y8(18, k3Var, formatString), 200L);
                        }
                    }
                }
            }
        }
    }
}
