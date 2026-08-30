package rh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.o70;
public final class y2 extends ClickableSpan {
    public final int f43858a;
    public final lh.z f43859b;
    public final e3 f43860c;

    public y2(e3 e3Var, int i10, lh.z zVar) {
        this.f43860c = e3Var;
        this.f43858a = i10;
        this.f43859b = zVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z4;
        boolean z10;
        o70 H = o70.H(this.f43860c, view);
        boolean z11 = true;
        int i10 = this.f43858a;
        if (i10 == 3) {
            z4 = true;
        } else {
            z4 = false;
        }
        String string = LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortDate);
        final lh.z zVar = this.f43859b;
        H.i(new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        lh.z zVar2 = zVar;
                        if (zVar2.f13420g != 3) {
                            zVar2.f13420g = 3;
                            zVar2.f13418c = 0;
                            zVar2.d = false;
                            zVar2.f13421i = false;
                            zVar2.f13419f = 0L;
                            zVar2.f13422j = null;
                            zVar2.h = false;
                            zVar2.a();
                            return;
                        }
                        return;
                    case 1:
                        lh.z zVar3 = zVar;
                        if (zVar3.f13420g != 2) {
                            zVar3.f13420g = 2;
                            zVar3.f13418c = 0;
                            zVar3.d = false;
                            zVar3.f13421i = false;
                            zVar3.f13419f = 0L;
                            zVar3.f13422j = null;
                            zVar3.h = false;
                            zVar3.a();
                            return;
                        }
                        return;
                    default:
                        lh.z zVar4 = zVar;
                        if (zVar4.f13420g != 1) {
                            zVar4.f13420g = 1;
                            zVar4.f13418c = 0;
                            zVar4.d = false;
                            zVar4.f13421i = false;
                            zVar4.f13419f = 0L;
                            zVar4.f13422j = null;
                            zVar4.h = false;
                            zVar4.a();
                            return;
                        }
                        return;
                }
            }
        }, string, z4);
        if (i10 == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        H.i(new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        lh.z zVar2 = zVar;
                        if (zVar2.f13420g != 3) {
                            zVar2.f13420g = 3;
                            zVar2.f13418c = 0;
                            zVar2.d = false;
                            zVar2.f13421i = false;
                            zVar2.f13419f = 0L;
                            zVar2.f13422j = null;
                            zVar2.h = false;
                            zVar2.a();
                            return;
                        }
                        return;
                    case 1:
                        lh.z zVar3 = zVar;
                        if (zVar3.f13420g != 2) {
                            zVar3.f13420g = 2;
                            zVar3.f13418c = 0;
                            zVar3.d = false;
                            zVar3.f13421i = false;
                            zVar3.f13419f = 0L;
                            zVar3.f13422j = null;
                            zVar3.h = false;
                            zVar3.a();
                            return;
                        }
                        return;
                    default:
                        lh.z zVar4 = zVar;
                        if (zVar4.f13420g != 1) {
                            zVar4.f13420g = 1;
                            zVar4.f13418c = 0;
                            zVar4.d = false;
                            zVar4.f13421i = false;
                            zVar4.f13419f = 0L;
                            zVar4.f13422j = null;
                            zVar4.h = false;
                            zVar4.a();
                            return;
                        }
                        return;
                }
            }
        }, LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortRevenue), z10);
        if (i10 != 1) {
            z11 = false;
        }
        H.i(new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        lh.z zVar2 = zVar;
                        if (zVar2.f13420g != 3) {
                            zVar2.f13420g = 3;
                            zVar2.f13418c = 0;
                            zVar2.d = false;
                            zVar2.f13421i = false;
                            zVar2.f13419f = 0L;
                            zVar2.f13422j = null;
                            zVar2.h = false;
                            zVar2.a();
                            return;
                        }
                        return;
                    case 1:
                        lh.z zVar3 = zVar;
                        if (zVar3.f13420g != 2) {
                            zVar3.f13420g = 2;
                            zVar3.f13418c = 0;
                            zVar3.d = false;
                            zVar3.f13421i = false;
                            zVar3.f13419f = 0L;
                            zVar3.f13422j = null;
                            zVar3.h = false;
                            zVar3.a();
                            return;
                        }
                        return;
                    default:
                        lh.z zVar4 = zVar;
                        if (zVar4.f13420g != 1) {
                            zVar4.f13420g = 1;
                            zVar4.f13418c = 0;
                            zVar4.d = false;
                            zVar4.f13421i = false;
                            zVar4.f13419f = 0L;
                            zVar4.f13422j = null;
                            zVar4.h = false;
                            zVar4.a();
                            return;
                        }
                        return;
                }
            }
        }, LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortProfitability), z11);
        H.V(5);
        H.f27490t = false;
        H.f27489s = 0;
        H.a0(AndroidUtilities.dp(24.0f), -AndroidUtilities.dp(24.0f));
        H.Z();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(textPaint.linkColor);
    }
}
