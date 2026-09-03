package sh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.q70;
public final class x2 extends ClickableSpan {
    public final int f47814a;
    public final mh.y f47815b;
    public final d3 f47816c;

    public x2(d3 d3Var, int i10, mh.y yVar) {
        this.f47816c = d3Var;
        this.f47814a = i10;
        this.f47815b = yVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z4;
        boolean z10;
        q70 H = q70.H(this.f47816c, view);
        boolean z11 = true;
        int i10 = this.f47814a;
        if (i10 == 3) {
            z4 = true;
        } else {
            z4 = false;
        }
        String string = LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortDate);
        final mh.y yVar = this.f47815b;
        H.i(new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        mh.y yVar2 = yVar;
                        if (yVar2.f15075g != 3) {
                            yVar2.f15075g = 3;
                            yVar2.f15072c = 0;
                            yVar2.d = false;
                            yVar2.f15076i = false;
                            yVar2.f15074f = 0L;
                            yVar2.f15077j = null;
                            yVar2.h = false;
                            yVar2.a();
                            return;
                        }
                        return;
                    case 1:
                        mh.y yVar3 = yVar;
                        if (yVar3.f15075g != 2) {
                            yVar3.f15075g = 2;
                            yVar3.f15072c = 0;
                            yVar3.d = false;
                            yVar3.f15076i = false;
                            yVar3.f15074f = 0L;
                            yVar3.f15077j = null;
                            yVar3.h = false;
                            yVar3.a();
                            return;
                        }
                        return;
                    default:
                        mh.y yVar4 = yVar;
                        if (yVar4.f15075g != 1) {
                            yVar4.f15075g = 1;
                            yVar4.f15072c = 0;
                            yVar4.d = false;
                            yVar4.f15076i = false;
                            yVar4.f15074f = 0L;
                            yVar4.f15077j = null;
                            yVar4.h = false;
                            yVar4.a();
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
                        mh.y yVar2 = yVar;
                        if (yVar2.f15075g != 3) {
                            yVar2.f15075g = 3;
                            yVar2.f15072c = 0;
                            yVar2.d = false;
                            yVar2.f15076i = false;
                            yVar2.f15074f = 0L;
                            yVar2.f15077j = null;
                            yVar2.h = false;
                            yVar2.a();
                            return;
                        }
                        return;
                    case 1:
                        mh.y yVar3 = yVar;
                        if (yVar3.f15075g != 2) {
                            yVar3.f15075g = 2;
                            yVar3.f15072c = 0;
                            yVar3.d = false;
                            yVar3.f15076i = false;
                            yVar3.f15074f = 0L;
                            yVar3.f15077j = null;
                            yVar3.h = false;
                            yVar3.a();
                            return;
                        }
                        return;
                    default:
                        mh.y yVar4 = yVar;
                        if (yVar4.f15075g != 1) {
                            yVar4.f15075g = 1;
                            yVar4.f15072c = 0;
                            yVar4.d = false;
                            yVar4.f15076i = false;
                            yVar4.f15074f = 0L;
                            yVar4.f15077j = null;
                            yVar4.h = false;
                            yVar4.a();
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
                        mh.y yVar2 = yVar;
                        if (yVar2.f15075g != 3) {
                            yVar2.f15075g = 3;
                            yVar2.f15072c = 0;
                            yVar2.d = false;
                            yVar2.f15076i = false;
                            yVar2.f15074f = 0L;
                            yVar2.f15077j = null;
                            yVar2.h = false;
                            yVar2.a();
                            return;
                        }
                        return;
                    case 1:
                        mh.y yVar3 = yVar;
                        if (yVar3.f15075g != 2) {
                            yVar3.f15075g = 2;
                            yVar3.f15072c = 0;
                            yVar3.d = false;
                            yVar3.f15076i = false;
                            yVar3.f15074f = 0L;
                            yVar3.f15077j = null;
                            yVar3.h = false;
                            yVar3.a();
                            return;
                        }
                        return;
                    default:
                        mh.y yVar4 = yVar;
                        if (yVar4.f15075g != 1) {
                            yVar4.f15075g = 1;
                            yVar4.f15072c = 0;
                            yVar4.d = false;
                            yVar4.f15076i = false;
                            yVar4.f15074f = 0L;
                            yVar4.f15077j = null;
                            yVar4.h = false;
                            yVar4.a();
                            return;
                        }
                        return;
                }
            }
        }, LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortProfitability), z11);
        H.V(5);
        H.f30334t = false;
        H.f30333s = 0;
        H.a0(AndroidUtilities.dp(24.0f), -AndroidUtilities.dp(24.0f));
        H.Z();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(textPaint.linkColor);
    }
}
