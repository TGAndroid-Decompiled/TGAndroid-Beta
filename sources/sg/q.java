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
import bi.nc;
import c8.ha;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.v2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.w61;
import org.telegram.ui.hk0;
public final class q extends v2 {
    public static final int f55191q1 = 0;
    public final nc f55192i1;
    public final ImageView f55193j1;
    public final k f55194k1;
    public final Path l1;
    public int f55195m1;
    public q0.a n1;
    public androidx.activity.n f55196o1;
    public boolean f55197p1;

    public q(Context context, g6 g6Var) {
        super(1, context, g6Var, true);
        this.l1 = new Path();
        O(-14342875);
        Drawable mutate = context.getResources().getDrawable(2131232728).mutate();
        this.f28651r0 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-14342875, PorterDuff.Mode.MULTIPLY));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(16.0f), 0, 0);
        ImageView imageView = new ImageView(context);
        this.f55193j1 = imageView;
        imageView.setImageResource(2131232538);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setBackground(l6.h0(1090519039, 1, -1));
        imageView.setOnClickListener(new hk0(25, this, context));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(2131231242);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(l6.h0(1090519039, 1, -1));
        imageView2.setOnClickListener(new ii.g(this, 21));
        k kVar = new k(this, context);
        this.f55194k1 = kVar;
        kVar.f55126c = Color.alpha(-65536) / 255.0f;
        kVar.a();
        kVar.invalidate();
        nc ncVar = new nc(context, 6);
        ncVar.setOrientation(1);
        o oVar = new o(this, context);
        ncVar.f4435b = oVar;
        oVar.a(this.f55195m1);
        ncVar.f4436c = new n(this, context);
        ncVar.d = new p(this, context);
        w61 w61Var = new w61(context, this.I0);
        w61Var.setAdapter(new ii.x(ncVar, 4));
        ncVar.addView(w61Var, ha.l(1.0f, -1, 0));
        ncVar.addView(kVar, ha.k(12.0f, 0.0f, 12.0f, 0.0f, -1, 48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.addView(imageView, ha.o(28, 28));
        linearLayout2.addView(w61Var.n(8, false), ha.q(-1, 40, 1.0f, 16, 12, 0, 12, 0));
        linearLayout2.addView(imageView2, ha.o(28, 28));
        ncVar.addView(linearLayout2, ha.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        this.f55192i1 = ncVar;
        linearLayout.addView(ncVar, ha.o(-1, 0));
        j jVar = new j(this, context, linearLayout);
        jVar.addView(linearLayout);
        this.N = jVar;
    }

    public final void I0(int i7, int i10) {
        boolean z9;
        float v;
        View findFocus;
        if (!this.f55197p1) {
            if (i10 != 2) {
                return;
            }
            this.f55197p1 = true;
        }
        nc ncVar = this.f55192i1;
        if (i10 != 5 && (findFocus = ncVar.findFocus()) != null) {
            findFocus.clearFocus();
            org.telegram.messenger.g0.v1(findFocus);
        }
        if (i10 != 3) {
            ((o) ncVar.f4435b).a(i7);
        }
        if (i10 != 0) {
            n nVar = (n) ncVar.f4436c;
            if (i10 != 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            nVar.f55165n.f55195m1 = i7;
            float[] fArr = nVar.h;
            Color.colorToHSV(i7, fArr);
            if (z9) {
                float f10 = (fArr[1] * 0.5f) + 1.0f;
                float f11 = fArr[2];
                if (f11 <= 0.5f) {
                    v = 1.0f - (((1.0f - f11) * 0.22000003f) + 0.78f);
                } else {
                    v = com.google.android.recaptcha.internal.a.v(1.0f, f11, 0.22f, 1.0f);
                }
                nVar.d = f10 - v;
                nVar.f55163e = fArr[0] / 360.0f;
            }
            nVar.invalidate();
        }
        if (i10 != 1) {
            k kVar = this.f55194k1;
            kVar.getClass();
            kVar.f55126c = Color.alpha(i7) / 255.0f;
            kVar.a();
            kVar.invalidate();
        }
        p pVar = (p) ncVar.d;
        pVar.f55187e = true;
        pVar.f55184a.b();
        pVar.f55185b.b();
        pVar.f55186c.b();
        EditTextBoldCursor editTextBoldCursor = pVar.d;
        if (!editTextBoldCursor.isFocused()) {
            int selectionStart = editTextBoldCursor.getSelectionStart();
            int selectionEnd = editTextBoldCursor.getSelectionEnd();
            StringBuilder sb2 = new StringBuilder(Integer.toHexString(pVar.f55188f.f55195m1));
            while (sb2.length() < 8) {
                sb2.insert(0, "0");
            }
            editTextBoldCursor.setText(sb2.toString().toUpperCase().substring(2));
            editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        }
        pVar.f55187e = false;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        q0.a aVar = this.n1;
        if (aVar != null) {
            aVar.accept(Integer.valueOf(this.f55195m1));
        }
    }

    @Override
    public final void show() {
        boolean z9;
        androidx.activity.n nVar = this.f55196o1;
        switch (nVar.f1845a) {
            default:
                if (((Bitmap) nVar.f1847c) != null) {
                    z9 = true;
                    break;
                }
            case 1:
                z9 = false;
                break;
        }
        if (!z9) {
            this.f55193j1.setVisibility(8);
        }
        super.show();
    }
}
