package ph;

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
import org.telegram.ui.Components.rk0;
import org.telegram.ui.nw0;
public final class t9 extends p {
    public final Path O1;
    public final da P1;

    public t9(da daVar, Activity activity, FrameLayout frameLayout, qv0 qv0Var, FrameLayout frameLayout2, nh.b bVar, org.telegram.ui.Components.ba baVar) {
        super(activity, frameLayout, qv0Var, frameLayout2, bVar, baVar);
        this.P1 = daVar;
        this.O1 = new Path();
    }

    @Override
    public final boolean e() {
        ic icVar;
        if (MessagesController.getInstance(this.R).premiumFeaturesBlocked() || ((icVar = ic.f25664w) != null && icVar.f25665a == 2)) {
            return false;
        }
        int i10 = MessagesController.getInstance(this.R).storyCaptionLengthLimitPremium;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CaptionPremiumSubtitle", Math.round(i10 / MessagesController.getInstance(this.R).storyCaptionLengthLimitDefault), kf.k0.j(i10, "")));
        int indexOf = replaceTags.toString().indexOf("__");
        if (indexOf >= 0) {
            replaceTags.replace(indexOf, indexOf + 2, (CharSequence) "");
            int indexOf2 = replaceTags.toString().indexOf("__");
            if (indexOf2 >= 0) {
                replaceTags.replace(indexOf2, indexOf2 + 2, (CharSequence) "");
                replaceTags.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19941gc, this.f41834a)), indexOf, indexOf2, 33);
                replaceTags.setSpan(new eg.l0(this, 8), indexOf, indexOf2, 33);
            }
        }
        ic M = new qc(this.P1.f41537i0, this.f41834a).M(LocaleController.getString(R.string.CaptionPremiumTitle), replaceTags, R.raw.caption_limit);
        M.f25665a = 2;
        M.f25671j = 5000;
        M.k(false);
        return true;
    }

    @Override
    public final boolean g() {
        return this.P1.f41554o0.c();
    }

    @Override
    public final int getTimelineHeight() {
        oa oaVar;
        da daVar = this.P1;
        if (daVar.V0 != null && (oaVar = daVar.W0) != null && oaVar.getVisibility() == 0) {
            return daVar.W0.getTimelineHeight();
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
        this.P1.f41550n.Z(bitmap, 12.0f);
        Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
    }

    @Override
    public final boolean l(float f10, float f11) {
        da daVar = this.P1;
        h9 h9Var = daVar.f41569s1;
        if (h9Var != null && h9Var.O0 != null) {
            t9 t9Var = daVar.Z0;
            if (!t9Var.m0) {
                float x10 = t9Var.getX() + f10;
                float y10 = daVar.Z0.getY() + f11;
                float x11 = daVar.f41537i0.getX() + x10;
                float y11 = daVar.f41537i0.getY() + y10;
                float x12 = x11 - daVar.f41524e0.getX();
                float y12 = y11 - daVar.f41524e0.getY();
                for (int i10 = 0; i10 < daVar.f41569s1.O0.getChildCount(); i10++) {
                    View childAt = daVar.f41569s1.O0.getChildAt(i10);
                    if (childAt instanceof dg.j) {
                        rk0 selectionBounds = ((dg.j) childAt).getSelectionBounds();
                        RectF rectF = AndroidUtilities.rectTmp;
                        float f12 = selectionBounds.f28483a;
                        float f13 = selectionBounds.f28484b;
                        rectF.set(f12, f13, selectionBounds.f28485c + f12, selectionBounds.d + f13);
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
        nw0 nw0Var = this.P1.f41560q0;
        if (nw0Var != null) {
            nw0Var.invalidate();
        }
    }

    @Override
    public final void q(boolean z4) {
        boolean z10;
        t6 t6Var;
        da daVar = this.P1;
        f5 f5Var = daVar.Y0;
        if (!daVar.K1 && !z4) {
            nh.t6 storiesController = MessagesController.getInstance(this.R).getStoriesController();
            int B = daVar.B();
            nh.n6 o10 = storiesController.o();
            if (o10 == null || !o10.a(storiesController.f15897a, B) || ((t6Var = daVar.H1) != null && t6Var.f42414g)) {
                z10 = true;
                f5Var.setShareEnabled(z10);
            }
        }
        z10 = false;
        f5Var.setShareEnabled(z10);
    }
}
