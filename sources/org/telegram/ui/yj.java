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
public final class yj extends org.telegram.ui.Components.hb0 {
    public boolean V;
    public final sn W;

    public yj(sn snVar, Context context, long j10, long j11, sn snVar2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, j10, j11, snVar2, g6Var);
        this.W = snVar;
        this.V = true;
    }

    @Override
    public final boolean a() {
        sn snVar = this.W;
        if (snVar.R.getVisibility() == 0 && !snVar.f41762z3) {
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
        this.W.zc();
    }

    @Override
    public final void k(TLRPC.BotInlineResult botInlineResult) {
        sn snVar = this.W;
        if (snVar.getParentActivity() != null && botInlineResult.content != null) {
            if (!botInlineResult.type.equals("video") && !botInlineResult.type.equals("web_player_video")) {
                snVar.Ba(0, botInlineResult.content.url, null, null, false);
                return;
            }
            int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
            bi biVar = snVar.Va;
            String str = botInlineResult.title;
            if (str == null) {
                str = "";
            }
            String str2 = botInlineResult.description;
            String str3 = botInlineResult.content.url;
            org.telegram.ui.Components.av.I(snVar, null, biVar, str, str2, str3, str3, inlineResultWidthAndHeight[0], inlineResultWidthAndHeight[1], -1, snVar.C9());
        }
    }

    @Override
    public final void l(boolean z10) {
        String str;
        sn snVar = this.W;
        gk gkVar = snVar.Y;
        if (gkVar != null) {
            hg.j1 adapter = getAdapter();
            TLRPC.User user = adapter.f11974w0;
            if (user != null) {
                str = user.bot_inline_placeholder;
            } else {
                String str2 = adapter.f11965q0;
                if (str2 != null && str2.equals("gif")) {
                    str = LocaleController.getString(R.string.SearchGifsTitle);
                } else {
                    str = null;
                }
            }
            gkVar.setCaption(str);
            org.telegram.ui.Components.ue ueVar = snVar.Y.P1;
            if (ueVar != null) {
                if (z10) {
                    ueVar.e = true;
                    ueVar.f28993b = System.currentTimeMillis();
                    ueVar.invalidateSelf();
                    return;
                }
                ueVar.e = false;
            }
        }
    }

    @Override
    public final void m() {
        sn snVar = this.W;
        if (snVar.f41586l5 && ((getAdapter().R == null || snVar.f41598m5 || snVar.f41612n5) && snVar.h != null && getAdapter().R != null)) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(snVar.getParentActivity(), 0, snVar.f41651qa);
                alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.SecretChatContextBotAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                snVar.showDialog(alertDialog$Builder.f20679a);
                globalMainSettings.edit().putBoolean("secretbot", true).commit();
            }
        }
        snVar.zc();
    }

    @Override
    public final void n(boolean z10) {
        boolean z11;
        if (this.V != z10) {
            sn snVar = this.W;
            org.telegram.ui.Components.kz0 kz0Var = snVar.f41632p1;
            if (!snVar.isInPreviewMode() && z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            AndroidUtilities.updateViewShow(kz0Var, z11, false, true);
            this.V = z10;
        }
    }
}
