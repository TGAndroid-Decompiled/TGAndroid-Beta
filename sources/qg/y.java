package qg;

import ai.vc;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.gms.internal.play_billing.k3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.l91;
import w7.z5;
public final class y extends h3 {
    public static final int f45125s = 0;
    public final vc f45126b;
    public final ImageView f45127c;
    public final p d;
    public final Path e;
    public int f45128f;
    public q0.a h;
    public v f45129n;
    public boolean f45130r;

    public y(Context context, g6 g6Var) {
        super(1, context, g6Var, true);
        this.e = new Path();
        fixNavigationBar(-14342875);
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-14342875, PorterDuff.Mode.MULTIPLY));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        ImageView imageView = new ImageView(context);
        this.f45127c = imageView;
        imageView.setImageResource(R.drawable.picker);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setBackground(k6.g0(1090519039, 1, -1));
        imageView.setOnClickListener(new org.telegram.ui.web.c(1, this, context));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.ic_ab_done);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(k6.g0(1090519039, 1, -1));
        imageView2.setOnClickListener(new hg.r0(this, 16));
        p pVar = new p(this, context);
        this.d = pVar;
        pVar.f45012c = Color.alpha(-65536) / 255.0f;
        pVar.a();
        pVar.invalidate();
        vc vcVar = new vc(context, 5);
        vcVar.setOrientation(1);
        u uVar = new u(this, context);
        vcVar.f2335b = uVar;
        uVar.a(this.f45128f);
        vcVar.f2336c = new t(this, context);
        vcVar.d = new x(this, context);
        l91 l91Var = new l91(context, this.resourcesProvider);
        l91Var.setAdapter(new r(vcVar));
        vcVar.addView(l91Var, z5.l(1.0f, -1, 0));
        vcVar.addView(pVar, z5.k(12.0f, 0.0f, 12.0f, 0.0f, -1, 48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.addView(imageView, z5.n(28, 28));
        linearLayout2.addView(l91Var.n(8, false), z5.p(-1, 40, 1.0f, 16, 12, 0, 12, 0));
        linearLayout2.addView(imageView2, z5.n(28, 28));
        vcVar.addView(linearLayout2, z5.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        this.f45126b = vcVar;
        linearLayout.addView(vcVar, z5.n(-1, 0));
        o oVar = new o(this, context, linearLayout);
        oVar.addView(linearLayout);
        setCustomView(oVar);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        q0.a aVar = this.h;
        if (aVar != null) {
            aVar.accept(Integer.valueOf(this.f45128f));
        }
    }

    public final void m(int i10, int i11) {
        boolean z10;
        float D;
        View findFocus;
        if (!this.f45130r) {
            if (i11 != 2) {
                return;
            }
            this.f45130r = true;
        }
        vc vcVar = this.f45126b;
        if (i11 != 5 && (findFocus = vcVar.findFocus()) != null) {
            findFocus.clearFocus();
            AndroidUtilities.hideKeyboard(findFocus);
        }
        if (i11 != 3) {
            ((u) vcVar.f2335b).a(i10);
        }
        if (i11 != 0) {
            t tVar = (t) vcVar.f2336c;
            if (i11 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            tVar.f45072n.f45128f = i10;
            float[] fArr = tVar.h;
            Color.colorToHSV(i10, fArr);
            if (z10) {
                float f7 = (fArr[1] * 0.5f) + 1.0f;
                float f10 = fArr[2];
                if (f10 <= 0.5f) {
                    D = 1.0f - (((1.0f - f10) * 0.22000003f) + 0.78f);
                } else {
                    D = k3.D(1.0f, f10, 0.22f, 1.0f);
                }
                tVar.d = f7 - D;
                tVar.e = fArr[0] / 360.0f;
            }
            tVar.invalidate();
        }
        if (i11 != 1) {
            p pVar = this.d;
            pVar.getClass();
            pVar.f45012c = Color.alpha(i10) / 255.0f;
            pVar.a();
            pVar.invalidate();
        }
        x xVar = (x) vcVar.d;
        xVar.e = true;
        xVar.f45114a.b();
        xVar.f45115b.b();
        xVar.f45116c.b();
        EditTextBoldCursor editTextBoldCursor = xVar.d;
        if (!editTextBoldCursor.isFocused()) {
            int selectionStart = editTextBoldCursor.getSelectionStart();
            int selectionEnd = editTextBoldCursor.getSelectionEnd();
            StringBuilder sb2 = new StringBuilder(Integer.toHexString(xVar.f45117f.f45128f));
            while (sb2.length() < 8) {
                sb2.insert(0, "0");
            }
            editTextBoldCursor.setText(sb2.toString().toUpperCase().substring(2));
            editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        }
        xVar.e = false;
    }

    @Override
    public final void show() {
        if (!this.f45129n.g()) {
            this.f45127c.setVisibility(8);
        }
        super.show();
    }
}
