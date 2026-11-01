package th;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.dd;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.rz0;
public final class c1 {
    public final long f48836a;
    public final float f48837b;
    public final float f48838c;
    public final ci0 d;
    public final Paint e;
    public final ImageReceiver f48839f;
    public final rz0 f48840g;
    public boolean h;
    public final org.telegram.ui.Components.t5 f48841i;
    public final org.telegram.ui.Components.t5 f48842j;

    public c1(d1 d1Var, View view, int i10, long j10, int i11, boolean z10) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f48836a = j10;
        d5.a aVar = Utilities.f14521c;
        this.f48837b = Utilities.l(aVar.nextFloat());
        this.f48838c = Utilities.l(aVar.nextFloat());
        if (z10) {
            int[] iArr = d1Var.f48882f;
            ci0 ci0Var = new ci0(iArr[aVar.nextInt(iArr.length)], org.telegram.messenger.i0.L(70.0f), org.telegram.messenger.i0.L(70.0f));
            this.d = ci0Var;
            ci0Var.R(view);
            ci0Var.J(true);
            ci0Var.K(0);
            ci0Var.start();
        }
        TLObject d22 = wp.r1(i10).d2(j10);
        r8 r8Var = new r8((org.telegram.ui.ActionBar.p6) null);
        r8Var.l(d22);
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f48839f = imageReceiver;
        imageReceiver.y0(org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f));
        imageReceiver.J0(org.telegram.messenger.i0.L(7.0f));
        imageReceiver.i0(d22, r8Var, null);
        view.addOnAttachStateChangeListener(new l.d(this, 15));
        if (view.isAttachedToWindow()) {
            imageReceiver.P();
        }
        paint.setColor(-1135603);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("⭐️");
        dq dqVar = new dq(2131232745, 0);
        dqVar.G = 0.875f;
        spannableStringBuilder.setSpan(dqVar, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) dd.E(i11, ','));
        this.f48840g = new rz0(spannableStringBuilder, 10.0f, org.telegram.messenger.i0.o1("fonts/num.otf"));
        org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(view, 2000L, new LinearInterpolator());
        this.f48841i = t5Var;
        t5Var.e(true, 0.0f);
        t5Var.e(false, 1.0f);
        this.f48842j = new org.telegram.ui.Components.t5(view, 350L, 240L, gr.h);
    }
}
