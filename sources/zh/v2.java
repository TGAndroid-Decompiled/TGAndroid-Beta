package zh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import c8.ka;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.wp;
public final class v2 extends TextView {
    public final wp f60436a;

    public v2(Context context, f6 f6Var) {
        super(context);
        int i7 = k6.f28242y8;
        int w02 = k6.w0(i7, f6Var);
        r6.V(this, i7, f6Var);
        org.telegram.ui.Cells.y b02 = k6.b0(k6.r1(0.08f, w02), k6.r1(0.15f, w02), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f));
        n6 L = r6.L(0.08f, i7);
        n6 L2 = r6.L(0.15f, i7);
        setBackground(b02);
        r6.k(this, b02, L, L2, f6Var);
        setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f), 0);
        setGravity(17);
        setTypeface(org.telegram.messenger.g0.o());
        ka.a(this);
        wp wpVar = new wp(2131230873, 0);
        this.f60436a = wpVar;
        wpVar.G = 0.8f;
        wpVar.f40055r = 0.0f;
        wpVar.f40056s = org.telegram.messenger.g0.L(1.0f);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(26.0f), 1073741824));
    }

    public void setSorting(zh.c3 r7) {
        throw new UnsupportedOperationException("Method not decompiled: zh.v2.setSorting(zh.c3):void");
    }

    public void setValue(CharSequence charSequence) {
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) " v");
        int length = append.length();
        append.setSpan(this.f60436a, append.length() - 1, length, 33);
        setText(append);
    }
}
