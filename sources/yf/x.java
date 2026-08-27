package yf;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import h7.z5;
import hh.w9;
import lh.c5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.q6;

public final class x extends e3 {

    public static final int f50111s = 0;

    public final w9 f50112b;

    public final ImageView f50113c;
    public final q6 d;

    public final Path f50114e;

    public int f50115f;
    public q0.a h;

    public u f50116n;

    public boolean f50117r;

    public x(Context context, c6 c6Var) {
        super(context, c6Var, true, false);
        this.f50114e = new Path();
        fixNavigationBar(-14342875);
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(-14342875, PorterDuff.Mode.MULTIPLY));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        ImageView imageView = new ImageView(context);
        this.f50113c = imageView;
        imageView.setImageResource(R.drawable.picker);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setBackground(g6.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new org.telegram.ui.web.c(5, this, context));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.ic_ab_done);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(g6.f0(1090519039, 1, -1));
        imageView2.setOnClickListener(new c5(this, 25));
        q6 q6Var = new q6(this, context);
        this.d = q6Var;
        q6Var.d = Color.alpha(-65536) / 255.0f;
        q6Var.a();
        q6Var.invalidate();
        w9 w9Var = new w9(context, 5);
        w9Var.setOrientation(1);
        t tVar = new t(this, context);
        w9Var.f10305b = tVar;
        tVar.a(this.f50115f);
        w9Var.f10306c = new s(this, context);
        w9Var.d = new w(this, context);
        p pVar = new p(context, this.resourcesProvider);
        pVar.setAdapter(new q(w9Var));
        w9Var.addView(pVar, z5.l(1.0f, -1, 0));
        w9Var.addView(q6Var, z5.k(12.0f, 0.0f, 12.0f, 0.0f, -1, 48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.addView(imageView, z5.n(28, 28));
        linearLayout2.addView(pVar.n(8, false), z5.p(-1, 40, 1.0f, 16, 12, 0, 12, 0));
        linearLayout2.addView(imageView2, z5.n(28, 28));
        w9Var.addView(linearLayout2, z5.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        this.f50112b = w9Var;
        linearLayout.addView(w9Var, z5.n(-1, 0));
        o oVar = new o(this, context, linearLayout);
        oVar.addView(linearLayout);
        setCustomView(oVar);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        q0.a aVar = this.h;
        if (aVar != null) {
            aVar.accept(Integer.valueOf(this.f50115f));
        }
    }

    public final void m(int i10, int i11) {
        View viewFindFocus;
        if (!this.f50117r) {
            if (i11 != 2) {
                return;
            } else {
                this.f50117r = true;
            }
        }
        w9 w9Var = this.f50112b;
        if (i11 != 5 && (viewFindFocus = w9Var.findFocus()) != null) {
            viewFindFocus.clearFocus();
            AndroidUtilities.hideKeyboard(viewFindFocus);
        }
        if (i11 != 3) {
            ((t) w9Var.f10305b).a(i10);
        }
        if (i11 != 0) {
            s sVar = (s) w9Var.f10306c;
            boolean z10 = i11 != 1;
            sVar.f50069n.f50115f = i10;
            float[] fArr = sVar.h;
            Color.colorToHSV(i10, fArr);
            if (z10) {
                float f10 = (fArr[1] * 0.5f) + 1.0f;
                float f11 = fArr[2];
                sVar.d = f10 - (f11 <= 0.5f ? 1.0f - (((1.0f - f11) * 0.22000003f) + 0.78f) : pa.b(1.0f, f11, 0.22f, 1.0f));
                sVar.f50067e = fArr[0] / 360.0f;
            }
            sVar.invalidate();
        }
        if (i11 != 1) {
            q6 q6Var = this.d;
            q6Var.getClass();
            q6Var.d = Color.alpha(i10) / 255.0f;
            q6Var.a();
            q6Var.invalidate();
        }
        w wVar = (w) w9Var.d;
        wVar.f50107e = true;
        wVar.f50104a.b();
        wVar.f50105b.b();
        wVar.f50106c.b();
        EditTextBoldCursor editTextBoldCursor = wVar.d;
        if (!editTextBoldCursor.isFocused()) {
            int selectionStart = editTextBoldCursor.getSelectionStart();
            int selectionEnd = editTextBoldCursor.getSelectionEnd();
            StringBuilder sb2 = new StringBuilder(Integer.toHexString(wVar.f50108f.f50115f));
            while (sb2.length() < 8) {
                sb2.insert(0, "0");
            }
            editTextBoldCursor.setText(sb2.toString().toUpperCase().substring(2));
            editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        }
        wVar.f50107e = false;
    }

    @Override
    public final void show() {
        if (!this.f50116n.g()) {
            this.f50113c.setVisibility(8);
        }
        super.show();
    }
}
