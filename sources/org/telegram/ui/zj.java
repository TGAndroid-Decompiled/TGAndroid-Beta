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
public final class zj extends org.telegram.ui.Components.ib0 {
    public boolean V;
    public final sn W;

    public zj(sn snVar, Context context, long j10, long j11, sn snVar2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, j10, j11, snVar2, d6Var);
        this.W = snVar;
        this.V = true;
    }

    @Override
    public final boolean a() {
        sn snVar = this.W;
        if (snVar.R.getVisibility() == 0 && !snVar.f41295n3) {
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
        this.W.wc();
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
            di diVar = snVar.Ja;
            String str = botInlineResult.title;
            if (str == null) {
                str = "";
            }
            String str2 = botInlineResult.description;
            String str3 = botInlineResult.content.url;
            org.telegram.ui.Components.cv.J(snVar, null, diVar, str, str2, str3, str3, inlineResultWidthAndHeight[0], inlineResultWidthAndHeight[1], -1, snVar.C9());
        }
    }

    @Override
    public final void l(boolean z10) {
        String str;
        sn snVar = this.W;
        hk hkVar = snVar.Y;
        if (hkVar != null) {
            hg.j1 adapter = getAdapter();
            TLRPC.User user = adapter.f11947w0;
            if (user != null) {
                str = user.bot_inline_placeholder;
            } else {
                String str2 = adapter.f11938q0;
                if (str2 != null && str2.equals("gif")) {
                    str = LocaleController.getString(R.string.SearchGifsTitle);
                } else {
                    str = null;
                }
            }
            hkVar.setCaption(str);
            org.telegram.ui.Components.we weVar = snVar.Y.P1;
            if (weVar != null) {
                if (z10) {
                    weVar.e = true;
                    weVar.f29394b = System.currentTimeMillis();
                    weVar.invalidateSelf();
                    return;
                }
                weVar.e = false;
            }
        }
    }

    @Override
    public final void m() {
        sn snVar = this.W;
        if (snVar.Z4 && ((getAdapter().R == null || snVar.f41134a5 || snVar.f41148b5) && snVar.h != null && getAdapter().R != null)) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(snVar.getParentActivity(), 0, snVar.f41191ea);
                alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.SecretChatContextBotAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                snVar.showDialog(alertDialog$Builder.f20601a);
                globalMainSettings.edit().putBoolean("secretbot", true).commit();
            }
        }
        snVar.wc();
    }

    @Override
    public final void n(boolean z10) {
        boolean z11;
        if (this.V != z10) {
            sn snVar = this.W;
            org.telegram.ui.Components.gz0 gz0Var = snVar.f41171d1;
            if (!snVar.isInPreviewMode() && z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            AndroidUtilities.updateViewShow(gz0Var, z11, false, true);
            this.V = z10;
        }
    }
}
