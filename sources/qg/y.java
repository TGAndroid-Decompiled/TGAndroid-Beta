package qg;

import ai.uc;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.e91;
import org.telegram.ui.t6;
import w7.z5;
public final class y extends f3 {
    public static final int f44709s = 0;
    public final uc f44710b;
    public final ImageView f44711c;
    public final t6 d;
    public final Path e;
    public int f44712f;
    public q0.a h;
    public v f44713n;
    public boolean f44714r;

    public y(Context context, d6 d6Var) {
        super(1, context, d6Var, true);
        this.e = new Path();
        fixNavigationBar(-14342875);
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-14342875, PorterDuff.Mode.MULTIPLY));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        ImageView imageView = new ImageView(context);
        this.f44711c = imageView;
        imageView.setImageResource(R.drawable.picker);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setBackground(h6.g0(1090519039, 1, -1));
        imageView.setOnClickListener(new n(0, this, context));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.ic_ab_done);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(h6.g0(1090519039, 1, -1));
        imageView2.setOnClickListener(new hg.r0(this, 16));
        t6 t6Var = new t6(this, context);
        this.d = t6Var;
        t6Var.d = Color.alpha(-65536) / 255.0f;
        t6Var.a();
        t6Var.invalidate();
        uc ucVar = new uc(context, 5);
        ucVar.setOrientation(1);
        u uVar = new u(this, context);
        ucVar.f2277b = uVar;
        uVar.a(this.f44712f);
        ucVar.f2278c = new t(this, context);
        ucVar.d = new x(this, context);
        e91 e91Var = new e91(context, this.resourcesProvider);
        e91Var.setAdapter(new r(ucVar));
        ucVar.addView(e91Var, z5.l(1.0f, -1, 0));
        ucVar.addView(t6Var, z5.k(12.0f, 0.0f, 12.0f, 0.0f, -1, 48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.addView(imageView, z5.n(28, 28));
        linearLayout2.addView(e91Var.n(8, false), z5.p(-1, 40, 1.0f, 16, 12, 0, 12, 0));
        linearLayout2.addView(imageView2, z5.n(28, 28));
        ucVar.addView(linearLayout2, z5.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        this.f44710b = ucVar;
        linearLayout.addView(ucVar, z5.n(-1, 0));
        p pVar = new p(this, context, linearLayout);
        pVar.addView(linearLayout);
        setCustomView(pVar);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        q0.a aVar = this.h;
        if (aVar != null) {
            aVar.accept(Integer.valueOf(this.f44712f));
        }
    }

    public final void n(int i10, int i11) {
        boolean z10;
        float D;
        View findFocus;
        if (!this.f44714r) {
            if (i11 != 2) {
                return;
            }
            this.f44714r = true;
        }
        uc ucVar = this.f44710b;
        if (i11 != 5 && (findFocus = ucVar.findFocus()) != null) {
            findFocus.clearFocus();
            AndroidUtilities.hideKeyboard(findFocus);
        }
        if (i11 != 3) {
            ((u) ucVar.f2277b).a(i10);
        }
        if (i11 != 0) {
            t tVar = (t) ucVar.f2278c;
            if (i11 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            tVar.f44638n.f44712f = i10;
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
            t6 t6Var = this.d;
            t6Var.getClass();
            t6Var.d = Color.alpha(i10) / 255.0f;
            t6Var.a();
            t6Var.invalidate();
        }
        x xVar = (x) ucVar.d;
        xVar.e = true;
        xVar.f44702a.b();
        xVar.f44703b.b();
        xVar.f44704c.b();
        EditTextBoldCursor editTextBoldCursor = xVar.d;
        if (!editTextBoldCursor.isFocused()) {
            int selectionStart = editTextBoldCursor.getSelectionStart();
            int selectionEnd = editTextBoldCursor.getSelectionEnd();
            StringBuilder sb2 = new StringBuilder(Integer.toHexString(xVar.f44705f.f44712f));
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
        if (!this.f44713n.g()) {
            this.f44711c.setVisibility(8);
        }
        super.show();
    }
}
