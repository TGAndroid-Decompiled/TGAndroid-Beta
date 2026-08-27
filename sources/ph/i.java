package ph;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.y1;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.bb0;

public final class i extends LinearLayout implements x5 {

    public final c6 f46051a;

    public final bb0 f46052b;

    public final FrameLayout f46053c;
    public final ImageView d;

    public final TextView f46054e;

    public final TextView f46055f;
    public final boolean h;

    public boolean f46056n;

    public i(Context context, c6 c6Var, boolean z10) {
        super(context);
        this.f46051a = c6Var;
        this.h = z10;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f46053c = frameLayout;
        bb0 bb0Var = new bb0(1);
        this.f46052b = bb0Var;
        frameLayout.setBackground(bb0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, z5.e(24, 24, 17));
        LinearLayout linearLayoutG = y1.g(context, 1);
        TextView textView = new TextView(context);
        this.f46054e = textView;
        textView.setTextSize(1, 16.0f);
        TextView textViewI = pa.i(linearLayoutG, textView, z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f46055f = textViewI;
        textViewI.setGravity(17);
        textViewI.setMinWidth(AndroidUtilities.dp(20.66f));
        textViewI.setPadding(AndroidUtilities.dp(6.33f), 0, AndroidUtilities.dp(6.33f), 0);
        textViewI.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            addView(textViewI, z5.j(13.33f, 0.0f));
            addView(linearLayoutG, z5.p(0, -2, 1.0f, 23, 20, 0, z10 ? 12 : 16, 0));
            addView(frameLayout, z5.t(28, 28, 21, 0, 0, z10 ? 9 : 14, 0));
        } else {
            addView(frameLayout, z5.t(28, 28, 19, z10 ? 9 : 14, 0, 0, 0));
            addView(linearLayoutG, z5.p(0, -2, 1.0f, 23, z10 ? 12 : 16, 0, 20, 0));
            addView(textViewI, z5.j(0.0f, 13.33f));
        }
        d();
        setUnreadMode(true);
    }

    public final void a(int i10, int i11, int i12, CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        this.f46053c.setVisibility(i12 != 0 ? 0 : 8);
        this.f46054e.setTranslationX(i12 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
        this.f46052b.b(i10, i11);
        this.d.setImageResource(i12);
        setTitle(charSequence);
        setValue(charSequence2);
        setUnreadMode(z10);
    }

    @Override
    public final void d() {
        int i10 = g6.G6;
        c6 c6Var = this.f46051a;
        this.f46054e.setTextColor(g6.v0(i10, c6Var));
        int iV0 = g6.v0(this.f46056n ? g6.W8 : g6.f23234n6, c6Var);
        TextView textView = this.f46055f;
        textView.setTextColor(iV0);
        textView.setBackground(this.f46056n ? g6.b0(AndroidUtilities.dp(10.33f), g6.v0(g6.U8, c6Var)) : null);
        this.f46052b.f27060b = c6Var != null ? c6Var.a() : g6.I.q();
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.h ? 44.0f : 50.0f), 1073741824));
    }

    public void setTitle(CharSequence charSequence) {
        this.f46054e.setText(charSequence);
    }

    public void setUnreadMode(boolean z10) {
        if (this.f46056n != z10) {
            this.f46056n = z10;
            float f10 = z10 ? 13.0f : 16.0f;
            TextView textView = this.f46055f;
            textView.setTextSize(1, f10);
            textView.setTypeface(z10 ? AndroidUtilities.bold() : null);
            int i10 = z10 ? g6.W8 : g6.f23234n6;
            c6 c6Var = this.f46051a;
            textView.setTextColor(g6.v0(i10, c6Var));
            textView.setBackground(z10 ? g6.b0(AndroidUtilities.dp(10.33f), g6.v0(g6.U8, c6Var)) : null);
        }
    }

    public void setValue(CharSequence charSequence) {
        int i10 = !TextUtils.isEmpty(charSequence) ? 0 : 8;
        TextView textView = this.f46055f;
        textView.setVisibility(i10);
        textView.setText(charSequence);
    }
}
