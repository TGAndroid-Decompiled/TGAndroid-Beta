package pg;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.p91;
import org.telegram.ui.o6;
import org.telegram.ui.uy0;
import w7.x5;
public final class x extends e3 {
    public static final int f45900s = 0;
    public final ai.d1 f45901b;
    public final ImageView f45902c;
    public final o6 d;
    public final Path f45903e;
    public int f45904f;
    public q0.a h;
    public u f45905n;
    public boolean f45906r;

    public x(Context context, d6 d6Var) {
        super(1, context, d6Var, true);
        this.f45903e = new Path();
        fixNavigationBar(-14342875);
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-14342875, PorterDuff.Mode.MULTIPLY));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        ImageView imageView = new ImageView(context);
        this.f45902c = imageView;
        imageView.setImageResource(R.drawable.picker);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setBackground(h6.g0(1090519039, 1, -1));
        imageView.setOnClickListener(new uy0(19, this, context));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.ic_ab_done);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(h6.g0(1090519039, 1, -1));
        imageView2.setOnClickListener(new org.telegram.ui.Components.voip.p(this, 5));
        o6 o6Var = new o6(this, context);
        this.d = o6Var;
        o6Var.d = Color.alpha(-65536) / 255.0f;
        o6Var.a();
        o6Var.invalidate();
        ai.d1 d1Var = new ai.d1(context, 4);
        d1Var.setOrientation(1);
        t tVar = new t(this, context);
        d1Var.f804b = tVar;
        tVar.a(this.f45904f);
        d1Var.f805c = new s(this, context);
        d1Var.d = new w(this, context);
        p91 p91Var = new p91(context, this.resourcesProvider);
        p91Var.setAdapter(new q(d1Var));
        d1Var.addView(p91Var, x5.l(1.0f, -1, 0));
        d1Var.addView(o6Var, x5.k(12.0f, 0.0f, 12.0f, 0.0f, -1, 48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.addView(imageView, x5.n(28, 28));
        linearLayout2.addView(p91Var.n(8, false), x5.p(-1, 40, 1.0f, 16, 12, 0, 12, 0));
        linearLayout2.addView(imageView2, x5.n(28, 28));
        d1Var.addView(linearLayout2, x5.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        this.f45901b = d1Var;
        linearLayout.addView(d1Var, x5.n(-1, 0));
        o oVar = new o(this, context, linearLayout);
        oVar.addView(linearLayout);
        setCustomView(oVar);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        q0.a aVar = this.h;
        if (aVar != null) {
            aVar.accept(Integer.valueOf(this.f45904f));
        }
    }

    public final void o(int i10, int i11) {
        boolean z10;
        float b10;
        View findFocus;
        if (!this.f45906r) {
            if (i11 != 2) {
                return;
            }
            this.f45906r = true;
        }
        ai.d1 d1Var = this.f45901b;
        if (i11 != 5 && (findFocus = d1Var.findFocus()) != null) {
            findFocus.clearFocus();
            AndroidUtilities.hideKeyboard(findFocus);
        }
        if (i11 != 3) {
            ((t) d1Var.f804b).a(i10);
        }
        if (i11 != 0) {
            s sVar = (s) d1Var.f805c;
            if (i11 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            sVar.f45822n.f45904f = i10;
            float[] fArr = sVar.h;
            Color.colorToHSV(i10, fArr);
            if (z10) {
                float f7 = (fArr[1] * 0.5f) + 1.0f;
                float f10 = fArr[2];
                if (f10 <= 0.5f) {
                    b10 = 1.0f - (((1.0f - f10) * 0.22000003f) + 0.78f);
                } else {
                    b10 = e2.b(1.0f, f10, 0.22f, 1.0f);
                }
                sVar.d = f7 - b10;
                sVar.f45820e = fArr[0] / 360.0f;
            }
            sVar.invalidate();
        }
        if (i11 != 1) {
            o6 o6Var = this.d;
            o6Var.getClass();
            o6Var.d = Color.alpha(i10) / 255.0f;
            o6Var.a();
            o6Var.invalidate();
        }
        w wVar = (w) d1Var.d;
        wVar.f45895e = true;
        wVar.f45892a.b();
        wVar.f45893b.b();
        wVar.f45894c.b();
        EditTextBoldCursor editTextBoldCursor = wVar.d;
        if (!editTextBoldCursor.isFocused()) {
            int selectionStart = editTextBoldCursor.getSelectionStart();
            int selectionEnd = editTextBoldCursor.getSelectionEnd();
            StringBuilder sb2 = new StringBuilder(Integer.toHexString(wVar.f45896f.f45904f));
            while (sb2.length() < 8) {
                sb2.insert(0, "0");
            }
            editTextBoldCursor.setText(sb2.toString().toUpperCase().substring(2));
            editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        }
        wVar.f45895e = false;
    }

    @Override
    public final void show() {
        if (!this.f45905n.g()) {
            this.f45902c.setVisibility(8);
        }
        super.show();
    }
}
