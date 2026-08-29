package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class so extends org.telegram.ui.Cells.y8 {
    public ValueAnimator v;
    public int f42435w;
    public final yo f42436x;

    public so(yo yoVar, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, 12, c6Var);
        this.f42436x = yoVar;
        this.f42435w = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f42435w != -1) {
            yo yoVar = this.f42436x;
            if (yoVar.h != null) {
                ArrayList arrayList = new ArrayList();
                boolean z11 = false;
                for (int i14 = 0; i14 < yoVar.h.getChildCount(); i14++) {
                    View childAt = yoVar.h.getChildAt(i14);
                    if (z11) {
                        arrayList.add(childAt);
                    } else if (childAt == this) {
                        z11 = true;
                    }
                }
                float height = this.f42435w - getHeight();
                ValueAnimator valueAnimator = this.v;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.v = ofFloat;
                ofFloat.addUpdateListener(new ag(arrayList, height, 1));
                this.v.setInterpolator(org.telegram.ui.Components.jr.h);
                this.v.setDuration(350L);
                this.v.start();
            }
        }
        this.f42435w = getHeight();
    }

    @Override
    public final void setText(CharSequence charSequence) {
        String str;
        if (charSequence != 0) {
            charSequence = AndroidUtilities.replaceTags(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            yo yoVar = this.f42436x;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                charSequence.setSpan(new ForegroundColorSpan(yoVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23279p7)), 0, indexOf, 33);
            }
            org.telegram.ui.Components.t41[] t41VarArr = (org.telegram.ui.Components.t41[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.t41.class);
            ig.f fVar = yoVar.f44915a;
            if (fVar != null && fVar.getText() != null) {
                str = yoVar.f44915a.getText().toString();
            } else {
                str = "";
            }
            for (int i10 = 0; i10 < t41VarArr.length; i10++) {
                charSequence.setSpan(new org.telegram.ui.Cells.i(5, (Object) this, str), charSequence.getSpanStart(t41VarArr[i10]), charSequence.getSpanEnd(t41VarArr[i10]), 33);
                charSequence.removeSpan(t41VarArr[i10]);
            }
        }
        super.setText(charSequence);
    }
}
