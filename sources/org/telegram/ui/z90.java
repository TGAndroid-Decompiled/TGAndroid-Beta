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
public final class z90 implements Runnable {
    public final LaunchActivity f44613a;
    public final org.telegram.ui.ActionBar.m2 f44614b;
    public final int f44615c;
    public final TLRPC.User d;
    public final TLRPC.TL_messages_botApp f44616e;
    public final AtomicBoolean f44617f;
    public final String h;
    public final boolean f44618n;
    public final boolean f44619r;
    public final boolean f44620s;
    public final boolean v;

    public z90(LaunchActivity launchActivity, org.telegram.ui.ActionBar.m2 m2Var, int i10, TLRPC.User user, TLRPC.TL_messages_botApp tL_messages_botApp, AtomicBoolean atomicBoolean, String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f44613a = launchActivity;
        this.f44614b = m2Var;
        this.f44615c = i10;
        this.d = user;
        this.f44616e = tL_messages_botApp;
        this.f44617f = atomicBoolean;
        this.h = str;
        this.f44618n = z10;
        this.f44619r = z11;
        this.f44620s = z12;
        this.v = z13;
    }

    @Override
    public final void run() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        String formatString;
        Pattern pattern = LaunchActivity.B1;
        org.telegram.ui.ActionBar.m2 m2Var = this.f44614b;
        if (m2Var != null && LaunchActivity.C1) {
            LaunchActivity launchActivity = this.f44613a;
            if (!launchActivity.isFinishing() && !launchActivity.isDestroyed()) {
                TLRPC.User user = this.d;
                long j3 = user.f20179id;
                TLRPC.TL_messages_botApp tL_messages_botApp = this.f44616e;
                TLRPC.BotApp botApp = tL_messages_botApp.app;
                boolean z10 = this.f44617f.get();
                int i10 = this.f44615c;
                String str = this.h;
                boolean z11 = this.f44618n;
                boolean z12 = this.f44619r;
                ei.e5 b10 = ei.e5.b(i10, j3, j3, null, null, 3, 0, 0L, botApp, z10, str, user, 0, z11, z12);
                if (launchActivity.P() == null || launchActivity.P().k(b10) == null) {
                    SharedPrefsHelper.setWebViewConfirmShown(launchActivity.O, user.f20179id, true);
                    ei.k3 k3Var = new ei.k3(launchActivity, m2Var.getResourceProvider());
                    ei.b3 b3Var = k3Var.f9182x;
                    if (b3Var != null) {
                        b3Var.setWasOpenedByLinkIntent(this.f44620s);
                    }
                    k3Var.x(!z11);
                    if (z12) {
                        k3Var.y(true, false, k3Var.f9159e0);
                    }
                    k3Var.A0 = false;
                    k3Var.f9166k0 = launchActivity;
                    k3Var.t(m2Var, b10);
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
