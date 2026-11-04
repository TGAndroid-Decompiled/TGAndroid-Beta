package tg;

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
import b8.mf;
import ci.gb;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.t2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.n61;
public final class q extends t2 {
    public static final int f55285r1 = 0;
    public final gb f55286j1;
    public final ImageView k1;
    public final k f55287l1;
    public final Path m1;
    public int f55288n1;
    public q0.a f55289o1;
    public androidx.activity.n f55290p1;
    public boolean f55291q1;

    public q(Context context, e6 e6Var) {
        super(1, context, e6Var, true);
        this.m1 = new Path();
        O(-14342875);
        Drawable mutate = context.getResources().getDrawable(2131232726).mutate();
        this.f28616s0 = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-14342875, PorterDuff.Mode.MULTIPLY));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(16.0f), 0, 0);
        ImageView imageView = new ImageView(context);
        this.k1 = imageView;
        imageView.setImageResource(2131232538);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setBackground(k6.h0(1090519039, 1, -1));
        imageView.setOnClickListener(new org.telegram.ui.web.d(1, this, context));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(2131231242);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(k6.h0(1090519039, 1, -1));
        imageView2.setOnClickListener(new ii.m(this, 25));
        k kVar = new k(this, context);
        this.f55287l1 = kVar;
        kVar.f55222c = Color.alpha(-65536) / 255.0f;
        kVar.a();
        kVar.invalidate();
        gb gbVar = new gb(context, 6);
        gbVar.setOrientation(1);
        o oVar = new o(this, context);
        gbVar.f5198b = oVar;
        oVar.a(this.f55288n1);
        gbVar.f5199c = new n(this, context);
        gbVar.d = new p(this, context);
        n61 n61Var = new n61(context, this.J0);
        n61Var.setAdapter(new ji.v(gbVar, 4));
        gbVar.addView(n61Var, mf.l(1.0f, -1, 0));
        gbVar.addView(kVar, mf.k(12.0f, 0.0f, 12.0f, 0.0f, -1, 48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.addView(imageView, mf.o(28, 28));
        linearLayout2.addView(n61Var.j(8, false), mf.q(-1, 40, 1.0f, 16, 12, 0, 12, 0));
        linearLayout2.addView(imageView2, mf.o(28, 28));
        gbVar.addView(linearLayout2, mf.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        this.f55286j1 = gbVar;
        linearLayout.addView(gbVar, mf.o(-1, 0));
        j jVar = new j(this, context, linearLayout);
        jVar.addView(linearLayout);
        this.O = jVar;
    }

    public final void I0(int i3, int i10) {
        boolean z10;
        float D;
        View findFocus;
        if (!this.f55291q1) {
            if (i10 != 2) {
                return;
            }
            this.f55291q1 = true;
        }
        gb gbVar = this.f55286j1;
        if (i10 != 5 && (findFocus = gbVar.findFocus()) != null) {
            findFocus.clearFocus();
            org.telegram.messenger.g0.v1(findFocus);
        }
        if (i10 != 3) {
            ((o) gbVar.f5198b).a(i3);
        }
        if (i10 != 0) {
            n nVar = (n) gbVar.f5199c;
            if (i10 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            nVar.f55260n.f55288n1 = i3;
            float[] fArr = nVar.h;
            Color.colorToHSV(i3, fArr);
            if (z10) {
                float f10 = (fArr[1] * 0.5f) + 1.0f;
                float f11 = fArr[2];
                if (f11 <= 0.5f) {
                    D = 1.0f - (((1.0f - f11) * 0.22000003f) + 0.78f);
                } else {
                    D = a1.g.D(1.0f, f11, 0.22f, 1.0f);
                }
                nVar.d = f10 - D;
                nVar.f55258e = fArr[0] / 360.0f;
            }
            nVar.invalidate();
        }
        if (i10 != 1) {
            k kVar = this.f55287l1;
            kVar.getClass();
            kVar.f55222c = Color.alpha(i3) / 255.0f;
            kVar.a();
            kVar.invalidate();
        }
        p pVar = (p) gbVar.d;
        pVar.f55281e = true;
        pVar.f55278a.b();
        pVar.f55279b.b();
        pVar.f55280c.b();
        EditTextBoldCursor editTextBoldCursor = pVar.d;
        if (!editTextBoldCursor.isFocused()) {
            int selectionStart = editTextBoldCursor.getSelectionStart();
            int selectionEnd = editTextBoldCursor.getSelectionEnd();
            StringBuilder sb2 = new StringBuilder(Integer.toHexString(pVar.f55282f.f55288n1));
            while (sb2.length() < 8) {
                sb2.insert(0, "0");
            }
            editTextBoldCursor.setText(sb2.toString().toUpperCase().substring(2));
            editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        }
        pVar.f55281e = false;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        q0.a aVar = this.f55289o1;
        if (aVar != null) {
            aVar.accept(Integer.valueOf(this.f55288n1));
        }
    }

    @Override
    public final void show() {
        boolean z10;
        androidx.activity.n nVar = this.f55290p1;
        switch (nVar.f1268a) {
            default:
                if (((Bitmap) nVar.f1270c) != null) {
                    z10 = true;
                    break;
                }
            case 1:
                z10 = false;
                break;
        }
        if (!z10) {
            this.k1.setVisibility(8);
        }
        super.show();
    }
}
