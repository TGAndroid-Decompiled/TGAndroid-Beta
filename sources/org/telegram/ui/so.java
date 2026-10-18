package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class so extends org.telegram.ui.Cells.d9 {
    public ValueAnimator v;
    public int f41493w;
    public final yo f41494x;

    public so(yo yoVar, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 12, d6Var);
        this.f41494x = yoVar;
        this.f41493w = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f41493w != -1) {
            yo yoVar = this.f41494x;
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
                float height = this.f41493w - getHeight();
                ValueAnimator valueAnimator = this.v;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.v = ofFloat;
                ofFloat.addUpdateListener(new fg(arrayList, height, 1));
                this.v.setInterpolator(org.telegram.ui.Components.bs.h);
                this.v.setDuration(350L);
                this.v.start();
            }
        }
        this.f41493w = getHeight();
    }

    @Override
    public final void setText(CharSequence charSequence) {
        String str;
        if (charSequence != 0) {
            charSequence = AndroidUtilities.replaceTags(charSequence.toString());
            int indexOf = charSequence.toString().indexOf(10);
            yo yoVar = this.f41494x;
            if (indexOf >= 0) {
                charSequence.replace(indexOf, indexOf + 1, " ");
                charSequence.setSpan(new ForegroundColorSpan(yoVar.getThemedColor(org.telegram.ui.ActionBar.h6.f21214p7)), 0, indexOf, 33);
            }
            org.telegram.ui.Components.c61[] c61VarArr = (org.telegram.ui.Components.c61[]) charSequence.getSpans(0, charSequence.length(), org.telegram.ui.Components.c61.class);
            ei.e2 e2Var = yoVar.f43458a;
            if (e2Var != null && e2Var.getText() != null) {
                str = yoVar.f43458a.getText().toString();
            } else {
                str = "";
            }
            for (int i10 = 0; i10 < c61VarArr.length; i10++) {
                charSequence.setSpan(new org.telegram.ui.Cells.i(5, (Object) this, str), charSequence.getSpanStart(c61VarArr[i10]), charSequence.getSpanEnd(c61VarArr[i10]), 33);
                charSequence.removeSpan(c61VarArr[i10]);
            }
        }
        super.setText(charSequence);
    }
}
