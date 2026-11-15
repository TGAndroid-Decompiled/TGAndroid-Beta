package sg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import c8.ja;
import com.google.android.gms.internal.vision.e2;
import di.va;
import hi.p5;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.u2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.w61;
import org.telegram.ui.sc1;
public final class q extends u2 {
    public static final int f56743u1 = 0;
    public final va f56744m1;
    public final ImageView n1;
    public final k f56745o1;
    public final Path f56746p1;
    public int f56747q1;
    public q0.a f56748r1;
    public androidx.activity.n f56749s1;
    public boolean f56750t1;

    public q(Context context, e6 e6Var) {
        super(1, context, e6Var, true);
        this.f56746p1 = new Path();
        P(-14342875);
        Drawable mutate = context.getResources().getDrawable(2131232729).mutate();
        this.f29715s0 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-14342875, PorterDuff.Mode.MULTIPLY));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(16.0f), 0, 0);
        ImageView imageView = new ImageView(context);
        this.n1 = imageView;
        imageView.setImageResource(2131232539);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setBackground(j6.h0(1090519039, 1, -1));
        imageView.setOnClickListener(new sc1(2, this, context));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(2131231242);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(j6.h0(1090519039, 1, -1));
        imageView2.setOnClickListener(new p5(this, 27));
        k kVar = new k(this, context);
        this.f56745o1 = kVar;
        kVar.f56680c = Color.alpha(-65536) / 255.0f;
        kVar.a();
        kVar.invalidate();
        va vaVar = new va(context, 6);
        vaVar.setOrientation(1);
        o oVar = new o(this, context);
        vaVar.f9622b = oVar;
        oVar.a(this.f56747q1);
        vaVar.f9623c = new n(this, context);
        vaVar.d = new p(this, context);
        w61 w61Var = new w61(context, this.J0);
        w61Var.setAdapter(new li.x(vaVar, 4));
        vaVar.addView(w61Var, ja.l(1.0f, -1, 0));
        vaVar.addView(kVar, ja.k(12.0f, 0.0f, 12.0f, 0.0f, -1, 48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.addView(imageView, ja.o(28, 28));
        linearLayout2.addView(w61Var.i(8, false), ja.q(-1, 40, 1.0f, 16, 12, 0, 12, 0));
        linearLayout2.addView(imageView2, ja.o(28, 28));
        vaVar.addView(linearLayout2, ja.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        this.f56744m1 = vaVar;
        linearLayout.addView(vaVar, ja.o(-1, 0));
        j jVar = new j(this, context, linearLayout);
        jVar.addView(linearLayout);
        this.O = jVar;
    }

    public final void I0(int i7, int i10) {
        boolean z10;
        float t6;
        View findFocus;
        if (!this.f56750t1) {
            if (i10 != 2) {
                return;
            }
            this.f56750t1 = true;
        }
        va vaVar = this.f56744m1;
        if (i10 != 5 && (findFocus = vaVar.findFocus()) != null) {
            findFocus.clearFocus();
            org.telegram.messenger.g0.v1(findFocus);
        }
        if (i10 != 3) {
            ((o) vaVar.f9622b).a(i7);
        }
        if (i10 != 0) {
            n nVar = (n) vaVar.f9623c;
            if (i10 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            nVar.f56718n.f56747q1 = i7;
            float[] fArr = nVar.h;
            Color.colorToHSV(i7, fArr);
            if (z10) {
                float f10 = (fArr[1] * 0.5f) + 1.0f;
                float f11 = fArr[2];
                if (f11 <= 0.5f) {
                    t6 = 1.0f - (((1.0f - f11) * 0.22000003f) + 0.78f);
                } else {
                    t6 = e2.t(1.0f, f11, 0.22f, 1.0f);
                }
                nVar.d = f10 - t6;
                nVar.f56716e = fArr[0] / 360.0f;
            }
            nVar.invalidate();
        }
        if (i10 != 1) {
            k kVar = this.f56745o1;
            kVar.getClass();
            kVar.f56680c = Color.alpha(i7) / 255.0f;
            kVar.a();
            kVar.invalidate();
        }
        p pVar = (p) vaVar.d;
        pVar.f56739e = true;
        pVar.f56736a.b();
        pVar.f56737b.b();
        pVar.f56738c.b();
        EditTextBoldCursor editTextBoldCursor = pVar.d;
        if (!editTextBoldCursor.isFocused()) {
            int selectionStart = editTextBoldCursor.getSelectionStart();
            int selectionEnd = editTextBoldCursor.getSelectionEnd();
            StringBuilder sb2 = new StringBuilder(Integer.toHexString(pVar.f56740f.f56747q1));
            while (sb2.length() < 8) {
                sb2.insert(0, "0");
            }
            editTextBoldCursor.setText(sb2.toString().toUpperCase().substring(2));
            editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        }
        pVar.f56739e = false;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        q0.a aVar = this.f56748r1;
        if (aVar != null) {
            aVar.accept(Integer.valueOf(this.f56747q1));
        }
    }

    @Override
    public final void show() {
        boolean z10;
        androidx.activity.n nVar = this.f56749s1;
        switch (nVar.f1795a) {
            default:
                if (((Bitmap) nVar.f1797c) != null) {
                    z10 = true;
                    break;
                }
            case 1:
                z10 = false;
                break;
        }
        if (!z10) {
            this.n1.setVisibility(8);
        }
        super.show();
    }
}
