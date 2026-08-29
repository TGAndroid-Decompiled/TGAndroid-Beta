package ph;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.j70;
public final class x2 extends ClickableSpan {
    public final int f46153a;
    public final jh.z f46154b;
    public final d3 f46155c;

    public x2(d3 d3Var, int i10, jh.z zVar) {
        this.f46155c = d3Var;
        this.f46153a = i10;
        this.f46154b = zVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        j70 H = j70.H(this.f46155c, view);
        boolean z12 = true;
        int i10 = this.f46153a;
        if (i10 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        String string = LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortDate);
        final jh.z zVar = this.f46154b;
        H.i(new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        jh.z zVar2 = zVar;
                        if (zVar2.f13148g != 3) {
                            zVar2.f13148g = 3;
                            zVar2.f13145c = 0;
                            zVar2.d = false;
                            zVar2.f13149i = false;
                            zVar2.f13147f = 0L;
                            zVar2.f13150j = null;
                            zVar2.h = false;
                            zVar2.a();
                            return;
                        }
                        return;
                    case 1:
                        jh.z zVar3 = zVar;
                        if (zVar3.f13148g != 2) {
                            zVar3.f13148g = 2;
                            zVar3.f13145c = 0;
                            zVar3.d = false;
                            zVar3.f13149i = false;
                            zVar3.f13147f = 0L;
                            zVar3.f13150j = null;
                            zVar3.h = false;
                            zVar3.a();
                            return;
                        }
                        return;
                    default:
                        jh.z zVar4 = zVar;
                        if (zVar4.f13148g != 1) {
                            zVar4.f13148g = 1;
                            zVar4.f13145c = 0;
                            zVar4.d = false;
                            zVar4.f13149i = false;
                            zVar4.f13147f = 0L;
                            zVar4.f13150j = null;
                            zVar4.h = false;
                            zVar4.a();
                            return;
                        }
                        return;
                }
            }
        }, string, z10);
        if (i10 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        H.i(new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        jh.z zVar2 = zVar;
                        if (zVar2.f13148g != 3) {
                            zVar2.f13148g = 3;
                            zVar2.f13145c = 0;
                            zVar2.d = false;
                            zVar2.f13149i = false;
                            zVar2.f13147f = 0L;
                            zVar2.f13150j = null;
                            zVar2.h = false;
                            zVar2.a();
                            return;
                        }
                        return;
                    case 1:
                        jh.z zVar3 = zVar;
                        if (zVar3.f13148g != 2) {
                            zVar3.f13148g = 2;
                            zVar3.f13145c = 0;
                            zVar3.d = false;
                            zVar3.f13149i = false;
                            zVar3.f13147f = 0L;
                            zVar3.f13150j = null;
                            zVar3.h = false;
                            zVar3.a();
                            return;
                        }
                        return;
                    default:
                        jh.z zVar4 = zVar;
                        if (zVar4.f13148g != 1) {
                            zVar4.f13148g = 1;
                            zVar4.f13145c = 0;
                            zVar4.d = false;
                            zVar4.f13149i = false;
                            zVar4.f13147f = 0L;
                            zVar4.f13150j = null;
                            zVar4.h = false;
                            zVar4.a();
                            return;
                        }
                        return;
                }
            }
        }, LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortRevenue), z11);
        if (i10 != 1) {
            z12 = false;
        }
        H.i(new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        jh.z zVar2 = zVar;
                        if (zVar2.f13148g != 3) {
                            zVar2.f13148g = 3;
                            zVar2.f13145c = 0;
                            zVar2.d = false;
                            zVar2.f13149i = false;
                            zVar2.f13147f = 0L;
                            zVar2.f13150j = null;
                            zVar2.h = false;
                            zVar2.a();
                            return;
                        }
                        return;
                    case 1:
                        jh.z zVar3 = zVar;
                        if (zVar3.f13148g != 2) {
                            zVar3.f13148g = 2;
                            zVar3.f13145c = 0;
                            zVar3.d = false;
                            zVar3.f13149i = false;
                            zVar3.f13147f = 0L;
                            zVar3.f13150j = null;
                            zVar3.h = false;
                            zVar3.a();
                            return;
                        }
                        return;
                    default:
                        jh.z zVar4 = zVar;
                        if (zVar4.f13148g != 1) {
                            zVar4.f13148g = 1;
                            zVar4.f13145c = 0;
                            zVar4.d = false;
                            zVar4.f13149i = false;
                            zVar4.f13147f = 0L;
                            zVar4.f13150j = null;
                            zVar4.h = false;
                            zVar4.a();
                            return;
                        }
                        return;
                }
            }
        }, LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortProfitability), z12);
        H.V(5);
        H.f29601t = false;
        H.f29600s = 0;
        H.a0(AndroidUtilities.dp(24.0f), -AndroidUtilities.dp(24.0f));
        H.Z();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(textPaint.linkColor);
    }
}
