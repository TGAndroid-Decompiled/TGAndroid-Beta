package rg;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bi.mc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.u91;
public final class y extends k3 {
    public static final int f47593s = 0;
    public final mc f47594b;
    public final ImageView f47595c;
    public final p d;
    public final Path e;
    public int f47596f;
    public q0.a h;
    public v f47597n;
    public boolean f47598r;

    public y(Context context, u6 u6Var) {
        super(1, context, u6Var, true);
        this.e = new Path();
        fixNavigationBar(-14342875);
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-14342875, PorterDuff.Mode.MULTIPLY));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        ImageView imageView = new ImageView(context);
        this.f47595c = imageView;
        imageView.setImageResource(R.drawable.picker);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setBackground(y6.g0(1090519039, 1, -1));
        imageView.setOnClickListener(new org.telegram.ui.web.c(1, this, context));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.ic_ab_done);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(y6.g0(1090519039, 1, -1));
        imageView2.setOnClickListener(new ig.d0(this, 17));
        p pVar = new p(this, context);
        this.d = pVar;
        pVar.f47487c = Color.alpha(-65536) / 255.0f;
        pVar.a();
        pVar.invalidate();
        mc mcVar = new mc(context, 6);
        mcVar.setOrientation(1);
        u uVar = new u(this, context);
        mcVar.f5111b = uVar;
        uVar.a(this.f47596f);
        mcVar.f5112c = new t(this, context);
        mcVar.d = new x(this, context);
        u91 u91Var = new u91(context, this.resourcesProvider);
        u91Var.setAdapter(new r(mcVar));
        mcVar.addView(u91Var, gb1.p(1.0f, -1, 0));
        mcVar.addView(pVar, gb1.o(12.0f, 0.0f, 12.0f, 0.0f, -1, 48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.addView(imageView, gb1.r(28, 28));
        linearLayout2.addView(u91Var.n(8, false), gb1.t(-1, 40, 1.0f, 16, 12, 0, 12, 0));
        linearLayout2.addView(imageView2, gb1.r(28, 28));
        mcVar.addView(linearLayout2, gb1.o(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        this.f47594b = mcVar;
        linearLayout.addView(mcVar, gb1.r(-1, 0));
        o oVar = new o(this, context, linearLayout);
        oVar.addView(linearLayout);
        setCustomView(oVar);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        q0.a aVar = this.h;
        if (aVar != null) {
            aVar.accept(Integer.valueOf(this.f47596f));
        }
    }

    public final void m(int i10, int i11) {
        boolean z10;
        float d;
        View findFocus;
        if (!this.f47598r) {
            if (i11 != 2) {
                return;
            }
            this.f47598r = true;
        }
        mc mcVar = this.f47594b;
        if (i11 != 5 && (findFocus = mcVar.findFocus()) != null) {
            findFocus.clearFocus();
            AndroidUtilities.hideKeyboard(findFocus);
        }
        if (i11 != 3) {
            ((u) mcVar.f5111b).a(i10);
        }
        if (i11 != 0) {
            t tVar = (t) mcVar.f5112c;
            if (i11 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            tVar.f47556n.f47596f = i10;
            float[] fArr = tVar.h;
            Color.colorToHSV(i10, fArr);
            if (z10) {
                float f7 = (fArr[1] * 0.5f) + 1.0f;
                float f10 = fArr[2];
                if (f10 <= 0.5f) {
                    d = 1.0f - (((1.0f - f10) * 0.22000003f) + 0.78f);
                } else {
                    d = ic.a.d(1.0f, f10, 0.22f, 1.0f);
                }
                tVar.d = f7 - d;
                tVar.e = fArr[0] / 360.0f;
            }
            tVar.invalidate();
        }
        if (i11 != 1) {
            p pVar = this.d;
            pVar.getClass();
            pVar.f47487c = Color.alpha(i10) / 255.0f;
            pVar.a();
            pVar.invalidate();
        }
        x xVar = (x) mcVar.d;
        xVar.e = true;
        xVar.f47587a.b();
        xVar.f47588b.b();
        xVar.f47589c.b();
        EditTextBoldCursor editTextBoldCursor = xVar.d;
        if (!editTextBoldCursor.isFocused()) {
            int selectionStart = editTextBoldCursor.getSelectionStart();
            int selectionEnd = editTextBoldCursor.getSelectionEnd();
            StringBuilder sb2 = new StringBuilder(Integer.toHexString(xVar.f47590f.f47596f));
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
        if (!this.f47597n.g()) {
            this.f47595c.setVisibility(8);
        }
        super.show();
    }
}
