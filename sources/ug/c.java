package ug;

import a5.j;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bg.n;
import i7.f6;
import i7.h6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.aj;
public final class c extends LinearLayout {
    public static final int f49212e = 0;
    public final c6 f49213a;
    public final j f49214b;
    public final j f49215c;
    public float d;

    public c(Context context, c6 c6Var, aj ajVar, lg.a aVar) {
        super(context);
        j jVar = new j(this);
        this.f49214b = jVar;
        j jVar2 = new j(this);
        this.f49215c = jVar2;
        this.f49213a = c6Var;
        tg.a c3 = tg.a.c(context, aVar, ajVar, c6Var);
        jVar.f211a = c3;
        c3.setOnClickListener(new n(28));
        h6.b((tg.a) jVar.f211a, 0.065f, 2.0f);
        tg.a c6 = tg.a.c(context, aVar, ajVar, c6Var);
        jVar2.f211a = c6;
        c6.setOnClickListener(new n(28));
        h6.b((tg.a) jVar2.f211a, 0.065f, 2.0f);
        a(jVar, LocaleController.getString(R.string.Reply), R.drawable.input_reply, false);
        a(jVar2, LocaleController.getString(R.string.Forward), R.drawable.input_forward, true);
        setOrientation(0);
        setClipChildren(false);
        addView((tg.a) jVar.f211a, f6.m(1.0f, 0, 56, 1, -1, 0));
        addView((tg.a) jVar2.f211a, f6.m(1.0f, 0, 56, -1, 1, 0));
    }

    public final void a(j jVar, String str, int i10, boolean z10) {
        Drawable drawable;
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        int i11 = g6.Xk;
        c6 c6Var = this.f49213a;
        textView.setTextColor(g6.v0(i11, c6Var));
        textView.setTypeface(AndroidUtilities.bold());
        Drawable mutate = getContext().getResources().getDrawable(i10).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.Wk, c6Var), PorterDuff.Mode.MULTIPLY));
        if (z10) {
            drawable = mutate;
        } else {
            drawable = null;
        }
        if (z10) {
            mutate = null;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, mutate, (Drawable) null);
        jVar.f212b = textView;
        ((tg.a) jVar.f211a).addView(textView, f6.e(-2, -2, 17));
    }

    public final void b(j jVar) {
        int i10;
        float f9 = this.d * ((vd.a) jVar.f213c).f49505e;
        float f10 = (1.0f - f9) * (-AndroidUtilities.dp(54.0f));
        float interpolation = (1.0f - ud.a.f49172a.getInterpolation(f9)) * (getMeasuredWidth() / 2.0f);
        if (jVar == this.f49214b) {
            interpolation *= -1.0f;
        }
        ((tg.a) jVar.f211a).setTranslationX(interpolation);
        ((tg.a) jVar.f211a).setTranslationY(f10);
        ((tg.a) jVar.f211a).setAlpha(f9);
        tg.a aVar = (tg.a) jVar.f211a;
        if (f9 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        aVar.setVisibility(i10);
    }

    public View getForwardButton() {
        return (tg.a) this.f49215c.f211a;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        b(this.f49215c);
        b(this.f49214b);
    }

    public void setForwardButtonOnClickListener(View.OnClickListener onClickListener) {
        ((tg.a) this.f49215c.f211a).setOnClickListener(onClickListener);
    }

    public void setReplyButtonOnClickListener(View.OnClickListener onClickListener) {
        ((tg.a) this.f49214b.f211a).setOnClickListener(onClickListener);
    }

    public void setTotalVisibilityFactor(float f9) {
        if (this.d != f9) {
            this.d = f9;
            b(this.f49215c);
            b(this.f49214b);
        }
    }
}
