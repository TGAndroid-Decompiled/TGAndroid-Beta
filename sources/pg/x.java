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
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.g91;
import org.telegram.ui.py0;
import org.telegram.ui.s6;
import w7.z5;
public final class x extends f3 {
    public static final int f44673s = 0;
    public final ai.d1 f44674b;
    public final ImageView f44675c;
    public final s6 d;
    public final Path f44676e;
    public int f44677f;
    public q0.a h;
    public u f44678n;
    public boolean f44679r;

    public x(Context context, d6 d6Var) {
        super(1, context, d6Var, true);
        this.f44676e = new Path();
        fixNavigationBar(-14342875);
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-14342875, PorterDuff.Mode.MULTIPLY));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        ImageView imageView = new ImageView(context);
        this.f44675c = imageView;
        imageView.setImageResource(R.drawable.picker);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setBackground(i6.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new py0(13, this, context));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.ic_ab_done);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(i6.f0(1090519039, 1, -1));
        imageView2.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 5));
        s6 s6Var = new s6(this, context);
        this.d = s6Var;
        s6Var.d = Color.alpha(-65536) / 255.0f;
        s6Var.a();
        s6Var.invalidate();
        ai.d1 d1Var = new ai.d1(context, 4);
        d1Var.setOrientation(1);
        t tVar = new t(this, context);
        d1Var.f751b = tVar;
        tVar.a(this.f44677f);
        d1Var.f752c = new s(this, context);
        d1Var.d = new w(this, context);
        g91 g91Var = new g91(context, this.resourcesProvider);
        g91Var.setAdapter(new q(d1Var));
        d1Var.addView(g91Var, z5.l(1.0f, -1, 0));
        d1Var.addView(s6Var, z5.k(12.0f, 0.0f, 12.0f, 0.0f, -1, 48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.addView(imageView, z5.n(28, 28));
        linearLayout2.addView(g91Var.n(8, false), z5.p(-1, 40, 1.0f, 16, 12, 0, 12, 0));
        linearLayout2.addView(imageView2, z5.n(28, 28));
        d1Var.addView(linearLayout2, z5.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        this.f44674b = d1Var;
        linearLayout.addView(d1Var, z5.n(-1, 0));
        o oVar = new o(this, context, linearLayout);
        oVar.addView(linearLayout);
        setCustomView(oVar);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        q0.a aVar = this.h;
        if (aVar != null) {
            aVar.accept(Integer.valueOf(this.f44677f));
        }
    }

    public final void m(int i10, int i11) {
        boolean z10;
        float b10;
        View findFocus;
        if (!this.f44679r) {
            if (i11 != 2) {
                return;
            }
            this.f44679r = true;
        }
        ai.d1 d1Var = this.f44674b;
        if (i11 != 5 && (findFocus = d1Var.findFocus()) != null) {
            findFocus.clearFocus();
            AndroidUtilities.hideKeyboard(findFocus);
        }
        if (i11 != 3) {
            ((t) d1Var.f751b).a(i10);
        }
        if (i11 != 0) {
            s sVar = (s) d1Var.f752c;
            if (i11 != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            sVar.f44581n.f44677f = i10;
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
                sVar.f44579e = fArr[0] / 360.0f;
            }
            sVar.invalidate();
        }
        if (i11 != 1) {
            s6 s6Var = this.d;
            s6Var.getClass();
            s6Var.d = Color.alpha(i10) / 255.0f;
            s6Var.a();
            s6Var.invalidate();
        }
        w wVar = (w) d1Var.d;
        wVar.f44665e = true;
        wVar.f44662a.b();
        wVar.f44663b.b();
        wVar.f44664c.b();
        EditTextBoldCursor editTextBoldCursor = wVar.d;
        if (!editTextBoldCursor.isFocused()) {
            int selectionStart = editTextBoldCursor.getSelectionStart();
            int selectionEnd = editTextBoldCursor.getSelectionEnd();
            StringBuilder sb2 = new StringBuilder(Integer.toHexString(wVar.f44666f.f44677f));
            while (sb2.length() < 8) {
                sb2.insert(0, "0");
            }
            editTextBoldCursor.setText(sb2.toString().toUpperCase().substring(2));
            editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        }
        wVar.f44665e = false;
    }

    @Override
    public final void show() {
        if (!this.f44678n.g()) {
            this.f44675c.setVisibility(8);
        }
        super.show();
    }
}
