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
public final class xj extends org.telegram.ui.Components.ib0 {
    public boolean V;
    public final qn W;

    public xj(qn qnVar, Context context, long j10, long j11, qn qnVar2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, j10, j11, qnVar2, d6Var);
        this.W = qnVar;
        this.V = true;
    }

    @Override
    public final boolean a() {
        qn qnVar = this.W;
        if (qnVar.R.getVisibility() == 0 && !qnVar.f40777n3) {
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
        this.W.xc();
    }

    @Override
    public final void k(TLRPC.BotInlineResult botInlineResult) {
        qn qnVar = this.W;
        if (qnVar.getParentActivity() != null && botInlineResult.content != null) {
            if (!botInlineResult.type.equals("video") && !botInlineResult.type.equals("web_player_video")) {
                qnVar.Ba(0, botInlineResult.content.url, null, null, false);
                return;
            }
            int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
            bi biVar = qnVar.Ja;
            String str = botInlineResult.title;
            if (str == null) {
                str = "";
            }
            String str2 = botInlineResult.description;
            String str3 = botInlineResult.content.url;
            org.telegram.ui.Components.cv.J(qnVar, null, biVar, str, str2, str3, str3, inlineResultWidthAndHeight[0], inlineResultWidthAndHeight[1], -1, qnVar.C9());
        }
    }

    @Override
    public final void l(boolean z10) {
        String str;
        qn qnVar = this.W;
        fk fkVar = qnVar.Y;
        if (fkVar != null) {
            hg.j1 adapter = getAdapter();
            TLRPC.User user = adapter.f11946w0;
            if (user != null) {
                str = user.bot_inline_placeholder;
            } else {
                String str2 = adapter.f11937q0;
                if (str2 != null && str2.equals("gif")) {
                    str = LocaleController.getString(R.string.SearchGifsTitle);
                } else {
                    str = null;
                }
            }
            fkVar.setCaption(str);
            org.telegram.ui.Components.we weVar = qnVar.Y.P1;
            if (weVar != null) {
                if (z10) {
                    weVar.e = true;
                    weVar.f29354b = System.currentTimeMillis();
                    weVar.invalidateSelf();
                    return;
                }
                weVar.e = false;
            }
        }
    }

    @Override
    public final void m() {
        qn qnVar = this.W;
        if (qnVar.Z4 && ((getAdapter().R == null || qnVar.f40616a5 || qnVar.f40630b5) && qnVar.h != null && getAdapter().R != null)) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar.getParentActivity(), 0, qnVar.f40673ea);
                alertDialog$Builder.f20605a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.f20605a.T = LocaleController.getString(R.string.SecretChatContextBotAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                qnVar.showDialog(alertDialog$Builder.f20605a);
                globalMainSettings.edit().putBoolean("secretbot", true).commit();
            }
        }
        qnVar.xc();
    }

    @Override
    public final void n(boolean z10) {
        boolean z11;
        if (this.V != z10) {
            qn qnVar = this.W;
            org.telegram.ui.Components.iz0 iz0Var = qnVar.f40653d1;
            if (!qnVar.isInPreviewMode() && z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            AndroidUtilities.updateViewShow(iz0Var, z11, false, true);
            this.V = z10;
        }
    }
}
