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

public final class vj extends org.telegram.ui.Components.aa0 {
    public boolean R;
    public final rn S;

    public vj(rn rnVar, Context context, long j10, long j11, rn rnVar2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, j10, j11, rnVar2, c6Var);
        this.S = rnVar;
        this.R = true;
    }

    @Override
    public final boolean a() {
        rn rnVar = this.S;
        return rnVar.N.getVisibility() != 0 || rnVar.f42093j3;
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
        rn rnVar = this.S;
        if (rnVar.getParentActivity() == null || botInlineResult.content == null) {
            return;
        }
        if (!botInlineResult.type.equals("video") && !botInlineResult.type.equals("web_player_video")) {
            rnVar.xa(0, botInlineResult.content.url, null, null, false);
            return;
        }
        int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
        rl rlVar = rnVar.Ea;
        String str = botInlineResult.title;
        if (str == null) {
            str = "";
        }
        String str2 = botInlineResult.description;
        String str3 = botInlineResult.content.url;
        org.telegram.ui.Components.fu.J(rnVar, null, rlVar, str, str2, str3, str3, inlineResultWidthAndHeight[0], inlineResultWidthAndHeight[1], -1, rnVar.x9());
    }

    @Override
    public final void l(boolean z10) {
        String string;
        rn rnVar = this.S;
        ck ckVar = rnVar.U;
        if (ckVar != null) {
            pf.u0 adapter = getAdapter();
            TLRPC.User user = adapter.f45944s0;
            if (user != null) {
                string = user.bot_inline_placeholder;
            } else {
                String str = adapter.m0;
                string = (str == null || !str.equals("gif")) ? null : LocaleController.getString(R.string.SearchGifsTitle);
            }
            ckVar.setCaption(string);
            org.telegram.ui.Components.je jeVar = rnVar.U.K1;
            if (jeVar == null) {
                return;
            }
            if (!z10) {
                jeVar.f32851e = false;
                return;
            }
            jeVar.f32851e = true;
            jeVar.f32849b = System.currentTimeMillis();
            jeVar.invalidateSelf();
        }
    }

    @Override
    public final void m() {
        rn rnVar = this.S;
        if (rnVar.V4 && ((getAdapter().N == null || rnVar.W4 || rnVar.X4) && rnVar.h != null && getAdapter().N != null)) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rnVar.getParentActivity(), 0, rnVar.f41983aa);
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.SecretChatContextBotAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                rnVar.showDialog(alertDialog$Builder.f22702a);
                globalMainSettings.edit().putBoolean("secretbot", true).commit();
            }
        }
        rnVar.sc();
    }

    @Override
    public final void n(boolean z10) {
        if (this.R != z10) {
            rn rnVar = this.S;
            AndroidUtilities.updateViewShow(rnVar.Z0, !rnVar.isInPreviewMode() && z10, false, true);
            this.R = z10;
        }
    }
}
