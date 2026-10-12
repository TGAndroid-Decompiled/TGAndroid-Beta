package qg;

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
import ji.o4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.k91;
import org.telegram.ui.bz0;
import org.telegram.ui.u6;
import w7.a6;
public final class x extends e3 {
    public static final int f43608s = 0;
    public final bi.v0 f43609b;
    public final ImageView f43610c;
    public final u6 d;
    public final Path e;
    public int f43611f;
    public q0.a h;
    public u f43612n;
    public boolean f43613r;

    public x(Context context, c6 c6Var) {
        super(1, context, c6Var, true);
        this.e = new Path();
        fixNavigationBar(-14342875);
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-14342875, PorterDuff.Mode.MULTIPLY));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        ImageView imageView = new ImageView(context);
        this.f43610c = imageView;
        imageView.setImageResource(R.drawable.picker);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setBackground(g6.g0(1090519039, 1, -1));
        imageView.setOnClickListener(new bz0(19, this, context));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.ic_ab_done);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(g6.g0(1090519039, 1, -1));
        imageView2.setOnClickListener(new o4(this, 6));
        u6 u6Var = new u6(this, context);
        this.d = u6Var;
        u6Var.d = Color.alpha(-65536) / 255.0f;
        u6Var.a();
        u6Var.invalidate();
        bi.v0 v0Var = new bi.v0(context, 4);
        v0Var.setOrientation(1);
        t tVar = new t(this, context);
        v0Var.f3847b = tVar;
        tVar.a(this.f43611f);
        v0Var.f3848c = new s(this, context);
        v0Var.d = new w(this, context);
        k91 k91Var = new k91(context, this.resourcesProvider);
        k91Var.setAdapter(new q(v0Var));
        v0Var.addView(k91Var, a6.l(1.0f, -1, 0));
        v0Var.addView(u6Var, a6.k(12.0f, 0.0f, 12.0f, 0.0f, -1, 48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.addView(imageView, a6.n(28, 28));
        linearLayout2.addView(k91Var.n(8, false), a6.p(-1, 40, 1.0f, 16, 12, 0, 12, 0));
        linearLayout2.addView(imageView2, a6.n(28, 28));
        v0Var.addView(linearLayout2, a6.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        this.f43609b = v0Var;
        linearLayout.addView(v0Var, a6.n(-1, 0));
        o oVar = new o(this, context, linearLayout);
        oVar.addView(linearLayout);
        setCustomView(oVar);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        q0.a aVar = this.h;
        if (aVar != null) {
            aVar.accept(Integer.valueOf(this.f43611f));
        }
    }

    public final void n(int i10, int i11) {
        boolean z10;
        float D;
        View findFocus;
        if (!this.f43613r) {
            if (i11 != 2) {
                return;
            }
            this.f43613r = true;
        }
        bi.v0 v0Var = this.f43609b;
        if (i11 != 5 && (findFocus = v0Var.findFocus()) != null) {
            findFocus.clearFocus();
            AndroidUtilities.hideKeyboard(findFocus);
        }
        if (i11 != 3) {
            ((t) v0Var.f3847b).a(i10);
        }
        if (i11 != 0) {
            s sVar = (s) v0Var.f3848c;
            if (i11 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            sVar.f43558n.f43611f = i10;
            float[] fArr = sVar.h;
            Color.colorToHSV(i10, fArr);
            if (z10) {
                float f7 = (fArr[1] * 0.5f) + 1.0f;
                float f10 = fArr[2];
                if (f10 <= 0.5f) {
                    D = 1.0f - (((1.0f - f10) * 0.22000003f) + 0.78f);
                } else {
                    D = k3.D(1.0f, f10, 0.22f, 1.0f);
                }
                sVar.d = f7 - D;
                sVar.e = fArr[0] / 360.0f;
            }
            sVar.invalidate();
        }
        if (i11 != 1) {
            u6 u6Var = this.d;
            u6Var.getClass();
            u6Var.d = Color.alpha(i10) / 255.0f;
            u6Var.a();
            u6Var.invalidate();
        }
        w wVar = (w) v0Var.d;
        wVar.e = true;
        wVar.f43602a.b();
        wVar.f43603b.b();
        wVar.f43604c.b();
        EditTextBoldCursor editTextBoldCursor = wVar.d;
        if (!editTextBoldCursor.isFocused()) {
            int selectionStart = editTextBoldCursor.getSelectionStart();
            int selectionEnd = editTextBoldCursor.getSelectionEnd();
            StringBuilder sb2 = new StringBuilder(Integer.toHexString(wVar.f43605f.f43611f));
            while (sb2.length() < 8) {
                sb2.insert(0, "0");
            }
            editTextBoldCursor.setText(sb2.toString().toUpperCase().substring(2));
            editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        }
        wVar.e = false;
    }

    @Override
    public final void show() {
        if (!this.f43612n.g()) {
            this.f43610c.setVisibility(8);
        }
        super.show();
    }
}
