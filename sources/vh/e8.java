package vh;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.vp;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.s9;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wb;
import org.telegram.ui.do0;
public final class e8 extends p {
    public final Path Q1;
    public final o8 R1;

    public e8(o8 o8Var, Activity activity, FrameLayout frameLayout, uu0 uu0Var, FrameLayout frameLayout2, th.b bVar, s9 s9Var) {
        super(activity, frameLayout, uu0Var, frameLayout2, bVar, s9Var);
        this.R1 = o8Var;
        this.Q1 = new Path();
    }

    @Override
    public final boolean e() {
        wb wbVar;
        if (vp.r1(this.U).A3() || ((wbVar = wb.f32128w) != null && wbVar.f32129a == 2)) {
            return false;
        }
        int i10 = vp.r1(this.U).X4;
        SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(cd.G(Math.round(i10 / vp.r1(this.U).W4), "CaptionPremiumSubtitle", i0.a.i(i10, "")));
        int indexOf = W2.toString().indexOf("__");
        if (indexOf >= 0) {
            W2.replace(indexOf, indexOf + 2, (CharSequence) "");
            int indexOf2 = W2.toString().indexOf("__");
            if (indexOf2 >= 0) {
                W2.replace(indexOf2, indexOf2 + 2, (CharSequence) "");
                W2.setSpan(new l00(org.telegram.ui.ActionBar.t6.Uc, this.f51332a), indexOf, indexOf2, 33);
                W2.setSpan(new dh.a(this, 11), indexOf, indexOf2, 33);
            }
        }
        wb I = new cc(this.R1.f51640l0, this.f51332a).I(2131623970, cd.L0(2131752556, null), W2);
        I.f32129a = 2;
        I.f32135j = 5000;
        I.k(false);
        return true;
    }

    @Override
    public final boolean g() {
        return this.R1.f51658r0.c();
    }

    @Override
    public final int getTimelineHeight() {
        z8 z8Var;
        o8 o8Var = this.R1;
        if (o8Var.Y0 != null && (z8Var = o8Var.Z0) != null && z8Var.getVisibility() == 0) {
            return o8Var.Z0.getTimelineHeight();
        }
        return 0;
    }

    @Override
    public final void h(w9 w9Var, Canvas canvas, RectF rectF, float f7, boolean z10, float f10, float f11, boolean z11) {
        if (!canvas.isHardwareAccelerated()) {
            return;
        }
        canvas.save();
        Path path = this.Q1;
        path.rewind();
        path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(f10, f11);
        w9Var.b(canvas, true);
        canvas.restore();
    }

    @Override
    public final void i(Bitmap bitmap) {
        this.R1.f51644n.X(12.0f, bitmap);
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    @Override
    public final boolean l(float f7, float f10) {
        o8 o8Var = this.R1;
        s7 s7Var = o8Var.f51672v1;
        if (s7Var != null && s7Var.A0 != null) {
            e8 e8Var = o8Var.f51613c1;
            if (!e8Var.f51350o0) {
                float x10 = e8Var.getX() + f7;
                float y3 = o8Var.f51613c1.getY() + f10;
                float x11 = o8Var.f51640l0.getX() + x10;
                float y10 = o8Var.f51640l0.getY() + y3;
                float x12 = x11 - o8Var.f51628h0.getX();
                float y11 = y10 - o8Var.f51628h0.getY();
                for (int i10 = 0; i10 < o8Var.f51672v1.A0.getChildCount(); i10++) {
                    View childAt = o8Var.f51672v1.A0.getChildAt(i10);
                    if (childAt instanceof jg.j) {
                        oj0 selectionBounds = ((jg.j) childAt).getSelectionBounds();
                        RectF rectF = org.telegram.messenger.i0.P;
                        float f11 = selectionBounds.f29084a;
                        float f12 = selectionBounds.f29085b;
                        rectF.set(f11, f12, selectionBounds.f29086c + f11, selectionBounds.d + f12);
                        if (rectF.contains(x12, y11)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void n() {
        do0 do0Var = this.R1.f51665t0;
        if (do0Var != null) {
            do0Var.invalidate();
        }
    }

    @Override
    public final void q(boolean z10) {
        boolean z11;
        n5 n5Var;
        o8 o8Var = this.R1;
        f4 f4Var = o8Var.f51609b1;
        if (!o8Var.N1 && !z10) {
            th.e5 O1 = vp.r1(this.U).O1();
            int A = o8Var.A();
            j4.w o10 = O1.o();
            if (o10 == null || !o10.a(O1.f48904a, A) || ((n5Var = o8Var.K1) != null && n5Var.f51529g)) {
                z11 = true;
                f4Var.setShareEnabled(z11);
            }
        }
        z11 = false;
        f4Var.setShareEnabled(z11);
    }
}
