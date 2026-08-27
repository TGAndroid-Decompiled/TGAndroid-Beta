package sg;

import af.h;
import ag.l2;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.b6;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.zi;

public final class c extends LinearLayout {

    public static final int f47896e = 0;

    public final c6 f47897a;

    public final h f47898b;

    public final h f47899c;
    public float d;

    public c(Context context, c6 c6Var, zi ziVar, jg.a aVar) {
        super(context);
        h hVar = new h(this);
        this.f47898b = hVar;
        h hVar2 = new h(this);
        this.f47899c = hVar2;
        this.f47897a = c6Var;
        rg.a aVarC = rg.a.c(context, aVar, ziVar, c6Var);
        hVar.f274a = aVarC;
        aVarC.setOnClickListener(new l2(27));
        b6.b((rg.a) hVar.f274a, 0.065f, 2.0f);
        rg.a aVarC2 = rg.a.c(context, aVar, ziVar, c6Var);
        hVar2.f274a = aVarC2;
        aVarC2.setOnClickListener(new l2(27));
        b6.b((rg.a) hVar2.f274a, 0.065f, 2.0f);
        a(hVar, LocaleController.getString(R.string.Reply), R.drawable.input_reply, false);
        a(hVar2, LocaleController.getString(R.string.Forward), R.drawable.input_forward, true);
        setOrientation(0);
        setClipChildren(false);
        addView((rg.a) hVar.f274a, z5.m(1.0f, 0, 56, 1, -1, 0));
        addView((rg.a) hVar2.f274a, z5.m(1.0f, 0, 56, -1, 1, 0));
    }

    public final void a(h hVar, String str, int i10, boolean z10) {
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        int i11 = g6.Xk;
        c6 c6Var = this.f47897a;
        textView.setTextColor(g6.v0(i11, c6Var));
        textView.setTypeface(AndroidUtilities.bold());
        Drawable drawableMutate = getContext().getResources().getDrawable(i10).mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.Wk, c6Var), PorterDuff.Mode.MULTIPLY));
        Drawable drawable = z10 ? drawableMutate : null;
        if (z10) {
            drawableMutate = null;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, drawableMutate, (Drawable) null);
        hVar.f275b = textView;
        ((rg.a) hVar.f274a).addView(textView, z5.e(-2, -2, 17));
    }

    public final void b(h hVar) {
        float f10 = this.d * ((ud.a) hVar.f276c).f48497e;
        float f11 = (1.0f - f10) * (-AndroidUtilities.dp(54.0f));
        float interpolation = (1.0f - td.a.f48160a.getInterpolation(f10)) * (getMeasuredWidth() / 2.0f);
        if (hVar == this.f47898b) {
            interpolation *= -1.0f;
        }
        ((rg.a) hVar.f274a).setTranslationX(interpolation);
        ((rg.a) hVar.f274a).setTranslationY(f11);
        ((rg.a) hVar.f274a).setAlpha(f10);
        ((rg.a) hVar.f274a).setVisibility(f10 > 0.0f ? 0 : 4);
    }

    public View getForwardButton() {
        return (rg.a) this.f47899c.f274a;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        b(this.f47899c);
        b(this.f47898b);
    }

    public void setForwardButtonOnClickListener(View.OnClickListener onClickListener) {
        ((rg.a) this.f47899c.f274a).setOnClickListener(onClickListener);
    }

    public void setReplyButtonOnClickListener(View.OnClickListener onClickListener) {
        ((rg.a) this.f47898b.f274a).setOnClickListener(onClickListener);
    }

    public void setTotalVisibilityFactor(float f10) {
        if (this.d != f10) {
            this.d = f10;
            b(this.f47899c);
            b(this.f47898b);
        }
    }
}
