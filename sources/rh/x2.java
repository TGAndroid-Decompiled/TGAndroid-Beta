package rh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.p70;
public final class x2 extends ClickableSpan {
    public final int f43910a;
    public final lh.z f43911b;
    public final d3 f43912c;

    public x2(d3 d3Var, int i10, lh.z zVar) {
        this.f43912c = d3Var;
        this.f43910a = i10;
        this.f43911b = zVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z4;
        boolean z10;
        p70 H = p70.H(this.f43912c, view);
        boolean z11 = true;
        int i10 = this.f43910a;
        if (i10 == 3) {
            z4 = true;
        } else {
            z4 = false;
        }
        String string = LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortDate);
        final lh.z zVar = this.f43911b;
        H.i(new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        lh.z zVar2 = zVar;
                        if (zVar2.f13404g != 3) {
                            zVar2.f13404g = 3;
                            zVar2.f13402c = 0;
                            zVar2.d = false;
                            zVar2.f13405i = false;
                            zVar2.f13403f = 0L;
                            zVar2.f13406j = null;
                            zVar2.h = false;
                            zVar2.a();
                            return;
                        }
                        return;
                    case 1:
                        lh.z zVar3 = zVar;
                        if (zVar3.f13404g != 2) {
                            zVar3.f13404g = 2;
                            zVar3.f13402c = 0;
                            zVar3.d = false;
                            zVar3.f13405i = false;
                            zVar3.f13403f = 0L;
                            zVar3.f13406j = null;
                            zVar3.h = false;
                            zVar3.a();
                            return;
                        }
                        return;
                    default:
                        lh.z zVar4 = zVar;
                        if (zVar4.f13404g != 1) {
                            zVar4.f13404g = 1;
                            zVar4.f13402c = 0;
                            zVar4.d = false;
                            zVar4.f13405i = false;
                            zVar4.f13403f = 0L;
                            zVar4.f13406j = null;
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
                        if (zVar2.f13404g != 3) {
                            zVar2.f13404g = 3;
                            zVar2.f13402c = 0;
                            zVar2.d = false;
                            zVar2.f13405i = false;
                            zVar2.f13403f = 0L;
                            zVar2.f13406j = null;
                            zVar2.h = false;
                            zVar2.a();
                            return;
                        }
                        return;
                    case 1:
                        lh.z zVar3 = zVar;
                        if (zVar3.f13404g != 2) {
                            zVar3.f13404g = 2;
                            zVar3.f13402c = 0;
                            zVar3.d = false;
                            zVar3.f13405i = false;
                            zVar3.f13403f = 0L;
                            zVar3.f13406j = null;
                            zVar3.h = false;
                            zVar3.a();
                            return;
                        }
                        return;
                    default:
                        lh.z zVar4 = zVar;
                        if (zVar4.f13404g != 1) {
                            zVar4.f13404g = 1;
                            zVar4.f13402c = 0;
                            zVar4.d = false;
                            zVar4.f13405i = false;
                            zVar4.f13403f = 0L;
                            zVar4.f13406j = null;
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
                        if (zVar2.f13404g != 3) {
                            zVar2.f13404g = 3;
                            zVar2.f13402c = 0;
                            zVar2.d = false;
                            zVar2.f13405i = false;
                            zVar2.f13403f = 0L;
                            zVar2.f13406j = null;
                            zVar2.h = false;
                            zVar2.a();
                            return;
                        }
                        return;
                    case 1:
                        lh.z zVar3 = zVar;
                        if (zVar3.f13404g != 2) {
                            zVar3.f13404g = 2;
                            zVar3.f13402c = 0;
                            zVar3.d = false;
                            zVar3.f13405i = false;
                            zVar3.f13403f = 0L;
                            zVar3.f13406j = null;
                            zVar3.h = false;
                            zVar3.a();
                            return;
                        }
                        return;
                    default:
                        lh.z zVar4 = zVar;
                        if (zVar4.f13404g != 1) {
                            zVar4.f13404g = 1;
                            zVar4.f13402c = 0;
                            zVar4.d = false;
                            zVar4.f13405i = false;
                            zVar4.f13403f = 0L;
                            zVar4.f13406j = null;
                            zVar4.h = false;
                            zVar4.a();
                            return;
                        }
                        return;
                }
            }
        }, LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortProfitability), z11);
        H.V(5);
        H.f27778t = false;
        H.f27777s = 0;
        H.a0(AndroidUtilities.dp(24.0f), -AndroidUtilities.dp(24.0f));
        H.Z();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(textPaint.linkColor);
    }
}
