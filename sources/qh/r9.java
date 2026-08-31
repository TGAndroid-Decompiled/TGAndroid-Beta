package qh;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.iw0;
public final class r9 extends p {
    public final Path O1;
    public final ca P1;

    public r9(ca caVar, Activity activity, FrameLayout frameLayout, qv0 qv0Var, FrameLayout frameLayout2, oh.b bVar, org.telegram.ui.Components.ba baVar) {
        super(activity, frameLayout, qv0Var, frameLayout2, bVar, baVar);
        this.P1 = caVar;
        this.O1 = new Path();
    }

    @Override
    public final boolean e() {
        ic icVar;
        if (MessagesController.getInstance(this.R).premiumFeaturesBlocked() || ((icVar = ic.f27737w) != null && icVar.f27738a == 2)) {
            return false;
        }
        int i10 = MessagesController.getInstance(this.R).storyCaptionLengthLimitPremium;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CaptionPremiumSubtitle", Math.round(i10 / MessagesController.getInstance(this.R).storyCaptionLengthLimitDefault), l.d.j(i10, "")));
        int indexOf = replaceTags.toString().indexOf("__");
        if (indexOf >= 0) {
            replaceTags.replace(indexOf, indexOf + 2, (CharSequence) "");
            int indexOf2 = replaceTags.toString().indexOf("__");
            if (indexOf2 >= 0) {
                replaceTags.replace(indexOf2, indexOf2 + 2, (CharSequence) "");
                replaceTags.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21720gc, this.f45508a)), indexOf, indexOf2, 33);
                replaceTags.setSpan(new fg.l0(this, 8), indexOf, indexOf2, 33);
            }
        }
        ic M = new qc(this.P1.f45102i0, this.f45508a).M(LocaleController.getString(R.string.CaptionPremiumTitle), replaceTags, R.raw.caption_limit);
        M.f27738a = 2;
        M.f27745j = 5000;
        M.k(false);
        return true;
    }

    @Override
    public final boolean g() {
        return this.P1.f45119o0.c();
    }

    @Override
    public final int getTimelineHeight() {
        ma maVar;
        ca caVar = this.P1;
        if (caVar.V0 != null && (maVar = caVar.W0) != null && maVar.getVisibility() == 0) {
            return caVar.W0.getTimelineHeight();
        }
        return 0;
    }

    @Override
    public final void h(org.telegram.ui.Components.fa faVar, Canvas canvas, RectF rectF, float f10, boolean z4, float f11, float f12, boolean z10) {
        if (!canvas.isHardwareAccelerated()) {
            return;
        }
        canvas.save();
        Path path = this.O1;
        path.rewind();
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(f11, f12);
        faVar.b(canvas, true);
        canvas.restore();
    }

    @Override
    public final void i(Bitmap bitmap) {
        this.P1.f45115n.Z(bitmap, 12.0f);
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    @Override
    public final boolean l(float f10, float f11) {
        ca caVar = this.P1;
        f9 f9Var = caVar.f45134s1;
        if (f9Var != null && f9Var.O0 != null) {
            r9 r9Var = caVar.Z0;
            if (!r9Var.m0) {
                float x10 = r9Var.getX() + f10;
                float y10 = caVar.Z0.getY() + f11;
                float x11 = caVar.f45102i0.getX() + x10;
                float y11 = caVar.f45102i0.getY() + y10;
                float x12 = x11 - caVar.f45089e0.getX();
                float y12 = y11 - caVar.f45089e0.getY();
                for (int i10 = 0; i10 < caVar.f45134s1.O0.getChildCount(); i10++) {
                    View childAt = caVar.f45134s1.O0.getChildAt(i10);
                    if (childAt instanceof eg.j) {
                        tk0 selectionBounds = ((eg.j) childAt).getSelectionBounds();
                        RectF rectF = AndroidUtilities.rectTmp;
                        float f12 = selectionBounds.f31355a;
                        float f13 = selectionBounds.f31356b;
                        rectF.set(f12, f13, selectionBounds.f31357c + f12, selectionBounds.d + f13);
                        if (rectF.contains(x12, y12)) {
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
        iw0 iw0Var = this.P1.f45125q0;
        if (iw0Var != null) {
            iw0Var.invalidate();
        }
    }

    @Override
    public final void q(boolean z4) {
        boolean z10;
        s6 s6Var;
        ca caVar = this.P1;
        e5 e5Var = caVar.Y0;
        if (!caVar.K1 && !z4) {
            oh.t6 storiesController = MessagesController.getInstance(this.R).getStoriesController();
            int B = caVar.B();
            oh.n6 o10 = storiesController.o();
            if (o10 == null || !o10.a(storiesController.f17770a, B) || ((s6Var = caVar.H1) != null && s6Var.f46057g)) {
                z10 = true;
                e5Var.setShareEnabled(z10);
            }
        }
        z10 = false;
        e5Var.setShareEnabled(z10);
    }
}
