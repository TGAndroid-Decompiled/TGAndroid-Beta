package th;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.r8;
public final class c1 {
    public final long f48822a;
    public final float f48823b;
    public final float f48824c;
    public final bi0 d;
    public final Paint e;
    public final ImageReceiver f48825f;
    public final qz0 f48826g;
    public boolean h;
    public final org.telegram.ui.Components.t5 f48827i;
    public final org.telegram.ui.Components.t5 f48828j;

    public c1(d1 d1Var, View view, int i10, long j10, int i11, boolean z10) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f48822a = j10;
        d5.a aVar = Utilities.f14520c;
        this.f48823b = Utilities.l(aVar.nextFloat());
        this.f48824c = Utilities.l(aVar.nextFloat());
        if (z10) {
            int[] iArr = d1Var.f48868f;
            bi0 bi0Var = new bi0(iArr[aVar.nextInt(iArr.length)], org.telegram.messenger.i0.L(70.0f), org.telegram.messenger.i0.L(70.0f));
            this.d = bi0Var;
            bi0Var.R(view);
            bi0Var.J(true);
            bi0Var.K(0);
            bi0Var.start();
        }
        TLObject d22 = vp.r1(i10).d2(j10);
        r8 r8Var = new r8((org.telegram.ui.ActionBar.p6) null);
        r8Var.l(d22);
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f48825f = imageReceiver;
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
        spannableStringBuilder.append((CharSequence) cd.E(i11, ','));
        this.f48826g = new qz0(spannableStringBuilder, 10.0f, org.telegram.messenger.i0.o1("fonts/num.otf"));
        org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(view, 2000L, new LinearInterpolator());
        this.f48827i = t5Var;
        t5Var.e(true, 0.0f);
        t5Var.e(false, 1.0f);
        this.f48828j = new org.telegram.ui.Components.t5(view, 350L, 240L, gr.h);
    }
}
