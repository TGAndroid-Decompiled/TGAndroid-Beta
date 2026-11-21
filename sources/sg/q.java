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
import c8.ma;
import com.google.android.gms.internal.vision.e2;
import di.za;
import hi.o4;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.j71;
import org.telegram.ui.jg0;
public final class q extends w2 {
    public static final int f57358u1 = 0;
    public final za f57359m1;
    public final ImageView n1;
    public final k f57360o1;
    public final Path f57361p1;
    public int f57362q1;
    public q0.a f57363r1;
    public androidx.activity.n f57364s1;
    public boolean f57365t1;

    public q(Context context, h6 h6Var) {
        super(1, context, h6Var, true);
        this.f57361p1 = new Path();
        P(-14342875);
        Drawable mutate = context.getResources().getDrawable(2131232730).mutate();
        this.f30206s0 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-14342875, PorterDuff.Mode.MULTIPLY));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(16.0f), 0, 0);
        ImageView imageView = new ImageView(context);
        this.n1 = imageView;
        imageView.setImageResource(2131232540);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setBackground(m6.h0(1090519039, 1, -1));
        imageView.setOnClickListener(new jg0(25, this, context));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(2131231242);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(m6.h0(1090519039, 1, -1));
        imageView2.setOnClickListener(new o4(this, 28));
        k kVar = new k(this, context);
        this.f57360o1 = kVar;
        kVar.f57295c = Color.alpha(-65536) / 255.0f;
        kVar.a();
        kVar.invalidate();
        za zaVar = new za(context, 6);
        zaVar.setOrientation(1);
        o oVar = new o(this, context);
        zaVar.f10202b = oVar;
        oVar.a(this.f57362q1);
        zaVar.f10203c = new n(this, context);
        zaVar.d = new p(this, context);
        j71 j71Var = new j71(context, this.J0);
        j71Var.setAdapter(new li.x(zaVar, 4));
        zaVar.addView(j71Var, ma.l(1.0f, -1, 0));
        zaVar.addView(kVar, ma.k(12.0f, 0.0f, 12.0f, 0.0f, -1, 48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.addView(imageView, ma.o(28, 28));
        linearLayout2.addView(j71Var.i(8, false), ma.q(-1, 40, 1.0f, 16, 12, 0, 12, 0));
        linearLayout2.addView(imageView2, ma.o(28, 28));
        zaVar.addView(linearLayout2, ma.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        this.f57359m1 = zaVar;
        linearLayout.addView(zaVar, ma.o(-1, 0));
        j jVar = new j(this, context, linearLayout);
        jVar.addView(linearLayout);
        this.O = jVar;
    }

    public final void J0(int i7, int i10) {
        boolean z10;
        float t6;
        View findFocus;
        if (!this.f57365t1) {
            if (i10 != 2) {
                return;
            }
            this.f57365t1 = true;
        }
        za zaVar = this.f57359m1;
        if (i10 != 5 && (findFocus = zaVar.findFocus()) != null) {
            findFocus.clearFocus();
            org.telegram.messenger.g0.v1(findFocus);
        }
        if (i10 != 3) {
            ((o) zaVar.f10202b).a(i7);
        }
        if (i10 != 0) {
            n nVar = (n) zaVar.f10203c;
            if (i10 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            nVar.f57333n.f57362q1 = i7;
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
                nVar.f57331e = fArr[0] / 360.0f;
            }
            nVar.invalidate();
        }
        if (i10 != 1) {
            k kVar = this.f57360o1;
            kVar.getClass();
            kVar.f57295c = Color.alpha(i7) / 255.0f;
            kVar.a();
            kVar.invalidate();
        }
        p pVar = (p) zaVar.d;
        pVar.f57354e = true;
        pVar.f57351a.b();
        pVar.f57352b.b();
        pVar.f57353c.b();
        EditTextBoldCursor editTextBoldCursor = pVar.d;
        if (!editTextBoldCursor.isFocused()) {
            int selectionStart = editTextBoldCursor.getSelectionStart();
            int selectionEnd = editTextBoldCursor.getSelectionEnd();
            StringBuilder sb2 = new StringBuilder(Integer.toHexString(pVar.f57355f.f57362q1));
            while (sb2.length() < 8) {
                sb2.insert(0, "0");
            }
            editTextBoldCursor.setText(sb2.toString().toUpperCase().substring(2));
            editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        }
        pVar.f57354e = false;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        q0.a aVar = this.f57363r1;
        if (aVar != null) {
            aVar.accept(Integer.valueOf(this.f57362q1));
        }
    }

    @Override
    public final void show() {
        boolean z10;
        androidx.activity.n nVar = this.f57364s1;
        switch (nVar.f1799a) {
            default:
                if (((Bitmap) nVar.f1801c) != null) {
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
