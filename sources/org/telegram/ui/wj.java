package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wj extends org.telegram.ui.Components.ka0 {
    public boolean R;
    public final tn S;

    public wj(tn tnVar, Context context, long j10, long j11, tn tnVar2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, j10, j11, tnVar2, c6Var);
        this.S = tnVar;
        this.R = true;
    }

    @Override
    public final boolean a() {
        tn tnVar = this.S;
        if (tnVar.N.getVisibility() == 0 && !tnVar.f42854j3) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() <= 0.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void j() {
        this.S.sc();
    }

    @Override
    public final void k(TLRPC.BotInlineResult botInlineResult) {
        tn tnVar = this.S;
        if (tnVar.getParentActivity() != null && botInlineResult.content != null) {
            if (!botInlineResult.type.equals("video") && !botInlineResult.type.equals("web_player_video")) {
                tnVar.xa(0, botInlineResult.content.url, null, null, false);
                return;
            }
            int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
            sl slVar = tnVar.Ea;
            String str = botInlineResult.title;
            if (str == null) {
                str = "";
            }
            String str2 = botInlineResult.description;
            String str3 = botInlineResult.content.url;
            org.telegram.ui.Components.mu.I(tnVar, null, slVar, str, str2, str3, str3, inlineResultWidthAndHeight[0], inlineResultWidthAndHeight[1], -1, tnVar.x9());
        }
    }

    @Override
    public final void l(boolean z10) {
        String str;
        tn tnVar = this.S;
        dk dkVar = tnVar.U;
        if (dkVar != null) {
            rf.v0 adapter = getAdapter();
            TLRPC.User user = adapter.f47385s0;
            if (user != null) {
                str = user.bot_inline_placeholder;
            } else {
                String str2 = adapter.m0;
                if (str2 != null && str2.equals("gif")) {
                    str = LocaleController.getString(R.string.SearchGifsTitle);
                } else {
                    str = null;
                }
            }
            dkVar.setCaption(str);
            org.telegram.ui.Components.qe qeVar = tnVar.U.K1;
            if (qeVar != null) {
                if (z10) {
                    qeVar.f35386e = true;
                    qeVar.f35384b = System.currentTimeMillis();
                    qeVar.invalidateSelf();
                    return;
                }
                qeVar.f35386e = false;
            }
        }
    }

    @Override
    public final void m() {
        tn tnVar = this.S;
        if (tnVar.V4 && ((getAdapter().N == null || tnVar.W4 || tnVar.X4) && tnVar.h != null && getAdapter().N != null)) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tnVar.getParentActivity(), 0, tnVar.f42746aa);
                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.SecretChatContextBotAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                tnVar.showDialog(alertDialog$Builder.f22714a);
                globalMainSettings.edit().putBoolean("secretbot", true).commit();
            }
        }
        tnVar.sc();
    }

    @Override
    public final void n(boolean z10) {
        boolean z11;
        if (this.R != z10) {
            tn tnVar = this.S;
            org.telegram.ui.Components.fy0 fy0Var = tnVar.Z0;
            if (!tnVar.isInPreviewMode() && z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            AndroidUtilities.updateViewShow(fy0Var, z11, false, true);
            this.R = z10;
        }
    }
}
