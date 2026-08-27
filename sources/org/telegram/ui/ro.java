package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

public final class ro extends org.telegram.ui.Cells.x8 {
    public ValueAnimator v;

    public int f42303w;

    public final xo f42304x;

    public ro(xo xoVar, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, 12, c6Var);
        this.f42304x = xoVar;
        this.f42303w = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f42303w != -1) {
            xo xoVar = this.f42304x;
            if (xoVar.h != null) {
                ArrayList arrayList = new ArrayList();
                int i15 = 0;
                boolean z11 = false;
                while (true) {
                    i14 = 1;
                    if (i15 >= xoVar.h.getChildCount()) {
                        break;
                    }
                    View childAt = xoVar.h.getChildAt(i15);
                    if (z11) {
                        arrayList.add(childAt);
                    } else if (childAt == this) {
                        z11 = true;
                    }
                    i15++;
                }
                float height = this.f42303w - getHeight();
                ValueAnimator valueAnimator = this.v;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.v = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new dg(arrayList, height, i14));
                this.v.setInterpolator(org.telegram.ui.Components.er.h);
                this.v.setDuration(350L);
                this.v.start();
            }
        }
        this.f42303w = getHeight();
    }

    @Override
    public final void setText(CharSequence charSequence) {
        if (charSequence != 0) {
            charSequence = AndroidUtilities.replaceTags(charSequence.toString());
            int iIndexOf = charSequence.toString().indexOf(10);
            xo xoVar = this.f42304x;
            if (iIndexOf >= 0) {
                charSequence.replace(iIndexOf, iIndexOf + 1, " ");
                charSequence.setSpan(new ForegroundColorSpan(xoVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23269p7)), 0, iIndexOf, 33);
            }
            org.telegram.ui.Components.k41[] k41VarArr = (org.telegram.ui.Components.k41[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.k41.class);
            gg.g gVar = xoVar.f44548a;
            String string = (gVar == null || gVar.getText() == null) ? "" : xoVar.f44548a.getText().toString();
            for (int i10 = 0; i10 < k41VarArr.length; i10++) {
                charSequence.setSpan(new org.telegram.ui.Cells.i(5, (Object) this, string), charSequence.getSpanStart(k41VarArr[i10]), charSequence.getSpanEnd(k41VarArr[i10]), 33);
                charSequence.removeSpan(k41VarArr[i10]);
            }
        }
        super.setText(charSequence);
    }
}
