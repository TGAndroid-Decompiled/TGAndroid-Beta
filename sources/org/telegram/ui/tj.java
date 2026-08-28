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
public final class tj extends org.telegram.ui.Components.w90 {
    public boolean R;
    public final qn S;

    public tj(qn qnVar, Context context, long j10, long j11, qn qnVar2, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, j10, j11, qnVar2, b6Var);
        this.S = qnVar;
        this.R = true;
    }

    @Override
    public final boolean a() {
        qn qnVar = this.S;
        if (qnVar.N.getVisibility() == 0 && !qnVar.f41957j3) {
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
        qn qnVar = this.S;
        if (qnVar.getParentActivity() != null && botInlineResult.content != null) {
            if (!botInlineResult.type.equals("video") && !botInlineResult.type.equals("web_player_video")) {
                qnVar.xa(0, botInlineResult.content.url, null, null, false);
                return;
            }
            int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
            pl plVar = qnVar.Ea;
            String str = botInlineResult.title;
            if (str == null) {
                str = "";
            }
            String str2 = botInlineResult.description;
            String str3 = botInlineResult.content.url;
            org.telegram.ui.Components.gu.I(qnVar, null, plVar, str, str2, str3, str3, inlineResultWidthAndHeight[0], inlineResultWidthAndHeight[1], -1, qnVar.x9());
        }
    }

    @Override
    public final void l(boolean z10) {
        String str;
        qn qnVar = this.S;
        ak akVar = qnVar.U;
        if (akVar != null) {
            of.f1 adapter = getAdapter();
            TLRPC.User user = adapter.f19343s0;
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
            akVar.setCaption(str);
            org.telegram.ui.Components.ne neVar = qnVar.U.K1;
            if (neVar != null) {
                if (z10) {
                    neVar.f33974e = true;
                    neVar.f33972b = System.currentTimeMillis();
                    neVar.invalidateSelf();
                    return;
                }
                neVar.f33974e = false;
            }
        }
    }

    @Override
    public final void m() {
        qn qnVar = this.S;
        if (qnVar.V4 && ((getAdapter().N == null || qnVar.W4 || qnVar.X4) && qnVar.h != null && getAdapter().N != null)) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar.getParentActivity(), 0, qnVar.f41848aa);
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.SecretChatContextBotAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                qnVar.showDialog(alertDialog$Builder.f22702a);
                globalMainSettings.edit().putBoolean("secretbot", true).commit();
            }
        }
        qnVar.sc();
    }

    @Override
    public final void n(boolean z10) {
        boolean z11;
        if (this.R != z10) {
            qn qnVar = this.S;
            org.telegram.ui.Components.ux0 ux0Var = qnVar.Z0;
            if (!qnVar.isInPreviewMode() && z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            AndroidUtilities.updateViewShow(ux0Var, z11, false, true);
            this.R = z10;
        }
    }
}
