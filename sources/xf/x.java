package xf;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import g7.e6;
import gh.x9;
import kh.x8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.n71;
import org.telegram.ui.p6;
public final class x extends f3 {
    public static final int f49407s = 0;
    public final x9 f49408b;
    public final ImageView f49409c;
    public final p6 d;
    public final Path f49410e;
    public int f49411f;
    public q0.a h;
    public u f49412n;
    public boolean f49413r;

    public x(Context context, b6 b6Var) {
        super(context, b6Var, true, false);
        this.f49410e = new Path();
        fixNavigationBar(-14342875);
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-14342875, PorterDuff.Mode.MULTIPLY));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        ImageView imageView = new ImageView(context);
        this.f49409c = imageView;
        imageView.setImageResource(R.drawable.picker);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setBackground(f6.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new pf.v(4, this, context));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.ic_ab_done);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(f6.f0(1090519039, 1, -1));
        imageView2.setOnClickListener(new x8(this, 23));
        p6 p6Var = new p6(this, context);
        this.d = p6Var;
        p6Var.d = Color.alpha(-65536) / 255.0f;
        p6Var.a();
        p6Var.invalidate();
        x9 x9Var = new x9(context, 5);
        x9Var.setOrientation(1);
        t tVar = new t(this, context);
        x9Var.f9186b = tVar;
        tVar.a(this.f49411f);
        x9Var.f9187c = new s(this, context);
        x9Var.d = new w(this, context);
        n71 n71Var = new n71(context, this.resourcesProvider);
        n71Var.setAdapter(new q(x9Var));
        x9Var.addView(n71Var, e6.l(1.0f, -1, 0));
        x9Var.addView(p6Var, e6.k(12.0f, 0.0f, 12.0f, 0.0f, -1, 48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.addView(imageView, e6.n(28, 28));
        linearLayout2.addView(n71Var.n(8, false), e6.p(-1, 40, 1.0f, 16, 12, 0, 12, 0));
        linearLayout2.addView(imageView2, e6.n(28, 28));
        x9Var.addView(linearLayout2, e6.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        this.f49408b = x9Var;
        linearLayout.addView(x9Var, e6.n(-1, 0));
        o oVar = new o(this, context, linearLayout);
        oVar.addView(linearLayout);
        setCustomView(oVar);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        q0.a aVar = this.h;
        if (aVar != null) {
            aVar.accept(Integer.valueOf(this.f49411f));
        }
    }

    public final void m(int i9, int i10) {
        boolean z10;
        float C;
        View findFocus;
        if (!this.f49413r) {
            if (i10 != 2) {
                return;
            }
            this.f49413r = true;
        }
        x9 x9Var = this.f49408b;
        if (i10 != 5 && (findFocus = x9Var.findFocus()) != null) {
            findFocus.clearFocus();
            AndroidUtilities.hideKeyboard(findFocus);
        }
        if (i10 != 3) {
            ((t) x9Var.f9186b).a(i9);
        }
        if (i10 != 0) {
            s sVar = (s) x9Var.f9187c;
            if (i10 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            sVar.f49351n.f49411f = i9;
            float[] fArr = sVar.h;
            Color.colorToHSV(i9, fArr);
            if (z10) {
                float f10 = (fArr[1] * 0.5f) + 1.0f;
                float f11 = fArr[2];
                if (f11 <= 0.5f) {
                    C = 1.0f - (((1.0f - f11) * 0.22000003f) + 0.78f);
                } else {
                    C = j3.r0.C(1.0f, f11, 0.22f, 1.0f);
                }
                sVar.d = f10 - C;
                sVar.f49349e = fArr[0] / 360.0f;
            }
            sVar.invalidate();
        }
        if (i10 != 1) {
            p6 p6Var = this.d;
            p6Var.getClass();
            p6Var.d = Color.alpha(i9) / 255.0f;
            p6Var.a();
            p6Var.invalidate();
        }
        w wVar = (w) x9Var.d;
        wVar.f49403e = true;
        wVar.f49400a.b();
        wVar.f49401b.b();
        wVar.f49402c.b();
        EditTextBoldCursor editTextBoldCursor = wVar.d;
        if (!editTextBoldCursor.isFocused()) {
            int selectionStart = editTextBoldCursor.getSelectionStart();
            int selectionEnd = editTextBoldCursor.getSelectionEnd();
            StringBuilder sb2 = new StringBuilder(Integer.toHexString(wVar.f49404f.f49411f));
            while (sb2.length() < 8) {
                sb2.insert(0, "0");
            }
            editTextBoldCursor.setText(sb2.toString().toUpperCase().substring(2));
            editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        }
        wVar.f49403e = false;
    }

    @Override
    public final void show() {
        if (!this.f49412n.g()) {
            this.f49409c.setVisibility(8);
        }
        super.show();
    }
}
