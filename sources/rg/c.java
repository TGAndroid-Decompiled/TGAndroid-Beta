package rg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import fh.n;
import g7.e6;
import g7.g6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.xi;
public final class c extends LinearLayout {
    public static final int f47175e = 0;
    public final b6 f47176a;
    public final b3.b f47177b;
    public final b3.b f47178c;
    public float d;

    public c(Context context, b6 b6Var, xi xiVar, ig.a aVar) {
        super(context);
        b3.b bVar = new b3.b(this);
        this.f47177b = bVar;
        b3.b bVar2 = new b3.b(this);
        this.f47178c = bVar2;
        this.f47176a = b6Var;
        qg.a c10 = qg.a.c(context, aVar, xiVar, b6Var);
        bVar.f1413a = c10;
        c10.setOnClickListener(new n(26));
        g6.b((qg.a) bVar.f1413a, 0.065f, 2.0f);
        qg.a c11 = qg.a.c(context, aVar, xiVar, b6Var);
        bVar2.f1413a = c11;
        c11.setOnClickListener(new n(26));
        g6.b((qg.a) bVar2.f1413a, 0.065f, 2.0f);
        a(bVar, LocaleController.getString(R.string.Reply), R.drawable.input_reply, false);
        a(bVar2, LocaleController.getString(R.string.Forward), R.drawable.input_forward, true);
        setOrientation(0);
        setClipChildren(false);
        addView((qg.a) bVar.f1413a, e6.m(1.0f, 0, 56, 1, -1, 0));
        addView((qg.a) bVar2.f1413a, e6.m(1.0f, 0, 56, -1, 1, 0));
    }

    public final void a(b3.b bVar, String str, int i9, boolean z10) {
        Drawable drawable;
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        int i10 = f6.Xk;
        b6 b6Var = this.f47176a;
        textView.setTextColor(f6.v0(i10, b6Var));
        textView.setTypeface(AndroidUtilities.bold());
        Drawable mutate = getContext().getResources().getDrawable(i9).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(f6.v0(f6.Wk, b6Var), PorterDuff.Mode.MULTIPLY));
        if (z10) {
            drawable = mutate;
        } else {
            drawable = null;
        }
        if (z10) {
            mutate = null;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, mutate, (Drawable) null);
        bVar.f1414b = textView;
        ((qg.a) bVar.f1413a).addView(textView, e6.e(-2, -2, 17));
    }

    public final void b(b3.b bVar) {
        int i9;
        float f10 = this.d * ((td.a) bVar.f1415c).f47775e;
        float f11 = (1.0f - f10) * (-AndroidUtilities.dp(54.0f));
        float interpolation = (1.0f - sd.a.f47511a.getInterpolation(f10)) * (getMeasuredWidth() / 2.0f);
        if (bVar == this.f47177b) {
            interpolation *= -1.0f;
        }
        ((qg.a) bVar.f1413a).setTranslationX(interpolation);
        ((qg.a) bVar.f1413a).setTranslationY(f11);
        ((qg.a) bVar.f1413a).setAlpha(f10);
        qg.a aVar = (qg.a) bVar.f1413a;
        if (f10 > 0.0f) {
            i9 = 0;
        } else {
            i9 = 4;
        }
        aVar.setVisibility(i9);
    }

    public View getForwardButton() {
        return (qg.a) this.f47178c.f1413a;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        b(this.f47178c);
        b(this.f47177b);
    }

    public void setForwardButtonOnClickListener(View.OnClickListener onClickListener) {
        ((qg.a) this.f47178c.f1413a).setOnClickListener(onClickListener);
    }

    public void setReplyButtonOnClickListener(View.OnClickListener onClickListener) {
        ((qg.a) this.f47177b.f1413a).setOnClickListener(onClickListener);
    }

    public void setTotalVisibilityFactor(float f10) {
        if (this.d != f10) {
            this.d = f10;
            b(this.f47178c);
            b(this.f47177b);
        }
    }
}
