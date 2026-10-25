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
public final class zj extends org.telegram.ui.Components.gb0 {
    public boolean V;
    public final un W;

    public zj(un unVar, Context context, long j10, long j11, un unVar2, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, j10, j11, unVar2, u6Var);
        this.W = unVar;
        this.V = true;
    }

    @Override
    public final boolean a() {
        un unVar = this.W;
        if (unVar.R.getVisibility() == 0 && !unVar.f44496z3) {
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
        this.W.Fc();
    }

    @Override
    public final void k(TLRPC.BotInlineResult botInlineResult) {
        un unVar = this.W;
        if (unVar.getParentActivity() != null && botInlineResult.content != null) {
            if (!botInlineResult.type.equals("video") && !botInlineResult.type.equals("web_player_video")) {
                unVar.Ga(0, botInlineResult.content.url, null, null, false);
                return;
            }
            int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
            ci ciVar = unVar.Va;
            String str = botInlineResult.title;
            if (str == null) {
                str = "";
            }
            String str2 = botInlineResult.description;
            String str3 = botInlineResult.content.url;
            org.telegram.ui.Components.dv.I(unVar, null, ciVar, str, str2, str3, str3, inlineResultWidthAndHeight[0], inlineResultWidthAndHeight[1], -1, unVar.F9());
        }
    }

    @Override
    public final void l(boolean z10) {
        String str;
        un unVar = this.W;
        hk hkVar = unVar.Y;
        if (hkVar != null) {
            ig.j1 adapter = getAdapter();
            TLRPC.User user = adapter.f14137w0;
            if (user != null) {
                str = user.bot_inline_placeholder;
            } else {
                String str2 = adapter.f14128q0;
                if (str2 != null && str2.equals("gif")) {
                    str = LocaleController.getString(R.string.SearchGifsTitle);
                } else {
                    str = null;
                }
            }
            hkVar.setCaption(str);
            org.telegram.ui.Components.we weVar = unVar.Y.P1;
            if (weVar != null) {
                if (z10) {
                    weVar.e = true;
                    weVar.f32281b = System.currentTimeMillis();
                    weVar.invalidateSelf();
                    return;
                }
                weVar.e = false;
            }
        }
    }

    @Override
    public final void m() {
        un unVar = this.W;
        if (unVar.f44319l5 && ((getAdapter().R == null || unVar.f44331m5 || unVar.f44345n5) && unVar.h != null && getAdapter().R != null)) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("secretbot", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(unVar.getParentActivity(), 0, unVar.f44385qa);
                alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.f22366a.T = LocaleController.getString(R.string.SecretChatContextBotAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                unVar.showDialog(alertDialog$Builder.f22366a);
                globalMainSettings.edit().putBoolean("secretbot", true).commit();
            }
        }
        unVar.Fc();
    }

    @Override
    public final void n(boolean z10) {
        boolean z11;
        if (this.V != z10) {
            un unVar = this.W;
            org.telegram.ui.Components.tz0 tz0Var = unVar.f44367p1;
            if (!unVar.isInPreviewMode() && z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            AndroidUtilities.updateViewShow(tz0Var, z11, false, true);
            this.V = z10;
        }
    }
}
